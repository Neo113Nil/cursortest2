package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.qwb0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.callback.ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1", f = "ThrottledRedrawsPinInvalidationCallback.kt", l = {189}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1(Continuation continuation, b bVar) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1 throttledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1 = new ThrottledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        throttledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        throttledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return throttledRedrawsPinInvalidationCallback$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            qwb0 qwb0Var = (qwb0) this.L$1;
            tpr m217sampleLatestHG0u8IE = FlowExtensionsKt.m217sampleLatestHG0u8IE(FlowExtensionsKt.mergeWith(this.this$0.w, qwb0Var != null ? new g92(2, qwb0Var) : pvn.a), this.this$0.a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(m217sampleLatestHG0u8IE, vprVar, this) == coroutineSingletons) {
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
