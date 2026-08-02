package org.bouncycastle.operator;

/* loaded from: classes4.dex */
public abstract class OperatorException extends Exception {
    private Throwable cause;

    public OperatorException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
