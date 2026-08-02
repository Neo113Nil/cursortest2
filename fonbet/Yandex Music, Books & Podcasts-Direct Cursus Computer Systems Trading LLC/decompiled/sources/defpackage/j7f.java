package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j7f extends h7o implements pyc {
    public int k;
    public /* synthetic */ kh7 l;
    public final /* synthetic */ e0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7f(e0 e0Var, Continuation continuation) {
        super(3, continuation);
        this.m = e0Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j7f j7fVar = new j7f(this.m, (Continuation) obj3);
        j7fVar.l = (kh7) obj;
        return j7fVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        e0 e0Var = this.m;
        y6 y6Var = (y6) e0Var.d;
        kh7 kh7Var = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            byte x = y6Var.x();
            if (x == 1) {
                return e0Var.j(true);
            }
            if (x == 0) {
                return e0Var.j(false);
            }
            if (x != 6) {
                if (x == 8) {
                    return e0Var.i();
                }
                y6.q(y6Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.l = null;
            this.k = 1;
            obj = e0.d(e0Var, kh7Var, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return (w4f) obj;
    }
}
