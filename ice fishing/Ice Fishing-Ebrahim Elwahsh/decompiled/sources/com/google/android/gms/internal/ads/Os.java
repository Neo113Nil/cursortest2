package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Os implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26768a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26769b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26770c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26772e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26773f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26774g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26775h;

    public Os(boolean z8, boolean z9, String str, boolean z10, int i, int i4, int i9, String str2) {
        this.f26768a = z8;
        this.f26769b = z9;
        this.f26770c = str;
        this.f26771d = z10;
        this.f26772e = i;
        this.f26773f = i4;
        this.f26774g = i9;
        this.f26775h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f26770c);
        bundle.putBoolean("is_nonagon", true);
        C3151ea c3151ea = AbstractC3368ia.f31421D4;
        q2.r rVar = q2.r.f40116e;
        bundle.putString("extra_caps", (String) rVar.f40119c.a(c3151ea));
        bundle.putInt("target_api", this.f26772e);
        bundle.putInt("dv", this.f26773f);
        bundle.putInt("lv", this.f26774g);
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31532Q6)).booleanValue()) {
            String str = this.f26775h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle b9 = AbstractC2720Pd.b("sdk_env", bundle);
        b9.putBoolean("mf", ((Boolean) AbstractC2632Ka.f25984g.r()).booleanValue());
        b9.putBoolean("instant_app", this.f26768a);
        b9.putBoolean("lite", this.f26769b);
        b9.putBoolean("is_privileged_process", this.f26771d);
        bundle.putBundle("sdk_env", b9);
        Bundle b10 = AbstractC2720Pd.b("build_meta", b9);
        b10.putString("cl", "910357297");
        b10.putString("rapid_rc", "dev");
        b10.putString("rapid_rollup", "HEAD");
        b9.putBundle("build_meta", b10);
    }
}
