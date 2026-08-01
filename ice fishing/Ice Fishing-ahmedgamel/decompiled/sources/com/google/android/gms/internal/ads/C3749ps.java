package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3749ps implements Ps {

    /* renamed from: c, reason: collision with root package name */
    public static String f33149c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33150a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f33151b;

    public C3749ps(Context context, C3360ig c3360ig) {
        this.f33150a = 3;
        this.f33151b = c3360ig;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        switch (this.f33150a) {
            case 0:
                return this.f33151b.b(new CallableC3139ea(1));
            case 1:
                return this.f33151b.b(CallableC3139ea.f29935c);
            case 2:
                return this.f33151b.b(CallableC3139ea.f29936d);
            case 3:
                return this.f33151b.b(new CallableC3549m7(22, this));
            case 4:
                return this.f33151b.b(new CallableC3139ea(4));
            default:
                return this.f33151b.b(CallableC3139ea.f29937e);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f33150a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ C3749ps(C3360ig c3360ig, int i) {
        this.f33150a = i;
        this.f33151b = c3360ig;
    }
}
