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
    private final HashMap<View, String> f36472a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0171a> f36473b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f36474c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f36475d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f36476e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f36477f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f36478g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f36479h = new HashSet<>();
    private final Map<View, Boolean> i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f36480j;

    /* renamed from: com.iab.omid.library.toponad.walking.a$a, reason: collision with other inner class name */
    public static class C0171a {

        /* renamed from: a, reason: collision with root package name */
        private final e f36481a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f36482b = new ArrayList<>();

        public C0171a(e eVar, String str) {
            this.f36481a = eVar;
            a(str);
        }

        public e a() {
            return this.f36481a;
        }

        public ArrayList<String> b() {
            return this.f36482b;
        }

        public void a(String str) {
            this.f36482b.add(str);
        }
    }

    public View a(String str) {
        return this.f36474c.get(str);
    }

    public C0171a b(View view) {
        C0171a c0171a = this.f36473b.get(view);
        if (c0171a != null) {
            this.f36473b.remove(view);
        }
        return c0171a;
    }

    public String c(View view) {
        if (this.f36472a.size() == 0) {
            return null;
        }
        String str = this.f36472a.get(view);
        if (str != null) {
            this.f36472a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f36475d.contains(view) ? c.PARENT_VIEW : this.f36480j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.toponad.internal.c c4 = com.iab.omid.library.toponad.internal.c.c();
        if (c4 != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : c4.a()) {
                View c9 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c9 != null) {
                        boolean e6 = h.e(c9);
                        if (e6) {
                            this.f36479h.add(adSessionId);
                        }
                        String a9 = a(c9, e6);
                        if (a9 == null) {
                            this.f36476e.add(adSessionId);
                            this.f36472a.put(c9, adSessionId);
                            a(aVar);
                        } else if (a9 != "noWindowFocus") {
                            this.f36477f.add(adSessionId);
                            this.f36474c.put(adSessionId, c9);
                            this.f36478g.put(adSessionId, a9);
                        }
                    } else {
                        this.f36477f.add(adSessionId);
                        this.f36478g.put(adSessionId, "noAdView");
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
        return this.f36478g.get(str);
    }

    public HashSet<String> c() {
        return this.f36476e;
    }

    public void d() {
        this.f36480j = true;
    }

    public boolean e(View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z8) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z8) {
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
        this.f36475d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f36477f;
    }

    public boolean c(String str) {
        return this.f36479h.contains(str);
    }

    public void a() {
        this.f36472a.clear();
        this.f36473b.clear();
        this.f36474c.clear();
        this.f36475d.clear();
        this.f36476e.clear();
        this.f36477f.clear();
        this.f36478g.clear();
        this.f36480j = false;
        this.f36479h.clear();
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
        C0171a c0171a = this.f36473b.get(view);
        if (c0171a != null) {
            c0171a.a(aVar.getAdSessionId());
        } else {
            this.f36473b.put(view, new C0171a(eVar, aVar.getAdSessionId()));
        }
    }
}
