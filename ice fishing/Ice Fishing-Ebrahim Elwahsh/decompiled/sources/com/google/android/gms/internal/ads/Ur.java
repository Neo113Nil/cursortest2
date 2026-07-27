package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ur implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28098a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f28099b;

    /* renamed from: c, reason: collision with root package name */
    public final C3226fu f28100c;

    public /* synthetic */ Ur(C3157eg c3157eg, C3226fu c3226fu, int i) {
        this.f28098a = i;
        this.f28099b = c3157eg;
        this.f28100c = c3226fu;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        switch (this.f28098a) {
            case 0:
                return this.f28099b.b(new CallableC3454k7(8, this));
            default:
                return this.f28099b.b(new CallableC3454k7(18, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f28098a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }
}
