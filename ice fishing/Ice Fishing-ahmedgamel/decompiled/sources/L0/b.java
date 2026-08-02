package L0;

import J0.r;
import K0.c;
import K0.h;
import K0.p;
import S0.i;
import S0.j;
import T0.k;
import T0.m;
import Z2.d;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import b3.e;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.LD;
import i1.C4586c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements h, O0.b, c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1718C = r.f("GreedyScheduler");

    /* renamed from: B, reason: collision with root package name */
    public Boolean f1720B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1721n;

    /* renamed from: u, reason: collision with root package name */
    public final p f1722u;

    /* renamed from: v, reason: collision with root package name */
    public final e f1723v;

    /* renamed from: x, reason: collision with root package name */
    public final a f1725x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1726y;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f1724w = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public final C3067cm f1719A = new C3067cm(2);

    /* renamed from: z, reason: collision with root package name */
    public final Object f1727z = new Object();

    public b(Context context, J0.b bVar, i iVar, p pVar) {
        this.f1721n = context;
        this.f1722u = pVar;
        this.f1723v = new e(iVar, this);
        this.f1725x = new a(this, (C4586c) bVar.f1400h);
    }

    @Override // K0.h
    public final void a(S0.p... pVarArr) {
        if (this.f1720B == null) {
            this.f1720B = Boolean.valueOf(k.a(this.f1721n, this.f1722u.f1642b));
        }
        if (!this.f1720B.booleanValue()) {
            r.d().e(f1718C, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f1726y) {
            this.f1722u.f1646f.a(this);
            this.f1726y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (S0.p pVar : pVarArr) {
            if (!this.f1719A.C(d.k(pVar))) {
                long a9 = pVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f2938b == 1) {
                    if (currentTimeMillis < a9) {
                        a aVar = this.f1725x;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f1717c;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f2937a);
                            C4586c c4586c = aVar.f1716b;
                            if (runnable != null) {
                                ((Handler) c4586c.f38154u).removeCallbacks(runnable);
                            }
                            LD ld = new LD(aVar, pVar, 12, false);
                            hashMap.put(pVar.f2937a, ld);
                            ((Handler) c4586c.f38154u).postDelayed(ld, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        J0.d dVar = pVar.f2945j;
                        if (dVar.f1405c) {
                            r.d().a(f1718C, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar.f1410h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f2937a);
                        } else {
                            r.d().a(f1718C, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f1719A.C(d.k(pVar))) {
                        r.d().a(f1718C, "Starting work for " + pVar.f2937a);
                        p pVar2 = this.f1722u;
                        C3067cm c3067cm = this.f1719A;
                        c3067cm.getClass();
                        pVar2.f(c3067cm.H(d.k(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f1727z) {
            try {
                if (!hashSet.isEmpty()) {
                    r.d().a(f1718C, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f1724w.addAll(hashSet);
                    this.f1723v.E(this.f1724w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.c
    public final void b(j jVar, boolean z6) {
        this.f1719A.F(jVar);
        synchronized (this.f1727z) {
            try {
                Iterator it = this.f1724w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    S0.p pVar = (S0.p) it.next();
                    if (d.k(pVar).equals(jVar)) {
                        r.d().a(f1718C, "Stopping tracking for " + jVar);
                        this.f1724w.remove(pVar);
                        this.f1723v.E(this.f1724w);
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
        Boolean bool = this.f1720B;
        p pVar = this.f1722u;
        if (bool == null) {
            this.f1720B = Boolean.valueOf(k.a(this.f1721n, pVar.f1642b));
        }
        boolean booleanValue = this.f1720B.booleanValue();
        String str2 = f1718C;
        if (!booleanValue) {
            r.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f1726y) {
            pVar.f1646f.a(this);
            this.f1726y = true;
        }
        r.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f1725x;
        if (aVar != null && (runnable = (Runnable) aVar.f1717c.remove(str)) != null) {
            ((Handler) aVar.f1716b.f38154u).removeCallbacks(runnable);
        }
        Iterator it = this.f1719A.G(str).iterator();
        while (it.hasNext()) {
            pVar.f1644d.h(new m(pVar, (K0.j) it.next(), false));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j k9 = d.k((S0.p) it.next());
            r.d().a(f1718C, "Constraints not met: Cancelling work ID " + k9);
            K0.j F8 = this.f1719A.F(k9);
            if (F8 != null) {
                p pVar = this.f1722u;
                pVar.f1644d.h(new m(pVar, F8, false));
            }
        }
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            j k9 = d.k((S0.p) it.next());
            C3067cm c3067cm = this.f1719A;
            if (!c3067cm.C(k9)) {
                r.d().a(f1718C, "Constraints met: Scheduling work ID " + k9);
                this.f1722u.f(c3067cm.H(k9), null);
            }
        }
    }
}
