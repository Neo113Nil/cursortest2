package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1Integer;

/* loaded from: classes4.dex */
public class CertReq extends CertRequest {
    public CertReq() {
    }

    public CertReq(Asn1Integer asn1Integer, CertTemplate certTemplate, Controls controls) {
        super(asn1Integer, certTemplate, controls);
    }

    public CertReq(Asn1Integer asn1Integer, CertTemplate certTemplate) {
        super(asn1Integer, certTemplate);
    }

    public CertReq(long j, CertTemplate certTemplate, Controls controls) {
        super(j, certTemplate, controls);
    }

    public CertReq(long j, CertTemplate certTemplate) {
        super(j, certTemplate);
    }
}
