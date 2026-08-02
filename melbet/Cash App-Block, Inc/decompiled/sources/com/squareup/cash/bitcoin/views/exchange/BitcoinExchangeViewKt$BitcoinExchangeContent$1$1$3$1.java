package com.squareup.cash.bitcoin.views.exchange;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isSubmitButtonEnabled$delegate;
    public final /* synthetic */ MutableState $isSubmitButtonEnabledFromAmount$delegate;
    public final /* synthetic */ BitcoinTransferViewModel $model;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1(BitcoinTransferViewModel bitcoinTransferViewModel, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = bitcoinTransferViewModel;
        this.$isSubmitButtonEnabledFromAmount$delegate = mutableState;
        this.$isSubmitButtonEnabled$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1(this.$model, this.$isSubmitButtonEnabledFromAmount$delegate, this.$isSubmitButtonEnabled$delegate, continuation, 0);
            default:
                return new BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1(this.$model, this.$isSubmitButtonEnabledFromAmount$delegate, this.$isSubmitButtonEnabled$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isSubmitButtonEnabled$delegate;
        MutableState mutableState2 = this.$isSubmitButtonEnabledFromAmount$delegate;
        BitcoinTransferViewModel bitcoinTransferViewModel = this.$model;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent) {
                    Boolean bool = (Boolean) mutableState2.getValue();
                    bool.booleanValue();
                    mutableState.setValue(bool);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent) {
                    mutableState2.setValue((BitcoinTransferViewModel.Content.BottomSheetContent) bitcoinTransferViewModel);
                } else if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent) {
                    mutableState.setValue((BitcoinTransferViewModel.Content.FullScreenContent) bitcoinTransferViewModel);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
