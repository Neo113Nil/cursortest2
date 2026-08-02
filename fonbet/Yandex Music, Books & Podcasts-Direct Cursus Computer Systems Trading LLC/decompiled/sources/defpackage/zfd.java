package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zfd implements s5d {
    public final es6 a;
    public final rjq b;
    public final um6 c;
    public tnl d;
    public mwk e;
    public boolean f;
    public boolean g;
    public long h;
    public boolean i;
    public final jac j;
    public final r5d k;

    public zfd(es6 es6Var) {
        this.a = es6Var;
        rjq rjqVar = new rjq(true);
        this.b = rjqVar;
        this.c = hld.s(rjqVar, dm6.b());
        this.d = tnl.a;
        this.e = h1b.e;
        jac jacVar = new jac(4);
        this.j = jacVar;
        wdg.E();
        jacVar.g = new qec(2, this);
        this.k = r5d.e;
    }

    public static void z(zfd zfdVar, String str, tnl tnlVar, boolean z, int i) {
        mqs a;
        if ((i & 1) != 0 && ((a = zfdVar.e.a()) == null || (str = a.a) == null)) {
            str = "";
        }
        if ((i & 2) != 0) {
            tnlVar = zfdVar.d;
        }
        if ((i & 4) != 0) {
            z = zfdVar.f;
        }
        boolean z2 = (i & 8) == 0;
        if (z2 || zfdVar.g || zfdVar.d != tnlVar || zfdVar.f != z) {
            zfdVar.d = tnlVar;
            zfdVar.f = z;
            if (!z2 && zfdVar.e.a() != null) {
                mqs a2 = zfdVar.e.a();
                if (!Intrinsics.d(str, a2 != null ? a2.a : null)) {
                    zfdVar.g = true;
                    return;
                }
            }
            zfdVar.g = false;
            if (z2) {
                ssg.a(4, "GlagolCastPlayer", "force  state: " + tnlVar + ", playWhenReady: " + z, null);
            } else {
                ssg.a(3, "GlagolCastPlayer", "notify state: " + tnlVar + ", playWhenReady: " + z, null);
            }
            zfdVar.a.Q(new gzk(zfdVar.e, tnlVar, z, false));
            if (tnlVar == tnl.f) {
                l18 l18Var = l18.b;
                bdt I = hag.I(j84.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ((j84) qdcVar.C(I)).a();
            }
        }
    }

    public final long A() {
        if (this.i) {
            return this.h;
        }
        jac jacVar = this.j;
        vhd vhdVar = (vhd) jacVar.d;
        zzp zzpVar = (zzp) ((jyr) jacVar.c).getValue();
        long j = vhdVar.e;
        zzpVar.getClass();
        return (!vhdVar.c || j <= 0) ? j : yhn.f((zzpVar.b() - vhdVar.g) + j, 0L, vhdVar.f);
    }

    @Override // defpackage.s5d
    public final Object a(h4q h4qVar, v0r v0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object b(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new xfd(this, null, 1), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object c(p5d p5dVar, Continuation continuation) {
        Object V = x97.V(dm6.b(), new nz5(this, p5dVar, (Continuation) null, 18), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object d(boolean z, u0r u0rVar) {
        return x97.V(dm6.b(), new ze1(this, z, null, 4), u0rVar);
    }

    @Override // defpackage.s5d
    public final long g() {
        return ((Number) ff7.L(new wfd(this, 0))).longValue();
    }

    @Override // defpackage.s5d
    public final r5d getPlayerType() {
        return this.k;
    }

    @Override // defpackage.s5d
    public final long h() {
        return ((Number) ff7.L(new wfd(this, 1))).longValue();
    }

    @Override // defpackage.s5d
    public final Object i(r0r r0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object k(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new yfd(this, null, 2), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object m(r0r r0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object n(Continuation continuation) {
        Object V = x97.V(dm6.b(), new xfd(this, null, 2), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object o(long j, Continuation continuation) {
        Object V = x97.V(dm6.b(), new g84(this, j, null, 1), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object p(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new xfd(this, null, 4), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object q(r0r r0rVar) {
        return t(r0rVar);
    }

    @Override // defpackage.s5d
    public final Object r(Continuation continuation) {
        return x97.V(dm6.b(), new xfd(this, null, 3), continuation);
    }

    @Override // defpackage.s5d
    public final Object t(Continuation continuation) {
        return x97.V(dm6.b(), new xfd(this, null, 0), continuation);
    }

    @Override // defpackage.s5d
    public final Object u(eol eolVar) {
        return new Long(-1L);
    }

    @Override // defpackage.s5d
    public final Object v(n4q n4qVar, v0r v0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object w(Continuation continuation) {
        return h4q.b;
    }

    @Override // defpackage.s5d
    public final Object x(r0r r0rVar) {
        return n4q.b;
    }

    public final long y() {
        long j = ((vhd) this.j.d).f;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        mqs a = this.e.a();
        Long valueOf2 = a != null ? Long.valueOf(a.e) : null;
        if (valueOf2 != null) {
            return valueOf2.longValue();
        }
        return 0L;
    }
}
