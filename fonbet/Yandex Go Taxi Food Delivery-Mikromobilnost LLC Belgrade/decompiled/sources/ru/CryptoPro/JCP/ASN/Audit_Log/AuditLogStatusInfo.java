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
public class AuditLogStatusInfo extends Asn1Type {
    public Asn1UTF8String operatorStatement;
    public AuditLogStatus status;

    public AuditLogStatusInfo(long j, String str) {
        this.status = new AuditLogStatus(j);
        this.operatorStatement = new Asn1UTF8String(str);
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
        AuditLogStatus auditLogStatus = new AuditLogStatus();
        this.status = auditLogStatus;
        auditLogStatus.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 12, intHolder, false)) {
            Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
            this.operatorStatement = asn1UTF8String;
            asn1UTF8String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 12)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1UTF8String asn1UTF8String = this.operatorStatement;
        int encode = this.status.encode(asn1BerEncodeBuffer, true) + (asn1UTF8String != null ? asn1UTF8String.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.status = null;
        this.operatorStatement = null;
    }

    public AuditLogStatusInfo(AuditLogStatus auditLogStatus, Asn1UTF8String asn1UTF8String) {
        this.status = auditLogStatus;
        this.operatorStatement = asn1UTF8String;
    }

    public AuditLogStatusInfo(AuditLogStatus auditLogStatus) {
        this.status = auditLogStatus;
    }

    public AuditLogStatusInfo() {
    }

    public AuditLogStatusInfo(long j) {
        this.status = new AuditLogStatus(j);
    }
}
