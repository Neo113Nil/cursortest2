package ru.yandex.taxi.orderforanother.v2;

import androidx.compose.runtime.f;
import defpackage.ed31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.yw8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderforanother.v2.WhoRidePaneV2Kt$WhoRidePaneV2$3$1", f = "WhoRidePaneV2.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WhoRidePaneV2Kt$WhoRidePaneV2$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ oz40 $dismissedByUser;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhoRidePaneV2Kt$WhoRidePaneV2$3$1(wg6 wg6Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$dismissedByUser = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WhoRidePaneV2Kt$WhoRidePaneV2$3$1(this.$bottomSheetState, this.$dismissedByUser, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WhoRidePaneV2Kt$WhoRidePaneV2$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = new b(f.o(new ed31(this.$bottomSheetState, 4)));
            yw8 yw8Var = new yw8(6, this.$dismissedByUser);
            this.label = 1;
            if (bVar.collect(yw8Var, this) == coroutineSingletons) {
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
