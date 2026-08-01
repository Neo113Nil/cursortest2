package com.anythink.basead.b.c;

import android.text.TextUtils;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5943a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5944b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5945c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, Integer> f5946d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, MraidWebView> f5947e = new ConcurrentHashMap<>(3);

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, WTWebView> f5948f = new ConcurrentHashMap<>(3);

    public static boolean a(String str) {
        Integer num = f5946d.get(str);
        return num != null && num.intValue() == 0;
    }

    public static MraidWebView b(String str) {
        return f5947e.remove(str);
    }

    public static WTWebView c(String str) {
        return f5948f.remove(str);
    }

    public static WTWebView d(String str) {
        return f5948f.get(str);
    }

    public static void e(String str) {
        final WTWebView c9 = c(str);
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.d.1
            @Override // java.lang.Runnable
            public final void run() {
                WTWebView wTWebView = WTWebView.this;
                if (wTWebView != null) {
                    wTWebView.release();
                }
            }
        });
    }

    public static boolean f(String str) {
        return b(str, 1);
    }

    public static String b(x xVar, w wVar) {
        return a(xVar, wVar, 2);
    }

    private static boolean c(w wVar) {
        if (TextUtils.isEmpty(wVar.B())) {
            return false;
        }
        return com.anythink.core.common.res.d.a(t.b().g()).b(1, o.a(wVar.B()));
    }

    public static void a(String str, int i) {
        Integer num = f5946d.get(str);
        if (num == null || num.intValue() < i) {
            f5946d.put(str, Integer.valueOf(i));
        }
    }

    public static boolean b(w wVar) {
        if (wVar != null && wVar.ao() == 3) {
            if (a(wVar)) {
                return true;
            }
            if (wVar.r() != null && wVar.r().bE() != 1 && !TextUtils.isEmpty(com.anythink.core.common.res.d.a(t.b().g()).a(wVar.an()))) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, MraidWebView mraidWebView) {
        f5947e.put(str, mraidWebView);
    }

    public static void a(String str, WTWebView wTWebView) {
        f5948f.put(str, wTWebView);
    }

    public static boolean a(w wVar) {
        if (wVar != null) {
            return f5948f.containsKey(a((x) null, wVar, 3));
        }
        return false;
    }

    public static boolean a(x xVar, w wVar) {
        if (xVar == null || wVar == null) {
            return false;
        }
        return f5947e.containsKey(a(xVar, wVar, 2));
    }

    public static boolean b(String str, int i) {
        return com.anythink.core.common.res.d.a(t.b().g()).b(i, o.a(str));
    }

    public static String a(x xVar, w wVar, int i) {
        if (xVar != null) {
            return xVar.f14158d + "_" + wVar.v() + "_" + i;
        }
        return wVar.q() + "_" + wVar.v() + "_" + i;
    }

    public static boolean a(w wVar, y yVar) {
        int ac = yVar.ac();
        String E8 = wVar.E();
        if (TextUtils.isEmpty(E8)) {
            return false;
        }
        if (ac == 0) {
            return true;
        }
        boolean a9 = com.anythink.core.common.a.o.a().a(E8, ac);
        if (a9) {
            h.a(wVar, yVar);
        }
        return a9;
    }

    public static boolean a(w wVar, x xVar) {
        if (wVar == null) {
            return false;
        }
        if (wVar.aa() == -1) {
            s c9 = t.b().c();
            if (c9 != null && c9.a()) {
                c9.fillDataFetchStatus(t.b().g(), wVar, xVar);
            } else {
                wVar.m(0);
            }
        }
        y yVar = xVar.f14168o;
        if (wVar.r() != null) {
            yVar = wVar.r();
        }
        return a(wVar, xVar.f14163j, yVar);
    }

    public static boolean a(w wVar, int i, y yVar) {
        boolean c9;
        if (TextUtils.equals(String.valueOf(i), "1")) {
            if (!TextUtils.isEmpty(wVar.E())) {
                boolean a9 = a(wVar, yVar);
                return wVar.ao() == 3 ? a9 && (yVar.bF() == 1 || b(wVar)) : a9;
            }
            if (yVar.ap() != 1 && yVar.aq() <= 0) {
                return c(wVar);
            }
            if (TextUtils.isEmpty(wVar.B())) {
                return wVar.ao() == 2 && yVar.aq() == 1;
            }
            return c(wVar);
        }
        if (TextUtils.equals(String.valueOf(i), "3")) {
            if (wVar.J() == 1 && !TextUtils.isEmpty(wVar.E())) {
                c9 = a(wVar, yVar);
            } else {
                if (wVar.ao() == 2) {
                    return true;
                }
                c9 = c(wVar);
            }
            return wVar.ao() == 3 ? c9 && (yVar.bF() == 1 || b(wVar)) : c9;
        }
        if (!TextUtils.equals(String.valueOf(i), "4") || wVar.ao() == 2) {
            return true;
        }
        boolean z3 = a(wVar, yVar) || c(wVar);
        return wVar.ao() == 3 ? z3 && (yVar.bF() == 1 || b(wVar)) : z3;
    }
}
