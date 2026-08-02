package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class ATTRIBUTE_CLASS {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public ATTRIBUTE_CLASS() {
        this.Type = null;
        this.id = null;
    }

    public ATTRIBUTE_CLASS(Asn1Type asn1Type, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.Type = asn1Type;
        this.id = asn1ObjectIdentifier;
    }
}
