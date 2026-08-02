package com.squareup.cash.data;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.RequestPushNotificationsBlockerPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.RegisterAliasView;
import com.squareup.cash.blockers.views.UnselectableOptionView;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPaySheetAnalyticsContext;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.views.databinding.CardStylePerspectiveViewBinding;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseOpenOverflowMenu;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseOpenPaymentDetails;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseViewAccountInformationSheet;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseViewManageOrderInAfterpayHalfSheet;
import com.squareup.cash.cdf.cardspendinginsights.CardSpendingInsightsViewHome;
import com.squareup.cash.cdf.check.CheckDepositConfirm;
import com.squareup.cash.cdf.check.CheckDepositEnterAmount;
import com.squareup.cash.cdf.check.CheckDepositVerify;
import com.squareup.cash.cdf.instrument.InstrumentVerifyStart;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInViewImpression;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveStart;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.ConfirmBackOfCheckPresenter;
import com.squareup.cash.checks.ConfirmFrontOfCheckPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.routers.local.LocalRouter;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import com.squareup.cash.data.contacts.ContactModifiablePermissions;
import com.squareup.cash.data.contacts.ContactsSyncState;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.qrcodes.views.CashQrCameraXScannerView;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsParams;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.protos.cash.transfers.AddCashHalfSheetWithEntryParameters;
import com.squareup.protos.cash.transfers.AddMoneyParams;
import com.squareup.protos.cash.transfers.WithdrawParams;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.android.Keyboards;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class TemporaryStorage$getDir$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TemporaryStorage$getDir$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new TemporaryStorage$getDir$2((TemporaryStorage) obj2, continuation, 0);
            case 1:
                return new TemporaryStorage$getDir$2((ReferralCodePresenter) obj2, continuation, 1);
            case 2:
                return new TemporaryStorage$getDir$2((RequestPushNotificationsBlockerPresenter) obj2, continuation, 2);
            case 3:
                return new TemporaryStorage$getDir$2((LocalHomePresenter) obj2, continuation, 3);
            case 4:
                return new TemporaryStorage$getDir$2((EndAppLockPresenter) obj2, continuation, 4);
            case 5:
                return new TemporaryStorage$getDir$2((CashQrCameraXScannerView) obj2, continuation, 5);
            case 6:
                return new TemporaryStorage$getDir$2((RegisterAliasView) obj2, continuation, 6);
            case 7:
                return new TemporaryStorage$getDir$2((UnselectableOptionView) obj2, continuation, 7);
            case 8:
                return new TemporaryStorage$getDir$2((MusicPresenter) obj2, continuation, 8);
            case 9:
                return new TemporaryStorage$getDir$2((MusicPresenter) obj2, continuation, 9);
            case 10:
                return new TemporaryStorage$getDir$2((CardModelView) obj2, continuation, 10);
            case 11:
                return new TemporaryStorage$getDir$2((InteractiveCardView) obj2, continuation, 11);
            case 12:
                return new TemporaryStorage$getDir$2((StyledCardPerspectiveView) obj2, continuation, 12);
            case 13:
                return new TemporaryStorage$getDir$2((CardStudioPresenter) obj2, continuation, 13);
            case 14:
                return new TemporaryStorage$getDir$2((CardStudioPresenter) obj2, continuation, 14);
            case 15:
                return new TemporaryStorage$getDir$2((TagPoseController) obj2, continuation, 15);
            case 16:
                return new TemporaryStorage$getDir$2((CardLockPresenter) obj2, continuation, 16);
            case 17:
                return new TemporaryStorage$getDir$2((UiContainerKt$BottomSheet$1$sheetScope$1) obj2, continuation, 17);
            case 18:
                return new TemporaryStorage$getDir$2((CheckDepositAmountPresenter) obj2, continuation, 18);
            case 19:
                return new TemporaryStorage$getDir$2((ConfirmBackOfCheckPresenter) obj2, continuation, 19);
            case 20:
                return new TemporaryStorage$getDir$2((ConfirmFrontOfCheckPresenter) obj2, continuation, 20);
            case 21:
                return new TemporaryStorage$getDir$2((VerifyCheckDepositPresenter) obj2, continuation, 21);
            case 22:
                return new TemporaryStorage$getDir$2((LocalRouter) obj2, continuation, 22);
            case 23:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewFamilyAccountSponsor) obj2, continuation, 23);
            case 24:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewDependentWithParams) obj2, continuation, 24);
            case 25:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewProfileWithParams) obj2, continuation, 25);
            case 26:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewAddMoneyWithParams) obj2, continuation, 26);
            case 27:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewAddCashHalfSheetWithEntry) obj2, continuation, 27);
            case 28:
                return new TemporaryStorage$getDir$2((ClientRoute.ViewWithdrawWithParams) obj2, continuation, 28);
            default:
                return new TemporaryStorage$getDir$2((ContactModifiablePermissions) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((TemporaryStorage$getDir$2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((TemporaryStorage$getDir$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((TemporaryStorage$getDir$2) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockersData.AnalyticsData.Source source;
        BlockersData.AnalyticsData.Source source2;
        Event afterpayHubBrowseViewAccountInformationSheet;
        AfterpayHubBrowseOpenPaymentDetails.PaymentStatus paymentStatus;
        Event event;
        Throwable th;
        Throwable th2;
        int i = this.$r8$classId;
        int i2 = 2;
        Back back = Back.INSTANCE;
        int i3 = 3;
        ?? r6 = 0;
        Unit unit = null;
        Unit unit2 = null;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                File externalFilesDir = ((TemporaryStorage) obj2).context.getExternalFilesDir(null);
                File file = externalFilesDir == null ? null : new File(externalFilesDir, "temp-storage");
                if (file == null) {
                    return null;
                }
                File file2 = new File(file, Recorder$$ExternalSyntheticOutline2.m("bug-report-", new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US).format(new Date())));
                file2.mkdirs();
                return file2;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) obj2;
                BlockersScreens.ReferralCodeScreen referralCodeScreen = referralCodePresenter.args;
                if (referralCodePresenter.subscriptionTime != 0) {
                    Timber.Forest.w("Multiple subscriptions detected, analytics timestamp for previous\n                subscriptions will be skewed", new Object[0]);
                }
                referralCodePresenter.subscriptionTime = referralCodePresenter.clock.millis();
                Analytics analytics = referralCodePresenter.analytics;
                ClientScenario clientScenario = referralCodeScreen.blockersData.clientScenario;
                String name = clientScenario != null ? clientScenario.name() : null;
                BlockersData blockersData = referralCodeScreen.blockersData;
                String str = blockersData.flowToken;
                String name2 = blockersData.ratePlan.name();
                BlockersData.AnalyticsData analyticsData = referralCodeScreen.blockersData.analyticsData;
                analytics.track(new ReferralRewardReceiveStart(name, str, name2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName()), null);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RequestPushNotificationsBlockerPresenter requestPushNotificationsBlockerPresenter = (RequestPushNotificationsBlockerPresenter) obj2;
                requestPushNotificationsBlockerPresenter.analytics.track(new NotificationsOptInViewImpression(requestPushNotificationsBlockerPresenter.mapEntryPoint()), null);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                Analytics analytics2 = (Analytics) localHomePresenter.store;
                BlockersScreens.VerifyCardScreen verifyCardScreen = (BlockersScreens.VerifyCardScreen) localHomePresenter.tabContentPresenterFactory;
                ClientScenario clientScenario2 = verifyCardScreen.blockersData.clientScenario;
                String name3 = clientScenario2 != null ? clientScenario2.name() : null;
                BlockersData blockersData2 = verifyCardScreen.blockersData;
                String str2 = blockersData2.flowToken;
                String name4 = blockersData2.ratePlan.name();
                BlockersData.AnalyticsData analyticsData2 = verifyCardScreen.blockersData.analyticsData;
                analytics2.track(new InstrumentVerifyStart(name3, str2, name4, (analyticsData2 == null || (source2 = analyticsData2.source) == null) ? null : source2.getAnalyticsName()), null);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen = (BlockersScreens.TreehouseBlockerScreen) endAppLockPresenter.appLockState;
                Iterator it = treehouseBlockerScreen.askedQuestions.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((BlockersScreens.TreehouseBlockerQuestion) ((AskedQuestion) next).question).stackSize == treehouseBlockerScreen.stackSize) {
                            r6 = next;
                        }
                    }
                }
                AskedQuestion askedQuestion = (AskedQuestion) r6;
                if (askedQuestion == null) {
                    return Unit.INSTANCE;
                }
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                BetterNavigator betterNavigator = screenNavigator.this$0;
                String id = askedQuestion.getId();
                Screen screen = screenNavigator.ownerScreen;
                String str3 = screenNavigator.ownerStateKey;
                id.getClass();
                screen.getClass();
                str3.getClass();
                betterNavigator.enqueueNavigation(new Navigation.ScreenNavigation.ResetBefore(screen, id, str3));
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityCompat.requestPermissions(((AndroidPermissionManager) ((CashQrCameraXScannerView) obj2).cashVibrator).activity, AndroidPermissionManager.REQUEST_CAMERA, 2);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RegisterAliasView) obj2).vibrator.error();
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Keyboards.hideKeyboard((UnselectableOptionView) obj2);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                AfterPaySheetAnalyticsContext afterPaySheetAnalyticsContext = ((AfterPayInfoSheetScreen) musicPresenter.musicPlayer).analyticsContext;
                if (Intrinsics.areEqual(afterPaySheetAnalyticsContext, AfterPaySheetAnalyticsContext.AvailableCredit.INSTANCE)) {
                    afterpayHubBrowseViewAccountInformationSheet = new AfterpayHubBrowseViewAccountInformationSheet(AfterpayHubBrowseViewAccountInformationSheet.Information.AvailableCredit);
                } else {
                    if (afterPaySheetAnalyticsContext instanceof AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics) {
                        event = new AfterpayHubBrowseViewManageOrderInAfterpayHalfSheet(((AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics) afterPaySheetAnalyticsContext).orderId);
                    } else if (afterPaySheetAnalyticsContext instanceof AfterPaySheetAnalyticsContext.PaymentDetails) {
                        String str4 = ((AfterPaySheetAnalyticsContext.PaymentDetails) afterPaySheetAnalyticsContext).orderId;
                        switch (r10.paymentStatus) {
                            case SCHEDULED_PAYMENT_STATUS_UNSPECIFIED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.UNSPECIFIED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_OWED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.OWED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_PAID:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.PAID;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_OVERDUE:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.OVERDUE;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_REFUNDED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.REFUNDED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_DEFERRED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.DEFERRED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_PAYMENT_PENDING:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.PAYMENT_PENDING;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_PARTIALLY_REFUNDED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.PARTIALLY_REFUNDED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_CANCELED:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.CANCELED;
                                break;
                            case SCHEDULED_PAYMENT_STATUS_ON_HOLD:
                                paymentStatus = AfterpayHubBrowseOpenPaymentDetails.PaymentStatus.ON_HOLD;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        event = new AfterpayHubBrowseOpenPaymentDetails(str4, paymentStatus);
                    } else {
                        if (!Intrinsics.areEqual(afterPaySheetAnalyticsContext, AfterPaySheetAnalyticsContext.TotalOwed.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        afterpayHubBrowseViewAccountInformationSheet = new AfterpayHubBrowseViewAccountInformationSheet(AfterpayHubBrowseViewAccountInformationSheet.Information.TotalOwed);
                    }
                    afterpayHubBrowseViewAccountInformationSheet = event;
                }
                ((Analytics) musicPresenter.musicRepository).track(afterpayHubBrowseViewAccountInformationSheet, null);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MusicPresenter musicPresenter2 = (MusicPresenter) obj2;
                ((Analytics) musicPresenter2.musicRepository).track(new AfterpayHubBrowseOpenOverflowMenu(((OrderDetailsOverflowActionSheetScreen) musicPresenter2.musicPlayer).originScreen.orderId), null);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Context context = ((CardModelView) obj2).getContext();
                context.getClass();
                return CardsKt.cardShimmerGradient$default(context);
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InteractiveCardView interactiveCardView = (InteractiveCardView) obj2;
                interactiveCardView.postDelayed(new KnotView$$ExternalSyntheticLambda1(interactiveCardView, 23), 2000L);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StyledCardPerspectiveView styledCardPerspectiveView = (StyledCardPerspectiveView) obj2;
                ((CardStylePerspectiveViewBinding) styledCardPerspectiveView.binding$delegate.getValue()).styledCardView.setForeground(styledCardPerspectiveView.getDreamLights());
                ((CardStylePerspectiveViewBinding) styledCardPerspectiveView.binding$delegate.getValue()).nfcView.setColorFilter(ThemeHelpersKt.themeInfo(styledCardPerspectiveView).colorPalette.label);
                styledCardPerspectiveView.getPerspectiveView().setChildOffsetX((-((CardStylePerspectiveViewBinding) r10.getValue()).styledCardView.getWidth()) * 0.05f);
                styledCardPerspectiveView.getPerspectiveView().setForceCentered(false);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE);
                ofFloat.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, i2));
                ofFloat.setDuration(3000L);
                ofFloat.setStartDelay(1000L);
                ofFloat.start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                ofFloat2.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, i3));
                ofFloat2.setDuration(3000L);
                ofFloat2.setStartDelay(1000L);
                ofFloat2.start();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(8.0f, 70.0f, 8.0f);
                ofFloat3.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, 4));
                ofFloat3.setDuration(3000L);
                ofFloat3.setStartDelay(1000L);
                ofFloat3.start();
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-13.0f, -33.0f, -13.0f);
                ofFloat4.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, 5));
                ofFloat4.setDuration(3000L);
                ofFloat4.setStartDelay(1000L);
                ofFloat4.start();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(9.0f, 75.0f, 9.0f);
                ofFloat5.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, 6));
                ofFloat5.setDuration(3000L);
                ofFloat5.setStartDelay(1000L);
                ofFloat5.start();
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
                AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) localTabContentQueries.driver.newTransaction().getValue();
                transaction.getClass();
                AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
                try {
                    localTabContentQueries.deleteTemporaryState();
                    Unit unit3 = Unit.INSTANCE;
                    try {
                        transaction.successful = true;
                        transaction.endTransaction$runtime();
                        localTabContentQueries.postTransactionCleanup(transaction, transaction2, null, unit3);
                    } catch (Throwable th3) {
                        th = th3;
                        unit2 = unit3;
                        transaction.endTransaction$runtime();
                        localTabContentQueries.postTransactionCleanup(transaction, transaction2, th, unit2);
                        ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(back);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(back);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj2;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) cardStudioPresenter2.cardStudioQueries;
                AndroidSqliteDriver.Transaction transaction3 = (AndroidSqliteDriver.Transaction) localTabContentQueries2.driver.newTransaction().getValue();
                transaction3.getClass();
                AndroidSqliteDriver.Transaction transaction4 = transaction3.enclosingTransaction;
                try {
                    localTabContentQueries2.deleteTemporaryState();
                    Unit unit4 = Unit.INSTANCE;
                    try {
                        transaction3.successful = true;
                        transaction3.endTransaction$runtime();
                        localTabContentQueries2.postTransactionCleanup(transaction3, transaction4, null, unit4);
                    } catch (Throwable th5) {
                        th2 = th5;
                        unit = unit4;
                        transaction3.endTransaction$runtime();
                        localTabContentQueries2.postTransactionCleanup(transaction3, transaction4, th2, unit);
                        ((BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator).goTo(back);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                }
                ((BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator).goTo(back);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TagPoseController) obj2).setPose(WandPose.Float);
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((CardLockPresenter) obj2).analytics).track(new CardSpendingInsightsViewHome(), null);
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj2;
                if (uiContainerKt$BottomSheet$1$sheetScope$1 != null) {
                    JobKt.launch$default(uiContainerKt$BottomSheet$1$sheetScope$1.$scope, null, null, new RealSheetState$peek$3(uiContainerKt$BottomSheet$1$sheetScope$1.$state, r6, 10), 3);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CheckDepositAmountPresenter) obj2).analytics.track(new CheckDepositEnterAmount(null, null), null);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ConfirmBackOfCheckPresenter) obj2).analytics.track(new CheckDepositConfirm(CheckDepositConfirm.Side.BACK), null);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ConfirmFrontOfCheckPresenter) obj2).analytics.track(new CheckDepositConfirm(CheckDepositConfirm.Side.FRONT), null);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((VerifyCheckDepositPresenter) obj2).analytics.track(new CheckDepositVerify(null, CheckDepositVerify.State.START, 3), null);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LocalRouter) obj2).navigator.goTo(LocalTabScreen.INSTANCE);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter = Sponsor.ADAPTER;
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(((ClientRoute.ViewFamilyAccountSponsor) obj2).sponsorData);
                decodeBase64.getClass();
                return protoAdapter.decode(decodeBase64);
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter2 = DependentDetailsParams.ADAPTER;
                ByteString.Companion companion2 = ByteString.Companion;
                ByteString decodeBase642 = ByteString.Companion.decodeBase64(((ClientRoute.ViewDependentWithParams) obj2).dependentdetailsparams);
                decodeBase642.getClass();
                return protoAdapter2.decode(decodeBase642);
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter3 = AccountParams.ADAPTER;
                ByteString.Companion companion3 = ByteString.Companion;
                ByteString decodeBase643 = ByteString.Companion.decodeBase64(((ClientRoute.ViewProfileWithParams) obj2).profiledetailsparams);
                if (decodeBase643 != null) {
                    return protoAdapter3.decode(decodeBase643);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed to decode base64 profile details params");
                return null;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter4 = AddMoneyParams.ADAPTER;
                ByteString.Companion companion4 = ByteString.Companion;
                ByteString decodeBase644 = ByteString.Companion.decodeBase64(((ClientRoute.ViewAddMoneyWithParams) obj2).addmoneyparams);
                if (decodeBase644 != null) {
                    return protoAdapter4.decode(decodeBase644);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed to decode base64 add money params");
                return null;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter5 = AddCashHalfSheetWithEntryParameters.ADAPTER;
                ByteString.Companion companion5 = ByteString.Companion;
                ByteString decodeBase645 = ByteString.Companion.decodeBase64(((ClientRoute.ViewAddCashHalfSheetWithEntry) obj2).b64EncodedAddCashHalfSheetWithEntryParams);
                if (decodeBase645 != null) {
                    return protoAdapter5.decode(decodeBase645);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed to decode base64 add cash half sheet with entry params");
                return null;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProtoAdapter protoAdapter6 = WithdrawParams.ADAPTER;
                ByteString.Companion companion6 = ByteString.Companion;
                ByteString decodeBase646 = ByteString.Companion.decodeBase64(((ClientRoute.ViewWithdrawWithParams) obj2).withdrawparams);
                if (decodeBase646 != null) {
                    return protoAdapter6.decode(decodeBase646);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed to decode base64 withdraw params");
                return null;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ContactModifiablePermissions) obj2).contactsSyncPreference.set(ContactsSyncState.OFF);
                return Unit.INSTANCE;
        }
    }
}
