package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.fys0;
import defpackage.lys0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qys0;
import defpackage.tse;
import defpackage.tys0;
import defpackage.wbf;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy$handleInnerCameraAction$2", f = "AiCameraStrategy.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiCameraStrategy$handleInnerCameraAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ lys0 $action;
    final /* synthetic */ tys0 $currentState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCameraStrategy$handleInnerCameraAction$2(a aVar, tys0 tys0Var, lys0 lys0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$currentState = tys0Var;
        this.$action = lys0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiCameraStrategy$handleInnerCameraAction$2(this.this$0, this.$currentState, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiCameraStrategy$handleInnerCameraAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            qys0 qys0Var = (qys0) this.$currentState;
            fys0 fys0Var = (fys0) this.$action;
            byte[] bArr = fys0Var.a;
            wbf wbfVar = fys0Var.b;
            this.label = 1;
            if (a.f(aVar, qys0Var, bArr, wbfVar, this) == coroutineSingletons) {
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
