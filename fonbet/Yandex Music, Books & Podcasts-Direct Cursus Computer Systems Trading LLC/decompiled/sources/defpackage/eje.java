package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class eje extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ hje l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eje(hje hjeVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = hjeVar;
        this.m = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new eje(this.l, this.m, continuation, 0);
            default:
                return new eje(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((eje) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    hje hjeVar = this.l;
                    fk0 fk0Var = (fk0) hjeVar.g.get(this.m);
                    d85 d85Var = new d85(hjeVar.b.e);
                    this.k = 1;
                    if (fk0.c(fk0Var, d85Var, null, null, this, 14) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    hje hjeVar2 = this.l;
                    fk0 fk0Var2 = (fk0) hjeVar2.g.get(this.m);
                    d85 d85Var2 = new d85(hjeVar2.b.f);
                    this.k = 1;
                    if (fk0.c(fk0Var2, d85Var2, null, null, this, 14) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
