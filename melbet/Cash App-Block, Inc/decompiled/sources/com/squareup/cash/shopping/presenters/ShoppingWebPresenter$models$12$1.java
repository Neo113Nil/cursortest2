package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.MutableState;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$models$12$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $lastDetectedCartInfo$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MutableState $state$delegate;
    public final /* synthetic */ ShoppingWebPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$12$1(MutableState mutableState, ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$lastDetectedCartInfo$delegate = mutableState;
        this.this$0 = shoppingWebPresenter;
        this.$state$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        ShoppingWebPresenter shoppingWebPresenter = this.this$0;
        MutableState mutableState2 = this.$lastDetectedCartInfo$delegate;
        switch (i) {
            case 0:
                return new ShoppingWebPresenter$models$12$1(shoppingWebPresenter, mutableState2, mutableState, continuation);
            default:
                return new ShoppingWebPresenter$models$12$1(mutableState2, shoppingWebPresenter, mutableState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebPresenter$models$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        ShoppingWebPresenter shoppingWebPresenter = this.this$0;
        MutableState mutableState2 = this.$lastDetectedCartInfo$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) mutableState2.getValue();
                ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState.getValue();
                if (fillrCartInformationExtraction$FillrCartInformation != null) {
                    ShoppingWebPresenter.MerchantConfig merchantConfig = state.merchantConfig;
                    if (merchantConfig.cardOnFile && !state.showedAddCardSheet && !ShoppingWebPresenter.spendingLimitReached(merchantConfig) && !ShoppingWebPresenter.loanLimitReached(state.merchantConfig)) {
                        mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536346623));
                        shoppingWebPresenter.navigator.goTo(SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen.INSTANCE);
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set2 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                if (((ShoppingWebPresenter.State) mutableState2.getValue()).cartError != null) {
                    ShoppingWebPresenter.CartError access$getCartError = ShoppingWebPresenter.access$getCartError(shoppingWebPresenter, (FillrCartInformationExtraction$FillrCartInformation) mutableState.getValue(), ((ShoppingWebPresenter.State) mutableState2.getValue()).merchantConfig, ((ShoppingWebPresenter.State) mutableState2.getValue()).restrictedItemState);
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, WebNavigationFooterViewModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).footerViewModel, false, false, new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(access$getCartError == null ? PillStage.Initial.INSTANCE : PillStage.Error.INSTANCE), 11), null, null, null, null, null, null, null, null, false, null, null, access$getCartError, null, false, null, 534773751));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$12$1(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = shoppingWebPresenter;
        this.$lastDetectedCartInfo$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }
}
