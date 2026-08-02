package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NotInSetException;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1SetDuplicateException;
import com.objsys.asn1j.runtime.Asn1T61String;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PDSParameter extends Asn1Type {
    public Asn1PrintableString printable_string;
    public Asn1T61String teletex_string;

    public PDSParameter(String str, String str2) {
        this.printable_string = new Asn1PrintableString(str);
        this.teletex_string = new Asn1T61String(str2);
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
            if (asn1Tag.equals((short) 0, (short) 0, 19)) {
                if (this.printable_string != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                Asn1PrintableString asn1PrintableString = new Asn1PrintableString();
                this.printable_string = asn1PrintableString;
                asn1PrintableString.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.printable_string.getLength() < 1 || this.printable_string.getLength() > 32768) {
                    throw new Asn1ConsVioException("printable_string.getLength()", this.printable_string.getLength());
                }
            } else {
                if (!asn1Tag.equals((short) 0, (short) 0, 20)) {
                    throw new Asn1NotInSetException(asn1BerDecodeBuffer, asn1Tag);
                }
                if (this.teletex_string != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                Asn1T61String asn1T61String = new Asn1T61String();
                this.teletex_string = asn1T61String;
                asn1T61String.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
                if (this.teletex_string.getLength() < 1 || this.teletex_string.getLength() > 32768) {
                    throw new Asn1ConsVioException("teletex_string.getLength()", this.teletex_string.getLength());
                }
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1T61String asn1T61String = this.teletex_string;
        if (asn1T61String == null) {
            i = 0;
        } else {
            if (asn1T61String.getLength() < 1 || this.teletex_string.getLength() > 32768) {
                throw new Asn1ConsVioException("teletex_string.getLength()", this.teletex_string.getLength());
            }
            i = this.teletex_string.encode(asn1BerEncodeBuffer, true);
        }
        Asn1PrintableString asn1PrintableString = this.printable_string;
        if (asn1PrintableString != null) {
            if (asn1PrintableString.getLength() < 1 || this.printable_string.getLength() > 32768) {
                throw new Asn1ConsVioException("printable_string.getLength()", this.printable_string.getLength());
            }
            i += this.printable_string.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, i) + i : i;
    }

    public void init() {
        this.printable_string = null;
        this.teletex_string = null;
    }

    public PDSParameter(Asn1PrintableString asn1PrintableString, Asn1T61String asn1T61String) {
        this.printable_string = asn1PrintableString;
        this.teletex_string = asn1T61String;
    }

    public PDSParameter() {
    }
}
