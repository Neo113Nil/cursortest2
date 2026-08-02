package ru.CryptoPro.JCSP.Key.rsa;

import defpackage.oyr;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.ExchPrivateKeySpec;
import ru.CryptoPro.JCSP.Key.GostKeyPairGenerator;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigRSA;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;
import ru.CryptoPro.JCSP.params.RSAExchangeKeyInterface;

/* loaded from: classes4.dex */
public class RSAKeyPairGenerator extends GostKeyPairGenerator {
    public static final int MAX_MOD_LEN = 16384;
    public static final String NOT_RSA = "NotRSAParam";
    protected int keyLength;

    public RSAKeyPairGenerator(String str) {
        super(str);
        this.keyLength = 1024;
        this.params = new AlgIdSpecForeign((OID) null);
    }

    public static void checkKeyLengths(int i, int i2, int i3) throws InvalidKeyException {
        if (i2 > 0 && i < i2) {
            throw new InvalidKeyException(oyr.j(i2, "RSA keys must be at least ", " bits long"));
        }
        int min = Math.min(i3, 16384);
        if (i > min) {
            throw new InvalidKeyException(oyr.j(min, "RSA keys must be no longer than ", " bits"));
        }
    }

    public PublicKey createPublicKey(AbstractKeySpec abstractKeySpec) throws InvalidKeySpecException, NoSuchAlgorithmException {
        PublicKey publicKey;
        JCSPLogger.enter();
        try {
            publicKey = KeyFactory.getInstance("CP_RSA", "JCSPRSA").generatePublic(new X509EncodedKeySpec(new RSAPublicKey((PublicKeySpec) abstractKeySpec.generatePublic()).getEncoded()));
        } catch (InvalidKeyException | NoSuchProviderException e) {
            GostKeyPairGenerator.throwEx(e);
            publicKey = null;
        }
        JCSPLogger.exit();
        return publicKey;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        JCSPLogger.enter();
        AbstractKeySpec exchPrivateKeySpec = this.exchange ? new ExchPrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false) : new PrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false);
        exchPrivateKeySpec.setKeyLength(this.keyLength);
        KeyPair keyPair = null;
        try {
            PasswordParamsInterface passwordParamsInterface = this.passw;
            char[] password = passwordParamsInterface == null ? null : passwordParamsInterface.getPassword();
            byte[] array = password == null ? null : CPString.getArray(new String(password));
            AlgIdInterface algIdInterface = this.params;
            exchPrivateKeySpec.create((KeyStoreConfigBase) KeyStoreConfigRSA.getInstance(), array, this.userEnteredPassword, 0, algIdInterface instanceof ProviderParameterInterface ? ((ProviderParameterInterface) algIdInterface).getProviderName() : null, false);
            keyPair = new KeyPair(createPublicKey(exchPrivateKeySpec), this.exchange ? new RSAExchPrivateKey(exchPrivateKeySpec) : new RSAPrivateKey(exchPrivateKeySpec));
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException | InvalidKeySpecException e) {
            GostKeyPairGenerator.throwEx(e);
        }
        JCSPLogger.exit();
        return keyPair;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        boolean z = true;
        boolean z2 = false;
        if (algorithmParameterSpec instanceof ExportableParameterInterface) {
            this.exportable = false;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof PasswordParamsInterface) {
            this.passw = (PasswordParamsInterface) algorithmParameterSpec;
            this.userEnteredPassword = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            this.params = (AlgIdInterface) algorithmParameterSpec;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof RSAExchangeKeyInterface) {
            this.exchange = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            int keysize = ((RSAKeyGenParameterSpec) algorithmParameterSpec).getKeysize();
            this.keyLength = keysize;
            try {
                checkKeyLengths(keysize, 512, 65536);
            } catch (InvalidKeyException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        } else {
            z = z2;
        }
        if (z) {
            JCSPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("NotRSAParam"));
            JCSPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.keyLength = i;
        try {
            checkKeyLengths(i, 512, 65536);
        } catch (InvalidKeyException e) {
            throw new InvalidParameterException(e.getMessage());
        }
    }
}
