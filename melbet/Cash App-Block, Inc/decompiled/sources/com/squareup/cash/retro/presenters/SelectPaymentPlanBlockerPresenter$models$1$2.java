package com.squareup.cash.retro.presenters;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.core.text.TextUtilsCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.settings.viewmodels.PersonalizedAdsSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsChangeSetting;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.ProfileNotificationsRepository$ThresholdType;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.views.PoolGoalMetKt$PoolGoalMet$1$1$1;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.presenters.ReferralStatusPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.screens.ArcadeAutofillSettingsScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewEvent$DoneClicked;
import com.squareup.cash.profile.views.NotificationOptionsView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$PromotionsListState;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.qrcodes.presenters.QrCodeProfilePresenter;
import com.squareup.cash.recurringpayments.presenters.RealSelectCadencePresenter;
import com.squareup.cash.recurringpayments.presenters.RealSelectDayOfCadencePresenter;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.widget.amount.AmountDisplayKt$AmountDisplay$1$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.access.sync_values.OTPInfo;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsRequest;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SelectPaymentPlanBlockerPresenter$models$1$2 extends SuspendLambda implements Function2 {
    public Object $blockerData$delegate;
    public final /* synthetic */ Object $footerConfirmButtonState$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectPaymentPlanBlockerPresenter$models$1$2(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$footerConfirmButtonState$delegate = obj;
        this.$blockerData$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$footerConfirmButtonState$delegate;
        switch (i) {
            case 0:
                return new SelectPaymentPlanBlockerPresenter$models$1$2((SelectPaymentPlanBlockerPresenter) this.this$0, (MutableState) this.$blockerData$delegate, (MutableState) obj2, continuation, 0);
            case 1:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$2 = new SelectPaymentPlanBlockerPresenter$models$1$2((TabToolbarPresenter) obj2, continuation, 1);
                selectPaymentPlanBlockerPresenter$models$1$2.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$2;
            case 2:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$22 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (KybBannerPresenter) obj2, 2);
                selectPaymentPlanBlockerPresenter$models$1$22.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$22;
            case 3:
                return new SelectPaymentPlanBlockerPresenter$models$1$2((RealGenericProfileElementsPresenter) this.this$0, (MutableState) obj2, continuation);
            case 4:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$23 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (ReferralStatusPresenter) obj2, 4);
                selectPaymentPlanBlockerPresenter$models$1$23.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$23;
            case 5:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$24 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (ErrorPresenter) obj2, 5);
                selectPaymentPlanBlockerPresenter$models$1$24.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$24;
            case 6:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$25 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InviteErrorPresenter) obj2, 6);
                selectPaymentPlanBlockerPresenter$models$1$25.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$25;
            case 7:
                return new SelectPaymentPlanBlockerPresenter$models$1$2(7, (MutableState) this.$blockerData$delegate, (TaxReturnsPresenter) this.this$0, (AdjustableThresholdViewEvent$DoneClicked) obj2, continuation);
            case 8:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$26 = new SelectPaymentPlanBlockerPresenter$models$1$2((PaymentLoadingPresenter) obj2, continuation, 8);
                selectPaymentPlanBlockerPresenter$models$1$26.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$26;
            case 9:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$27 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (ProfileNotificationsPresenter) obj2, 9);
                selectPaymentPlanBlockerPresenter$models$1$27.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$27;
            case 10:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$28 = new SelectPaymentPlanBlockerPresenter$models$1$2((ProfileNotificationsPresenter) obj2, continuation, 10);
                selectPaymentPlanBlockerPresenter$models$1$28.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$28;
            case 11:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$29 = new SelectPaymentPlanBlockerPresenter$models$1$2((PdfPreviewPresenter) obj2, (MutableState) this.$blockerData$delegate, continuation);
                selectPaymentPlanBlockerPresenter$models$1$29.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$29;
            case 12:
                return new SelectPaymentPlanBlockerPresenter$models$1$2((PoolsListPresenter) this.this$0, (MutableState) this.$blockerData$delegate, (MutableState) obj2, continuation, 12);
            case 13:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$210 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InviteErrorPresenter) obj2, 13);
                selectPaymentPlanBlockerPresenter$models$1$210.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$210;
            case 14:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$211 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InviteErrorPresenter) obj2, 14);
                selectPaymentPlanBlockerPresenter$models$1$211.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$211;
            case 15:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$212 = new SelectPaymentPlanBlockerPresenter$models$1$2((LocalCashBalancePresenter) obj2, continuation, 15);
                selectPaymentPlanBlockerPresenter$models$1$212.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$212;
            case 16:
                return new SelectPaymentPlanBlockerPresenter$models$1$2(16, (MutableState) this.$blockerData$delegate, (LocalHomePresenter) this.this$0, (PersonalizedAdsSectionViewEvent) obj2, continuation);
            case 17:
                return new SelectPaymentPlanBlockerPresenter$models$1$2(17, (MutableState) this.$blockerData$delegate, (LocalEditorialPresenter) this.this$0, (SearchPrivacySectionViewEvent) obj2, continuation);
            case 18:
                return new SelectPaymentPlanBlockerPresenter$models$1$2((LocalEditorialPresenter) this.this$0, (MutableState) this.$blockerData$delegate, (MutableState) obj2, continuation, 18);
            case 19:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$213 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InvestingContactPresenter) obj2, 19);
                selectPaymentPlanBlockerPresenter$models$1$213.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$213;
            case 20:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$214 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InvestingContactPresenter) obj2, 20);
                selectPaymentPlanBlockerPresenter$models$1$214.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$214;
            case 21:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$215 = new SelectPaymentPlanBlockerPresenter$models$1$2((Uri) this.$blockerData$delegate, (NotificationOptionsView) obj2, continuation);
                selectPaymentPlanBlockerPresenter$models$1$215.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$215;
            case 22:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$216 = new SelectPaymentPlanBlockerPresenter$models$1$2((CardLockPresenter) obj2, continuation, 22);
                selectPaymentPlanBlockerPresenter$models$1$216.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$216;
            case 23:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$217 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (TaxReturnsPresenter) obj2, 23);
                selectPaymentPlanBlockerPresenter$models$1$217.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$217;
            case 24:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$218 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (LocalEditorialPresenter) obj2, 24);
                selectPaymentPlanBlockerPresenter$models$1$218.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$218;
            case 25:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$219 = new SelectPaymentPlanBlockerPresenter$models$1$2((QrCodeProfilePresenter) obj2, continuation, 25);
                selectPaymentPlanBlockerPresenter$models$1$219.$blockerData$delegate = obj;
                return selectPaymentPlanBlockerPresenter$models$1$219;
            case 26:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$220 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (InviteErrorPresenter) obj2, 26);
                selectPaymentPlanBlockerPresenter$models$1$220.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$220;
            case 27:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$221 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (RealSelectCadencePresenter) obj2, 27);
                selectPaymentPlanBlockerPresenter$models$1$221.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$221;
            case 28:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$222 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (RealSelectDayOfCadencePresenter) obj2, 28);
                selectPaymentPlanBlockerPresenter$models$1$222.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$222;
            default:
                SelectPaymentPlanBlockerPresenter$models$1$2 selectPaymentPlanBlockerPresenter$models$1$223 = new SelectPaymentPlanBlockerPresenter$models$1$2((Flow) this.$blockerData$delegate, continuation, (WorkHomePresenter) obj2, 29);
                selectPaymentPlanBlockerPresenter$models$1$223.this$0 = obj;
                return selectPaymentPlanBlockerPresenter$models$1$223;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((SelectPaymentPlanBlockerPresenter$models$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x0770, code lost:
    
        if (r0.emit(r1, r21) == r3) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0751, code lost:
    
        if (r4 == r3) goto L347;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object selectPaymentPlanBlockerSubmit;
        Object first;
        Object access$getCustomerProfileData;
        MutableState mutableState;
        ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType;
        ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType2;
        Long l;
        String str;
        NotificationCategory notificationCategory;
        Object loadAccounts;
        Object access$loadAccountSelectorAccounts;
        Object access$toRatePlanButtonTreatment;
        Object privacySettings;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String string2;
        Object access$getPromotionsHomeDataOrNull;
        Object obj2;
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 3;
        int i4 = 8;
        int i5 = 9;
        int i6 = 11;
        int i7 = 7;
        Object obj3 = this.$footerConfirmButtonState$delegate;
        boolean z = true;
        z = true;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) obj3;
                SelectPaymentPlanBlockerPresenter selectPaymentPlanBlockerPresenter = (SelectPaymentPlanBlockerPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = selectPaymentPlanBlockerPresenter.navigator;
                BlockersScreens.SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen = selectPaymentPlanBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = ((SelectPaymentPlanBlocker) ((MutableState) this.$blockerData$delegate).getValue()).current_payment_option_token;
                    str2.getClass();
                    this.label = 1;
                    LendingAppService lendingAppService = selectPaymentPlanBlockerPresenter.lendingAppService;
                    ClientScenario clientScenario = selectPaymentPlanBlockerScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    BlockersData blockersData = selectPaymentPlanBlockerScreen.blockersData;
                    selectPaymentPlanBlockerSubmit = lendingAppService.selectPaymentPlanBlockerSubmit(clientScenario, blockersData.flowToken, new SelectPaymentPlanBlockerSubmitRequest(new SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption(new SelectPaymentPlanBlockerSubmitRequest.ConfirmOption(str2, ByteString.EMPTY)), blockersData.requestContext), this);
                    if (selectPaymentPlanBlockerSubmit == coroutineSingletons) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    selectPaymentPlanBlockerSubmit = obj;
                }
                ApiResult apiResult = (ApiResult) selectPaymentPlanBlockerSubmit;
                if (apiResult instanceof ApiResult.Success) {
                    SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) ((ApiResult.Success) apiResult).response;
                    mutableState2.setValue(new SelectPaymentPlanViewModel.ButtonState.Loaded(true));
                    BlockersData blockersData2 = selectPaymentPlanBlockerScreen.blockersData;
                    ResponseContext responseContext = selectPaymentPlanBlockerSubmitResponse.response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(selectPaymentPlanBlockerPresenter.blockersDataNavigator.getNext(selectPaymentPlanBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                }
                if (apiResult instanceof ApiResult.Failure) {
                    mutableState2.setValue(new SelectPaymentPlanViewModel.ButtonState.Loaded(true));
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(selectPaymentPlanBlockerPresenter.stringManager, (ApiResult.Failure) apiResult, null);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(selectPaymentPlanBlockerScreen.blockersData, errorMessaging.message, errorMessaging.title));
                }
                break;
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JCAContext jCAContext = (JCAContext) ((TabToolbarPresenter) obj3).familyNavigatorFactory;
                    this.$blockerData$delegate = null;
                    this.this$0 = flowCollector;
                    this.label = 1;
                    first = FlowKt.first(((SyncValueReader) jCAContext.provider).getFirstValueOrDefault(AndroidSyncValueSpecs.OtpInfo, null, new SyncRangeQueries$$ExternalSyntheticLambda1(18)), this);
                    break;
                } else if (i9 == 1) {
                    flowCollector = (FlowCollector) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                } else if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                OTPInfo oTPInfo = (OTPInfo) first;
                Boolean valueOf = Boolean.valueOf(oTPInfo != null ? Intrinsics.areEqual(oTPInfo.otp_enabled, Boolean.TRUE) : false);
                this.$blockerData$delegate = null;
                this.this$0 = null;
                this.label = 2;
                break;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$1 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope, (KybBannerPresenter) obj3, 24);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(poolGoalMetKt$PoolGoalMet$1$1$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) obj3;
                    RealGenericProfileElementsPresenter realGenericProfileElementsPresenter = (RealGenericProfileElementsPresenter) this.this$0;
                    this.$blockerData$delegate = mutableState3;
                    this.label = 1;
                    access$getCustomerProfileData = RealGenericProfileElementsPresenter.access$getCustomerProfileData(realGenericProfileElementsPresenter, this);
                    if (access$getCustomerProfileData == coroutineSingletons4) {
                        break;
                    } else {
                        mutableState = mutableState3;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = (MutableState) this.$blockerData$delegate;
                    SafeTrace.throwOnFailure(obj);
                    access$getCustomerProfileData = obj;
                }
                mutableState.setValue((CustomerProfileData) access$getCustomerProfileData);
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$12 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope2, (ReferralStatusPresenter) obj3, 25);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(poolGoalMetKt$PoolGoalMet$1$1$12, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$13 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope3, (ErrorPresenter) obj3, 26);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(poolGoalMetKt$PoolGoalMet$1$1$13, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$14 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope4, (InviteErrorPresenter) obj3, 27);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(poolGoalMetKt$PoolGoalMet$1$1$14, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                AdjustableThresholdViewEvent$DoneClicked adjustableThresholdViewEvent$DoneClicked = (AdjustableThresholdViewEvent$DoneClicked) obj3;
                MutableState mutableState4 = (MutableState) this.$blockerData$delegate;
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.this$0;
                ProfileScreens.AdjustableThresholdScreen adjustableThresholdScreen = (ProfileScreens.AdjustableThresholdScreen) taxReturnsPresenter.router;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState4.setValue(Boolean.TRUE);
                    ((Analytics) taxReturnsPresenter.args).track(new NotificationsSettingsChangeSetting((String) adjustableThresholdScreen.accountToken.getValue(), zzaky.getChannelListSettingsPage(adjustableThresholdScreen.notificationCategory), String.valueOf(adjustableThresholdScreen.currentValue), String.valueOf(adjustableThresholdViewEvent$DoneClicked.value), null), null);
                    RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                    int i16 = adjustableThresholdViewEvent$DoneClicked.value;
                    NotificationCategory notificationCategory2 = adjustableThresholdScreen.notificationCategory;
                    List list = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
                    notificationCategory2.getClass();
                    int ordinal = notificationCategory2.ordinal();
                    if (ordinal == 7 || ordinal == 9) {
                        profileNotificationsRepository$ThresholdType = ProfileNotificationsRepository$ThresholdType.STOCK;
                    } else if (ordinal != 11) {
                        profileNotificationsRepository$ThresholdType2 = null;
                        l = adjustableThresholdScreen.version == null ? new Long(r5.intValue()) : null;
                        str = (String) adjustableThresholdScreen.accountToken.getValue();
                        notificationCategory = adjustableThresholdScreen.notificationCategory;
                        this.label = 1;
                        if (JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new AmountDisplayKt$AmountDisplay$1$1(profileNotificationsRepository$ThresholdType2, i16, realProfileNotificationsRepository, str, notificationCategory, l, (Continuation) null), this) == coroutineSingletons8) {
                            break;
                        }
                    } else {
                        profileNotificationsRepository$ThresholdType = ProfileNotificationsRepository$ThresholdType.BITCOIN;
                    }
                    profileNotificationsRepository$ThresholdType2 = profileNotificationsRepository$ThresholdType;
                    if (adjustableThresholdScreen.version == null) {
                    }
                    str = (String) adjustableThresholdScreen.accountToken.getValue();
                    notificationCategory = adjustableThresholdScreen.notificationCategory;
                    this.label = 1;
                    if (JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new AmountDisplayKt$AmountDisplay$1$1(profileNotificationsRepository$ThresholdType2, i16, realProfileNotificationsRepository, str, notificationCategory, l, (Continuation) null), this) == coroutineSingletons8) {
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState4.setValue(Boolean.FALSE);
                NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator);
                break;
            case 8:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) ((PaymentLoadingPresenter) obj3).paymentNavigator;
                    this.$blockerData$delegate = null;
                    this.this$0 = produceStateScope;
                    this.label = 1;
                    loadAccounts = realAccountholderAccountRepository.loadAccounts(this);
                    if (loadAccounts == coroutineSingletons9) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    loadAccounts = obj;
                }
                produceStateScope.setValue(loadAccounts);
                break;
            case 9:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$15 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope5, (ProfileNotificationsPresenter) obj3, 28);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(poolGoalMetKt$PoolGoalMet$1$1$15, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$blockerData$delegate = null;
                    this.this$0 = produceStateScope2;
                    this.label = 1;
                    access$loadAccountSelectorAccounts = ProfileNotificationsPresenter.access$loadAccountSelectorAccounts((ProfileNotificationsPresenter) obj3, this);
                    if (access$loadAccountSelectorAccounts == coroutineSingletons11) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope2 = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$loadAccountSelectorAccounts = obj;
                }
                produceStateScope2.setValue(access$loadAccountSelectorAccounts);
                break;
            case 11:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj3;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope6, null, null, new ShoppingWebBridge.AnonymousClass1(pdfPreviewPresenter, continuation, i4), 3);
                    AppLockMonitor$special$$inlined$map$2 all = ((RealProfileAliasRepository) pdfPreviewPresenter.args).all();
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(z ? 1 : 0, (MutableState) this.$blockerData$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    Object collect = all.collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(shareSheetPresenter$models$1$1$5, 21), this);
                    if (collect != coroutineSingletons12) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons12) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) ((MutableState) this.$blockerData$delegate).getValue();
                    String str3 = ((ArcadeAutofillSettingsScreen) poolsListPresenter.moneyFormatter).shippingAddressId;
                    String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) poolsListPresenter.sessionManager);
                    MutableState mutableState5 = (MutableState) obj3;
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(4, mutableState5);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(7, mutableState5);
                    this.label = 1;
                    if (PoolsListPresenter.access$submitUpdatedInfo(poolsListPresenter, autofillCombinedInfo, str3, activeAccountToken, shiftNotePresenter$models$1$1, quickPayViewKt$QuickPay$1$1$1$2$1$3$1, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$blockerData$delegate;
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$16 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope7, (InviteErrorPresenter) obj3, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(poolGoalMetKt$PoolGoalMet$1$1$16, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651(coroutineScope8, (InviteErrorPresenter) obj3, z ? 1 : 0);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(c00651, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj3;
                    RealAccountRatePlanManager realAccountRatePlanManager = (RealAccountRatePlanManager) localCashBalancePresenter.launcher;
                    this.$blockerData$delegate = null;
                    this.this$0 = produceStateScope3;
                    this.label = 1;
                    access$toRatePlanButtonTreatment = LocalCashBalancePresenter.access$toRatePlanButtonTreatment(localCashBalancePresenter, realAccountRatePlanManager, this);
                    if (access$toRatePlanButtonTreatment == coroutineSingletons16) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope3 = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$toRatePlanButtonTreatment = obj;
                }
                produceStateScope3.setValue(access$toRatePlanButtonTreatment);
                break;
            case 16:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                    boolean z2 = ((PersonalizedAdsSectionViewEvent.ToggleSetting) ((PersonalizedAdsSectionViewEvent) obj3)).isChecked;
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12 = new ShiftNotePresenter$models$1$1(5, (MutableState) this.$blockerData$delegate);
                    this.label = 1;
                    shiftNotePresenter$models$1$12.invoke(Boolean.valueOf(z2));
                    Object withContext = JobKt.withContext((CoroutineContext) localHomePresenter.neighborhoodsTabContentEnabled$delegate, new RoomDatabase$performClear$1(localHomePresenter, z2, shiftNotePresenter$models$1$12, (Continuation) null, 18), this);
                    Object obj5 = withContext;
                    if (withContext != obj4) {
                        obj5 = Unit.INSTANCE;
                    }
                    if (obj5 == obj4) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$13 = new ShiftNotePresenter$models$1$1(6, (MutableState) this.$blockerData$delegate);
                    this.label = 1;
                    if (LocalEditorialPresenter.access$handleSettingChanged((LocalEditorialPresenter) this.this$0, (SearchPrivacySectionViewEvent.SettingToggled) ((SearchPrivacySectionViewEvent) obj3), shiftNotePresenter$models$1$13, this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) ((LocalEditorialPresenter) this.this$0).launcher;
                    GetSearchPrivacySettingsRequest getSearchPrivacySettingsRequest = new GetSearchPrivacySettingsRequest(ByteString.EMPTY);
                    this.label = 1;
                    privacySettings = customerSearchClientService.getPrivacySettings(getSearchPrivacySettingsRequest, this);
                    if (privacySettings == coroutineSingletons18) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    privacySettings = obj;
                }
                ApiResult apiResult2 = (ApiResult) privacySettings;
                if (apiResult2 instanceof ApiResult.Success) {
                    MutableState mutableState6 = (MutableState) this.$blockerData$delegate;
                    GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) ((ApiResult.Success) apiResult2).response;
                    mutableState6.setValue(getSearchPrivacySettingsResponse);
                    MutableState mutableState7 = (MutableState) obj3;
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType = SearchPrivacySectionViewEvent.SearchSettingType.NAME;
                    GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = getSearchPrivacySettingsResponse.search_by_name;
                    Pair pair = new Pair(searchSettingType, Boolean.valueOf((booleanSetting == null || (bool3 = booleanSetting.setting_value) == null) ? true : bool3.booleanValue()));
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType2 = SearchPrivacySectionViewEvent.SearchSettingType.PHONE_NUMBER;
                    GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting2 = getSearchPrivacySettingsResponse.search_by_phone;
                    Pair pair2 = new Pair(searchSettingType2, Boolean.valueOf((booleanSetting2 == null || (bool2 = booleanSetting2.setting_value) == null) ? true : bool2.booleanValue()));
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType3 = SearchPrivacySectionViewEvent.SearchSettingType.EMAIL;
                    GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting3 = getSearchPrivacySettingsResponse.search_by_email;
                    if (booleanSetting3 != null && (bool = booleanSetting3.setting_value) != null) {
                        z = bool.booleanValue();
                    }
                    mutableState7.setValue(MapsKt__MapsKt.mutableMapOf(pair, pair2, new Pair(searchSettingType3, Boolean.valueOf(z))));
                }
                break;
            case 19:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006512 = new RingtoneView.AnonymousClass1.C00651(coroutineScope9, (InvestingContactPresenter) obj3, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(c006512, this) == coroutineSingletons19) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006513 = new RingtoneView.AnonymousClass1.C00651(coroutineScope10, (InvestingContactPresenter) obj3, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(c006513, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                Uri uri = (Uri) this.$blockerData$delegate;
                NotificationOptionsView notificationOptionsView = (NotificationOptionsView) obj3;
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ringtone ringtone = uri == null ? null : RingtoneManager.getRingtone(notificationOptionsView.getContext(), uri);
                    if (ringtone == null || (string2 = ringtone.getTitle(notificationOptionsView.getContext())) == null) {
                        string2 = notificationOptionsView.getContext().getString(R.string.notification_options_ringtone_none);
                        string2.getClass();
                    }
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector2.emit(string2, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                ProduceStateScope produceStateScope4 = (ProduceStateScope) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$blockerData$delegate = null;
                    this.this$0 = produceStateScope4;
                    this.label = 1;
                    access$getPromotionsHomeDataOrNull = CardLockPresenter.access$getPromotionsHomeDataOrNull((CardLockPresenter) obj3, this);
                    if (access$getPromotionsHomeDataOrNull == coroutineSingletons22) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope4 = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$getPromotionsHomeDataOrNull = obj;
                }
                produceStateScope4.setValue(new PromotionsReferralsHomePresenter$PromotionsListState((PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel) access$getPromotionsHomeDataOrNull, true));
                break;
            case 23:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006514 = new RingtoneView.AnonymousClass1.C00651(coroutineScope11, (TaxReturnsPresenter) obj3, i7);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(c006514, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$blockerData$delegate;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(16, coroutineScope12, (LocalEditorialPresenter) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                ProduceStateScope produceStateScope5 = (ProduceStateScope) this.$blockerData$delegate;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = ((QrCodeProfilePresenter) obj3).paymentPadThemeSelection;
                    this.$blockerData$delegate = null;
                    this.this$0 = produceStateScope5;
                    this.label = 1;
                    obj2 = keyValue.get(this);
                    if (obj2 == coroutineSingletons25) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope5 = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                produceStateScope5.setValue(PaymentPadTheme.valueOf((String) obj2));
                break;
            case 26:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006515 = new RingtoneView.AnonymousClass1.C00651(coroutineScope13, (InviteErrorPresenter) obj3, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(c006515, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006516 = new RingtoneView.AnonymousClass1.C00651(coroutineScope14, (RealSelectCadencePresenter) obj3, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(c006516, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006517 = new RingtoneView.AnonymousClass1.C00651(coroutineScope15, (RealSelectDayOfCadencePresenter) obj3, 10);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow14.collect(c006517, this) == coroutineSingletons28) {
                        break;
                    }
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$blockerData$delegate;
                    RingtoneView.AnonymousClass1.C00651 c006518 = new RingtoneView.AnonymousClass1.C00651(coroutineScope16, (WorkHomePresenter) obj3, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow15.collect(c006518, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentPlanBlockerPresenter$models$1$2(Uri uri, NotificationOptionsView notificationOptionsView, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 21;
        this.$blockerData$delegate = uri;
        this.$footerConfirmButtonState$delegate = notificationOptionsView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectPaymentPlanBlockerPresenter$models$1$2(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$blockerData$delegate = mutableState;
        this.$footerConfirmButtonState$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectPaymentPlanBlockerPresenter$models$1$2(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$footerConfirmButtonState$delegate = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentPlanBlockerPresenter$models$1$2(PdfPreviewPresenter pdfPreviewPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$footerConfirmButtonState$delegate = pdfPreviewPresenter;
        this.$blockerData$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentPlanBlockerPresenter$models$1$2(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.this$0 = realGenericProfileElementsPresenter;
        this.$footerConfirmButtonState$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectPaymentPlanBlockerPresenter$models$1$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockerData$delegate = flow;
        this.$footerConfirmButtonState$delegate = moleculePresenter;
    }
}
