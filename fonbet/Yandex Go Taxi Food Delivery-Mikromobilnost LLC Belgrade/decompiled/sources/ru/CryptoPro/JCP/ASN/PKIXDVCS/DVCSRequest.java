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

/* loaded from: classes4.dex */
public class DVCSRequest extends Asn1Type {
    public Data data;
    public DVCSRequestInformation requestInformation;
    public GeneralName transactionIdentifier;

    public DVCSRequest(DVCSRequestInformation dVCSRequestInformation, Data data, GeneralName generalName) {
        this.requestInformation = dVCSRequestInformation;
        this.data = data;
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
        DVCSRequestInformation dVCSRequestInformation = new DVCSRequestInformation();
        this.requestInformation = dVCSRequestInformation;
        dVCSRequestInformation.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 0, 4) && !peekTag.equals((short) 0, (short) 32, 16) && !peekTag.equals((short) 128, (short) 32, 0)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Data data = new Data();
        this.data = data;
        data.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
            if (peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 0, 1) || peekTag2.equals((short) 128, (short) 0, 2) || peekTag2.equals((short) 128, (short) 32, 3) || peekTag2.equals((short) 128, (short) 32, 4) || peekTag2.equals((short) 128, (short) 32, 5) || peekTag2.equals((short) 128, (short) 0, 6) || peekTag2.equals((short) 128, (short) 0, 7) || peekTag2.equals((short) 128, (short) 0, 8)) {
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
        int encode = this.requestInformation.encode(asn1BerEncodeBuffer, true) + this.data.encode(asn1BerEncodeBuffer, true) + (generalName != null ? generalName.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.requestInformation = null;
        this.data = null;
        this.transactionIdentifier = null;
    }

    public DVCSRequest() {
    }

    public DVCSRequest(DVCSRequestInformation dVCSRequestInformation, Data data) {
        this.requestInformation = dVCSRequestInformation;
        this.data = data;
    }
}
