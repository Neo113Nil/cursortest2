package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.Asn1VisibleString;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class DisplayText extends Asn1Choice {
    public static final byte _BMPSTRING = 3;
    public static final byte _UTF8STRING = 1;
    public static final byte _VISIBLESTRING = 2;

    public DisplayText(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 12)) {
            asn1BerDecodeBuffer.reset();
            Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
            setElement(1, asn1UTF8String);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1UTF8String.getLength() < 1 || asn1UTF8String.getLength() > 200) {
                throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 26)) {
            asn1BerDecodeBuffer.reset();
            Asn1VisibleString asn1VisibleString = new Asn1VisibleString();
            setElement(2, asn1VisibleString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1VisibleString.getLength() < 1 || asn1VisibleString.getLength() > 200) {
                throw new Asn1ConsVioException("visibleString.getLength()", asn1VisibleString.getLength());
            }
            return;
        }
        if (!h.equals((short) 0, (short) 0, 30)) {
            x8e.d(asn1BerDecodeBuffer, h);
            return;
        }
        asn1BerDecodeBuffer.reset();
        Asn1BMPString asn1BMPString = new Asn1BMPString();
        setElement(3, asn1BMPString);
        this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        if (asn1BMPString.getLength() < 1 || asn1BMPString.getLength() > 200) {
            throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            Asn1UTF8String asn1UTF8String = (Asn1UTF8String) getElement();
            if (asn1UTF8String.getLength() < 1 || asn1UTF8String.getLength() > 200) {
                throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
            }
            return asn1UTF8String.encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            Asn1VisibleString asn1VisibleString = (Asn1VisibleString) getElement();
            if (asn1VisibleString.getLength() < 1 || asn1VisibleString.getLength() > 200) {
                throw new Asn1ConsVioException("visibleString.getLength()", asn1VisibleString.getLength());
            }
            return asn1VisibleString.encode(asn1BerEncodeBuffer, true);
        }
        if (i != 3) {
            x8e.b();
            return 0;
        }
        Asn1BMPString asn1BMPString = (Asn1BMPString) getElement();
        if (asn1BMPString.getLength() < 1 || asn1BMPString.getLength() > 200) {
            throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
        }
        return asn1BMPString.encode(asn1BerEncodeBuffer, true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? "UNDEFINED" : "bmpString" : "visibleString" : "utf8String";
    }

    public void set_bmpString(Asn1BMPString asn1BMPString) {
        setElement(3, asn1BMPString);
    }

    public void set_utf8String(Asn1UTF8String asn1UTF8String) {
        setElement(1, asn1UTF8String);
    }

    public void set_visibleString(Asn1VisibleString asn1VisibleString) {
        setElement(2, asn1VisibleString);
    }

    public DisplayText() {
    }
}
