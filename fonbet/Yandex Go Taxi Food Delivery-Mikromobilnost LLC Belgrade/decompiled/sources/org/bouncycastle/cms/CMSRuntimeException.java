package org.bouncycastle.cms;

/* loaded from: classes4.dex */
public class CMSRuntimeException extends RuntimeException {
    Exception e;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.e;
    }
}
