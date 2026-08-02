package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ya5 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ya5(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        xa5 xa5Var;
        nm6 nm6Var;
        int i;
        switch (this.a) {
            case 0:
                if (continuation instanceof xa5) {
                    xa5Var = (xa5) continuation;
                    int i2 = xa5Var.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xa5Var.l = i2 - Integer.MIN_VALUE;
                        Object obj2 = xa5Var.j;
                        nm6Var = nm6.a;
                        i = xa5Var.l;
                        if (i != 0) {
                            qgg.h0(obj2);
                            zi3 zi3Var = (zi3) this.c;
                            IndexedValue indexedValue = new IndexedValue(this.b, obj);
                            xa5Var.l = 1;
                            if (zi3Var.m(indexedValue, xa5Var) == nm6Var) {
                            }
                        } else if (i == 1) {
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        xa5Var.l = 2;
                        if (a4g.T(xa5Var) == nm6Var) {
                        }
                    }
                }
                xa5Var = new xa5(this, continuation);
                Object obj22 = xa5Var.j;
                nm6Var = nm6.a;
                i = xa5Var.l;
                if (i != 0) {
                }
                xa5Var.l = 2;
                if (a4g.T(xa5Var) == nm6Var) {
                }
                break;
            default:
                Object m = ((fvf) this.c).m(((Number) obj).intValue(), -this.b, continuation);
                if (m != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
