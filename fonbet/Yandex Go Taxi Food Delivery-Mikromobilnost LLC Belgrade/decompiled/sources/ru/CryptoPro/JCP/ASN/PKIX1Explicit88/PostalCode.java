package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NumericString;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PostalCode extends Asn1Choice {
    public static final byte _NUMERIC_CODE = 1;
    public static final byte _PRINTABLE_CODE = 2;

    public PostalCode(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 18)) {
            asn1BerDecodeBuffer.reset();
            Asn1NumericString asn1NumericString = new Asn1NumericString();
            setElement(1, asn1NumericString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1NumericString.getLength() < 1 || asn1NumericString.getLength() > 32768) {
                throw new Asn1ConsVioException("numeric_code.getLength()", asn1NumericString.getLength());
            }
            return;
        }
        if (!h.equals((short) 0, (short) 0, 19)) {
            x8e.d(asn1BerDecodeBuffer, h);
            return;
        }
        asn1BerDecodeBuffer.reset();
        Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
        setElement(2, asn1PrintableString);
        this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        if (asn1PrintableString.getLength() < 1 || asn1PrintableString.getLength() > 32768) {
            throw new Asn1ConsVioException("printable_code.getLength()", asn1PrintableString.getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            Asn1NumericString asn1NumericString = (Asn1NumericString) getElement();
            if (asn1NumericString.getLength() < 1 || asn1NumericString.getLength() > 32768) {
                throw new Asn1ConsVioException("numeric_code.getLength()", asn1NumericString.getLength());
            }
            return asn1NumericString.encode(asn1BerEncodeBuffer, true);
        }
        if (i != 2) {
            x8e.b();
            return 0;
        }
        Asn1PrintableString asn1PrintableString = (Asn1PrintableString) getElement();
        if (asn1PrintableString.getLength() < 1 || asn1PrintableString.getLength() > 32768) {
            throw new Asn1ConsVioException("printable_code.getLength()", asn1PrintableString.getLength());
        }
        return asn1PrintableString.encode(asn1BerEncodeBuffer, true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "printable_code" : "numeric_code";
    }

    public void set_numeric_code(Asn1NumericString asn1NumericString) {
        setElement(1, asn1NumericString);
    }

    public void set_printable_code(Asn1PrintableString asn1PrintableString) {
        setElement(2, asn1PrintableString);
    }

    public PostalCode() {
    }
}
