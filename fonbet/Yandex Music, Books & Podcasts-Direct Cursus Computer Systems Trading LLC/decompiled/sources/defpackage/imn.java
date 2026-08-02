package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class imn extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ umn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imn(Function1 function1, umn umnVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = function1;
        this.l = umnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new imn(this.k, this.l, continuation, 0);
            default:
                return new imn(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((imn) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        umn umnVar = this.l;
        Function1 function1 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                function1.invoke(umnVar);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                function1.invoke(umnVar);
                break;
        }
        return Unit.a;
    }
}
