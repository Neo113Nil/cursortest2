package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1", f = "SmartCameraLoadingScreen.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $alpha;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1(androidx.compose.animation.core.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$alpha = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1(this.$alpha, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SmartCameraLoadingScreenKt$SmartCameraLoadingScreen$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            androidx.compose.animation.core.a aVar = this.$alpha;
            Float f = new Float(1.0f);
            ck11 K = sb2.K(300, 0, null, 6);
            this.label = 1;
            if (androidx.compose.animation.core.a.d(aVar, f, K, null, null, this, 12) == coroutineSingletons) {
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
