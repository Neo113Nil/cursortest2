package ru.CryptoPro.JCP.params;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public interface AlgIdInterface extends ParamsInterface {
    ParamsInterface getCryptParams();

    Object getDecoded();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ OID getDefault(OID oid);

    ParamsInterface getDigestParams();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ String getNameByOID(OID oid);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ OID getOID();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ OID getOIDByName(String str);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ Enumeration getOIDs();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ Enumeration getOIDs(OID oid);

    ParamsInterface getSignParams();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ void setDefault(OID oid);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ void setDefault(OID oid, OID oid2);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ boolean setDefaultAvailable();
}
