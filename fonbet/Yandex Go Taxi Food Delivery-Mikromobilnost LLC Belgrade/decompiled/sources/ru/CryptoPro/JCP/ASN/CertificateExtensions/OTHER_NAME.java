package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class OTHER_NAME {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public OTHER_NAME() {
        this.id = null;
        this.Type = null;
    }

    public OTHER_NAME(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type) {
        this.id = asn1ObjectIdentifier;
        this.Type = asn1Type;
    }
}
