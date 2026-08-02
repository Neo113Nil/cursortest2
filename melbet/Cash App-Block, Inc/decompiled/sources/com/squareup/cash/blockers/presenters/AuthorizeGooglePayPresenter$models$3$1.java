package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentRequest;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentResponse;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AuthorizeGooglePayPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $model$delegate;
    public int label;
    public final /* synthetic */ AuthorizeGooglePayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeGooglePayPresenter$models$3$1(AuthorizeGooglePayPresenter authorizeGooglePayPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = authorizeGooglePayPresenter;
        this.$model$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeGooglePayPresenter$models$3$1(this.this$0, this.$model$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeGooglePayPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (r0 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x003b, code lost:
    
        if (r0 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object loadPaymentData;
        Object obj2;
        GlobalAddress globalAddress;
        Object authorizeDigitalWalletPayment;
        String str;
        Object failure;
        Enum r0;
        AuthorizeGooglePayPresenter authorizeGooglePayPresenter = this.this$0;
        AndroidStringManager androidStringManager = authorizeGooglePayPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = authorizeGooglePayPresenter.navigator;
        BlockersScreens.AuthorizeGooglePayScreen authorizeGooglePayScreen = authorizeGooglePayPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GooglePayPaymentsClient googlePayPaymentsClient = authorizeGooglePayPresenter.googlePayPaymentsClient;
            Money money = authorizeGooglePayScreen.amount;
            this.label = 1;
            loadPaymentData = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).loadPaymentData(money, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                authorizeDigitalWalletPayment = obj;
                obj2 = null;
                ApiResult apiResult = (ApiResult) authorizeDigitalWalletPayment;
                if (apiResult instanceof ApiResult.Success) {
                    BlockersDataNavigator blockersDataNavigator = authorizeGooglePayPresenter.blockersDataNavigator;
                    BlockersData blockersData = authorizeGooglePayScreen.blockersData;
                    ResponseContext responseContext = ((AuthorizeDigitalWalletPaymentResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(blockersDataNavigator.getNext(authorizeGooglePayScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj2;
                    }
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, authorizeGooglePayScreen, androidStringManager));
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            loadPaymentData = obj;
        }
        GooglePayPaymentsClient.PaymentResult paymentResult = (GooglePayPaymentsClient.PaymentResult) loadPaymentData;
        if (!(paymentResult instanceof GooglePayPaymentsClient.PaymentResult.Success)) {
            if (Intrinsics.areEqual(paymentResult, GooglePayPaymentsClient.PaymentResult.Failure.INSTANCE)) {
                screenNavigator.goTo(new FailureMessageBlockerScreen(authorizeGooglePayScreen.blockersData, androidStringManager.get(R.string.error_messaging_message_try_again_later), androidStringManager.get(R.string.error_messaging_title_something_went_wrong)));
            } else {
                if (!Intrinsics.areEqual(paymentResult, GooglePayPaymentsClient.PaymentResult.Cancelled.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(authorizeGooglePayScreen.blockersData.exitScreen);
            }
            return Unit.INSTANCE;
        }
        this.$model$delegate.setValue(AuthorizeGooglePayViewModel.Loading.INSTANCE);
        GooglePayPaymentsClient.PaymentMethodResult paymentMethodResult = ((GooglePayPaymentsClient.PaymentResult.Success) paymentResult).paymentMethodResult;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData paymentMethodData = paymentMethodResult.getPaymentMethodData();
        RequestContext requestContext = authorizeGooglePayScreen.blockersData.requestContext;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.TokenizationData tokenizationData = paymentMethodData.tokenizationData;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo cardInfo = paymentMethodData.info;
        String str2 = tokenizationData.token;
        AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken authorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken = new AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken(new GooglePayPaymentToken(str2, authorizeGooglePayPresenter.paymentsMerchantId, str2, cardInfo.cardDetails, null, null, null, ByteString.EMPTY));
        String email = paymentMethodResult.getEmail();
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress billingAddress = cardInfo.billingAddress;
        String str3 = billingAddress != null ? billingAddress.name : null;
        String str4 = billingAddress != null ? billingAddress.phoneNumber : null;
        if (billingAddress != null) {
            String str5 = billingAddress.address1;
            String str6 = billingAddress.address2;
            String str7 = billingAddress.locality;
            obj2 = null;
            String str8 = billingAddress.administrativeArea;
            String str9 = billingAddress.postalCode;
            String str10 = billingAddress.countryCode;
            if (str10 != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    str = str5;
                    try {
                        String upperCase = str10.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        failure = Country.valueOf(upperCase);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        if (failure instanceof Result.Failure) {
                        }
                        r0 = (Enum) failure;
                        globalAddress = new GlobalAddress(str, str6, str7, str8, str9, (Country) r0, null, null, 4194068);
                        AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = new AuthorizeDigitalWalletPaymentRequest(authorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken, requestContext, email, str4, str3, null, null, globalAddress, ByteString.EMPTY);
                        AppService appService = authorizeGooglePayPresenter.appService;
                        BlockersData blockersData2 = authorizeGooglePayScreen.blockersData;
                        ClientScenario clientScenario = blockersData2.clientScenario;
                        String str11 = blockersData2.flowToken;
                        this.label = 2;
                        authorizeDigitalWalletPayment = appService.authorizeDigitalWalletPayment(clientScenario, str11, authorizeDigitalWalletPaymentRequest, this);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = str5;
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                r0 = (Enum) failure;
            } else {
                str = str5;
                r0 = null;
            }
            globalAddress = new GlobalAddress(str, str6, str7, str8, str9, (Country) r0, null, null, 4194068);
        } else {
            obj2 = null;
            globalAddress = null;
        }
        AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest2 = new AuthorizeDigitalWalletPaymentRequest(authorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken, requestContext, email, str4, str3, null, null, globalAddress, ByteString.EMPTY);
        AppService appService2 = authorizeGooglePayPresenter.appService;
        BlockersData blockersData22 = authorizeGooglePayScreen.blockersData;
        ClientScenario clientScenario2 = blockersData22.clientScenario;
        String str112 = blockersData22.flowToken;
        this.label = 2;
        authorizeDigitalWalletPayment = appService2.authorizeDigitalWalletPayment(clientScenario2, str112, authorizeDigitalWalletPaymentRequest2, this);
    }
}
