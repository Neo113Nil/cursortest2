package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22984a = "TemplateWebviewCache";

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22985b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22986c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22987d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22988e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22989f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22990g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22991h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0142a> i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22992j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22993k = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.expressad.videocommon.a$a, reason: collision with other inner class name */
    public static class C0142a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f22998a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22999b;

        public final WindVaneWebView a() {
            return this.f22998a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f22998a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public final boolean c() {
            return this.f22999b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f22998a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f22998a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z6) {
            this.f22999b = z6;
        }
    }

    public static C0142a a(String str) {
        if (f22991h.containsKey(str)) {
            return f22991h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (f22992j.containsKey(str)) {
            return f22992j.get(str);
        }
        if (f22993k.containsKey(str)) {
            return f22993k.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f22991h.containsKey(str)) {
            f22991h.remove(str);
        }
        if (f22992j.containsKey(str)) {
            f22992j.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (f22993k.containsKey(str)) {
            f22993k.remove(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            f22991h.clear();
        } else {
            for (String str2 : f22991h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f22991h.remove(str2);
                }
            }
        }
        i.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0142a> entry : f22991h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22991h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0142a> entry : i.entrySet()) {
            if (entry.getKey().contains(str)) {
                i.remove(entry.getKey());
            }
        }
    }

    private static void f(String str) {
        for (Map.Entry<String, C0142a> entry : f22992j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22992j.remove(entry.getKey());
            }
        }
    }

    private static void g(String str) {
        for (Map.Entry<String, C0142a> entry : f22993k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22993k.remove(entry.getKey());
            }
        }
    }

    private static void c() {
        f22991h.clear();
    }

    public static void a(String str, C0142a c0142a, boolean z6, boolean z9) {
        if (z6) {
            if (z9) {
                i.put(str, c0142a);
                return;
            } else {
                f22991h.put(str, c0142a);
                return;
            }
        }
        if (z9) {
            f22993k.put(str, c0142a);
        } else {
            f22992j.put(str, c0142a);
        }
    }

    public static void b() {
        f22992j.clear();
        f22993k.clear();
    }

    public static void b(int i4, d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String ac = dVar.ac();
            if (i4 == 94) {
                if (dVar.B()) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap = f22986c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(ac);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22989f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(ac);
                    return;
                }
                return;
            }
            if (i4 != 287) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22985b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(ac);
                    return;
                }
                return;
            }
            if (dVar.B()) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap4 = f22987d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(ac);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap5 = f22990g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(ac);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    public static void a() {
        f22991h.clear();
        i.clear();
    }

    private static void a(String str, boolean z6, boolean z9) {
        if (z6) {
            if (z9) {
                for (Map.Entry<String, C0142a> entry : i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0142a> entry2 : f22991h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f22991h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z9) {
            for (Map.Entry<String, C0142a> entry3 : f22993k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    f22993k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, C0142a> entry4 : f22992j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                f22992j.remove(entry4.getKey());
            }
        }
    }

    public static void b(int i4) {
        try {
            if (i4 == 94) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap = f22989f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i4 != 287) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22985b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22990g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    public static C0142a a(int i4, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String ac = dVar.ac();
            if (i4 != 94) {
                if (i4 != 287) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap = f22985b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f22985b.get(ac);
                    }
                } else if (dVar.B()) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22987d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return f22987d.get(ac);
                    }
                } else {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22990g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f22990g.get(ac);
                    }
                }
            } else if (dVar.B()) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap4 = f22986c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f22986c.get(ac);
                }
            } else {
                ConcurrentHashMap<String, C0142a> concurrentHashMap5 = f22989f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f22989f.get(ac);
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i4, String str, C0142a c0142a) {
        try {
            if (i4 == 94) {
                if (f22989f == null) {
                    f22989f = new ConcurrentHashMap<>();
                }
                f22989f.put(str, c0142a);
            } else if (i4 != 287) {
                if (f22985b == null) {
                    f22985b = new ConcurrentHashMap<>();
                }
                f22985b.put(str, c0142a);
            } else {
                if (f22990g == null) {
                    f22990g = new ConcurrentHashMap<>();
                }
                f22990g.put(str, c0142a);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    private static ConcurrentHashMap<String, C0142a> a(int i4, boolean z6) {
        if (i4 == 94) {
            return z6 ? f22986c : f22989f;
        }
        if (i4 != 287) {
            return f22985b;
        }
        return z6 ? f22987d : f22990g;
    }

    public static void a(int i4) {
        ConcurrentHashMap<String, C0142a> concurrentHashMap;
        try {
            if (i4 != 94) {
                if (i4 == 287 && (concurrentHashMap = f22987d) != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22986c;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    public static void a(int i4, String str, C0142a c0142a) {
        try {
            if (i4 == 94) {
                if (f22986c == null) {
                    f22986c = new ConcurrentHashMap<>();
                }
                f22986c.put(str, c0142a);
            } else {
                if (i4 != 287) {
                    return;
                }
                if (f22987d == null) {
                    f22987d = new ConcurrentHashMap<>();
                }
                f22987d.put(str, c0142a);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }
}
