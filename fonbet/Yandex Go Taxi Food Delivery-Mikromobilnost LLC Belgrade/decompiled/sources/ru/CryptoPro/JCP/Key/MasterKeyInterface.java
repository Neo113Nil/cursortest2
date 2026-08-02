package ru.CryptoPro.JCP.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public interface MasterKeyInterface extends KeyInterface {
    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException;

    byte[] hashMasterForKeys(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);
}
