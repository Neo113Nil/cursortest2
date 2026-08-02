package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.SubjectKeyIdentifier;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.IssuerAndSerialNumber;

/* loaded from: classes4.dex */
public class EntityIdentifier extends Asn1Choice {
    public static final byte _ISSUERANDSERIALNUMBER = 2;
    public static final byte _SUBJECTKEYIDENTIFIER = 1;

    public EntityIdentifier(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 4)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new SubjectKeyIdentifier());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else {
            if (!h.equals((short) 0, (short) 32, 16)) {
                x8e.d(asn1BerDecodeBuffer, h);
                return;
            }
            asn1BerDecodeBuffer.reset();
            setElement(2, new IssuerAndSerialNumber());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            return ((SubjectKeyIdentifier) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            return ((IssuerAndSerialNumber) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        x8e.b();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "issuerAndSerialNumber" : "subjectKeyIdentifier";
    }

    public void set_issuerAndSerialNumber(IssuerAndSerialNumber issuerAndSerialNumber) {
        setElement(2, issuerAndSerialNumber);
    }

    public void set_subjectKeyIdentifier(SubjectKeyIdentifier subjectKeyIdentifier) {
        setElement(1, subjectKeyIdentifier);
    }

    public EntityIdentifier() {
    }
}
