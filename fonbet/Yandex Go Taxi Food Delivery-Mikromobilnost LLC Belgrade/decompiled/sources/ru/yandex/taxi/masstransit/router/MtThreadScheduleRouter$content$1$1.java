package ru.yandex.taxi.masstransit.router;

import defpackage.agd;
import defpackage.b640;
import defpackage.mvg;
import defpackage.mz30;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w540;
import defpackage.wls;
import defpackage.x540;
import defpackage.y540;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtThreadScheduleRouter$content$1$1", f = "MtThreadScheduleRouter.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadScheduleRouter$content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ x540 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadScheduleRouter$content$1$1(x540 x540Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = x540Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtThreadScheduleRouter$content$1$1(this.this$0, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtThreadScheduleRouter$content$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x540 x540Var = this.this$0;
            ru.yandex.taxi.masstransit.threadschedule.e eVar = x540Var.I;
            Object obj2 = ((agd) this.$this_buildContent).a;
            y540 y540Var = ((w540) obj2).a;
            b640 b640Var = x540Var.P;
            mz30 mz30Var = ((w540) obj2).c;
            this.label = 1;
            if (eVar.b(y540Var, b640Var, mz30Var, this) == coroutineSingletons) {
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
