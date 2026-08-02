package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zu8 extends aur implements Function2 {
    public final /* synthetic */ av8 j;
    public final /* synthetic */ yu8 k;
    public final /* synthetic */ kv8 l;
    public final /* synthetic */ View m;
    public final /* synthetic */ db8 n;
    public final /* synthetic */ e23 o;
    public final /* synthetic */ gc8 p;
    public final /* synthetic */ xzb q;
    public final /* synthetic */ pm9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu8(Continuation continuation, av8 av8Var, yu8 yu8Var, kv8 kv8Var, View view, db8 db8Var, e23 e23Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        super(2, continuation);
        this.j = av8Var;
        this.k = yu8Var;
        this.l = kv8Var;
        this.m = view;
        this.n = db8Var;
        this.o = e23Var;
        this.p = gc8Var;
        this.q = xzbVar;
        this.r = pm9Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zu8(continuation, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zu8) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        av8 av8Var = this.j;
        dv8 dv8Var = av8Var.c;
        yu8 yu8Var = this.k;
        if (dv8Var.b(yu8Var.j)) {
            db8 db8Var = this.n;
            yu8 yu8Var2 = db8Var != null ? db8Var.c : null;
            gc8 gc8Var = this.p;
            xzb xzbVar = this.q;
            pm9 pm9Var = this.r;
            av8.G(av8Var, this.l, this.m, yu8Var2, yu8Var, this.o, new vh0(av8Var, yu8Var, gc8Var, xzbVar, pm9Var, 3), new ii(av8Var, yu8Var, gc8Var, xzbVar, pm9Var, 9));
        }
        return Unit.a;
    }
}
