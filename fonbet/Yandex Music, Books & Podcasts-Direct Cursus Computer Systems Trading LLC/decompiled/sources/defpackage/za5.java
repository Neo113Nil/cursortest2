package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class za5 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za5(Function2 function2, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = function2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                za5 za5Var = new za5(this.m, continuation, 0);
                za5Var.k = obj;
                za5Var.l = obj2;
                return za5Var.invokeSuspend(Unit.a);
            default:
                za5 za5Var2 = new za5(this.m, continuation, 1);
                za5Var2.k = obj;
                za5Var2.l = obj2;
                return za5Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function2 function2 = this.m;
        switch (i) {
            case 0:
                Object obj2 = this.k;
                Object obj3 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return function2.invoke(obj2, obj3);
            default:
                Object obj4 = this.k;
                Object obj5 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return function2.invoke(obj4, obj5);
        }
    }
}
