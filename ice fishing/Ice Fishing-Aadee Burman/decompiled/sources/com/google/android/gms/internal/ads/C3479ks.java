package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3479ks implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final int f31651a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31652b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31653c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31654d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31655e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31656f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31657g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31658h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f31659j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31660k;

    public C3479ks(int i, boolean z3, boolean z6, int i6, int i9, int i10, int i11, int i12, float f3, boolean z9, boolean z10) {
        this.f31651a = i;
        this.f31652b = z3;
        this.f31653c = z6;
        this.f31654d = i6;
        this.f31655e = i9;
        this.f31656f = i10;
        this.f31657g = i11;
        this.f31658h = i12;
        this.i = f3;
        this.f31659j = z9;
        this.f31660k = z10;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.sc)).booleanValue()) {
            bundle.putInt("muv_min", this.f31655e);
            bundle.putInt("muv_max", this.f31656f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f31659j);
        if (this.f31660k) {
            return;
        }
        bundle.putInt("am", this.f31651a);
        bundle.putBoolean("ma", this.f31652b);
        bundle.putBoolean("sp", this.f31653c);
        bundle.putInt("muv", this.f31654d);
        bundle.putInt("rm", this.f31657g);
        bundle.putInt("riv", this.f31658h);
    }
}
