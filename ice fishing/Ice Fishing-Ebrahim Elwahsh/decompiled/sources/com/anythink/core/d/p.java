package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.google.android.gms.internal.ads.CL;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17633a = "PlaceStrategySaver";

    /* renamed from: b, reason: collision with root package name */
    private final Context f17634b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17635c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17636d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17637e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f17638f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f17639g = new ConcurrentHashMap<>();

    public p(Context context) {
        this.f17634b = context;
    }

    private boolean f(String str, String str2) {
        return a(str, str2, 0) != null;
    }

    public final l a(String str, String str2) {
        int i = this.f17638f.get(CL.j(str, str2)) == null ? 2 : 0;
        l a9 = a(str, str2, i);
        return (a9 == null && i == 2) ? a(str, str2, 0) : a9 == null ? a(str, str2, 2) : a9;
    }

    public final void b(String str, String str2, int i) {
        String j9 = CL.j(str, str2);
        if (i == 1) {
            this.f17637e.remove(j9);
            return;
        }
        if (i == 2) {
            this.f17635c.remove(j9);
        }
        if (i == 0) {
            this.f17636d.remove(j9);
        }
        af.a(this.f17634b, u.b.f13004a, b(j9, i == 2));
    }

    public final l c(String str, String str2) {
        l a9;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Integer num = this.f17639g.get(str2);
        int intValue = num == null ? 0 : num.intValue();
        return (intValue != 1 || (a9 = a(str, str2, 0)) == null) ? a(str, str2, intValue) : a9;
    }

    public final void d(String str, String str2) {
        String j9 = CL.j(str, str2);
        Integer num = this.f17638f.get(j9);
        if (num == null) {
            this.f17638f.put(j9, 1);
        } else {
            this.f17638f.put(j9, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int e(String str, String str2) {
        String j9 = CL.j(str, str2);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f17638f;
        Integer num = concurrentHashMap != null ? concurrentHashMap.get(j9) : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final l a(String str, String str2, int i) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        String j9 = CL.j(str, str2);
        if (i == 1) {
            concurrentHashMap = this.f17637e;
        } else if (i == 2) {
            concurrentHashMap = this.f17635c;
        } else {
            concurrentHashMap = this.f17636d;
        }
        l lVar = concurrentHashMap.get(j9);
        if (lVar != null) {
            return lVar;
        }
        if (i == 1) {
            return null;
        }
        String c4 = af.c(this.f17634b, u.b.f13004a, b(j9, i == 2), "");
        if (!TextUtils.isEmpty(c4)) {
            try {
                l a9 = l.a(str2, new JSONObject(c4));
                if (a9 != null) {
                    a9.a(i);
                    concurrentHashMap.put(j9, a9);
                    return a9;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final boolean b(String str, String str2) {
        return this.f17638f.get(CL.j(str, str2)) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z8) {
        return CL.k(str, "_", z8 ? u.a.f12990m : u.a.f12989l);
    }

    public final void a(String str, String str2, l lVar, final JSONObject jSONObject, int i) {
        final boolean z8;
        if (this.f17634b == null || lVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String j9 = CL.j(str, str2);
        if (i == 1) {
            this.f17637e.put(j9, lVar);
            return;
        }
        if (i == 2) {
            this.f17635c.put(j9, lVar);
            z8 = true;
        } else {
            this.f17636d.put(j9, lVar);
            z8 = false;
        }
        if (lVar.D() != 1 && !lVar.br()) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.d.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    af.b(p.this.f17634b, u.b.f13004a, p.b(j9, z8), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            });
        } else if (com.anythink.core.common.d.t.b().P()) {
            Log.e("anythink", "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
        }
    }

    public final void a(String str, int i) {
        this.f17639g.put(str, Integer.valueOf(i));
    }
}
