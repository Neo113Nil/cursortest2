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
public final class C3227g7 implements InterfaceC3335i7 {

    /* renamed from: K, reason: collision with root package name */
    public static C3227g7 f30525K;

    /* renamed from: A, reason: collision with root package name */
    public final EnumC2960b8 f30526A;

    /* renamed from: B, reason: collision with root package name */
    public final V2 f30527B;

    /* renamed from: D, reason: collision with root package name */
    public final E7 f30529D;

    /* renamed from: E, reason: collision with root package name */
    public final F0 f30530E;

    /* renamed from: F, reason: collision with root package name */
    public final Qx f30531F;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f30534I;
    public volatile boolean J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30535n;

    /* renamed from: u, reason: collision with root package name */
    public final C2570Gf f30536u;

    /* renamed from: v, reason: collision with root package name */
    public final Xw f30537v;

    /* renamed from: w, reason: collision with root package name */
    public final C3002bx f30538w;

    /* renamed from: x, reason: collision with root package name */
    public final C4034v7 f30539x;

    /* renamed from: y, reason: collision with root package name */
    public final Cw f30540y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f30541z;

    /* renamed from: G, reason: collision with root package name */
    public volatile long f30532G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f30533H = new Object();

    /* renamed from: C, reason: collision with root package name */
    public final CountDownLatch f30528C = new CountDownLatch(1);

    public C3227g7(Context context, Cw cw, C2570Gf c2570Gf, Xw xw, C3002bx c3002bx, C4034v7 c4034v7, ExecutorService executorService, Bw bw, EnumC2960b8 enumC2960b8, E7 e72, F0 f02, Qx qx) {
        this.J = false;
        this.f30535n = context;
        this.f30540y = cw;
        this.f30536u = c2570Gf;
        this.f30537v = xw;
        this.f30538w = c3002bx;
        this.f30539x = c4034v7;
        this.f30541z = executorService;
        this.f30526A = enumC2960b8;
        this.f30529D = e72;
        this.f30530E = f02;
        this.f30531F = qx;
        this.J = false;
        this.f30527B = new V2(this, bw);
    }

    public static synchronized C3227g7 m(Context context, ExecutorService executorService, Ew ew, boolean z3) {
        C3227g7 c3227g7;
        synchronized (C3227g7.class) {
            try {
                if (f30525K == null) {
                    Cw a9 = Cw.a(context, executorService, z3);
                    C3657o7 b9 = C3657o7.b(context);
                    E7 a10 = E7.a(context, executorService);
                    F0 f02 = new F0();
                    Qx qx = new Qx(7);
                    C2570Gf c2570Gf = new C2570Gf(context, executorService, a9, new Hw());
                    j3.m d2 = S0.f.d(new Ts(4, c2570Gf), executorService);
                    d2.b(executorService, new C4178xq(9, c2570Gf));
                    c2570Gf.f25045x = d2;
                    C3926t7 c3926t7 = new C3926t7(context);
                    C4034v7 c4034v7 = new C4034v7(ew, c2570Gf, new C7(context, c3926t7), c3926t7, b9, a10, f02, qx);
                    EnumC2960b8 r9 = AbstractC3043cl.r(context, a9);
                    Bw bw = new Bw();
                    C3227g7 c3227g72 = new C3227g7(context, a9, new C2570Gf(context, r9), new Xw(context, r9, new C3657o7(7, a9), ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32263h3)).booleanValue()), new C3002bx(context, c4034v7, a9, bw, false), c4034v7, executorService, bw, r9, a10, f02, qx);
                    f30525K = c3227g72;
                    c3227g72.j();
                    f30525K.k();
                }
                c3227g7 = f30525K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3227g7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void a(int i, int i6, int i9) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ud)).booleanValue() || (displayMetrics = this.f30535n.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f3 = i;
        float f9 = displayMetrics.density;
        float f10 = i6;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f3 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain);
        obtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f3 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain2);
        obtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i9, 1, f3 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void b(MotionEvent motionEvent) {
        Xw b9 = this.f30538w.b();
        if (b9 != null) {
            try {
                b9.i(motionEvent);
            } catch (C2948ax e9) {
                this.f30540y.c(e9.f29154n, -1L, e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String c(Context context, String str, View view, Activity activity) {
        E7 e72 = this.f30529D;
        if (e72.f24545d) {
            e72.f24543b = System.currentTimeMillis();
        }
        F0 f02 = this.f30530E;
        f02.f24708h = f02.f24707g;
        f02.f24707g = SystemClock.uptimeMillis();
        k();
        Xw b9 = this.f30538w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String h9 = b9.h(context, str, view, activity);
        this.f30540y.e(5000, System.currentTimeMillis() - currentTimeMillis, null, h9, null);
        return h9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        this.f30531F.f27139u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String f(Context context) {
        E7 e72 = this.f30529D;
        if (e72.f24545d) {
            e72.f24543b = System.currentTimeMillis();
        }
        F0 f02 = this.f30530E;
        f02.f24702b = f02.f24701a;
        f02.f24701a = SystemClock.uptimeMillis();
        k();
        Xw b9 = this.f30538w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c9 = b9.c(context);
        this.f30540y.e(5001, System.currentTimeMillis() - currentTimeMillis, null, c9, null);
        return c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void g(View view) {
        this.f30539x.f34667c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String i(Context context, View view, Activity activity) {
        E7 e72 = this.f30529D;
        if (e72.f24545d) {
            e72.f24543b = System.currentTimeMillis();
        }
        this.f30530E.b(context, view);
        k();
        Xw b9 = this.f30538w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String f3 = b9.f(context, view, activity);
        this.f30540y.e(5002, System.currentTimeMillis() - currentTimeMillis, null, f3, null);
        return f3;
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        Uw n9 = n();
        if (n9 == null) {
            this.f30540y.b(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f30538w.a(n9)) {
            this.J = true;
            this.f30528C.countDown();
        }
    }

    public final void k() {
        Uw uw;
        if (this.f30534I) {
            return;
        }
        synchronized (this.f30533H) {
            try {
                if (!this.f30534I) {
                    if ((System.currentTimeMillis() / 1000) - this.f30532G < com.anythink.expressad.f.a.b.f18401P) {
                        return;
                    }
                    C3002bx c3002bx = this.f30538w;
                    synchronized (c3002bx.f29380g) {
                        try {
                            Xw xw = c3002bx.f29379f;
                            uw = xw != null ? (Uw) xw.f28608v : null;
                        } finally {
                        }
                    }
                    if ((uw == null || uw.f28043a.C() - (System.currentTimeMillis() / 1000) < com.anythink.expressad.f.a.b.f18401P) && AbstractC3043cl.q(this.f30526A)) {
                        this.f30541z.execute(new RunnableC3111e(this));
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
        boolean j6;
        long currentTimeMillis = System.currentTimeMillis();
        Uw n9 = n();
        if (n9 != null) {
            str = n9.f28043a.A();
            str2 = n9.f28043a.B();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.f30535n;
                EnumC2960b8 enumC2960b8 = this.f30526A;
                Cw cw = this.f30540y;
                Ww e9 = AbstractC2639Kg.e(context, enumC2960b8, str, str2, cw);
                byte[] bArr = e9.f28446u;
                if (bArr == null || (length = bArr.length) == 0) {
                    cw.b(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        HK s9 = JK.s(bArr, 0, length);
                        PK pk = PK.f26757a;
                        int i = BK.f23877a;
                        C3013c8 D8 = C3013c8.D(s9, PK.f26758b);
                        if (!D8.A().A().isEmpty()) {
                            if (!D8.A().B().isEmpty()) {
                                if (D8.C().a().length != 0) {
                                    Uw n10 = n();
                                    if (n10 != null) {
                                        C3228g8 c3228g8 = n10.f28043a;
                                        if (c3228g8 != null) {
                                            if (D8.A().A().equals(c3228g8.A())) {
                                                if (!D8.A().B().equals(c3228g8.B())) {
                                                }
                                            }
                                        }
                                    }
                                    V2 v22 = this.f30527B;
                                    int i6 = e9.f28447v;
                                    if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f3)).booleanValue()) {
                                        j6 = this.f30536u.j(D8, v22);
                                    } else if (i6 == 3) {
                                        j6 = this.f30537v.g(D8);
                                    } else {
                                        if (i6 == 4) {
                                            j6 = this.f30537v.d(D8, v22);
                                        }
                                        this.f30540y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (j6) {
                                        Uw n11 = n();
                                        if (n11 != null) {
                                            if (this.f30538w.a(n11)) {
                                                this.J = true;
                                            }
                                            this.f30532G = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f30540y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f30540y.b(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f30540y.b(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                this.f30528C.countDown();
                throw th;
            }
        } catch (C3295hL e10) {
            this.f30540y.c(4002, System.currentTimeMillis() - currentTimeMillis, e10);
        }
        this.f30528C.countDown();
    }

    public final Uw n() {
        if (AbstractC3043cl.q(this.f30526A)) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f3)).booleanValue()) {
                Xw xw = this.f30537v;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (Xw.f28605y) {
                    try {
                        C3228g8 r9 = xw.r(1);
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
            C2570Gf c2570Gf = this.f30536u;
            C3228g8 r10 = c2570Gf.r(1);
            if (r10 != null) {
                String A9 = r10.A();
                File c9 = MA.c(A9, "pcam.jar", c2570Gf.v());
                if (!c9.exists()) {
                    c9 = MA.c(A9, "pcam", c2570Gf.v());
                }
                return new Uw(r10, c9, MA.c(A9, "pcbc", c2570Gf.v()), MA.c(A9, "pcopt", c2570Gf.v()));
            }
        }
        return null;
    }
}
