package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.impl.a;
import androidx.work.impl.constraints.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0u implements kom0, zx60, uko {
    public static final String H = hgz.o("GreedyScheduler");
    public final r951 A;
    public final u0e B;
    public Boolean D;
    public final y851 E;
    public final btx0 F;
    public final ofa0 G;
    public final Context a;
    public final bqh c;
    public boolean w;
    public final r6f0 z;
    public final HashMap b = new HashMap();
    public final Object x = new Object();
    public final rfw0 y = new rfw0(new j2u0());
    public final HashMap C = new HashMap();

    public s0u(Context context, u0e u0eVar, v201 v201Var, r6f0 r6f0Var, r951 r951Var, btx0 btx0Var) {
        this.a = context;
        jjh jjhVar = u0eVar.g;
        this.c = new bqh(this, jjhVar, u0eVar.d);
        this.G = new ofa0(jjhVar, r951Var);
        this.F = btx0Var;
        this.E = new y851(v201Var);
        this.B = u0eVar;
        this.z = r6f0Var;
        this.A = r951Var;
    }

    @Override // defpackage.kom0
    public final void a(fa51... fa51VarArr) {
        long max;
        if (this.D == null) {
            Context context = this.a;
            int i = e6f0.a;
            this.D = Boolean.valueOf(Application.getProcessName().equals(context.getApplicationInfo().processName));
        }
        if (!this.D.booleanValue()) {
            hgz.g().h(H, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.w) {
            this.z.a(this);
            this.w = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        for (fa51 fa51Var : fa51VarArr) {
            if (!this.y.d(udq0.q(fa51Var))) {
                synchronized (this.x) {
                    try {
                        n951 q = udq0.q(fa51Var);
                        r0u r0uVar = (r0u) this.C.get(q);
                        if (r0uVar == null) {
                            int i2 = fa51Var.k;
                            this.B.d.getClass();
                            r0uVar = new r0u(i2, System.currentTimeMillis());
                            this.C.put(q, r0uVar);
                        }
                        max = (Math.max((fa51Var.k - r0uVar.a) - 5, 0) * 30000) + r0uVar.b;
                    } finally {
                    }
                }
                long max2 = Math.max(fa51Var.a(), max);
                this.B.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (fa51Var.b == WorkInfo$State.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        bqh bqhVar = this.c;
                        if (bqhVar != null) {
                            jjh jjhVar = bqhVar.b;
                            HashMap hashMap = bqhVar.d;
                            Runnable runnable = (Runnable) hashMap.remove(fa51Var.a);
                            if (runnable != null) {
                                jjhVar.a.removeCallbacks(runnable);
                            }
                            do91 do91Var = new do91(bqhVar, fa51Var, z, 4);
                            hashMap.put(fa51Var.a, do91Var);
                            bqhVar.c.getClass();
                            jjhVar.a.postDelayed(do91Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!jl40.l(k8e.j, fa51Var.j)) {
                        k8e k8eVar = fa51Var.j;
                        if (k8eVar.d) {
                            hgz g = hgz.g();
                            fa51Var.toString();
                            g.getClass();
                        } else if (k8eVar.i.isEmpty()) {
                            hashSet.add(fa51Var);
                            hashSet2.add(fa51Var.a);
                        } else {
                            hgz g2 = hgz.g();
                            fa51Var.toString();
                            g2.getClass();
                        }
                    } else if (!this.y.d(udq0.q(fa51Var))) {
                        hgz.g().getClass();
                        h2u0 b = this.y.b(udq0.q(fa51Var));
                        this.G.C(b);
                        r951 r951Var = this.A;
                        r951Var.getClass();
                        btx0 btx0Var = r951Var.b;
                        a aVar = new a(r951Var, b, null);
                        btx0Var.getClass();
                        ((t951) btx0Var).a.execute(aVar);
                    }
                }
            }
        }
        synchronized (this.x) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    hgz.g().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        fa51 fa51Var2 = (fa51) it.next();
                        n951 q2 = udq0.q(fa51Var2);
                        if (!this.b.containsKey(q2)) {
                            this.b.put(q2, d.a(this.E, fa51Var2, ((t951) this.F).b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.kom0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.kom0
    public final void c(String str) {
        List<h2u0> c;
        Runnable runnable;
        if (this.D == null) {
            Context context = this.a;
            int i = e6f0.a;
            this.D = Boolean.valueOf(Application.getProcessName().equals(context.getApplicationInfo().processName));
        }
        if (!this.D.booleanValue()) {
            hgz.g().h(H, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.w) {
            this.z.a(this);
            this.w = true;
        }
        hgz.g().getClass();
        bqh bqhVar = this.c;
        if (bqhVar != null && (runnable = (Runnable) bqhVar.d.remove(str)) != null) {
            bqhVar.b.a.removeCallbacks(runnable);
        }
        rfw0 rfw0Var = this.y;
        synchronized (rfw0Var.b) {
            c = ((j2u0) rfw0Var.a).c(str);
        }
        for (h2u0 h2u0Var : c) {
            this.G.v(h2u0Var);
            r951 r951Var = this.A;
            r951Var.getClass();
            btx0 btx0Var = r951Var.b;
            z52 z52Var = new z52(r951Var.a, h2u0Var, false, -512);
            btx0Var.getClass();
            ((t951) btx0Var).a.execute(z52Var);
        }
    }

    @Override // defpackage.zx60
    public final void d(fa51 fa51Var, s8e s8eVar) {
        n951 q = udq0.q(fa51Var);
        boolean z = s8eVar instanceof q8e;
        r951 r951Var = this.A;
        ofa0 ofa0Var = this.G;
        rfw0 rfw0Var = this.y;
        if (z) {
            if (rfw0Var.d(q)) {
                return;
            }
            hgz g = hgz.g();
            q.toString();
            g.getClass();
            h2u0 b = rfw0Var.b(q);
            ofa0Var.C(b);
            r951Var.getClass();
            btx0 btx0Var = r951Var.b;
            a aVar = new a(r951Var, b, null);
            btx0Var.getClass();
            ((t951) btx0Var).a.execute(aVar);
            return;
        }
        hgz g2 = hgz.g();
        q.toString();
        g2.getClass();
        h2u0 a = rfw0Var.a(q);
        if (a != null) {
            ofa0Var.v(a);
            int a2 = ((r8e) s8eVar).a();
            r951Var.getClass();
            btx0 btx0Var2 = r951Var.b;
            z52 z52Var = new z52(r951Var.a, a, false, a2);
            btx0Var2.getClass();
            ((t951) btx0Var2).a.execute(z52Var);
        }
    }

    @Override // defpackage.uko
    public final void onExecuted(n951 n951Var, boolean z) {
        l8x l8xVar;
        h2u0 a = this.y.a(n951Var);
        if (a != null) {
            this.G.v(a);
        }
        synchronized (this.x) {
            l8xVar = (l8x) this.b.remove(n951Var);
        }
        if (l8xVar != null) {
            hgz g = hgz.g();
            Objects.toString(n951Var);
            g.getClass();
            l8xVar.a(null);
        }
        if (z) {
            return;
        }
        synchronized (this.x) {
            this.C.remove(n951Var);
        }
    }
}
