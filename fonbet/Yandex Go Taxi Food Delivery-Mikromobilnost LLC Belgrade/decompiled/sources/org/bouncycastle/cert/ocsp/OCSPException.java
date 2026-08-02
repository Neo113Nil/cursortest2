package org.bouncycastle.cert.ocsp;

/* loaded from: classes4.dex */
public class OCSPException extends Exception {
    private Throwable cause;

    public OCSPException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
