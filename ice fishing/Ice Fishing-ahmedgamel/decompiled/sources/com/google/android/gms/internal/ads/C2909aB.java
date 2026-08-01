package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2909aB extends WA {

    /* renamed from: n, reason: collision with root package name */
    public final Object f29030n;

    public C2909aB(Object obj) {
        this.f29030n = obj;
    }

    @Override // com.google.android.gms.internal.ads.WA
    public final Object a() {
        return this.f29030n;
    }

    @Override // com.google.android.gms.internal.ads.WA
    public final WA b(UA ua) {
        Object apply = ua.apply(this.f29030n);
        AbstractC2772Sd.J(apply, "the Function passed to Optional.transform() must not return null.");
        return new C2909aB(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2909aB) {
            return this.f29030n.equals(((C2909aB) obj).f29030n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29030n.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f29030n.toString();
        return D.y.s(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
