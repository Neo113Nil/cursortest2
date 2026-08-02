package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.PKIXTSP.TimeStampToken;

/* loaded from: classes4.dex */
public class ESCTimeStampToken extends TimeStampToken {
    public ESCTimeStampToken() {
    }

    public ESCTimeStampToken(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public ESCTimeStampToken(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }
}
