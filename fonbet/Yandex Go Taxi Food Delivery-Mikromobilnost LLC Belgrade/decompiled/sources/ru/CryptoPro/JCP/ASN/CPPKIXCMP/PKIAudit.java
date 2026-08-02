package ru.CryptoPro.JCP.ASN.CPPKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PKIAudit extends Asn1Type {
    public Asn1Integer counter;
    public Asn1Integer session;
    public Asn1Boolean success;
    public PKIAuditType type;

    public PKIAudit(int i, long j, long j2) {
        this.type = new PKIAuditType(i);
        this.session = new Asn1Integer(j);
        this.counter = new Asn1Integer(j2);
        this.success = new Asn1Boolean(true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 10, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIAuditType pKIAuditType = new PKIAuditType();
        this.type = pKIAuditType;
        pKIAuditType.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.session = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.counter = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.success = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 10) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.type.encode(asn1BerEncodeBuffer, true) + this.session.encode(asn1BerEncodeBuffer, true) + this.counter.encode(asn1BerEncodeBuffer, true) + (!this.success.equals(true) ? this.success.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.type = null;
        this.session = null;
        this.counter = null;
        this.success = new Asn1Boolean(true);
    }

    public PKIAudit(PKIAuditType pKIAuditType, Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Boolean asn1Boolean) {
        this.type = pKIAuditType;
        this.session = asn1Integer;
        this.counter = asn1Integer2;
        this.success = asn1Boolean;
    }

    public PKIAudit(PKIAuditType pKIAuditType, Asn1Integer asn1Integer, Asn1Integer asn1Integer2) {
        this.type = pKIAuditType;
        this.session = asn1Integer;
        this.counter = asn1Integer2;
        this.success = new Asn1Boolean(true);
    }

    public PKIAudit(int i, long j, long j2, boolean z) {
        this.type = new PKIAuditType(i);
        this.session = new Asn1Integer(j);
        this.counter = new Asn1Integer(j2);
        this.success = new Asn1Boolean(z);
    }

    public PKIAudit() {
        this.success = new Asn1Boolean(true);
    }
}
