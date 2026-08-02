package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class CONTENT_TYPE {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public CONTENT_TYPE() {
        this.Type = null;
        this.id = null;
    }

    public CONTENT_TYPE(Asn1Type asn1Type, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.Type = asn1Type;
        this.id = asn1ObjectIdentifier;
    }
}
