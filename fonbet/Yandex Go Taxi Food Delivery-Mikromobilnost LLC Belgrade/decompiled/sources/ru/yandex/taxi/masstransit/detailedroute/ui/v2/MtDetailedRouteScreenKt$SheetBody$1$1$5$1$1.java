package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1", f = "MtDetailedRouteScreen.kt", l = {556, 558}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $collapsedPeekTarget;
    final /* synthetic */ boolean $isTalkBackEnabled;
    final /* synthetic */ androidx.compose.foundation.lazy.b $routeListState;
    final /* synthetic */ wg6 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1(androidx.compose.foundation.lazy.b bVar, boolean z, wg6 wg6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.$routeListState = bVar;
        this.$isTalkBackEnabled = z;
        this.$sheetState = wg6Var;
        this.$collapsedPeekTarget = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1(this.$routeListState, this.$isTalkBackEnabled, this.$sheetState, this.$collapsedPeekTarget, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (com.yandex.go.design.compose.modal.bottomsheet.c.d(r5, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r5.f(0, 0, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.lazy.b bVar = this.$routeListState;
            this.label = 1;
            tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!this.$isTalkBackEnabled) {
            wg6 wg6Var = this.$sheetState;
            int i2 = this.$collapsedPeekTarget;
            this.label = 2;
        }
        return zy11.a;
    }
}
