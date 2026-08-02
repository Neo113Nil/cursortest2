package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class SignerAttribute_element extends Asn1Choice {
    public static final byte _CERTIFIEDATTRIBUTES = 2;
    public static final byte _CLAIMEDATTRIBUTES = 1;

    public SignerAttribute_element(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new ClaimedAttributes());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 1)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(2, new CertifiedAttributes());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            encode = ((ClaimedAttributes) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else {
            if (i != 2) {
                x8e.b();
                return 0;
            }
            encode = ((CertifiedAttributes) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "certifiedAttributes" : "claimedAttributes";
    }

    public void set_certifiedAttributes(CertifiedAttributes certifiedAttributes) {
        setElement(2, certifiedAttributes);
    }

    public void set_claimedAttributes(ClaimedAttributes claimedAttributes) {
        setElement(1, claimedAttributes);
    }

    public SignerAttribute_element() {
    }
}
