package com.yandex.passport.internal.properties;

import com.connectsdk.service.config.ServiceDescription;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.p0;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.v1;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.x0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.e5b;
import defpackage.xq0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements com.yandex.passport.api.internal.b, com.yandex.passport.api.limited.a, x0 {
    public v1 A;
    public boolean a;
    public p0 b;
    public String c;
    public boolean d;
    public String e;
    public y1 f;
    public com.yandex.passport.internal.e g;
    public z1 h;
    public boolean i;
    public boolean j;
    public w1 k;
    public String l;
    public com.yandex.passport.internal.entities.w m;
    public f0 n;
    public k0 o;
    public h p;
    public String q;
    public Map r;
    public com.yandex.passport.internal.entities.v s;
    public m0 t;
    public boolean u;
    public String v;
    public final e5b w;
    public boolean x;
    public String y;
    public boolean z;

    public k(l lVar) {
        lVar.getClass();
        this.f = y1.d;
        this.n = new f0(null, null);
        this.o = new k0(false, false, false, q0.a, true, null, null, null, null, false, false, null, new a(com.yandex.passport.api.e.a, com.yandex.passport.api.c.a, true, false), new v(new j2(), q2.a, n2.a, true), false, true);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.r = e5bVar;
        this.w = e5bVar;
        this.A = v1.a;
        this.c = lVar.a;
        this.e = lVar.c;
        com.yandex.passport.internal.entities.k kVar = lVar.d;
        kVar.getClass();
        this.b = kVar;
        y1 y1Var = lVar.e;
        y1Var.getClass();
        this.f = y1Var;
        this.g = lVar.f;
        this.h = lVar.g;
        this.i = lVar.h;
        this.j = lVar.i;
        this.k = lVar.j;
        this.l = lVar.k;
        this.a = lVar.l;
        this.m = lVar.n;
        f0 f0Var = lVar.o;
        f0Var.getClass();
        this.n = f0Var;
        k0 k0Var = lVar.p;
        k0Var.getClass();
        this.o = k0Var;
        this.p = lVar.q;
        Map map = lVar.s;
        map.getClass();
        this.r = map;
        this.s = lVar.t;
        this.t = lVar.u;
        this.v = lVar.w;
        this.u = lVar.v;
        this.x = lVar.y;
        this.y = lVar.z;
        this.z = lVar.C;
        v1 v1Var = lVar.D;
        v1Var.getClass();
        this.A = v1Var;
    }

    @Override // com.yandex.passport.api.x0
    public final com.yandex.passport.internal.e C() {
        return this.g;
    }

    @Override // com.yandex.passport.api.x0
    public final v1 I() {
        return this.A;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean J() {
        return this.j;
    }

    @Override // com.yandex.passport.api.x0
    public final m0 O() {
        return this.t;
    }

    @Override // com.yandex.passport.api.internal.b
    public final boolean Q() {
        return this.x;
    }

    @Override // com.yandex.passport.api.x0
    public final z1 T() {
        return this.h;
    }

    @Override // com.yandex.passport.api.x0
    public final w1 W() {
        return this.k;
    }

    @Override // com.yandex.passport.api.x0
    public final f0 X() {
        return this.n;
    }

    public final l a() {
        f0 f0Var;
        z1 z1Var;
        if (this.b == null) {
            xq0.q("You must set filter");
            return null;
        }
        String str = this.c;
        boolean z = this.d;
        String str2 = this.e;
        com.yandex.passport.internal.entities.k s = com.yandex.passport.internal.ui.a.s(getFilter());
        y1 y1Var = this.f;
        com.yandex.passport.internal.e eVar = this.g;
        com.yandex.passport.internal.e eVar2 = eVar != null ? new com.yandex.passport.internal.e(eVar.a, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f) : null;
        z1 z1Var2 = this.h;
        z1 D = z1Var2 != null ? com.yandex.passport.internal.ui.a.D(z1Var2) : null;
        boolean z2 = this.i;
        boolean z3 = this.j;
        w1 w1Var = this.k;
        String str3 = this.l;
        boolean z4 = this.a;
        com.yandex.passport.internal.entities.w wVar = this.m;
        f0 f0Var2 = this.n;
        f0Var2.getClass();
        z1 d = f0Var2.d();
        if (d != null) {
            z1 D2 = com.yandex.passport.internal.ui.a.D(d);
            f0Var = f0Var2;
            z1Var = D2;
        } else {
            f0Var = f0Var2;
            z1Var = null;
        }
        f0 f0Var3 = new f0(z1Var, f0Var.getMessage());
        k0 A = com.yandex.plus.core.locale.b.A(this.o);
        h hVar = this.p;
        h M = hVar != null ? com.yandex.plus.core.network.api.utils.a.M(hVar) : null;
        String str4 = this.q;
        h hVar2 = M;
        Map map = this.r;
        com.yandex.passport.internal.entities.v vVar = this.s;
        com.yandex.passport.internal.entities.v vVar2 = vVar != null ? new com.yandex.passport.internal.entities.v(vVar) : null;
        m0 m0Var = this.t;
        return new l(str, z, str2, s, y1Var, eVar2, D, z2, z3, w1Var, str3, z4, wVar, f0Var3, A, hVar2, str4, map, vVar2, m0Var != null ? com.yandex.plus.core.network.api.utils.a.N(m0Var) : null, this.u, this.v, this.w, this.x, this.y, this.z, this.A, 201330688);
    }

    public final void b(x0 x0Var) {
        if (!(x0Var instanceof com.yandex.passport.api.limited.a)) {
            if (x0Var != null) {
                p0 filter = x0Var.getFilter();
                filter.getClass();
                this.b = filter;
                y1 theme = x0Var.getTheme();
                theme.getClass();
                this.f = theme;
                this.g = x0Var.C();
                this.h = x0Var.T();
                this.i = x0Var.l();
                this.j = x0Var.J();
                this.k = x0Var.W();
                this.l = x0Var.m();
                f0 X = x0Var.X();
                X.getClass();
                this.n = X;
                k0 j = x0Var.j();
                j.getClass();
                this.o = j;
                this.p = x0Var.k();
                Map h = x0Var.h();
                h.getClass();
                this.r = h;
                this.s = x0Var.n();
                this.t = x0Var.O();
                this.v = x0Var.o();
                this.u = x0Var.i();
                this.y = x0Var.g();
                this.z = x0Var.p();
                v1 I = x0Var.I();
                I.getClass();
                this.A = I;
                return;
            }
            return;
        }
        com.yandex.passport.api.limited.a aVar = (com.yandex.passport.api.limited.a) x0Var;
        if (!(aVar instanceof l)) {
            this.c = aVar.f();
            p0 filter2 = aVar.getFilter();
            filter2.getClass();
            this.b = filter2;
            y1 theme2 = aVar.getTheme();
            theme2.getClass();
            this.f = theme2;
            this.g = aVar.C();
            this.h = aVar.T();
            this.i = aVar.l();
            this.j = aVar.J();
            this.k = aVar.W();
            this.l = aVar.m();
            f0 X2 = aVar.X();
            X2.getClass();
            this.n = X2;
            k0 j2 = aVar.j();
            j2.getClass();
            this.o = j2;
            this.p = aVar.k();
            Map h2 = aVar.h();
            h2.getClass();
            this.r = h2;
            this.s = aVar.n();
            this.t = aVar.O();
            this.v = aVar.o();
            this.u = aVar.i();
            this.x = aVar.Q();
            this.y = aVar.g();
            this.z = aVar.p();
            v1 I2 = aVar.I();
            I2.getClass();
            this.A = I2;
            return;
        }
        l lVar = (l) aVar;
        this.c = lVar.a;
        this.e = lVar.c;
        com.yandex.passport.internal.entities.k kVar = lVar.d;
        kVar.getClass();
        this.b = kVar;
        y1 y1Var = lVar.e;
        y1Var.getClass();
        this.f = y1Var;
        this.g = lVar.f;
        this.h = lVar.g;
        this.i = lVar.h;
        this.j = lVar.i;
        this.k = lVar.j;
        this.l = lVar.k;
        this.a = lVar.l;
        this.m = lVar.n;
        f0 f0Var = lVar.o;
        f0Var.getClass();
        this.n = f0Var;
        k0 k0Var = lVar.p;
        k0Var.getClass();
        this.o = k0Var;
        this.p = lVar.q;
        Map map = lVar.s;
        map.getClass();
        this.r = map;
        this.s = lVar.t;
        this.t = lVar.u;
        this.v = lVar.w;
        this.u = lVar.v;
        this.x = lVar.y;
        this.y = lVar.z;
        this.z = lVar.C;
        v1 v1Var = lVar.D;
        v1Var.getClass();
        this.A = v1Var;
    }

    public final void c(p0 p0Var) {
        p0Var.getClass();
        this.b = com.yandex.passport.internal.ui.a.s(p0Var);
    }

    @Override // com.yandex.passport.api.x0
    public final Map d() {
        return this.w;
    }

    @Override // com.yandex.passport.api.x0
    public final String e() {
        return this.q;
    }

    @Override // com.yandex.passport.api.limited.a
    public final String f() {
        return this.c;
    }

    @Override // com.yandex.passport.api.x0
    public final String g() {
        return this.y;
    }

    @Override // com.yandex.passport.api.x0
    public final p0 getFilter() {
        p0 p0Var = this.b;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.j(ServiceDescription.KEY_FILTER);
        throw null;
    }

    @Override // com.yandex.passport.api.x0
    public final y1 getTheme() {
        return this.f;
    }

    @Override // com.yandex.passport.api.x0
    public final Map h() {
        return this.r;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean i() {
        return this.u;
    }

    @Override // com.yandex.passport.api.x0
    public final k0 j() {
        return this.o;
    }

    @Override // com.yandex.passport.api.x0
    public final h k() {
        return this.p;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean l() {
        return this.i;
    }

    @Override // com.yandex.passport.api.x0
    public final String m() {
        return this.l;
    }

    @Override // com.yandex.passport.api.x0
    public final com.yandex.passport.internal.entities.v n() {
        return this.s;
    }

    @Override // com.yandex.passport.api.x0
    public final String o() {
        return this.v;
    }

    @Override // com.yandex.passport.api.x0
    public final boolean p() {
        return this.z;
    }

    public k() {
        this.f = y1.d;
        this.n = new f0(null, null);
        this.o = new k0(false, false, false, q0.a, true, null, null, null, null, false, false, null, new a(com.yandex.passport.api.e.a, com.yandex.passport.api.c.a, true, false), new v(new j2(), q2.a, n2.a, true), false, true);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.r = e5bVar;
        this.w = e5bVar;
        this.A = v1.a;
    }
}
