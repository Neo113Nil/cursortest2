package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1NumericString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ExtendedNetworkAddress_e163_4_address extends Asn1Type {
    public Asn1NumericString number;
    public Asn1NumericString sub_address;

    public ExtendedNetworkAddress_e163_4_address(String str, String str2) {
        this.number = new Asn1NumericString(str);
        this.sub_address = new Asn1NumericString(str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1NumericString asn1NumericString = new Asn1NumericString();
        this.number = asn1NumericString;
        asn1NumericString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.number.getLength() < 1 || this.number.getLength() > 32768) {
            throw new Asn1ConsVioException("number.getLength()", this.number.getLength());
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Asn1NumericString asn1NumericString2 = new Asn1NumericString();
            this.sub_address = asn1NumericString2;
            asn1NumericString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
            if (this.sub_address.getLength() < 1 || this.sub_address.getLength() > 32768) {
                throw new Asn1ConsVioException("sub_address.getLength()", this.sub_address.getLength());
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1NumericString asn1NumericString = this.sub_address;
        if (asn1NumericString == null) {
            i = 0;
        } else {
            if (asn1NumericString.getLength() < 1 || this.sub_address.getLength() > 32768) {
                throw new Asn1ConsVioException("sub_address.getLength()", this.sub_address.getLength());
            }
            int encode = this.sub_address.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        }
        if (this.number.getLength() < 1 || this.number.getLength() > 32768) {
            throw new Asn1ConsVioException("number.getLength()", this.number.getLength());
        }
        int encode2 = this.number.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2) + i + encode2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public void init() {
        this.number = null;
        this.sub_address = null;
    }

    public ExtendedNetworkAddress_e163_4_address(Asn1NumericString asn1NumericString, Asn1NumericString asn1NumericString2) {
        this.number = asn1NumericString;
        this.sub_address = asn1NumericString2;
    }

    public ExtendedNetworkAddress_e163_4_address(Asn1NumericString asn1NumericString) {
        this.number = asn1NumericString;
    }

    public ExtendedNetworkAddress_e163_4_address() {
    }

    public ExtendedNetworkAddress_e163_4_address(String str) {
        this.number = new Asn1NumericString(str);
    }
}
