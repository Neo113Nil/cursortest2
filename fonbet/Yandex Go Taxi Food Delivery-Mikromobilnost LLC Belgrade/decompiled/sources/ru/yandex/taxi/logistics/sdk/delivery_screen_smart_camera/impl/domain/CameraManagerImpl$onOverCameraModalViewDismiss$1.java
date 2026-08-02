package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.kt7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxs0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.CameraManagerImpl$onOverCameraModalViewDismiss$1", f = "CameraManagerImpl.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CameraManagerImpl$onOverCameraModalViewDismiss$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraManagerImpl$onOverCameraModalViewDismiss$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraManagerImpl$onOverCameraModalViewDismiss$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraManagerImpl$onOverCameraModalViewDismiss$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        this.label = 1;
        kt7 kt7Var = cVar.f;
        if (kt7Var != null) {
            kt7Var.c(qxs0.a);
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
