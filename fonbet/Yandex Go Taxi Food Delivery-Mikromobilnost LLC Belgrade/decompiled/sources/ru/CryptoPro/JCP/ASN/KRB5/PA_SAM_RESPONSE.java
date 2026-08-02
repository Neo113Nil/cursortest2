package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralString;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PA_SAM_RESPONSE extends Asn1Type {
    public EncryptedData sam_enc_key;
    public EncryptedData sam_enc_nonce_or_ts;
    public SAMFlags sam_flags;
    public Asn1Integer sam_nonce;
    public KerberosTime sam_patimestamp;
    public Asn1GeneralString sam_track_id;
    public Asn1Integer sam_type;

    public PA_SAM_RESPONSE(long j, SAMFlags sAMFlags, String str, EncryptedData encryptedData, EncryptedData encryptedData2, long j2, String str2) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_track_id = new Asn1GeneralString(str);
        this.sam_enc_key = encryptedData;
        this.sam_enc_nonce_or_ts = encryptedData2;
        this.sam_nonce = new Asn1Integer(j2);
        this.sam_patimestamp = new KerberosTime(str2);
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
        this.sam_enc_key = encryptedData;
        encryptedData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptedData encryptedData2 = new EncryptedData();
        this.sam_enc_nonce_or_ts = encryptedData2;
        encryptedData2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.sam_nonce = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.sam_patimestamp = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        KerberosTime kerberosTime = this.sam_patimestamp;
        if (kerberosTime != null) {
            int encode = kerberosTime.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode) + encode;
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer = this.sam_nonce;
        if (asn1Integer != null) {
            int encode2 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode2);
        }
        int encode3 = this.sam_enc_nonce_or_ts.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode3) + i + encode3;
        int encode4 = this.sam_enc_key.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode4) + encodeTagAndLength + encode4;
        Asn1GeneralString asn1GeneralString = this.sam_track_id;
        if (asn1GeneralString != null) {
            int encode5 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode5);
        }
        int encode6 = this.sam_flags.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode6) + encodeTagAndLength2 + encode6;
        int encode7 = this.sam_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode7) + encodeTagAndLength3 + encode7;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4 : encodeTagAndLength4;
    }

    public void init() {
        this.sam_type = null;
        this.sam_flags = null;
        this.sam_track_id = null;
        this.sam_enc_key = null;
        this.sam_enc_nonce_or_ts = null;
        this.sam_nonce = null;
        this.sam_patimestamp = null;
    }

    public PA_SAM_RESPONSE(Asn1Integer asn1Integer, SAMFlags sAMFlags, Asn1GeneralString asn1GeneralString, EncryptedData encryptedData, EncryptedData encryptedData2, Asn1Integer asn1Integer2, KerberosTime kerberosTime) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_track_id = asn1GeneralString;
        this.sam_enc_key = encryptedData;
        this.sam_enc_nonce_or_ts = encryptedData2;
        this.sam_nonce = asn1Integer2;
        this.sam_patimestamp = kerberosTime;
    }

    public PA_SAM_RESPONSE(Asn1Integer asn1Integer, SAMFlags sAMFlags, EncryptedData encryptedData, EncryptedData encryptedData2) {
        this.sam_type = asn1Integer;
        this.sam_flags = sAMFlags;
        this.sam_enc_key = encryptedData;
        this.sam_enc_nonce_or_ts = encryptedData2;
    }

    public PA_SAM_RESPONSE() {
    }

    public PA_SAM_RESPONSE(long j, SAMFlags sAMFlags, EncryptedData encryptedData, EncryptedData encryptedData2) {
        this.sam_type = new Asn1Integer(j);
        this.sam_flags = sAMFlags;
        this.sam_enc_key = encryptedData;
        this.sam_enc_nonce_or_ts = encryptedData2;
    }
}
