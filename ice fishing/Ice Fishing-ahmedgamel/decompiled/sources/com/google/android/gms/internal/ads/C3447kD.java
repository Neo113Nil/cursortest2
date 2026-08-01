package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3447kD extends AbstractC3341iD {
    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void e(C3717pD c3717pD, Thread thread) {
        c3717pD.f33043a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final void h(C3717pD c3717pD, C3717pD c3717pD2) {
        c3717pD.f33044b = c3717pD2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean m(AbstractC3771qD abstractC3771qD, C3717pD c3717pD, C3717pD c3717pD2) {
        synchronized (abstractC3771qD) {
            try {
                if (abstractC3771qD.f33222v != c3717pD) {
                    return false;
                }
                abstractC3771qD.f33222v = c3717pD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean o(AbstractC3287hD abstractC3287hD, C3125eD c3125eD, C3125eD c3125eD2) {
        synchronized (abstractC3287hD) {
            try {
                if (abstractC3287hD.f33221u != c3125eD) {
                    return false;
                }
                abstractC3287hD.f33221u = c3125eD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3717pD p(AbstractC3287hD abstractC3287hD) {
        C3717pD c3717pD;
        C3717pD c3717pD2 = C3717pD.f33042c;
        synchronized (abstractC3287hD) {
            try {
                c3717pD = abstractC3287hD.f33222v;
                if (c3717pD != c3717pD2) {
                    abstractC3287hD.f33222v = c3717pD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3717pD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final C3125eD q(AbstractC3287hD abstractC3287hD) {
        C3125eD c3125eD;
        C3125eD c3125eD2 = C3125eD.f29897d;
        synchronized (abstractC3287hD) {
            try {
                c3125eD = abstractC3287hD.f33221u;
                if (c3125eD != c3125eD2) {
                    abstractC3287hD.f33221u = c3125eD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3125eD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3341iD
    public final boolean r(AbstractC3771qD abstractC3771qD, Object obj, Object obj2) {
        synchronized (abstractC3771qD) {
            try {
                if (abstractC3771qD.f33220n != obj) {
                    return false;
                }
                abstractC3771qD.f33220n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
