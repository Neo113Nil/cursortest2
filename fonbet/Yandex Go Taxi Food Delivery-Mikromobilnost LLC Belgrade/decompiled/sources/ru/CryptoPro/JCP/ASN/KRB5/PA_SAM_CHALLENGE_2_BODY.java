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
public class PA_SAM_CHALLENGE_2_BODY extends Asn1Type {
    public Asn1OpenExt extElem1;
    public Asn1GeneralString sam_challenge;
    public Asn1GeneralString sam_challenge_label;
    public Asn1Integer sam_etype;
    public SAMFlags sam_flags;
    public Asn1Integer sam_nonce;
    public EncryptionKey sam_pk_for_sad;
    public Asn1GeneralString sam_response_prompt;
    public Asn1GeneralString sam_track_id;
    public Asn1Integer sam_type;
    public Asn1GeneralString sam_type_name;

    public PA_SAM_CHALLENGE_2_BODY(long j, SAMFlags sAMFlags, String str, String str2, String str3, String str4, String str5, EncryptionKey encryptionKey, long j2, long j3) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_type_name = new Asn1GeneralString(str);
        this.sam_track_id = new Asn1GeneralString(str2);
        this.sam_challenge_label = new Asn1GeneralString(str3);
        this.sam_challenge = new Asn1GeneralString(str4);
        this.sam_response_prompt = new Asn1GeneralString(str5);
        this.sam_pk_for_sad = encryptionKey;
        this.sam_nonce = new Asn1Integer(j2);
        this.sam_etype = new Asn1Integer(j3);
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
            this.sam_type_name = asn1GeneralString;
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1GeneralString asn1GeneralString2 = new Asn1GeneralString();
            this.sam_track_id = asn1GeneralString2;
            asn1GeneralString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            Asn1GeneralString asn1GeneralString3 = new Asn1GeneralString();
            this.sam_challenge_label = asn1GeneralString3;
            asn1GeneralString3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            Asn1GeneralString asn1GeneralString4 = new Asn1GeneralString();
            this.sam_challenge = asn1GeneralString4;
            asn1GeneralString4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            Asn1GeneralString asn1GeneralString5 = new Asn1GeneralString();
            this.sam_response_prompt = asn1GeneralString5;
            asn1GeneralString5.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            EncryptionKey encryptionKey = new EncryptionKey();
            this.sam_pk_for_sad = encryptionKey;
            encryptionKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.sam_nonce = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer3 = new Asn1Integer();
        this.sam_etype = asn1Integer3;
        asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9)) {
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
        int encode2 = this.sam_etype.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode2) + encode + encode2;
        int encode3 = this.sam_nonce.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode3) + encodeTagAndLength + encode3;
        EncryptionKey encryptionKey = this.sam_pk_for_sad;
        if (encryptionKey != null) {
            int encode4 = encryptionKey.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode4);
        }
        Asn1GeneralString asn1GeneralString = this.sam_response_prompt;
        if (asn1GeneralString != null) {
            int encode5 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode5);
        }
        Asn1GeneralString asn1GeneralString2 = this.sam_challenge;
        if (asn1GeneralString2 != null) {
            int encode6 = asn1GeneralString2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode6);
        }
        Asn1GeneralString asn1GeneralString3 = this.sam_challenge_label;
        if (asn1GeneralString3 != null) {
            int encode7 = asn1GeneralString3.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode7);
        }
        Asn1GeneralString asn1GeneralString4 = this.sam_track_id;
        if (asn1GeneralString4 != null) {
            int encode8 = asn1GeneralString4.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode8);
        }
        Asn1GeneralString asn1GeneralString5 = this.sam_type_name;
        if (asn1GeneralString5 != null) {
            int encode9 = asn1GeneralString5.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode9);
        }
        int encode10 = this.sam_flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode10) + encodeTagAndLength2 + encode10;
        int encode11 = this.sam_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode11) + encodeTagAndLength3 + encode11;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4 : encodeTagAndLength4;
    }

    public void init() {
        this.sam_type = null;
        this.sam_flags = null;
        this.sam_type_name = null;
        this.sam_track_id = null;
        this.sam_challenge_label = null;
        this.sam_challenge = null;
        this.sam_response_prompt = null;
        this.sam_pk_for_sad = null;
        this.sam_nonce = null;
        this.sam_etype = null;
        this.extElem1 = null;
    }

    public PA_SAM_CHALLENGE_2_BODY(Asn1Integer asn1Integer, SAMFlags sAMFlags, Asn1GeneralString asn1GeneralString, Asn1GeneralString asn1GeneralString2, Asn1GeneralString asn1GeneralString3, Asn1GeneralString asn1GeneralString4, Asn1GeneralString asn1GeneralString5, EncryptionKey encryptionKey, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_type_name = asn1GeneralString;
        this.sam_track_id = asn1GeneralString2;
        this.sam_challenge_label = asn1GeneralString3;
        this.sam_challenge = asn1GeneralString4;
        this.sam_response_prompt = asn1GeneralString5;
        this.sam_pk_for_sad = encryptionKey;
        this.sam_nonce = asn1Integer2;
        this.sam_etype = asn1Integer3;
    }

    public PA_SAM_CHALLENGE_2_BODY(Asn1Integer asn1Integer, SAMFlags sAMFlags, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_nonce = asn1Integer2;
        this.sam_etype = asn1Integer3;
    }

    public PA_SAM_CHALLENGE_2_BODY() {
    }

    public PA_SAM_CHALLENGE_2_BODY(long j, SAMFlags sAMFlags, long j2, long j3) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_nonce = new Asn1Integer(j2);
        this.sam_etype = new Asn1Integer(j3);
    }
}
