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
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;

/* loaded from: classes4.dex */
public class NSRequestInformation extends Asn1Type {
    public Asn1GeneralizedTime requestTime;
    public GeneralNames requester;
    public NSServiceType service;
    public NSVersion version;

    public NSRequestInformation(long j, int i, String str, GeneralNames generalNames) {
        this.version = new NSVersion(j);
        this.service = new NSServiceType(i);
        this.requestTime = new Asn1GeneralizedTime(str);
        this.requester = generalNames;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 10, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        NSServiceType nSServiceType = new NSServiceType();
        this.service = nSServiceType;
        nSServiceType.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.requestTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            GeneralNames generalNames = new GeneralNames();
            this.requester = generalNames;
            generalNames.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 0, (short) 0, 10) || peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        GeneralNames generalNames = this.requester;
        if (generalNames != null) {
            int encode = generalNames.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        int encode2 = this.service.encode(asn1BerEncodeBuffer, true) + this.requestTime.encode(asn1BerEncodeBuffer, true) + i;
        NSVersion nSVersion = this.version;
        if (nSVersion != null) {
            int encode3 = nSVersion.encode(asn1BerEncodeBuffer, false);
            encode2 = encode2 + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.version = null;
        this.service = null;
        this.requestTime = null;
        this.requester = null;
    }

    public NSRequestInformation(NSVersion nSVersion, NSServiceType nSServiceType, Asn1GeneralizedTime asn1GeneralizedTime, GeneralNames generalNames) {
        this.version = nSVersion;
        this.service = nSServiceType;
        this.requestTime = asn1GeneralizedTime;
        this.requester = generalNames;
    }

    public NSRequestInformation(NSServiceType nSServiceType, Asn1GeneralizedTime asn1GeneralizedTime) {
        this.service = nSServiceType;
        this.requestTime = asn1GeneralizedTime;
    }

    public NSRequestInformation() {
    }

    public NSRequestInformation(int i, String str) {
        this.service = new NSServiceType(i);
        this.requestTime = new Asn1GeneralizedTime(str);
    }
}
