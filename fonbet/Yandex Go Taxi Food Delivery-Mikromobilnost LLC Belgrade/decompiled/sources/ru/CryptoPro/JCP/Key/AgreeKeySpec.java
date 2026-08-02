package ru.CryptoPro.JCP.Key;

import defpackage.w511;
import defpackage.wu61;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class AgreeKeySpec implements SecretKeyInterface {
    public final wu61 a;
    public CryptParamsInterface b;
    public final DigestParamsSpec c;
    public final OID w;

    public AgreeKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface, ParamsInterface paramsInterface, OID oid) throws KeyManagementException {
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = null;
        if (!(paramsInterface instanceof DigestParamsSpec)) {
            w511.q();
            throw null;
        }
        this.c = (DigestParamsSpec) paramsInterface;
        this.w = oid;
        this.b = cryptParamsInterface;
        int[] intArray = Array.toIntArray(bArr);
        try {
            this.a = new wu61(intArray, (RandomInterface) null, 1);
        } finally {
            Array.clear(intArray);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SecretKeyInterface getSpec(AgreeKeySpec agreeKeySpec, String str) throws InvalidKeyException, KeyManagementException, NoSuchAlgorithmException {
        byte[] bArr;
        AbstractGostDigest abstractGostDigest;
        MessageDigest gostDigest2012_512;
        MessageDigest gostDigest2012_5122;
        int[] iArr = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        SecretKeyInterface secretKeySpec = null;
        try {
            wu61 wu61Var = agreeKeySpec.a;
            DigestParamsSpec digestParamsSpec = agreeKeySpec.c;
            int[] D = wu61Var.D(null);
            try {
                bArr = Array.toByteArray(D);
                try {
                    boolean z = true;
                    switch (str.hashCode()) {
                        case -431049019:
                            if (str.equals("GOST28147")) {
                                if (!digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_256) && !digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_512)) {
                                    AbstractGostDigest gostDigest = new GostDigest();
                                    gostDigest.reset(agreeKeySpec.w);
                                    abstractGostDigest = gostDigest;
                                    abstractGostDigest.update(bArr);
                                    secretKeySpec = new SecretKeySpec(abstractGostDigest.digest(), agreeKeySpec.b);
                                    break;
                                }
                                abstractGostDigest = new GostDigest2012_256();
                                abstractGostDigest.update(bArr);
                                secretKeySpec = new SecretKeySpec(abstractGostDigest.digest(), agreeKeySpec.b);
                            }
                            break;
                        case 1075121823:
                            if (str.equals("SYMMETRIC512")) {
                                GostDigest2012_512 gostDigest2012_5123 = new GostDigest2012_512();
                                gostDigest2012_5123.update(bArr);
                                secretKeySpec = new Symmetric512KeySpec(gostDigest2012_5123.digest());
                                break;
                            }
                            break;
                        case 1729983970:
                            if (str.equals("GOST3412_2015_K")) {
                                if (digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_256)) {
                                    gostDigest2012_512 = new GostDigest2012_256();
                                    z = false;
                                } else {
                                    if (!digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_512)) {
                                        throw new NoSuchAlgorithmException();
                                    }
                                    gostDigest2012_512 = new GostDigest2012_512();
                                }
                                gostDigest2012_512.update(bArr);
                                secretKeySpec = new KuznechikKExp15KeySpec(gostDigest2012_512.digest(), z);
                                break;
                            }
                            break;
                        case 1729983972:
                            if (str.equals("GOST3412_2015_M")) {
                                if (digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_256)) {
                                    gostDigest2012_5122 = new GostDigest2012_256();
                                    z = false;
                                } else {
                                    if (!digestParamsSpec.getOID().equals(DigestParamsSpec.OID_Gost2012_512)) {
                                        throw new NoSuchAlgorithmException();
                                    }
                                    gostDigest2012_5122 = new GostDigest2012_512();
                                }
                                gostDigest2012_5122.update(bArr);
                                secretKeySpec = new MagmaKExp15KeySpec(gostDigest2012_5122.digest(), z);
                                break;
                            }
                            break;
                    }
                    Arrays.fill(D, 0);
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    return secretKeySpec;
                } catch (Throwable th) {
                    th = th;
                    iArr = D;
                    if (iArr != null) {
                        Arrays.fill(iArr, 0);
                    }
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bArr = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        wu61 wu61Var = this.a;
        if (wu61Var != null) {
            wu61Var.w();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new AgreeKeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey(byte[] bArr) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey2012(byte[] bArr) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface getWorkKey() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void setIVLen(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        if (paramsInterface instanceof CryptParamsInterface) {
            this.b = (CryptParamsInterface) paramsInterface;
        } else {
            w511.q();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    public AgreeKeySpec(AgreeKeySpec agreeKeySpec) throws InvalidKeyException, KeyManagementException {
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = null;
        this.b = agreeKeySpec.b;
        wu61 wu61Var = agreeKeySpec.a;
        if (wu61Var != null) {
            this.a = wu61Var.a(null);
        }
        this.c = agreeKeySpec.c;
        this.w = agreeKeySpec.w;
    }
}
