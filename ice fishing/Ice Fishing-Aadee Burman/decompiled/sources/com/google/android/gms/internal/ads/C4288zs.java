package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4288zs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f35466a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35467b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35468c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35469d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35470e;

    public C4288zs(String str, boolean z3, boolean z6, boolean z9, boolean z10) {
        this.f35466a = str;
        this.f35467b = z3;
        this.f35468c = z6;
        this.f35469d = z9;
        this.f35470e = z10;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f35466a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f35467b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z6 = this.f35468c;
        bundle.putInt("linked_device", z6 ? 1 : 0);
        if (z3 || z6) {
            C3301ha c3301ha = AbstractC3569ma.Aa;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                bundle.putInt("risd", !this.f35469d ? 1 : 0);
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Ea)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f35470e);
            }
        }
    }
}
