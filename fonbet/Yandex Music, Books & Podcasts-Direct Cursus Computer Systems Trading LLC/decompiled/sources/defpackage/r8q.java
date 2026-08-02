package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r8q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ s8q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8q(s8q s8qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = s8qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r8q(this.k, continuation, 0);
            default:
                return new r8q(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r8q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        s8q s8qVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                s8qVar.o.V();
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                s8qVar.o.V();
                break;
        }
        return Unit.a;
    }
}
