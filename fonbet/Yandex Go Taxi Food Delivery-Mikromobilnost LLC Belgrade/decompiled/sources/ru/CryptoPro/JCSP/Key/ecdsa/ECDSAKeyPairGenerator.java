package ru.CryptoPro.JCSP.Key.ecdsa;

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
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.ECDSAParams;
import ru.CryptoPro.JCP.params.ECDSAParamsSpec;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.MarkExportableParameterSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.NameAlgIdSpecForeign;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.ExchPrivateKeySpec;
import ru.CryptoPro.JCSP.Key.GostKeyPairGenerator;
import ru.CryptoPro.JCSP.Key.PrivateKeySpec;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigECDSA;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;

/* loaded from: classes4.dex */
public class ECDSAKeyPairGenerator extends GostKeyPairGenerator {
    public static final String NOT_ECDSA = "NotECDSAParam";
    protected int keyLength;
    protected OID signOID;

    public ECDSAKeyPairGenerator(String str) {
        super(str);
        this.keyLength = 512;
        this.signOID = ECDSAParamsSpec.OID_ECDSA_P256;
        this.params = new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA);
    }

    public PublicKey createPublicKey(AbstractKeySpec abstractKeySpec) throws InvalidKeySpecException, NoSuchAlgorithmException {
        PublicKey publicKey;
        JCSPLogger.enter();
        try {
            publicKey = KeyFactory.getInstance(this.exchange ? JCP.CP_ECDH_NAME : JCP.CP_ECDSA_NAME, "JCSPECDSA").generatePublic(new X509EncodedKeySpec(new ECDSAPublicKey((PublicKeySpec) abstractKeySpec.generatePublic()).getEncoded()));
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
        KeyPair keyPair = null;
        try {
            if (this.params instanceof NameAlgIdSpecForeign) {
                this.params = new NameAlgIdSpecForeign(this.params.getOID(), this.signOID, ((NameAlgIdSpecForeign) this.params).getName(), ((NameAlgIdSpecForeign) this.params).isOnlyStoreType(), ((NameAlgIdSpecForeign) this.params).getProviderName());
            } else {
                this.params = new AlgIdSpecForeign(this.params.getOID(), this.signOID);
            }
            AbstractKeySpec exchPrivateKeySpec = this.exchange ? new ExchPrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false) : new PrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false);
            exchPrivateKeySpec.setKeyLength(this.keyLength);
            PasswordParamsInterface passwordParamsInterface = this.passw;
            char[] password = passwordParamsInterface == null ? null : passwordParamsInterface.getPassword();
            byte[] array = password == null ? null : CPString.getArray(new String(password));
            AlgIdInterface algIdInterface = this.params;
            exchPrivateKeySpec.create((KeyStoreConfigBase) KeyStoreConfigECDSA.getInstance(), array, this.userEnteredPassword, 0, algIdInterface instanceof ProviderParameterInterface ? ((ProviderParameterInterface) algIdInterface).getProviderName() : null, false);
            keyPair = new KeyPair(createPublicKey(exchPrivateKeySpec), this.exchange ? new ECDHPrivateKey(exchPrivateKeySpec) : new ECDSAPrivateKey(exchPrivateKeySpec));
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
        if (algorithmParameterSpec instanceof ECDSAParamsSpec) {
            OID oid = ((ECDSAParamsSpec) algorithmParameterSpec).getOID();
            this.signOID = oid;
            this.keyLength = ECDSAParams.getBitsLenFromOID(oid);
            z2 = true;
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            if (algIdInterface instanceof NameAlgIdSpecForeign) {
                NameAlgIdSpecForeign nameAlgIdSpecForeign = (NameAlgIdSpecForeign) algIdInterface;
                this.params = new NameAlgIdSpecForeign(this.params.getOID(), nameAlgIdSpecForeign.getName(), nameAlgIdSpecForeign.isOnlyStoreType(), nameAlgIdSpecForeign.getProviderName());
            } else if (algIdInterface.getOID() != AlgIdSpecForeign.OID_ECDSA && algIdInterface.getOID() != AlgIdSpecForeign.OID_ECDH) {
                throw new InvalidParameterException("Invalid OID: " + algIdInterface.getOID().toString());
            }
            if (algIdInterface.getSignParams() != null) {
                OID oid2 = algIdInterface.getSignParams().getOID();
                this.signOID = oid2;
                this.keyLength = ECDSAParams.getBitsLenFromOID(oid2);
            }
            z2 = true;
        }
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            OID oIDFromName = ECDSAParams.getOIDFromName(((ECGenParameterSpec) algorithmParameterSpec).getName());
            this.signOID = oIDFromName;
            this.keyLength = ECDSAParams.getBitsLenFromOID(oIDFromName);
        } else {
            z = z2;
        }
        if (z) {
            JCSPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("NotECDSAParam"));
            JCSPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        try {
            int bitsFromKeyLength = ECDSAParams.getBitsFromKeyLength(i);
            this.keyLength = bitsFromKeyLength;
            this.signOID = ECDSAParams.getOIDFromBitsLen(bitsFromKeyLength);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException(e.getMessage());
        }
    }
}
