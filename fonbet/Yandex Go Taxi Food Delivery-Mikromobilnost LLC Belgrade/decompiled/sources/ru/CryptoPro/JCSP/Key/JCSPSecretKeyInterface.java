package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import javax.crypto.ShortBufferException;
import ru.CryptoPro.JCP.Key.MasterKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public interface JCSPSecretKeyInterface extends Cloneable, SecretKeyInterface {
    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    Object clone() throws CloneNotSupportedException;

    Object clone2() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    void decrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException;

    void decrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException;

    int decryptLength(int i, boolean z) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void diversKey(byte[] bArr) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void diversKey2012(byte[] bArr) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    void encrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException;

    void encrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException;

    int encryptLength(int i, boolean z) throws InvalidKeyException;

    int getAlgorithmIdentifier();

    int getAppropriateCryptMode();

    int getEncryptMode();

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ byte[] getIV();

    byte[] getIV_blob() throws InvalidKeyException;

    byte[] getIV_byte() throws InvalidKeyException;

    byte[] getKeyX() throws InvalidKeyException;

    boolean getMixMode();

    int getPadding();

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    byte[] getTag() throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ SecretKeyInterface getWorkKey();

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    HHash makeNewHMAC(int i, OID oid) throws InvalidKeyException;

    HHash makeNewMac(int i, int i2) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ MasterKeyInterface preHashMaster(byte[] bArr, boolean z) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException;

    JCSPMasterKeyInterface preHashMaster(byte[] bArr, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException;

    JCSPMasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException;

    void setAAD(byte[] bArr) throws InvalidKeyException;

    void setAlgorithmIdentifier(int i) throws InvalidKeyException;

    void setAlgorithmIdentifierByCryptMode(int i) throws InvalidKeyException;

    void setEncryptMode(int i, boolean z);

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ void setIVLen(int i);

    void setIV_blob(byte[] bArr) throws InvalidKeyException;

    void setIV_byte(byte[] bArr) throws InvalidKeyException;

    void setMixMode(boolean z);

    void setModeBits(int i);

    void setPadding(int i);

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);

    void setTag(byte[] bArr) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException;

    JCSPSecretKeyInterface unwrap(byte[] bArr, int i, boolean z) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ boolean updateTLSKey(long j, int i) throws InvalidKeyException;

    byte[] wrap(SecretKeyInterface secretKeyInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    /* synthetic */ byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException;
}
