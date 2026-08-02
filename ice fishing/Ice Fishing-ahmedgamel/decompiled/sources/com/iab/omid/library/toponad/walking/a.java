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
    private final HashMap<View, String> f37077a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0172a> f37078b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f37079c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f37080d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f37081e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f37082f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f37083g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f37084h = new HashSet<>();
    private final Map<View, Boolean> i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f37085j;

    /* renamed from: com.iab.omid.library.toponad.walking.a$a, reason: collision with other inner class name */
    public static class C0172a {

        /* renamed from: a, reason: collision with root package name */
        private final e f37086a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f37087b = new ArrayList<>();

        public C0172a(e eVar, String str) {
            this.f37086a = eVar;
            a(str);
        }

        public e a() {
            return this.f37086a;
        }

        public ArrayList<String> b() {
            return this.f37087b;
        }

        public void a(String str) {
            this.f37087b.add(str);
        }
    }

    public View a(String str) {
        return this.f37079c.get(str);
    }

    public C0172a b(View view) {
        C0172a c0172a = this.f37078b.get(view);
        if (c0172a != null) {
            this.f37078b.remove(view);
        }
        return c0172a;
    }

    public String c(View view) {
        if (this.f37077a.size() == 0) {
            return null;
        }
        String str = this.f37077a.get(view);
        if (str != null) {
            this.f37077a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f37080d.contains(view) ? c.PARENT_VIEW : this.f37085j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
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
                            this.f37084h.add(adSessionId);
                        }
                        String a9 = a(c10, e9);
                        if (a9 == null) {
                            this.f37081e.add(adSessionId);
                            this.f37077a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a9 != "noWindowFocus") {
                            this.f37082f.add(adSessionId);
                            this.f37079c.put(adSessionId, c10);
                            this.f37083g.put(adSessionId, a9);
                        }
                    } else {
                        this.f37082f.add(adSessionId);
                        this.f37083g.put(adSessionId, "noAdView");
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
        return this.f37083g.get(str);
    }

    public HashSet<String> c() {
        return this.f37081e;
    }

    public void d() {
        this.f37085j = true;
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z6) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z6) {
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
        this.f37080d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f37082f;
    }

    public boolean c(String str) {
        return this.f37084h.contains(str);
    }

    public void a() {
        this.f37077a.clear();
        this.f37078b.clear();
        this.f37079c.clear();
        this.f37080d.clear();
        this.f37081e.clear();
        this.f37082f.clear();
        this.f37083g.clear();
        this.f37085j = false;
        this.f37084h.clear();
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
        C0172a c0172a = this.f37078b.get(view);
        if (c0172a != null) {
            c0172a.a(aVar.getAdSessionId());
        } else {
            this.f37078b.put(view, new C0172a(eVar, aVar.getAdSessionId()));
        }
    }
}
