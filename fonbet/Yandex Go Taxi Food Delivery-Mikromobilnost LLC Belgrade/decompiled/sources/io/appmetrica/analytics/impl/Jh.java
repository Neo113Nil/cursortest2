package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public abstract class Jh implements So {
    public static final String c = "Jh";
    public final InterfaceC0418ic a;
    public final String b;

    public Jh(InterfaceC0418ic interfaceC0418ic, String str) {
        this.a = interfaceC0418ic;
        this.b = str;
    }

    public abstract /* synthetic */ int a(String str, int i);

    public abstract /* synthetic */ long a(String str, long j);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T a(String str, String[] strArr) {
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
        this.a.a(str, str2);
        return this;
    }

    public abstract /* synthetic */ String a(String str, String str2);

    public abstract /* synthetic */ boolean a(String str, boolean z);

    public abstract /* synthetic */ So b(String str, int i);

    public abstract /* synthetic */ So b(String str, long j);

    public abstract /* synthetic */ So b(String str, String str2);

    public abstract /* synthetic */ So b(String str, boolean z);

    public abstract /* synthetic */ boolean b(String str);

    public final long c(String str, long j) {
        return this.a.getLong(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T d(String str, String str2) {
        synchronized (this) {
            this.a.a(str, str2);
        }
        return this;
    }

    public abstract /* synthetic */ So e(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T f(String str) {
        synchronized (this) {
            this.a.remove(str);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.So, io.appmetrica.analytics.impl.es
    public void flushAsync() {
        this.a.flushAsync();
    }

    public final int c(String str, int i) {
        return this.a.getInt(str, i);
    }

    public Jh(InterfaceC0418ic interfaceC0418ic) {
        this(interfaceC0418ic, null);
    }

    public final String c(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public final boolean c(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public final boolean c(String str) {
        return this.a.a(str);
    }

    public Set<String> c() {
        return this.a.b();
    }

    public final Kh d(String str) {
        return new Kh(str, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T d(String str, long j) {
        synchronized (this) {
            this.a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T d(String str, int i) {
        synchronized (this) {
            this.a.a(str, i);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T d(String str, boolean z) {
        synchronized (this) {
            this.a.a(str, z);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Jh> T a(String str, float f) {
        synchronized (this) {
            this.a.a(str, f);
        }
        return this;
    }

    public final <T extends Jh> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public void a() {
        synchronized (this) {
            this.a.a();
        }
    }
}
