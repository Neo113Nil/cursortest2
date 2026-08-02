package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c8n extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ sfm l;
    public final /* synthetic */ g8n m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8n(sfm sfmVar, g8n g8nVar, Continuation continuation) {
        super(2, continuation);
        this.l = sfmVar;
        this.m = g8nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c8n(this.m, this.l, continuation);
            default:
                return new c8n(this.l, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((c8n) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((c8n) create(mm6Var, continuation)).invokeSuspend(Unit.a);
        }
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
                x0q x0qVar = this.m.l;
                gfl gflVar = new gfl(23, this.l);
                this.k = 1;
                x0qVar.collect(gflVar, this);
                return nm6Var;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    h0m h0mVar = (h0m) this.l.c;
                    d8n d8nVar = new d8n(this.m, 0);
                    this.k = 1;
                    if (h0mVar.collect(d8nVar, this) == nm6Var2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8n(g8n g8nVar, sfm sfmVar, Continuation continuation) {
        super(2, continuation);
        this.m = g8nVar;
        this.l = sfmVar;
    }
}
