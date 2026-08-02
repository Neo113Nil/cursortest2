package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s78 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ c88 b;

    public /* synthetic */ s78(c88 c88Var, int i) {
        this.a = i;
        this.b = c88Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        n7q n7qVar;
        n7q n7qVar2;
        switch (this.a) {
            case 0:
                c88 c88Var = this.b;
                x97.y(c88Var.b, null, null, new b88(c88Var, null), 3);
                break;
            default:
                Pair pair = (Pair) obj;
                e6l e6lVar = (e6l) pair.a;
                e6l e6lVar2 = (e6l) pair.b;
                d6l d6lVar = e6lVar2 instanceof d6l ? (d6l) e6lVar2 : null;
                d6l d6lVar2 = e6lVar instanceof d6l ? (d6l) e6lVar : null;
                boolean z = d6lVar2 == null && d6lVar != null;
                boolean d = Intrinsics.d((d6lVar2 == null || (n7qVar2 = d6lVar2.a) == null) ? null : n7qVar2.g(), (d6lVar == null || (n7qVar = d6lVar.a) == null) ? null : n7qVar.g());
                if ((z || !d || !p6g.C(e6lVar)) && p6g.C(e6lVar2)) {
                    c88 c88Var2 = this.b;
                    x97.y(c88Var2.b, null, null, new b88(c88Var2, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
