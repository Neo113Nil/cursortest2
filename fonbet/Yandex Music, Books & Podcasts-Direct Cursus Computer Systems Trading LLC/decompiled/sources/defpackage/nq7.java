package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nq7 implements b1q {
    public final k7q e;
    public final c5d f;
    public final f7l g;
    public final uoh h;
    public final q4d i;
    public final f4d j;
    public final c4d k;
    public final b5d l;
    public final j4d m;
    public final Function0 n;
    public final yiq o;
    public final mm6 p;
    public rar q;
    public final d5d r;
    public final x0q s;
    public final xdr t;

    public nq7(k7q k7qVar, c5d c5dVar, f7l f7lVar, uoh uohVar, q4d q4dVar, f4d f4dVar, c4d c4dVar, b5d b5dVar, j4d j4dVar, Function0 function0) {
        k7qVar.getClass();
        c5dVar.getClass();
        q4dVar.getClass();
        f4dVar.getClass();
        c4dVar.getClass();
        b5dVar.getClass();
        j4dVar.getClass();
        this.e = k7qVar;
        this.f = c5dVar;
        this.g = f7lVar;
        this.h = uohVar;
        this.i = q4dVar;
        this.j = f4dVar;
        this.k = c4dVar;
        this.l = b5dVar;
        this.m = j4dVar;
        this.n = function0;
        yiq yiqVar = new yiq();
        this.o = yiqVar;
        this.p = hld.r(yiqVar, dm6.b);
        this.r = c5dVar.a.a;
        this.s = y0q.b(0, 0, null, 7);
        this.t = ydr.a(r7q.a);
        yiqVar.D(new yg6(6, this));
    }

    public static final void b(nq7 nq7Var, e4d e4dVar, boolean z, String str, b3l b3lVar) {
        x97.y(nq7Var.p, null, null, new aj4(nq7Var, e4dVar, str, z, b3lVar, (Continuation) null), 3);
    }

    public static final kq7 c(e6l e6lVar) {
        e5d e5dVar;
        Boolean bool = null;
        if (Intrinsics.d(e6lVar, b6l.a)) {
            return new kq7(null, null);
        }
        if (e6lVar instanceof c6l) {
            return new kq7(null, null);
        }
        if (!(e6lVar instanceof d6l)) {
            b6e.s();
            return null;
        }
        d6l d6lVar = (d6l) e6lVar;
        mwk b = d6lVar.a.b();
        k4d k4dVar = b instanceof k4d ? (k4d) b : null;
        String str = (k4dVar == null || (e5dVar = k4dVar.a) == null) ? null : e5dVar.a;
        w0l w0lVar = d6lVar.b;
        if (w0lVar == w0l.b && d6lVar.c == v0l.d) {
            bool = Boolean.TRUE;
        } else if (w0lVar == w0l.a) {
            bool = Boolean.FALSE;
        }
        return new kq7(str, bool);
    }

    @Override // defpackage.g4q
    public final void a(c9g c9gVar) {
        ssg.a(3, "DefaultSharedGenerativePlaybackQueue", "stop station=" + this.r, null);
        this.o.V();
    }

    @Override // defpackage.g4q
    public final k7q getDescriptor() {
        return this.e;
    }

    @Override // defpackage.g4q
    public final vdr getState() {
        return this.t;
    }

    @Override // defpackage.g4q
    public final void start() {
        Continuation continuation = null;
        ssg.a(3, "DefaultSharedGenerativePlaybackQueue", "start station=" + this.r, null);
        boolean booleanValue = ((Boolean) this.n.invoke()).booleanValue();
        xdr xdrVar = this.g.c;
        mm6 mm6Var = this.p;
        if (booleanValue) {
            ox6.B(new ub7(1, zsd.a0(xdrVar, new fp5(20)), this), mm6Var, new iq7(this, 1));
        } else {
            ox6.B(zsd.d0(zsd.a0(new fs(10, new d64(xdrVar, 22)), new fp5(21)), 1), mm6Var, new iq7(this, 2));
        }
        ox6.B(new u21(10, this.s, this.h.a, new t81(this, continuation, 4)), mm6Var, new iq7(this, 0));
        x97.y(mm6Var, null, null, new bv6(this, z2l.a, continuation, 23), 3);
    }
}
