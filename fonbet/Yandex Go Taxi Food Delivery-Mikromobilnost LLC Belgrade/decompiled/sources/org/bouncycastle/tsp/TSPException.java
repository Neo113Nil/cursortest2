package org.bouncycastle.tsp;

/* loaded from: classes4.dex */
public class TSPException extends Exception {
    Throwable underlyingException;

    public TSPException(String str, Throwable th) {
        super(str);
        this.underlyingException = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.underlyingException;
    }
}
