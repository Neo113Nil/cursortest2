package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4066vm extends C4120wm {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f34728b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34729c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34730d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34731e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34732f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34733g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f34734h;

    public C4066vm(St st, JSONObject jSONObject) {
        super(st);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject R8 = A8.b.R(jSONObject, strArr);
        this.f34728b = R8 == null ? null : R8.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject R9 = A8.b.R(jSONObject, strArr2);
        this.f34729c = R9 == null ? false : R9.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject R10 = A8.b.R(jSONObject, strArr3);
        this.f34730d = R10 == null ? false : R10.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject R11 = A8.b.R(jSONObject, strArr4);
        this.f34731e = R11 == null ? false : R11.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject R12 = A8.b.R(jSONObject, strArr5);
        this.f34733g = R12 != null ? R12.optString(strArr5[0], "") : "";
        this.f34732f = jSONObject.optJSONObject("overlay") != null;
        this.f34734h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final boolean a() {
        return this.f34732f;
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final boolean b() {
        return this.f34729c;
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final boolean c() {
        return this.f34731e;
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final boolean d() {
        return this.f34730d;
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final String e() {
        return this.f34733g;
    }

    @Override // com.google.android.gms.internal.ads.C4120wm
    public final C3105du f() {
        JSONObject jSONObject = this.f34734h;
        return jSONObject != null ? new C3105du(0, jSONObject) : this.f34870a.f27602V;
    }
}
