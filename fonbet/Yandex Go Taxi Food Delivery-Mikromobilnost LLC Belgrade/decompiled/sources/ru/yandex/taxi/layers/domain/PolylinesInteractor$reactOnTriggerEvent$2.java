package ru.yandex.taxi.layers.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0c;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolylinesInteractor$reactOnTriggerEvent$2", f = "PolylinesInteractor.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PolylinesInteractor$reactOnTriggerEvent$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    public PolylinesInteractor$reactOnTriggerEvent$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolylinesInteractor$reactOnTriggerEvent$2 polylinesInteractor$reactOnTriggerEvent$2 = new PolylinesInteractor$reactOnTriggerEvent$2(2, continuation);
        polylinesInteractor$reactOnTriggerEvent$2.L$0 = obj;
        return polylinesInteractor$reactOnTriggerEvent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolylinesInteractor$reactOnTriggerEvent$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(r0c.a, this) == coroutineSingletons) {
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
