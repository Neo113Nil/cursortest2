package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ad0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ v8n k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad0(v8n v8nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = v8nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ad0(this.k, continuation, 0);
            case 1:
                return new ad0(this.k, continuation, 1);
            default:
                return new ad0(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ad0) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        v8n v8nVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
        }
        return v8nVar;
    }
}
