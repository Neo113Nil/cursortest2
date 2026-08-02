package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;

/* loaded from: classes4.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {
    private Throwable cause;

    public ExtCertPathValidatorException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
