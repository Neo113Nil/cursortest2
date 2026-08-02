package ru.CryptoPro.JCSP.Key.eddsa;

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
import java.security.spec.X509EncodedKeySpec;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.MarkExportableParameterSpec;
import ru.CryptoPro.JCP.spec.NameAlgIdSpecForeign;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.GostKeyPairGenerator;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigEDDSA;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;

/* loaded from: classes4.dex */
public class EDDSAKeyPairGenerator extends GostKeyPairGenerator {
    public static final String NOT_EDDSA = "NotEDDSAParam";

    public EDDSAKeyPairGenerator(String str) {
        super(str);
        this.params = new AlgIdSpecForeign(AlgIdSpecForeign.OID_EDDSA);
    }

    public PublicKey createPublicKey(AbstractKeySpec abstractKeySpec) throws InvalidKeySpecException, NoSuchAlgorithmException {
        PublicKey publicKey;
        JCSPLogger.enter();
        try {
            publicKey = KeyFactory.getInstance("CP_Ed25519", "JCSPEDDSA").generatePublic(new X509EncodedKeySpec(new EDDSAPublicKey((PublicKeySpec) abstractKeySpec.generatePublic()).getEncoded()));
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
        PrivateKeySpec privateKeySpec = new PrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false);
        KeyPair keyPair = null;
        try {
            PasswordParamsInterface passwordParamsInterface = this.passw;
            char[] password = passwordParamsInterface == null ? null : passwordParamsInterface.getPassword();
            byte[] array = password == null ? null : CPString.getArray(new String(password));
            AlgIdInterface algIdInterface = this.params;
            privateKeySpec.create((KeyStoreConfigBase) KeyStoreConfigEDDSA.getInstance(), array, this.userEnteredPassword, 0, algIdInterface instanceof ProviderParameterInterface ? ((ProviderParameterInterface) algIdInterface).getProviderName() : null, false);
            keyPair = new KeyPair(createPublicKey(privateKeySpec), new EDDSAPrivateKey(privateKeySpec));
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
        if (algorithmParameterSpec instanceof MarkExportableParameterSpec) {
            this.exportable = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof PasswordParamsInterface) {
            this.passw = (PasswordParamsInterface) algorithmParameterSpec;
            this.userEnteredPassword = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            if (algIdInterface instanceof NameAlgIdSpecForeign) {
                NameAlgIdSpecForeign nameAlgIdSpecForeign = (NameAlgIdSpecForeign) algIdInterface;
                this.params = new NameAlgIdSpecForeign(this.params.getOID(), nameAlgIdSpecForeign.getName(), nameAlgIdSpecForeign.isOnlyStoreType(), nameAlgIdSpecForeign.getProviderName());
            } else if (algIdInterface.getOID() != AlgIdSpecForeign.OID_EDDSA) {
                throw new InvalidParameterException("Invalid OID: " + algIdInterface.getOID().toString());
            }
        } else {
            z = z2;
        }
        if (z) {
            JCSPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("NotEDDSAParam"));
            JCSPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
    }
}
