package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17475a = "PlaceStrategySaver";

    /* renamed from: b, reason: collision with root package name */
    private final Context f17476b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17477c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17478d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f17479e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f17480f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f17481g = new ConcurrentHashMap<>();

    public p(Context context) {
        this.f17476b = context;
    }

    private boolean f(String str, String str2) {
        return a(str, str2, 0) != null;
    }

    public final l a(String str, String str2) {
        int i = this.f17480f.get(AbstractC4404f.f(str, str2)) == null ? 2 : 0;
        l a9 = a(str, str2, i);
        return (a9 == null && i == 2) ? a(str, str2, 0) : a9 == null ? a(str, str2, 2) : a9;
    }

    public final void b(String str, String str2, int i) {
        String f3 = AbstractC4404f.f(str, str2);
        if (i == 1) {
            this.f17479e.remove(f3);
            return;
        }
        if (i == 2) {
            this.f17477c.remove(f3);
        }
        if (i == 0) {
            this.f17478d.remove(f3);
        }
        af.a(this.f17476b, u.b.f12847a, b(f3, i == 2));
    }

    public final l c(String str, String str2) {
        l a9;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Integer num = this.f17481g.get(str2);
        int intValue = num == null ? 0 : num.intValue();
        return (intValue != 1 || (a9 = a(str, str2, 0)) == null) ? a(str, str2, intValue) : a9;
    }

    public final void d(String str, String str2) {
        String f3 = AbstractC4404f.f(str, str2);
        Integer num = this.f17480f.get(f3);
        if (num == null) {
            this.f17480f.put(f3, 1);
        } else {
            this.f17480f.put(f3, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int e(String str, String str2) {
        String f3 = AbstractC4404f.f(str, str2);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f17480f;
        Integer num = concurrentHashMap != null ? concurrentHashMap.get(f3) : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final l a(String str, String str2, int i) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        String f3 = AbstractC4404f.f(str, str2);
        if (i == 1) {
            concurrentHashMap = this.f17479e;
        } else if (i == 2) {
            concurrentHashMap = this.f17477c;
        } else {
            concurrentHashMap = this.f17478d;
        }
        l lVar = concurrentHashMap.get(f3);
        if (lVar != null) {
            return lVar;
        }
        if (i == 1) {
            return null;
        }
        String c9 = af.c(this.f17476b, u.b.f12847a, b(f3, i == 2), "");
        if (!TextUtils.isEmpty(c9)) {
            try {
                l a9 = l.a(str2, new JSONObject(c9));
                if (a9 != null) {
                    a9.a(i);
                    concurrentHashMap.put(f3, a9);
                    return a9;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final boolean b(String str, String str2) {
        return this.f17480f.get(AbstractC4404f.f(str, str2)) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z3) {
        return AbstractC4404f.g(str, "_", z3 ? u.a.f12833m : u.a.f12832l);
    }

    public final void a(String str, String str2, l lVar, final JSONObject jSONObject, int i) {
        final boolean z3;
        if (this.f17476b == null || lVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String f3 = AbstractC4404f.f(str, str2);
        if (i == 1) {
            this.f17479e.put(f3, lVar);
            return;
        }
        if (i == 2) {
            this.f17477c.put(f3, lVar);
            z3 = true;
        } else {
            this.f17478d.put(f3, lVar);
            z3 = false;
        }
        if (lVar.D() != 1 && !lVar.br()) {
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.d.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    af.b(p.this.f17476b, u.b.f12847a, p.b(f3, z3), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            });
        } else if (com.anythink.core.common.d.t.b().P()) {
            Log.e("anythink", "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
        }
    }

    public final void a(String str, int i) {
        this.f17481g.put(str, Integer.valueOf(i));
    }
}
