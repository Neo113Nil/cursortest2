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
public class PA_ENC_SAM_RESPONSE_ENC extends Asn1Type {
    public Asn1Integer sam_nonce;
    public Asn1GeneralString sam_passcode;
    public KerberosTime sam_timestamp;
    public Asn1Integer sam_usec;

    public PA_ENC_SAM_RESPONSE_ENC(long j, String str, long j2, String str2) {
        this.sam_nonce = new Asn1Integer(j);
        this.sam_timestamp = new KerberosTime(str);
        this.sam_usec = new Asn1Integer(j2);
        this.sam_passcode = new Asn1GeneralString(str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.sam_nonce = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.sam_timestamp = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.sam_usec = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1GeneralString asn1GeneralString = new Asn1GeneralString();
            this.sam_passcode = asn1GeneralString;
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
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
        int i;
        Asn1GeneralString asn1GeneralString = this.sam_passcode;
        if (asn1GeneralString != null) {
            int encode = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer = this.sam_usec;
        if (asn1Integer != null) {
            int encode2 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        KerberosTime kerberosTime = this.sam_timestamp;
        if (kerberosTime != null) {
            int encode3 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        Asn1Integer asn1Integer2 = this.sam_nonce;
        if (asn1Integer2 != null) {
            int encode4 = asn1Integer2.encode(asn1BerEncodeBuffer, true);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.sam_nonce = null;
        this.sam_timestamp = null;
        this.sam_usec = null;
        this.sam_passcode = null;
    }

    public PA_ENC_SAM_RESPONSE_ENC(Asn1Integer asn1Integer, KerberosTime kerberosTime, Asn1Integer asn1Integer2, Asn1GeneralString asn1GeneralString) {
        this.sam_nonce = asn1Integer;
        this.sam_timestamp = kerberosTime;
        this.sam_usec = asn1Integer2;
        this.sam_passcode = asn1GeneralString;
    }

    public PA_ENC_SAM_RESPONSE_ENC() {
    }
}
