package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.gp5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oy8;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteScreenKt$SheetBody$1$2$1", f = "MtDetailedRouteScreen.kt", l = {583}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteScreenKt$SheetBody$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $collapsedPeekTarget;
    final /* synthetic */ tls $onAnchoredHeightChanged;
    final /* synthetic */ wg6 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteScreenKt$SheetBody$1$2$1(int i, wg6 wg6Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = wg6Var;
        this.$collapsedPeekTarget = i;
        this.$onAnchoredHeightChanged = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRouteScreenKt$SheetBody$1$2$1(this.$collapsedPeekTarget, this.$sheetState, this.$onAnchoredHeightChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteScreenKt$SheetBody$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new mth(androidx.compose.runtime.f.o(new gp5(this.$sheetState, 9)), 6));
            oy8 oy8Var = new oy8(this.$collapsedPeekTarget, this.$sheetState, this.$onAnchoredHeightChanged);
            this.label = 1;
            if (t.collect(oy8Var, this) == coroutineSingletons) {
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
