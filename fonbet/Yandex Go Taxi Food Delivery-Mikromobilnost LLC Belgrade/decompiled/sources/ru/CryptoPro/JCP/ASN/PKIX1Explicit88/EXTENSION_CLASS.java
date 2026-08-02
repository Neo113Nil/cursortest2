package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class EXTENSION_CLASS {
    public Asn1Type ExtnType;
    public Asn1ObjectIdentifier id;

    public EXTENSION_CLASS() {
        this.id = null;
        this.ExtnType = null;
    }

    public EXTENSION_CLASS(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type) {
        this.id = asn1ObjectIdentifier;
        this.ExtnType = asn1Type;
    }
}
