package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class OTHER_REVOCATION_REF {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public OTHER_REVOCATION_REF() {
        this.Type = null;
        this.id = null;
    }

    public OTHER_REVOCATION_REF(Asn1Type asn1Type, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        this.Type = asn1Type;
        this.id = asn1ObjectIdentifier;
    }
}
