package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1T61String;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.Asn1UniversalString;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;

/* loaded from: classes4.dex */
public class EDIPartyName_partyName extends Asn1Choice {
    public static final Asn1Tag TAG = new Asn1Tag(128, 32, 1);
    public static final byte _BMPSTRING = 5;
    public static final byte _PRINTABLESTRING = 2;
    public static final byte _TELETEXSTRING = 3;
    public static final byte _UNIVERSALSTRING = 4;
    public static final byte _UTF8STRING = 1;

    public EDIPartyName_partyName(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 12)) {
            asn1BerDecodeBuffer.reset();
            Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
            setElement(1, asn1UTF8String);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1UTF8String.getLength() < 1 || asn1UTF8String.getLength() > 32768) {
                throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 19)) {
            asn1BerDecodeBuffer.reset();
            Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
            setElement(2, asn1PrintableString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1PrintableString.getLength() < 1 || asn1PrintableString.getLength() > 32768) {
                throw new Asn1ConsVioException("printableString.getLength()", asn1PrintableString.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 20)) {
            asn1BerDecodeBuffer.reset();
            Asn1T61String asn1T61String = new Asn1T61String();
            setElement(3, asn1T61String);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1T61String.getLength() < 1 || asn1T61String.getLength() > 32768) {
                throw new Asn1ConsVioException("teletexString.getLength()", asn1T61String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 28)) {
            asn1BerDecodeBuffer.reset();
            Asn1UniversalString asn1UniversalString = new Asn1UniversalString();
            setElement(4, asn1UniversalString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1UniversalString.getLength() < 1 || asn1UniversalString.getLength() > 32768) {
                throw new Asn1ConsVioException("universalString.getLength()", asn1UniversalString.getLength());
            }
            return;
        }
        if (!h.equals((short) 0, (short) 0, 30)) {
            x8e.d(asn1BerDecodeBuffer, h);
            return;
        }
        asn1BerDecodeBuffer.reset();
        Asn1BMPString asn1BMPString = new Asn1BMPString();
        setElement(5, asn1BMPString);
        this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        if (asn1BMPString.getLength() < 1 || asn1BMPString.getLength() > 32768) {
            throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int i = this.choiceID;
        if (i == 1) {
            Asn1UTF8String asn1UTF8String = (Asn1UTF8String) getElement();
            if (asn1UTF8String.getLength() < 1 || asn1UTF8String.getLength() > 32768) {
                throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
            }
            encode = asn1UTF8String.encode(asn1BerEncodeBuffer, true);
        } else if (i == 2) {
            Asn1PrintableString asn1PrintableString = (Asn1PrintableString) getElement();
            if (asn1PrintableString.getLength() < 1 || asn1PrintableString.getLength() > 32768) {
                throw new Asn1ConsVioException("printableString.getLength()", asn1PrintableString.getLength());
            }
            encode = asn1PrintableString.encode(asn1BerEncodeBuffer, true);
        } else if (i == 3) {
            Asn1T61String asn1T61String = (Asn1T61String) getElement();
            if (asn1T61String.getLength() < 1 || asn1T61String.getLength() > 32768) {
                throw new Asn1ConsVioException("teletexString.getLength()", asn1T61String.getLength());
            }
            encode = asn1T61String.encode(asn1BerEncodeBuffer, true);
        } else if (i == 4) {
            Asn1UniversalString asn1UniversalString = (Asn1UniversalString) getElement();
            if (asn1UniversalString.getLength() < 1 || asn1UniversalString.getLength() > 32768) {
                throw new Asn1ConsVioException("universalString.getLength()", asn1UniversalString.getLength());
            }
            encode = asn1UniversalString.encode(asn1BerEncodeBuffer, true);
        } else {
            if (i != 5) {
                x8e.b();
                return 0;
            }
            Asn1BMPString asn1BMPString = (Asn1BMPString) getElement();
            if (asn1BMPString.getLength() < 1 || asn1BMPString.getLength() > 32768) {
                throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
            }
            encode = asn1BMPString.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encode) + encode : encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNDEFINED" : "bmpString" : "universalString" : "teletexString" : "printableString" : "utf8String";
    }

    public void set_bmpString(Asn1BMPString asn1BMPString) {
        setElement(5, asn1BMPString);
    }

    public void set_printableString(Asn1PrintableString asn1PrintableString) {
        setElement(2, asn1PrintableString);
    }

    public void set_teletexString(Asn1T61String asn1T61String) {
        setElement(3, asn1T61String);
    }

    public void set_universalString(Asn1UniversalString asn1UniversalString) {
        setElement(4, asn1UniversalString);
    }

    public void set_utf8String(Asn1UTF8String asn1UTF8String) {
        setElement(1, asn1UTF8String);
    }

    public EDIPartyName_partyName() {
    }
}
