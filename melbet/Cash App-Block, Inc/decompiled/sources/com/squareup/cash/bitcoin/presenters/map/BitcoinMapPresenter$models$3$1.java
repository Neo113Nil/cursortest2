package com.squareup.cash.bitcoin.presenters.map;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinMapPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $mapMovement$delegate;
    public final /* synthetic */ CashMapViewModel $mapViewModel;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $selectedLocation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinMapPresenter$models$3$1(CashMapViewModel cashMapViewModel, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$mapViewModel = cashMapViewModel;
        this.$mapMovement$delegate = mutableState;
        this.$selectedLocation$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new BitcoinMapPresenter$models$3$1(this.$mapViewModel, this.$mapMovement$delegate, this.$selectedLocation$delegate, continuation, 0);
            default:
                return new BitcoinMapPresenter$models$3$1(this.$mapViewModel, this.$mapMovement$delegate, this.$selectedLocation$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinMapPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$selectedLocation$delegate;
        CashMapViewModel cashMapViewModel = this.$mapViewModel;
        MutableState mutableState2 = this.$mapMovement$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(cashMapViewModel.latestMapMovement);
                mutableState.setValue(cashMapViewModel.selectedLocation);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(cashMapViewModel.latestMapMovement);
                mutableState.setValue(cashMapViewModel.selectedLocation);
                break;
        }
        return Unit.INSTANCE;
    }
}
