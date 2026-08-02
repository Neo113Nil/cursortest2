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
public class SingleResponse extends Asn1Type {
    public CertStatus certStatus;
    public Asn1GeneralizedTime nextUpdate;
    public ReqCert reqCert;
    public Extensions singleExtensions;
    public Asn1GeneralizedTime thisUpdate;
    private int thisUpdateLen = -1;
    private int nextUpdateLen = -1;

    public SingleResponse(ReqCert reqCert, CertStatus certStatus, String str, String str2, Extensions extensions) {
        this.reqCert = reqCert;
        this.certStatus = certStatus;
        this.thisUpdate = new Asn1GeneralizedTime(str);
        this.nextUpdate = new Asn1GeneralizedTime(str2);
        this.singleExtensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 32, 16) && !peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 32, 1)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ReqCert reqCert = new ReqCert();
        this.reqCert = reqCert;
        reqCert.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (!peekTag2.equals((short) 128, (short) 0, 0) && !peekTag2.equals((short) 128, (short) 32, 1) && !peekTag2.equals((short) 128, (short) 0, 2)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertStatus certStatus = new CertStatus();
        this.certStatus = certStatus;
        certStatus.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.thisUpdate = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        this.thisUpdateLen = intHolder.value;
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Asn1GeneralizedTime asn1GeneralizedTime2 = new Asn1GeneralizedTime(true);
            this.nextUpdate = asn1GeneralizedTime2;
            asn1GeneralizedTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
            this.nextUpdateLen = intHolder.value;
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.singleExtensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag3 = asn1BerDecodeBuffer.peekTag();
        if (peekTag3.equals((short) 0, (short) 0, 24) || peekTag3.equals((short) 128, (short) 32, 0) || peekTag3.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.singleExtensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = this.nextUpdate;
        if (asn1GeneralizedTime != null) {
            int encodeFix = RevokedInfo.encodeFix(asn1BerEncodeBuffer, this.nextUpdateLen, asn1GeneralizedTime);
            i = i + encodeFix + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encodeFix);
        }
        int encode2 = this.reqCert.encode(asn1BerEncodeBuffer, true) + this.certStatus.encode(asn1BerEncodeBuffer, true) + RevokedInfo.encodeFix(asn1BerEncodeBuffer, this.thisUpdateLen, this.thisUpdate) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.reqCert = null;
        this.certStatus = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.singleExtensions = null;
    }

    public SingleResponse(ReqCert reqCert, CertStatus certStatus, Asn1GeneralizedTime asn1GeneralizedTime, Asn1GeneralizedTime asn1GeneralizedTime2, Extensions extensions) {
        this.reqCert = reqCert;
        this.certStatus = certStatus;
        this.thisUpdate = asn1GeneralizedTime;
        this.nextUpdate = asn1GeneralizedTime2;
        this.singleExtensions = extensions;
    }

    public SingleResponse(ReqCert reqCert, CertStatus certStatus, Asn1GeneralizedTime asn1GeneralizedTime) {
        this.reqCert = reqCert;
        this.certStatus = certStatus;
        this.thisUpdate = asn1GeneralizedTime;
    }

    public SingleResponse() {
    }

    public SingleResponse(ReqCert reqCert, CertStatus certStatus, String str) {
        this.reqCert = reqCert;
        this.certStatus = certStatus;
        this.thisUpdate = new Asn1GeneralizedTime(str);
    }
}
