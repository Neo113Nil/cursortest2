package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3548lk implements v2.l {

    /* renamed from: u, reason: collision with root package name */
    public final Yt f32617u;

    /* renamed from: v, reason: collision with root package name */
    public final St f32618v;

    /* renamed from: w, reason: collision with root package name */
    public final V2.a f32619w;

    /* renamed from: x, reason: collision with root package name */
    public final C3230fo f32620x;

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledExecutorService f32621y;

    /* renamed from: n, reason: collision with root package name */
    public final Object f32616n = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final C3559lv f32622z = C3613mv.A();

    /* renamed from: A, reason: collision with root package name */
    public boolean f32614A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f32615B = false;

    public C3548lk(Yt yt, St st, V2.a aVar, C3230fo c3230fo, ScheduledExecutorService scheduledExecutorService) {
        this.f32617u = yt;
        this.f32618v = st;
        this.f32619w = aVar;
        this.f32620x = c3230fo;
        this.f32621y = scheduledExecutorService;
    }

    @Override // v2.l
    public final void C3(int i) {
    }

    @Override // v2.l
    public final void G1() {
        b(5);
    }

    @Override // v2.l
    public final void K0() {
        b(9);
    }

    @Override // v2.l
    public final void N2() {
        b(7);
    }

    @Override // v2.l
    public final void Q1() {
    }

    @Override // v2.l
    public final void S1() {
        b(6);
    }

    public final void a() {
        synchronized (this.f32616n) {
            try {
                C3230fo c3230fo = this.f32620x;
                String str = ((Ut) this.f32617u.f29533b.f25831v).f28801b;
                String encodeToString = Base64.encodeToString(((C3613mv) this.f32622z.j()).b(), 1);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.pe)).booleanValue()) {
                    S0.e a9 = c3230fo.a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "pclma");
                    a9.M("pclmd", encodeToString);
                    a9.M("gqi", str);
                    a9.P();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f32616n) {
            try {
                if (!this.f32615B && this.f32614A) {
                    C3559lv c3559lv = this.f32622z;
                    Pu A9 = Qu.A();
                    A9.h();
                    ((Qu) A9.f28504u).C(i);
                    this.f32619w.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    A9.h();
                    ((Qu) A9.f28504u).B(currentTimeMillis);
                    Qu qu = (Qu) A9.j();
                    c3559lv.h();
                    ((C3613mv) c3559lv.f28504u).B(qu);
                    if (i == 10) {
                        a();
                        this.f32615B = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // v2.l
    public final void d1() {
        b(10);
    }

    @Override // v2.l
    public final void g() {
    }

    @Override // v2.l
    public final void h1() {
        b(3);
    }

    @Override // v2.l
    public final void r1() {
        b(8);
    }

    @Override // v2.l
    public final void t0() {
        b(4);
    }
}
