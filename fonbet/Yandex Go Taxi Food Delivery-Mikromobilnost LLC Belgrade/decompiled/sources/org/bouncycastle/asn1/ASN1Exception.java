package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    public ASN1Exception(RuntimeException runtimeException, String str) {
        super(str);
        this.cause = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
