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
public class ProtectedPart extends Asn1Type {
    public PKIBody body;
    public PKIHeader header;

    public ProtectedPart(PKIHeader pKIHeader, PKIBody pKIBody) {
        this.header = pKIHeader;
        this.body = pKIBody;
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
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.header.encode(asn1BerEncodeBuffer, true) + this.body.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.header = null;
        this.body = null;
    }

    public ProtectedPart() {
    }
}
