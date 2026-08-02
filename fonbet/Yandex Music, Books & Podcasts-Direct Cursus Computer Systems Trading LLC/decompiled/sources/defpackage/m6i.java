package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m6i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j7i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6i(j7i j7iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = j7iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                m6i m6iVar = new m6i(this.m, continuation, 0);
                m6iVar.l = obj;
                return m6iVar;
            case 1:
                m6i m6iVar2 = new m6i(this.m, continuation, 1);
                m6iVar2.l = obj;
                return m6iVar2;
            case 2:
                m6i m6iVar3 = new m6i(this.m, continuation, 2);
                m6iVar3.l = obj;
                return m6iVar3;
            default:
                m6i m6iVar4 = new m6i(this.m, continuation, 3);
                m6iVar4.l = obj;
                return m6iVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((m6i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 1:
                return ((m6i) create((s6i) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((m6i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((m6i) create((i4p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        List c;
        switch (this.j) {
            case 0:
                mm6 mm6Var = (mm6) this.l;
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
                j7i j7iVar = this.m;
                x0q x0qVar = j7iVar.w;
                lrf lrfVar = new lrf(9, j7iVar, mm6Var);
                this.l = null;
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, lrfVar, this);
                return nm6Var;
            case 1:
                s6i s6iVar = (s6i) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (j7i.J(this.m, s6iVar, this) == nm6Var2) {
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
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j7i j7iVar2 = this.m;
                    int i4 = 0;
                    Continuation continuation = null;
                    ub7 ub7Var = new ub7(12, jf0.z(new ub7(12, new r6i(j7iVar2.w, j7iVar2, i4), new n6i(j7iVar2, continuation, i4)), new k32(4, new lhd(29, j7iVar2))), new n6i(j7iVar2, continuation, 1));
                    n71 n71Var = new n71(j7iVar2, mm6Var2, continuation, 22);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(ub7Var, n71Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                i4p i4pVar = (i4p) this.l;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    mmo mmoVar = this.m.u;
                    this.l = null;
                    this.k = 1;
                    obj = mmoVar.W0(i4pVar, this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                y7p y7pVar = (y7p) obj;
                return (y7pVar == null || (c = t75.c(y7pVar)) == null) ? c5b.a : c;
        }
    }
}
