package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class hlg extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ klg l;
    public final /* synthetic */ cvl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hlg(klg klgVar, cvl cvlVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = klgVar;
        this.m = cvlVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hlg(this.l, this.m, continuation, 0);
            default:
                return new hlg(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((hlg) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object c = this.l.c(this.m, this);
                    return c == nm6Var ? nm6Var : c;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
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
                this.k = 1;
                mn7 mn7Var = dm6.a;
                klg klgVar = this.l;
                Object V = x97.V(mn7Var, new n71((Continuation) null, klgVar, this.m, klgVar, 20), this);
                return V == nm6Var2 ? nm6Var2 : V;
        }
    }
}
