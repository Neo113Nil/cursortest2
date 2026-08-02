package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class OtherSigningCertificate extends Asn1Type {
    public _SeqOfOtherCertID certs;
    public _SeqOfPolicyInformation policies;

    public OtherSigningCertificate(_SeqOfOtherCertID _seqofothercertid, _SeqOfPolicyInformation _seqofpolicyinformation) {
        this.certs = _seqofothercertid;
        this.policies = _seqofpolicyinformation;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfOtherCertID _seqofothercertid = new _SeqOfOtherCertID();
        this.certs = _seqofothercertid;
        _seqofothercertid.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            _SeqOfPolicyInformation _seqofpolicyinformation = new _SeqOfPolicyInformation();
            this.policies = _seqofpolicyinformation;
            _seqofpolicyinformation.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        _SeqOfPolicyInformation _seqofpolicyinformation = this.policies;
        int encode = this.certs.encode(asn1BerEncodeBuffer, true) + (_seqofpolicyinformation != null ? _seqofpolicyinformation.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.certs = null;
        this.policies = null;
    }

    public OtherSigningCertificate() {
    }

    public OtherSigningCertificate(_SeqOfOtherCertID _seqofothercertid) {
        this.certs = _seqofothercertid;
    }
}
