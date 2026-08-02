package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class y2q implements rjc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f3q b;
    public final /* synthetic */ p9w c;

    public y2q(f3q f3qVar, p9w p9wVar) {
        this.b = f3qVar;
        this.c = p9wVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                n7q n7qVar = ((d6l) obj).a;
                mwk b = v7g.x(n7qVar) == nyn.b ? n7qVar.b() : gdg.E(n7qVar);
                if (b == null) {
                    break;
                } else {
                    Object emit = this.b.a.emit(dag.p(b, new vm7(false, gut.R(n7qVar.g()), (Function0) this.c)), continuation);
                    if (emit != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                n7q n7qVar2 = ((d6l) obj).a;
                mwk E = gdg.E(n7qVar2);
                if (E == null) {
                    break;
                } else {
                    Object emit2 = this.b.a.emit(dag.p(E, new vm7(false, gut.R(n7qVar2.g()), (Function0) this.c)), continuation);
                    if (emit2 != nm6.a) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    public y2q(qqs qqsVar, p9w p9wVar, f3q f3qVar) {
        this.c = p9wVar;
        this.b = f3qVar;
    }
}
