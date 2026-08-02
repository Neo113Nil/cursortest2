package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d8t {
    public final cqi a;
    public final d8t b;
    public final String c;
    public final x6k d = szf.g0(c());
    public final x6k e = szf.g0(new y7t(c(), c()));
    public final v6k f = new v6k(0);
    public final v6k g = new v6k(Long.MIN_VALUE);
    public final x6k h;
    public final s2r i;
    public final s2r j;
    public final x6k k;

    public d8t(cqi cqiVar, d8t d8tVar, String str) {
        this.a = cqiVar;
        this.b = d8tVar;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.h = szf.g0(bool);
        this.i = new s2r();
        this.j = new s2r();
        this.k = szf.g0(bool);
        szf.U(new sl0(this, 1));
        cqiVar.getClass();
    }

    public final void a(int i, hq5 hq5Var, Object obj) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(this) ? 32 : 16;
        }
        if (!oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            oq5Var.S();
        } else if (g()) {
            oq5Var.Z(1824284987);
            oq5Var.p(false);
        } else {
            oq5Var.Z(1822801203);
            k(obj);
            if (Intrinsics.d(obj, c())) {
                if (!(this.g.h() != Long.MIN_VALUE) && !((Boolean) this.h.getValue()).booleanValue()) {
                    oq5Var.Z(1824275067);
                    oq5Var.p(false);
                    oq5Var.p(false);
                }
            }
            oq5Var.Z(1823032494);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            boolean h = oq5Var.h(mm6Var) | ((i2 & 112) == 32);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new gcp(17, mm6Var, this);
                oq5Var.k0(K2);
            }
            gld.j(mm6Var, this, (Function1) K2, oq5Var);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(this, obj, i, 14);
        }
    }

    public final long b() {
        s2r s2rVar = this.i;
        int size = s2rVar.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((z7t) s2rVar.get(i)).j.h());
        }
        s2r s2rVar2 = this.j;
        int size2 = s2rVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((d8t) s2rVar2.get(i2)).b());
        }
        return j;
    }

    public final Object c() {
        return this.a.b.getValue();
    }

    public final boolean d() {
        s2r s2rVar = this.i;
        int size = s2rVar.size();
        for (int i = 0; i < size; i++) {
            ((z7t) s2rVar.get(i)).getClass();
        }
        s2r s2rVar2 = this.j;
        int size2 = s2rVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((d8t) s2rVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        d8t d8tVar = this.b;
        return d8tVar != null ? d8tVar.e() : this.f.h();
    }

    public final x7t f() {
        return (x7t) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        v6k v6kVar = this.g;
        long h = v6kVar.h();
        cqi cqiVar = this.a;
        if (h == Long.MIN_VALUE) {
            v6kVar.i(j);
            cqiVar.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) cqiVar.a.getValue()).booleanValue()) {
            cqiVar.a.setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        s2r s2rVar = this.i;
        int size = s2rVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            z7t z7tVar = (z7t) s2rVar.get(i);
            x6k x6kVar = z7tVar.e;
            x6k x6kVar2 = z7tVar.e;
            if (!((Boolean) x6kVar.getValue()).booleanValue()) {
                long d = z ? z7tVar.a().d() : j;
                z7tVar.h.setValue(z7tVar.a().f(d));
                z7tVar.i = z7tVar.a().b(d);
                if (z7tVar.a().c(d)) {
                    x6kVar2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) x6kVar2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        s2r s2rVar2 = this.j;
        int size2 = s2rVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d8t d8tVar = (d8t) s2rVar2.get(i2);
            if (!Intrinsics.d(d8tVar.d.getValue(), d8tVar.c())) {
                d8tVar.h(j, z);
            }
            if (!Intrinsics.d(d8tVar.d.getValue(), d8tVar.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        cqi cqiVar = this.a;
        if (cqiVar instanceof cqi) {
            cqiVar.b.setValue(this.d.getValue());
        }
        if (this.b == null) {
            this.f.i(0L);
        }
        cqiVar.a.setValue(Boolean.FALSE);
        s2r s2rVar = this.j;
        int size = s2rVar.size();
        for (int i = 0; i < size; i++) {
            ((d8t) s2rVar.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        cqi cqiVar = this.a;
        cqiVar.a.setValue(Boolean.FALSE);
        boolean g = g();
        x6k x6kVar = this.d;
        if (!g || !Intrinsics.d(c(), obj) || !Intrinsics.d(x6kVar.getValue(), obj2)) {
            if (!Intrinsics.d(c(), obj) && (cqiVar instanceof cqi)) {
                cqiVar.b.setValue(obj);
            }
            x6kVar.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new y7t(obj, obj2));
        }
        s2r s2rVar = this.j;
        int size = s2rVar.size();
        for (int i = 0; i < size; i++) {
            d8t d8tVar = (d8t) s2rVar.get(i);
            d8tVar.getClass();
            if (d8tVar.g()) {
                d8tVar.j(d8tVar.c(), d8tVar.d.getValue());
            }
        }
        s2r s2rVar2 = this.i;
        int size2 = s2rVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((z7t) s2rVar2.get(i2)).b();
        }
    }

    public final void k(Object obj) {
        x6k x6kVar = this.d;
        if (Intrinsics.d(x6kVar.getValue(), obj)) {
            return;
        }
        this.e.setValue(new y7t(x6kVar.getValue(), obj));
        if (!Intrinsics.d(c(), x6kVar.getValue())) {
            this.a.b.setValue(x6kVar.getValue());
        }
        x6kVar.setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        s2r s2rVar = this.i;
        int size = s2rVar.size();
        for (int i = 0; i < size; i++) {
            ((z7t) s2rVar.get(i)).f.h(-2.0f);
        }
    }

    public final String toString() {
        s2r s2rVar = this.i;
        int size = s2rVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((z7t) s2rVar.get(i)) + ", ";
        }
        return str;
    }
}
