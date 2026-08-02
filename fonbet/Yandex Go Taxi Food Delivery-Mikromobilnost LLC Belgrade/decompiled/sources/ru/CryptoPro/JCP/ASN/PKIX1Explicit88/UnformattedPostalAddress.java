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
import java.io.IOException;

/* loaded from: classes4.dex */
public class UnformattedPostalAddress extends Asn1Type {
    public UnformattedPostalAddress_printable_address printable_address;
    public Asn1T61String teletex_string;

    public UnformattedPostalAddress(UnformattedPostalAddress_printable_address unformattedPostalAddress_printable_address, String str) {
        this.printable_address = unformattedPostalAddress_printable_address;
        this.teletex_string = new Asn1T61String(str);
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
            if (asn1Tag.equals((short) 0, (short) 32, 16)) {
                if (this.printable_address != null) {
                    throw new Asn1SetDuplicateException(asn1BerDecodeBuffer, asn1Tag);
                }
                asn1BerDecodeBuffer.reset();
                UnformattedPostalAddress_printable_address unformattedPostalAddress_printable_address = new UnformattedPostalAddress_printable_address();
                this.printable_address = unformattedPostalAddress_printable_address;
                unformattedPostalAddress_printable_address.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
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
        UnformattedPostalAddress_printable_address unformattedPostalAddress_printable_address = this.printable_address;
        if (unformattedPostalAddress_printable_address != null) {
            i += unformattedPostalAddress_printable_address.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SET, i) + i : i;
    }

    public void init() {
        this.printable_address = null;
        this.teletex_string = null;
    }

    public UnformattedPostalAddress(UnformattedPostalAddress_printable_address unformattedPostalAddress_printable_address, Asn1T61String asn1T61String) {
        this.printable_address = unformattedPostalAddress_printable_address;
        this.teletex_string = asn1T61String;
    }

    public UnformattedPostalAddress() {
    }
}
