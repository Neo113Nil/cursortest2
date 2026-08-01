package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830Vn implements Mu {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28235n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28236u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28237v;

    public C2830Vn(C3068d9 c3068d9, Map map) {
        this.f28236u = map;
        this.f28237v = c3068d9;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void b(String str) {
        int i = this.f28235n;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void c(Ju ju, String str, Throwable th) {
        switch (this.f28235n) {
            case 0:
                Map map = (Map) this.f28236u;
                if (map.containsKey(ju)) {
                    ((C3068d9) this.f28237v).b(((C2814Un) map.get(ju)).f27979c);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue() && Ju.RENDERER == ju) {
                    C2699Np c2699Np = (C2699Np) this.f28236u;
                    if (c2699Np.b() != 0) {
                        C4835j.f39733C.f39745k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2699Np.b();
                        synchronized (c2699Np) {
                            synchronized (c2699Np.f26548j) {
                                c2699Np.f26544e = elapsedRealtime;
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
        switch (this.f28235n) {
            case 0:
                Map map = (Map) this.f28236u;
                if (map.containsKey(ju)) {
                    ((C3068d9) this.f28237v).b(((C2814Un) map.get(ju)).f27977a);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue()) {
                    if (Ju.RENDERER == ju) {
                        C2699Np c2699Np = (C2699Np) this.f28236u;
                        C4835j.f39733C.f39745k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (c2699Np) {
                            synchronized (c2699Np.i) {
                                c2699Np.f26543d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (Ju.PRELOADED_LOADER == ju || Ju.SERVER_TRANSACTION == ju) {
                        C2699Np c2699Np2 = (C2699Np) this.f28236u;
                        C4835j.f39733C.f39745k.getClass();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (c2699Np2) {
                            synchronized (c2699Np2.f26545f) {
                                c2699Np2.f26540a = elapsedRealtime2;
                            }
                        }
                        C2716Op c2716Op = (C2716Op) this.f28237v;
                        ((S0.e) c2716Op.f732v).m(new C3381j1(c2716Op, c2699Np2.a(), 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void x(Ju ju, String str) {
        switch (this.f28235n) {
            case 0:
                Map map = (Map) this.f28236u;
                if (map.containsKey(ju)) {
                    ((C3068d9) this.f28237v).b(((C2814Un) map.get(ju)).f27978b);
                    return;
                }
                return;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue() && Ju.RENDERER == ju) {
                    C2699Np c2699Np = (C2699Np) this.f28236u;
                    if (c2699Np.b() != 0) {
                        C4835j.f39733C.f39745k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - c2699Np.b();
                        synchronized (c2699Np) {
                            synchronized (c2699Np.f26548j) {
                                c2699Np.f26544e = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C2830Vn(C2699Np c2699Np, C2716Op c2716Op) {
        this.f28236u = c2699Np;
        this.f28237v = c2716Op;
    }

    private final void a(String str) {
    }

    private final void d(String str) {
    }
}
