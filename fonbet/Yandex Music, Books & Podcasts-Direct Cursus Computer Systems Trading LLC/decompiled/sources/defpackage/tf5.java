package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class tf5 extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ d64 n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf5(long j, long j2, d64 d64Var, float f, Continuation continuation) {
        super(2, continuation);
        this.l = j;
        this.m = j2;
        this.n = d64Var;
        this.o = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        tf5 tf5Var = new tf5(this.l, this.m, this.n, this.o, continuation);
        tf5Var.k = obj;
        return tf5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tf5) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ltm ltmVar = (ltm) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (nsa.c(this.l, this.m) >= 0) {
                xq0.x("base duration must be greater than interpolated duration");
                return null;
            }
            sf5 sf5Var = new sf5(ltmVar, this.m, this.l, this.o, null);
            this.k = null;
            this.j = 1;
            if (zsd.O(this.n, sf5Var, this) == nm6Var) {
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
    }
}
