package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, Boolean> f22469b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f22470a;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f22471c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f22472d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f22473e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static l f22474a = new l(0);

        private a() {
        }
    }

    public /* synthetic */ l(byte b9) {
        this();
    }

    public static l a() {
        return a.f22474a;
    }

    public static void c(String str) {
        if (f22469b == null) {
            f22469b = new ConcurrentHashMap<>();
        }
        f22469b.put(str, Boolean.TRUE);
    }

    private void e(String str) {
        if (this.f22472d == null) {
            this.f22472d = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f22472d.put(str, Boolean.FALSE);
    }

    private void f(String str) {
        if (this.f22473e.containsKey(str)) {
            this.f22473e.remove(str);
        }
    }

    private static boolean g(String str) {
        boolean a9 = a(f22469b, str);
        if (a9 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.c().e()).b(str)) {
            return true;
        }
        return a9;
    }

    private static boolean h(String str) {
        String d2 = com.anythink.expressad.foundation.h.p.d(str);
        StringBuilder sb = new StringBuilder();
        sb.append(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC));
        File file = new File(AbstractC5051n.g(sb, File.separator, d2));
        try {
            if (file.exists() && file.isFile()) {
                return file.canRead();
            }
            return false;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17776a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public final boolean b(String str) {
        if (this.f22471c == null || TextUtils.isEmpty(str) || !this.f22471c.containsKey(str)) {
            return false;
        }
        return this.f22471c.get(str).booleanValue();
    }

    public final boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.f22473e.containsKey(str)) {
            return this.f22473e.get(str).booleanValue();
        }
        return false;
    }

    private l() {
        this.f22470a = new ConcurrentHashMap<>();
        this.f22471c = new ConcurrentHashMap<>();
        this.f22472d = new ConcurrentHashMap<>();
        this.f22473e = new ConcurrentHashMap<>();
    }

    public final boolean a(String str) {
        if (this.f22470a == null || TextUtils.isEmpty(str) || !this.f22470a.containsKey(str)) {
            return false;
        }
        return this.f22470a.get(str).booleanValue();
    }

    public final void b(String str, boolean z8) {
        if (this.f22471c == null) {
            this.f22471c = new ConcurrentHashMap<>();
        }
        this.f22471c.put(str, Boolean.valueOf(z8));
    }

    public final void a(CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        Iterator<com.anythink.expressad.foundation.d.d> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.d next = it.next();
            if (next != null) {
                b(next);
                e(next.bh());
            }
        }
    }

    public final void c(String str, boolean z8) {
        if (this.f22473e == null) {
            this.f22473e = new ConcurrentHashMap<>();
        }
        this.f22473e.put(str, Boolean.valueOf(z8));
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        List<d.c.a> f6;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
        if (dVar != null) {
            String T8 = dVar.T();
            if (!TextUtils.isEmpty(T8) && (concurrentHashMap2 = this.f22470a) != null && !concurrentHashMap2.containsKey(T8)) {
                this.f22470a.put(T8, Boolean.FALSE);
            }
            String J = dVar.J();
            if (!TextUtils.isEmpty(J) && (concurrentHashMap = this.f22471c) != null && !concurrentHashMap.containsKey(J)) {
                this.f22471c.put(J, Boolean.FALSE);
            }
            d.c N8 = dVar.N();
            if (N8 == null || (f6 = N8.f()) == null) {
                return;
            }
            for (d.c.a aVar : f6) {
                if (aVar != null) {
                    a(aVar.f18801b);
                }
            }
        }
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            b(dVar);
            e(dVar.bh());
        }
    }

    public final void a(String str, boolean z8) {
        if (this.f22470a == null) {
            this.f22470a = new ConcurrentHashMap<>();
        }
        this.f22470a.put(str, Boolean.valueOf(z8));
    }

    private static void a(List<String> list) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (concurrentHashMap = f22469b) != null && !concurrentHashMap.containsKey(str)) {
                boolean b9 = com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.c().e()).b(str);
                if (!TextUtils.isEmpty(str)) {
                    f22469b.put(str, Boolean.valueOf(b9));
                }
            }
        }
    }

    private static boolean a(ConcurrentHashMap<String, Boolean> concurrentHashMap, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (concurrentHashMap != null) {
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str).booleanValue();
            }
            concurrentHashMap.put(str, Boolean.FALSE);
            return false;
        }
        new ConcurrentHashMap().put(str, Boolean.FALSE);
        return false;
    }

    private boolean a(boolean z8, String str) {
        boolean a9 = a(this.f22471c, str);
        if (a9 || !z8 || TextUtils.isEmpty(i.a().b(str))) {
            return a9;
        }
        this.f22471c.put(str, Boolean.TRUE);
        return true;
    }

    private static boolean a(d.c cVar) {
        List<d.c.a> f6;
        List<String> list;
        if (cVar != null && (f6 = cVar.f()) != null) {
            for (d.c.a aVar : f6) {
                if (aVar != null && (list = aVar.f18801b) != null) {
                    for (String str : list) {
                        boolean a9 = a(f22469b, str);
                        if (a9 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.c().e()).b(str)) {
                            a9 = true;
                        }
                        if (!a9) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
