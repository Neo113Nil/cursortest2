package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public final class Xp {
    public final Context a;
    public final String b;
    public final C0806vp c;
    public final C0200ap d;
    public final Dp e;
    public final C0642q5 f;
    public final Ap g;
    public final K8 h;
    public final SystemTimeProvider i;
    public final C0698s4 j;
    public final C0785v4 k;
    public final C0286dp l;
    public final C0652qf m;

    public Xp(Context context, String str, C0806vp c0806vp, C0200ap c0200ap) {
        this.a = context;
        this.b = str;
        this.c = c0806vp;
        this.d = c0200ap;
        Dp A = Jb.k().A();
        this.e = A;
        Bp a = A.a();
        this.f = new C0642q5(str);
        this.g = new Ap(context);
        this.h = new K8();
        this.i = new SystemTimeProvider();
        this.j = Jb.k().f();
        this.k = new C0785v4();
        this.l = new C0286dp(new C0835wp(context, str), a, c0806vp);
        this.m = Jb.k().q();
    }
}
