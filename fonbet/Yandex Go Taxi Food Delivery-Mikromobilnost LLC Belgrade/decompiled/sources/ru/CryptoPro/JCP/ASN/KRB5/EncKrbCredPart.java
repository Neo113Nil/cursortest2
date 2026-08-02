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
public class EncKrbCredPart extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 29);
    public Asn1Integer nonce;
    public HostAddress r_address;
    public HostAddress s_address;
    public _SeqOfKRB_CRED_INFO ticket_info;
    public KerberosTime timestamp;
    public Asn1Integer usec;

    public EncKrbCredPart(_SeqOfKRB_CRED_INFO _seqofkrb_cred_info, long j, String str, long j2, HostAddress hostAddress, HostAddress hostAddress2) {
        this.ticket_info = _seqofkrb_cred_info;
        this.nonce = new Asn1Integer(j);
        this.timestamp = new KerberosTime(str);
        this.usec = new Asn1Integer(j2);
        this.s_address = hostAddress;
        this.r_address = hostAddress2;
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
        _SeqOfKRB_CRED_INFO _seqofkrb_cred_info = new _SeqOfKRB_CRED_INFO();
        this.ticket_info = _seqofkrb_cred_info;
        _seqofkrb_cred_info.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.nonce = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.timestamp = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.usec = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            HostAddress hostAddress = new HostAddress();
            this.s_address = hostAddress;
            hostAddress.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            HostAddress hostAddress2 = new HostAddress();
            this.r_address = hostAddress2;
            hostAddress2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        HostAddress hostAddress = this.r_address;
        if (hostAddress != null) {
            int encode = hostAddress.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode) + encode;
        } else {
            i = 0;
        }
        HostAddress hostAddress2 = this.s_address;
        if (hostAddress2 != null) {
            int encode2 = hostAddress2.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode2);
        }
        Asn1Integer asn1Integer = this.usec;
        if (asn1Integer != null) {
            int encode3 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode3);
        }
        KerberosTime kerberosTime = this.timestamp;
        if (kerberosTime != null) {
            int encode4 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode4);
        }
        Asn1Integer asn1Integer2 = this.nonce;
        if (asn1Integer2 != null) {
            int encode5 = asn1Integer2.encode(asn1BerEncodeBuffer, true);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5);
        }
        int encode6 = this.ticket_info.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode6) + i + encode6;
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength) + encodeTagAndLength;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
    }

    public void init() {
        this.ticket_info = null;
        this.nonce = null;
        this.timestamp = null;
        this.usec = null;
        this.s_address = null;
        this.r_address = null;
    }

    public EncKrbCredPart(_SeqOfKRB_CRED_INFO _seqofkrb_cred_info, Asn1Integer asn1Integer, KerberosTime kerberosTime, Asn1Integer asn1Integer2, HostAddress hostAddress, HostAddress hostAddress2) {
        this.ticket_info = _seqofkrb_cred_info;
        this.nonce = asn1Integer;
        this.timestamp = kerberosTime;
        this.usec = asn1Integer2;
        this.s_address = hostAddress;
        this.r_address = hostAddress2;
    }

    public EncKrbCredPart(_SeqOfKRB_CRED_INFO _seqofkrb_cred_info) {
        this.ticket_info = _seqofkrb_cred_info;
    }

    public EncKrbCredPart() {
    }
}
