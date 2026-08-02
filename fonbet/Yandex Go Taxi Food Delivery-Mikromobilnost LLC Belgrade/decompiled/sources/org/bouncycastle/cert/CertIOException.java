package org.bouncycastle.cert;

import java.io.IOException;

/* loaded from: classes7.dex */
public class CertIOException extends IOException {
    private Throwable cause;

    public CertIOException(String str, Exception exc) {
        super(str);
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
