package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n27 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ o27 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n27(o27 o27Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = o27Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new n27(this.l, continuation, 0);
            case 1:
                return new n27(this.l, continuation, 1);
            default:
                return new n27(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((n27) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                o27 o27Var = this.l;
                bf bfVar = o27Var.l;
                if (bfVar == null) {
                    Intrinsics.j("actionFlowReceiver");
                    throw null;
                }
                x0q x0qVar = bfVar.a;
                m27 m27Var = new m27(o27Var, 0);
                this.k = 1;
                x0qVar.collect(m27Var, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    o27 o27Var2 = this.l;
                    h7a H0 = zsd.H0(((fyf) o27Var2.n.getValue()).o, 1);
                    m27 m27Var2 = new m27(o27Var2, 1);
                    this.k = 1;
                    if (H0.collect(m27Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.c;
                    o27 o27Var3 = this.l;
                    n27 n27Var = new n27(o27Var3, null, 1);
                    this.k = 1;
                    if (o8g.K(o27Var3, lyfVar, n27Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
