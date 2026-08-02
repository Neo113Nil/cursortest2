package com.fillr.browsersdk.tls.asn1;

import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public final class ASN1BitString extends ASN1Value {
    public byte[] bitsBuffer;
    public int numSignificantBits;

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] getPayload() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = this.bitsBuffer;
        byteArrayOutputStream.write((bArr.length * 8) - this.numSignificantBits);
        try {
            byteArrayOutputStream.write(bArr);
        } catch (Exception unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
