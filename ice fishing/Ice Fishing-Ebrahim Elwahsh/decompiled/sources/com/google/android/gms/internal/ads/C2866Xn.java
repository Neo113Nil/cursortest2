package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2866Xn implements Pu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28693n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28694u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28695v;

    public C2866Xn(C2914a9 c2914a9, Map map) {
        this.f28694u = map;
        this.f28695v = c2914a9;
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void a(Lu lu, String str) {
        switch (this.f28693n) {
            case 0:
                Map map = (Map) this.f28694u;
                if (map.containsKey(lu)) {
                    ((C2914a9) this.f28695v).b(((C2849Wn) map.get(lu)).f28466b);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue() && Lu.RENDERER == lu) {
                    C2749Qp c2749Qp = (C2749Qp) this.f28694u;
                    if (c2749Qp.b() != 0) {
                        p2.j.f39798C.f39810k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2749Qp.b();
                        synchronized (c2749Qp) {
                            synchronized (c2749Qp.f27248j) {
                                c2749Qp.f27244e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void d(String str) {
        int i = this.f28693n;
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void t(Lu lu, String str) {
        switch (this.f28693n) {
            case 0:
                Map map = (Map) this.f28694u;
                if (map.containsKey(lu)) {
                    ((C2914a9) this.f28695v).b(((C2849Wn) map.get(lu)).f28465a);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue()) {
                    if (Lu.RENDERER == lu) {
                        C2749Qp c2749Qp = (C2749Qp) this.f28694u;
                        p2.j.f39798C.f39810k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (c2749Qp) {
                            synchronized (c2749Qp.i) {
                                c2749Qp.f27243d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (Lu.PRELOADED_LOADER == lu || Lu.SERVER_TRANSACTION == lu) {
                        C2749Qp c2749Qp2 = (C2749Qp) this.f28694u;
                        p2.j.f39798C.f39810k.getClass();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (c2749Qp2) {
                            synchronized (c2749Qp2.f27245f) {
                                c2749Qp2.f27240a = elapsedRealtime2;
                            }
                        }
                        C2766Rp c2766Rp = (C2766Rp) this.f28695v;
                        ((C2593Hm) c2766Rp.f684v).e(new C3288h1(c2766Rp, c2749Qp2.a(), 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu
    public final void u(Lu lu, String str, Throwable th) {
        switch (this.f28693n) {
            case 0:
                Map map = (Map) this.f28694u;
                if (map.containsKey(lu)) {
                    ((C2914a9) this.f28695v).b(((C2849Wn) map.get(lu)).f28467c);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue() && Lu.RENDERER == lu) {
                    C2749Qp c2749Qp = (C2749Qp) this.f28694u;
                    if (c2749Qp.b() != 0) {
                        p2.j.f39798C.f39810k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2749Qp.b();
                        synchronized (c2749Qp) {
                            synchronized (c2749Qp.f27248j) {
                                c2749Qp.f27244e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C2866Xn(C2749Qp c2749Qp, C2766Rp c2766Rp) {
        this.f28694u = c2749Qp;
        this.f28695v = c2766Rp;
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }
}
