package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.m3f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1", f = "InputControllerImpl.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1(Continuation continuation, b bVar) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1 inputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1 = new InputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        inputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        inputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1.L$1 = obj2;
        return inputControllerImpl$requestLocationUpdates$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        Map map = (Map) this.L$1;
        m3f0 m3f0Var = this.this$0.e;
        m3f0Var.getClass();
        long andIncrement = m3f0.c.getAndIncrement(m3f0Var);
        k kVar = new k(new n(kotlinx.coroutines.flow.e.e(this.this$0.b.e, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST), new InputControllerImpl$requestLocationUpdates$1$1(this.this$0, andIncrement, map, null)), new InputControllerImpl$requestLocationUpdates$1$2(this.this$0, andIncrement, null));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = kVar.collect(new a(vprVar, map), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
