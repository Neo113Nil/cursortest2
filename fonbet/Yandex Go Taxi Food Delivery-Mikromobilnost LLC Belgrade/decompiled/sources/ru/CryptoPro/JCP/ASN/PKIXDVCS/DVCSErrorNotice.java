package ru.CryptoPro.JCP.ASN.PKIXDVCS;

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
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIStatusInfo;

/* loaded from: classes4.dex */
public class DVCSErrorNotice extends Asn1Type {
    public GeneralName transactionIdentifier;
    public PKIStatusInfo transactionStatus;

    public DVCSErrorNotice(PKIStatusInfo pKIStatusInfo, GeneralName generalName) {
        this.transactionStatus = pKIStatusInfo;
        this.transactionIdentifier = generalName;
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
        PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
        this.transactionStatus = pKIStatusInfo;
        pKIStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 0, 6) || peekTag.equals((short) 128, (short) 0, 7) || peekTag.equals((short) 128, (short) 0, 8)) {
                GeneralName generalName = new GeneralName();
                this.transactionIdentifier = generalName;
                generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        GeneralName generalName = this.transactionIdentifier;
        int encode = this.transactionStatus.encode(asn1BerEncodeBuffer, true) + (generalName != null ? generalName.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.transactionStatus = null;
        this.transactionIdentifier = null;
    }

    public DVCSErrorNotice() {
    }

    public DVCSErrorNotice(PKIStatusInfo pKIStatusInfo) {
        this.transactionStatus = pKIStatusInfo;
    }
}
