package ru.CryptoPro.JCP.ASN.Audit_Log;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AuditLog extends Asn1Type {
    public Asn1GeneralizedTime finishLogTime;
    public _SeqOfAuditRecord records;
    public Asn1ObjectIdentifier serviceType;
    public Asn1GeneralizedTime startLogTime;
    public AuditLogStatusInfo statusInfo;
    public ALVersion version;

    public AuditLog(long j, String str, String str2, int[] iArr, _SeqOfAuditRecord _seqofauditrecord, AuditLogStatusInfo auditLogStatusInfo) {
        this.version = new ALVersion(j);
        this.startLogTime = new Asn1GeneralizedTime(str);
        this.finishLogTime = new Asn1GeneralizedTime(str2);
        this.serviceType = new Asn1ObjectIdentifier(iArr);
        this.records = _seqofauditrecord;
        this.statusInfo = auditLogStatusInfo;
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
        ALVersion aLVersion = new ALVersion();
        this.version = aLVersion;
        aLVersion.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.startLogTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime2 = new Asn1GeneralizedTime(true);
        this.finishLogTime = asn1GeneralizedTime2;
        asn1GeneralizedTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.serviceType = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfAuditRecord _seqofauditrecord = new _SeqOfAuditRecord();
        this.records = _seqofauditrecord;
        _seqofauditrecord.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AuditLogStatusInfo auditLogStatusInfo = new AuditLogStatusInfo();
        this.statusInfo = auditLogStatusInfo;
        auditLogStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.version.encode(asn1BerEncodeBuffer, true) + this.startLogTime.encode(asn1BerEncodeBuffer, true) + this.finishLogTime.encode(asn1BerEncodeBuffer, true) + this.serviceType.encode(asn1BerEncodeBuffer, true) + this.records.encode(asn1BerEncodeBuffer, true) + this.statusInfo.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.version = null;
        this.startLogTime = null;
        this.finishLogTime = null;
        this.serviceType = null;
        this.records = null;
        this.statusInfo = null;
    }

    public AuditLog(ALVersion aLVersion, Asn1GeneralizedTime asn1GeneralizedTime, Asn1GeneralizedTime asn1GeneralizedTime2, Asn1ObjectIdentifier asn1ObjectIdentifier, _SeqOfAuditRecord _seqofauditrecord, AuditLogStatusInfo auditLogStatusInfo) {
        this.version = aLVersion;
        this.startLogTime = asn1GeneralizedTime;
        this.finishLogTime = asn1GeneralizedTime2;
        this.serviceType = asn1ObjectIdentifier;
        this.records = _seqofauditrecord;
        this.statusInfo = auditLogStatusInfo;
    }

    public AuditLog() {
    }
}
