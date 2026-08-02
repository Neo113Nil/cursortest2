package ru.yandex.taxi.scooters.domain;

import defpackage.e4b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.EvolveState;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersActiveOrderInteractor$evolveToNextState$2$2", f = "ScootersActiveOrderInteractor.kt", l = {242}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersActiveOrderInteractor$evolveToNextState$2$2 extends SuspendLambda implements tls {
    final /* synthetic */ zuo0 $scootersSessionState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActiveOrderInteractor$evolveToNextState$2$2(b bVar, zuo0 zuo0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersActiveOrderInteractor$evolveToNextState$2$2(this.this$0, this.$scootersSessionState, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersActiveOrderInteractor$evolveToNextState$2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String sessionId = this.$scootersSessionState.getSessionId();
            EvolveState c = e4b1.c(this.$scootersSessionState);
            this.this$0.getClass();
            this.label = 1;
            if (b.j(bVar, sessionId, c, null, this, 12) == coroutineSingletons) {
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
