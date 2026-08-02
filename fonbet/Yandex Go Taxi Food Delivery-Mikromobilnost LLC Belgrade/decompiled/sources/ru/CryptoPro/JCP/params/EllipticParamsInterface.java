package ru.CryptoPro.JCP.params;

import java.util.Enumeration;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticCurve;
import ru.CryptoPro.JCP.math.EllipticPoint;

/* loaded from: classes4.dex */
public interface EllipticParamsInterface extends ParamsInterface {
    EllipticCurve getCurve();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ OID getDefault(OID oid);

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

    EllipticPoint getP();

    BigIntr getQ();

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ void setDefault(OID oid);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ void setDefault(OID oid, OID oid2);

    @Override // ru.CryptoPro.JCP.params.ParamsInterface
    /* synthetic */ boolean setDefaultAvailable();
}
