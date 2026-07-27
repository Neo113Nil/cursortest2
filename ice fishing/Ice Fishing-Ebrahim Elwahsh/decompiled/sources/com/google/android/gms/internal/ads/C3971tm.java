package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3971tm extends C4025um {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f34453b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34454c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34455d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34456e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34457f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34458g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f34459h;

    public C3971tm(Ut ut, JSONObject jSONObject) {
        super(ut);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject z8 = p8.g.z(jSONObject, strArr);
        this.f34453b = z8 == null ? null : z8.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject z9 = p8.g.z(jSONObject, strArr2);
        this.f34454c = z9 == null ? false : z9.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject z10 = p8.g.z(jSONObject, strArr3);
        this.f34455d = z10 == null ? false : z10.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject z11 = p8.g.z(jSONObject, strArr4);
        this.f34456e = z11 == null ? false : z11.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject z12 = p8.g.z(jSONObject, strArr5);
        this.f34458g = z12 != null ? z12.optString(strArr5[0], "") : "";
        this.f34457f = jSONObject.optJSONObject("overlay") != null;
        this.f34459h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final boolean a() {
        return this.f34457f;
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final boolean b() {
        return this.f34454c;
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final boolean c() {
        return this.f34456e;
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final boolean d() {
        return this.f34455d;
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final String e() {
        return this.f34458g;
    }

    @Override // com.google.android.gms.internal.ads.C4025um
    public final C3761pr f() {
        JSONObject jSONObject = this.f34459h;
        return jSONObject != null ? new C3761pr(29, jSONObject) : this.f34649a.f28135V;
    }
}
