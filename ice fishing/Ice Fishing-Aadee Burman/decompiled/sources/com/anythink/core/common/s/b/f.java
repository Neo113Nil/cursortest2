package com.anythink.core.common.s.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16407a = "f";

    /* renamed from: b, reason: collision with root package name */
    private final Context f16408b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16409c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16410d;

    public f(com.anythink.core.common.s.c cVar) {
        this.f16408b = cVar.a();
        this.f16409c = cVar.b();
        this.f16410d = cVar.d();
    }

    private static boolean a(int i) {
        return i != 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v9) {
        if (this.f16408b != null && !TextUtils.isEmpty(this.f16409c) && !TextUtils.isEmpty(str) && v9 != 0) {
            try {
                SharedPreferences sharedPreferences = this.f16408b.getSharedPreferences(this.f16409c, 0);
                return v9 instanceof String ? (V) sharedPreferences.getString(str, (String) v9) : v9 instanceof Integer ? (V) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) v9).intValue())) : v9 instanceof Long ? (V) Long.valueOf(sharedPreferences.getLong(str, ((Long) v9).longValue())) : v9 instanceof Double ? (V) Double.valueOf(sharedPreferences.getFloat(str, Float.parseFloat(v9.toString()))) : v9 instanceof Float ? (V) Float.valueOf(sharedPreferences.getFloat(str, ((Float) v9).floatValue())) : v9 instanceof Boolean ? (V) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) v9).booleanValue())) : v9;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v9;
    }

    public final String c() {
        return this.f16409c;
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9) {
        a(str, v9, this.f16410d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9, int i) {
        if (this.f16408b == null || TextUtils.isEmpty(this.f16409c) || TextUtils.isEmpty(str) || v9 == 0) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16408b.getSharedPreferences(this.f16409c, 0).edit();
            String obj = v9.toString();
            if (v9 instanceof String) {
                edit.putString(str, (String) v9);
            } else if (v9 instanceof Integer) {
                edit.putInt(str, Integer.parseInt(obj));
            } else if (v9 instanceof Long) {
                edit.putLong(str, Long.parseLong(obj));
            } else if (v9 instanceof Double) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v9 instanceof Float) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v9 instanceof Boolean) {
                edit.putBoolean(str, Boolean.parseBoolean(obj));
            }
            if (a(i)) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        if (this.f16408b == null || TextUtils.isEmpty(this.f16409c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16408b.getSharedPreferences(this.f16409c, 0).edit();
            edit.remove(str);
            edit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        if (this.f16408b != null && !TextUtils.isEmpty(this.f16409c)) {
            try {
                return this.f16408b.getSharedPreferences(this.f16409c, 0).getAll();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        if (this.f16408b == null || TextUtils.isEmpty(this.f16409c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16408b.getSharedPreferences(this.f16409c, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        if (this.f16408b != null && !TextUtils.isEmpty(this.f16409c)) {
            try {
                return this.f16408b.getSharedPreferences(this.f16409c, 0).contains(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }
}
