package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.g7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3250g7 implements InterfaceC3358i7 {

    /* renamed from: K, reason: collision with root package name */
    public static C3250g7 f31291K;

    /* renamed from: A, reason: collision with root package name */
    public final EnumC2983b8 f31292A;

    /* renamed from: B, reason: collision with root package name */
    public final V2 f31293B;

    /* renamed from: D, reason: collision with root package name */
    public final E7 f31295D;

    /* renamed from: E, reason: collision with root package name */
    public final F0 f31296E;

    /* renamed from: F, reason: collision with root package name */
    public final Qx f31297F;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f31300I;
    public volatile boolean J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31301n;

    /* renamed from: u, reason: collision with root package name */
    public final C2590Gf f31302u;

    /* renamed from: v, reason: collision with root package name */
    public final Xw f31303v;

    /* renamed from: w, reason: collision with root package name */
    public final C3025bx f31304w;

    /* renamed from: x, reason: collision with root package name */
    public final C4057v7 f31305x;

    /* renamed from: y, reason: collision with root package name */
    public final Cw f31306y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f31307z;

    /* renamed from: G, reason: collision with root package name */
    public volatile long f31298G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f31299H = new Object();

    /* renamed from: C, reason: collision with root package name */
    public final CountDownLatch f31294C = new CountDownLatch(1);

    public C3250g7(Context context, Cw cw, C2590Gf c2590Gf, Xw xw, C3025bx c3025bx, C4057v7 c4057v7, ExecutorService executorService, Bw bw, EnumC2983b8 enumC2983b8, E7 e72, F0 f02, Qx qx) {
        this.J = false;
        this.f31301n = context;
        this.f31306y = cw;
        this.f31302u = c2590Gf;
        this.f31303v = xw;
        this.f31304w = c3025bx;
        this.f31305x = c4057v7;
        this.f31307z = executorService;
        this.f31292A = enumC2983b8;
        this.f31295D = e72;
        this.f31296E = f02;
        this.f31297F = qx;
        this.J = false;
        this.f31293B = new V2(this, bw);
    }

    public static synchronized C3250g7 m(Context context, ExecutorService executorService, Ew ew, boolean z6) {
        C3250g7 c3250g7;
        synchronized (C3250g7.class) {
            try {
                if (f31291K == null) {
                    Cw a9 = Cw.a(context, executorService, z6);
                    C3680o7 k9 = C3680o7.k(context);
                    E7 a10 = E7.a(context, executorService);
                    F0 f02 = new F0();
                    Qx qx = new Qx(7);
                    C2590Gf c2590Gf = new C2590Gf(context, executorService, a9, new Hw());
                    l3.m g9 = com.bumptech.glide.d.g(new Ts(4, c2590Gf), executorService);
                    g9.b(executorService, new C4201xq(9, c2590Gf));
                    c2590Gf.f25833x = g9;
                    C3949t7 c3949t7 = new C3949t7(context);
                    C4057v7 c4057v7 = new C4057v7(ew, c2590Gf, new C7(context, c3949t7), c3949t7, k9, a10, f02, qx);
                    EnumC2983b8 r9 = AbstractC3066cl.r(context, a9);
                    Bw bw = new Bw();
                    C3250g7 c3250g72 = new C3250g7(context, a9, new C2590Gf(context, r9), new Xw(context, r9, new C3680o7(7, a9), ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.h3)).booleanValue()), new C3025bx(context, c4057v7, a9, bw, false), c4057v7, executorService, bw, r9, a10, f02, qx);
                    f31291K = c3250g72;
                    c3250g72.j();
                    f31291K.k();
                }
                c3250g7 = f31291K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3250g7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void a(int i, int i4, int i6) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ud)).booleanValue() || (displayMetrics = this.f31301n.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f2 = i;
        float f9 = displayMetrics.density;
        float f10 = i4;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f2 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain);
        obtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f2 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain2);
        obtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i6, 1, f2 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void b(MotionEvent motionEvent) {
        Xw b9 = this.f31304w.b();
        if (b9 != null) {
            try {
                b9.i(motionEvent);
            } catch (C2971ax e9) {
                this.f31306y.c(e9.f29942n, -1L, e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String c(Context context, String str, View view, Activity activity) {
        E7 e72 = this.f31295D;
        if (e72.f25306d) {
            e72.f25304b = System.currentTimeMillis();
        }
        F0 f02 = this.f31296E;
        f02.f25464h = f02.f25463g;
        f02.f25463g = SystemClock.uptimeMillis();
        k();
        Xw b9 = this.f31304w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String h3 = b9.h(context, str, view, activity);
        this.f31306y.e(5000, System.currentTimeMillis() - currentTimeMillis, null, h3, null);
        return h3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        this.f31297F.f27895u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String f(Context context) {
        E7 e72 = this.f31295D;
        if (e72.f25306d) {
            e72.f25304b = System.currentTimeMillis();
        }
        F0 f02 = this.f31296E;
        f02.f25458b = f02.f25457a;
        f02.f25457a = SystemClock.uptimeMillis();
        k();
        Xw b9 = this.f31304w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d9 = b9.d(context);
        this.f31306y.e(5001, System.currentTimeMillis() - currentTimeMillis, null, d9, null);
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void g(View view) {
        this.f31305x.f35430c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String i(Context context, View view, Activity activity) {
        E7 e72 = this.f31295D;
        if (e72.f25306d) {
            e72.f25304b = System.currentTimeMillis();
        }
        this.f31296E.b(context, view);
        k();
        Xw b9 = this.f31304w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String f2 = b9.f(context, view, activity);
        this.f31306y.e(5002, System.currentTimeMillis() - currentTimeMillis, null, f2, null);
        return f2;
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        Uw n9 = n();
        if (n9 == null) {
            this.f31306y.b(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f31304w.a(n9)) {
            this.J = true;
            this.f31294C.countDown();
        }
    }

    public final void k() {
        Uw uw;
        if (this.f31300I) {
            return;
        }
        synchronized (this.f31299H) {
            try {
                if (!this.f31300I) {
                    if ((System.currentTimeMillis() / 1000) - this.f31298G < com.anythink.expressad.f.a.b.f19188P) {
                        return;
                    }
                    C3025bx c3025bx = this.f31304w;
                    synchronized (c3025bx.f30163g) {
                        try {
                            Xw xw = c3025bx.f30162f;
                            uw = xw != null ? (Uw) xw.f29385v : null;
                        } finally {
                        }
                    }
                    if ((uw == null || uw.f28840a.C() - (System.currentTimeMillis() / 1000) < com.anythink.expressad.f.a.b.f19188P) && AbstractC3066cl.q(this.f31292A)) {
                        this.f31307z.execute(new RunnableC3134e(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        int length;
        boolean i;
        long currentTimeMillis = System.currentTimeMillis();
        Uw n9 = n();
        if (n9 != null) {
            str = n9.f28840a.A();
            str2 = n9.f28840a.B();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.f31301n;
                EnumC2983b8 enumC2983b8 = this.f31292A;
                Cw cw = this.f31306y;
                Ww e9 = AbstractC2659Kg.e(context, enumC2983b8, str, str2, cw);
                byte[] bArr = e9.f29226u;
                if (bArr == null || (length = bArr.length) == 0) {
                    cw.b(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        HK s9 = JK.s(bArr, 0, length);
                        PK pk = PK.f27540a;
                        int i4 = BK.f24648a;
                        C3036c8 D8 = C3036c8.D(s9, PK.f27541b);
                        if (!D8.A().A().isEmpty()) {
                            if (!D8.A().B().isEmpty()) {
                                if (D8.C().a().length != 0) {
                                    Uw n10 = n();
                                    if (n10 != null) {
                                        C3251g8 c3251g8 = n10.f28840a;
                                        if (c3251g8 != null) {
                                            if (D8.A().A().equals(c3251g8.A())) {
                                                if (!D8.A().B().equals(c3251g8.B())) {
                                                }
                                            }
                                        }
                                    }
                                    V2 v22 = this.f31293B;
                                    int i6 = e9.f29227v;
                                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33024f3)).booleanValue()) {
                                        i = this.f31302u.i(D8, v22);
                                    } else if (i6 == 3) {
                                        i = this.f31303v.g(D8);
                                    } else {
                                        if (i6 == 4) {
                                            i = this.f31303v.e(D8, v22);
                                        }
                                        this.f31306y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (i) {
                                        Uw n11 = n();
                                        if (n11 != null) {
                                            if (this.f31304w.a(n11)) {
                                                this.J = true;
                                            }
                                            this.f31298G = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f31306y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f31306y.b(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f31306y.b(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                this.f31294C.countDown();
                throw th;
            }
        } catch (C3318hL e10) {
            this.f31306y.c(4002, System.currentTimeMillis() - currentTimeMillis, e10);
        }
        this.f31294C.countDown();
    }

    public final Uw n() {
        if (AbstractC3066cl.q(this.f31292A)) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33024f3)).booleanValue()) {
                Xw xw = this.f31303v;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (Xw.f29382y) {
                    try {
                        C3251g8 r9 = xw.r(1);
                        if (r9 == null) {
                            xw.p(4022, currentTimeMillis);
                            return null;
                        }
                        File j6 = xw.j(r9.A());
                        File file = new File(j6, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(j6, "pcam");
                        }
                        File file2 = new File(j6, "pcbc");
                        File file3 = new File(j6, "pcopt");
                        xw.p(5016, currentTimeMillis);
                        return new Uw(r9, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C2590Gf c2590Gf = this.f31302u;
            C3251g8 q8 = c2590Gf.q(1);
            if (q8 != null) {
                String A9 = q8.A();
                File c9 = MA.c(A9, "pcam.jar", c2590Gf.u());
                if (!c9.exists()) {
                    c9 = MA.c(A9, "pcam", c2590Gf.u());
                }
                return new Uw(q8, c9, MA.c(A9, "pcbc", c2590Gf.u()), MA.c(A9, "pcopt", c2590Gf.u()));
            }
        }
        return null;
    }
}
