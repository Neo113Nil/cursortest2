package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Ls implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f26182a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26183b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26184c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26185d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26186e;

    public Ls(String str, String str2, String str3, String str4, Long l9) {
        this.f26182a = str;
        this.f26183b = str2;
        this.f26184c = str3;
        this.f26185d = str4;
        this.f26186e = l9;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.M("gmp_app_id", bundle, this.f26182a);
        MA.M("fbs_aiid", bundle, this.f26183b);
        MA.M("fbs_aeid", bundle, this.f26184c);
        MA.M("apm_id_origin", bundle, this.f26185d);
        Long l9 = this.f26186e;
        if (l9 != null) {
            bundle.putLong("sai_timeout", l9.longValue());
        }
    }
}
