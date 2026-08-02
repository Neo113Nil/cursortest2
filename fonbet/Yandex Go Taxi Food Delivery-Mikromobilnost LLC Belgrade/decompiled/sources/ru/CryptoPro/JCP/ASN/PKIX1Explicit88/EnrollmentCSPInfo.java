package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class EnrollmentCSPInfo extends Asn1Type {
    public Asn1BMPString name;
    public Asn1Integer provType;
    public Asn1BitString signature;

    public EnrollmentCSPInfo(long j, String str, Asn1BitString asn1BitString) {
        this.provType = new Asn1Integer(j);
        this.name = new Asn1BMPString(str);
        this.signature = asn1BitString;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.provType = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 30, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BMPString asn1BMPString = new Asn1BMPString();
        this.name = asn1BMPString;
        asn1BMPString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.name.getLength() < 1 || this.name.getLength() > 32768) {
            throw new Asn1ConsVioException("name.getLength()", this.name.getLength());
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BitString asn1BitString = new Asn1BitString();
        this.signature = asn1BitString;
        asn1BitString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 30) || peekTag.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.signature.encode(asn1BerEncodeBuffer, true);
        if (this.name.getLength() < 1 || this.name.getLength() > 32768) {
            throw new Asn1ConsVioException("name.getLength()", this.name.getLength());
        }
        int encode2 = this.provType.encode(asn1BerEncodeBuffer, true) + this.name.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.provType = null;
        this.name = null;
        this.signature = null;
    }

    public EnrollmentCSPInfo(Asn1Integer asn1Integer, Asn1BMPString asn1BMPString, Asn1BitString asn1BitString) {
        this.provType = asn1Integer;
        this.name = asn1BMPString;
        this.signature = asn1BitString;
    }

    public EnrollmentCSPInfo() {
    }
}
