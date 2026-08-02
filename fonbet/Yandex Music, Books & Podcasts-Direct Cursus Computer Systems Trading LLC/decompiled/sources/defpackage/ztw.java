package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ztw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fuw l;
    public /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztw(fuw fuwVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fuwVar;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ztw(this.l, this.m, continuation, 0);
            case 1:
                return new ztw(this.l, this.m, continuation, 1);
            case 2:
                return new ztw(this.l, this.m, continuation, 2);
            case 3:
                return new ztw(this.l, this.m, continuation, 3);
            default:
                ztw ztwVar = new ztw(this.l, continuation);
                ztwVar.m = ((enj) obj).a;
                return ztwVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ztw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ztw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ztw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ztw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                long j = ((enj) obj).a;
                ztw ztwVar = new ztw(this.l, (Continuation) obj2);
                ztwVar.m = j;
                return ztwVar.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = this.l.e;
                    Float f = new Float(enj.e(this.m));
                    this.k = 1;
                    if (fk0Var.f(f, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var2 = this.l.f;
                    Float f2 = new Float(enj.f(this.m));
                    this.k = 1;
                    if (fk0Var2.f(f2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    fuw fuwVar = this.l;
                    fk0 fk0Var3 = fuwVar.e;
                    Float f3 = new Float(yzt.b(this.m));
                    uf7 uf7Var = fuwVar.c;
                    this.k = 1;
                    Object e = fk0Var3.e();
                    oct octVar = fk0Var3.a;
                    if (nqi.a(fk0Var3.h, new bk0(fk0Var3, f3, new tf7(uf7Var, octVar, e, (cn0) octVar.a.invoke(f3)), fk0Var3.c.d, null, null), this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    fuw fuwVar2 = this.l;
                    fk0 fk0Var4 = fuwVar2.f;
                    Float f4 = new Float(yzt.c(this.m));
                    uf7 uf7Var2 = fuwVar2.c;
                    this.k = 1;
                    Object e2 = fk0Var4.e();
                    oct octVar2 = fk0Var4.a;
                    if (nqi.a(fk0Var4.h, new bk0(fk0Var4, f4, new tf7(uf7Var2, octVar2, e2, (cn0) octVar2.a.invoke(f4)), fk0Var4.c.d, null, null), this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                long j = this.m;
                Object obj2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.m = j;
                    this.k = 1;
                    b9r Q = weo.Q(0.0f, 0.0f, null, 7);
                    fuw fuwVar3 = this.l;
                    Object Q2 = gld.Q(new cuw(fuwVar3.c() == 1.0f ? 2.5f : 1.0f, fuwVar3, j, Q, null), this);
                    if (Q2 != obj2) {
                        Q2 = Unit.a;
                    }
                    if (Q2 == obj2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztw(fuw fuwVar, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.l = fuwVar;
    }
}
