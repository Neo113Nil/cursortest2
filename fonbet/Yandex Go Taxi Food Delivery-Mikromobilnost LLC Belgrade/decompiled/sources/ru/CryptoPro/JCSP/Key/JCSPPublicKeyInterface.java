package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public interface JCSPPublicKeyInterface extends PublicKeyInterface {
    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface
    /* synthetic */ boolean checkPublic() throws InvalidAlgorithmParameterException;

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface
    /* synthetic */ byte[] encode();

    AlgorithmGroups.KeyAlgorithmGroup getKeyAlgorithmGroup();

    int getKeyProvType();

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    @Deprecated
    boolean isRSA();

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface
    /* synthetic */ boolean isTrusted();

    boolean isUseDefaultCSPProvider();

    void setPadding(int i);

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);

    boolean verifySignature(SignValue signValue, HHash hHash, int i) throws SignatureException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.PublicKeyInterface
    /* synthetic */ boolean verifySignature(SignValue signValue, byte[] bArr) throws SignatureException, InvalidKeyException;

    boolean verifySignature(SignValue signValue, byte[] bArr, int i, int i2) throws SignatureException;
}
