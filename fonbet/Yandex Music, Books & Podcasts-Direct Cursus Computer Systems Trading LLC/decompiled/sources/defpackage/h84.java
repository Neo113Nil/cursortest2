package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.cast.MediaInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class h84 implements s5d {
    public final es6 a;
    public final f74 b;
    public rar c;
    public final tf6 d;
    public final m64 e;
    public tnl f;
    public mwk g;
    public boolean h;
    public final r5d i;

    public h84(es6 es6Var) {
        this.a = es6Var;
        l18 l18Var = l18.b;
        bdt I = hag.I(f74.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.b = (f74) qdcVar.C(I);
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(j5h.a);
        this.d = e;
        this.f = tnl.a;
        this.g = h1b.e;
        wdg.E();
        bdt I2 = hag.I(dk4.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.e = new m64(e, (dk4) qdcVar2.C(I2), new bnd(12, this));
        this.i = r5d.c;
    }

    public static final void y(h84 h84Var, mwk mwkVar, boolean z, long j, float f) {
        h84Var.g = mwkVar;
        h84Var.h = z;
        m64 m64Var = h84Var.e;
        m64Var.i = f;
        Continuation continuation = null;
        if (m64Var.e != null) {
            x97.y(m64Var.a, null, null, new k64(m64Var, continuation, 5), 3);
        }
        rar rarVar = h84Var.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        if (mwkVar.a() == null) {
            h84Var.B(tnl.f, h84Var.h);
        }
        h84Var.c = x97.y(h84Var.d, null, null, new f84(h84Var, mwkVar, j, (Continuation) null, 0), 3);
    }

    public static final void z(h84 h84Var, mqs mqsVar, u84 u84Var, long j) {
        h84Var.getClass();
        if (mqsVar == null || u84Var == null) {
            ssg.a(3, null, "Cannot get track content", null);
            h84Var.B(tnl.f, h84Var.h);
            return;
        }
        ssg.a(4, null, "prepare() " + mqsVar, null);
        goh gohVar = new goh(3);
        gohVar.a.add(new nbv(Uri.parse(mqsVar.x0.a.getPathForSize(frv.b())), 0, 0));
        String B = zwf.B(mqsVar.i, mqsVar.f);
        goh.a("com.google.android.gms.cast.metadata.ARTIST");
        Bundle bundle = gohVar.b;
        bundle.putString("com.google.android.gms.cast.metadata.ARTIST", B);
        String str = mqsVar.d.d;
        goh.a("com.google.android.gms.cast.metadata.ALBUM_TITLE");
        bundle.putString("com.google.android.gms.cast.metadata.ALBUM_TITLE", str);
        String j2 = mqsVar.j();
        goh.a("com.google.android.gms.cast.metadata.TITLE");
        bundle.putString("com.google.android.gms.cast.metadata.TITLE", j2);
        String str2 = u84Var.a;
        String str3 = u84Var.b;
        long j3 = mqsVar.e;
        if (j3 < 0 && j3 != -1) {
            xq0.x("Invalid stream duration");
            return;
        }
        MediaInfo mediaInfo = new MediaInfo(str2, 1, str3, gohVar, j3, null, null, null, null, null, null, null, -1L, null, null, null, null);
        m64 m64Var = h84Var.e;
        boolean z = h84Var.h;
        m64Var.getClass();
        m64Var.b(new j64(z, j, mediaInfo));
    }

    public final long A() {
        mqs a = this.g.a();
        long j = a != null ? a.e : 0L;
        m64 m64Var = this.e;
        if (m64Var.e == null) {
            return 0L;
        }
        long longValue = ((Number) x97.D(dm6.b(), new k64(m64Var, null, 0))).longValue();
        return longValue <= 0 ? j : longValue;
    }

    public final void B(tnl tnlVar, boolean z) {
        if (this.f == tnlVar && this.h == z) {
            return;
        }
        this.f = tnlVar;
        this.h = z;
        this.a.Q(new gzk(this.g, tnlVar, z, false));
        if (this.f == tnl.f) {
            l18 l18Var = l18.b;
            bdt I = hag.I(j84.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            ((j84) qdcVar.C(I)).a();
        }
    }

    @Override // defpackage.s5d
    public final Object a(h4q h4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new qi(this, h4qVar, (Continuation) null, 23), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object b(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new e84(this, null, 2), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object c(p5d p5dVar, Continuation continuation) {
        Object V = x97.V(dm6.b(), new qi(this, p5dVar, (Continuation) null, 22), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object d(boolean z, u0r u0rVar) {
        return x97.V(dm6.b(), new ze1(this, z, null, 1), u0rVar);
    }

    @Override // defpackage.s5d
    public final Object e(u0r u0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object f(nej nejVar, qgl qglVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final long g() {
        return ((Number) ff7.L(new d84(this, 0))).longValue();
    }

    @Override // defpackage.s5d
    public final r5d getPlayerType() {
        return this.i;
    }

    @Override // defpackage.s5d
    public final long h() {
        return ((Number) ff7.L(new d84(this, 1))).longValue();
    }

    @Override // defpackage.s5d
    public final Object i(r0r r0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final i6q j() {
        return new nej(0);
    }

    @Override // defpackage.s5d
    public final Object k(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new ak1(this, (Continuation) null, 1), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object m(r0r r0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object n(Continuation continuation) {
        Object V = x97.V(dm6.b(), new e84(this, null, 3), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object o(long j, Continuation continuation) {
        Object V = x97.V(dm6.b(), new g84(this, j, null, 0), continuation);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object p(r0r r0rVar) {
        Object V = x97.V(dm6.b(), new e84(this, null, 5), r0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object q(r0r r0rVar) {
        return t(r0rVar);
    }

    @Override // defpackage.s5d
    public final Object r(Continuation continuation) {
        return x97.V(dm6.b(), new e84(this, null, 4), continuation);
    }

    @Override // defpackage.s5d
    public final Object s(r0r r0rVar) {
        return Unit.a;
    }

    @Override // defpackage.s5d
    public final Object t(Continuation continuation) {
        return x97.V(dm6.b(), new e84(this, null, 0), continuation);
    }

    @Override // defpackage.s5d
    public final Object u(eol eolVar) {
        return new Long(-1L);
    }

    @Override // defpackage.s5d
    public final Object v(n4q n4qVar, v0r v0rVar) {
        Object V = x97.V(dm6.b(), new db(2, 4, null), v0rVar);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // defpackage.s5d
    public final Object w(Continuation continuation) {
        return x97.V(dm6.b(), new e84(this, null, 1), continuation);
    }

    @Override // defpackage.s5d
    public final Object x(r0r r0rVar) {
        return x97.V(dm6.b(), new db(2, 3, null), r0rVar);
    }
}
