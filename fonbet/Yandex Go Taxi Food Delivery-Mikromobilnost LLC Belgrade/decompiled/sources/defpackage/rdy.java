package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.camera.core.e;
import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class rdy implements ns7 {
    public jqs b;
    public final tdy d;
    public e e;
    public Context f;
    public final HashMap g;
    public final HashSet h;
    public int i;
    public final Object a = new Object();
    public euy c = hiv.c;

    public rdy() {
        tdy tdyVar;
        synchronized (tdy.f) {
            try {
                if (tdy.g == null) {
                    tdy.g = new tdy();
                }
                tdyVar = tdy.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = tdyVar;
        this.g = new HashMap();
        this.h = new HashSet();
        this.i = -1;
    }

    public static final jp7 c(rdy rdyVar, xs7 xs7Var, ar7 ar7Var) {
        jp7 a;
        Iterator it = xs7Var.a.iterator();
        jp7 jp7Var = null;
        while (it.hasNext()) {
            pq7 pq7Var = (pq7) it.next();
            if (!jl40.l(pq7Var.getIdentifier(), pq7.a) && (a = qwo.a(pq7Var.getIdentifier()).a(ar7Var, rdyVar.f)) != null) {
                if (jp7Var != null) {
                    ny61.g("Cannot apply multiple extended camera configs at the same time.");
                    return null;
                }
                jp7Var = a;
            }
        }
        return jp7Var == null ? np7.a : jp7Var;
    }

    public static final void d(rdy rdyVar, int i) {
        e eVar = rdyVar.e;
        if (eVar == null) {
            return;
        }
        lm7 lm7Var = eVar.g;
        if (lm7Var == null) {
            ny61.r("CameraX not initialized yet.");
            return;
        }
        jm7 jm7Var = lm7Var.b;
        synchronized (jm7Var.a) {
            try {
                int i2 = jm7Var.g;
                if (i == i2) {
                    return;
                }
                jm7Var.g = i;
                ArrayList arrayList = new ArrayList(jm7Var.c);
                if (i2 == 2 && i != 2) {
                    jm7Var.f.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ht7 ht7Var = (ht7) it.next();
                    synchronized (ht7Var.b) {
                        boolean z = true;
                        ht7Var.c = i == 2 ? 2 : 1;
                        boolean z2 = i2 != 2 && i == 2;
                        if (i2 != 2 || i == 2) {
                            z = false;
                        }
                        if (z2 || z) {
                            ht7Var.b();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static ody e(rdy rdyVar, pey peyVar, xs7 xs7Var, pbj pbjVar) {
        ody odyVar;
        jud judVar = jud.c;
        Trace.beginSection(ffx.f0("CX:bindToLifecycle-internal"));
        try {
            tob1.b();
            br7 c = xs7Var.c(rdyVar.e.a.c());
            c.j(true);
            g70 g70Var = (g70) rdyVar.f(xs7Var);
            yq7 yq7Var = new yq7(scc.i(g70Var.a.c()), g70Var.d.r());
            tdy tdyVar = rdyVar.d;
            synchronized (tdyVar.a) {
                odyVar = (ody) tdyVar.b.get(new e74(System.identityHashCode(peyVar), yq7Var));
            }
            Collection<ody> d = rdyVar.d.d();
            for (j jVar : (List) pbjVar.A) {
                for (ody odyVar2 : d) {
                    if (odyVar2.s(jVar) && !jl40.l(odyVar2.p(), peyVar)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{jVar}, 1)));
                    }
                }
            }
            if (odyVar == null) {
                tdy tdyVar2 = rdyVar.d;
                m2v m2vVar = rdyVar.e.k;
                if (m2vVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                odyVar = tdyVar2.b(peyVar, new qt7(c, null, g70Var, null, judVar, judVar, (jm7) m2vVar.b, (hhs0) m2vVar.w, (zi21) m2vVar.c));
            }
            if (!((List) pbjVar.A).isEmpty()) {
                tdy tdyVar3 = rdyVar.d;
                lm7 lm7Var = rdyVar.e.g;
                if (lm7Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                tdyVar3.a(odyVar, pbjVar, lm7Var.b);
                rdyVar.h.add(new e74(System.identityHashCode(peyVar), yq7Var));
            }
            return odyVar;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ns7
    public final ArrayList a() {
        Trace.beginSection(ffx.f0("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.e.a.c().iterator();
            while (it.hasNext()) {
                arrayList.add(((br7) it.next()).c());
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ns7
    public final int b() {
        return this.i;
    }

    public final ar7 f(xs7 xs7Var) {
        Object obj;
        Trace.beginSection(ffx.f0("CX:getCameraInfo"));
        try {
            ar7 f = xs7Var.c(this.e.a.c()).f();
            jp7 c = c(this, xs7Var, f);
            String c2 = f.c();
            yq7 yq7Var = new yq7(scc.i(c2), c.r());
            synchronized (this.a) {
                obj = this.g.get(yq7Var);
                if (obj == null) {
                    obj = new g70(f, c);
                    this.g.put(yq7Var, obj);
                }
            }
            return (g70) obj;
        } finally {
            Trace.endSection();
        }
    }

    public final void g() {
        Trace.beginSection(ffx.f0("CX:unbindAll"));
        try {
            tob1.b();
            d(this, 0);
            this.d.k(this.h);
        } finally {
            Trace.endSection();
        }
    }
}
