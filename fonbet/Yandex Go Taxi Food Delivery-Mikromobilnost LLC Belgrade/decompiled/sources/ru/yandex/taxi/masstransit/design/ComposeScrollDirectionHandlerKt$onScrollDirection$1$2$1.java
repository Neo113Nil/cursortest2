package ru.yandex.taxi.masstransit.design;

import androidx.compose.runtime.f;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.tx40;
import defpackage.ud;
import defpackage.vs9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.design.ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1", f = "ComposeScrollDirectionHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tx40 $accumulatedDy$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ tls $onDirectionChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1(androidx.compose.foundation.lazy.b bVar, tls tlsVar, tx40 tx40Var, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$onDirectionChanged = tlsVar;
        this.$accumulatedDy$delegate = tx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1(this.$listState, this.$onDirectionChanged, this.$accumulatedDy$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = new e(kotlinx.coroutines.flow.e.t(f.o(new vs9(this.$listState, 2))));
            ud udVar = new ud(17, this.$onDirectionChanged, this.$accumulatedDy$delegate);
            this.label = 1;
            if (eVar.collect(udVar, this) == coroutineSingletons) {
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
