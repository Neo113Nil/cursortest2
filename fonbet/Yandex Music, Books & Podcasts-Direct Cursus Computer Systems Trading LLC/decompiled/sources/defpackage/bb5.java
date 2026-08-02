package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class bb5 extends aur implements uyc {
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ n31 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb5(n31 n31Var, Continuation continuation) {
        super(6, continuation);
        this.o = n31Var;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        bb5 bb5Var = new bb5(this.o, (Continuation) obj6);
        bb5Var.j = obj;
        bb5Var.k = obj2;
        bb5Var.l = obj3;
        bb5Var.m = obj4;
        bb5Var.n = obj5;
        return bb5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.j;
        Object obj3 = this.k;
        Object obj4 = this.l;
        Object obj5 = this.m;
        Object obj6 = this.n;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return this.o.invoke(obj2, obj3, obj4, obj5, obj6);
    }
}
