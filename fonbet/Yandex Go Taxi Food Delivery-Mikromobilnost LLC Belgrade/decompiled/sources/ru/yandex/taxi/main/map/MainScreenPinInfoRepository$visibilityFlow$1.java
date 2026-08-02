package ru.yandex.taxi.main.map;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rtb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "pinVisibility", "Lrtb0;", "pinAbsenceExperiment", "addressAdjustmentShown", "<anonymous>", "(ZLrtb0;Z)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main.map.MainScreenPinInfoRepository$visibilityFlow$1", f = "MainScreenPinInfoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MainScreenPinInfoRepository$visibilityFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        MainScreenPinInfoRepository$visibilityFlow$1 mainScreenPinInfoRepository$visibilityFlow$1 = new MainScreenPinInfoRepository$visibilityFlow$1(4, (Continuation) obj4);
        mainScreenPinInfoRepository$visibilityFlow$1.Z$0 = booleanValue;
        mainScreenPinInfoRepository$visibilityFlow$1.L$0 = (rtb0) obj2;
        mainScreenPinInfoRepository$visibilityFlow$1.Z$1 = booleanValue2;
        return mainScreenPinInfoRepository$visibilityFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        rtb0 rtb0Var = (rtb0) this.L$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((!rtb0Var.getB() || z2) && z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
