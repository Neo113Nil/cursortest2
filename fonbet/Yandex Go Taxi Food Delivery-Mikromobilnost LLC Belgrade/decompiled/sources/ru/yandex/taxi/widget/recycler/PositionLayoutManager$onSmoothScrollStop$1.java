package ru.yandex.taxi.widget.recycler;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qtc0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widget.recycler.PositionLayoutManager$onSmoothScrollStop$1", f = "PositionLayoutManager.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PositionLayoutManager$onSmoothScrollStop$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $flow;
    final /* synthetic */ Runnable $onStop;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionLayoutManager$onSmoothScrollStop$1(tpr tprVar, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.$onStop = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PositionLayoutManager$onSmoothScrollStop$1(this.$flow, this.$onStop, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PositionLayoutManager$onSmoothScrollStop$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$flow;
            Runnable runnable = this.$onStop;
            o oVar = new o(tprVar, new PositionLayoutManager$onSmoothScrollStop$1$invokeSuspend$$inlined$safeCollect$1(3, null));
            qtc0 qtc0Var = new qtc0(3, runnable);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(qtc0Var, this) == coroutineSingletons) {
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
