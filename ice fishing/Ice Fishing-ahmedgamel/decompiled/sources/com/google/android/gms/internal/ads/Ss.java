package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Ss implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f28351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28354d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28356f;

    public Ss(String str, int i, int i4, int i6, boolean z6, int i9) {
        this.f28351a = str;
        this.f28352b = i;
        this.f28353c = i4;
        this.f28354d = i6;
        this.f28355e = z6;
        this.f28356f = i9;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.r(bundle, "carrier", this.f28351a, !TextUtils.isEmpty(r0));
        int i = this.f28352b;
        MA.A(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f28353c);
        bundle.putInt("pt", this.f28354d);
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = MA.b("network", b9);
        b9.putBundle("network", b10);
        b10.putInt("active_network_state", this.f28356f);
        b10.putBoolean("active_network_metered", this.f28355e);
    }
}
