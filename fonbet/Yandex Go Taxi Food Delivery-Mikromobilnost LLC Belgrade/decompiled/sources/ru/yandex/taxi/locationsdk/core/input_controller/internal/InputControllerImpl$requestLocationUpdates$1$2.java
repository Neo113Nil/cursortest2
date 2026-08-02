package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.m3f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lk7z;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputControllerImpl$requestLocationUpdates$1$2", f = "InputControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputControllerImpl$requestLocationUpdates$1$2 extends SuspendLambda implements zls {
    final /* synthetic */ long $requestId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputControllerImpl$requestLocationUpdates$1$2(b bVar, long j, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$requestId = j;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputControllerImpl$requestLocationUpdates$1$2 inputControllerImpl$requestLocationUpdates$1$2 = new InputControllerImpl$requestLocationUpdates$1$2(this.this$0, this.$requestId, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        inputControllerImpl$requestLocationUpdates$1$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m3f0 m3f0Var = this.this$0.e;
        long j = this.$requestId;
        r0 r0Var = m3f0Var.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.j(Long.valueOf(j), (Map) value)));
        return zy11.a;
    }
}
