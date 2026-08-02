package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class vmf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ xmf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmf(xmf xmfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = xmfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vmf(this.l, continuation, 0);
            default:
                return new vmf(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vmf) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ofo ofoVar = this.l.a;
                    this.k = 1;
                    if (uwf.h(ofoVar.a.c(), this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                xmf xmfVar = this.l;
                xdr xdrVar = xmfVar.d;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ofo ofoVar2 = xmfVar.a;
                    this.k = 1;
                    obj = ofoVar2.b(this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    if (!(rj6Var instanceof qj6)) {
                        b6e.s();
                        break;
                    } else {
                        xdrVar.l(((qj6) rj6Var).a);
                    }
                } else {
                    xdrVar.l(null);
                }
                break;
        }
        return Unit.a;
    }
}
