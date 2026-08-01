package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Ss implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f27568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27572e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27573f;

    public Ss(String str, int i, int i6, int i9, boolean z3, int i10) {
        this.f27568a = str;
        this.f27569b = i;
        this.f27570c = i6;
        this.f27571d = i9;
        this.f27572e = z3;
        this.f27573f = i10;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.r(bundle, "carrier", this.f27568a, !TextUtils.isEmpty(r0));
        int i = this.f27569b;
        MA.A(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f27570c);
        bundle.putInt("pt", this.f27571d);
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = MA.b("network", b9);
        b9.putBundle("network", b10);
        b10.putInt("active_network_state", this.f27573f);
        b10.putBoolean("active_network_metered", this.f27572e);
    }
}
