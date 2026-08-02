package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k6i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j7i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6i(j7i j7iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j7iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k6i(this.l, continuation, 0);
            case 1:
                return new k6i(this.l, continuation, 1);
            case 2:
                return new k6i(this.l, continuation, 2);
            default:
                return new k6i(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                return ((k6i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 1:
                return ((k6i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 2:
                ((k6i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((k6i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                    x0q x0qVar = this.l.I;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar.emit(unit, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    j7i j7iVar = this.l;
                    pjc Y = zsd.Y(j7iVar.H, j7iVar.v);
                    m6i m6iVar = new m6i(j7iVar, null, 1);
                    this.k = 1;
                    if (zsd.O(Y, m6iVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j7i j7iVar2 = this.l;
                x0q x0qVar2 = j7iVar2.w;
                otd otdVar = new otd(28, j7iVar2);
                this.k = 1;
                x0qVar2.getClass();
                x0q.m(x0qVar2, otdVar, this);
                return nm6Var3;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    j7i j7iVar3 = this.l;
                    af5 af5Var = j7iVar3.x;
                    if (af5Var != null) {
                        x0q x0qVar3 = j7iVar3.w;
                        this.k = 1;
                        if (x0qVar3.emit(af5Var, this) == nm6Var4) {
                            return nm6Var4;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
