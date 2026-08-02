package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Wn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2869Wn implements Mu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29182n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29183u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29184v;

    public C2869Wn(C3091d9 c3091d9, Map map) {
        this.f29183u = map;
        this.f29184v = c3091d9;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
        int i = this.f29182n;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        switch (this.f29182n) {
            case 0:
                Map map = (Map) this.f29183u;
                if (map.containsKey(ju)) {
                    ((C3091d9) this.f29184v).b(((C2853Vn) map.get(ju)).f29035c);
                    return;
                }
                return;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue() && Ju.RENDERER == ju) {
                    C2719Np c2719Np = (C2719Np) this.f29183u;
                    if (c2719Np.b() != 0) {
                        C4906k.f40186C.f40198k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2719Np.b();
                        synchronized (c2719Np) {
                            synchronized (c2719Np.f27330j) {
                                c2719Np.f27326e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void o(Ju ju, String str) {
        switch (this.f29182n) {
            case 0:
                Map map = (Map) this.f29183u;
                if (map.containsKey(ju)) {
                    ((C3091d9) this.f29184v).b(((C2853Vn) map.get(ju)).f29033a);
                    return;
                }
                return;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue()) {
                    if (Ju.RENDERER == ju) {
                        C2719Np c2719Np = (C2719Np) this.f29183u;
                        C4906k.f40186C.f40198k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (c2719Np) {
                            synchronized (c2719Np.i) {
                                c2719Np.f27325d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (Ju.PRELOADED_LOADER == ju || Ju.SERVER_TRANSACTION == ju) {
                        C2719Np c2719Np2 = (C2719Np) this.f29183u;
                        C4906k.f40186C.f40198k.getClass();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (c2719Np2) {
                            synchronized (c2719Np2.f27327f) {
                                c2719Np2.f27322a = elapsedRealtime2;
                            }
                        }
                        C2736Op c2736Op = (C2736Op) this.f29184v;
                        ((S0.e) c2736Op.f257v).E(new C3404j1(c2736Op, c2719Np2.a(), 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void w(Ju ju, String str) {
        switch (this.f29182n) {
            case 0:
                Map map = (Map) this.f29183u;
                if (map.containsKey(ju)) {
                    ((C3091d9) this.f29184v).b(((C2853Vn) map.get(ju)).f29034b);
                    return;
                }
                return;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue() && Ju.RENDERER == ju) {
                    C2719Np c2719Np = (C2719Np) this.f29183u;
                    if (c2719Np.b() != 0) {
                        C4906k.f40186C.f40198k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2719Np.b();
                        synchronized (c2719Np) {
                            synchronized (c2719Np.f27330j) {
                                c2719Np.f27326e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C2869Wn(C2719Np c2719Np, C2736Op c2736Op) {
        this.f29183u = c2719Np;
        this.f29184v = c2736Op;
    }

    private final void a(String str) {
    }

    private final void d(String str) {
    }
}
