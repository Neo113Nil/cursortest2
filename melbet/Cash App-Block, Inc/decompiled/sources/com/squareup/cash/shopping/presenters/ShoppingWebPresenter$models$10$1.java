package com.squareup.cash.shopping.presenters;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.emoji2.text.EmojiExclusions;
import androidx.exifinterface.media.ExifInterfaceUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashWebMonitoringScript;
import com.squareup.cash.fillr.api.FillrWebManager$FillrVersions;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowEndResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$models$10$1 extends SuspendLambda implements Function2 {
    public MutableState $isPageLoaded$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ ShoppingWebPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebPresenter$models$10$1(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = shoppingWebPresenter;
        this.$isPageLoaded$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ShoppingWebPresenter$models$10$1(this.this$0, this.$isPageLoaded$delegate, this.$state$delegate, continuation, 0);
            case 1:
                return new ShoppingWebPresenter$models$10$1(this.this$0, this.$state$delegate, continuation);
            default:
                return new ShoppingWebPresenter$models$10$1(this.this$0, this.$isPageLoaded$delegate, this.$state$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebPresenter$models$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object access$downloadMonitoringScript;
        String str;
        SupCreateCardFlowEndResult supCreateCardFlowEndResult;
        String str2;
        Object access$retrievePlanDetails;
        RestrictedItemCheckRequest.PaymentMethod paymentMethod;
        Object access$getRestrictedItemsFromBackend;
        int i = this.$r8$classId;
        ShoppingWebPresenter shoppingWebPresenter = this.this$0;
        MutableState mutableState = this.$state$delegate;
        String str3 = null;
        switch (i) {
            case 0:
                Lazy lazy = shoppingWebPresenter.cashWebMonitoringScript$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = this.$isPageLoaded$delegate;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        break;
                    } else {
                        if (((JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) lazy.getValue()).enabled) {
                            this.label = 1;
                            access$downloadMonitoringScript = ShoppingWebPresenter.access$downloadMonitoringScript(shoppingWebPresenter, this);
                            if (access$downloadMonitoringScript == coroutineSingletons) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$downloadMonitoringScript = obj;
                }
                Uri uri = (Uri) access$downloadMonitoringScript;
                Set set2 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState.getValue();
                FillrWebManager$FillrVersions fillrVersions = shoppingWebPresenter.fillrManager.getFillrVersions();
                if (uri == null || (str = ((JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) lazy.getValue()).scriptVersion) == null) {
                    str = "0.0.1";
                }
                mutableState.setValue(ShoppingWebPresenter.State.copy$default(state, false, null, null, null, null, null, null, null, uri, fillrVersions, null, str, false, null, null, null, null, false, null, 536823807));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                    if (((shoppingWebScreen instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) || (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.SUP) && ((ShoppingWebPresenter.State) mutableState.getValue()).planDetails.downPayment == null)) && (supCreateCardFlowEndResult = ((ShoppingWebPresenter.State) mutableState.getValue()).supCheckoutEndResult) != null && (str2 = supCreateCardFlowEndResult.sup_checkout_id) != null) {
                        this.$isPageLoaded$delegate = mutableState;
                        this.label = 1;
                        access$retrievePlanDetails = ShoppingWebPresenter.access$retrievePlanDetails(shoppingWebPresenter, str2, this);
                        if (access$retrievePlanDetails == coroutineSingletons2) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.$isPageLoaded$delegate;
                    SafeTrace.throwOnFailure(obj);
                    access$retrievePlanDetails = obj;
                }
                Set set3 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, (ShoppingWebPresenter.PlanDetailsState) access$retrievePlanDetails, null, null, null, false, null, 536608767));
                break;
            default:
                ShoppingWebPresenter shoppingWebPresenter2 = this.this$0;
                ShoppingWebScreen shoppingWebScreen2 = shoppingWebPresenter2.args;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = this.$isPageLoaded$delegate;
                    Set set4 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) mutableState3.getValue();
                    if (shoppingWebScreen2 instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_SINGLE_USE_PAYMENT;
                    } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_CARD;
                    } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_AFTER_PAY;
                    } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_APP_PAY;
                    } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                        IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata;
                        if (!(iabMetadata instanceof IabMetadata.CashPayMetadata)) {
                            if (!(iabMetadata instanceof IabMetadata.AffiliateBoostMetadata)) {
                                if (!(iabMetadata instanceof IabMetadata.AfterpayMetadata)) {
                                    if (!(iabMetadata instanceof IabMetadata.SUPMetadata)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_SINGLE_USE_PAYMENT;
                                    }
                                } else {
                                    paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_AFTER_PAY;
                                }
                            } else {
                                paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_CARD;
                            }
                        } else {
                            paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_APP_PAY;
                        }
                    } else {
                        paymentMethod = RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_UNSPECIFIED;
                    }
                    String merchantToken = EmojiExclusions.getMerchantToken(shoppingWebScreen2);
                    if (merchantToken == null) {
                        ShoppingScreenContext screenContext = shoppingWebScreen2.getScreenContext();
                        if (screenContext != null) {
                            str3 = EmojiExclusions.getMerchantToken(screenContext);
                        }
                    } else {
                        str3 = merchantToken;
                    }
                    String str4 = shoppingWebPresenter2.flowToken;
                    this.label = 1;
                    access$getRestrictedItemsFromBackend = ShoppingWebPresenter.access$getRestrictedItemsFromBackend(shoppingWebPresenter2, fillrCartInformationExtraction$FillrCartInformation, paymentMethod, str3, str4, this);
                    if (access$getRestrictedItemsFromBackend == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$getRestrictedItemsFromBackend = obj;
                }
                ShoppingWebPresenter.RestrictedItemState restrictedItemState = (ShoppingWebPresenter.RestrictedItemState) access$getRestrictedItemsFromBackend;
                Set set5 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, restrictedItemState, null, false, null, null, null, null, false, null, 536854527));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$10$1(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.this$0 = shoppingWebPresenter;
        this.$state$delegate = mutableState;
    }
}
