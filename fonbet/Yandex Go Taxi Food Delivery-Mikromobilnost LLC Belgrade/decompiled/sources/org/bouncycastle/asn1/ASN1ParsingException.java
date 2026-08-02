package org.bouncycastle.asn1;

/* loaded from: classes4.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
