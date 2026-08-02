package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes5.dex */
public final class Fp {
    public final Context a;
    public final String b;
    public final C0212dp c;
    public final Io d;
    public final C0443lp e;
    public final C0452m5 f;
    public final C0356ip g;
    public final F8 h;
    public final SystemTimeProvider i;
    public final C0509o4 j;
    public final C0595r4 k;
    public final Lo l;
    public final C0145bf m;
    public final zr n;

    public Fp(Context context, String str, C0212dp c0212dp, Io io2) {
        this.a = context;
        this.b = str;
        this.c = c0212dp;
        this.d = io2;
        C0443lp A = C0747wb.k().A();
        this.e = A;
        C0385jp b = A.b();
        this.f = new C0452m5(str);
        this.g = new C0356ip(context);
        this.h = new F8();
        this.i = new SystemTimeProvider();
        this.j = C0747wb.k().f();
        this.k = new C0595r4();
        this.l = new Lo(new C0241ep(context, str), b, c0212dp);
        this.m = C0747wb.k().q();
        this.n = new zr();
    }
}
