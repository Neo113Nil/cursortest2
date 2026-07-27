package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3151ea {

    /* renamed from: a, reason: collision with root package name */
    public final int f30436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30437b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30438c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30440e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151ea(int i, String str, Object obj, Object obj2, int i4) {
        this(i, str, obj, obj2);
        this.f30440e = i4;
    }

    public static C3151ea e(int i, int i4, String str) {
        return new C3151ea(1, str, Integer.valueOf(i), Integer.valueOf(i4), 1);
    }

    public static C3151ea f(String str, long j9, long j10) {
        return new C3151ea(1, str, Long.valueOf(j9), Long.valueOf(j10), 2);
    }

    public static C3151ea g(String str, float f6, float f9) {
        return new C3151ea(1, str, Float.valueOf(f6), Float.valueOf(f9), 3);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) q2.r.f40116e.f40117a.f34631v).add(new C3151ea(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) q2.r.f40116e.f40117a.f34632w).add(new C3151ea(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f30440e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f30437b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f30437b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f30437b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f30437b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f30437b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f30440e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f30437b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f30437b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f30437b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f30437b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f30437b, (String) c());
        }
    }

    public final Object c() {
        return q2.r.f40116e.f40119c.i ? this.f30439d : this.f30438c;
    }

    public final Object d() {
        return q2.r.f40116e.f40119c.a(this);
    }

    public C3151ea(int i, String str, Object obj, Object obj2) {
        this.f30436a = i;
        this.f30437b = str;
        this.f30438c = obj;
        this.f30439d = obj2;
        ((ArrayList) q2.r.f40116e.f40117a.f34630u).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3151ea(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f30440e = 4;
    }
}
