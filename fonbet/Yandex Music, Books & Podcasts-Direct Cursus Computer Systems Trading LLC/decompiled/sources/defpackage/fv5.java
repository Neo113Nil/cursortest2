package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fv5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ iv5 k;
    public final /* synthetic */ fp7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv5(iv5 iv5Var, fp7 fp7Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = iv5Var;
        this.l = fp7Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fv5(this.k, this.l, continuation, 0);
            default:
                return new fv5(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fv5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        Object value2;
        Object obj3;
        int i = this.j;
        jv5 jv5Var = jv5.a;
        kv5 kv5Var = kv5.a;
        fp7 fp7Var = this.l;
        iv5 iv5Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                int j = fp7Var.j();
                xdr xdrVar = iv5Var.a.o;
                do {
                    value = xdrVar.getValue();
                    obj2 = (mv5) value;
                    if (!Intrinsics.d(obj2, kv5Var) && !Intrinsics.d(obj2, jv5Var)) {
                        if (!(obj2 instanceof lv5)) {
                            b6e.s();
                            break;
                        } else {
                            obj2 = lv5.a((lv5) obj2, j, 0, null, 61);
                        }
                    }
                } while (!xdrVar.k(value, obj2));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                int q = fp7Var.q();
                xdr xdrVar2 = iv5Var.a.o;
                do {
                    value2 = xdrVar2.getValue();
                    obj3 = (mv5) value2;
                    if (!Intrinsics.d(obj3, kv5Var) && !Intrinsics.d(obj3, jv5Var)) {
                        if (!(obj3 instanceof lv5)) {
                            b6e.s();
                            break;
                        } else {
                            obj3 = lv5.a((lv5) obj3, 0, q, null, 59);
                        }
                    }
                } while (!xdrVar2.k(value2, obj3));
                break;
        }
        return null;
    }
}
