package ru.CryptoPro.JCP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public interface PublicKeyInterface extends KeyInterface {
    boolean checkPublic() throws InvalidAlgorithmParameterException;

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    byte[] encode();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    boolean isTrusted();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);

    boolean verifySignature(SignValue signValue, byte[] bArr) throws SignatureException, InvalidKeyException;
}
