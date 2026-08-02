package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class wc4 extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yc4 m;
    public final /* synthetic */ rjc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(yc4 yc4Var, rjc rjcVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.m = yc4Var;
        this.n = rjcVar;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wc4(this.m, this.n, this.l, continuation);
            default:
                wc4 wc4Var = new wc4(this.m, this.n, continuation);
                wc4Var.l = obj;
                return wc4Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wc4) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ?? r10 = this.m.e;
                    Object obj2 = this.l;
                    this.k = 1;
                    if (r10.invoke(this.n, obj2, this) == nm6Var) {
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
                    mm6 mm6Var = (mm6) this.l;
                    xqn xqnVar = new xqn();
                    yc4 yc4Var = this.m;
                    pjc pjcVar = yc4Var.d;
                    pm pmVar = new pm((Object) xqnVar, (Object) mm6Var, (Object) yc4Var, this.n, 2);
                    this.k = 1;
                    if (pjcVar.collect(pmVar, this) == nm6Var2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(yc4 yc4Var, rjc rjcVar, Continuation continuation) {
        super(2, continuation);
        this.m = yc4Var;
        this.n = rjcVar;
    }
}
