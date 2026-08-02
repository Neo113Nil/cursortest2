package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.IssuerSerial;

/* loaded from: classes4.dex */
public class AttributeCertificateInfo_subject extends Asn1Choice {
    public static final byte _BASECERTIFICATEID = 1;
    public static final byte _SUBJECTNAME = 2;

    public AttributeCertificateInfo_subject(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new IssuerSerial());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 1)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(2, new GeneralNames());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((IssuerSerial) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else {
            if (i != 2) {
                x8e.b();
                return 0;
            }
            encode = ((GeneralNames) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "subjectName" : "baseCertificateID";
    }

    public void set_baseCertificateID(IssuerSerial issuerSerial) {
        setElement(1, issuerSerial);
    }

    public void set_subjectName(GeneralNames generalNames) {
        setElement(2, generalNames);
    }

    public AttributeCertificateInfo_subject() {
    }
}
