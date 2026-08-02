package ru.yandex.taxi.masstransit.trains.search;

import defpackage.gc01;
import defpackage.mvg;
import defpackage.nc01;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.search.TrainStationSearchModalKt$Content$1$1", f = "TrainStationSearchModal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainStationSearchModalKt$Content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $destinationFocusRequester;
    final /* synthetic */ yur $sourceFocusRequester;
    final /* synthetic */ nc01 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationSearchModalKt$Content$1$1(nc01 nc01Var, yur yurVar, yur yurVar2, Continuation continuation) {
        super(2, continuation);
        this.$uiState = nc01Var;
        this.$sourceFocusRequester = yurVar;
        this.$destinationFocusRequester = yurVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainStationSearchModalKt$Content$1$1(this.$uiState, this.$sourceFocusRequester, this.$destinationFocusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrainStationSearchModalKt$Content$1$1 trainStationSearchModalKt$Content$1$1 = (TrainStationSearchModalKt$Content$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trainStationSearchModalKt$Content$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = gc01.a[this.$uiState.i.ordinal()];
        if (i == 1 || i == 2) {
            yur.b(this.$sourceFocusRequester);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            yur.b(this.$destinationFocusRequester);
        }
        return zy11.a;
    }
}
