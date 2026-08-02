package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3470kD extends AbstractC3364iD {
    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void e(C3740pD c3740pD, Thread thread) {
        c3740pD.f33833a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final void h(C3740pD c3740pD, C3740pD c3740pD2) {
        c3740pD.f33834b = c3740pD2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean m(AbstractC3794qD abstractC3794qD, C3740pD c3740pD, C3740pD c3740pD2) {
        synchronized (abstractC3794qD) {
            try {
                if (abstractC3794qD.f34006v != c3740pD) {
                    return false;
                }
                abstractC3794qD.f34006v = c3740pD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean o(AbstractC3310hD abstractC3310hD, C3148eD c3148eD, C3148eD c3148eD2) {
        synchronized (abstractC3310hD) {
            try {
                if (abstractC3310hD.f34005u != c3148eD) {
                    return false;
                }
                abstractC3310hD.f34005u = c3148eD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3740pD p(AbstractC3310hD abstractC3310hD) {
        C3740pD c3740pD;
        C3740pD c3740pD2 = C3740pD.f33832c;
        synchronized (abstractC3310hD) {
            try {
                c3740pD = abstractC3310hD.f34006v;
                if (c3740pD != c3740pD2) {
                    abstractC3310hD.f34006v = c3740pD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3740pD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final C3148eD q(AbstractC3310hD abstractC3310hD) {
        C3148eD c3148eD;
        C3148eD c3148eD2 = C3148eD.f30689d;
        synchronized (abstractC3310hD) {
            try {
                c3148eD = abstractC3310hD.f34005u;
                if (c3148eD != c3148eD2) {
                    abstractC3310hD.f34005u = c3148eD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3148eD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3364iD
    public final boolean r(AbstractC3794qD abstractC3794qD, Object obj, Object obj2) {
        synchronized (abstractC3794qD) {
            try {
                if (abstractC3794qD.f34004n != obj) {
                    return false;
                }
                abstractC3794qD.f34004n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
