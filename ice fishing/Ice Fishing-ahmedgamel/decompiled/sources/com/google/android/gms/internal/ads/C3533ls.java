package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3533ls implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final double f31860a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31861b;

    public C3533ls(boolean z3, double d2) {
        this.f31860a = d2;
        this.f31861b = z3;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = MA.b("battery", b9);
        b9.putBundle("battery", b10);
        b10.putBoolean("is_charging", this.f31861b);
        b10.putDouble("battery_level", this.f31860a);
    }
}
