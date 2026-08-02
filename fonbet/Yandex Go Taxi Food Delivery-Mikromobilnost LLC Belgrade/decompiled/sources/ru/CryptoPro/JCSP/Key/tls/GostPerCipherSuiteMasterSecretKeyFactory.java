package ru.CryptoPro.JCSP.Key.tls;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.MasterSecret;

/* loaded from: classes4.dex */
public abstract class GostPerCipherSuiteMasterSecretKeyFactory extends SecretKeyFactorySpi implements TlsConstants {
    protected byte[] c = null;
    protected byte[] d = null;
    private byte[] a = null;
    private boolean b = false;

    public abstract int a();

    public abstract int b();

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof SecretKeySpec)) {
            return null;
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) keySpec;
        String algorithm = secretKeySpec.getAlgorithm();
        byte[] encoded = secretKeySpec.getEncoded();
        if (encoded == null || encoded.length == 0) {
            throw new InvalidKeySpecException("Invalid data.");
        }
        if (!algorithm.equalsIgnoreCase(TlsConstants.TLS_SEED) && !algorithm.equalsIgnoreCase(TlsConstants.TLS_HASH)) {
            if (!algorithm.equalsIgnoreCase(TlsConstants.TLS_LABEL)) {
                return null;
            }
            this.a = (byte[]) encoded.clone();
            return null;
        }
        if (!algorithm.equalsIgnoreCase(TlsConstants.TLS_SEED)) {
            this.c = (byte[]) encoded.clone();
            this.b = true;
            return null;
        }
        if (encoded.length % 2 == 0) {
            this.c = Arrays.copyOfRange(encoded, 0, encoded.length / 2);
            this.d = Arrays.copyOfRange(encoded, encoded.length / 2, encoded.length);
            return null;
        }
        throw new InvalidKeySpecException("Invalid seed size: " + encoded.length);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (!SecretKeySpec.class.isAssignableFrom(cls)) {
            throw new InvalidKeySpecException("Unsupported keySpec.");
        }
        if (!(secretKey instanceof MasterSecret)) {
            throw new InvalidKeySpecException("Unsupported key type.");
        }
        try {
            return new SecretKeySpec(((MasterSecret) secretKey).computeFinished(this.a, Array.merge(this.c, this.d)), TlsConstants.TLS_FINISHED);
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException(e);
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (!(secretKey instanceof GostSecretKey)) {
            dy31.v("Unsupported key.");
            return null;
        }
        try {
            return this.b ? new MasterSecret(secretKey, this.c, g(), a(), b(), h()) : new MasterSecret(secretKey, this.c, this.d, g(), a(), b(), h());
        } catch (InvalidKeyException | KeyManagementException e) {
            dy31.s(e);
            return null;
        }
    }

    public int g() {
        return 32817;
    }

    public boolean h() {
        return false;
    }
}
