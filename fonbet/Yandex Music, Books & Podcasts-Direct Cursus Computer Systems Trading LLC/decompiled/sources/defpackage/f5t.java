package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class f5t extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ g5t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5t(g5t g5tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = g5tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f5t(this.k, continuation, 0);
            default:
                return new f5t(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((f5t) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        g5t g5tVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                g5tVar.m.d();
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                g5tVar.m.d();
                break;
        }
        return Unit.a;
    }
}
