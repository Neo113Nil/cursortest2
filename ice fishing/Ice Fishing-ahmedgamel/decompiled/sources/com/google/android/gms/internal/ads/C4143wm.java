package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4143wm extends C4197xm {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f35647b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35648c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35649d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35651f;

    /* renamed from: g, reason: collision with root package name */
    public final String f35652g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f35653h;

    public C4143wm(St st, JSONObject jSONObject) {
        super(st);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject z6 = d6.c.z(jSONObject, strArr);
        this.f35647b = z6 == null ? null : z6.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject z9 = d6.c.z(jSONObject, strArr2);
        this.f35648c = z9 == null ? false : z9.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject z10 = d6.c.z(jSONObject, strArr3);
        this.f35649d = z10 == null ? false : z10.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject z11 = d6.c.z(jSONObject, strArr4);
        this.f35650e = z11 == null ? false : z11.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject z12 = d6.c.z(jSONObject, strArr5);
        this.f35652g = z12 != null ? z12.optString(strArr5[0], "") : "";
        this.f35651f = jSONObject.optJSONObject("overlay") != null;
        this.f35653h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final boolean a() {
        return this.f35651f;
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final boolean b() {
        return this.f35648c;
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final boolean c() {
        return this.f35650e;
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final boolean d() {
        return this.f35649d;
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final String e() {
        return this.f35652g;
    }

    @Override // com.google.android.gms.internal.ads.C4197xm
    public final C3128du f() {
        JSONObject jSONObject = this.f35653h;
        return jSONObject != null ? new C3128du(0, jSONObject) : this.f35829a.f28385V;
    }
}
