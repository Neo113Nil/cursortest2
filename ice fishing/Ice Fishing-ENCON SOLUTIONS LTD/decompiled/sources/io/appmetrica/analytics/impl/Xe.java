package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class Xe {

    /* renamed from: c, reason: collision with root package name */
    public static final String f5392c = "Xe";

    /* renamed from: a, reason: collision with root package name */
    public final Ha f5393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5394b;

    public Xe(Ha ha, String str) {
        this.f5393a = ha;
        this.f5394b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, float f2) {
        synchronized (this) {
            this.f5393a.a(str, f2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, String str2) {
        synchronized (this) {
            this.f5393a.a(str, str2);
        }
        return this;
    }

    public final Ye c(String str) {
        return new Ye(str, this.f5394b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T d(String str) {
        synchronized (this) {
            this.f5393a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f5393a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f5393a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, long j2) {
        synchronized (this) {
            this.f5393a.a(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, int i2) {
        synchronized (this) {
            this.f5393a.a(i2, str);
        }
        return this;
    }

    public final <T extends Xe> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j2) {
        return this.f5393a.getLong(str, j2);
    }

    public final int a(String str, int i2) {
        return this.f5393a.getInt(str, i2);
    }

    public final String a(String str, String str2) {
        return this.f5393a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, boolean z2) {
        synchronized (this) {
            this.f5393a.a(str, z2);
        }
        return this;
    }

    public final boolean a(String str, boolean z2) {
        return this.f5393a.getBoolean(str, z2);
    }

    public final void b() {
        synchronized (this) {
            this.f5393a.b();
        }
    }

    public final boolean b(String str) {
        return this.f5393a.a(str);
    }
}
