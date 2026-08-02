package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class tal implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqn b;
    public final /* synthetic */ rjc c;

    public /* synthetic */ tal(tqn tqnVar, rjc rjcVar, int i) {
        this.a = i;
        this.b = tqnVar;
        this.c = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(int i, Continuation continuation) {
        fdr fdrVar;
        int i2;
        if (continuation instanceof fdr) {
            fdrVar = (fdr) continuation;
            int i3 = fdrVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fdrVar.l = i3 - Integer.MIN_VALUE;
                Object obj = fdrVar.j;
                nm6 nm6Var = nm6.a;
                i2 = fdrVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (i > 0) {
                        tqn tqnVar = this.b;
                        if (!tqnVar.a) {
                            tqnVar.a = true;
                            kbq kbqVar = kbq.a;
                            fdrVar.l = 1;
                            if (this.c.emit(kbqVar, fdrVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                return Unit.a;
            }
        }
        fdrVar = new fdr(this, continuation);
        Object obj2 = fdrVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = fdrVar.l;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                aal aalVar = (aal) obj;
                aal aalVar2 = aal.c;
                tqn tqnVar = this.b;
                if (aalVar == aalVar2) {
                    tqnVar.a = true;
                } else if (aalVar == aal.b && tqnVar.a) {
                    tqnVar.a = false;
                    Object emit = this.c.emit(aalVar, continuation);
                    return emit == nm6.a ? emit : Unit.a;
                }
                return Unit.a;
            default:
                return b(((Number) obj).intValue(), continuation);
        }
    }
}
