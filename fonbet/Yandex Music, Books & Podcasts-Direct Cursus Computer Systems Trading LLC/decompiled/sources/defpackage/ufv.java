package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class ufv extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ wfv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufv(wfv wfvVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = wfvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ufv(this.l, continuation, 0);
            default:
                return new ufv(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ufv) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.p;
                    vev vevVar = vev.a;
                    this.k = 1;
                    if (j0qVar.emit(vevVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                xdr xdrVar = this.l.n;
                do {
                    value = xdrVar.getValue();
                    obj2 = (kfv) value;
                    if (obj2 instanceof jfv) {
                        obj2 = ifv.a;
                    }
                } while (!xdrVar.k(value, obj2));
                break;
        }
        return Unit.a;
    }
}
