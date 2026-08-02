package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class epq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ gpq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epq(gpq gpqVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = gpqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new epq(this.l, continuation, 0);
            default:
                return new epq(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((epq) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                gpq gpqVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = gpqVar.m;
                    xdr xdrVar2 = gpqVar.l;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    if (!(xdrVar2.getValue() instanceof bpq)) {
                        xdrVar2.getClass();
                        xdrVar2.m(null, apq.a);
                    }
                    gpqVar.r.p();
                    this.k = 1;
                    if (gpqVar.V(null, null, true, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                gpqVar.r.o();
                xdr xdrVar3 = gpqVar.m;
                Boolean bool2 = Boolean.FALSE;
                xdrVar3.getClass();
                xdrVar3.m(null, bool2);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.o;
                    Integer num = new Integer(0);
                    this.k = 1;
                    if (j0qVar.emit(num, this) == nm6Var2) {
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
