package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class uoa extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ joa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uoa(joa joaVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = joaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new uoa(this.k, continuation, 0);
            case 1:
                return new uoa(this.k, continuation, 1);
            case 2:
                return new uoa(this.k, continuation, 2);
            default:
                return new uoa(this.k, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((uoa) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                break;
        }
        return Unit.a;
    }
}
