package ru.CryptoPro.JCP.ASN.ExtendedSecurityServices;

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
public class ReceiptRequest extends Asn1Type {
    public ReceiptsFrom receiptsFrom;
    public ReceiptRequest_receiptsTo receiptsTo;
    public ContentIdentifier signedContentIdentifier;

    public ReceiptRequest(byte[] bArr, ReceiptsFrom receiptsFrom, ReceiptRequest_receiptsTo receiptRequest_receiptsTo) {
        this.signedContentIdentifier = new ContentIdentifier(bArr);
        this.receiptsFrom = receiptsFrom;
        this.receiptsTo = receiptRequest_receiptsTo;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ContentIdentifier contentIdentifier = new ContentIdentifier();
        this.signedContentIdentifier = contentIdentifier;
        contentIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 0, 0) && !peekTag.equals((short) 128, (short) 32, 1)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ReceiptsFrom receiptsFrom = new ReceiptsFrom();
        this.receiptsFrom = receiptsFrom;
        receiptsFrom.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        ReceiptRequest_receiptsTo receiptRequest_receiptsTo = new ReceiptRequest_receiptsTo();
        this.receiptsTo = receiptRequest_receiptsTo;
        receiptRequest_receiptsTo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 0, (short) 0, 4) || peekTag2.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.signedContentIdentifier.encode(asn1BerEncodeBuffer, true) + this.receiptsFrom.encode(asn1BerEncodeBuffer, true) + this.receiptsTo.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.signedContentIdentifier = null;
        this.receiptsFrom = null;
        this.receiptsTo = null;
    }

    public ReceiptRequest(ContentIdentifier contentIdentifier, ReceiptsFrom receiptsFrom, ReceiptRequest_receiptsTo receiptRequest_receiptsTo) {
        this.signedContentIdentifier = contentIdentifier;
        this.receiptsFrom = receiptsFrom;
        this.receiptsTo = receiptRequest_receiptsTo;
    }

    public ReceiptRequest() {
    }
}
