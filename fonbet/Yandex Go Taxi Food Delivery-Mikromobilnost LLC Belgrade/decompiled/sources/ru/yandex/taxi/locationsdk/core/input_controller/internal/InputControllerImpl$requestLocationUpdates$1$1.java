package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.m3f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lk7z;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputControllerImpl$requestLocationUpdates$1$1", f = "InputControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputControllerImpl$requestLocationUpdates$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $requestId;
    final /* synthetic */ Map<q6z, InputSourcePriority$Active> $requestedPriorities;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputControllerImpl$requestLocationUpdates$1$1(b bVar, long j, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$requestId = j;
        this.$requestedPriorities = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InputControllerImpl$requestLocationUpdates$1$1(this.this$0, this.$requestId, this.$requestedPriorities, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InputControllerImpl$requestLocationUpdates$1$1 inputControllerImpl$requestLocationUpdates$1$1 = (InputControllerImpl$requestLocationUpdates$1$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        inputControllerImpl$requestLocationUpdates$1$1.invokeSuspend(zy11Var);
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
        Map<q6z, InputSourcePriority$Active> map = this.$requestedPriorities;
        r0 r0Var = m3f0Var.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.o((Map) value, new Pair(Long.valueOf(j), map))));
        return zy11.a;
    }
}
