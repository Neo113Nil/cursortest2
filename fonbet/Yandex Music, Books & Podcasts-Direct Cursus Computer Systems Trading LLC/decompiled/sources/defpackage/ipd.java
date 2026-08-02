package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ipd implements kto, upj, rob {
    public static final String o = jsg.n("GreedyScheduler");
    public final Context a;
    public final rv7 c;
    public boolean d;
    public final htm g;
    public final y8p h;
    public final r46 i;
    public Boolean k;
    public final kpm l;
    public final j4w m;
    public final x3n n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final atn f = new atn(new knn(9));
    public final HashMap j = new HashMap();

    public ipd(Context context, r46 r46Var, l2t l2tVar, htm htmVar, y8p y8pVar, j4w j4wVar) {
        this.a = context;
        znk znkVar = r46Var.g;
        this.c = new rv7(this, znkVar, r46Var.d);
        znkVar.getClass();
        x3n x3nVar = new x3n();
        x3nVar.a = znkVar;
        x3nVar.b = y8pVar;
        x3nVar.c = new Object();
        x3nVar.d = new LinkedHashMap();
        this.n = x3nVar;
        this.m = j4wVar;
        this.l = new kpm(l2tVar);
        this.i = r46Var;
        this.g = htmVar;
        this.h = y8pVar;
    }

    @Override // defpackage.rob
    public final void a(a4w a4wVar, boolean z) {
        r2f r2fVar;
        ucr R = this.f.R(a4wVar);
        if (R != null) {
            this.n.V(R);
        }
        synchronized (this.e) {
            r2fVar = (r2f) this.b.remove(a4wVar);
        }
        if (r2fVar != null) {
            jsg.j().e(o, "Stopping tracking for " + a4wVar);
            r2fVar.g(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(a4wVar);
        }
    }

    @Override // defpackage.kto
    public final void b(String str) {
        List<ucr> n;
        Runnable runnable;
        String str2 = o;
        if (this.k == null) {
            this.k = Boolean.valueOf(ftm.a(this.a, this.i));
        }
        if (!this.k.booleanValue()) {
            jsg.j().k(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        jsg.j().e(str2, "Cancelling work ID " + str);
        rv7 rv7Var = this.c;
        if (rv7Var != null && (runnable = (Runnable) rv7Var.d.remove(str)) != null) {
            ((Handler) rv7Var.b.b).removeCallbacks(runnable);
        }
        atn atnVar = this.f;
        atnVar.getClass();
        str.getClass();
        synchronized (atnVar.c) {
            n = ((knn) atnVar.b).n(str);
        }
        for (ucr ucrVar : n) {
            this.n.V(ucrVar);
            y8p y8pVar = this.h;
            y8pVar.getClass();
            y8pVar.o(ucrVar, -512);
        }
    }

    @Override // defpackage.kto
    public final void c(t4w... t4wVarArr) {
        long max;
        if (this.k == null) {
            this.k = Boolean.valueOf(ftm.a(this.a, this.i));
        }
        if (!this.k.booleanValue()) {
            jsg.j().k(o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (t4w t4wVar : t4wVarArr) {
            if (!this.f.C(bzf.A(t4wVar))) {
                synchronized (this.e) {
                    try {
                        a4w A = bzf.A(t4wVar);
                        hpd hpdVar = (hpd) this.j.get(A);
                        if (hpdVar == null) {
                            int i = t4wVar.k;
                            this.i.d.getClass();
                            hpdVar = new hpd(i, System.currentTimeMillis());
                            this.j.put(A, hpdVar);
                        }
                        max = (Math.max((t4wVar.k - hpdVar.a) - 5, 0) * 30000) + hpdVar.b;
                    } finally {
                    }
                }
                long max2 = Math.max(t4wVar.a(), max);
                this.i.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (t4wVar.b == c4w.a) {
                    if (currentTimeMillis < max2) {
                        rv7 rv7Var = this.c;
                        if (rv7Var != null) {
                            znk znkVar = rv7Var.b;
                            HashMap hashMap = rv7Var.d;
                            Runnable runnable = (Runnable) hashMap.remove(t4wVar.a);
                            if (runnable != null) {
                                ((Handler) znkVar.b).removeCallbacks(runnable);
                            }
                            pv7 pv7Var = new pv7(2, rv7Var, t4wVar);
                            hashMap.put(t4wVar.a, pv7Var);
                            rv7Var.c.getClass();
                            ((Handler) znkVar.b).postDelayed(pv7Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.d(fa6.j, t4wVar.j)) {
                        fa6 fa6Var = t4wVar.j;
                        if (fa6Var.d) {
                            jsg.j().e(o, "Ignoring " + t4wVar + ". Requires device idle.");
                        } else if (fa6Var.i.isEmpty()) {
                            hashSet.add(t4wVar);
                            hashSet2.add(t4wVar.a);
                        } else {
                            jsg.j().e(o, "Ignoring " + t4wVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f.C(bzf.A(t4wVar))) {
                        jsg.j().e(o, "Starting work for " + t4wVar.a);
                        atn atnVar = this.f;
                        atnVar.getClass();
                        ucr U = atnVar.U(bzf.A(t4wVar));
                        this.n.O0(U);
                        y8p y8pVar = this.h;
                        y8pVar.getClass();
                        y8pVar.n(U, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    jsg.j().e(o, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        t4w t4wVar2 = (t4w) it.next();
                        a4w A2 = bzf.A(t4wVar2);
                        if (!this.b.containsKey(A2)) {
                            this.b.put(A2, r3w.a(this.l, t4wVar2, this.m.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.upj
    public final void d(t4w t4wVar, na6 na6Var) {
        a4w A = bzf.A(t4wVar);
        boolean z = na6Var instanceof la6;
        y8p y8pVar = this.h;
        x3n x3nVar = this.n;
        String str = o;
        atn atnVar = this.f;
        if (z) {
            if (atnVar.C(A)) {
                return;
            }
            jsg.j().e(str, "Constraints met: Scheduling work ID " + A);
            ucr U = atnVar.U(A);
            x3nVar.O0(U);
            y8pVar.getClass();
            y8pVar.n(U, null);
            return;
        }
        jsg.j().e(str, "Constraints not met: Cancelling work ID " + A);
        ucr R = atnVar.R(A);
        if (R != null) {
            x3nVar.V(R);
            int i = ((ma6) na6Var).a;
            y8pVar.getClass();
            y8pVar.o(R, i);
        }
    }

    @Override // defpackage.kto
    public final boolean e() {
        return false;
    }
}
