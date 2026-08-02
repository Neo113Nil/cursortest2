package ru.yandex.taxi.cashback.model;

import defpackage.g92;
import defpackage.h3b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x5d0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.cashback.i;
import ru.yandex.taxi.cashback.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.model.PlusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1", f = "PlusMenuItemInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class PlusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x5d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1(Continuation continuation, x5d0 x5d0Var) {
        super(3, continuation);
        this.this$0 = x5d0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1 plusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1 = new PlusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        plusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        plusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return plusMenuItemInteractorImpl$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h3b0 h3b0Var = (h3b0) obj2;
            x5d0 x5d0Var = this.this$0;
            l lVar = x5d0Var.a;
            g X = e.X(e.t(e.n(new i(lVar.b.a()), lVar.a.a(), new g92(2, Boolean.valueOf(x5d0Var.b.a(true))), new PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1(h3b0Var, null))), new PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1(h3b0Var, this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(X, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
