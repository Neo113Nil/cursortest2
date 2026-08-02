package ru.CryptoPro.JCP.ASN.CertificateExtensions;

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

/* loaded from: classes4.dex */
public class PrivateKeyUsagePeriod extends Asn1Type {
    public Asn1GeneralizedTime notAfter;
    public Asn1GeneralizedTime notBefore;

    public PrivateKeyUsagePeriod(String str, String str2) {
        this.notBefore = new Asn1GeneralizedTime(str);
        this.notAfter = new Asn1GeneralizedTime(str2);
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
            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
            this.notBefore = asn1GeneralizedTime;
            asn1GeneralizedTime.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1GeneralizedTime asn1GeneralizedTime2 = new Asn1GeneralizedTime(true);
            this.notAfter = asn1GeneralizedTime2;
            asn1GeneralizedTime2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1GeneralizedTime asn1GeneralizedTime = this.notAfter;
        if (asn1GeneralizedTime != null) {
            int encode = asn1GeneralizedTime.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        } else {
            i = 0;
        }
        Asn1GeneralizedTime asn1GeneralizedTime2 = this.notBefore;
        if (asn1GeneralizedTime2 != null) {
            int encode2 = asn1GeneralizedTime2.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.notBefore = null;
        this.notAfter = null;
    }

    public PrivateKeyUsagePeriod(Asn1GeneralizedTime asn1GeneralizedTime, Asn1GeneralizedTime asn1GeneralizedTime2) {
        this.notBefore = asn1GeneralizedTime;
        this.notAfter = asn1GeneralizedTime2;
    }

    public PrivateKeyUsagePeriod() {
    }
}
