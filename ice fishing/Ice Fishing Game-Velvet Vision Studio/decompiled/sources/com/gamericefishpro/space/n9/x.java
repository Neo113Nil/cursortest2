package com.gamericefishpro.space.n9;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {
    public final com.gamericefishpro.space.t.e e;
    public final com.gamericefishpro.space.t.e i;
    public long v;

    public x(r1 r1Var) {
        super(r1Var);
        this.i = new com.gamericefishpro.space.t.e(0);
        this.e = new com.gamericefishpro.space.t.e(0);
    }

    public final void s(String str, long j) {
        r1 r1Var = (r1) this.d;
        if (str == null || str.length() == 0) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Ad unit id must be a non-empty string");
        } else {
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new a(this, str, j, 0));
        }
    }

    public final void t(String str, long j) {
        r1 r1Var = (r1) this.d;
        if (str == null || str.length() == 0) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Ad unit id must be a non-empty string");
        } else {
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new a(this, str, j, 1));
        }
    }

    public final void u(long j) {
        e3 e3Var = ((r1) this.d).E;
        r1.k(e3Var);
        b3 b3VarX = e3Var.x(false);
        com.gamericefishpro.space.t.e eVar = this.e;
        for (String str : (com.gamericefishpro.space.t.b) eVar.keySet()) {
            w(str, j - ((Long) eVar.get(str)).longValue(), b3VarX);
        }
        if (!eVar.isEmpty()) {
            v(j - this.v, b3VarX);
        }
        x(j);
    }

    public final void v(long j, b3 b3Var) {
        r1 r1Var = (r1) this.d;
        if (b3Var == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.G.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            r4.i0(b3Var, bundle, true);
            t2 t2Var = r1Var.F;
            r1.k(t2Var);
            t2Var.y("am", "_xa", bundle);
        }
    }

    public final void w(String str, long j, b3 b3Var) {
        r1 r1Var = (r1) this.d;
        if (b3Var == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.G.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            r4.i0(b3Var, bundle, true);
            t2 t2Var = r1Var.F;
            r1.k(t2Var);
            t2Var.y("am", "_xu", bundle);
        }
    }

    public final void x(long j) {
        com.gamericefishpro.space.t.e eVar = this.e;
        Iterator it = ((com.gamericefishpro.space.t.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.v = j;
    }
}
