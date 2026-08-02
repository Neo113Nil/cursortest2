package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralString;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OpenExt;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PA_ENC_SAM_RESPONSE_ENC_2 extends Asn1Type {
    public Asn1OpenExt extElem1;
    public Asn1Integer sam_nonce;
    public Asn1GeneralString sam_sad;

    public PA_ENC_SAM_RESPONSE_ENC_2(long j, String str) {
        this.sam_nonce = new Asn1Integer(j);
        this.sam_sad = new Asn1GeneralString(str);
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
        Asn1Integer asn1Integer = new Asn1Integer();
        this.sam_nonce = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Asn1GeneralString asn1GeneralString = new Asn1GeneralString();
            this.sam_sad = asn1GeneralString;
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
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
        int encode = asn1OpenExt != null ? asn1OpenExt.encode(asn1BerEncodeBuffer, false) : 0;
        Asn1GeneralString asn1GeneralString = this.sam_sad;
        if (asn1GeneralString != null) {
            int encode2 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        int encode3 = this.sam_nonce.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3) + encode + encode3;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength) + encodeTagAndLength : encodeTagAndLength;
    }

    public void init() {
        this.sam_nonce = null;
        this.sam_sad = null;
        this.extElem1 = null;
    }

    public PA_ENC_SAM_RESPONSE_ENC_2(Asn1Integer asn1Integer, Asn1GeneralString asn1GeneralString) {
        this.sam_nonce = asn1Integer;
        this.sam_sad = asn1GeneralString;
    }

    public PA_ENC_SAM_RESPONSE_ENC_2(Asn1Integer asn1Integer) {
        this.sam_nonce = asn1Integer;
    }

    public PA_ENC_SAM_RESPONSE_ENC_2() {
    }

    public PA_ENC_SAM_RESPONSE_ENC_2(long j) {
        this.sam_nonce = new Asn1Integer(j);
    }
}
