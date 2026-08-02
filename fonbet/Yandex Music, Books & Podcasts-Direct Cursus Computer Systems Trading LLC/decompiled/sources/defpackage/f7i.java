package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f7i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j7i l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ a0p n;
    public final /* synthetic */ xqn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7i(j7i j7iVar, pjc pjcVar, a0p a0pVar, xqn xqnVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j7iVar;
        this.m = pjcVar;
        this.n = a0pVar;
        this.o = xqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f7i(this.l, this.m, this.n, this.o, continuation, 0);
            default:
                return new f7i(this.l, this.m, this.n, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((f7i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((f7i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j7i j7iVar = this.l;
                xdr xdrVar = j7iVar.C;
                e7i e7iVar = new e7i(j7iVar, this.m, this.n, this.o, 0);
                this.k = 1;
                xdrVar.collect(e7iVar, this);
                return nm6Var;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j7i j7iVar2 = this.l;
                xdr xdrVar2 = j7iVar2.D;
                e7i e7iVar2 = new e7i(j7iVar2, this.m, this.n, this.o, 1);
                this.k = 1;
                xdrVar2.collect(e7iVar2, this);
                return nm6Var2;
        }
    }
}
