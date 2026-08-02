package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3818qk implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34158a;

    /* renamed from: b, reason: collision with root package name */
    public final C3710ok f34159b;

    public /* synthetic */ C3818qk(C3710ok c3710ok, int i) {
        this.f34158a = i;
        this.f34159b = c3710ok;
    }

    public C3075cu a() {
        C3075cu c3075cu = this.f34159b.f33719b;
        AbstractC3364iD.j(c3075cu);
        return c3075cu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f34158a) {
            case 0:
                return this.f34159b.f33720c;
            case 1:
                return this.f34159b.f33722e;
            case 2:
                return this.f34159b.f33721d;
            case 3:
                C3075cu c3075cu = this.f34159b.f33719b;
                AbstractC3364iD.j(c3075cu);
                return c3075cu;
            default:
                return this.f34159b.a();
        }
    }
}
