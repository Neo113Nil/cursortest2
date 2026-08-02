package ru.CryptoPro.JCP.ASN.Name_Service;

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
public class NSData extends Asn1Type {
    public Asn1Integer nameType;
    public NameInfo nsName;
    public Asn1Integer reservedPeriod;

    public NSData(NameInfo nameInfo) {
        this.reservedPeriod = new Asn1Integer(0L);
        this.nameType = new Asn1Integer(1L);
        this.nsName = nameInfo;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.reservedPeriod = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.nameType = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        NameInfo nameInfo = new NameInfo();
        this.nsName = nameInfo;
        nameInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.nsName.encode(asn1BerEncodeBuffer, true);
        if (!this.nameType.equals(1L)) {
            int encode2 = this.nameType.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode2);
        }
        if (!this.reservedPeriod.equals(0L)) {
            int encode3 = this.reservedPeriod.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.reservedPeriod = new Asn1Integer(0L);
        this.nameType = new Asn1Integer(1L);
        this.nsName = null;
    }

    public NSData(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, NameInfo nameInfo) {
        this.reservedPeriod = asn1Integer;
        this.nameType = asn1Integer2;
        this.nsName = nameInfo;
    }

    public NSData() {
        this.reservedPeriod = new Asn1Integer(0L);
        this.nameType = new Asn1Integer(1L);
    }

    public NSData(long j, long j2, NameInfo nameInfo) {
        this.reservedPeriod = new Asn1Integer(j);
        this.nameType = new Asn1Integer(j2);
        this.nsName = nameInfo;
    }
}
