package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NotInSetException;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1SetDuplicateException;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PersonalName extends Asn1Type {
    public Asn1PrintableString generation_qualifier;
    public Asn1PrintableString given_name;
    public Asn1PrintableString initials;
    public Asn1PrintableString surname;

    public PersonalName(String str, String str2, String str3, String str4) {
        this.surname = new Asn1PrintableString(str);
        this.given_name = new Asn1PrintableString(str2);
        this.initials = new Asn1PrintableString(str3);
        this.generation_qualifier = new Asn1PrintableString(str4);
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
                Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
                this.surname = asn1PrintableString;
                asn1PrintableString.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.surname.getLength() < 1 || this.surname.getLength() > 32768) {
                    throw new Asn1ConsVioException("surname.getLength()", this.surname.getLength());
                }
            } else if (asn1Tag.equals((short) 128, (short) 32, 1)) {
                if (this.given_name != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1PrintableString asn1PrintableString2 = new Asn1PrintableString();
                this.given_name = asn1PrintableString2;
                asn1PrintableString2.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.given_name.getLength() < 1 || this.given_name.getLength() > 32768) {
                    throw new Asn1ConsVioException("given_name.getLength()", this.given_name.getLength());
                }
            } else if (asn1Tag.equals((short) 128, (short) 32, 2)) {
                if (this.initials != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                Asn1PrintableString asn1PrintableString3 = new Asn1PrintableString();
                this.initials = asn1PrintableString3;
                asn1PrintableString3.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
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
                Asn1PrintableString asn1PrintableString4 = new Asn1PrintableString();
                this.generation_qualifier = asn1PrintableString4;
                asn1PrintableString4.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
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
        Asn1PrintableString asn1PrintableString = this.generation_qualifier;
        if (asn1PrintableString == null) {
            i = 0;
        } else {
            if (asn1PrintableString.getLength() < 1 || this.generation_qualifier.getLength() > 32768) {
                throw new Asn1ConsVioException("generation_qualifier.getLength()", this.generation_qualifier.getLength());
            }
            int encode = this.generation_qualifier.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        }
        Asn1PrintableString asn1PrintableString2 = this.initials;
        if (asn1PrintableString2 != null) {
            if (asn1PrintableString2.getLength() < 1 || this.initials.getLength() > 32768) {
                throw new Asn1ConsVioException("initials.getLength()", this.initials.getLength());
            }
            int encode2 = this.initials.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        Asn1PrintableString asn1PrintableString3 = this.given_name;
        if (asn1PrintableString3 != null) {
            if (asn1PrintableString3.getLength() < 1 || this.given_name.getLength() > 32768) {
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

    public PersonalName(Asn1PrintableString asn1PrintableString, Asn1PrintableString asn1PrintableString2, Asn1PrintableString asn1PrintableString3, Asn1PrintableString asn1PrintableString4) {
        this.surname = asn1PrintableString;
        this.given_name = asn1PrintableString2;
        this.initials = asn1PrintableString3;
        this.generation_qualifier = asn1PrintableString4;
    }

    public PersonalName(Asn1PrintableString asn1PrintableString) {
        this.surname = asn1PrintableString;
    }

    public PersonalName() {
    }

    public PersonalName(String str) {
        this.surname = new Asn1PrintableString(str);
    }
}
