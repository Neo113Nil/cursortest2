package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.Key.AbstractMasterSecret;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public class MasterSecret extends AbstractMasterSecret implements SpecKey {
    private final JCSPMasterKeyInterface a;
    private int b;
    private int c;

    private MasterSecret(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws KeyManagementException, InvalidKeyException {
        this.b = -1;
        this.c = -1;
        JCSPLogger.subEnter();
        if (!(secretKey instanceof GostSecretKey)) {
            dy31.v("Invalid type of pre-master key");
            throw null;
        }
        this.b = i;
        this.c = i2;
        JCSPLogger.fine("MasterSecret() get spec");
        JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) ((GostSecretKey) secretKey).getSpec();
        this.a = (bArr == null || bArr.length <= 0) ? jCSPSecretKeyInterface.preHashMaster(bArr2, bArr3, i, i2, i3, z) : jCSPSecretKeyInterface.preHashMaster(bArr, i, i2, i3, z);
        JCSPLogger.subExit();
    }

    private HHash a(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, boolean z) throws InvalidKeyException {
        try {
            return this.a.hHashMasterForKeys(bArr, bArr2, i, i2, i3, i4, z);
        } catch (KeyManagementException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Invalid master key");
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4) throws NoSuchAlgorithmException, InvalidKeyException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof CryptParamsInterface)) {
            throw new InvalidParameterException("Parameters should be encryption");
        }
        JCSPLogger.fine("MasterSecret:calculateConnectionKey() compute master hash");
        HHash a = a(bArr, bArr2, i2, i3, i4, i5, z4);
        try {
            try {
                JCSPLogger.fine("MasterSecret:calculateConnectionKey() derive key from master hash");
                JCSPSecretKeyInterface deriveKey = MasterKeySpec.deriveKey(a, bArr3, z, (CryptParamsInterface) algorithmParameterSpec, z2, z3, i, i4, z4);
                a.destroyHash();
                return new GostSecretKey(deriveKey);
            } catch (KeyManagementException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException("Error in creating connection key");
                invalidKeyException.initCause(e);
                JCSPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
        } catch (Throwable th) {
            a.destroyHash();
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
        JCSPMasterKeyInterface jCSPMasterKeyInterface = this.a;
        if (jCSPMasterKeyInterface != null) {
            jCSPMasterKeyInterface.clear();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public byte[] computeFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        try {
            JCSPLogger.fine("MasterSecret:computeFinished() hash master for finish hash");
            return this.a.hashMasterForFinished(bArr, bArr2, this.b, this.c);
        } catch (KeyManagementException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Invalid master key");
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        JCSPMasterKeyInterface jCSPMasterKeyInterface = this.a;
        if (jCSPMasterKeyInterface != null) {
            jCSPMasterKeyInterface.destroy();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public KeyInterface getSpec() {
        return this.a;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        JCSPMasterKeyInterface jCSPMasterKeyInterface = this.a;
        if (jCSPMasterKeyInterface != null) {
            return jCSPMasterKeyInterface.isDestroyed();
        }
        return true;
    }

    public MasterSecret(SecretKey secretKey, byte[] bArr, byte[] bArr2, int i, int i2, int i3, boolean z) throws KeyManagementException, InvalidKeyException {
        this(secretKey, null, bArr, bArr2, i, i2, i3, z);
    }

    public MasterSecret(SecretKey secretKey, byte[] bArr, int i, int i2, int i3, boolean z) throws KeyManagementException, InvalidKeyException {
        this(secretKey, bArr, null, null, i, i2, i3, z);
    }

    public MasterSecret(MasterSecret masterSecret) throws CloneNotSupportedException {
        this.b = -1;
        this.c = -1;
        this.a = (JCSPMasterKeyInterface) masterSecret.a.clone();
        this.c = masterSecret.c;
        this.b = masterSecret.b;
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }
}
