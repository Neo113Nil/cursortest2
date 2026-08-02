package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralString;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PA_SAM_CHALLENGE extends Asn1Type {
    public Asn1GeneralString sam_challenge;
    public Asn1GeneralString sam_challenge_label;
    public Checksum sam_cksum;
    public SAMFlags sam_flags;
    public Asn1Integer sam_nonce;
    public Asn1OctetString sam_pk_for_sad;
    public Asn1GeneralString sam_response_prompt;
    public Asn1GeneralString sam_track_id;
    public Asn1Integer sam_type;
    public Asn1GeneralString sam_type_name;

    public PA_SAM_CHALLENGE(long j, SAMFlags sAMFlags, String str, String str2, String str3, String str4, String str5, byte[] bArr, long j2, Checksum checksum) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_type_name = new Asn1GeneralString(str);
        this.sam_track_id = new Asn1GeneralString(str2);
        this.sam_challenge_label = new Asn1GeneralString(str3);
        this.sam_challenge = new Asn1GeneralString(str4);
        this.sam_response_prompt = new Asn1GeneralString(str5);
        this.sam_pk_for_sad = new Asn1OctetString(bArr);
        this.sam_nonce = new Asn1Integer(j2);
        this.sam_cksum = checksum;
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
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.sam_pk_for_sad = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.sam_nonce = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            Checksum checksum = new Checksum();
            this.sam_cksum = checksum;
            checksum.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Checksum checksum = this.sam_cksum;
        if (checksum != null) {
            int encode = checksum.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode) + encode;
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer = this.sam_nonce;
        if (asn1Integer != null) {
            int encode2 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode2);
        }
        Asn1OctetString asn1OctetString = this.sam_pk_for_sad;
        if (asn1OctetString != null) {
            int encode3 = asn1OctetString.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode3);
        }
        Asn1GeneralString asn1GeneralString = this.sam_response_prompt;
        if (asn1GeneralString != null) {
            int encode4 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode4);
        }
        Asn1GeneralString asn1GeneralString2 = this.sam_challenge;
        if (asn1GeneralString2 != null) {
            int encode5 = asn1GeneralString2.encode(asn1BerEncodeBuffer, true);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode5);
        }
        Asn1GeneralString asn1GeneralString3 = this.sam_challenge_label;
        if (asn1GeneralString3 != null) {
            int encode6 = asn1GeneralString3.encode(asn1BerEncodeBuffer, true);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode6);
        }
        Asn1GeneralString asn1GeneralString4 = this.sam_track_id;
        if (asn1GeneralString4 != null) {
            int encode7 = asn1GeneralString4.encode(asn1BerEncodeBuffer, true);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode7);
        }
        Asn1GeneralString asn1GeneralString5 = this.sam_type_name;
        if (asn1GeneralString5 != null) {
            int encode8 = asn1GeneralString5.encode(asn1BerEncodeBuffer, true);
            i = i + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode8);
        }
        int encode9 = this.sam_flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode9) + i + encode9;
        int encode10 = this.sam_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode10) + encodeTagAndLength + encode10;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
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
        this.sam_cksum = null;
    }

    public PA_SAM_CHALLENGE(Asn1Integer asn1Integer, SAMFlags sAMFlags, Asn1GeneralString asn1GeneralString, Asn1GeneralString asn1GeneralString2, Asn1GeneralString asn1GeneralString3, Asn1GeneralString asn1GeneralString4, Asn1GeneralString asn1GeneralString5, Asn1OctetString asn1OctetString, Asn1Integer asn1Integer2, Checksum checksum) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_type_name = asn1GeneralString;
        this.sam_track_id = asn1GeneralString2;
        this.sam_challenge_label = asn1GeneralString3;
        this.sam_challenge = asn1GeneralString4;
        this.sam_response_prompt = asn1GeneralString5;
        this.sam_pk_for_sad = asn1OctetString;
        this.sam_nonce = asn1Integer2;
        this.sam_cksum = checksum;
    }

    public PA_SAM_CHALLENGE(Asn1Integer asn1Integer, SAMFlags sAMFlags) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
    }

    public PA_SAM_CHALLENGE() {
    }

    public PA_SAM_CHALLENGE(long j, SAMFlags sAMFlags) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
    }
}
