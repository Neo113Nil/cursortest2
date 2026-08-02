package ru.CryptoPro.JCP.ASN.SecureMimeMessageV3;

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
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.RecipientKeyIdentifier;

/* loaded from: classes4.dex */
public class SMIMEEncryptionKeyPreference extends Asn1Choice {
    public static final byte _ISSUERANDSERIALNUMBER = 1;
    public static final byte _RECEIPENTKEYID = 2;
    public static final byte _SUBJECTALTKEYIDENTIFIER = 3;

    public SMIMEEncryptionKeyPreference(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new IssuerAndSerialNumber());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 1)) {
            setElement(2, new RecipientKeyIdentifier());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 0, 2)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new SubjectKeyIdentifier());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((IssuerAndSerialNumber) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else if (i == 2) {
            encode = ((RecipientKeyIdentifier) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((SubjectKeyIdentifier) getElement()).encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "subjectAltKeyIdentifier" : "receipentKeyId" : "issuerAndSerialNumber";
    }

    public void set_issuerAndSerialNumber(IssuerAndSerialNumber issuerAndSerialNumber) {
        setElement(1, issuerAndSerialNumber);
    }

    public void set_receipentKeyId(RecipientKeyIdentifier recipientKeyIdentifier) {
        setElement(2, recipientKeyIdentifier);
    }

    public void set_subjectAltKeyIdentifier(SubjectKeyIdentifier subjectKeyIdentifier) {
        setElement(3, subjectKeyIdentifier);
    }

    public SMIMEEncryptionKeyPreference() {
    }
}
