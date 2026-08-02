package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3772ps implements Ps {

    /* renamed from: c, reason: collision with root package name */
    public static String f33935c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33936a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f33937b;

    public C3772ps(Context context, C3383ig c3383ig) {
        this.f33936a = 3;
        this.f33937b = c3383ig;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        switch (this.f33936a) {
            case 0:
                return this.f33937b.b(new CallableC3162ea(1));
            case 1:
                return this.f33937b.b(CallableC3162ea.f30726c);
            case 2:
                return this.f33937b.b(CallableC3162ea.f30727d);
            case 3:
                return this.f33937b.b(new CallableC3572m7(22, this));
            case 4:
                return this.f33937b.b(new CallableC3162ea(4));
            default:
                return this.f33937b.b(CallableC3162ea.f30728e);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f33936a) {
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

    public /* synthetic */ C3772ps(C3383ig c3383ig, int i) {
        this.f33936a = i;
        this.f33937b = c3383ig;
    }
}
