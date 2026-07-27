package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3616nK extends AbstractC3508lK {

    /* renamed from: n, reason: collision with root package name */
    public final C4047vK f32720n = new C4047vK();

    public final AbstractC3508lK e(String str) {
        return (AbstractC3508lK) this.f32720n.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3616nK) && ((C3616nK) obj).f32720n.equals(this.f32720n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f32720n.hashCode();
    }
}
