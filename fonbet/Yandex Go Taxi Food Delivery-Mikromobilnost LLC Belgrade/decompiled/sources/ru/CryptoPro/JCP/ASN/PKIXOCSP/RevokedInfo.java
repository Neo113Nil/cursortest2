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
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.CRLReason;

/* loaded from: classes4.dex */
public class RevokedInfo extends Asn1Type {
    public CRLReason revocationReason;
    public Asn1GeneralizedTime revocationTime;
    private int revocationTimeLen = -1;

    public RevokedInfo(String str, int i) {
        this.revocationTime = new Asn1GeneralizedTime(str);
        this.revocationReason = new CRLReason(i);
    }

    public static int encodeFix(Asn1BerEncodeBuffer asn1BerEncodeBuffer, int i, Asn1GeneralizedTime asn1GeneralizedTime) throws Asn1Exception {
        if (i < 0) {
            i = 15;
        }
        Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
        int encode = asn1GeneralizedTime.encode(asn1BerEncodeBuffer2, true);
        byte[] msgCopy = asn1BerEncodeBuffer2.getMsgCopy();
        int i2 = i - (encode - 2);
        if (i2 <= 0) {
            asn1BerEncodeBuffer.copy(msgCopy);
            return encode;
        }
        if (i2 == 2 && asn1GeneralizedTime.getSecond() != 0) {
            quz.s("Invalid difference for seconds");
            return 0;
        }
        if (i2 == 4 && asn1GeneralizedTime.getMinute() != 0) {
            quz.s("Invalid difference for minutes");
            return 0;
        }
        int i3 = encode + i2;
        byte[] bArr = new byte[i3];
        Arrays.fill(bArr, (byte) 48);
        int i4 = (asn1GeneralizedTime.getMinute() == 0 ? 10 : 12) + 2;
        System.arraycopy(msgCopy, 0, bArr, 0, i4);
        System.arraycopy(msgCopy, i4, bArr, i2 + i4, encode - i4);
        bArr[1] = (byte) i;
        asn1BerEncodeBuffer.copy(bArr);
        return i3;
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
        this.revocationTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        this.revocationTimeLen = intHolder.value;
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            CRLReason cRLReason = new CRLReason();
            this.revocationReason = cRLReason;
            cRLReason.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        CRLReason cRLReason = this.revocationReason;
        int i = 0;
        if (cRLReason != null) {
            int encode = cRLReason.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        int encodeFix = encodeFix(asn1BerEncodeBuffer, this.revocationTimeLen, this.revocationTime) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeFix) + encodeFix : encodeFix;
    }

    public void init() {
        this.revocationTime = null;
        this.revocationReason = null;
    }

    public RevokedInfo(Asn1GeneralizedTime asn1GeneralizedTime, CRLReason cRLReason) {
        this.revocationTime = asn1GeneralizedTime;
        this.revocationReason = cRLReason;
    }

    public RevokedInfo(Asn1GeneralizedTime asn1GeneralizedTime) {
        this.revocationTime = asn1GeneralizedTime;
    }

    public RevokedInfo() {
    }

    public RevokedInfo(String str) {
        this.revocationTime = new Asn1GeneralizedTime(str);
    }
}
