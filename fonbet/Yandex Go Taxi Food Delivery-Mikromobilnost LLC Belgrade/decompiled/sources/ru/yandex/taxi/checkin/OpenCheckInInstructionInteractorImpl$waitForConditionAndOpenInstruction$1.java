package ru.yandex.taxi.checkin;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.jqr;
import defpackage.k470;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.checkin.OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1", f = "OpenCheckInInstructionInteractorImpl.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1(Continuation continuation, i iVar) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            jqr jqrVar = new jqr(new h(new f(kotlinx.coroutines.flow.e.C(kotlinx.coroutines.flow.e.X(((e0) iVar.a).n(), new OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$flatMapLatest$1(3, null)), new OpenCheckInInstructionInteractorImpl$openInstructionFlow$$inlined$flatMapMerge$1(null, iVar)))), new OpenCheckInInstructionInteractorImpl$openInstructionFlow$5(2, iVar, i.class, "showInstructionIfNeeded", "showInstructionIfNeeded(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V", 4), 3);
            iVar.d.getClass();
            sjh sjhVar = uyj.a;
            o oVar = new o(kotlinx.coroutines.flow.e.F(jqrVar, o400.a), new OpenCheckInInstructionInteractorImpl$waitForConditionAndOpenInstruction$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            k470 k470Var = new k470();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(k470Var, this) == coroutineSingletons) {
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
