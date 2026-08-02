package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import ru.CryptoPro.JCP.Key.MasterKeyInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public interface JCSPMasterKeyInterface extends MasterKeyInterface {
    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void clear();

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ Object clone() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ ParamsInterface getParams();

    HHash hHashMasterForKeys(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, boolean z) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface
    /* synthetic */ byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException;

    byte[] hashMasterForFinished(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface
    /* synthetic */ byte[] hashMasterForKeys(byte[] bArr, byte[] bArr2) throws InvalidKeyException, KeyManagementException;

    @Override // ru.CryptoPro.JCP.Key.MasterKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    /* synthetic */ void setParams(ParamsInterface paramsInterface);
}
