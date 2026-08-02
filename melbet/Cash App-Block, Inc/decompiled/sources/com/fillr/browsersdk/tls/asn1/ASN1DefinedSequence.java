package com.fillr.browsersdk.tls.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ASN1DefinedSequence extends ASN1ObjectId {
    public abstract void enqueueValues();

    @Override // com.fillr.browsersdk.tls.asn1.ASN1ObjectId, com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] getPayload() {
        this.valueChain.clear();
        try {
            validate$1();
            enqueueValues();
            return super.getPayload();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public abstract void validate$1();
}
