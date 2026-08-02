package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public abstract class MasterKeySpec implements JCSPMasterKeyInterface {
    public static final String ENC_KEY_CLIENT = "ENC_KEY_CLIENT";
    public static final String ENC_KEY_SERVER = "ENC_KEY_SERVER";
    public static final String INV_HASH_LEN = "InvalidHashLen";
    public static final String MAC_KEY_CLIENT = "MAC_KEY_CLIENT";
    public static final String MAC_KEY_SERVER = "MAC_KEY_SERVER";
    protected HKey a;
    protected volatile transient boolean b = false;

    public MasterKeySpec(HKey hKey) {
        this.a = hKey;
    }

    public static Object a() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public static Object b() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public static JCSPSecretKeyInterface deriveKey(HHash hHash, byte[] bArr, boolean z, CryptParamsInterface cryptParamsInterface, boolean z2, boolean z3, int i, int i2, boolean z4) throws InvalidKeyException, KeyManagementException, NoSuchAlgorithmException {
        HKey cryptDeriveKey;
        String str;
        boolean z5 = bArr != null && bArr.length > 0;
        int i3 = ((!z2 || z3) && (z2 || !z3)) ? 1024 : 0;
        JCSPLogger.fineFormat("MasterKeySpec:deriveKey() needIV: {0}, encryptionKey: {1}, flags: {2}", Boolean.valueOf(z5), Boolean.valueOf(z), Integer.valueOf(i3));
        if (z) {
            try {
                JCSPLogger.fine("MasterKeySpec:deriveKey() derive tls encryption key");
                cryptDeriveKey = hHash.cryptDeriveKey(z4 ? HProv.CALG_TLS1_ENC_KEY : HProv.CALG_SCHANNEL_ENC_KEY, i3);
                JCSPLogger.fine("MasterKeySpec:deriveKey() set encrypt mode: ", i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 32 ? null : "CTR" : "CTS" : "CFB" : "CNT" : "ECB" : "CBC");
                cryptDeriveKey.setEncryptMode(i);
                if (cryptParamsInterface != null) {
                    OID oid = cryptParamsInterface.getOID();
                    JCSPLogger.fine("MasterKeySpec:deriveKey() set cipher oid: ", oid);
                    cryptDeriveKey.setOIDParam(104, oid.toByteZ());
                }
                if (z5) {
                    JCSPLogger.fine("MasterKeySpec:deriveKey() copy syncro for IV");
                    System.arraycopy(z4 ? cryptDeriveKey.getSynchro() : cryptDeriveKey.getIvBlob(), 0, bArr, 0, bArr.length);
                }
                str = "MasterKeySpec:deriveKey() create secret key spec (enc)";
            } catch (MSException e) {
                JCSPLogger.thrown(e);
                throw new KeyManagementException(e);
            }
        } else {
            try {
                JCSPLogger.fine("MasterKeySpec:deriveKey() derive tls mac key");
                cryptDeriveKey = hHash.cryptDeriveKey(z4 ? HProv.CALG_TLS1_MAC_KEY : HProv.CALG_SCHANNEL_MAC_KEY, i3);
                if (cryptParamsInterface != null) {
                    OID oid2 = cryptParamsInterface.getOID();
                    JCSPLogger.fine("MasterKeySpec:deriveKey() set mac oid: ", oid2);
                    cryptDeriveKey.setOIDParam(104, oid2.toByteZ());
                }
                str = "MasterKeySpec:deriveKey() create secret key spec (mac)";
            } catch (MSException e2) {
                JCSPLogger.thrown(e2);
                throw new KeyManagementException(e2);
            }
        }
        JCSPLogger.fine(str);
        JCSPLogger.exit();
        return JCSPSecretKeySpec.getInstance(cryptDeriveKey, i2);
    }

    public static MasterKeySpec getInstance(HKey hKey) throws CloneNotSupportedException {
        return new JCSPMasterKeySpec((HKey) hKey.clone());
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        HKey hKey = this.a;
        if (hKey != null) {
            hKey.destroyKey();
        }
        this.a = null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public abstract Object clone() throws CloneNotSupportedException;

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        if (this.b) {
            return;
        }
        clear();
        this.b = true;
    }

    public void finalize() throws Throwable {
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface
    public HHash hHashMasterForKeys(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, boolean z) throws InvalidKeyException, KeyManagementException {
        if (this.b) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        try {
            JCSPLogger.fine("MasterKeySpec:hHashMasterForKeys() Duplicate key");
            HKey hKey = (HKey) this.a.clone();
            JCSPLogger.fine("MasterKeySpec:hHashMasterForKeys() set client random");
            hKey.setOIDParam(21, bArr);
            JCSPLogger.fine("MasterKeySpec:hHashMasterForKeys() set server random");
            hKey.setOIDParam(22, bArr2);
            JCSPLogger.fine("MasterKeySpec:hHashMasterForKeys() algMasterHash: " + i);
            HHash makeNewHash = hKey.makeNewHash(i);
            hKey.destroyKey();
            JCSPLogger.fine("MasterKeySpec:hHashMasterForKeys() Retrieve master key hash");
            return makeNewHash;
        } catch (CloneNotSupportedException e) {
            JCSPLogger.thrown(e);
            throw new KeyManagementException(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface
    public byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException, KeyManagementException {
        JCSPLogger.enter();
        if (this.b) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        JCSPLogger.fine("MasterKeySpec:hashMasterForFinished() create finish prf hash");
        HHash makeNewHash = this.a.makeNewHash(i);
        try {
            JCSPLogger.fine("MasterKeySpec:hashMasterForFinished() set tls prf label");
            makeNewHash.setHashParam(6, bArr);
            try {
                JCSPLogger.fine("MasterKeySpec:hashMasterForFinished() set tls prf seed");
                makeNewHash.setHashParam(7, bArr2);
                JCSPLogger.fine("MasterKeySpec:hashMasterForFinished() get finish hash");
                byte[] hash = makeNewHash.getHash((i2 == 26161 || i2 == 26160) ? 32 : 12);
                makeNewHash.destroyHash();
                JCSPLogger.exit();
                return hash;
            } catch (MSException e) {
                JCSPLogger.thrown(e);
                throw new KeyManagementException(e);
            }
        } catch (MSException e2) {
            JCSPLogger.thrown(e2);
            throw new KeyManagementException(e2);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface
    public byte[] hashMasterForKeys(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPMasterKeyInterface, ru.CryptoPro.JCP.Key.MasterKeyInterface
    public byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }
}
