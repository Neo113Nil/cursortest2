package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y1k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ z1k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1k(z1k z1kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = z1kVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new y1k(this.k, continuation, 0);
            default:
                return new y1k(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((y1k) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        z1k z1kVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                z1kVar.h.c(new Integer(0));
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                z1kVar.g.c(new Integer(0));
                break;
        }
        return Unit.a;
    }
}
