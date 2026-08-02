package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class ResponseData extends Asn1Type {
    private int produceAtLen = -1;
    public Asn1GeneralizedTime producedAt;
    public ResponderID responderID;
    public Extensions responseExtensions;
    public _SeqOfSingleResponse responses;
    public OCSPVersion version;

    public ResponseData(long j, ResponderID responderID, String str, _SeqOfSingleResponse _seqofsingleresponse, Extensions extensions) {
        this.version = new OCSPVersion(j);
        this.responderID = responderID;
        this.producedAt = new Asn1GeneralizedTime(str);
        this.responses = _seqofsingleresponse;
        this.responseExtensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            OCSPVersion oCSPVersion = new OCSPVersion();
            this.version = oCSPVersion;
            oCSPVersion.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 1) && !peekTag.equals((short) 128, (short) 32, 2)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ResponderID responderID = new ResponderID();
        this.responderID = responderID;
        responderID.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.producedAt = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        this.produceAtLen = intHolder.value;
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        _SeqOfSingleResponse _seqofsingleresponse = new _SeqOfSingleResponse();
        this.responses = _seqofsingleresponse;
        _seqofsingleresponse.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.responseExtensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 0, (short) 0, 24) || peekTag2.equals((short) 0, (short) 32, 16) || peekTag2.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.responseExtensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.responderID.encode(asn1BerEncodeBuffer, true) + RevokedInfo.encodeFix(asn1BerEncodeBuffer, this.produceAtLen, this.producedAt) + this.responses.encode(asn1BerEncodeBuffer, true) + i;
        OCSPVersion oCSPVersion = this.version;
        if (oCSPVersion != null) {
            int encode3 = oCSPVersion.encode(asn1BerEncodeBuffer, true);
            encode2 = encode2 + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.responderID = null;
        this.producedAt = null;
        this.responses = null;
        this.responseExtensions = null;
    }

    public ResponseData(OCSPVersion oCSPVersion, ResponderID responderID, Asn1GeneralizedTime asn1GeneralizedTime, _SeqOfSingleResponse _seqofsingleresponse, Extensions extensions) {
        this.version = oCSPVersion;
        this.responderID = responderID;
        this.producedAt = asn1GeneralizedTime;
        this.responses = _seqofsingleresponse;
        this.responseExtensions = extensions;
    }

    public ResponseData(ResponderID responderID, Asn1GeneralizedTime asn1GeneralizedTime, _SeqOfSingleResponse _seqofsingleresponse) {
        this.responderID = responderID;
        this.producedAt = asn1GeneralizedTime;
        this.responses = _seqofsingleresponse;
    }

    public ResponseData() {
    }

    public ResponseData(ResponderID responderID, String str, _SeqOfSingleResponse _seqofsingleresponse) {
        this.responderID = responderID;
        this.producedAt = new Asn1GeneralizedTime(str);
        this.responses = _seqofsingleresponse;
    }
}
