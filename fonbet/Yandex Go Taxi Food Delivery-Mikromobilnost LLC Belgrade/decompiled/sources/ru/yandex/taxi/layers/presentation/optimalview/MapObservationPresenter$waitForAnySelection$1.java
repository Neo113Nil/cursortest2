package ru.yandex.taxi.layers.presentation.optimalview;

import com.yandex.go.layers.api.model.params.Mode;
import defpackage.jst;
import defpackage.mq00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.optimalview.MapObservationPresenter$waitForAnySelection$1", f = "MapObservationPresenter.kt", l = {212}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObservationPresenter$waitForAnySelection$1 extends SuspendLambda implements wls {
    final /* synthetic */ Mode $mode;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObservationPresenter$waitForAnySelection$1(c cVar, Mode mode, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObservationPresenter$waitForAnySelection$1(this.this$0, this.$mode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObservationPresenter$waitForAnySelection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Mode mode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                Mode mode2 = this.$mode;
                tpr tprVar = (tpr) cVar2.A.k.getValue();
                MapObservationPresenter$waitForAnySelection$1$1$1 mapObservationPresenter$waitForAnySelection$1$1$1 = new MapObservationPresenter$waitForAnySelection$1$1$1(2, null);
                this.L$0 = cVar2;
                this.L$1 = mode2;
                this.label = 1;
                if (e.x(tprVar, mapObservationPresenter$waitForAnySelection$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
                mode = mode2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mode = (Mode) this.L$1;
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            cVar.F.t("FIRST_USAGE_HINT_SHOWN", v4r0.i((Set) cVar.G.getValue(cVar, c.M[0]), mode.getWireName()));
            ((mq00) cVar.Dg()).hideFirstUsageHint();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
