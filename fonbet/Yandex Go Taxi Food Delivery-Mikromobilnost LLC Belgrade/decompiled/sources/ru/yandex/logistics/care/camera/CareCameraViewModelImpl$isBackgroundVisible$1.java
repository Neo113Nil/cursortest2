package ru.yandex.logistics.care.camera;

import defpackage.ms8;
import defpackage.mvg;
import defpackage.mzd;
import defpackage.ny61;
import defpackage.rs8;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.care.camera.data.BackgroundVisibility;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrs8;", ClidProvider.STATE, "", "timerValue", "Lru/yandex/logistics/care/camera/data/BackgroundVisibility;", "<anonymous>", "(Lrs8;I)Lru/yandex/logistics/care/camera/data/BackgroundVisibility;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.CareCameraViewModelImpl$isBackgroundVisible$1", f = "CareCameraViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareCameraViewModelImpl$isBackgroundVisible$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        CareCameraViewModelImpl$isBackgroundVisible$1 careCameraViewModelImpl$isBackgroundVisible$1 = new CareCameraViewModelImpl$isBackgroundVisible$1(3, (Continuation) obj3);
        careCameraViewModelImpl$isBackgroundVisible$1.L$0 = (rs8) obj;
        careCameraViewModelImpl$isBackgroundVisible$1.I$0 = intValue;
        return careCameraViewModelImpl$isBackgroundVisible$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rs8 rs8Var = (rs8) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((rs8Var instanceof ms8) && (((ms8) rs8Var).a.c instanceof mzd)) ? i <= 0 ? BackgroundVisibility.Visible : BackgroundVisibility.Hidden : BackgroundVisibility.None;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
