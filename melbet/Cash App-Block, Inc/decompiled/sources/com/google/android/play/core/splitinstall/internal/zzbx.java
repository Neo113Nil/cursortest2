package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes4.dex */
public final class zzbx extends RuntimeException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Exception exc;
        synchronized (this) {
            Throwable cause = super.getCause();
            cause.getClass();
            exc = (Exception) cause;
        }
        return exc;
    }
}
