package L0;

import B2.RunnableC0272f;
import J0.d;
import J0.s;
import K0.c;
import K0.h;
import K0.p;
import S0.j;
import S0.l;
import T0.k;
import T0.m;
import Y2.e;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import g1.C4524d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements h, O0.b, c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1697C = s.f("GreedyScheduler");

    /* renamed from: B, reason: collision with root package name */
    public Boolean f1699B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1700n;

    /* renamed from: u, reason: collision with root package name */
    public final p f1701u;

    /* renamed from: v, reason: collision with root package name */
    public final e f1702v;

    /* renamed from: x, reason: collision with root package name */
    public final a f1704x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1705y;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f1703w = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public final l f1698A = new l(3);

    /* renamed from: z, reason: collision with root package name */
    public final Object f1706z = new Object();

    public b(Context context, J0.b bVar, f4.p pVar, p pVar2) {
        this.f1700n = context;
        this.f1701u = pVar2;
        this.f1702v = new e(pVar, this);
        this.f1704x = new a(this, (C4524d) bVar.f1296h);
    }

    @Override // K0.h
    public final void a(S0.p... pVarArr) {
        if (this.f1699B == null) {
            this.f1699B = Boolean.valueOf(k.a(this.f1700n, this.f1701u.f1531b));
        }
        if (!this.f1699B.booleanValue()) {
            s.d().e(f1697C, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f1705y) {
            this.f1701u.f1535f.a(this);
            this.f1705y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (S0.p pVar : pVarArr) {
            if (!this.f1698A.l(U2.a.e(pVar))) {
                long a9 = pVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f2921b == 1) {
                    if (currentTimeMillis < a9) {
                        a aVar = this.f1704x;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f1696c;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f2920a);
                            C4524d c4524d = aVar.f1695b;
                            if (runnable != null) {
                                ((Handler) c4524d.f37858u).removeCallbacks(runnable);
                            }
                            RunnableC0272f runnableC0272f = new RunnableC0272f(aVar, pVar, 13, false);
                            hashMap.put(pVar.f2920a, runnableC0272f);
                            ((Handler) c4524d.f37858u).postDelayed(runnableC0272f, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        d dVar = pVar.f2928j;
                        if (dVar.f1301c) {
                            s.d().a(f1697C, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar.f1306h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f2920a);
                        } else {
                            s.d().a(f1697C, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f1698A.l(U2.a.e(pVar))) {
                        s.d().a(f1697C, "Starting work for " + pVar.f2920a);
                        p pVar2 = this.f1701u;
                        l lVar = this.f1698A;
                        lVar.getClass();
                        pVar2.f(lVar.v(U2.a.e(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f1706z) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f1697C, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f1703w.addAll(hashSet);
                    this.f1702v.H(this.f1703w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.c
    public final void b(j jVar, boolean z8) {
        this.f1698A.t(jVar);
        synchronized (this.f1706z) {
            try {
                Iterator it = this.f1703w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    S0.p pVar = (S0.p) it.next();
                    if (U2.a.e(pVar).equals(jVar)) {
                        s.d().a(f1697C, "Stopping tracking for " + jVar);
                        this.f1703w.remove(pVar);
                        this.f1702v.H(this.f1703w);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.h
    public final boolean c() {
        return false;
    }

    @Override // K0.h
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f1699B;
        p pVar = this.f1701u;
        if (bool == null) {
            this.f1699B = Boolean.valueOf(k.a(this.f1700n, pVar.f1531b));
        }
        boolean booleanValue = this.f1699B.booleanValue();
        String str2 = f1697C;
        if (!booleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f1705y) {
            pVar.f1535f.a(this);
            this.f1705y = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f1704x;
        if (aVar != null && (runnable = (Runnable) aVar.f1696c.remove(str)) != null) {
            ((Handler) aVar.f1695b.f37858u).removeCallbacks(runnable);
        }
        Iterator it = this.f1698A.u(str).iterator();
        while (it.hasNext()) {
            pVar.f1533d.i(new m(pVar, (K0.j) it.next(), false));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j e6 = U2.a.e((S0.p) it.next());
            s.d().a(f1697C, "Constraints not met: Cancelling work ID " + e6);
            K0.j t9 = this.f1698A.t(e6);
            if (t9 != null) {
                p pVar = this.f1701u;
                pVar.f1533d.i(new m(pVar, t9, false));
            }
        }
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            j e6 = U2.a.e((S0.p) it.next());
            l lVar = this.f1698A;
            if (!lVar.l(e6)) {
                s.d().a(f1697C, "Constraints met: Scheduling work ID " + e6);
                this.f1701u.f(lVar.v(e6), null);
            }
        }
    }
}
