package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PKIMessage extends Asn1Type {
    public PKIBody body;
    public PKIMessage_extraCerts extraCerts;
    public PKIHeader header;
    public PKIProtection protection;

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, PKIProtection pKIProtection, PKIMessage_extraCerts pKIMessage_extraCerts) {
        this.header = pKIHeader;
        this.body = pKIBody;
        this.protection = pKIProtection;
        this.extraCerts = pKIMessage_extraCerts;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIHeader pKIHeader = new PKIHeader();
        this.header = pKIHeader;
        pKIHeader.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 32, 1) && !peekTag.equals((short) 128, (short) 32, 2) && !peekTag.equals((short) 128, (short) 32, 3) && !peekTag.equals((short) 128, (short) 32, 4) && !peekTag.equals((short) 128, (short) 32, 5) && !peekTag.equals((short) 128, (short) 32, 6) && !peekTag.equals((short) 128, (short) 32, 7) && !peekTag.equals((short) 128, (short) 32, 8) && !peekTag.equals((short) 128, (short) 32, 9) && !peekTag.equals((short) 128, (short) 32, 10) && !peekTag.equals((short) 128, (short) 32, 11) && !peekTag.equals((short) 128, (short) 32, 12) && !peekTag.equals((short) 128, (short) 32, 13) && !peekTag.equals((short) 128, (short) 32, 14) && !peekTag.equals((short) 128, (short) 32, 15) && !peekTag.equals((short) 128, (short) 32, 16) && !peekTag.equals((short) 128, (short) 32, 17) && !peekTag.equals((short) 128, (short) 32, 18) && !peekTag.equals((short) 128, (short) 32, 19) && !peekTag.equals((short) 128, (short) 32, 20) && !peekTag.equals((short) 128, (short) 32, 21) && !peekTag.equals((short) 128, (short) 32, 22) && !peekTag.equals((short) 128, (short) 32, 23)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIBody pKIBody = new PKIBody();
        this.body = pKIBody;
        pKIBody.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            PKIProtection pKIProtection = new PKIProtection();
            this.protection = pKIProtection;
            pKIProtection.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            PKIMessage_extraCerts pKIMessage_extraCerts = new PKIMessage_extraCerts();
            this.extraCerts = pKIMessage_extraCerts;
            pKIMessage_extraCerts.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 0, (short) 32, 16) || peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PKIMessage_extraCerts pKIMessage_extraCerts = this.extraCerts;
        int encode = pKIMessage_extraCerts != null ? pKIMessage_extraCerts.encode(asn1BerEncodeBuffer, true) : 0;
        PKIProtection pKIProtection = this.protection;
        if (pKIProtection != null) {
            int encode2 = pKIProtection.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        int encode3 = this.header.encode(asn1BerEncodeBuffer, true) + this.body.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.header = null;
        this.body = null;
        this.protection = null;
        this.extraCerts = null;
    }

    public PKIMessage() {
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody) {
        this.header = pKIHeader;
        this.body = pKIBody;
    }
}
