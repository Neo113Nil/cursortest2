package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.smart_camera;

import defpackage.azs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.x2s;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.smart_camera.SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1", f = "SmartCameraEntryPoint.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onShown;
    final /* synthetic */ azs0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1(azs0 azs0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = azs0Var;
        this.$onShown = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1(this.$state, this.$onShown, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1 smartCameraEntryPointKt$SmartCameraEntryPoint$1$1 = (SmartCameraEntryPointKt$SmartCameraEntryPoint$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        smartCameraEntryPointKt$SmartCameraEntryPoint$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x2s x2sVar = this.$state.e.b;
        if (x2sVar != null) {
            this.$onShown.invoke(x2sVar);
        }
        return zy11.a;
    }
}
