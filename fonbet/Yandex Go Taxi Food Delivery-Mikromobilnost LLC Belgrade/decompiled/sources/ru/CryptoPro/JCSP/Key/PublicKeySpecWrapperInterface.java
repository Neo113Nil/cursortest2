package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.SignatureException;
import javax.crypto.ShortBufferException;
import javax.security.auth.Destroyable;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public interface PublicKeySpecWrapperInterface extends Destroyable {
    boolean checkSignature(int i, byte[] bArr, ParamsInterface paramsInterface, byte[] bArr2, int i2);

    boolean checkSignature(HHash hHash, byte[] bArr, int i) throws SignatureException;

    void clear();

    void encrypt(boolean z, byte[] bArr, int[] iArr) throws ShortBufferException;

    int getEncryptBufferLength(boolean z, int i);

    int getKeyAlg();

    HKey getPublicKey();

    HHash prepareHash(int i, ParamsInterface paramsInterface);

    byte[] wrap(SecretKeyInterface secretKeyInterface) throws InvalidKeyException;
}
