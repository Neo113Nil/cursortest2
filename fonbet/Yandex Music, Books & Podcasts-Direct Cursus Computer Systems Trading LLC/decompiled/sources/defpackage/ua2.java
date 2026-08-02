package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ua2 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ za2 l;
    public final /* synthetic */ drf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua2(za2 za2Var, drf drfVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = za2Var;
        this.m = drfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ua2(this.l, this.m, continuation, 0);
            case 1:
                return new ua2(this.l, this.m, continuation, 1);
            default:
                return new ua2(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ua2) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    bb2 bb2Var = this.l.c;
                    uvn w = q5g.w(this.m);
                    if (w != null) {
                        this.k = 1;
                        Object a = ((j14) bb2Var.a.c.getValue()).a(w, true, this);
                        return a == nm6Var ? nm6Var : a;
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    bb2 bb2Var2 = this.l.c;
                    uvn w2 = q5g.w(this.m);
                    if (w2 != null) {
                        this.k = 1;
                        Object a2 = ((p4j) bb2Var2.a.a.getValue()).a(w2, true, this);
                        return a2 == nm6Var2 ? nm6Var2 : a2;
                    }
                } else {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    bb2 bb2Var3 = this.l.c;
                    uvn w3 = q5g.w(this.m);
                    if (w3 != null) {
                        this.k = 1;
                        Object a3 = ((i2b) bb2Var3.a.e.getValue()).a(w3, true, this);
                        return a3 == nm6Var3 ? nm6Var3 : a3;
                    }
                } else {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
