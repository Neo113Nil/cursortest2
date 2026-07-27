package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Ms implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26354a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26355b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26360g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26361h;

    public Ms(boolean z3, boolean z6, String str, boolean z9, int i, int i6, int i9, String str2) {
        this.f26354a = z3;
        this.f26355b = z6;
        this.f26356c = str;
        this.f26357d = z9;
        this.f26358e = i;
        this.f26359f = i6;
        this.f26360g = i9;
        this.f26361h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f26356c);
        bundle.putBoolean("is_nonagon", true);
        C3301ha c3301ha = AbstractC3569ma.f32001D4;
        q2.r rVar = q2.r.f40204e;
        bundle.putString("extra_caps", (String) rVar.f40207c.a(c3301ha));
        bundle.putInt("target_api", this.f26358e);
        bundle.putInt("dv", this.f26359f);
        bundle.putInt("lv", this.f26360g);
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32112Q6)).booleanValue()) {
            String str = this.f26361h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle b9 = MA.b("sdk_env", bundle);
        b9.putBoolean("mf", ((Boolean) AbstractC2718Pa.f26828g.r()).booleanValue());
        b9.putBoolean("instant_app", this.f26354a);
        b9.putBoolean("lite", this.f26355b);
        b9.putBoolean("is_privileged_process", this.f26357d);
        bundle.putBundle("sdk_env", b9);
        Bundle b10 = MA.b("build_meta", b9);
        b10.putString("cl", "919173219");
        b10.putString("rapid_rc", "dev");
        b10.putString("rapid_rollup", "HEAD");
        b9.putBundle("build_meta", b10);
    }
}
