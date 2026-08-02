package com.anythink.expressad.videocommon.c;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f23131a;

    /* renamed from: b, reason: collision with root package name */
    private String f23132b;

    private a(String str, String str2) {
        this.f23131a = str;
        this.f23132b = str2;
    }

    private String a() {
        return this.f23131a;
    }

    private String b() {
        return this.f23132b;
    }

    private void a(String str) {
        this.f23131a = str;
    }

    private void b(String str) {
        this.f23132b = str;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(com.anythink.expressad.videocommon.e.b.f23194u), jSONObject.optString(com.anythink.expressad.videocommon.e.b.f23195v));
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
