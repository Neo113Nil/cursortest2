package ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;

/* loaded from: classes4.dex */
public class ALGORITHM_IDENTIFIER {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public ALGORITHM_IDENTIFIER() {
        this.id = null;
        this.Type = null;
    }

    public ALGORITHM_IDENTIFIER(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type) {
        this.id = asn1ObjectIdentifier;
        this.Type = asn1Type;
    }
}
