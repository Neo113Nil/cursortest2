package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3502ks implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final int f32433a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32434b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32436d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32437e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32438f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32439g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32440h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f32441j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f32442k;

    public C3502ks(int i, boolean z6, boolean z9, int i4, int i6, int i9, int i10, int i11, float f2, boolean z10, boolean z11) {
        this.f32433a = i;
        this.f32434b = z6;
        this.f32435c = z9;
        this.f32436d = i4;
        this.f32437e = i6;
        this.f32438f = i9;
        this.f32439g = i10;
        this.f32440h = i11;
        this.i = f2;
        this.f32441j = z10;
        this.f32442k = z11;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.sc)).booleanValue()) {
            bundle.putInt("muv_min", this.f32437e);
            bundle.putInt("muv_max", this.f32438f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f32441j);
        if (this.f32442k) {
            return;
        }
        bundle.putInt("am", this.f32433a);
        bundle.putBoolean("ma", this.f32434b);
        bundle.putBoolean("sp", this.f32435c);
        bundle.putInt("muv", this.f32436d);
        bundle.putInt("rm", this.f32439g);
        bundle.putInt("riv", this.f32440h);
    }
}
