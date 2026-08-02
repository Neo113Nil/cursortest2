package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class OCSP_RESPONSE_TYPE {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public OCSP_RESPONSE_TYPE() {
        this.Type = null;
        this.id = null;
    }

    public OCSP_RESPONSE_TYPE(Asn1Type asn1Type, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.Type = asn1Type;
        this.id = asn1ObjectIdentifier;
    }
}
