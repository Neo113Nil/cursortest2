package ru.CryptoPro.JCP.ASN.PKIXOCSP;

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
public class ReqCert extends Asn1Choice {
    public static final byte _CERTID = 1;
    public static final byte _CERTIDWITHSIGNATURE = 3;
    public static final byte _FULLCERT = 2;

    public ReqCert(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 32, 16)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new CertID());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 0)) {
            setElement(2, new FullCertificate());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 1)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(3, new CertIdWithSignature());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        int i = this.choiceID;
        if (i == 1) {
            return ((CertID) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            encode = ((FullCertificate) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
        } else {
            if (i != 3) {
                x8e.b();
                return 0;
            }
            encode = ((CertIdWithSignature) getElement()).encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "certIdWithSignature" : "fullCert" : "certID";
    }

    public void set_certID(CertID certID) {
        setElement(1, certID);
    }

    public void set_certIdWithSignature(CertIdWithSignature certIdWithSignature) {
        setElement(3, certIdWithSignature);
    }

    public void set_fullCert(FullCertificate fullCertificate) {
        setElement(2, fullCertificate);
    }

    public ReqCert() {
    }
}
