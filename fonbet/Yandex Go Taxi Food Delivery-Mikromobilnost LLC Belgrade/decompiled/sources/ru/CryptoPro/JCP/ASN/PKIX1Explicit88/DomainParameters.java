package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

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
public class DomainParameters extends Asn1Type {
    public Asn1Integer g;
    public Asn1Integer j;
    public Asn1Integer p;
    public Asn1Integer q;
    public ValidationParms validationParms;

    public DomainParameters(long j, long j2, long j3, long j4, ValidationParms validationParms) {
        this.p = new Asn1Integer(j);
        this.g = new Asn1Integer(j2);
        this.q = new Asn1Integer(j3);
        this.j = new Asn1Integer(j4);
        this.validationParms = validationParms;
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
        this.p = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.g = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer3 = new Asn1Integer();
        this.q = asn1Integer3;
        asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer4 = new Asn1Integer();
            this.j = asn1Integer4;
            asn1Integer4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            ValidationParms validationParms = new ValidationParms();
            this.validationParms = validationParms;
            validationParms.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        ValidationParms validationParms = this.validationParms;
        int encode = validationParms != null ? validationParms.encode(asn1BerEncodeBuffer, true) : 0;
        Asn1Integer asn1Integer = this.j;
        if (asn1Integer != null) {
            encode += asn1Integer.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.p.encode(asn1BerEncodeBuffer, true) + this.g.encode(asn1BerEncodeBuffer, true) + this.q.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.p = null;
        this.g = null;
        this.q = null;
        this.j = null;
        this.validationParms = null;
    }

    public DomainParameters(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3, Asn1Integer asn1Integer4, ValidationParms validationParms) {
        this.p = asn1Integer;
        this.g = asn1Integer2;
        this.q = asn1Integer3;
        this.j = asn1Integer4;
        this.validationParms = validationParms;
    }

    public DomainParameters(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3) {
        this.p = asn1Integer;
        this.g = asn1Integer2;
        this.q = asn1Integer3;
    }

    public DomainParameters() {
    }

    public DomainParameters(long j, long j2, long j3) {
        this.p = new Asn1Integer(j);
        this.g = new Asn1Integer(j2);
        this.q = new Asn1Integer(j3);
    }
}
