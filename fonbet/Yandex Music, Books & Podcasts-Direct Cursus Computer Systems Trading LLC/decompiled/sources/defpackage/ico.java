package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class ico extends nco {
    public final lm4 a;
    public final Function1 b;
    public final ArrayList c;
    public final nco d;

    public ico(lm4 lm4Var, Function1 function1, ArrayList arrayList, nco ncoVar) {
        ncoVar.getClass();
        this.a = lm4Var;
        this.b = function1;
        this.c = arrayList;
        this.d = ncoVar;
    }

    @Override // defpackage.nco
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        Object obj;
        nco ncoVar;
        lm4 lm4Var = this.a;
        if (!lm4Var.i(exc)) {
            xq0.x(hrg.r("Invalid exception ", ern.a(exc.getClass()).h(), " in ResponseCode retry for ", lm4Var.h()));
            return null;
        }
        bow.m(lm4Var, exc);
        int intValue = ((Number) this.b.invoke(exc)).intValue();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            IntRange intRange = (IntRange) ((Pair) obj).a;
            int i = intRange.a;
            if (intValue <= intRange.b && i <= intValue) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        return (pair == null || (ncoVar = (nco) pair.b) == null) ? this.d.a(z, exc, cg6Var) : ncoVar.a(z, exc, cg6Var);
    }
}
