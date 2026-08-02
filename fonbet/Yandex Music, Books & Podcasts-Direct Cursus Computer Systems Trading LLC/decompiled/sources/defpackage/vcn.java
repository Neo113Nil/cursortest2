package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vcn implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ n3m c;

    public /* synthetic */ vcn(rjc rjcVar, n3m n3mVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = n3mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        tcn tcnVar;
        int i;
        zcn zcnVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof tcn) {
                    tcnVar = (tcn) continuation;
                    int i3 = tcnVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tcnVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = tcnVar.j;
                        nm6 nm6Var = nm6.a;
                        i = tcnVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Pair K0 = this.c.K0((String) obj);
                            tcnVar.k = 1;
                            if (this.b.emit(K0, tcnVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                tcnVar = new tcn(this, continuation);
                Object obj22 = tcnVar.j;
                nm6 nm6Var2 = nm6.a;
                i = tcnVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof zcn) {
                    zcnVar = (zcn) continuation;
                    int i4 = zcnVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zcnVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = zcnVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = zcnVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Pair K02 = this.c.K0((String) obj);
                            zcnVar.k = 1;
                            if (this.b.emit(K02, zcnVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                zcnVar = new zcn(this, continuation);
                Object obj32 = zcnVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = zcnVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
