package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Ls implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final String f26973a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26975c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26976d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26977e;

    public Ls(String str, String str2, String str3, String str4, Long l9) {
        this.f26973a = str;
        this.f26974b = str2;
        this.f26975c = str3;
        this.f26976d = str4;
        this.f26977e = l9;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        MA.M("gmp_app_id", bundle, this.f26973a);
        MA.M("fbs_aiid", bundle, this.f26974b);
        MA.M("fbs_aeid", bundle, this.f26975c);
        MA.M("apm_id_origin", bundle, this.f26976d);
        Long l9 = this.f26977e;
        if (l9 != null) {
            bundle.putLong("sai_timeout", l9.longValue());
        }
    }
}
