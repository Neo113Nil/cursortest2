package com.gamericefishpro.space.l9;

import android.os.Bundle;
import android.os.SystemClock;
import com.gamericefishpro.space.d4.r0;
import com.gamericefishpro.space.lb.e;
import com.gamericefishpro.space.n9.b3;
import com.gamericefishpro.space.n9.e3;
import com.gamericefishpro.space.n9.k2;
import com.gamericefishpro.space.n9.o4;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.x;
import com.gamericefishpro.space.v8.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final r1 a;
    public final t2 b;

    public a(r1 r1Var) {
        c0.g(r1Var);
        this.a = r1Var;
        t2 t2Var = r1Var.F;
        r1.k(t2Var);
        this.b = t2Var;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void a(String str, String str2, Bundle bundle) {
        t2 t2Var = this.b;
        ((r1) t2Var.d).D.getClass();
        t2Var.w(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final long b() {
        r4 r4Var = this.a.B;
        r1.j(r4Var);
        return r4Var.n0();
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void c(String str, String str2, Bundle bundle) {
        t2 t2Var = this.a.F;
        r1.k(t2Var);
        t2Var.F(str, str2, bundle);
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String d() {
        e3 e3Var = ((r1) this.b.d).E;
        r1.k(e3Var);
        b3 b3Var = e3Var.i;
        if (b3Var != null) {
            return b3Var.a;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String e() {
        e3 e3Var = ((r1) this.b.d).E;
        r1.k(e3Var);
        b3 b3Var = e3Var.i;
        if (b3Var != null) {
            return b3Var.b;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final List f(String str, String str2) {
        t2 t2Var = this.b;
        r1 r1Var = (r1) t2Var.d;
        p1 p1Var = r1Var.z;
        v0 v0Var = r1Var.y;
        r1.l(p1Var);
        if (p1Var.x()) {
            r1.l(v0Var);
            v0Var.y.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (e.g()) {
            r1.l(v0Var);
            v0Var.y.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        p1Var2.B(atomicReference, 5000L, "get conditional user properties", new r0(t2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return r4.g0(list);
        }
        r1.l(v0Var);
        v0Var.y.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void g(Bundle bundle) {
        t2 t2Var = this.b;
        ((r1) t2Var.d).D.getClass();
        t2Var.E(bundle, System.currentTimeMillis());
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final int h(String str) {
        t2 t2Var = this.b;
        t2Var.getClass();
        c0.d(str);
        ((r1) t2Var.d).getClass();
        return 25;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String i() {
        return (String) this.b.z.get();
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void j(String str) {
        r1 r1Var = this.a;
        x xVar = r1Var.G;
        r1.i(xVar);
        r1Var.D.getClass();
        xVar.t(str, SystemClock.elapsedRealtime());
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final String k() {
        return this.b.G();
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final Map l(String str, String str2, boolean z) {
        t2 t2Var = this.b;
        r1 r1Var = (r1) t2Var.d;
        p1 p1Var = r1Var.z;
        v0 v0Var = r1Var.y;
        r1.l(p1Var);
        if (p1Var.x()) {
            r1.l(v0Var);
            v0Var.y.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (e.g()) {
            r1.l(v0Var);
            v0Var.y.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        p1Var2.B(atomicReference, 5000L, "get user properties", new k2(t2Var, atomicReference, str, str2, z));
        List<o4> list = (List) atomicReference.get();
        if (list == null) {
            r1.l(v0Var);
            v0Var.y.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        com.gamericefishpro.space.t.e eVar = new com.gamericefishpro.space.t.e(list.size());
        for (o4 o4Var : list) {
            Object objB = o4Var.b();
            if (objB != null) {
                eVar.put(o4Var.e, objB);
            }
        }
        return eVar;
    }

    @Override // com.gamericefishpro.space.n9.u2
    public final void m(String str) {
        r1 r1Var = this.a;
        x xVar = r1Var.G;
        r1.i(xVar);
        r1Var.D.getClass();
        xVar.s(str, SystemClock.elapsedRealtime());
    }
}
