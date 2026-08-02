package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class nlc implements rjc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public nlc(suf sufVar, List list, int i, Function1 function1) {
        this.c = sufVar;
        this.d = list;
        this.b = i;
        this.e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        mlc mlcVar;
        int i;
        switch (this.a) {
            case 0:
                if (continuation instanceof mlc) {
                    mlcVar = (mlc) continuation;
                    int i2 = mlcVar.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mlcVar.l = i2 - Integer.MIN_VALUE;
                        Object obj2 = mlcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = mlcVar.l;
                        if (i != 0) {
                            qgg.h0(obj2);
                            vqn vqnVar = (vqn) this.c;
                            int i3 = vqnVar.a + 1;
                            vqnVar.a = i3;
                            rjc rjcVar = (rjc) this.d;
                            if (i3 >= this.b) {
                                mlcVar.l = 2;
                                tt0.t(rjcVar, obj, this.e, mlcVar);
                                return nm6Var;
                            }
                            mlcVar.l = 1;
                            if (rjcVar.emit(obj, mlcVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1 && i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                        }
                        return Unit.a;
                    }
                }
                mlcVar = new mlc(this, continuation);
                Object obj22 = mlcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = mlcVar.l;
                if (i != 0) {
                }
                return Unit.a;
            default:
                suf sufVar = (suf) this.c;
                suf.c(sufVar, (jvf) obj, (List) this.d, 3, this.b, (Function1) this.e);
                return Unit.a;
        }
    }

    public nlc(vqn vqnVar, int i, rjc rjcVar, Object obj) {
        this.c = vqnVar;
        this.b = i;
        this.d = rjcVar;
        this.e = obj;
    }
}
