package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class npq {
    public final y a;
    public final hq0 b;
    public final nyf c;
    public final arf d;
    public final fjf e;
    public final mka f;
    public final kxi g;
    public final tmb h;
    public final nmj i;
    public final x6k j;
    public final t6k k;
    public final jyr l;
    public final ybf m;
    public final fvf n;
    public final xdr o;
    public final xdr p;

    public npq(Context context, y yVar, hq0 hq0Var, nyf nyfVar, jfu jfuVar, arf arfVar, fjf fjfVar, mka mkaVar, kxi kxiVar, tmb tmbVar, nmj nmjVar) {
        context.getClass();
        yVar.getClass();
        nyfVar.getClass();
        jfuVar.getClass();
        arfVar.getClass();
        nmjVar.getClass();
        this.a = yVar;
        this.b = hq0Var;
        this.c = nyfVar;
        this.d = arfVar;
        this.e = fjfVar;
        this.f = mkaVar;
        this.g = kxiVar;
        this.h = tmbVar;
        this.i = nmjVar;
        Boolean bool = Boolean.FALSE;
        this.j = szf.g0(bool);
        this.k = new t6k(1.0f);
        this.l = l18.b.b(hag.I(skr.class), true);
        this.m = new ybf(ern.a(xqq.class), new r71(jfuVar, 9), new xpp(6, new jpq(this, 0)));
        this.n = new fvf(0, 0);
        this.o = ydr.a(bool);
        this.p = ydr.a(bool);
    }

    public final xqq a() {
        return (xqq) this.m.getValue();
    }

    public final void b(float f) {
        rnq rnqVar;
        cpq cpqVar = (cpq) ((xdr) a().M()).getValue();
        if (!(cpqVar instanceof bpq) || (rnqVar = (rnq) CollectionsKt.S(((bpq) cpqVar).a, 0)) == null) {
            return;
        }
        r2s r2sVar = rnqVar instanceof r2s ? (r2s) rnqVar : null;
        if (r2sVar != null) {
            r2sVar.m.h(f);
        }
    }
}
