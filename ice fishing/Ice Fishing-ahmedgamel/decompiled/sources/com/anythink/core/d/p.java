package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.google.android.gms.internal.ads.Wv;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18262a = "PlaceStrategySaver";

    /* renamed from: b, reason: collision with root package name */
    private final Context f18263b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f18264c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f18265d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f18266e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f18267f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f18268g = new ConcurrentHashMap<>();

    public p(Context context) {
        this.f18263b = context;
    }

    private boolean f(String str, String str2) {
        return a(str, str2, 0) != null;
    }

    public final l a(String str, String str2) {
        int i = this.f18267f.get(Wv.g(str, str2)) == null ? 2 : 0;
        l a9 = a(str, str2, i);
        return (a9 == null && i == 2) ? a(str, str2, 0) : a9 == null ? a(str, str2, 2) : a9;
    }

    public final void b(String str, String str2, int i) {
        String g9 = Wv.g(str, str2);
        if (i == 1) {
            this.f18266e.remove(g9);
            return;
        }
        if (i == 2) {
            this.f18264c.remove(g9);
        }
        if (i == 0) {
            this.f18265d.remove(g9);
        }
        af.a(this.f18263b, u.b.f13633a, b(g9, i == 2));
    }

    public final l c(String str, String str2) {
        l a9;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Integer num = this.f18268g.get(str2);
        int intValue = num == null ? 0 : num.intValue();
        return (intValue != 1 || (a9 = a(str, str2, 0)) == null) ? a(str, str2, intValue) : a9;
    }

    public final void d(String str, String str2) {
        String g9 = Wv.g(str, str2);
        Integer num = this.f18267f.get(g9);
        if (num == null) {
            this.f18267f.put(g9, 1);
        } else {
            this.f18267f.put(g9, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int e(String str, String str2) {
        String g9 = Wv.g(str, str2);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f18267f;
        Integer num = concurrentHashMap != null ? concurrentHashMap.get(g9) : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final l a(String str, String str2, int i) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        String g9 = Wv.g(str, str2);
        if (i == 1) {
            concurrentHashMap = this.f18266e;
        } else if (i == 2) {
            concurrentHashMap = this.f18264c;
        } else {
            concurrentHashMap = this.f18265d;
        }
        l lVar = concurrentHashMap.get(g9);
        if (lVar != null) {
            return lVar;
        }
        if (i == 1) {
            return null;
        }
        String c9 = af.c(this.f18263b, u.b.f13633a, b(g9, i == 2), "");
        if (!TextUtils.isEmpty(c9)) {
            try {
                l a9 = l.a(str2, new JSONObject(c9));
                if (a9 != null) {
                    a9.a(i);
                    concurrentHashMap.put(g9, a9);
                    return a9;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final boolean b(String str, String str2) {
        return this.f18267f.get(Wv.g(str, str2)) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z6) {
        return Wv.h(str, "_", z6 ? u.a.f13619m : u.a.f13618l);
    }

    public final void a(String str, String str2, l lVar, final JSONObject jSONObject, int i) {
        final boolean z6;
        if (this.f18263b == null || lVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String g9 = Wv.g(str, str2);
        if (i == 1) {
            this.f18266e.put(g9, lVar);
            return;
        }
        if (i == 2) {
            this.f18264c.put(g9, lVar);
            z6 = true;
        } else {
            this.f18265d.put(g9, lVar);
            z6 = false;
        }
        if (lVar.D() != 1 && !lVar.br()) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.d.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    af.b(p.this.f18263b, u.b.f13633a, p.b(g9, z6), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            });
        } else if (com.anythink.core.common.d.t.b().P()) {
            Log.e("anythink", "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
        }
    }

    public final void a(String str, int i) {
        this.f18268g.put(str, Integer.valueOf(i));
    }
}
