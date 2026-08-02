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
public class GostOpaqueSpecific extends Asn1Type {
    public GostAccLength accLength;
    public Asn1Integer currentIvOffset;
    public GostKeyTransportKExp15 initKey;
    public Asn1Integer mixMode;

    public GostOpaqueSpecific(GostKeyTransportKExp15 gostKeyTransportKExp15, long j, long j2, GostAccLength gostAccLength) {
        this.initKey = gostKeyTransportKExp15;
        this.mixMode = new Asn1Integer(j);
        this.currentIvOffset = new Asn1Integer(j2);
        this.accLength = gostAccLength;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            GostKeyTransportKExp15 gostKeyTransportKExp15 = new GostKeyTransportKExp15();
            this.initKey = gostKeyTransportKExp15;
            gostKeyTransportKExp15.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.mixMode = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.currentIvOffset = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GostAccLength gostAccLength = new GostAccLength();
        this.accLength = gostAccLength;
        gostAccLength.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.mixMode.encode(asn1BerEncodeBuffer, true) + this.currentIvOffset.encode(asn1BerEncodeBuffer, true) + this.accLength.encode(asn1BerEncodeBuffer, true);
        GostKeyTransportKExp15 gostKeyTransportKExp15 = this.initKey;
        if (gostKeyTransportKExp15 != null) {
            encode += gostKeyTransportKExp15.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.initKey = null;
        this.mixMode = null;
        this.currentIvOffset = null;
        this.accLength = null;
    }

    public GostOpaqueSpecific(GostKeyTransportKExp15 gostKeyTransportKExp15, Asn1Integer asn1Integer, Asn1Integer asn1Integer2, GostAccLength gostAccLength) {
        this.initKey = gostKeyTransportKExp15;
        this.mixMode = asn1Integer;
        this.currentIvOffset = asn1Integer2;
        this.accLength = gostAccLength;
    }

    public GostOpaqueSpecific(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, GostAccLength gostAccLength) {
        this.mixMode = asn1Integer;
        this.currentIvOffset = asn1Integer2;
        this.accLength = gostAccLength;
    }

    public GostOpaqueSpecific() {
    }

    public GostOpaqueSpecific(long j, long j2, GostAccLength gostAccLength) {
        this.mixMode = new Asn1Integer(j);
        this.currentIvOffset = new Asn1Integer(j2);
        this.accLength = gostAccLength;
    }
}
