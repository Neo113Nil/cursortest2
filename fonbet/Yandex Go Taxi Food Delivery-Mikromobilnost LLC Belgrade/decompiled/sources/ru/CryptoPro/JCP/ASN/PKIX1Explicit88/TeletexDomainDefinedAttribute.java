package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1T61String;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class TeletexDomainDefinedAttribute extends Asn1Type {
    public Asn1T61String type;
    public Asn1T61String value;

    public TeletexDomainDefinedAttribute(String str, String str2) {
        this.type = new Asn1T61String(str);
        this.value = new Asn1T61String(str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 20, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1T61String asn1T61String = new Asn1T61String();
        this.type = asn1T61String;
        asn1T61String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.type.getLength() < 1 || this.type.getLength() > 32768) {
            throw new Asn1ConsVioException("type.getLength()", this.type.getLength());
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 20, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1T61String asn1T61String2 = new Asn1T61String();
        this.value = asn1T61String2;
        asn1T61String2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.value.getLength() < 1 || this.value.getLength() > 32768) {
            throw new Asn1ConsVioException("value.getLength()", this.value.getLength());
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 20)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.value.getLength() < 1 || this.value.getLength() > 32768) {
            throw new Asn1ConsVioException("value.getLength()", this.value.getLength());
        }
        int encode = this.value.encode(asn1BerEncodeBuffer, true);
        if (this.type.getLength() < 1 || this.type.getLength() > 32768) {
            throw new Asn1ConsVioException("type.getLength()", this.type.getLength());
        }
        int encode2 = this.type.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.type = null;
        this.value = null;
    }

    public TeletexDomainDefinedAttribute(Asn1T61String asn1T61String, Asn1T61String asn1T61String2) {
        this.type = asn1T61String;
        this.value = asn1T61String2;
    }

    public TeletexDomainDefinedAttribute() {
    }
}
