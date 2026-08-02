package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kmw {
    public final amw a;

    public kmw(amw amwVar, slw slwVar) {
        this.a = amwVar;
    }

    public final boolean a(cyk... cykVarArr) {
        cyk cykVar;
        d6l x = p6g.x((e6l) this.a.a.a.c.getValue());
        if (x == null) {
            cykVar = cyk.a;
        } else {
            mwk b = x.a.b();
            kwk kwkVar = h1b.e;
            if (Intrinsics.d(b, kwkVar)) {
                b = null;
            }
            cykVar = b == null ? cyk.a : b.equals(kwkVar) ? cyk.a : (cyk) dag.p(b, x2i.l);
        }
        return xz0.u(cykVarArr, cykVar);
    }
}
