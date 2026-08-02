package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class KRB_SAFE extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 20);
    public Checksum cksum;
    public Asn1Integer msg_type;
    public Asn1Integer pvno;
    public KRB_SAFE_BODY safe_body;

    public KRB_SAFE(long j, long j2, KRB_SAFE_BODY krb_safe_body, Checksum checksum) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.safe_body = krb_safe_body;
        this.cksum = checksum;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.pvno = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.msg_type = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KRB_SAFE_BODY krb_safe_body = new KRB_SAFE_BODY();
        this.safe_body = krb_safe_body;
        krb_safe_body.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Checksum checksum = new Checksum();
        this.cksum = checksum;
        checksum.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.cksum.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        int encode2 = this.safe_body.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2) + encodeTagAndLength + encode2;
        int encode3 = this.msg_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3) + encodeTagAndLength2 + encode3;
        int encode4 = this.pvno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4) + encodeTagAndLength3 + encode4;
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength5) + encodeTagAndLength5 : encodeTagAndLength5;
    }

    public void init() {
        this.pvno = null;
        this.msg_type = null;
        this.safe_body = null;
        this.cksum = null;
    }

    public KRB_SAFE(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, KRB_SAFE_BODY krb_safe_body, Checksum checksum) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.safe_body = krb_safe_body;
        this.cksum = checksum;
    }

    public KRB_SAFE() {
    }
}
