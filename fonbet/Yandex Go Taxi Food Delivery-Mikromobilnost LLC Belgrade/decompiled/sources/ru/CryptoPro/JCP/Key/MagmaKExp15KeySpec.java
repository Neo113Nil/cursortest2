package ru.CryptoPro.JCP.Key;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class MagmaKExp15KeySpec implements SecretKeyInterface, DiversKeyInterface {
    public MagmaKeySpec a = null;
    public MagmaKeySpec b = null;
    public MagmaKeySpec c = null;
    public final int w;
    public boolean x;

    public MagmaKExp15KeySpec(byte[] bArr, boolean z) throws KeyManagementException {
        this.w = 0;
        b(bArr, z);
        this.w = z ? this.b.getBlockLen() : this.a.x;
    }

    public void a(SecretKeyInterface secretKeyInterface) {
        if (!this.x) {
            this.a = new MagmaKeySpec(((MagmaKExp15KeySpec) secretKeyInterface).a);
            return;
        }
        MagmaKExp15KeySpec magmaKExp15KeySpec = (MagmaKExp15KeySpec) secretKeyInterface;
        this.b = new MagmaKeySpec(magmaKExp15KeySpec.b);
        this.c = new MagmaKeySpec(magmaKExp15KeySpec.c);
    }

    public void b(byte[] bArr, boolean z) {
        this.x = z;
        if (!z) {
            this.a = new MagmaKeySpec(bArr, 0, 32, (CryptParamsInterface) null);
        } else {
            this.b = new MagmaKeySpec(bArr, 32, 32, (CryptParamsInterface) null);
            this.c = new MagmaKeySpec(bArr, 0, 32, (CryptParamsInterface) null);
        }
    }

    public final byte[] c(byte[] bArr, SecretKeySpec secretKeySpec) {
        MagmaKeySpec magmaKeySpec;
        int i = this.w;
        byte[] bArr2 = new byte[i];
        MagmaKeySpec magmaKeySpec2 = null;
        try {
            try {
                magmaKeySpec = (MagmaKeySpec) this.c.clone();
            } catch (Throwable th) {
                th = th;
            }
        } catch (CloneNotSupportedException e) {
            e = e;
        }
        try {
            byte[] bArr3 = new byte[32];
            Array.copy(bArr, 0, bArr3, 0, i / 2);
            byte[] E = secretKeySpec.c.E();
            byte[] byteArray = secretKeySpec.c.z().toByteArray();
            if (secretKeySpec instanceof KuznechikKeySpec) {
                for (int i2 = 0; i2 < 32; i2++) {
                    byteArray[i2] = (byte) (byteArray[i2] ^ E[i2]);
                }
            } else {
                int[] intArray = Array.toIntArray(byteArray);
                int[] intArray2 = Array.toIntArray(E);
                for (int i3 = 0; i3 < intArray.length; i3++) {
                    intArray[i3] = intArray[i3] - intArray2[i3];
                }
                byteArray = Array.toByteArray(intArray);
            }
            Array.copy(byteArray, 0, bArr3, i / 2, 32 - (i / 2));
            magmaKeySpec.imita(bArr2, bArr3, 0, 32 / i);
            byte[] bArr4 = new byte[i];
            Arrays.fill(bArr4, (byte) 0);
            Array.copy(byteArray, 32 - (i / 2), bArr4, 0, i / 2);
            int i4 = i / 2;
            bArr4[i4] = (byte) (bArr4[i4] ^ DerValue.TAG_CONTEXT);
            magmaKeySpec.getImita(bArr2, bArr4, 0, 1);
            magmaKeySpec.clear();
            return bArr2;
        } catch (CloneNotSupportedException e2) {
            e = e2;
            InvalidKeyException invalidKeyException = new InvalidKeyException(SecretKeySpec.UNWRAP_ERR);
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        } catch (Throwable th2) {
            th = th2;
            magmaKeySpec2 = magmaKeySpec;
            if (magmaKeySpec2 != null) {
                magmaKeySpec2.clear();
            }
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        MagmaKeySpec magmaKeySpec = this.b;
        if (magmaKeySpec != null) {
            magmaKeySpec.clear();
        }
        MagmaKeySpec magmaKeySpec2 = this.c;
        if (magmaKeySpec2 != null) {
            magmaKeySpec2.clear();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new MagmaKExp15KeySpec(this);
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

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(String str, DiversKeyBase diversKeyBase) throws InvalidKeyException {
        try {
            if (diversKeyBase.getDiversType() == 3) {
                KdfTreeDiversKeySpec kdfTreeDiversKeySpec = (KdfTreeDiversKeySpec) diversKeyBase;
                byte[] l = MagmaKeySpec.l((SecretKeyInterface) this.a.clone(), kdfTreeDiversKeySpec.getLabel(), kdfTreeDiversKeySpec.getSeed(), kdfTreeDiversKeySpec.getIterationNumber(), kdfTreeDiversKeySpec.getL(), kdfTreeDiversKeySpec.getR());
                return SecretKeyFactory.getInstance("GOST28147").generateSecret(this instanceof KuznechikKExp15KeySpec ? new KuznechikKExp15KeySpec(l, true) : new MagmaKExp15KeySpec(l, true));
            }
            throw new InvalidKeyException("Invalid divers type: " + diversKeyBase.getDiversType());
        } catch (CloneNotSupportedException e) {
            dy31.s(e);
            return null;
        } catch (KeyManagementException e2) {
            dy31.s(e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            dy31.s(e3);
            return null;
        } catch (InvalidKeySpecException e4) {
            dy31.s(e4);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    public SecretKeySpec getBaseKey() {
        return this.a;
    }

    public SecretKeySpec getCryptKey() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        throw new UnsupportedOperationException();
    }

    public SecretKeySpec getImitaKey() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return (this.x ? this.b : this.a).getParams();
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

    public boolean isLongKey() {
        return this.x;
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
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException {
        MagmaKeySpec magmaKeySpec;
        int i = this.w;
        MagmaKeySpec magmaKeySpec2 = null;
        try {
            if (bArr2.length != i / 2 || bArr.length != i + 32) {
                throw new InvalidKeyException("Invalid encrypted data");
            }
            byte[] bArr3 = new byte[32];
            Array.copy(bArr, 0, bArr3, 0, 32);
            byte[] bArr4 = new byte[i];
            Array.copy(bArr, 32, bArr4, 0, i);
            try {
                MagmaKeySpec magmaKeySpec3 = (MagmaKeySpec) this.b.clone();
                try {
                    byte[] bArr5 = new byte[i];
                    Arrays.fill(bArr5, (byte) 0);
                    Array.copy(bArr2, 0, bArr5, 0, bArr2.length);
                    byte[] bArr6 = new byte[32];
                    magmaKeySpec = magmaKeySpec3;
                    try {
                        magmaKeySpec.gammaCTR(bArr6, 0, bArr3, 0, 32, bArr5, null, 0, cryptParamsInterface);
                        SecretKeySpec kuznechikKeySpec = str != null ? str.equalsIgnoreCase("GOST3412_2015_K") ? new KuznechikKeySpec(bArr6, 0, 32, (CryptParamsInterface) null) : new MagmaKeySpec(bArr6, 0, 32, (CryptParamsInterface) null) : this instanceof KuznechikKExp15KeySpec ? new KuznechikKeySpec(bArr6, 0, 32, (CryptParamsInterface) magmaKeySpec.getParams()) : new MagmaKeySpec(bArr6, 0, 32, (CryptParamsInterface) magmaKeySpec.getParams());
                        int i2 = this.w;
                        byte[] bArr7 = new byte[i2];
                        magmaKeySpec3 = magmaKeySpec;
                        magmaKeySpec3.gammaCTR(bArr7, 0, bArr4, 0, i2, bArr5, null, 0, cryptParamsInterface);
                        if (!Array.compare(bArr7, c(bArr2, kuznechikKeySpec), i)) {
                            throw new InvalidKeyException("Mac not equal");
                        }
                        magmaKeySpec.clear();
                        return kuznechikKeySpec;
                    } catch (Throwable th) {
                        th = th;
                        magmaKeySpec2 = magmaKeySpec;
                        if (magmaKeySpec2 != null) {
                            magmaKeySpec2.clear();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    magmaKeySpec = magmaKeySpec3;
                }
            } catch (CloneNotSupportedException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(SecretKeySpec.UNWRAP_ERR);
                invalidKeyException.initCause(e);
                throw invalidKeyException;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i = this.w;
        MagmaKeySpec magmaKeySpec = null;
        try {
            if (bArr.length != i / 2) {
                throw new InvalidKeyException("Invalid ukm len");
            }
            try {
                MagmaKeySpec magmaKeySpec2 = (MagmaKeySpec) this.b.clone();
                try {
                    byte[] bArr2 = new byte[i];
                    Arrays.fill(bArr2, (byte) 0);
                    Array.copy(bArr, 0, bArr2, 0, bArr.length);
                    byte[] c = c(bArr, (SecretKeySpec) secretKeyInterface);
                    byte[] bArr3 = new byte[32];
                    byte[] E = ((SecretKeySpec) secretKeyInterface).c.E();
                    byte[] byteArray = ((SecretKeySpec) secretKeyInterface).c.z().toByteArray();
                    if (secretKeyInterface instanceof KuznechikKeySpec) {
                        for (int i2 = 0; i2 < 32; i2++) {
                            byteArray[i2] = (byte) (byteArray[i2] ^ E[i2]);
                        }
                    } else {
                        int[] intArray = Array.toIntArray(byteArray);
                        int[] intArray2 = Array.toIntArray(E);
                        for (int i3 = 0; i3 < intArray.length; i3++) {
                            intArray[i3] = intArray[i3] - intArray2[i3];
                        }
                        byteArray = Array.toByteArray(intArray);
                    }
                    magmaKeySpec2.gammaCTR(bArr3, 0, byteArray, 0, 32, bArr2, null, 0, cryptParamsInterface);
                    int i4 = this.w;
                    byte[] bArr4 = new byte[i4];
                    magmaKeySpec2.gammaCTR(bArr4, 0, c, 0, i4, bArr2, null, 0, cryptParamsInterface);
                    byte[] bArr5 = new byte[32 + i4];
                    Array.copy(bArr3, 0, bArr5, 0, 32);
                    Array.copy(bArr4, 0, bArr5, 32, i4);
                    magmaKeySpec2.clear();
                    return bArr5;
                } catch (Throwable th) {
                    th = th;
                    magmaKeySpec = magmaKeySpec2;
                    if (magmaKeySpec != null) {
                        magmaKeySpec.clear();
                    }
                    throw th;
                }
            } catch (CloneNotSupportedException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(SecretKeySpec.UNWRAP_ERR);
                invalidKeyException.initCause(e);
                throw invalidKeyException;
            }
        } catch (Throwable th2) {
            th = th2;
        }
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

    public MagmaKExp15KeySpec(SecretKeyInterface secretKeyInterface) {
        this.w = 0;
        MagmaKExp15KeySpec magmaKExp15KeySpec = (MagmaKExp15KeySpec) secretKeyInterface;
        this.x = magmaKExp15KeySpec.x;
        this.w = magmaKExp15KeySpec.w;
        a(secretKeyInterface);
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(int i, DiversKeyBase diversKeyBase) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }
}
