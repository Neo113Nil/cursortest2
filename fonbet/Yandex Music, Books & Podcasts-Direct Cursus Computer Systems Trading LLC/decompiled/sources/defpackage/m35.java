package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m35 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ xiu l;
    public final /* synthetic */ drf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m35(xiu xiuVar, drf drfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = xiuVar;
        this.m = drfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m35(this.l, this.m, continuation, 0);
            case 1:
                return new m35(this.l, this.m, continuation, 1);
            default:
                return new m35(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m35) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                xh1 xh1Var = (xh1) this.l.c;
                nrf a = this.m.a();
                this.k = 1;
                Object c = xh1Var.c(a, this);
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
                xh1 xh1Var2 = (xh1) this.l.c;
                nrf a2 = this.m.a();
                this.k = 1;
                Object b = xh1Var2.b(a2, this);
                return b == nm6Var2 ? nm6Var2 : b;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xh1 xh1Var3 = (xh1) this.l.c;
                nrf a3 = this.m.a();
                this.k = 1;
                Object a4 = xh1Var3.a(a3, this);
                return a4 == nm6Var3 ? nm6Var3 : a4;
        }
    }
}
