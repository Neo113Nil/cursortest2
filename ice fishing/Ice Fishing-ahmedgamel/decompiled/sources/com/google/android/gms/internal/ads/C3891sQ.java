package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3891sQ implements InterfaceC3757q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3757q f33973a;

    /* renamed from: b, reason: collision with root package name */
    public final A8 f33974b;

    public C3891sQ(InterfaceC3757q interfaceC3757q, A8 a82) {
        this.f33973a = interfaceC3757q;
        this.f33974b = a82;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3891sQ) {
            return this.f33973a.equals(((C3891sQ) obj).f33973a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final A8 c() {
        return this.f33974b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int d() {
        return this.f33973a.d();
    }

    public final boolean equals(Object obj) {
        if (a(obj) && (obj instanceof C3891sQ)) {
            return this.f33974b.equals(((C3891sQ) obj).f33974b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int g() {
        return this.f33973a.g();
    }

    public final int hashCode() {
        return this.f33974b.hashCode() + (this.f33973a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final DP i() {
        return this.f33974b.f23638d[this.f33973a.g()];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int j0(int i) {
        return this.f33973a.j0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final int v(int i) {
        return this.f33973a.v(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3757q
    public final DP x(int i) {
        return this.f33974b.f23638d[this.f33973a.v(i)];
    }
}
