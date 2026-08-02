package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class qli extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ rli k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qli(rli rliVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = rliVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qli(this.k, continuation, 0);
            case 1:
                return new qli(this.k, continuation, 1);
            default:
                return new qli(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qli) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        rli rliVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((vli) rliVar.l.b).m.d();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((vli) rliVar.l.b).m.d();
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((vli) rliVar.l.b).m.d();
                break;
        }
        return Unit.a;
    }
}
