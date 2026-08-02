package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ec7 {
    public static final Boolean a(hmm hmmVar, String str) {
        hmmVar.getClass();
        return (Boolean) ((lpi) hmmVar).a.get(new hmm.a(str));
    }

    public static final String b(hmm hmmVar, String str) {
        return (String) ((lpi) hmmVar).a.get(new hmm.a(str));
    }

    public static final Object c(wb7 wb7Var, Function1 function1, cg6 cg6Var) {
        Object a = wb7Var.a(new lz6(function1, (Continuation) null, 2), cg6Var);
        return a == nm6.a ? a : Unit.a;
    }

    public static final void d(lpi lpiVar, String str, boolean z) {
        lpiVar.getClass();
        lpiVar.h(new hmm.a(str), Boolean.valueOf(z));
    }

    public static final void e(lpi lpiVar, String str, String str2) {
        lpiVar.getClass();
        lpiVar.h(new hmm.a(str), str2);
    }
}
