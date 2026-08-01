package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3301ha {

    /* renamed from: a, reason: collision with root package name */
    public final int f30812a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30813b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30814c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30816e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3301ha(int i, int i6, Object obj, Object obj2, String str) {
        this(i, str, obj, obj2);
        this.f30816e = i6;
    }

    public static C3301ha e(int i, int i6, String str) {
        return new C3301ha(1, 1, Integer.valueOf(i), Integer.valueOf(i6), str);
    }

    public static C3301ha f(String str, long j6, long j9) {
        return new C3301ha(1, 2, Long.valueOf(j6), Long.valueOf(j9), str);
    }

    public static C3301ha g(String str, float f3, float f9) {
        return new C3301ha(1, 3, Float.valueOf(f3), Float.valueOf(f9), str);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) q2.r.f40207e.f40208a.f35361v).add(new C3301ha(1, 4, obj, obj, "gads:sdk_core_constants:experiment_id"));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) q2.r.f40207e.f40208a.f35362w).add(new C3301ha(1, 4, obj, obj, "gads:sdk_core_constants_service:experiment_id"));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f30816e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f30813b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f30813b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f30813b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f30813b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f30813b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f30816e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f30813b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f30813b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f30813b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f30813b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f30813b, (String) c());
        }
    }

    public final Object c() {
        return q2.r.f40207e.f40210c.i ? this.f30815d : this.f30814c;
    }

    public final Object d() {
        return q2.r.f40207e.f40210c.a(this);
    }

    public C3301ha(int i, String str, Object obj, Object obj2) {
        this.f30812a = i;
        this.f30813b = str;
        this.f30814c = obj;
        this.f30815d = obj2;
        ((ArrayList) q2.r.f40207e.f40208a.f35360u).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3301ha(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f30816e = 4;
    }
}
