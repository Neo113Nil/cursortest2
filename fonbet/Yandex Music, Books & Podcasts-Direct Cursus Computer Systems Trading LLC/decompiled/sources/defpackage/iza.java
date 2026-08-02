package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class iza extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ mza l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iza(mza mzaVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = mzaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new iza(this.l, continuation, 0);
            case 1:
                return new iza(this.l, continuation, 1);
            default:
                return new iza(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((iza) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vx6 vx6Var = this.l.b;
                this.k = 1;
                Object c = ((yza) vx6Var.d).c(this);
                return c == nm6Var ? nm6Var : c;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yza yzaVar = this.l.c;
                this.k = 1;
                Object d = yzaVar.d(this);
                return d == nm6Var2 ? nm6Var2 : d;
            default:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    yza yzaVar2 = this.l.c;
                    this.k = 1;
                    Object a = lmm.a(yzaVar2.b(), new uza(2, null), this);
                    if (a != obj2) {
                        a = Unit.a;
                    }
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
