package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4076vQ implements InterfaceC3780q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3780q f35460a;

    /* renamed from: b, reason: collision with root package name */
    public final A8 f35461b;

    public C4076vQ(InterfaceC3780q interfaceC3780q, A8 a82) {
        this.f35460a = interfaceC3780q;
        this.f35461b = a82;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4076vQ) {
            return this.f35460a.equals(((C4076vQ) obj).f35460a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final A8 c() {
        return this.f35461b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int d() {
        return this.f35460a.d();
    }

    public final boolean equals(Object obj) {
        if (a(obj) && (obj instanceof C4076vQ)) {
            return this.f35461b.equals(((C4076vQ) obj).f35461b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int g() {
        return this.f35460a.g();
    }

    public final int hashCode() {
        return this.f35461b.hashCode() + (this.f35460a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final DP i() {
        return this.f35461b.f24418d[this.f35460a.g()];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int j0(int i) {
        return this.f35460a.j0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final int v(int i) {
        return this.f35460a.v(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3780q
    public final DP x(int i) {
        return this.f35461b.f24418d[this.f35460a.v(i)];
    }
}
