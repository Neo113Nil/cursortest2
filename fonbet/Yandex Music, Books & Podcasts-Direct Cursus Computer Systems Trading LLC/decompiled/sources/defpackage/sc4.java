package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class sc4 implements hzc {
    public final CoroutineContext a;
    public final int b;
    public final oi3 c;

    public sc4(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        this.a = coroutineContext;
        this.b = i;
        this.c = oi3Var;
    }

    @Override // defpackage.hzc
    public final pjc c(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        oi3 oi3Var2 = oi3.a;
        oi3 oi3Var3 = this.c;
        int i2 = this.b;
        if (oi3Var == oi3Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            oi3Var = oi3Var3;
        }
        return (Intrinsics.d(plus, coroutineContext2) && i == i2 && oi3Var == oi3Var3) ? this : f(plus, i, oi3Var);
    }

    @Override // defpackage.pjc
    public Object collect(rjc rjcVar, Continuation continuation) {
        Object Q = gld.Q(new rc4(rjcVar, this, null, 0), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }

    public String d() {
        return null;
    }

    public abstract Object e(ltm ltmVar, Continuation continuation);

    public abstract sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var);

    public pjc h() {
        return null;
    }

    public qln i(mm6 mm6Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        pm6 pm6Var = pm6.c;
        Function2 cs1Var = new cs1(this, (Continuation) null, 20);
        ktm ktmVar = new ktm(bm6.b(mm6Var, this.a), men.g(i, 4, this.c), true, true);
        ktmVar.o0(pm6Var, ktmVar, cs1Var);
        return ktmVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        g gVar = g.a;
        CoroutineContext coroutineContext = this.a;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        oi3 oi3Var = oi3.a;
        oi3 oi3Var2 = this.c;
        if (oi3Var2 != oi3Var) {
            arrayList.add("onBufferOverflow=" + oi3Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return dfi.i(sb, CollectionsKt.X(arrayList, ", ", null, null, null, 62), ']');
    }
}
