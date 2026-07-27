package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Cs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final String f24262a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24263b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24264c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24265d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24266e;

    public Cs(String str, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f24262a = str;
        this.f24263b = z8;
        this.f24264c = z9;
        this.f24265d = z10;
        this.f24266e = z11;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f24262a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z8 = this.f24263b;
        bundle.putInt("test_mode", z8 ? 1 : 0);
        boolean z9 = this.f24264c;
        bundle.putInt("linked_device", z9 ? 1 : 0);
        if (z8 || z9) {
            C3151ea c3151ea = AbstractC3368ia.Aa;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                bundle.putInt("risd", !this.f24265d ? 1 : 0);
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ea)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f24266e);
            }
        }
    }
}
