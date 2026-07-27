package L0;

import J0.d;
import J0.s;
import K0.c;
import K0.h;
import K0.p;
import S0.i;
import S0.j;
import T0.k;
import T0.m;
import Z2.e;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.LD;
import g1.C4523c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements h, O0.b, c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f1609C = s.f("GreedyScheduler");

    /* renamed from: B, reason: collision with root package name */
    public Boolean f1611B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1612n;

    /* renamed from: u, reason: collision with root package name */
    public final p f1613u;

    /* renamed from: v, reason: collision with root package name */
    public final e f1614v;

    /* renamed from: x, reason: collision with root package name */
    public final a f1616x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1617y;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f1615w = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public final S0.c f1610A = new S0.c(3);

    /* renamed from: z, reason: collision with root package name */
    public final Object f1618z = new Object();

    public b(Context context, J0.b bVar, i iVar, p pVar) {
        this.f1612n = context;
        this.f1613u = pVar;
        this.f1614v = new e(iVar, this);
        this.f1616x = new a(this, (C4523c) bVar.f1371h);
    }

    @Override // K0.h
    public final void a(S0.p... pVarArr) {
        if (this.f1611B == null) {
            this.f1611B = Boolean.valueOf(k.a(this.f1612n, this.f1613u.f1533b));
        }
        if (!this.f1611B.booleanValue()) {
            s.d().e(f1609C, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f1617y) {
            this.f1613u.f1537f.a(this);
            this.f1617y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (S0.p pVar : pVarArr) {
            if (!this.f1610A.b(com.bumptech.glide.e.c(pVar))) {
                long a9 = pVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f2809b == 1) {
                    if (currentTimeMillis < a9) {
                        a aVar = this.f1616x;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f1608c;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f2808a);
                            C4523c c4523c = aVar.f1607b;
                            if (runnable != null) {
                                ((Handler) c4523c.f37627u).removeCallbacks(runnable);
                            }
                            LD ld = new LD(aVar, pVar, 12, false);
                            hashMap.put(pVar.f2808a, ld);
                            ((Handler) c4523c.f37627u).postDelayed(ld, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        d dVar = pVar.f2816j;
                        if (dVar.f1376c) {
                            s.d().a(f1609C, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar.f1381h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f2808a);
                        } else {
                            s.d().a(f1609C, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f1610A.b(com.bumptech.glide.e.c(pVar))) {
                        s.d().a(f1609C, "Starting work for " + pVar.f2808a);
                        p pVar2 = this.f1613u;
                        S0.c cVar = this.f1610A;
                        cVar.getClass();
                        pVar2.f(cVar.m(com.bumptech.glide.e.c(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f1618z) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f1609C, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f1615w.addAll(hashSet);
                    this.f1614v.E(this.f1615w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.c
    public final void b(j jVar, boolean z3) {
        this.f1610A.k(jVar);
        synchronized (this.f1618z) {
            try {
                Iterator it = this.f1615w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    S0.p pVar = (S0.p) it.next();
                    if (com.bumptech.glide.e.c(pVar).equals(jVar)) {
                        s.d().a(f1609C, "Stopping tracking for " + jVar);
                        this.f1615w.remove(pVar);
                        this.f1614v.E(this.f1615w);
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
        Boolean bool = this.f1611B;
        p pVar = this.f1613u;
        if (bool == null) {
            this.f1611B = Boolean.valueOf(k.a(this.f1612n, pVar.f1533b));
        }
        boolean booleanValue = this.f1611B.booleanValue();
        String str2 = f1609C;
        if (!booleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f1617y) {
            pVar.f1537f.a(this);
            this.f1617y = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f1616x;
        if (aVar != null && (runnable = (Runnable) aVar.f1608c.remove(str)) != null) {
            ((Handler) aVar.f1607b.f37627u).removeCallbacks(runnable);
        }
        Iterator it = this.f1610A.l(str).iterator();
        while (it.hasNext()) {
            pVar.f1535d.i(new m(pVar, (K0.j) it.next(), false));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j c9 = com.bumptech.glide.e.c((S0.p) it.next());
            s.d().a(f1609C, "Constraints not met: Cancelling work ID " + c9);
            K0.j k9 = this.f1610A.k(c9);
            if (k9 != null) {
                p pVar = this.f1613u;
                pVar.f1535d.i(new m(pVar, k9, false));
            }
        }
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            j c9 = com.bumptech.glide.e.c((S0.p) it.next());
            S0.c cVar = this.f1610A;
            if (!cVar.b(c9)) {
                s.d().a(f1609C, "Constraints met: Scheduling work ID " + c9);
                this.f1613u.f(cVar.m(c9), null);
            }
        }
    }
}
