package ru.yandex.taxi.summary.personalaction.notification;

import defpackage.l3b0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ ru.yandex.taxi.personalstate.domain.interactor.b a;
    public final /* synthetic */ l3b0 b;

    public d(ru.yandex.taxi.personalstate.domain.interactor.b bVar, l3b0 l3b0Var) {
        this.a = bVar;
        this.b = l3b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1 personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1) {
            personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1 = (PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1) continuation;
            int i2 = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.L$0 = null;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.L$1 = null;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.L$2 = null;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1 = new PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
