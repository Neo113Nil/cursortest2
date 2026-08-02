package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tis0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y670;
import defpackage.z670;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.ArBoxesCameraStrategy$handleInnerCameraAction$1", f = "ArBoxesCameraStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ArBoxesCameraStrategy$handleInnerCameraAction$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArBoxesCameraStrategy$handleInnerCameraAction$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ArBoxesCameraStrategy$handleInnerCameraAction$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ArBoxesCameraStrategy$handleInnerCameraAction$1 arBoxesCameraStrategy$handleInnerCameraAction$1 = (ArBoxesCameraStrategy$handleInnerCameraAction$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        arBoxesCameraStrategy$handleInnerCameraAction$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y670 y670Var = this.this$0.c;
        if (y670Var != null) {
            ((ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) y670Var.a.b.get()).a(y670Var.b, y670Var.c, new tis0((Object) ModalViewType.OVER_CAMERA, (Object) Integer.valueOf(((Number) z670.a.getValue()).intValue()), true, 16));
        }
        return zy11.a;
    }
}
