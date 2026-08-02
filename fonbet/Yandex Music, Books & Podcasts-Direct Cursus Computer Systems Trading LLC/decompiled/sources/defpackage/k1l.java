package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public final class k1l {
    public static final String i = f1d.g("SharedPlaybackCore:", "PlaybackProcessor");
    public final bsn a;
    public final x3l b;
    public final q8b c;
    public final tf6 d;
    public final x0q e;
    public final j6e f;
    public final cr g;
    public final anx h;

    public k1l(bsn bsnVar, x3l x3lVar, q8b q8bVar, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = bsnVar;
        this.b = x3lVar;
        this.c = q8bVar;
        tf6 e = gld.e(e.c(a4g.n(), coroutineContext).plus(new im6(i)));
        this.d = e;
        this.e = y0q.b(0, 10, oi3.c, 1);
        j6e j6eVar = new j6e(19);
        this.f = j6eVar;
        this.g = new cr(bsnVar, j6eVar);
        anx anxVar = new anx();
        anxVar.d = this;
        anxVar.c = rqi.a();
        this.h = anxVar;
        r2f r2fVar = (r2f) e.a.get(o6c.l);
        if (r2fVar != null) {
            r2fVar.R(new e0l(20));
        }
        x97.y(e, null, null, new m1i(this, null, 28), 3);
    }

    public final void a(dyk dykVar, c3t c3tVar) {
        dykVar.getClass();
        this.e.a(new d1l(dykVar, c3tVar));
    }

    public final void b(gyk gykVar, c3t c3tVar) {
        this.e.a(new c1l(gykVar, c3tVar));
    }
}
