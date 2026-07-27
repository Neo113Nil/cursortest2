package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class SN {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f27536z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27537a;

    /* renamed from: b, reason: collision with root package name */
    public final T2 f27538b;

    /* renamed from: c, reason: collision with root package name */
    public final C2478Aq f27539c;

    /* renamed from: d, reason: collision with root package name */
    public final C2602Ie f27540d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3404jB f27541e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3404jB f27542f;

    /* renamed from: g, reason: collision with root package name */
    public final C3314ha f27543g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f27544h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C2777Sj f27545j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27546k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27547l;

    /* renamed from: m, reason: collision with root package name */
    public final HO f27548m;

    /* renamed from: n, reason: collision with root package name */
    public final GO f27549n;

    /* renamed from: o, reason: collision with root package name */
    public final long f27550o;

    /* renamed from: p, reason: collision with root package name */
    public final long f27551p;

    /* renamed from: q, reason: collision with root package name */
    public final int f27552q;

    /* renamed from: r, reason: collision with root package name */
    public final int f27553r;

    /* renamed from: s, reason: collision with root package name */
    public final int f27554s;

    /* renamed from: t, reason: collision with root package name */
    public final int f27555t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27556u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27557v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27558w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f27559x;

    /* renamed from: y, reason: collision with root package name */
    public final NN f27560y;

    static {
        String str = AbstractC3548lu.f32613a;
        String f6 = AbstractC3035cL.f(Build.DEVICE);
        if (f6.contains("emulator") || f6.contains("emu64a") || f6.contains("emu64x")) {
            return;
        }
        f6.contains("generic");
    }

    public SN(Context context, Rx rx) {
        C2478Aq c2478Aq = new C2478Aq(16, rx);
        C2602Ie c2602Ie = new C2602Ie(context, 2);
        C3042ca c3042ca = new C3042ca(context, false);
        C3307hK c3307hK = C3307hK.f31226u;
        C3314ha c3314ha = new C3314ha(context, 4);
        context.getClass();
        this.f27537a = context;
        this.f27539c = c2478Aq;
        this.f27540d = c2602Ie;
        this.f27541e = c3042ca;
        this.f27542f = c3307hK;
        this.f27543g = c3314ha;
        String str = AbstractC3548lu.f32613a;
        Looper myLooper = Looper.myLooper();
        this.f27544h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f27545j = C2777Sj.f27609b;
        this.f27546k = 1;
        this.f27547l = true;
        this.f27548m = HO.f25362c;
        this.f27549n = GO.f25152b;
        this.f27560y = new NN(AbstractC3548lu.u(20L), AbstractC3548lu.u(500L));
        this.f27538b = T2.f27691y;
        this.f27550o = 500L;
        this.f27551p = com.anythink.basead.exoplayer.i.a.f8040f;
        this.f27552q = 600000;
        this.f27553r = Integer.MAX_VALUE;
        this.f27554s = Integer.MAX_VALUE;
        this.f27555t = 600000;
        this.f27556u = true;
        this.f27558w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = QN.f27148a;
        }
        this.f27559x = true;
    }
}
