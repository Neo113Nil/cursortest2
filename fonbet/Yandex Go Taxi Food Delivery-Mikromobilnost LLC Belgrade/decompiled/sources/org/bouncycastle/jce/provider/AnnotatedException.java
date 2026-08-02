package org.bouncycastle.jce.provider;

/* loaded from: classes4.dex */
public class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str, Exception exc) {
        super(str);
        this._underlyingException = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this._underlyingException;
    }
}
