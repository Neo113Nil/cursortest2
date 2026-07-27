package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FQ implements InterfaceC3716p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3716p f24962a;

    /* renamed from: b, reason: collision with root package name */
    public final B8 f24963b;

    public FQ(InterfaceC3716p interfaceC3716p, B8 b82) {
        this.f24962a = interfaceC3716p;
        this.f24963b = b82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final B8 a() {
        return this.f24963b;
    }

    public final boolean b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FQ) {
            return this.f24962a.equals(((FQ) obj).f24962a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int c() {
        return this.f24962a.c();
    }

    public final boolean equals(Object obj) {
        if (b(obj) && (obj instanceof FQ)) {
            return this.f24963b.equals(((FQ) obj).f24963b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int g() {
        return this.f24962a.g();
    }

    public final int hashCode() {
        return this.f24963b.hashCode() + (this.f24962a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final TP i() {
        return this.f24963b.f24000d[this.f24962a.g()];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int l0(int i) {
        return this.f24962a.l0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int s(int i) {
        return this.f24962a.s(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final TP t(int i) {
        return this.f24963b.f24000d[this.f24962a.s(i)];
    }
}
