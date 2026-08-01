package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13353a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13354b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13355c = 3;

    /* renamed from: d, reason: collision with root package name */
    public int f13356d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f13357e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f13358f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f13359g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f13360h = 1;

    private aa() {
    }

    public static aa a() {
        aa aaVar = new aa();
        aaVar.f13356d = 3;
        aaVar.f13357e = 3;
        aaVar.f13358f = 3;
        aaVar.f13359g = 3;
        aaVar.f13360h = 1;
        return aaVar;
    }

    public final String toString() {
        return super.toString();
    }

    public static aa a(String str) {
        aa aaVar = new aa();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aaVar.f13356d = jSONObject.optInt("b_e", 1);
            aaVar.f13357e = jSONObject.optInt("r_s", 1);
            aaVar.f13358f = jSONObject.optInt("r_f", 1);
            aaVar.f13359g = jSONObject.optInt("g_ad", 1);
            aaVar.f13360h = jSONObject.optInt("ip_af", 1);
        } catch (Throwable unused) {
        }
        return aaVar;
    }
}
