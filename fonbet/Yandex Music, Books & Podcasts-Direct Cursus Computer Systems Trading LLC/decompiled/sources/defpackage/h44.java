package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h44 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public xdr k;
    public int l;
    public final /* synthetic */ i44 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h44(i44 i44Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = i44Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h44(this.m, continuation, 0);
            default:
                return new h44(this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h44) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        xdr xdrVar;
        xdr xdrVar2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    i44 i44Var = this.m;
                    xdr xdrVar3 = i44Var.f;
                    this.k = xdrVar3;
                    this.l = 1;
                    obj = i44.a(i44Var, this);
                    if (obj != nm6Var) {
                        xdrVar = xdrVar3;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xdrVar = this.k;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    i44 i44Var2 = this.m;
                    xdr xdrVar4 = i44Var2.e;
                    this.k = xdrVar4;
                    this.l = 1;
                    obj = x97.V(dm6.b, new f44(i44Var2, null), this);
                    if (obj != nm6Var2) {
                        xdrVar2 = xdrVar4;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xdrVar2 = this.k;
                    qgg.h0(obj);
                }
                xdrVar2.l(obj);
                break;
        }
        return Unit.a;
    }
}
