package ru.yandex.taxi.masstransit.stoproute.router;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.ke2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.router.ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1", f = "MtStopRouteRouter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $anchoredSheetTarget;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ oz40 $showZoomButtons$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1(wg6 wg6Var, int i, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$anchoredSheetTarget = i;
        this.$showZoomButtons$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1(this.$bottomSheetState, this.$anchoredSheetTarget, this.$showZoomButtons$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(f.o(new gp5(this.$bottomSheetState, 6)));
            ke2 ke2Var = new ke2(this.$anchoredSheetTarget, this.$showZoomButtons$delegate, 1);
            this.label = 1;
            if (t.collect(ke2Var, this) == coroutineSingletons) {
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
