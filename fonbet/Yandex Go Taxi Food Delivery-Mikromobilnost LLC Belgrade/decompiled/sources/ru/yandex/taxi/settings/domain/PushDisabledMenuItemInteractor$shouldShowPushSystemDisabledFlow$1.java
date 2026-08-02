package ru.yandex.taxi.settings.domain;

import defpackage.bms;
import defpackage.iae0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1g0;
import defpackage.p3g0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp3g0;", "settingsExperiment", "Liae0;", "popupExperiment", "", "notificationsEnabled", "<anonymous>", "(Lp3g0;Liae0;Z)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1", f = "PushDisabledMenuItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1 pushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1 = new PushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1(this.this$0, (Continuation) obj4);
        pushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1.L$0 = (p3g0) obj;
        pushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1.L$1 = (iae0) obj2;
        pushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1.Z$0 = booleanValue;
        return pushDisabledMenuItemInteractor$shouldShowPushSystemDisabledFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        p3g0 p3g0Var = (p3g0) this.L$0;
        iae0 iae0Var = (iae0) this.L$1;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (p3g0Var.getB()) {
            this.this$0.getClass();
            o1g0 o1g0Var = iae0Var.e;
            if (o1g0Var.b.a && iae0Var.c(o1g0Var.c) && iae0Var.c(o1g0Var.d) && !z2) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
