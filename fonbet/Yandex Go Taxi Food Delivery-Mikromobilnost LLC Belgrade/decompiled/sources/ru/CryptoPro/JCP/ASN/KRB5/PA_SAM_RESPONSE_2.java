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
public class PA_SAM_RESPONSE_2 extends Asn1Type {
    public Asn1OpenExt extElem1;
    public EncryptedData sam_enc_nonce_or_sad;
    public SAMFlags sam_flags;
    public Asn1Integer sam_nonce;
    public Asn1GeneralString sam_track_id;
    public Asn1Integer sam_type;

    public PA_SAM_RESPONSE_2(long j, SAMFlags sAMFlags, String str, EncryptedData encryptedData, long j2) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_track_id = new Asn1GeneralString(str);
        this.sam_enc_nonce_or_sad = encryptedData;
        this.sam_nonce = new Asn1Integer(j2);
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
        this.sam_type = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        SAMFlags sAMFlags = new SAMFlags();
        this.sam_flags = sAMFlags;
        sAMFlags.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            Asn1GeneralString asn1GeneralString = new Asn1GeneralString();
            this.sam_track_id = asn1GeneralString;
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptedData encryptedData = new EncryptedData();
        this.sam_enc_nonce_or_sad = encryptedData;
        encryptedData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.sam_nonce = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4)) {
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
        int encode2 = this.sam_nonce.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode2) + encode + encode2;
        int encode3 = this.sam_enc_nonce_or_sad.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode3) + encodeTagAndLength + encode3;
        Asn1GeneralString asn1GeneralString = this.sam_track_id;
        if (asn1GeneralString != null) {
            int encode4 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode4);
        }
        int encode5 = this.sam_flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5) + encodeTagAndLength2 + encode5;
        int encode6 = this.sam_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode6) + encodeTagAndLength3 + encode6;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4 : encodeTagAndLength4;
    }

    public void init() {
        this.sam_type = null;
        this.sam_flags = null;
        this.sam_track_id = null;
        this.sam_enc_nonce_or_sad = null;
        this.sam_nonce = null;
        this.extElem1 = null;
    }

    public PA_SAM_RESPONSE_2(Asn1Integer asn1Integer, SAMFlags sAMFlags, Asn1GeneralString asn1GeneralString, EncryptedData encryptedData, Asn1Integer asn1Integer2) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_track_id = asn1GeneralString;
        this.sam_enc_nonce_or_sad = encryptedData;
        this.sam_nonce = asn1Integer2;
    }

    public PA_SAM_RESPONSE_2(Asn1Integer asn1Integer, SAMFlags sAMFlags, EncryptedData encryptedData, Asn1Integer asn1Integer2) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_enc_nonce_or_sad = encryptedData;
        this.sam_nonce = asn1Integer2;
    }

    public PA_SAM_RESPONSE_2() {
    }

    public PA_SAM_RESPONSE_2(long j, SAMFlags sAMFlags, EncryptedData encryptedData, long j2) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_enc_nonce_or_sad = encryptedData;
        this.sam_nonce = new Asn1Integer(j2);
    }
}
