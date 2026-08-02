package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c6s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ pyc l;
    public final /* synthetic */ pqm m;
    public final /* synthetic */ lfm n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6s(pyc pycVar, pqm pqmVar, lfm lfmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pycVar;
        this.m = pqmVar;
        this.n = lfmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c6s(this.l, this.m, this.n, continuation, 0);
            default:
                return new c6s(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c6s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    enj enjVar = new enj(this.n.c);
                    this.k = 1;
                    if (this.l.invoke(this.m, enjVar, this) == nm6Var) {
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
                    enj enjVar2 = new enj(this.n.c);
                    this.k = 1;
                    if (this.l.invoke(this.m, enjVar2, this) == nm6Var2) {
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
