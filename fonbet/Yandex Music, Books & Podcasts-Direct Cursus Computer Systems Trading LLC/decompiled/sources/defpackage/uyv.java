package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class uyv {
    public final fkn a;
    public final hjp b;
    public final p0w c;
    public final Function0 d;
    public final xdr e;
    public final xdr f;
    public aur g;
    public final fkn h;

    public uyv(long j, vdr vdrVar, fkn fknVar, hjp hjpVar, p0w p0wVar, Function0 function0, mm6 mm6Var) {
        vdrVar.getClass();
        p0wVar.getClass();
        function0.getClass();
        this.a = fknVar;
        this.b = hjpVar;
        this.c = p0wVar;
        this.d = function0;
        this.e = ydr.a(hag.J(j));
        Object value = fknVar.a.getValue();
        Continuation continuation = null;
        zyv zyvVar = value instanceof zyv ? (zyv) value : null;
        boolean z = false;
        if (zyvVar != null && !zyvVar.f) {
            z = true;
        }
        this.f = ydr.a(Boolean.valueOf(!z));
        this.g = new d4t(2, 2, continuation);
        l8v l8vVar = new l8v(ox6.S(vdrVar), this, 4);
        Object value2 = vdrVar.getValue();
        syv O = ((j1w) ((cyv) hjpVar.b).c.a).a.O();
        if (!O.j) {
            ((lhs) O.c.getValue()).d();
        }
        this.h = lg3.u0(l8vVar, mm6Var, value2);
    }
}
