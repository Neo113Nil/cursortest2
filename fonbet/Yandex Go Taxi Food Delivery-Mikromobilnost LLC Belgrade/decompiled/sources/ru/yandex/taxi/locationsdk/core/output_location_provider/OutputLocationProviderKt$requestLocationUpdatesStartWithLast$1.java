package ru.yandex.taxi.locationsdk.core.output_location_provider;

import defpackage.k7z;
import defpackage.ly80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk7z;", "OutputLocation", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.output_location_provider.OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1", f = "OutputLocationProvider.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1 extends SuspendLambda implements wls {
    final /* synthetic */ ly80 $this_requestLocationUpdatesStartWithLast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1(ly80 ly80Var, Continuation continuation) {
        super(2, continuation);
        this.$this_requestLocationUpdatesStartWithLast = ly80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1 outputLocationProviderKt$requestLocationUpdatesStartWithLast$1 = new OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1(this.$this_requestLocationUpdatesStartWithLast, continuation);
        outputLocationProviderKt$requestLocationUpdatesStartWithLast$1.L$0 = obj;
        return outputLocationProviderKt$requestLocationUpdatesStartWithLast$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            k7z k7zVar = ((d) this.$this_requestLocationUpdatesStartWithLast).l;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(k7zVar, this) == coroutineSingletons) {
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
