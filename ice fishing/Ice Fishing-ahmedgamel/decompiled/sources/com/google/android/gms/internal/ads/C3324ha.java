package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3324ha {

    /* renamed from: a, reason: collision with root package name */
    public final int f31573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31574b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31575c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31577e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3324ha(int i, int i4, Object obj, Object obj2, String str) {
        this(i, str, obj, obj2);
        this.f31577e = i4;
    }

    public static C3324ha e(int i, int i4, String str) {
        return new C3324ha(1, 1, Integer.valueOf(i), Integer.valueOf(i4), str);
    }

    public static C3324ha f(String str, long j6, long j9) {
        return new C3324ha(1, 2, Long.valueOf(j6), Long.valueOf(j9), str);
    }

    public static C3324ha g(String str, float f2, float f9) {
        return new C3324ha(1, 3, Float.valueOf(f2), Float.valueOf(f9), str);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) s2.r.f40506e.f40507a.f36134v).add(new C3324ha(1, 4, obj, obj, "gads:sdk_core_constants:experiment_id"));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) s2.r.f40506e.f40507a.f36135w).add(new C3324ha(1, 4, obj, obj, "gads:sdk_core_constants_service:experiment_id"));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f31577e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f31574b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f31574b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f31574b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f31574b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f31574b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f31577e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f31574b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f31574b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f31574b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f31574b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f31574b, (String) c());
        }
    }

    public final Object c() {
        return s2.r.f40506e.f40509c.i ? this.f31576d : this.f31575c;
    }

    public final Object d() {
        return s2.r.f40506e.f40509c.a(this);
    }

    public C3324ha(int i, String str, Object obj, Object obj2) {
        this.f31573a = i;
        this.f31574b = str;
        this.f31575c = obj;
        this.f31576d = obj2;
        ((ArrayList) s2.r.f40506e.f40507a.f36133u).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3324ha(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f31577e = 4;
    }
}
