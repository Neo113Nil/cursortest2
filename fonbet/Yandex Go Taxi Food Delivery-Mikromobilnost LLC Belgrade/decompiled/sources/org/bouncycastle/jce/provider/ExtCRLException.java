package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

/* loaded from: classes4.dex */
class ExtCRLException extends CRLException {
    Throwable cause;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
