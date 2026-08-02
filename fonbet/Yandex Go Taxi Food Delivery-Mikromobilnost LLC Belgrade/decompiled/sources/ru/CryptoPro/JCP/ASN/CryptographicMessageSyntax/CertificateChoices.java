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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;

/* loaded from: classes4.dex */
public class CertificateChoices extends Asn1Choice {
    public static final byte _ATTRCERT = 3;
    public static final byte _CERTIFICATE = 1;
    public static final byte _EXTENDEDCERTIFICATE = 2;

    public CertificateChoices(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 32, 16)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new Certificate());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 0)) {
            setElement(2, new ExtendedCertificate());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 1)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new AttributeCertificate());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            return ((Certificate) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            encode = ((ExtendedCertificate) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((AttributeCertificate) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "attrCert" : "extendedCertificate" : "certificate";
    }

    public void set_attrCert(AttributeCertificate attributeCertificate) {
        setElement(3, attributeCertificate);
    }

    public void set_certificate(Certificate certificate) {
        setElement(1, certificate);
    }

    public void set_extendedCertificate(ExtendedCertificate extendedCertificate) {
        setElement(2, extendedCertificate);
    }

    public CertificateChoices() {
    }
}
