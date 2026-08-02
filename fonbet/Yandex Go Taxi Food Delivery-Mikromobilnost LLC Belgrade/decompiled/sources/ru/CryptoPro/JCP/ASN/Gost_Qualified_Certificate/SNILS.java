package ru.CryptoPro.JCP.ASN.Gost_Qualified_Certificate;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1NumericString;
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
public class SNILS extends Asn1Choice {
    public static final byte _BMPSTRING = 7;
    public static final byte _IA5STRING = 5;
    public static final byte _NUMERICSTRING = 2;
    public static final byte _PRINTABLESTRING = 3;
    public static final byte _TELETEXSTRING = 4;
    public static final byte _UNIVERSALSTRING = 6;
    public static final byte _UTF8STRING = 1;

    public SNILS(byte b, Asn1Type asn1Type) {
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
            if (asn1UTF8String.getLength() < 0 || asn1UTF8String.getLength() > 32768) {
                throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 18)) {
            asn1BerDecodeBuffer.reset();
            Asn1NumericString asn1NumericString = new Asn1NumericString();
            setElement(2, asn1NumericString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1NumericString.getLength() < 0 || asn1NumericString.getLength() > 32768) {
                throw new Asn1ConsVioException("numericString.getLength()", asn1NumericString.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 19)) {
            asn1BerDecodeBuffer.reset();
            Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
            setElement(3, asn1PrintableString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1PrintableString.getLength() < 0 || asn1PrintableString.getLength() > 32768) {
                throw new Asn1ConsVioException("printableString.getLength()", asn1PrintableString.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 20)) {
            asn1BerDecodeBuffer.reset();
            Asn1T61String asn1T61String = new Asn1T61String();
            setElement(4, asn1T61String);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1T61String.getLength() < 0 || asn1T61String.getLength() > 32768) {
                throw new Asn1ConsVioException("teletexString.getLength()", asn1T61String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 22)) {
            asn1BerDecodeBuffer.reset();
            Asn1IA5String asn1IA5String = new Asn1IA5String();
            setElement(5, asn1IA5String);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1IA5String.getLength() < 0 || asn1IA5String.getLength() > 32768) {
                throw new Asn1ConsVioException("ia5String.getLength()", asn1IA5String.getLength());
            }
            return;
        }
        if (h.equals((short) 0, (short) 0, 28)) {
            asn1BerDecodeBuffer.reset();
            Asn1UniversalString asn1UniversalString = new Asn1UniversalString();
            setElement(6, asn1UniversalString);
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            if (asn1UniversalString.getLength() < 0 || asn1UniversalString.getLength() > 32768) {
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
        setElement(7, asn1BMPString);
        this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        if (asn1BMPString.getLength() < 0 || asn1BMPString.getLength() > 32768) {
            throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        switch (this.choiceID) {
            case 1:
                Asn1UTF8String asn1UTF8String = (Asn1UTF8String) getElement();
                if (asn1UTF8String.getLength() < 0 || asn1UTF8String.getLength() > 32768) {
                    throw new Asn1ConsVioException("utf8String.getLength()", asn1UTF8String.getLength());
                }
                return asn1UTF8String.encode(asn1BerEncodeBuffer, true);
            case 2:
                Asn1NumericString asn1NumericString = (Asn1NumericString) getElement();
                if (asn1NumericString.getLength() < 0 || asn1NumericString.getLength() > 32768) {
                    throw new Asn1ConsVioException("numericString.getLength()", asn1NumericString.getLength());
                }
                return asn1NumericString.encode(asn1BerEncodeBuffer, true);
            case 3:
                Asn1PrintableString asn1PrintableString = (Asn1PrintableString) getElement();
                if (asn1PrintableString.getLength() < 0 || asn1PrintableString.getLength() > 32768) {
                    throw new Asn1ConsVioException("printableString.getLength()", asn1PrintableString.getLength());
                }
                return asn1PrintableString.encode(asn1BerEncodeBuffer, true);
            case 4:
                Asn1T61String asn1T61String = (Asn1T61String) getElement();
                if (asn1T61String.getLength() < 0 || asn1T61String.getLength() > 32768) {
                    throw new Asn1ConsVioException("teletexString.getLength()", asn1T61String.getLength());
                }
                return asn1T61String.encode(asn1BerEncodeBuffer, true);
            case 5:
                Asn1IA5String asn1IA5String = (Asn1IA5String) getElement();
                if (asn1IA5String.getLength() < 0 || asn1IA5String.getLength() > 32768) {
                    throw new Asn1ConsVioException("ia5String.getLength()", asn1IA5String.getLength());
                }
                return asn1IA5String.encode(asn1BerEncodeBuffer, true);
            case 6:
                Asn1UniversalString asn1UniversalString = (Asn1UniversalString) getElement();
                if (asn1UniversalString.getLength() < 0 || asn1UniversalString.getLength() > 32768) {
                    throw new Asn1ConsVioException("universalString.getLength()", asn1UniversalString.getLength());
                }
                return asn1UniversalString.encode(asn1BerEncodeBuffer, true);
            case 7:
                Asn1BMPString asn1BMPString = (Asn1BMPString) getElement();
                if (asn1BMPString.getLength() < 0 || asn1BMPString.getLength() > 32768) {
                    throw new Asn1ConsVioException("bmpString.getLength()", asn1BMPString.getLength());
                }
                return asn1BMPString.encode(asn1BerEncodeBuffer, true);
            default:
                x8e.b();
                return 0;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        switch (this.choiceID) {
            case 1:
                return "utf8String";
            case 2:
                return "numericString";
            case 3:
                return "printableString";
            case 4:
                return "teletexString";
            case 5:
                return "ia5String";
            case 6:
                return "universalString";
            case 7:
                return "bmpString";
            default:
                return "UNDEFINED";
        }
    }

    public void set_bmpString(Asn1BMPString asn1BMPString) {
        setElement(7, asn1BMPString);
    }

    public void set_ia5String(Asn1IA5String asn1IA5String) {
        setElement(5, asn1IA5String);
    }

    public void set_numericString(Asn1NumericString asn1NumericString) {
        setElement(2, asn1NumericString);
    }

    public void set_printableString(Asn1PrintableString asn1PrintableString) {
        setElement(3, asn1PrintableString);
    }

    public void set_teletexString(Asn1T61String asn1T61String) {
        setElement(4, asn1T61String);
    }

    public void set_universalString(Asn1UniversalString asn1UniversalString) {
        setElement(6, asn1UniversalString);
    }

    public void set_utf8String(Asn1UTF8String asn1UTF8String) {
        setElement(1, asn1UTF8String);
    }

    public SNILS() {
    }
}
