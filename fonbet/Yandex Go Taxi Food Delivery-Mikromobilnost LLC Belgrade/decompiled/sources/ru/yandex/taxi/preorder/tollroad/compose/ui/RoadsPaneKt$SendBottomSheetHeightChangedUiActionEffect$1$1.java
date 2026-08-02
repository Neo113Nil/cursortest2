package ru.yandex.taxi.preorder.tollroad.compose.ui;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.um1;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.ui.RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1", f = "RoadsPane.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ tls $handleRoadsPaneUiAction;
    final /* synthetic */ int $paddingPx;
    final /* synthetic */ int $topInsetPx;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1(wg6 wg6Var, tls tlsVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$handleRoadsPaneUiAction = tlsVar;
        this.$topInsetPx = i;
        this.$paddingPx = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1(this.$bottomSheetState, this.$handleRoadsPaneUiAction, this.$topInsetPx, this.$paddingPx, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new b(f.o(new gp5(this.$bottomSheetState, 15))));
            tls tlsVar = this.$handleRoadsPaneUiAction;
            int i2 = this.$topInsetPx;
            int i3 = this.$paddingPx;
            o oVar = new o(t, new RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            um1 um1Var = new um1(tlsVar, i2, i3, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(um1Var, this) == coroutineSingletons) {
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
