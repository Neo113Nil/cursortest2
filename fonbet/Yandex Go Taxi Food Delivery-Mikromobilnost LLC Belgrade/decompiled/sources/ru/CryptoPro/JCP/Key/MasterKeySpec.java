package ru.CryptoPro.JCP.Key;

import defpackage.wu61;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class MasterKeySpec implements MasterKeyInterface {
    public CryptParamsInterface a;
    public final CPRandom b;
    public final wu61 c;
    public boolean w;

    public MasterKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        this.a = null;
        this.b = null;
        this.w = false;
        if (bArr.length != 48) {
            throw new KeyManagementException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 48);
        }
        this.b = new CPRandom();
        this.a = cryptParamsInterface;
        int[] intArray = Array.toIntArray(bArr);
        this.c = new wu61(intArray, this.b, 1);
        Array.clear(intArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0049 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x000f, B:8:0x0019, B:12:0x0026, B:14:0x002c, B:20:0x0038, B:22:0x0042, B:23:0x0057, B:26:0x0061, B:29:0x0068, B:31:0x0070, B:34:0x0077, B:35:0x007e, B:37:0x007f, B:39:0x0085, B:42:0x008b, B:44:0x0091, B:45:0x0097, B:46:0x009d, B:48:0x00a3, B:49:0x00a9, B:51:0x00af, B:52:0x00b5, B:53:0x0049, B:55:0x0053), top: B:4:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SecretKeyInterface deriveKey(byte[] bArr, String str, byte[] bArr2, String str2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException, NoSuchAlgorithmException {
        boolean z;
        SecretKeyInterface kuznechikKeySpec;
        if (bArr.length != 144) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(ru.CryptoPro.JCSP.Key.MasterKeySpec.INV_HASH_LEN));
        }
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        try {
            boolean z2 = true;
            if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_SERVER) && !str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.MAC_KEY_SERVER)) {
                z = false;
                if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_CLIENT) && !str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_SERVER)) {
                    z2 = false;
                }
                if (z) {
                    System.arraycopy(bArr, 0, bArr3, 0, 32);
                    System.arraycopy(bArr, 64, bArr4, 0, 32);
                    if (z2) {
                        System.arraycopy(bArr, 128, bArr2, 0, bArr2.length);
                    }
                } else {
                    System.arraycopy(bArr, 32, bArr3, 0, 32);
                    System.arraycopy(bArr, 96, bArr4, 0, 32);
                    if (z2) {
                        System.arraycopy(bArr, bArr2.length + 128, bArr2, 0, bArr2.length);
                    }
                }
                if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_CLIENT) && !str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_SERVER)) {
                    if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.MAC_KEY_CLIENT) && !str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.MAC_KEY_SERVER)) {
                        throw new NoSuchAlgorithmException("Unable create key with current algorithm");
                    }
                    kuznechikKeySpec = !str2.equalsIgnoreCase("GOST3412_2015_K") ? new KuznechikKeySpec(bArr3, cryptParamsInterface) : str2.equalsIgnoreCase("GOST3412_2015_M") ? new MagmaKeySpec(bArr3, cryptParamsInterface) : new SecretKeySpec(bArr3, cryptParamsInterface);
                    Array.clear(bArr3);
                    Array.clear(bArr4);
                    return kuznechikKeySpec;
                }
                kuznechikKeySpec = !str2.equalsIgnoreCase("GOST3412_2015_K") ? new KuznechikKeySpec(bArr4, cryptParamsInterface) : str2.equalsIgnoreCase("GOST3412_2015_M") ? new MagmaKeySpec(bArr4, cryptParamsInterface) : new SecretKeySpec(bArr4, cryptParamsInterface);
                Array.clear(bArr3);
                Array.clear(bArr4);
                return kuznechikKeySpec;
            }
            z = true;
            if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_CLIENT)) {
                z2 = false;
            }
            if (z) {
            }
            if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.ENC_KEY_CLIENT)) {
                if (!str.equals(ru.CryptoPro.JCSP.Key.MasterKeySpec.MAC_KEY_CLIENT)) {
                    throw new NoSuchAlgorithmException("Unable create key with current algorithm");
                }
                if (!str2.equalsIgnoreCase("GOST3412_2015_K")) {
                }
                Array.clear(bArr3);
                Array.clear(bArr4);
                return kuznechikKeySpec;
            }
            if (!str2.equalsIgnoreCase("GOST3412_2015_K")) {
            }
            Array.clear(bArr3);
            Array.clear(bArr4);
            return kuznechikKeySpec;
        } catch (Throwable th) {
            Array.clear(bArr3);
            Array.clear(bArr4);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r4 >= 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r8 = new ru.CryptoPro.JCP.Key.SecretKeySpec(new defpackage.wu61(r1, r0, 8), r7.a, new ru.CryptoPro.JCP.Random.CPRandom());
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SecretKeySpec a(boolean z) {
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        CPRandom cPRandom = this.b;
        wu61 wu61Var = this.c;
        SecretKeySpec secretKeySpec2 = null;
        r3 = null;
        r3 = null;
        byte[] engineDigest = null;
        try {
            wu61Var.C();
            int i = wu61Var.e;
            if (i == 8) {
                secretKeySpec = new SecretKeySpec(wu61Var.a(cPRandom), this.a, new CPRandom());
            } else if (z || i <= 8) {
                if (z && i > 16) {
                    throw new IllegalArgumentException();
                }
                if (!z || i >= 16) {
                    bArr = null;
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    wu61Var.A(cPRandom);
                    return secretKeySpec2;
                }
                secretKeySpec = new SecretKeySpec(wu61Var.a(cPRandom), this.a, new CPRandom());
            } else {
                GostDigest gostDigest = new GostDigest(DigestParamsSpec.OID_HashVerbaO);
                byte[] bArr2 = new byte[wu61Var.e << 2];
                Arrays.fill(bArr2, (byte) 0);
                wu61Var.i(gostDigest, bArr2);
                engineDigest = gostDigest.engineDigest();
                secretKeySpec = new SecretKeySpec(engineDigest, this.a);
            }
            bArr = engineDigest;
            secretKeySpec2 = secretKeySpec;
            if (bArr != null) {
            }
            wu61Var.A(cPRandom);
            return secretKeySpec2;
        } catch (Throwable th) {
            if (0 != 0) {
                Arrays.fill((byte[]) null, (byte) 0);
            }
            wu61Var.A(cPRandom);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        wu61 wu61Var = this.c;
        if (wu61Var != null) {
            wu61Var.w();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new MasterKeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface
    public byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException {
        SecretKeySpec a = a(this.w);
        byte[][] bArr3 = {bArr, bArr2};
        byte[] bArr4 = new byte[(this.a.getOID().equals(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_K) || this.a.getOID().equals(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_M)) ? 32 : 12];
        a.methodGOSTR3411PRF(bArr3, bArr4, this.w);
        a.clear();
        return bArr4;
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface
    public byte[] hashMasterForKeys(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException {
        SecretKeySpec a = a(this.w);
        byte[][] bArr3 = {new byte[]{107, 101, 121, BlobHeaderStructure.BLOB_VERSION, 101, Alerts.alert_no_application_protocol, Alerts.alert_unrecognized_name, 97, Alerts.alert_unsupported_extension, 115, 105, Alerts.alert_certificate_unobtainable, Alerts.alert_unsupported_extension}, bArr2, bArr};
        byte[] bArr4 = new byte[144];
        a.methodGOSTR3411PRF(bArr3, bArr4, this.w);
        a.clear();
        return bArr4;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    public void isNewDigest_2012_256_Used(boolean z) {
        this.w = z;
    }

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        if (!(paramsInterface instanceof CryptParamsInterface)) {
            throw new InvalidParameterException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        this.a = (CryptParamsInterface) paramsInterface;
    }

    public MasterKeySpec(MasterKeySpec masterKeySpec) {
        this.a = null;
        this.b = null;
        this.w = false;
        this.c = masterKeySpec.c.a(masterKeySpec.b);
        this.w = masterKeySpec.w;
        if (masterKeySpec.a != null) {
            this.a = (CryptParamsInterface) masterKeySpec.getParams();
        }
        CPRandom cPRandom = masterKeySpec.b;
        if (cPRandom != null) {
            this.b = cPRandom;
        }
    }
}
