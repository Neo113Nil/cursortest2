package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class EN {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f25344A = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25345a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f25346b;

    /* renamed from: c, reason: collision with root package name */
    public final C4201xq f25347c;

    /* renamed from: d, reason: collision with root package name */
    public final C2572Fe f25348d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3254gB f25349e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3254gB f25350f;

    /* renamed from: g, reason: collision with root package name */
    public final C3538la f25351g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f25352h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C2764Qj f25353j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25354k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f25355l;

    /* renamed from: m, reason: collision with root package name */
    public final C4020uO f25356m;

    /* renamed from: n, reason: collision with root package name */
    public final C3966tO f25357n;

    /* renamed from: o, reason: collision with root package name */
    public final long f25358o;

    /* renamed from: p, reason: collision with root package name */
    public final long f25359p;

    /* renamed from: q, reason: collision with root package name */
    public final int f25360q;

    /* renamed from: r, reason: collision with root package name */
    public final int f25361r;

    /* renamed from: s, reason: collision with root package name */
    public final int f25362s;

    /* renamed from: t, reason: collision with root package name */
    public final int f25363t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f25364u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25365v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25366w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25367x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f25368y;

    /* renamed from: z, reason: collision with root package name */
    public final C4289zN f25369z;

    static {
        String str = AbstractC3182eu.f30782a;
        String f2 = AbstractC3066cl.f(Build.DEVICE);
        if (f2.contains("emulator") || f2.contains("emu64a") || f2.contains("emu64x")) {
            return;
        }
        f2.contains("generic");
    }

    public EN(Context context, Qx qx) {
        C4201xq c4201xq = new C4201xq(16, qx);
        C2572Fe c2572Fe = new C2572Fe(context, 2);
        C3216fa c3216fa = new C3216fa(context, false);
        XJ xj = XJ.f29292u;
        C3538la c3538la = new C3538la(context, 4);
        context.getClass();
        this.f25345a = context;
        this.f25347c = c4201xq;
        this.f25348d = c2572Fe;
        this.f25349e = c3216fa;
        this.f25350f = xj;
        this.f25351g = c3538la;
        String str = AbstractC3182eu.f30782a;
        Looper myLooper = Looper.myLooper();
        this.f25352h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f25353j = C2764Qj.f27843b;
        this.f25354k = 1;
        this.f25355l = true;
        this.f25356m = C4020uO.f35307c;
        this.f25357n = C3966tO.f35062b;
        this.f25369z = new C4289zN(AbstractC3182eu.u(20L), AbstractC3182eu.u(500L));
        this.f25346b = V2.f28873y;
        this.f25358o = 500L;
        this.f25359p = com.anythink.basead.exoplayer.i.a.f8669f;
        this.f25360q = 600000;
        this.f25361r = Integer.MAX_VALUE;
        this.f25362s = Integer.MAX_VALUE;
        this.f25363t = 600000;
        this.f25364u = true;
        this.f25366w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = CN.f24871a;
        }
        this.f25367x = true;
        this.f25368y = true;
    }
}
