package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;

/* loaded from: classes4.dex */
public class SinglePubInfo extends Asn1Type {
    public GeneralName pubLocation;
    public SinglePubInfo_pubMethod pubMethod;

    public SinglePubInfo(long j, GeneralName generalName) {
        this.pubMethod = new SinglePubInfo_pubMethod(j);
        this.pubLocation = generalName;
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
        SinglePubInfo_pubMethod singlePubInfo_pubMethod = new SinglePubInfo_pubMethod();
        this.pubMethod = singlePubInfo_pubMethod;
        singlePubInfo_pubMethod.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 0, 6) || peekTag.equals((short) 128, (short) 0, 7) || peekTag.equals((short) 128, (short) 0, 8)) {
                GeneralName generalName = new GeneralName();
                this.pubLocation = generalName;
                generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 2)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        GeneralName generalName = this.pubLocation;
        int encode = this.pubMethod.encode(asn1BerEncodeBuffer, true) + (generalName != null ? generalName.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.pubMethod = null;
        this.pubLocation = null;
    }

    public SinglePubInfo(SinglePubInfo_pubMethod singlePubInfo_pubMethod, GeneralName generalName) {
        this.pubMethod = singlePubInfo_pubMethod;
        this.pubLocation = generalName;
    }

    public SinglePubInfo(SinglePubInfo_pubMethod singlePubInfo_pubMethod) {
        this.pubMethod = singlePubInfo_pubMethod;
    }

    public SinglePubInfo() {
    }

    public SinglePubInfo(long j) {
        this.pubMethod = new SinglePubInfo_pubMethod(j);
    }
}
