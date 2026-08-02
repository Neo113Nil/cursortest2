package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class lgd extends aur implements Function1 {
    public ygd j;
    public int k;
    public final /* synthetic */ ygd l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgd(ygd ygdVar, boolean z, double d, Continuation continuation) {
        super(1, continuation);
        this.l = ygdVar;
        this.m = z;
        this.n = d;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new lgd(this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lgd) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ygd ygdVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            double d = this.n;
            ygd ygdVar2 = this.l;
            kgd kgdVar = new kgd(ygdVar2, this.m, d, null);
            bsd b = dm6.b();
            this.j = ygdVar2;
            this.k = 1;
            obj = x97.V(b, kgdVar, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            ygdVar = ygdVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ygdVar = this.j;
            qgg.h0(obj);
        }
        return new mgd(ygdVar, (Double) obj);
    }
}
