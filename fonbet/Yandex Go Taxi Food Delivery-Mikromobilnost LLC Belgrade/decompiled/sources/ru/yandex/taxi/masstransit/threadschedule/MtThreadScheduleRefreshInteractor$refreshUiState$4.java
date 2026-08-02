package ru.yandex.taxi.masstransit.threadschedule;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.y540;
import defpackage.z540;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lz540;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadschedule.MtThreadScheduleRefreshInteractor$refreshUiState$4", f = "MtThreadScheduleRefreshInteractor.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadScheduleRefreshInteractor$refreshUiState$4 extends SuspendLambda implements zls {
    final /* synthetic */ y540 $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadScheduleRefreshInteractor$refreshUiState$4(e eVar, y540 y540Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$state = y540Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtThreadScheduleRefreshInteractor$refreshUiState$4 mtThreadScheduleRefreshInteractor$refreshUiState$4 = new MtThreadScheduleRefreshInteractor$refreshUiState$4(this.this$0, this.$state, (Continuation) obj3);
        mtThreadScheduleRefreshInteractor$refreshUiState$4.L$0 = (vpr) obj;
        return mtThreadScheduleRefreshInteractor$refreshUiState$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            z540 e = this.this$0.c.e(this.$state);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(e, this) == coroutineSingletons) {
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
