package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class w1q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ced l;
    public final /* synthetic */ z1q m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1q(ced cedVar, Continuation continuation, z1q z1qVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = cedVar;
        this.m = z1qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new w1q(this.l, continuation, this.m, 0);
            default:
                return new w1q(this.l, continuation, this.m, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((w1q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ced cedVar = this.m.e.c;
                    this.k = 1;
                    mdg mdgVar = cedVar.a;
                    mdk prevPayload = cedVar.b().getPayloadFactory().getPrevPayload(true, !((vhd) cedVar.u.getValue()).c);
                    prevPayload.getClass();
                    if (cedVar.H(mdgVar, "prev", prevPayload, this) == nm6Var) {
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
                    ced cedVar2 = this.m.e.c;
                    this.k = 1;
                    if (cedVar2.o(this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
