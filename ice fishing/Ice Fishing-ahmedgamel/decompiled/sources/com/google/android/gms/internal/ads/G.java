package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class G extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(Throwable th) {
        super(D.x.p(new StringBuilder(r1.length() + r0.length() + 11), "Unexpected ", r0, r1), th);
        String simpleName = th.getClass().getSimpleName();
        String concat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
    }
}
