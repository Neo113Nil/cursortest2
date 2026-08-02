package ru.CryptoPro.JCSP.Key;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.PublicKey;
import java.security.SignatureException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public interface JCSPPrivateKeyInterface extends Cloneable, PrivateKeyInterface {
    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ void addExtension(Extension extension);

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean checkFP(byte[] bArr, int i) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    Object clone() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ SecretKeyInterface doDHPhase(PublicKeyInterface publicKeyInterface, byte[] bArr) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    PublicKeyInterface generatePublic() throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ Extension getExtension(Asn1ObjectIdentifier asn1ObjectIdentifier);

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ Extension[] getExtensions();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean isDhAllowed();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    boolean isExportable();

    boolean isForeignKey();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean isPreExportable();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean isUserProtected();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean match(PublicKey publicKey) throws Exception;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ boolean match(PublicKey publicKey, String str) throws Exception;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ void setDhAllowed();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ void setNotExportable();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    void setNotWriteAvailable();

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ void setUserProtected();

    SignValue signature(HHash hHash, int i) throws SignatureException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ SignValue signature(byte[] bArr) throws SignatureException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /* synthetic */ SignValue signature(byte[] bArr, int i, int i2) throws SignatureException, InvalidKeyException;
}
