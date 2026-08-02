package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pbs extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ qbs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbs(qbs qbsVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = qbsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pbs(this.k, continuation, 0);
            case 1:
                return new pbs(this.k, continuation, 1);
            default:
                return new pbs(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((pbs) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        qbs qbsVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                qbsVar.b(true);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                qbsVar.d();
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                qbsVar.m();
                break;
        }
        return Unit.a;
    }
}
