package ru.domesticroots.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    public ASN1Exception(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.cause = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public ASN1Exception(String str) {
        super(str);
    }
}
