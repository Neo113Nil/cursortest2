package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class hqp implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pqp b;

    public /* synthetic */ hqp(pqp pqpVar, int i) {
        this.a = i;
        this.b = pqpVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.k.l((List) obj);
                break;
            default:
                thr thrVar = (thr) obj;
                xdr xdrVar = this.b.l;
                thr thrVar2 = thr.c;
                Pair pair = new Pair(thrVar2, Boolean.valueOf(thrVar == thrVar2));
                thr thrVar3 = thr.d;
                xdrVar.l(u75.h(pair, new Pair(thrVar3, Boolean.valueOf(thrVar == thrVar3))));
                break;
        }
        return Unit.a;
    }
}
