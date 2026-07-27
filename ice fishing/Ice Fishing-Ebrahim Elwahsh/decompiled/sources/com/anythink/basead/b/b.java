package com.anythink.basead.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.m.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final int f5860A = 27;

    /* renamed from: B, reason: collision with root package name */
    public static final int f5861B = 28;

    /* renamed from: C, reason: collision with root package name */
    public static final int f5862C = 29;

    /* renamed from: D, reason: collision with root package name */
    public static final int f5863D = 30;

    /* renamed from: E, reason: collision with root package name */
    public static final int f5864E = 31;

    /* renamed from: F, reason: collision with root package name */
    public static final int f5865F = 32;

    /* renamed from: G, reason: collision with root package name */
    public static final int f5866G = 33;

    /* renamed from: H, reason: collision with root package name */
    public static final int f5867H = 34;

    /* renamed from: I, reason: collision with root package name */
    public static final int f5868I = 35;
    public static final int J = 36;

    /* renamed from: a, reason: collision with root package name */
    public static final int f5869a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5870b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5871c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5872d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5873e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5874f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5875g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5876h = 8;
    public static final int i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5877j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5878k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5879l = 12;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5880m = 13;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5881n = 14;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5882o = 15;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5883p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5884q = 17;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5885r = 18;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5886s = 19;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5887t = 20;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5888u = 21;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5889v = 22;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5890w = 23;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5891x = 24;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5892y = 25;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5893z = 26;

    public static boolean a(Context context, x xVar, final w wVar, com.anythink.basead.d.e eVar, String str, com.anythink.core.common.k.b bVar) {
        try {
            s c4 = t.b().c();
            String str2 = (eVar == null || TextUtils.isEmpty(eVar.f6300c)) ? "" : eVar.f6300c;
            if (c4 != null && c4.a()) {
                final Context applicationContext = context.getApplicationContext();
                c4.handleOfferClick(applicationContext, xVar, wVar, str, str2, new Runnable() { // from class: com.anythink.basead.b.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (w.this instanceof bj) {
                            h.a(applicationContext).a();
                            h.a(applicationContext).a(w.this.v(), w.this);
                        }
                    }
                }, bVar);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(final int i4, final w wVar, final com.anythink.basead.d.j jVar) {
        if (wVar.c()) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                Thread.currentThread().getName();
                w wVar2 = wVar;
                if (wVar2 instanceof ay) {
                    ay ayVar = (ay) wVar2;
                    boolean a9 = wVar2.r() != null ? b.a(i4, wVar.r()) : false;
                    if (i4 == 8) {
                        String e6 = ayVar.e();
                        if (!TextUtils.isEmpty(e6)) {
                            new com.anythink.basead.i.c(e6, jVar.f6364b, a9).a(0, (q) null);
                        }
                    }
                    com.anythink.basead.i.b bVar = new com.anythink.basead.i.b(i4, ayVar, jVar.f6364b);
                    if (!TextUtils.isEmpty(bVar.n())) {
                        bVar.a(jVar.f6366d);
                        bVar.a(0, (q) null);
                    }
                } else {
                    j.a(i4, (bj) wVar2, jVar);
                }
                if (i4 == 21) {
                    w wVar3 = wVar;
                    if (wVar3 instanceof r) {
                        r rVar = (r) wVar3;
                        if (rVar.f() == 1) {
                            if (!com.anythink.core.common.v.q.a(t.b().g().getApplicationContext(), rVar.I())) {
                                rVar.aE();
                                rVar.I();
                            } else {
                                rVar.aE();
                                rVar.I();
                                com.anythink.core.common.a.d.a().c(rVar);
                            }
                        }
                    }
                }
            }
        }, 2);
    }

    public static boolean a(int i4, y yVar) {
        return (i4 == 9 || i4 == 14) ? yVar.n() == 1 : yVar.m() == 1;
    }

    private static boolean a(w wVar, y yVar) {
        if (wVar instanceof r) {
            return (yVar instanceof bk) && ((bk) yVar).b() == 1;
        }
        if ((wVar instanceof ay) && ((ay) wVar).d() == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, w wVar) {
        if (!TextUtils.isEmpty(wVar.G()) && com.anythink.core.basead.a.e.a(context, wVar.G(), wVar.ax())) {
            return true;
        }
        if (TextUtils.isEmpty(wVar.I())) {
            return false;
        }
        return com.anythink.core.basead.a.e.b(context, wVar.I());
    }

    private static void a(w wVar) {
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                if (com.anythink.core.common.v.q.a(t.b().g().getApplicationContext(), rVar.I())) {
                    rVar.aE();
                    rVar.I();
                    com.anythink.core.common.a.d.a().c(rVar);
                } else {
                    rVar.aE();
                    rVar.I();
                }
            }
        }
    }
}
