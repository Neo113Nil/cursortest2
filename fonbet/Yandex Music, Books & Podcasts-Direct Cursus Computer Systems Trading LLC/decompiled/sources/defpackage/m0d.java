package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m0d extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ q0d k;
    public final /* synthetic */ fp7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0d(q0d q0dVar, fp7 fp7Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = q0dVar;
        this.l = fp7Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m0d(this.k, this.l, continuation, 0);
            default:
                return new m0d(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m0d) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        fp7 fp7Var = this.l;
        q0d q0dVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                q0dVar.b(fp7Var.j());
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                q0dVar.d(fp7Var.q());
                break;
        }
        return Unit.a;
    }
}
