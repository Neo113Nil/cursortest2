package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x800 implements s1m {
    @Override // defpackage.s1m
    public final ywl b(kq90 kq90Var, ywl ywlVar, ywl ywlVar2, ywl ywlVar3) {
        return ywlVar3;
    }

    @Override // defpackage.s1m
    public final Object c(klc klcVar, u1m u1mVar, kq90 kq90Var, ywl ywlVar, Throwable th, Continuation continuation) {
        dzp0 d0;
        kr krVar;
        if ((kq90Var instanceof d3q0) && (d0 = rzo.d0(ywlVar)) != null) {
            w2q0 w2q0Var = ((d3q0) kq90Var).a;
            if (w2q0Var instanceof u2q0) {
                u2q0 u2q0Var = (u2q0) w2q0Var;
                if (jl40.l(u2q0Var.a(), "async_data_placeholder")) {
                    ArrayList arrayList = new ArrayList(d0.b);
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (jl40.l(((pyp0) it.next()).getA(), u2q0Var.a())) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        pyp0 pyp0Var = (pyp0) arrayList.get(i);
                        if (pyp0Var instanceof cvl) {
                            arrayList.set(i, ((cvl) pyp0Var).g());
                            uwl uwlVar = ywlVar.d;
                            return ywl.a(ywlVar, dzp0.b(d0, arrayList), null, null, uwlVar != null ? uwl.a(uwlVar, (uwlVar == null || (krVar = uwlVar.b) == null) ? null : cvw.Y(krVar, new iez(19)), null, null, 61) : null, 54);
                        }
                    }
                }
            }
        }
        return ywlVar;
    }
}
