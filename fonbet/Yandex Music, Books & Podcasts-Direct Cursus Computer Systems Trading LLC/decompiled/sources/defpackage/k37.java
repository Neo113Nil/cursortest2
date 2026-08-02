package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k37 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ l37 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k37(l37 l37Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = l37Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k37(this.l, continuation, 0);
            default:
                return new k37(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((k37) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        x0q x0qVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    l37 l37Var = this.l;
                    i37 i37Var = l37Var.g;
                    if (i37Var == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    m37 D = i37Var.D();
                    m37 m37Var = D != null ? D : null;
                    if (m37Var != null && (x0qVar = m37Var.l) != null) {
                        i64 i64Var = new i64(27, l37Var);
                        this.k = 1;
                        x0q.m(x0qVar, i64Var, this);
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
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.c;
                    l37 l37Var2 = this.l;
                    k37 k37Var = new k37(l37Var2, null, 0);
                    this.k = 1;
                    if (o8g.K(l37Var2, lyfVar, k37Var, this) == nm6Var2) {
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
