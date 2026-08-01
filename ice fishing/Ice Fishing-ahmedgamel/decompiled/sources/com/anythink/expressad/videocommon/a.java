package com.anythink.expressad.videocommon;

import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22197a = "TemplateWebviewCache";

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22198b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22199c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22200d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22201e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22202f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22203g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22204h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0142a> i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22205j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0142a> f22206k = new ConcurrentHashMap<>();

    /* renamed from: com.anythink.expressad.videocommon.a$a, reason: collision with other inner class name */
    public static class C0142a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f22211a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22212b;

        public final WindVaneWebView a() {
            return this.f22211a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f22211a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public final boolean c() {
            return this.f22212b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f22211a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f22211a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z3) {
            this.f22212b = z3;
        }
    }

    public static C0142a a(String str) {
        if (f22204h.containsKey(str)) {
            return f22204h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (f22205j.containsKey(str)) {
            return f22205j.get(str);
        }
        if (f22206k.containsKey(str)) {
            return f22206k.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f22204h.containsKey(str)) {
            f22204h.remove(str);
        }
        if (f22205j.containsKey(str)) {
            f22205j.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (f22206k.containsKey(str)) {
            f22206k.remove(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            f22204h.clear();
        } else {
            for (String str2 : f22204h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f22204h.remove(str2);
                }
            }
        }
        i.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0142a> entry : f22204h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f22204h.remove(entry.getKey());
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
        for (Map.Entry<String, C0142a> entry : f22205j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22205j.remove(entry.getKey());
            }
        }
    }

    private static void g(String str) {
        for (Map.Entry<String, C0142a> entry : f22206k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                f22206k.remove(entry.getKey());
            }
        }
    }

    private static void c() {
        f22204h.clear();
    }

    public static void a(String str, C0142a c0142a, boolean z3, boolean z6) {
        if (z3) {
            if (z6) {
                i.put(str, c0142a);
                return;
            } else {
                f22204h.put(str, c0142a);
                return;
            }
        }
        if (z6) {
            f22206k.put(str, c0142a);
        } else {
            f22205j.put(str, c0142a);
        }
    }

    public static void b() {
        f22205j.clear();
        f22206k.clear();
    }

    public static void b(int i6, d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String ac = dVar.ac();
            if (i6 == 94) {
                if (dVar.B()) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap = f22199c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(ac);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22202f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(ac);
                    return;
                }
                return;
            }
            if (i6 != 287) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22198b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(ac);
                    return;
                }
                return;
            }
            if (dVar.B()) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap4 = f22200d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(ac);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap5 = f22203g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(ac);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    public static void a() {
        f22204h.clear();
        i.clear();
    }

    private static void a(String str, boolean z3, boolean z6) {
        if (z3) {
            if (z6) {
                for (Map.Entry<String, C0142a> entry : i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0142a> entry2 : f22204h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f22204h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z6) {
            for (Map.Entry<String, C0142a> entry3 : f22206k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    f22206k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, C0142a> entry4 : f22205j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                f22205j.remove(entry4.getKey());
            }
        }
    }

    public static void b(int i6) {
        try {
            if (i6 == 94) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap = f22202f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i6 != 287) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22198b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22203g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    public static C0142a a(int i6, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String ac = dVar.ac();
            if (i6 != 94) {
                if (i6 != 287) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap = f22198b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f22198b.get(ac);
                    }
                } else if (dVar.B()) {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22200d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return f22200d.get(ac);
                    }
                } else {
                    ConcurrentHashMap<String, C0142a> concurrentHashMap3 = f22203g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f22203g.get(ac);
                    }
                }
            } else if (dVar.B()) {
                ConcurrentHashMap<String, C0142a> concurrentHashMap4 = f22199c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f22199c.get(ac);
                }
            } else {
                ConcurrentHashMap<String, C0142a> concurrentHashMap5 = f22202f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f22202f.get(ac);
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i6, String str, C0142a c0142a) {
        try {
            if (i6 == 94) {
                if (f22202f == null) {
                    f22202f = new ConcurrentHashMap<>();
                }
                f22202f.put(str, c0142a);
            } else if (i6 != 287) {
                if (f22198b == null) {
                    f22198b = new ConcurrentHashMap<>();
                }
                f22198b.put(str, c0142a);
            } else {
                if (f22203g == null) {
                    f22203g = new ConcurrentHashMap<>();
                }
                f22203g.put(str, c0142a);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private static ConcurrentHashMap<String, C0142a> a(int i6, boolean z3) {
        if (i6 == 94) {
            return z3 ? f22199c : f22202f;
        }
        if (i6 != 287) {
            return f22198b;
        }
        return z3 ? f22200d : f22203g;
    }

    public static void a(int i6) {
        ConcurrentHashMap<String, C0142a> concurrentHashMap;
        try {
            if (i6 != 94) {
                if (i6 == 287 && (concurrentHashMap = f22200d) != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0142a> concurrentHashMap2 = f22199c;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    public static void a(int i6, String str, C0142a c0142a) {
        try {
            if (i6 == 94) {
                if (f22199c == null) {
                    f22199c = new ConcurrentHashMap<>();
                }
                f22199c.put(str, c0142a);
            } else {
                if (i6 != 287) {
                    return;
                }
                if (f22200d == null) {
                    f22200d = new ConcurrentHashMap<>();
                }
                f22200d.put(str, c0142a);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }
}
