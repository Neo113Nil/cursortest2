package com.squareup.cash.google.pay.payments.real;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjo;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.presenters.FamilyAppletTilePresenter$Factory$Impl;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.util.android.ActivityResult;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient implements GooglePayPaymentsClient {
    public final Activity activity;
    public final Flow activityResults;
    public final boolean isDebug;
    public final JsonAdapter mapAdapter;
    public final MoneyFormatter moneyFormatter;
    public final JsonAdapter paymentAdapter;
    public final JsonAdapter paymentMethodAdapter;
    public final Lazy paymentsClient$delegate;
    public final String paymentsMerchantId;
    public static final Map CARD_NETWORKS = MapsKt__MapsKt.mapOf(new Pair(1, "AMEX"), new Pair(2, "DISCOVER"), new Pair(5, "VISA"), new Pair(4, "MASTERCARD"));
    public static final List AUTH_METHODS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"PAN_ONLY", "CRYPTOGRAM_3DS"});

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory activity;
        public final InstanceFactory activityResults;
        public final Provider isDebug;
        public final Provider moneyFormatterFactory;

        public /* synthetic */ MetroFactory(Provider provider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider2, int i) {
            this.$r8$classId = i;
            this.isDebug = provider;
            this.activityResults = instanceFactory;
            this.activity = instanceFactory2;
            this.moneyFormatterFactory = provider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.moneyFormatterFactory;
            InstanceFactory instanceFactory = this.activity;
            InstanceFactory instanceFactory2 = this.activityResults;
            Provider provider2 = this.isDebug;
            switch (i) {
                case 0:
                    Integer num = 1;
                    int intValue = num.intValue();
                    boolean booleanValue = ((Boolean) provider2.invoke()).booleanValue();
                    Flow flow = (Flow) instanceFactory2.value;
                    Activity activity = (Activity) instanceFactory.value;
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    flow.getClass();
                    activity.getClass();
                    factory.getClass();
                    return new RealGooglePayPaymentsClient(intValue, "05498866192997955200", booleanValue, flow, activity, factory);
                default:
                    RealFamilyAppletTileRepository realFamilyAppletTileRepository = (RealFamilyAppletTileRepository) provider2.invoke();
                    FamilyAppletTilePresenter$Factory$Impl familyAppletTilePresenter$Factory$Impl = (FamilyAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realFamilyAppletTileRepository.getClass();
                    familyAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner.getClass();
                    realImageLoader.getClass();
                    return zzjo.familiesApplet(realFamilyAppletTileRepository, familyAppletTilePresenter$Factory$Impl, lifecycleOwner, realImageLoader);
            }
        }
    }

    public RealGooglePayPaymentsClient(int i, String str, boolean z, Flow flow, Activity activity, LocalizedMoneyFormatter.Factory factory) {
        this.paymentsMerchantId = str;
        this.isDebug = z;
        this.activityResults = flow;
        this.activity = activity;
        this.moneyFormatter = factory.createNoSymbol();
        Moshi moshi = new Moshi(new Moshi.Builder());
        this.mapAdapter = moshi.adapter(Map.class);
        Set set = Util.NO_ANNOTATIONS;
        this.paymentAdapter = moshi.adapter(PaymentData.class, set, null);
        this.paymentMethodAdapter = moshi.adapter(GooglePayPaymentsClient.PaymentMethodResult.class, set, null);
        this.paymentsClient$delegate = LazyKt.lazy(new q2$$ExternalSyntheticLambda8(i, this, 12));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReadyToPay(ContinuationImpl continuationImpl) {
        RealGooglePayPaymentsClient$isReadyToPay$1 realGooglePayPaymentsClient$isReadyToPay$1;
        int i;
        if (continuationImpl instanceof RealGooglePayPaymentsClient$isReadyToPay$1) {
            realGooglePayPaymentsClient$isReadyToPay$1 = (RealGooglePayPaymentsClient$isReadyToPay$1) continuationImpl;
            int i2 = realGooglePayPaymentsClient$isReadyToPay$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGooglePayPaymentsClient$isReadyToPay$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGooglePayPaymentsClient$isReadyToPay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGooglePayPaymentsClient$isReadyToPay$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String json = this.mapAdapter.toJson(MapsKt__MapsKt.mapOf(new Pair("apiVersion", new Integer(2)), new Pair("apiVersionMinor", new Integer(0)), new Pair("existingPaymentMethodRequired", Boolean.valueOf(!this.isDebug)), new Pair("allowedPaymentMethods", CollectionsKt__CollectionsJVMKt.listOf(MapsKt__MapsKt.mapOf(new Pair("type", "CARD"), new Pair("parameters", MapsKt__MapsKt.mapOf(new Pair("allowedAuthMethods", AUTH_METHODS), new Pair("allowedCardNetworks", CollectionsKt.toList(CARD_NETWORKS.values())))))))));
                    IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                    zzae.checkNotNull(json, "isReadyToPayRequestJson cannot be null!");
                    isReadyToPayRequest.zzf = json;
                    Object value = this.paymentsClient$delegate.getValue();
                    value.getClass();
                    zzw isReadyToPay = ((PaymentsClient) value).isReadyToPay(isReadyToPayRequest);
                    isReadyToPay.getClass();
                    realGooglePayPaymentsClient$isReadyToPay$1.label = 1;
                    obj = Okio.awaitImpl(isReadyToPay, null, realGooglePayPaymentsClient$isReadyToPay$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        realGooglePayPaymentsClient$isReadyToPay$1 = new RealGooglePayPaymentsClient$isReadyToPay$1(this, continuationImpl);
        Object obj2 = realGooglePayPaymentsClient$isReadyToPay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGooglePayPaymentsClient$isReadyToPay$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        obj2.getClass();
        z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentData(Money money, ContinuationImpl continuationImpl) {
        RealGooglePayPaymentsClient$loadPaymentData$1 realGooglePayPaymentsClient$loadPaymentData$1;
        int i;
        int i2;
        GooglePayPaymentsClient.PaymentMethodResult paymentMethodResult;
        if (continuationImpl instanceof RealGooglePayPaymentsClient$loadPaymentData$1) {
            realGooglePayPaymentsClient$loadPaymentData$1 = (RealGooglePayPaymentsClient$loadPaymentData$1) continuationImpl;
            int i3 = realGooglePayPaymentsClient$loadPaymentData$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realGooglePayPaymentsClient$loadPaymentData$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realGooglePayPaymentsClient$loadPaymentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGooglePayPaymentsClient$loadPaymentData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = CollectionsKt.toList(CARD_NETWORKS.values());
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.TRUE;
                    PaymentData.AllowedPaymentMethod.CardParameters cardParameters = new PaymentData.AllowedPaymentMethod.CardParameters(AUTH_METHODS, list, bool, bool, bool2, new PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters("FULL", bool2));
                    Pair pair = new Pair("gateway", "square");
                    String str = this.paymentsMerchantId;
                    String json = this.paymentAdapter.toJson(new PaymentData(2, 0, CollectionsKt__CollectionsJVMKt.listOf(new PaymentData.AllowedPaymentMethod("CARD", cardParameters, new PaymentData.AllowedPaymentMethod.TokenizationSpecification("PAYMENT_GATEWAY", MapsKt__MapsKt.mapOf(pair, new Pair("gatewayMerchantId", str))))), true, new PaymentData.MerchantInfo("Cash App", str), new PaymentData.TransactionInfo("FINAL", this.moneyFormatter.format(money), String.valueOf(money.currency_code), Country.US.toString())));
                    PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
                    zzae.checkNotNull(json, "paymentDataRequestJson cannot be null!");
                    paymentDataRequest.zzj = json;
                    Object value = this.paymentsClient$delegate.getValue();
                    value.getClass();
                    zzw loadPaymentData = ((PaymentsClient) value).loadPaymentData(paymentDataRequest);
                    loadPaymentData.getClass();
                    AutoResolveHelper.resolveTask(loadPaymentData, this.activity);
                    RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(this.activityResults, 28);
                    realGooglePayPaymentsClient$loadPaymentData$1.label = 1;
                    obj = FlowKt.first(realGooglePayer$createWallet$$inlined$filter$1, realGooglePayPaymentsClient$loadPaymentData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ActivityResult activityResult = (ActivityResult) obj;
                i2 = activityResult.resultCode;
                if (i2 != -1) {
                    Intent intent = activityResult.intent;
                    intent.getClass();
                    Parcelable.Creator<com.google.android.gms.wallet.PaymentData> creator = com.google.android.gms.wallet.PaymentData.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    com.google.android.gms.wallet.PaymentData paymentData = (com.google.android.gms.wallet.PaymentData) (byteArrayExtra != null ? ErrorsKt.deserializeFromBytes(byteArrayExtra, creator) : null);
                    if (paymentData != null && (paymentMethodResult = (GooglePayPaymentsClient.PaymentMethodResult) this.paymentMethodAdapter.fromJson(paymentData.zzg)) != null) {
                        return new GooglePayPaymentsClient.PaymentResult.Success(paymentMethodResult);
                    }
                } else if (i2 == 0) {
                    return GooglePayPaymentsClient.PaymentResult.Cancelled.INSTANCE;
                }
                return GooglePayPaymentsClient.PaymentResult.Failure.INSTANCE;
            }
        }
        realGooglePayPaymentsClient$loadPaymentData$1 = new RealGooglePayPaymentsClient$loadPaymentData$1(this, continuationImpl);
        Object obj2 = realGooglePayPaymentsClient$loadPaymentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGooglePayPaymentsClient$loadPaymentData$1.label;
        if (i != 0) {
        }
        ActivityResult activityResult2 = (ActivityResult) obj2;
        i2 = activityResult2.resultCode;
        if (i2 != -1) {
        }
        return GooglePayPaymentsClient.PaymentResult.Failure.INSTANCE;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0003012B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0011J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"com/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData", "", "", "apiVersion", "apiVersionMinor", "", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod;", "allowedPaymentMethods", "", "emailRequired", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;", "merchantInfo", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;", "transactionInfo", "<init>", "(IILjava/util/List;ZLcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "()Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;", "component6", "()Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData;", "copy", "(IILjava/util/List;ZLcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;)Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getApiVersion", "getApiVersionMinor", "Ljava/util/List;", "getAllowedPaymentMethods", "Z", "getEmailRequired", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;", "getMerchantInfo", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;", "getTransactionInfo", "AllowedPaymentMethod", "MerchantInfo", "TransactionInfo", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class PaymentData {
        private final List<AllowedPaymentMethod> allowedPaymentMethods;
        private final int apiVersion;
        private final int apiVersionMinor;
        private final boolean emailRequired;
        private final MerchantInfo merchantInfo;
        private final TransactionInfo transactionInfo;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TransactionInfo {
            public final String countryCode;
            public final String currencyCode;
            public final String totalPrice;
            public final String totalPriceStatus;

            public TransactionInfo(String str, String str2, String str3, String str4) {
                str2.getClass();
                str4.getClass();
                this.totalPriceStatus = str;
                this.totalPrice = str2;
                this.currencyCode = str3;
                this.countryCode = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransactionInfo)) {
                    return false;
                }
                TransactionInfo transactionInfo = (TransactionInfo) obj;
                return this.totalPriceStatus.equals(transactionInfo.totalPriceStatus) && Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && this.currencyCode.equals(transactionInfo.currencyCode) && Intrinsics.areEqual(this.countryCode, transactionInfo.countryCode);
            }

            public final int hashCode() {
                return this.countryCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalPriceStatus.hashCode() * 31, 31, this.totalPrice), 31, this.currencyCode);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TransactionInfo(totalPriceStatus=", this.totalPriceStatus, ", totalPrice=", this.totalPrice, ", currencyCode="), this.currencyCode, ", countryCode=", this.countryCode, ")");
            }
        }

        public PaymentData(int i, int i2, List<AllowedPaymentMethod> list, boolean z, MerchantInfo merchantInfo, TransactionInfo transactionInfo) {
            list.getClass();
            merchantInfo.getClass();
            transactionInfo.getClass();
            this.apiVersion = i;
            this.apiVersionMinor = i2;
            this.allowedPaymentMethods = list;
            this.emailRequired = z;
            this.merchantInfo = merchantInfo;
            this.transactionInfo = transactionInfo;
        }

        public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, int i, int i2, List list, boolean z, MerchantInfo merchantInfo, TransactionInfo transactionInfo, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = paymentData.apiVersion;
            }
            if ((i3 & 2) != 0) {
                i2 = paymentData.apiVersionMinor;
            }
            if ((i3 & 4) != 0) {
                list = paymentData.allowedPaymentMethods;
            }
            if ((i3 & 8) != 0) {
                z = paymentData.emailRequired;
            }
            if ((i3 & 16) != 0) {
                merchantInfo = paymentData.merchantInfo;
            }
            if ((i3 & 32) != 0) {
                transactionInfo = paymentData.transactionInfo;
            }
            MerchantInfo merchantInfo2 = merchantInfo;
            TransactionInfo transactionInfo2 = transactionInfo;
            return paymentData.copy(i, i2, list, z, merchantInfo2, transactionInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getApiVersion() {
            return this.apiVersion;
        }

        /* renamed from: component2, reason: from getter */
        public final int getApiVersionMinor() {
            return this.apiVersionMinor;
        }

        public final List<AllowedPaymentMethod> component3() {
            return this.allowedPaymentMethods;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEmailRequired() {
            return this.emailRequired;
        }

        /* renamed from: component5, reason: from getter */
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final TransactionInfo getTransactionInfo() {
            return this.transactionInfo;
        }

        public final PaymentData copy(int apiVersion, int apiVersionMinor, List<AllowedPaymentMethod> allowedPaymentMethods, boolean emailRequired, MerchantInfo merchantInfo, TransactionInfo transactionInfo) {
            allowedPaymentMethods.getClass();
            merchantInfo.getClass();
            transactionInfo.getClass();
            return new PaymentData(apiVersion, apiVersionMinor, allowedPaymentMethods, emailRequired, merchantInfo, transactionInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentData)) {
                return false;
            }
            PaymentData paymentData = (PaymentData) other;
            return this.apiVersion == paymentData.apiVersion && this.apiVersionMinor == paymentData.apiVersionMinor && Intrinsics.areEqual(this.allowedPaymentMethods, paymentData.allowedPaymentMethods) && this.emailRequired == paymentData.emailRequired && Intrinsics.areEqual(this.merchantInfo, paymentData.merchantInfo) && Intrinsics.areEqual(this.transactionInfo, paymentData.transactionInfo);
        }

        public final List<AllowedPaymentMethod> getAllowedPaymentMethods() {
            return this.allowedPaymentMethods;
        }

        public final int getApiVersion() {
            return this.apiVersion;
        }

        public final int getApiVersionMinor() {
            return this.apiVersionMinor;
        }

        public final boolean getEmailRequired() {
            return this.emailRequired;
        }

        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        public final TransactionInfo getTransactionInfo() {
            return this.transactionInfo;
        }

        public int hashCode() {
            return this.transactionInfo.hashCode() + ((this.merchantInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.apiVersionMinor, Integer.hashCode(this.apiVersion) * 31, 31), 31, this.allowedPaymentMethods), 31, this.emailRequired)) * 31);
        }

        public String toString() {
            int i = this.apiVersion;
            int i2 = this.apiVersionMinor;
            List<AllowedPaymentMethod> list = this.allowedPaymentMethods;
            boolean z = this.emailRequired;
            MerchantInfo merchantInfo = this.merchantInfo;
            TransactionInfo transactionInfo = this.transactionInfo;
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "PaymentData(apiVersion=", ", apiVersionMinor=", ", allowedPaymentMethods=");
            m107m.append(list);
            m107m.append(", emailRequired=");
            m107m.append(z);
            m107m.append(", merchantInfo=");
            m107m.append(merchantInfo);
            m107m.append(", transactionInfo=");
            m107m.append(transactionInfo);
            m107m.append(")");
            return m107m.toString();
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod;", "", "CardParameters", "TokenizationSpecification", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AllowedPaymentMethod {
            public final CardParameters parameters;
            public final TokenizationSpecification tokenizationSpecification;

            /* renamed from: type, reason: collision with root package name */
            public final String f1140type;

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$TokenizationSpecification;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TokenizationSpecification {
                public final Map parameters;

                /* renamed from: type, reason: collision with root package name */
                public final String f1142type;

                public TokenizationSpecification(String str, Map map) {
                    this.f1142type = str;
                    this.parameters = map;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TokenizationSpecification)) {
                        return false;
                    }
                    TokenizationSpecification tokenizationSpecification = (TokenizationSpecification) obj;
                    return this.f1142type.equals(tokenizationSpecification.f1142type) && this.parameters.equals(tokenizationSpecification.parameters);
                }

                public final int hashCode() {
                    return this.parameters.hashCode() + (this.f1142type.hashCode() * 31);
                }

                public final String toString() {
                    return "TokenizationSpecification(type=" + this.f1142type + ", parameters=" + this.parameters + ")";
                }
            }

            public AllowedPaymentMethod(String str, CardParameters cardParameters, TokenizationSpecification tokenizationSpecification) {
                this.f1140type = str;
                this.parameters = cardParameters;
                this.tokenizationSpecification = tokenizationSpecification;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AllowedPaymentMethod)) {
                    return false;
                }
                AllowedPaymentMethod allowedPaymentMethod = (AllowedPaymentMethod) obj;
                return this.f1140type.equals(allowedPaymentMethod.f1140type) && this.parameters.equals(allowedPaymentMethod.parameters) && this.tokenizationSpecification.equals(allowedPaymentMethod.tokenizationSpecification);
            }

            public final int hashCode() {
                return this.tokenizationSpecification.hashCode() + ((this.parameters.hashCode() + (this.f1140type.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "AllowedPaymentMethod(type=" + this.f1140type + ", parameters=" + this.parameters + ", tokenizationSpecification=" + this.tokenizationSpecification + ")";
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$CardParameters;", "", "BillingAddressParameters", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class CardParameters {
                public final Boolean allowCreditCards;
                public final Boolean allowPrepaidCards;
                public final List allowedAuthMethods;
                public final List allowedCardNetworks;
                public final BillingAddressParameters billingAddressParameters;
                public final Boolean billingAddressRequired;

                public /* synthetic */ CardParameters(List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, BillingAddressParameters billingAddressParameters, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(list, list2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : billingAddressParameters);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CardParameters)) {
                        return false;
                    }
                    CardParameters cardParameters = (CardParameters) obj;
                    return Intrinsics.areEqual(this.allowedAuthMethods, cardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, cardParameters.allowedCardNetworks) && Intrinsics.areEqual(this.allowCreditCards, cardParameters.allowCreditCards) && Intrinsics.areEqual(this.allowPrepaidCards, cardParameters.allowPrepaidCards) && Intrinsics.areEqual(this.billingAddressRequired, cardParameters.billingAddressRequired) && Intrinsics.areEqual(this.billingAddressParameters, cardParameters.billingAddressParameters);
                }

                public final int hashCode() {
                    int m = Recorder$$ExternalSyntheticOutline2.m(this.allowedAuthMethods.hashCode() * 31, 31, this.allowedCardNetworks);
                    Boolean bool = this.allowCreditCards;
                    int hashCode = (m + (bool == null ? 0 : bool.hashCode())) * 31;
                    Boolean bool2 = this.allowPrepaidCards;
                    int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Boolean bool3 = this.billingAddressRequired;
                    int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
                    return hashCode3 + (billingAddressParameters != null ? billingAddressParameters.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = re$$ExternalSyntheticOutline0.m("CardParameters(allowedAuthMethods=", ", allowedCardNetworks=", ", allowCreditCards=", this.allowedAuthMethods, this.allowedCardNetworks);
                    Thread$State$EnumUnboxingLocalUtility.m(m, this.allowCreditCards, ", allowPrepaidCards=", this.allowPrepaidCards, ", billingAddressRequired=");
                    m.append(this.billingAddressRequired);
                    m.append(", billingAddressParameters=");
                    m.append(this.billingAddressParameters);
                    m.append(")");
                    return m.toString();
                }

                @JsonClass(generateAdapter = true)
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$CardParameters$BillingAddressParameters;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class BillingAddressParameters {

                    /* renamed from: format, reason: collision with root package name */
                    public final String f1141format;
                    public final Boolean phoneNumberRequired;

                    public BillingAddressParameters(String str, Boolean bool) {
                        str.getClass();
                        this.f1141format = str;
                        this.phoneNumberRequired = bool;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BillingAddressParameters)) {
                            return false;
                        }
                        BillingAddressParameters billingAddressParameters = (BillingAddressParameters) obj;
                        return Intrinsics.areEqual(this.f1141format, billingAddressParameters.f1141format) && Intrinsics.areEqual(this.phoneNumberRequired, billingAddressParameters.phoneNumberRequired);
                    }

                    public final int hashCode() {
                        int hashCode = this.f1141format.hashCode() * 31;
                        Boolean bool = this.phoneNumberRequired;
                        return hashCode + (bool == null ? 0 : bool.hashCode());
                    }

                    public final String toString() {
                        return "BillingAddressParameters(format=" + this.f1141format + ", phoneNumberRequired=" + this.phoneNumberRequired + ")";
                    }

                    public /* synthetic */ BillingAddressParameters(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, (i & 2) != 0 ? null : bool);
                    }
                }

                public CardParameters(List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, BillingAddressParameters billingAddressParameters) {
                    list.getClass();
                    list2.getClass();
                    this.allowedAuthMethods = list;
                    this.allowedCardNetworks = list2;
                    this.allowCreditCards = bool;
                    this.allowPrepaidCards = bool2;
                    this.billingAddressRequired = bool3;
                    this.billingAddressParameters = billingAddressParameters;
                }
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MerchantInfo {
            public final String merchantId;
            public final String merchantName;

            public MerchantInfo(String str, String str2) {
                str.getClass();
                this.merchantName = str;
                this.merchantId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MerchantInfo)) {
                    return false;
                }
                MerchantInfo merchantInfo = (MerchantInfo) obj;
                return Intrinsics.areEqual(this.merchantName, merchantInfo.merchantName) && Intrinsics.areEqual(this.merchantId, merchantInfo.merchantId);
            }

            public final int hashCode() {
                int hashCode = this.merchantName.hashCode() * 31;
                String str = this.merchantId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("MerchantInfo(merchantName=", this.merchantName, ", merchantId=", this.merchantId, ")");
            }

            public /* synthetic */ MerchantInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }
    }
}
