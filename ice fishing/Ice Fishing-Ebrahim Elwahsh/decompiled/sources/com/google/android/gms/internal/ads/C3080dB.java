package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3080dB extends ZA {

    /* renamed from: n, reason: collision with root package name */
    public final Object f29984n;

    public C3080dB(Object obj) {
        this.f29984n = obj;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public final Object a() {
        return this.f29984n;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public final ZA b(XA xa) {
        Object apply = xa.apply(this.f29984n);
        PA.X(apply, "the Function passed to Optional.transform() must not return null.");
        return new C3080dB(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3080dB) {
            return this.f29984n.equals(((C3080dB) obj).f29984n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29984n.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f29984n.toString();
        return D.y.o(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
