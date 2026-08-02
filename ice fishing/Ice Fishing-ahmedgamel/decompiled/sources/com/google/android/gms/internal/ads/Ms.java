package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Ms implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27139a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27140b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27141c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27142d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27143e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27145g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27146h;

    public Ms(boolean z6, boolean z9, String str, boolean z10, int i, int i4, int i6, String str2) {
        this.f27139a = z6;
        this.f27140b = z9;
        this.f27141c = str;
        this.f27142d = z10;
        this.f27143e = i;
        this.f27144f = i4;
        this.f27145g = i6;
        this.f27146h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f27141c);
        bundle.putBoolean("is_nonagon", true);
        C3324ha c3324ha = AbstractC3592ma.f32781D4;
        s2.r rVar = s2.r.f40506e;
        bundle.putString("extra_caps", (String) rVar.f40509c.a(c3324ha));
        bundle.putInt("target_api", this.f27143e);
        bundle.putInt("dv", this.f27144f);
        bundle.putInt("lv", this.f27145g);
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32892Q6)).booleanValue()) {
            String str = this.f27146h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle b9 = MA.b("sdk_env", bundle);
        b9.putBoolean("mf", ((Boolean) AbstractC2738Pa.f27616g.r()).booleanValue());
        b9.putBoolean("instant_app", this.f27139a);
        b9.putBoolean("lite", this.f27140b);
        b9.putBoolean("is_privileged_process", this.f27142d);
        bundle.putBundle("sdk_env", b9);
        Bundle b10 = MA.b("build_meta", b9);
        b10.putString("cl", "919173219");
        b10.putString("rapid_rc", "dev");
        b10.putString("rapid_rollup", "HEAD");
        b9.putBundle("build_meta", b10);
    }
}
