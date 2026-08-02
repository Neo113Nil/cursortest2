package ru.CryptoPro.JCP.ASN.CertificateExtensions;

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
public class GeneralSubtree extends Asn1Type {
    public GeneralName base;
    public BaseDistance maximum;
    public BaseDistance minimum;

    public GeneralSubtree(GeneralName generalName, long j, long j2) {
        this.base = generalName;
        this.minimum = new BaseDistance(j);
        this.maximum = new BaseDistance(j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 0, 1) && !peekTag.equals((short) 128, (short) 0, 2) && !peekTag.equals((short) 128, (short) 32, 3) && !peekTag.equals((short) 128, (short) 32, 4) && !peekTag.equals((short) 128, (short) 32, 5) && !peekTag.equals((short) 128, (short) 0, 6) && !peekTag.equals((short) 128, (short) 0, 7) && !peekTag.equals((short) 128, (short) 0, 8)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GeneralName generalName = new GeneralName();
        this.base = generalName;
        generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            BaseDistance baseDistance = new BaseDistance();
            this.minimum = baseDistance;
            baseDistance.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            BaseDistance baseDistance2 = new BaseDistance();
            this.maximum = baseDistance2;
            baseDistance2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 128, (short) 0, 0) || peekTag2.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        BaseDistance baseDistance = this.maximum;
        if (baseDistance != null) {
            int encode = baseDistance.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        } else {
            i = 0;
        }
        if (!this.minimum.equals(0L)) {
            int encode2 = this.minimum.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.base.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.base = null;
        this.minimum = new BaseDistance(0L);
        this.maximum = null;
    }

    public GeneralSubtree(GeneralName generalName, BaseDistance baseDistance, BaseDistance baseDistance2) {
        this.base = generalName;
        this.minimum = baseDistance;
        this.maximum = baseDistance2;
    }

    public GeneralSubtree(GeneralName generalName) {
        this.base = generalName;
        this.minimum = new BaseDistance(0L);
    }

    public GeneralSubtree() {
        this.minimum = new BaseDistance(0L);
    }
}
