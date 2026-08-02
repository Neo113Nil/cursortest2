package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class bx {
    public static final /* synthetic */ s9f[] f;
    public final tf6 a = gld.e(dm6.b);
    public final jyr b;
    public final xdr c;
    public final fkn d;
    public final z6n e;

    static {
        opi opiVar = new opi(bx.class, "fetchJob", "getFetchJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        f = new s9f[]{opiVar};
    }

    public bx(jyr jyrVar) {
        this.b = jyrVar;
        xdr a = ydr.a(vw.a);
        this.c = a;
        this.d = new fkn(a);
        this.e = new z6n(7);
    }

    public final void a(String str, b80 b80Var) {
        tw twVar;
        xdr xdrVar = this.c;
        Object value = xdrVar.getValue();
        xw xwVar = value instanceof xw ? (xw) value : null;
        ow owVar = (xwVar == null || (twVar = xwVar.a) == null) ? null : twVar.a;
        xdrVar.getClass();
        xdrVar.m(null, ww.a);
        this.e.setValue(this, f[0], x97.y(this.a, null, null, new ov(this, str, b80Var, owVar, (Continuation) null, 2), 3));
    }
}
