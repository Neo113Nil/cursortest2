package ru.CryptoPro.JCP.ASN.PKIXCRMF;

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
public class PKIPublicationInfo extends Asn1Type {
    public PKIPublicationInfo_action action;
    public PKIPublicationInfo_pubInfos pubInfos;

    public PKIPublicationInfo(long j, PKIPublicationInfo_pubInfos pKIPublicationInfo_pubInfos) {
        this.action = new PKIPublicationInfo_action(j);
        this.pubInfos = pKIPublicationInfo_pubInfos;
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
        PKIPublicationInfo_action pKIPublicationInfo_action = new PKIPublicationInfo_action();
        this.action = pKIPublicationInfo_action;
        pKIPublicationInfo_action.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            PKIPublicationInfo_pubInfos pKIPublicationInfo_pubInfos = new PKIPublicationInfo_pubInfos();
            this.pubInfos = pKIPublicationInfo_pubInfos;
            pKIPublicationInfo_pubInfos.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        PKIPublicationInfo_pubInfos pKIPublicationInfo_pubInfos = this.pubInfos;
        int encode = this.action.encode(asn1BerEncodeBuffer, true) + (pKIPublicationInfo_pubInfos != null ? pKIPublicationInfo_pubInfos.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.action = null;
        this.pubInfos = null;
    }

    public PKIPublicationInfo(PKIPublicationInfo_action pKIPublicationInfo_action, PKIPublicationInfo_pubInfos pKIPublicationInfo_pubInfos) {
        this.action = pKIPublicationInfo_action;
        this.pubInfos = pKIPublicationInfo_pubInfos;
    }

    public PKIPublicationInfo(PKIPublicationInfo_action pKIPublicationInfo_action) {
        this.action = pKIPublicationInfo_action;
    }

    public PKIPublicationInfo() {
    }

    public PKIPublicationInfo(long j) {
        this.action = new PKIPublicationInfo_action(j);
    }
}
