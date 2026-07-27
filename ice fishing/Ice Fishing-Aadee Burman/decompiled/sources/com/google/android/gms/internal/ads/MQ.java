package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class MQ implements IQ {

    /* renamed from: a, reason: collision with root package name */
    public final IQ f26296a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26297b;

    public MQ(IQ iq, long j6) {
        this.f26296a = iq;
        this.f26297b = j6;
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final int a(long j6) {
        return this.f26296a.a(j6 - this.f26297b);
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final int b(S0.l lVar, C3996uN c3996uN, int i) {
        int b9 = this.f26296a.b(lVar, c3996uN, i);
        if (b9 != -4) {
            return b9;
        }
        c3996uN.f34529f += this.f26297b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final boolean c() {
        return this.f26296a.c();
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final void f() {
        this.f26296a.f();
    }
}
