package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2932aB extends WA {

    /* renamed from: n, reason: collision with root package name */
    public final Object f29800n;

    public C2932aB(Object obj) {
        this.f29800n = obj;
    }

    @Override // com.google.android.gms.internal.ads.WA
    public final Object a() {
        return this.f29800n;
    }

    @Override // com.google.android.gms.internal.ads.WA
    public final WA b(UA ua) {
        Object apply = ua.apply(this.f29800n);
        AbstractC2792Sd.J(apply, "the Function passed to Optional.transform() must not return null.");
        return new C2932aB(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2932aB) {
            return this.f29800n.equals(((C2932aB) obj).f29800n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29800n.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f29800n.toString();
        return D.x.p(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
