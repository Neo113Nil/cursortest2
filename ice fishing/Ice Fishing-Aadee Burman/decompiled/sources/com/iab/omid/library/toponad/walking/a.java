package com.iab.omid.library.toponad.walking;

import android.view.View;
import com.iab.omid.library.toponad.internal.e;
import com.iab.omid.library.toponad.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f36310a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0172a> f36311b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36312c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36313d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36314e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36315f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36316g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f36317h = new HashSet<>();
    private final Map<View, Boolean> i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f36318j;

    /* renamed from: com.iab.omid.library.toponad.walking.a$a, reason: collision with other inner class name */
    public static class C0172a {

        /* renamed from: a, reason: collision with root package name */
        private final e f36319a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36320b = new ArrayList<>();

        public C0172a(e eVar, String str) {
            this.f36319a = eVar;
            a(str);
        }

        public e a() {
            return this.f36319a;
        }

        public ArrayList<String> b() {
            return this.f36320b;
        }

        public void a(String str) {
            this.f36320b.add(str);
        }
    }

    public View a(String str) {
        return this.f36312c.get(str);
    }

    public C0172a b(View view) {
        C0172a c0172a = this.f36311b.get(view);
        if (c0172a != null) {
            this.f36311b.remove(view);
        }
        return c0172a;
    }

    public String c(View view) {
        if (this.f36310a.size() == 0) {
            return null;
        }
        String str = this.f36310a.get(view);
        if (str != null) {
            this.f36310a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f36313d.contains(view) ? c.PARENT_VIEW : this.f36318j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.toponad.internal.c c9 = com.iab.omid.library.toponad.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : c9.a()) {
                View c10 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c10 != null) {
                        boolean e9 = h.e(c10);
                        if (e9) {
                            this.f36317h.add(adSessionId);
                        }
                        String a9 = a(c10, e9);
                        if (a9 == null) {
                            this.f36314e.add(adSessionId);
                            this.f36310a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a9 != "noWindowFocus") {
                            this.f36315f.add(adSessionId);
                            this.f36312c.put(adSessionId, c10);
                            this.f36316g.put(adSessionId, a9);
                        }
                    } else {
                        this.f36315f.add(adSessionId);
                        this.f36316g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.i.remove(view);
            return Boolean.FALSE;
        }
        if (this.i.containsKey(view)) {
            return this.i.get(view);
        }
        Map<View, Boolean> map = this.i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f36316g.get(str);
    }

    public HashSet<String> c() {
        return this.f36314e;
    }

    public void d() {
        this.f36318j = true;
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z3) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z3) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a9 = h.a(view);
            if (a9 != null) {
                return a9;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f36313d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f36315f;
    }

    public boolean c(String str) {
        return this.f36317h.contains(str);
    }

    public void a() {
        this.f36310a.clear();
        this.f36311b.clear();
        this.f36312c.clear();
        this.f36313d.clear();
        this.f36314e.clear();
        this.f36315f.clear();
        this.f36316g.clear();
        this.f36318j = false;
        this.f36317h.clear();
    }

    private void a(com.iab.omid.library.toponad.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.toponad.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0172a c0172a = this.f36311b.get(view);
        if (c0172a != null) {
            c0172a.a(aVar.getAdSessionId());
        } else {
            this.f36311b.put(view, new C0172a(eVar, aVar.getAdSessionId()));
        }
    }
}
