package ru.yandex.taxi.masstransit.router;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.tk40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtViewOnMapRouter$onLaunch$2", f = "MtViewOnMapRouter.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtViewOnMapRouter$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ tk40 $stateRepository;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtViewOnMapRouter$onLaunch$2(tk40 tk40Var, l lVar, Continuation continuation) {
        super(2, continuation);
        this.$stateRepository = tk40Var;
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtViewOnMapRouter$onLaunch$2(this.$stateRepository, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtViewOnMapRouter$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 d = kotlinx.coroutines.flow.e.d(this.$stateRepository.a);
            l lVar = this.this$0;
            o oVar = new o(d, new MtViewOnMapRouter$onLaunch$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            pi00 pi00Var = new pi00(28, lVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(pi00Var, this) == coroutineSingletons) {
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
