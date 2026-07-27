package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class EN {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f24583A = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24584a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f24585b;

    /* renamed from: c, reason: collision with root package name */
    public final C4178xq f24586c;

    /* renamed from: d, reason: collision with root package name */
    public final C2552Fe f24587d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3231gB f24588e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3231gB f24589f;

    /* renamed from: g, reason: collision with root package name */
    public final C3515la f24590g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f24591h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C2744Qj f24592j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24593k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24594l;

    /* renamed from: m, reason: collision with root package name */
    public final C3997uO f24595m;

    /* renamed from: n, reason: collision with root package name */
    public final C3943tO f24596n;

    /* renamed from: o, reason: collision with root package name */
    public final long f24597o;

    /* renamed from: p, reason: collision with root package name */
    public final long f24598p;

    /* renamed from: q, reason: collision with root package name */
    public final int f24599q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24600r;

    /* renamed from: s, reason: collision with root package name */
    public final int f24601s;

    /* renamed from: t, reason: collision with root package name */
    public final int f24602t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24604v;

    /* renamed from: w, reason: collision with root package name */
    public final String f24605w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f24606x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f24607y;

    /* renamed from: z, reason: collision with root package name */
    public final C4266zN f24608z;

    static {
        String str = AbstractC3159eu.f29993a;
        String f3 = AbstractC3043cl.f(Build.DEVICE);
        if (f3.contains("emulator") || f3.contains("emu64a") || f3.contains("emu64x")) {
            return;
        }
        f3.contains("generic");
    }

    public EN(Context context, Qx qx) {
        C4178xq c4178xq = new C4178xq(16, qx);
        C2552Fe c2552Fe = new C2552Fe(context, 2);
        C3193fa c3193fa = new C3193fa(context, false);
        XJ xj = XJ.f28512u;
        C3515la c3515la = new C3515la(context, 4);
        context.getClass();
        this.f24584a = context;
        this.f24586c = c4178xq;
        this.f24587d = c2552Fe;
        this.f24588e = c3193fa;
        this.f24589f = xj;
        this.f24590g = c3515la;
        String str = AbstractC3159eu.f29993a;
        Looper myLooper = Looper.myLooper();
        this.f24591h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f24592j = C2744Qj.f27058b;
        this.f24593k = 1;
        this.f24594l = true;
        this.f24595m = C3997uO.f34533c;
        this.f24596n = C3943tO.f34276b;
        this.f24608z = new C4266zN(AbstractC3159eu.u(20L), AbstractC3159eu.u(500L));
        this.f24585b = V2.f28076y;
        this.f24597o = 500L;
        this.f24598p = com.anythink.basead.exoplayer.i.a.f7883f;
        this.f24599q = 600000;
        this.f24600r = Integer.MAX_VALUE;
        this.f24601s = Integer.MAX_VALUE;
        this.f24602t = 600000;
        this.f24603u = true;
        this.f24605w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = CN.f24108a;
        }
        this.f24606x = true;
        this.f24607y = true;
    }
}
