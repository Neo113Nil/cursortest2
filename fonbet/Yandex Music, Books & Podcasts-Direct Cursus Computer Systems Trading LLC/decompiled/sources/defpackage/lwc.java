package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class lwc {
    public static final Object l = btf.a(bwf.c, new htb(13));
    public final m88 a;
    public final cpr b;
    public final mm6 c;
    public final x0q d;
    public final x0q e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final xdr h;
    public final jyr i;
    public final fkn j;
    public final fkn k;

    public lwc(jyr jyrVar, jyr jyrVar2, m88 m88Var, cpr cprVar) {
        tf6 e = gld.e(dm6.b);
        this.a = m88Var;
        this.b = cprVar;
        this.c = e;
        Continuation continuation = null;
        this.d = y0q.b(0, 0, null, 7);
        this.e = y0q.b(0, 0, null, 7);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        xdr a = ydr.a(0);
        this.h = a;
        this.i = jyrVar2;
        ox6.B(zsd.b0(new bca(((frt) jyrVar.getValue()).g(), 22)), e, new jwc(this, 1));
        ox6.B(a, e, new jwc(this, 0));
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        int i = 3;
        u21 u21Var = new u21(10, ((hrq) ((byb) qdcVar.C(I)).b(hrq.class)).e, zsd.b0(new kp2(v3g.D(cprVar.a), 2)), new ib3(i, 4, continuation));
        z7l z7lVar = lbq.b;
        Boolean bool = Boolean.FALSE;
        this.j = zsd.F0(u21Var, e, z7lVar, bool);
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.k = zsd.F0(new u21(10, ((hrq) ((byb) qdcVar2.C(I2)).b(hrq.class)).e, zsd.b0(new kp2(v3g.D(cprVar.a), 2)), new ib3(i, 5, continuation)), e, lbq.a, bool);
    }

    public final boolean a() {
        if (this.b.a()) {
            return false;
        }
        return ((hrq) ((byb) l18.b.c(hag.I(byb.class))).b(hrq.class)).h();
    }

    public final void b(qwc qwcVar) {
        xdr xdrVar;
        Object value;
        if (qwcVar.equals(nwc.a)) {
            do {
                xdrVar = this.h;
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
        } else if (qwcVar.equals(owc.a)) {
            c();
        } else {
            if (!qwcVar.equals(pwc.a)) {
                b6e.s();
                return;
            }
            x97.y(this.c, null, null, new g68(this, null, 20), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final void c() {
        ((v1u) this.i.getValue()).b(((List) l.getValue()).size() * 20);
    }
}
