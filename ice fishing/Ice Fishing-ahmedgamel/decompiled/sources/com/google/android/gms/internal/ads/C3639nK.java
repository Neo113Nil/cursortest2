package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3639nK extends AbstractC3531lK {

    /* renamed from: n, reason: collision with root package name */
    public final C4070vK f33498n = new C4070vK();

    public final AbstractC3531lK e(String str) {
        return (AbstractC3531lK) this.f33498n.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3639nK) && ((C3639nK) obj).f33498n.equals(this.f33498n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f33498n.hashCode();
    }
}
