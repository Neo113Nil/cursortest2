package org.bouncycastle.operator;

/* loaded from: classes4.dex */
public class RuntimeOperatorException extends RuntimeException {
    private Throwable cause;

    public RuntimeOperatorException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
