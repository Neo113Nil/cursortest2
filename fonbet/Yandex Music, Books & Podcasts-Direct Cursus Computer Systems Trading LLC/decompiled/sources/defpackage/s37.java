package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s37 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t37 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s37(t37 t37Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = t37Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s37(this.l, continuation, 0);
            default:
                return new s37(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((s37) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                t37 t37Var = this.l;
                bf bfVar = t37Var.p;
                if (bfVar == null) {
                    Intrinsics.j("actionFlowObservable");
                    throw null;
                }
                x0q x0qVar = bfVar.a;
                i64 i64Var = new i64(28, t37Var);
                this.k = 1;
                x0qVar.collect(i64Var, this);
                return nm6Var;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    t37 t37Var2 = this.l;
                    dzf viewLifecycleOwner = t37Var2.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    lyf lyfVar = lyf.d;
                    s37 s37Var = new s37(t37Var2, null, 0);
                    this.k = 1;
                    if (o8g.K(viewLifecycleOwner, lyfVar, s37Var, this) == nm6Var2) {
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
        }
    }
}
