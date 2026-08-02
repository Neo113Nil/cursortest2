package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_KeyExport;

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
public class GostAccLength extends Asn1Type {
    public Asn1Integer accCipherLen;
    public Asn1Integer commAccLen;
    public Asn1Integer commFinal;
    public Asn1Integer encryptionsOnBaseKey;

    public GostAccLength(long j, long j2, long j3, long j4) {
        this.accCipherLen = new Asn1Integer(j);
        this.commAccLen = new Asn1Integer(j2);
        this.commFinal = new Asn1Integer(j3);
        this.encryptionsOnBaseKey = new Asn1Integer(j4);
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
        this.accCipherLen = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.commAccLen = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer3 = new Asn1Integer();
        this.commFinal = asn1Integer3;
        asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer4 = new Asn1Integer();
        this.encryptionsOnBaseKey = asn1Integer4;
        asn1Integer4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 2)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.accCipherLen.encode(asn1BerEncodeBuffer, true) + this.commAccLen.encode(asn1BerEncodeBuffer, true) + this.commFinal.encode(asn1BerEncodeBuffer, true) + this.encryptionsOnBaseKey.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.accCipherLen = null;
        this.commAccLen = null;
        this.commFinal = null;
        this.encryptionsOnBaseKey = null;
    }

    public GostAccLength(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3, Asn1Integer asn1Integer4) {
        this.accCipherLen = asn1Integer;
        this.commAccLen = asn1Integer2;
        this.commFinal = asn1Integer3;
        this.encryptionsOnBaseKey = asn1Integer4;
    }

    public GostAccLength() {
    }
}
