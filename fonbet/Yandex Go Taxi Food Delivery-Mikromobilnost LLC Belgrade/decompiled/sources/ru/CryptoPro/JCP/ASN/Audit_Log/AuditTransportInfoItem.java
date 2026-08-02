package ru.CryptoPro.JCP.ASN.Audit_Log;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AuditTransportInfoItem extends Asn1Type {
    public Asn1UTF8String name;
    public Asn1UTF8String value;

    public AuditTransportInfoItem(String str, String str2) {
        this.name = new Asn1UTF8String(str);
        this.value = new Asn1UTF8String(str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 12, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
        this.name = asn1UTF8String;
        asn1UTF8String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 12, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1UTF8String asn1UTF8String2 = new Asn1UTF8String();
        this.value = asn1UTF8String2;
        asn1UTF8String2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 12)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.name.encode(asn1BerEncodeBuffer, true) + this.value.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.name = null;
        this.value = null;
    }

    public AuditTransportInfoItem(Asn1UTF8String asn1UTF8String, Asn1UTF8String asn1UTF8String2) {
        this.name = asn1UTF8String;
        this.value = asn1UTF8String2;
    }

    public AuditTransportInfoItem() {
    }
}
