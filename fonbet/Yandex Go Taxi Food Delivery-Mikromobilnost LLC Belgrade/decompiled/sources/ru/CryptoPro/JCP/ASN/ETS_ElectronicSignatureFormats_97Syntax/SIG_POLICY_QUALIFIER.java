package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class SIG_POLICY_QUALIFIER {
    public Asn1Type Qualifier;
    public Asn1ObjectIdentifier id;

    public SIG_POLICY_QUALIFIER() {
        this.id = null;
        this.Qualifier = null;
    }

    public SIG_POLICY_QUALIFIER(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type) {
        this.id = asn1ObjectIdentifier;
        this.Qualifier = asn1Type;
    }
}
