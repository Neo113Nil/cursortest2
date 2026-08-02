package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1d extends bfu {
    public final t0d k;
    public final e0d l;
    public final arf m;
    public final awc n;
    public w0d o;
    public final xdr p;
    public final fkn q;

    public c1d(t0d t0dVar, e0d e0dVar, arf arfVar, arf arfVar2) {
        arfVar2.getClass();
        this.k = t0dVar;
        this.l = e0dVar;
        this.m = arfVar;
        arfVar2.getClass();
        awc awcVar = new awc();
        awcVar.a = arfVar2;
        this.n = awcVar;
        xdr a = ydr.a(y0d.a);
        this.p = a;
        this.q = new fkn(a);
        x97.y(ot0.F(this), null, null, new g68(this, null, 24), 3);
    }

    public static void a(bqi bqiVar, Function1 function1) {
        xdr xdrVar;
        Object value;
        a1d a1dVar;
        do {
            xdrVar = (xdr) bqiVar;
            value = xdrVar.getValue();
            a1dVar = (a1d) value;
            if (!Intrinsics.d(a1dVar, y0d.a) && !Intrinsics.d(a1dVar, x0d.a)) {
                if (!(a1dVar instanceof z0d)) {
                    b6e.s();
                    return;
                }
                a1dVar = (a1d) function1.invoke(a1dVar);
            }
        } while (!xdrVar.k(value, a1dVar));
    }
}
