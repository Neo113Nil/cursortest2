package ru.CryptoPro.JCP.Key;

import defpackage.wu61;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public class Symmetric512KeySpec extends SecretKeySpec {
    public Symmetric512KeySpec(byte[] bArr) throws KeyManagementException {
        super(bArr, (CryptParamsInterface) null);
        if (bArr.length != 64) {
            throw new KeyManagementException();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new Symmetric512KeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void cryptCNT(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void decryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void decryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void decryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey(byte[] bArr) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey2012(byte[] bArr) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void encryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void encryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void encryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    public Symmetric512KeySpec(RandomInterface randomInterface) throws KeyManagementException {
        super(new wu61((ParamsInterface) null, randomInterface, 1, 16), (CryptParamsInterface) null, randomInterface);
    }
}
