package ru.CryptoPro.JCP.params;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public interface ParamsInterface extends AlgorithmParameterSpec {
    OID getDefault(OID oid);

    String getNameByOID(OID oid);

    OID getOID();

    OID getOIDByName(String str);

    Enumeration getOIDs();

    Enumeration getOIDs(OID oid);

    void setDefault(OID oid);

    void setDefault(OID oid, OID oid2);

    boolean setDefaultAvailable();
}
