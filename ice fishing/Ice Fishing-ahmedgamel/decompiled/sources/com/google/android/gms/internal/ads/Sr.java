package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Sr implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28348a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f28349b;

    /* renamed from: c, reason: collision with root package name */
    public final C3075cu f28350c;

    public /* synthetic */ Sr(C3383ig c3383ig, C3075cu c3075cu, int i) {
        this.f28348a = i;
        this.f28349b = c3383ig;
        this.f28350c = c3075cu;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        switch (this.f28348a) {
            case 0:
                return this.f28349b.b(new CallableC3572m7(8, this));
            default:
                return this.f28349b.b(new CallableC3572m7(18, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f28348a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }
}
