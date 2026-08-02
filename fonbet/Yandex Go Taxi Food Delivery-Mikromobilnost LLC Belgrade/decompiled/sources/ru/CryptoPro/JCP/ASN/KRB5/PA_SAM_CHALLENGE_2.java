package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OpenExt;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PA_SAM_CHALLENGE_2 extends Asn1Type {
    public Asn1OpenExt extElem1;
    public PA_SAM_CHALLENGE_2_BODY sam_body;
    public PA_SAM_CHALLENGE_2_sam_cksum sam_cksum;

    public PA_SAM_CHALLENGE_2(PA_SAM_CHALLENGE_2_BODY pa_sam_challenge_2_body, PA_SAM_CHALLENGE_2_sam_cksum pA_SAM_CHALLENGE_2_sam_cksum) {
        this.sam_body = pa_sam_challenge_2_body;
        this.sam_cksum = pA_SAM_CHALLENGE_2_sam_cksum;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PA_SAM_CHALLENGE_2_BODY pa_sam_challenge_2_body = new PA_SAM_CHALLENGE_2_BODY();
        this.sam_body = pa_sam_challenge_2_body;
        pa_sam_challenge_2_body.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PA_SAM_CHALLENGE_2_sam_cksum pA_SAM_CHALLENGE_2_sam_cksum = new PA_SAM_CHALLENGE_2_sam_cksum();
        this.sam_cksum = pA_SAM_CHALLENGE_2_sam_cksum;
        pA_SAM_CHALLENGE_2_sam_cksum.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
            return;
        }
        this.extElem1 = new Asn1OpenExt();
        while (!asn1BerDecodeContext.expired()) {
            this.extElem1.decodeComponent(asn1BerDecodeBuffer);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OpenExt asn1OpenExt = this.extElem1;
        int encode = this.sam_cksum.encode(asn1BerEncodeBuffer, true) + (asn1OpenExt != null ? asn1OpenExt.encode(asn1BerEncodeBuffer, false) : 0);
        int encode2 = this.sam_body.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2) + encode + encode2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public void init() {
        this.sam_body = null;
        this.sam_cksum = null;
        this.extElem1 = null;
    }

    public PA_SAM_CHALLENGE_2() {
    }
}
