package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a57 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e57 l;
    public final /* synthetic */ t9i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a57(e57 e57Var, t9i t9iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e57Var;
        this.m = t9iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a57(this.l, this.m, continuation, 0);
            default:
                return new a57(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a57) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    e57 e57Var = this.l;
                    if (e57Var.x != null) {
                        zi3 zi3Var = e57Var.H;
                        xa4 xa4Var = (xa4) this.m;
                        aie aieVar = new aie(xa4Var.b, xa4Var.c, xa4Var.d);
                        this.k = 1;
                        if (zi3Var.m(aieVar, this) == nm6Var) {
                        }
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
                    zi3 zi3Var2 = this.l.H;
                    fb4 fb4Var = (fb4) this.m;
                    eie eieVar = new eie(fb4Var.b, fb4Var.c);
                    this.k = 1;
                    if (zi3Var2.m(eieVar, this) == nm6Var2) {
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
