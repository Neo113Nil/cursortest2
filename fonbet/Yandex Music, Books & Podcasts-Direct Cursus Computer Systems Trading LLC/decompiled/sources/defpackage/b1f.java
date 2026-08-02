package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b1f extends aur implements Function1 {
    public int j;
    public final /* synthetic */ c1f k;
    public final /* synthetic */ hmm.a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1f(c1f c1fVar, hmm.a aVar, Continuation continuation) {
        super(1, continuation);
        this.k = c1fVar;
        this.l = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new b1f(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b1f) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            hmm.a[] aVarArr = {this.l};
            this.j = 1;
            if (this.k.a(aVarArr, this) == nm6Var) {
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
