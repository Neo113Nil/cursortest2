package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class B5 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B5(A5 a52, EnumC4261z5 enumC4261z5, long j9) {
        super(String.format(r0, I5.a("bk3t6gFTc30="), Long.valueOf(a52.f23828n), Long.valueOf(enumC4261z5.f35479n), r5));
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(j9);
        Optional.of(enumC4261z5);
        Optional.of(valueOf);
    }

    public B5(A5 a52, Exception exc) {
        super(String.format(Locale.US, I5.a("bk0="), Long.valueOf(a52.f23828n)), exc);
        Optional.empty();
        Optional.empty();
    }
}
