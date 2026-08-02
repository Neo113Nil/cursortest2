package com.yandex.plus.core.network.error;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class l extends IOException {
    public final k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Throwable th) {
        super(th);
        kVar.getClass();
        this.a = kVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String message;
        Throwable cause = getCause();
        k kVar = this.a;
        if (cause == null || (message = cause.getMessage()) == null) {
            return String.valueOf(kVar);
        }
        return kVar + "; exceptionMessage = " + message;
    }
}
