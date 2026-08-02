package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g2k extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Function0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2k(Function0 function0, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g2k(this.k, continuation, 0);
            default:
                return new g2k(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((g2k) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function0 function0 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return function0.invoke();
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                function0.invoke();
                return Unit.a;
        }
    }
}
