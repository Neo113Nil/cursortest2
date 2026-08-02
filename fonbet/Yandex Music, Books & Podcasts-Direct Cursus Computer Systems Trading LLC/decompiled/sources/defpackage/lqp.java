package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class lqp extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pqp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqp(pqp pqpVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pqpVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                lqp lqpVar = new lqp(this.m, continuation, 0);
                lqpVar.l = obj;
                return lqpVar;
            case 1:
                lqp lqpVar2 = new lqp(this.m, continuation, 1);
                lqpVar2.l = obj;
                return lqpVar2;
            case 2:
                lqp lqpVar3 = new lqp(this.m, continuation, 2);
                lqpVar3.l = obj;
                return lqpVar3;
            default:
                lqp lqpVar4 = new lqp(this.m, continuation, 3);
                lqpVar4.l = obj;
                return lqpVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((lqp) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        pqp pqpVar = this.m;
        switch (i) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Object f = ((dtt) pqpVar.x.getValue()).f(pff.e);
                    this.l = null;
                    this.k = 1;
                    if (rjcVar.emit(f, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    boolean z = !v3g.E((frt) pqpVar.G().a.getValue()).f;
                    jyr jyrVar = o5j.e;
                    j53 j53Var = new j53(z, !tyf.v());
                    this.l = null;
                    this.k = 1;
                    if (rjcVar2.emit(j53Var, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                rjc rjcVar3 = (rjc) this.l;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    n8q n8qVar = (n8q) pqpVar.o.getValue();
                    hil hilVar = thr.a;
                    n8qVar.getClass();
                    String a = n8qVar.a.a(thr.d);
                    m53 m53Var = new m53(a != null && new File(a).exists());
                    this.l = null;
                    this.k = 1;
                    if (rjcVar3.emit(m53Var, this) == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                rjc rjcVar4 = (rjc) this.l;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    p53 p53Var = new p53(((Boolean) pqpVar.E.getValue()).booleanValue(), pqpVar.G().e, ((Boolean) pqpVar.F.getValue()).booleanValue(), ((Boolean) pqpVar.G.getValue()).booleanValue());
                    this.l = null;
                    this.k = 1;
                    if (rjcVar4.emit(p53Var, this) == nm6Var4) {
                        break;
                    }
                } else if (i5 != 1) {
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
