package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class KRB_SAFE_BODY extends Asn1Type {
    public HostAddress r_address;
    public HostAddress s_address;
    public Asn1Integer seq_number;
    public KerberosTime timestamp;
    public Asn1Integer usec;
    public Asn1OctetString user_data;

    public KRB_SAFE_BODY(byte[] bArr, String str, long j, long j2, HostAddress hostAddress, HostAddress hostAddress2) {
        this.user_data = new Asn1OctetString(bArr);
        this.timestamp = new KerberosTime(str);
        this.usec = new Asn1Integer(j);
        this.seq_number = new Asn1Integer(j2);
        this.s_address = hostAddress;
        this.r_address = hostAddress2;
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
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.user_data = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.timestamp = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.usec = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.seq_number = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        HostAddress hostAddress = new HostAddress();
        this.s_address = hostAddress;
        hostAddress.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        int encode2 = this.s_address.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode2) + i + encode2;
        Asn1Integer asn1Integer = this.seq_number;
        if (asn1Integer != null) {
            int encode3 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode3);
        }
        Asn1Integer asn1Integer2 = this.usec;
        if (asn1Integer2 != null) {
            int encode4 = asn1Integer2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode4);
        }
        KerberosTime kerberosTime = this.timestamp;
        if (kerberosTime != null) {
            int encode5 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5);
        }
        int encode6 = this.user_data.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode6) + encodeTagAndLength + encode6;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength2) + encodeTagAndLength2 : encodeTagAndLength2;
    }

    public void init() {
        this.user_data = null;
        this.timestamp = null;
        this.usec = null;
        this.seq_number = null;
        this.s_address = null;
        this.r_address = null;
    }

    public KRB_SAFE_BODY(Asn1OctetString asn1OctetString, KerberosTime kerberosTime, Asn1Integer asn1Integer, Asn1Integer asn1Integer2, HostAddress hostAddress, HostAddress hostAddress2) {
        this.user_data = asn1OctetString;
        this.timestamp = kerberosTime;
        this.usec = asn1Integer;
        this.seq_number = asn1Integer2;
        this.s_address = hostAddress;
        this.r_address = hostAddress2;
    }

    public KRB_SAFE_BODY(Asn1OctetString asn1OctetString, HostAddress hostAddress) {
        this.user_data = asn1OctetString;
        this.s_address = hostAddress;
    }

    public KRB_SAFE_BODY() {
    }

    public KRB_SAFE_BODY(byte[] bArr, HostAddress hostAddress) {
        this.user_data = new Asn1OctetString(bArr);
        this.s_address = hostAddress;
    }
}
