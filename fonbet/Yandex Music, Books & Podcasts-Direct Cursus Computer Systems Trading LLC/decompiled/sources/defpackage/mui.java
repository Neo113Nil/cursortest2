package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class mui extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ mqs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mui(mqs mqsVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = mqsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mui(this.k, continuation, 0);
            default:
                return new mui(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((mui) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        mqs mqsVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return u75.d(mqsVar);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return t75.c(mqsVar);
        }
    }
}
