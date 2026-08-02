package ru.CryptoPro.JCP.Key;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.PublicKey;
import java.security.SignatureException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public interface PrivateKeyInterface extends KeyInterface {
    void addExtension(Extension extension);

    boolean checkFP(byte[] bArr, int i) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    SecretKeyInterface doDHPhase(PublicKeyInterface publicKeyInterface, byte[] bArr) throws InvalidKeyException, KeyManagementException;

    PublicKeyInterface generatePublic() throws InvalidKeyException;

    Extension getExtension(Asn1ObjectIdentifier asn1ObjectIdentifier);

    Extension[] getExtensions();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    boolean isDhAllowed();

    boolean isExportable();

    boolean isPreExportable();

    boolean isUserProtected();

    boolean match(PublicKey publicKey) throws Exception;

    boolean match(PublicKey publicKey, String str) throws Exception;

    void setDhAllowed();

    void setNotExportable();

    void setNotWriteAvailable();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);

    void setUserProtected();

    SignValue signature(byte[] bArr) throws SignatureException, InvalidKeyException;

    SignValue signature(byte[] bArr, int i, int i2) throws SignatureException, InvalidKeyException;
}
