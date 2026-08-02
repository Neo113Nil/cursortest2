package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ContentInfo;

/* loaded from: classes4.dex */
public class TimeStampToken extends ContentInfo {
    public TimeStampToken() {
    }

    public TimeStampToken(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public TimeStampToken(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }
}
