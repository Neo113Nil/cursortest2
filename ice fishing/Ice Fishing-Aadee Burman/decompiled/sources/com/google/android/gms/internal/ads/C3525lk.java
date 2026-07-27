package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3525lk implements t2.l {

    /* renamed from: u, reason: collision with root package name */
    public final Yt f31839u;

    /* renamed from: v, reason: collision with root package name */
    public final St f31840v;

    /* renamed from: w, reason: collision with root package name */
    public final T2.a f31841w;

    /* renamed from: x, reason: collision with root package name */
    public final C3153eo f31842x;

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledExecutorService f31843y;

    /* renamed from: n, reason: collision with root package name */
    public final Object f31838n = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final C3536lv f31844z = C3590mv.A();

    /* renamed from: A, reason: collision with root package name */
    public boolean f31836A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f31837B = false;

    public C3525lk(Yt yt, St st, T2.a aVar, C3153eo c3153eo, ScheduledExecutorService scheduledExecutorService) {
        this.f31839u = yt;
        this.f31840v = st;
        this.f31841w = aVar;
        this.f31842x = c3153eo;
        this.f31843y = scheduledExecutorService;
    }

    @Override // t2.l
    public final void H3(int i) {
    }

    @Override // t2.l
    public final void L1() {
        b(5);
    }

    @Override // t2.l
    public final void M0() {
        b(9);
    }

    @Override // t2.l
    public final void Q2() {
        b(7);
    }

    @Override // t2.l
    public final void R1() {
    }

    @Override // t2.l
    public final void S1() {
        b(6);
    }

    public final void a() {
        synchronized (this.f31838n) {
            try {
                C3153eo c3153eo = this.f31842x;
                String str = ((Ut) this.f31839u.f28754b.f25043v).f28004b;
                String encodeToString = Base64.encodeToString(((C3590mv) this.f31844z.j()).b(), 1);
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.pe)).booleanValue()) {
                    S0.e a9 = c3153eo.a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "pclma");
                    a9.v("pclmd", encodeToString);
                    a9.v("gqi", str);
                    a9.B();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f31838n) {
            try {
                if (!this.f31837B && this.f31836A) {
                    C3536lv c3536lv = this.f31844z;
                    Pu A9 = Qu.A();
                    A9.h();
                    ((Qu) A9.f27721u).C(i);
                    this.f31841w.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    A9.h();
                    ((Qu) A9.f27721u).B(currentTimeMillis);
                    Qu qu = (Qu) A9.j();
                    c3536lv.h();
                    ((C3590mv) c3536lv.f27721u).B(qu);
                    if (i == 10) {
                        a();
                        this.f31837B = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // t2.l
    public final void f1() {
        b(10);
    }

    @Override // t2.l
    public final void g() {
    }

    @Override // t2.l
    public final void h1() {
        b(3);
    }

    @Override // t2.l
    public final void t1() {
        b(8);
    }

    @Override // t2.l
    public final void w0() {
        b(4);
    }
}
