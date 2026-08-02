package com.squareup.cash.shopping.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.R;
import com.squareup.cash.cdf.asset.AssetSendViewSchedulePaymentScreen;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.Session;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SessionStatus;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ShoppingWebPresenter$models$17$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $addressAutofillEnabled;
    public final /* synthetic */ Object $cardFieldsDetectedFlow$delegate;
    public final /* synthetic */ Object $defaultShippingAddressResponse$delegate;
    public final /* synthetic */ Object $lastDetectedAddress1Field$delegate;
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object $state$delegate;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$17$1(SessionQueries sessionQueries, String str, String str2, String str3, Session session, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$state$delegate = sessionQueries;
        this.$defaultShippingAddressResponse$delegate = str;
        this.$lastDetectedAddress1Field$delegate = str2;
        this.$cardFieldsDetectedFlow$delegate = str3;
        this.this$0 = session;
        this.$addressAutofillEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$state$delegate;
        Object obj3 = this.this$0;
        Object obj4 = this.$cardFieldsDetectedFlow$delegate;
        Object obj5 = this.$lastDetectedAddress1Field$delegate;
        Object obj6 = this.$defaultShippingAddressResponse$delegate;
        switch (i) {
            case 0:
                return new ShoppingWebPresenter$models$17$1(this.$addressAutofillEnabled, (MutableState) obj2, (MutableState) obj6, (ShoppingWebPresenter) obj3, (MutableState) obj5, (MutableState) obj4, continuation);
            case 1:
                return new ShoppingWebPresenter$models$17$1((ShareSheetPresenter) obj2, (String) obj6, this.$addressAutofillEnabled, (PaymentScheduleFrequency) obj5, (LocalDate) obj4, (LocalDate) obj3, continuation);
            case 2:
                return new ShoppingWebPresenter$models$17$1((SessionQueries) obj2, (String) obj6, (String) obj5, (String) obj4, (Session) obj3, this.$addressAutofillEnabled, continuation);
            default:
                return new ShoppingWebPresenter$models$17$1((RealSheetState) obj6, this.$addressAutofillEnabled, (Function0) obj5, (Function0) obj4, (State) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebPresenter$models$17$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1 A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ShippingAddress shippingAddress;
        String str5;
        String str6;
        SessionStatus sessionStatus;
        int i = this.$r8$classId;
        boolean z = this.$addressAutofillEnabled;
        Object obj2 = this.$cardFieldsDetectedFlow$delegate;
        Object obj3 = this.$lastDetectedAddress1Field$delegate;
        Object obj4 = this.$defaultShippingAddressResponse$delegate;
        Object obj5 = this.this$0;
        Object obj6 = this.$state$delegate;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) obj5;
                AndroidStringManager androidStringManager = shoppingWebPresenter.stringManager;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj6;
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                if (!((ShoppingWebPresenter.State) mutableState2.getValue()).onCheckout) {
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 520093695));
                } else if (z) {
                    RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) ((MutableState) obj4).getValue();
                    if (retrieveDefaultShippingAddressResponse != null && (shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address) != null) {
                        if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue() || !ShoppingWebPresenter.access$isComplete(shoppingWebPresenter, shippingAddress)) {
                            shippingAddress = null;
                        }
                        if (shippingAddress != null) {
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            FullName fullName = shippingAddress.full_name;
                            if (fullName != null && (str6 = fullName.given_name) != null) {
                                createListBuilder.add(str6);
                            }
                            GlobalAddress globalAddress = shippingAddress.global_address;
                            if (globalAddress != null && (str5 = globalAddress.address_line_1) != null) {
                                createListBuilder.add(StringsKt___StringsKt.take(7, str5));
                            }
                            str2 = CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder), " ", null, null, 0, null, null, 62).concat("...");
                            str3 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.lastFourDigits;
                            if (str3 != null) {
                                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                    str3 = null;
                                }
                                if (str3 != null) {
                                    if (((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.isSup) {
                                        str4 = androidStringManager.get(R.string.one_time_card_button_text);
                                    } else {
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        str4 = new MessageFormat(resources.getString(R.string.card_number_button_text)).format(new Object[]{str3});
                                        str4.getClass();
                                    }
                                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, (str4 == null || str2 != null) ? new AutofillFooterViewModel(str4, null, str2, 2) : null, false, null, 520093695));
                                }
                            }
                            str4 = null;
                            mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, (str4 == null || str2 != null) ? new AutofillFooterViewModel(str4, null, str2, 2) : null, false, null, 520093695));
                        }
                    }
                    str2 = null;
                    str3 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.lastFourDigits;
                    if (str3 != null) {
                    }
                    str4 = null;
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, (str4 == null || str2 != null) ? new AutofillFooterViewModel(str4, null, str2, 2) : null, false, null, 520093695));
                } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                    String str7 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.lastFourDigits;
                    if (str7 == null) {
                        str = null;
                    } else if (((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.isSup) {
                        str = androidStringManager.get(R.string.one_time_card_button_text);
                    } else {
                        Resources resources2 = androidStringManager.resources;
                        resources2.getClass();
                        str = new MessageFormat(resources2.getString(R.string.card_number_button_text)).format(new Object[]{str7});
                        str.getClass();
                    }
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, str != null ? new AutofillFooterViewModel(str, (((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth == null || ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear == null) ? null : Recorder$$ExternalSyntheticOutline2.m(((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth, "/", ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear), null, 4) : null, false, null, 520093695));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj6;
                Analytics analytics = (Analytics) shareSheetPresenter.analytics;
                String str8 = (String) obj4;
                PaymentScreens.SchedulePayment schedulePayment = (PaymentScreens.SchedulePayment) shareSheetPresenter.modelUpdates;
                String str9 = schedulePayment.flowToken;
                Origin origin = schedulePayment.origin;
                PaymentScheduleFrequency paymentScheduleFrequency = (PaymentScheduleFrequency) obj3;
                int between = (int) ChronoUnit.DAYS.between((LocalDate) obj2, (LocalDate) obj5);
                CashInstrumentType cashInstrumentType = schedulePayment.selectedInstrumentType;
                str8.getClass();
                paymentScheduleFrequency.getClass();
                analytics.track(new AssetSendViewSchedulePaymentScreen(str8, str9, origin, Boolean.valueOf(z), AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency), Integer.valueOf(between), cashInstrumentType != null ? AnalyticsHelperKt.toCdfInstrumentType(cashInstrumentType) : null), null);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionQueries sessionQueries = (SessionQueries) obj6;
                Session session = (Session) obj5;
                QueryResult execute = sessionQueries.driver.execute(989843811, "UPDATE session\nSET\n  app_token = ?,\n  account_token = ?,\n  target_account_token = ?,\n  session_token = ?,\n  session_status = ?,\n  onboarded = ?\nWHERE id = 1", new SessionQueries$$ExternalSyntheticLambda0((String) obj4, (String) obj3, (String) obj2, session != null ? session.token : null, (session == null || (sessionStatus = session.status) == null) ? null : new Long(sessionStatus.value), this.$addressAutofillEnabled));
                sessionQueries.notifyQueries(989843811, new SessionQueries$$ExternalSyntheticLambda1(null == true ? 1 : 0, null == true ? 1 : 0));
                return execute;
            default:
                MutableState mutableState3 = (MutableState) obj6;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) ((State) obj5).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                boolean z2 = ((double) ((RealSheetState) obj4).getExpandProgress()) > 0.5d;
                if (!Intrinsics.areEqual((Boolean) mutableState3.getValue(), Boolean.valueOf(z2))) {
                    mutableState3.setValue(Boolean.valueOf(z2));
                    if (z2 && !z) {
                        ((Function0) obj3).invoke();
                    } else if (!z2 && z) {
                        ((Function0) obj2).invoke();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$17$1(ShareSheetPresenter shareSheetPresenter, String str, boolean z, PaymentScheduleFrequency paymentScheduleFrequency, LocalDate localDate, LocalDate localDate2, Continuation continuation) {
        super(2, continuation);
        this.$state$delegate = shareSheetPresenter;
        this.$defaultShippingAddressResponse$delegate = str;
        this.$addressAutofillEnabled = z;
        this.$lastDetectedAddress1Field$delegate = paymentScheduleFrequency;
        this.$cardFieldsDetectedFlow$delegate = localDate;
        this.this$0 = localDate2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$17$1(RealSheetState realSheetState, boolean z, Function0 function0, Function0 function02, State state, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$defaultShippingAddressResponse$delegate = realSheetState;
        this.$addressAutofillEnabled = z;
        this.$lastDetectedAddress1Field$delegate = function0;
        this.$cardFieldsDetectedFlow$delegate = function02;
        this.this$0 = state;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebPresenter$models$17$1(boolean z, MutableState mutableState, MutableState mutableState2, ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$addressAutofillEnabled = z;
        this.$state$delegate = mutableState;
        this.$defaultShippingAddressResponse$delegate = mutableState2;
        this.this$0 = shoppingWebPresenter;
        this.$lastDetectedAddress1Field$delegate = mutableState3;
        this.$cardFieldsDetectedFlow$delegate = mutableState4;
    }
}
