package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class D5 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5(C5 c52, B5 b52, long j6) {
        super(String.format(r0, L5.a("bk3t6gFTc30="), Long.valueOf(c52.f24804n), Long.valueOf(b52.f24620n), r5));
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(j6);
        Optional.of(b52);
        Optional.of(valueOf);
    }

    public D5(C5 c52, Exception exc) {
        super(String.format(Locale.US, L5.a("bk0="), Long.valueOf(c52.f24804n)), exc);
        Optional.empty();
        Optional.empty();
    }
}
