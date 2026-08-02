package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4311zs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f36235a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36237c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36239e;

    public C4311zs(String str, boolean z6, boolean z9, boolean z10, boolean z11) {
        this.f36235a = str;
        this.f36236b = z6;
        this.f36237c = z9;
        this.f36238d = z10;
        this.f36239e = z11;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f36235a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z6 = this.f36236b;
        bundle.putInt("test_mode", z6 ? 1 : 0);
        boolean z9 = this.f36237c;
        bundle.putInt("linked_device", z9 ? 1 : 0);
        if (z6 || z9) {
            C3324ha c3324ha = AbstractC3592ma.Aa;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                bundle.putInt("risd", !this.f36238d ? 1 : 0);
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ea)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f36239e);
            }
        }
    }
}
