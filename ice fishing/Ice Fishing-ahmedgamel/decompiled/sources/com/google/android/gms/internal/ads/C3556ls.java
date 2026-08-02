package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3556ls implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final double f32640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32641b;

    public C3556ls(boolean z6, double d9) {
        this.f32640a = d9;
        this.f32641b = z6;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = MA.b("battery", b9);
        b9.putBundle("battery", b10);
        b10.putBoolean("is_charging", this.f32641b);
        b10.putDouble("battery_level", this.f32640a);
    }
}
