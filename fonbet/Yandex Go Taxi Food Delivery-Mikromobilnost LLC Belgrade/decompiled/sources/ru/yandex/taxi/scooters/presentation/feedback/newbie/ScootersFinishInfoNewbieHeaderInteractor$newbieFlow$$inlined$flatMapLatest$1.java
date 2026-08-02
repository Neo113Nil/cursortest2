package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.y1o0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ int $newbieFlowProgressStep$inlined;
    final /* synthetic */ y1o0 $newbieProgressInfo$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1(Continuation continuation, a aVar, y1o0 y1o0Var, int i) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$newbieProgressInfo$inlined = y1o0Var;
        this.$newbieFlowProgressStep$inlined = i;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1 scootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1 = new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$newbieProgressInfo$inlined, this.$newbieFlowProgressStep$inlined);
        scootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersFinishInfoNewbieHeaderInteractor$newbieFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            n1o0.c cVar = this.$newbieProgressInfo$inlined.b;
            int i2 = this.$newbieFlowProgressStep$inlined;
            aVar.getClass();
            m0 m0Var = new m0(new rol0(new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1(i2, aVar, cVar, null)), new rol0(new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1(this.this$0, this.$newbieProgressInfo$inlined, null)), new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2(3, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(m0Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
