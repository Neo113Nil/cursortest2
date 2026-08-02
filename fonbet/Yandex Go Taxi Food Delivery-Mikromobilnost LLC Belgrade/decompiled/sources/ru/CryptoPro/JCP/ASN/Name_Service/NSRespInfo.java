package ru.CryptoPro.JCP.ASN.Name_Service;

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
public class NSRespInfo extends Asn1Type {
    public Extensions extensions;
    public NSStatusInfo nsStatus;
    public Asn1GeneralizedTime responseTime;
    public NSVersion version;

    public NSRespInfo(long j, String str, NSStatusInfo nSStatusInfo, Extensions extensions) {
        this.version = new NSVersion(j);
        this.responseTime = new Asn1GeneralizedTime(str);
        this.nsStatus = nSStatusInfo;
        this.extensions = extensions;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            NSVersion nSVersion = new NSVersion();
            this.version = nSVersion;
            nSVersion.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.responseTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        NSStatusInfo nSStatusInfo = new NSStatusInfo();
        this.nsStatus = nSStatusInfo;
        nSStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.responseTime.encode(asn1BerEncodeBuffer, true) + this.nsStatus.encode(asn1BerEncodeBuffer, true) + i;
        NSVersion nSVersion = this.version;
        if (nSVersion != null) {
            int encode3 = nSVersion.encode(asn1BerEncodeBuffer, false);
            encode2 = encode2 + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.responseTime = null;
        this.nsStatus = null;
        this.extensions = null;
    }

    public NSRespInfo(NSVersion nSVersion, Asn1GeneralizedTime asn1GeneralizedTime, NSStatusInfo nSStatusInfo, Extensions extensions) {
        this.version = nSVersion;
        this.responseTime = asn1GeneralizedTime;
        this.nsStatus = nSStatusInfo;
        this.extensions = extensions;
    }

    public NSRespInfo(Asn1GeneralizedTime asn1GeneralizedTime, NSStatusInfo nSStatusInfo) {
        this.responseTime = asn1GeneralizedTime;
        this.nsStatus = nSStatusInfo;
    }

    public NSRespInfo() {
    }

    public NSRespInfo(String str, NSStatusInfo nSStatusInfo) {
        this.responseTime = new Asn1GeneralizedTime(str);
        this.nsStatus = nSStatusInfo;
    }
}
