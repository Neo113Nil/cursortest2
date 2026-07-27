package com.anythink.expressad.videocommon.c;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f22344a;

    /* renamed from: b, reason: collision with root package name */
    private String f22345b;

    private a(String str, String str2) {
        this.f22344a = str;
        this.f22345b = str2;
    }

    private String a() {
        return this.f22344a;
    }

    private String b() {
        return this.f22345b;
    }

    private void a(String str) {
        this.f22344a = str;
    }

    private void b(String str) {
        this.f22345b = str;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(com.anythink.expressad.videocommon.e.b.f22407u), jSONObject.optString(com.anythink.expressad.videocommon.e.b.f22408v));
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
