package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h27 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i27 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h27(i27 i27Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = i27Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h27(this.l, continuation, 0);
            default:
                return new h27(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    i27 i27Var = this.l;
                    h7a H0 = zsd.H0(((upb) i27Var.p.getValue()).o, 1);
                    i64 i64Var = new i64(26, i27Var);
                    this.k = 1;
                    if (H0.collect(i64Var, this) == nm6Var) {
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
                    lyf lyfVar = lyf.c;
                    i27 i27Var2 = this.l;
                    h27 h27Var = new h27(i27Var2, null, 0);
                    this.k = 1;
                    if (o8g.K(i27Var2, lyfVar, h27Var, this) == nm6Var2) {
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
