package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Sr implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27565a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f27566b;

    /* renamed from: c, reason: collision with root package name */
    public final C3052cu f27567c;

    public /* synthetic */ Sr(C3360ig c3360ig, C3052cu c3052cu, int i) {
        this.f27565a = i;
        this.f27566b = c3360ig;
        this.f27567c = c3052cu;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        switch (this.f27565a) {
            case 0:
                return this.f27566b.b(new CallableC3549m7(8, this));
            default:
                return this.f27566b.b(new CallableC3549m7(18, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f27565a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }
}
