package ru.CryptoPro.JCP.ASN.GostR3410_2001_ParamSetSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GostR3410_2001_ParamSetParameters extends Asn1Type {
    public Asn1Integer a;
    public Asn1Integer b;
    public Asn1Integer p;
    public Asn1Integer q;
    public Asn1Integer x;
    public Asn1Integer y;

    public GostR3410_2001_ParamSetParameters(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = new Asn1Integer(j);
        this.b = new Asn1Integer(j2);
        this.p = new Asn1Integer(j3);
        this.q = new Asn1Integer(j4);
        this.x = new Asn1Integer(j5);
        this.y = new Asn1Integer(j6);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.a = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.b = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer3 = new Asn1Integer();
        this.p = asn1Integer3;
        asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer4 = new Asn1Integer();
        this.q = asn1Integer4;
        asn1Integer4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer5 = new Asn1Integer();
        this.x = asn1Integer5;
        asn1Integer5.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer6 = new Asn1Integer();
        this.y = asn1Integer6;
        asn1Integer6.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 2)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.a.encode(asn1BerEncodeBuffer, true) + this.b.encode(asn1BerEncodeBuffer, true) + this.p.encode(asn1BerEncodeBuffer, true) + this.q.encode(asn1BerEncodeBuffer, true) + this.x.encode(asn1BerEncodeBuffer, true) + this.y.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.a = null;
        this.b = null;
        this.p = null;
        this.q = null;
        this.x = null;
        this.y = null;
    }

    public GostR3410_2001_ParamSetParameters(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3, Asn1Integer asn1Integer4, Asn1Integer asn1Integer5, Asn1Integer asn1Integer6) {
        this.a = asn1Integer;
        this.b = asn1Integer2;
        this.p = asn1Integer3;
        this.q = asn1Integer4;
        this.x = asn1Integer5;
        this.y = asn1Integer6;
    }

    public GostR3410_2001_ParamSetParameters() {
    }
}
