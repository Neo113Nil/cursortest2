package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class f7l {
    public static final String f = f1d.g("SharedPlaybackCore:", "PlaybackStateOwner");
    public final g4l a;
    public final uol b;
    public final xdr c;
    public final xdr d;
    public final x0q e;

    public f7l(g4l g4lVar, uol uolVar, x6l x6lVar, a aVar) {
        aVar.getClass();
        this.a = g4lVar;
        this.b = uolVar;
        tf6 e = gld.e(e.c(a4g.n(), aVar).plus(new im6(f)));
        xdr xdrVar = x6lVar.d;
        this.c = xdrVar;
        this.d = x6lVar.f;
        this.e = x6lVar.j;
        ox6.B(zsd.C(x6lVar.h, -1), gld.X(e, dm6.b()), new z6l(this, 0));
        ox6.B(zsd.b0(uolVar.b), e, new fmi(26, x6lVar));
        int i = 3;
        Continuation continuation = null;
        pjc C = zsd.C(zsd.M0(new bca(g4lVar.c, 18), new tn2(i, 14, continuation)), 0);
        ox6.B(ox6.R(C, null), e, new c7l(this, x6lVar, 0));
        ox6.B(zsd.C(zsd.M0(new bca(g4lVar.d, 18), new tn2(i, 15, continuation)), 0), e, new c7l(this, x6lVar, 1));
        ox6.B(x6lVar.l, e, new z6l(this, 1));
        ox6.B(C, e, new o7b(8));
        ox6.B(xdrVar, e, new o7b(9));
    }

    public final Object a(cg6 cg6Var) {
        Object V = x97.V(dm6.b(), new fr4(this, (Continuation) null, 8), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }
}
