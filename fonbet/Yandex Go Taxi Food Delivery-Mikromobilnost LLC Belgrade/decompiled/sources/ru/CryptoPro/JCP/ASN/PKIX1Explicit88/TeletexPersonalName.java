package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NotInSetException;
import com.objsys.asn1j.runtime.Asn1SetDuplicateException;
import com.objsys.asn1j.runtime.Asn1T61String;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class TeletexPersonalName extends Asn1Type {
    public Asn1T61String generation_qualifier;
    public Asn1T61String given_name;
    public Asn1T61String initials;
    public Asn1T61String surname;

    public TeletexPersonalName(String str, String str2, String str3, String str4) {
        this.surname = new Asn1T61String(str);
        this.given_name = new Asn1T61String(str2);
        this.initials = new Asn1T61String(str3);
        this.generation_qualifier = new Asn1T61String(str4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SET);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        Asn1Tag asn1Tag = new Asn1Tag();
        while (!asn1BerDecodeContext.expired()) {
            asn1BerDecodeBuffer.mark(8);
            int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag);
            if (asn1Tag.equals((short) 128, (short) 32, 0)) {
                if (this.surname != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1T61String asn1T61String = new Asn1T61String();
                this.surname = asn1T61String;
                asn1T61String.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.surname.getLength() < 1 || this.surname.getLength() > 32768) {
                    throw new Asn1ConsVioException("surname.getLength()", this.surname.getLength());
                }
            } else if (asn1Tag.equals((short) 128, (short) 32, 1)) {
                if (this.given_name != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1T61String asn1T61String2 = new Asn1T61String();
                this.given_name = asn1T61String2;
                asn1T61String2.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.given_name.getLength() < 1 || this.given_name.getLength() > 32768) {
                    throw new Asn1ConsVioException("given_name.getLength()", this.given_name.getLength());
                }
            } else if (asn1Tag.equals((short) 128, (short) 32, 2)) {
                if (this.initials != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1T61String asn1T61String3 = new Asn1T61String();
                this.initials = asn1T61String3;
                asn1T61String3.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.initials.getLength() < 1 || this.initials.getLength() > 32768) {
                    throw new Asn1ConsVioException("initials.getLength()", this.initials.getLength());
                }
            } else {
                if (!asn1Tag.equals((short) 128, (short) 32, 3)) {
                    throw new Asn1NotInSetException(asn1BerDecodeBuffer, asn1Tag);
                }
                if (this.generation_qualifier != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1T61String asn1T61String4 = new Asn1T61String();
                this.generation_qualifier = asn1T61String4;
                asn1T61String4.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.generation_qualifier.getLength() < 1 || this.generation_qualifier.getLength() > 32768) {
                    throw new Asn1ConsVioException("generation_qualifier.getLength()", this.generation_qualifier.getLength());
                }
            }
        }
        if (this.surname != null) {
            return;
        }
        quz.h(asn1BerDecodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1T61String asn1T61String = this.generation_qualifier;
        if (asn1T61String == null) {
            i = 0;
        } else {
            if (asn1T61String.getLength() < 1 || this.generation_qualifier.getLength() > 32768) {
                throw new Asn1ConsVioException("generation_qualifier.getLength()", this.generation_qualifier.getLength());
            }
            int encode = this.generation_qualifier.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        }
        Asn1T61String asn1T61String2 = this.initials;
        if (asn1T61String2 != null) {
            if (asn1T61String2.getLength() < 1 || this.initials.getLength() > 32768) {
                throw new Asn1ConsVioException("initials.getLength()", this.initials.getLength());
            }
            int encode2 = this.initials.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        Asn1T61String asn1T61String3 = this.given_name;
        if (asn1T61String3 != null) {
            if (asn1T61String3.getLength() < 1 || this.given_name.getLength() > 32768) {
                throw new Asn1ConsVioException("given_name.getLength()", this.given_name.getLength());
            }
            int encode3 = this.given_name.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        if (this.surname.getLength() < 1 || this.surname.getLength() > 32768) {
            throw new Asn1ConsVioException("surname.getLength()", this.surname.getLength());
        }
        int encode4 = this.surname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4) + i + encode4;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public void init() {
        this.surname = null;
        this.given_name = null;
        this.initials = null;
        this.generation_qualifier = null;
    }

    public TeletexPersonalName(Asn1T61String asn1T61String, Asn1T61String asn1T61String2, Asn1T61String asn1T61String3, Asn1T61String asn1T61String4) {
        this.surname = asn1T61String;
        this.given_name = asn1T61String2;
        this.initials = asn1T61String3;
        this.generation_qualifier = asn1T61String4;
    }

    public TeletexPersonalName(Asn1T61String asn1T61String) {
        this.surname = asn1T61String;
    }

    public TeletexPersonalName() {
    }

    public TeletexPersonalName(String str) {
        this.surname = new Asn1T61String(str);
    }
}
