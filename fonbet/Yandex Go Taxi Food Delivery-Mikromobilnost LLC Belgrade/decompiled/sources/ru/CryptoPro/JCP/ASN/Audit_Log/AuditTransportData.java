package ru.CryptoPro.JCP.ASN.Audit_Log;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AuditTransportData extends Asn1Type {
    public Asn1OctetString message;
    public Asn1GeneralizedTime time_;
    public _SeqOfAuditTransportInfoItem transportInfo;

    public AuditTransportData(String str, byte[] bArr, _SeqOfAuditTransportInfoItem _seqofaudittransportinfoitem) {
        this.time_ = new Asn1GeneralizedTime(str);
        this.message = new Asn1OctetString(bArr);
        this.transportInfo = _seqofaudittransportinfoitem;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.time_ = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.message = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            _SeqOfAuditTransportInfoItem _seqofaudittransportinfoitem = new _SeqOfAuditTransportInfoItem();
            this.transportInfo = _seqofaudittransportinfoitem;
            _seqofaudittransportinfoitem.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        _SeqOfAuditTransportInfoItem _seqofaudittransportinfoitem = this.transportInfo;
        int encode = this.time_.encode(asn1BerEncodeBuffer, true) + this.message.encode(asn1BerEncodeBuffer, true) + (_seqofaudittransportinfoitem != null ? _seqofaudittransportinfoitem.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.time_ = null;
        this.message = null;
        this.transportInfo = null;
    }

    public AuditTransportData(Asn1GeneralizedTime asn1GeneralizedTime, Asn1OctetString asn1OctetString, _SeqOfAuditTransportInfoItem _seqofaudittransportinfoitem) {
        this.time_ = asn1GeneralizedTime;
        this.message = asn1OctetString;
        this.transportInfo = _seqofaudittransportinfoitem;
    }

    public AuditTransportData(Asn1GeneralizedTime asn1GeneralizedTime, Asn1OctetString asn1OctetString) {
        this.time_ = asn1GeneralizedTime;
        this.message = asn1OctetString;
    }

    public AuditTransportData() {
    }

    public AuditTransportData(String str, byte[] bArr) {
        this.time_ = new Asn1GeneralizedTime(str);
        this.message = new Asn1OctetString(bArr);
    }
}
