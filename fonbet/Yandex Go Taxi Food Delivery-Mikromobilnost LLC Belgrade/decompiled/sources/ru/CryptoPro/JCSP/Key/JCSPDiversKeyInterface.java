package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;

/* loaded from: classes4.dex */
public interface JCSPDiversKeyInterface extends DiversKeyInterface {
    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    /* synthetic */ SecretKey diversKeyByBlob(int i, DiversKeyBase diversKeyBase) throws InvalidKeyException;

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    /* synthetic */ SecretKey diversKeyByBlob(String str, DiversKeyBase diversKeyBase) throws InvalidKeyException;
}
