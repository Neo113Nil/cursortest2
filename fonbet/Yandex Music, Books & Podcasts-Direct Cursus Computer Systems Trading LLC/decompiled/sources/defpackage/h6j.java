package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h6j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i6j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6j(i6j i6jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = i6jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h6j(this.l, continuation, 0);
            default:
                return new h6j(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((h6j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((h6j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                i6j i6jVar = this.l;
                xdr xdrVar = i6jVar.x().i;
                g6j g6jVar = new g6j(i6jVar, 0);
                this.k = 1;
                xdrVar.collect(g6jVar, this);
                return nm6Var;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                i6j i6jVar2 = this.l;
                x0q x0qVar = i6jVar2.x().j;
                g6j g6jVar2 = new g6j(i6jVar2, 1);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, g6jVar2, this);
                return nm6Var2;
        }
    }
}
