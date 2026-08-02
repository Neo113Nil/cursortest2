package com.squareup.cash.badging.db;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.loader.internal.cache.FileState;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cdf.featureeligibility.FeatureEligibilityRetrieveSucceeded;
import com.squareup.cash.cdf.featureeligibility.FeatureEligibilityRetrieveUnchanged;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import java.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import papa.internal.LaunchTracker;

/* loaded from: classes9.dex */
public final /* synthetic */ class BadgeQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ long f$4;

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda3(String str, String str2, FilesQueries filesQueries, long j, Long l) {
        this.$r8$classId = 1;
        FileState fileState = FileState.DIRTY;
        this.f$1 = str;
        this.f$0 = str2;
        this.f$2 = filesQueries;
        this.f$4 = j;
        this.f$3 = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        long j = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                Instant instant = (Instant) obj5;
                String str = (String) obj4;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj3;
                ItemType itemType = (ItemType) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).encode(instant)).longValue()) : null);
                androidStatement.bindString(1, str);
                androidStatement.bindString(2, (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(itemType));
                androidStatement.bindLong(3, Long.valueOf(j));
                break;
            case 1:
                FileState fileState = FileState.DIRTY;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, (String) obj4, 1, (String) obj5);
                androidStatement2.bindString(2, (String) ((EnumColumnAdapter) ((FilesQueries) obj3).filesAdapter.b).encode(fileState));
                androidStatement2.bindLong(3, 0L);
                androidStatement2.bindLong(4, Long.valueOf(j));
                androidStatement2.bindLong(5, (Long) obj2);
                break;
            case 2:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement3, 0, (String) obj4, 1, (String) obj5);
                androidStatement3.bindLong(2, Long.valueOf(j));
                androidStatement3.bindBytes(3, (byte[]) ((BlockersConfig.Adapter) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).target_balance_amountAdapter.encode((RewardSelection) obj2));
                break;
            case 3:
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) obj5;
                final String str2 = (String) obj4;
                GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj3;
                EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData = (EligibilityRefreshAnalyticsData) obj2;
                final InstrumentQueries instrumentQueries = realFeatureEligibilityRepository.eligibilityQueries;
                SingleAccountHolderEligibility singleAccountHolderEligibility = (SingleAccountHolderEligibility) instrumentQueries.eligibility(str2).executeAsOneOrNull();
                final C4bEligibilityState c4bEligibilityState = getC4bEligibilityResponse.money_btc_applet;
                final C4bEligibilityState c4bEligibilityState2 = getC4bEligibilityResponse.money_taxes_applet;
                final C4bEligibilityState c4bEligibilityState3 = getC4bEligibilityResponse.money_families_applet;
                final C4bEligibilityState c4bEligibilityState4 = getC4bEligibilityResponse.money_global_borrow_applet;
                final C4bEligibilityState c4bEligibilityState5 = getC4bEligibilityResponse.money_investing_applet;
                final C4bEligibilityState c4bEligibilityState6 = getC4bEligibilityResponse.money_tab_home_design_system;
                final C4bEligibilityState c4bEligibilityState7 = getC4bEligibilityResponse.cash_card_tab;
                final C4bEligibilityState c4bEligibilityState8 = getC4bEligibilityResponse.cash_offers_tab;
                final C4bEligibilityState c4bEligibilityState9 = getC4bEligibilityResponse.payment_send_as_gift_card;
                final C4bEligibilityState c4bEligibilityState10 = getC4bEligibilityResponse.payment_send_as_btc;
                final C4bEligibilityState c4bEligibilityState11 = getC4bEligibilityResponse.payment_send_as_stock;
                final C4bEligibilityState c4bEligibilityState12 = getC4bEligibilityResponse.payment_personal_to_c4b;
                final C4bEligibilityState c4bEligibilityState13 = getC4bEligibilityResponse.settings_tax_password_auth_app;
                final C4bEligibilityState c4bEligibilityState14 = getC4bEligibilityResponse.settings_invest_trusted_contact_app;
                final C4bEligibilityState c4bEligibilityState15 = getC4bEligibilityResponse.account_switcher;
                final C4bEligibilityState c4bEligibilityState16 = getC4bEligibilityResponse.activity_treehouse;
                final C4bEligibilityState c4bEligibilityState17 = getC4bEligibilityResponse.documents_btc;
                final C4bEligibilityState c4bEligibilityState18 = getC4bEligibilityResponse.documents_stock;
                final C4bEligibilityState c4bEligibilityState19 = getC4bEligibilityResponse.documents_taxes;
                final C4bEligibilityState c4bEligibilityState20 = getC4bEligibilityResponse.dda_tab;
                final C4bEligibilityState c4bEligibilityState21 = getC4bEligibilityResponse.remittance_send;
                final C4bEligibilityState c4bEligibilityState22 = getC4bEligibilityResponse.tap_to_pay_visibility;
                final C4bEligibilityState c4bEligibilityState23 = getC4bEligibilityResponse.sponsor_eligible_customer;
                final C4bEligibilityState c4bEligibilityState24 = getC4bEligibilityResponse.money_earnings_applet;
                final C4bEligibilityState c4bEligibilityState25 = getC4bEligibilityResponse.c4b_promotion_visibility;
                final C4bEligibilityState c4bEligibilityState26 = getC4bEligibilityResponse.moneybot_visibility;
                final C4bEligibilityState c4bEligibilityState27 = getC4bEligibilityResponse.personalized_ads_toggle;
                final C4bEligibilityState c4bEligibilityState28 = getC4bEligibilityResponse.pools_onboarding_visibility;
                final C4bEligibilityState c4bEligibilityState29 = getC4bEligibilityResponse.work_applet_visibility;
                final C4bEligibilityState c4bEligibilityState30 = getC4bEligibilityResponse.nearby_payment_feature_visibility;
                final C4bEligibilityState c4bEligibilityState31 = getC4bEligibilityResponse.bitcoin_auto_invest;
                final C4bEligibilityState c4bEligibilityState32 = getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility;
                instrumentQueries.getClass();
                SqlDriver sqlDriver = instrumentQueries.driver;
                final long j2 = this.f$4;
                sqlDriver.execute(-1875755168, "INSERT OR REPLACE INTO singleAccountHolderEligibility\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        AndroidStatement androidStatement4 = (AndroidStatement) obj6;
                        androidStatement4.getClass();
                        androidStatement4.bindString(0, str2);
                        androidStatement4.bindLong(1, Long.valueOf(j2));
                        C4bEligibilityState c4bEligibilityState33 = c4bEligibilityState;
                        InstrumentQueries instrumentQueries2 = instrumentQueries;
                        androidStatement4.bindBytes(2, c4bEligibilityState33 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyBtcAppletAdapter.encode(c4bEligibilityState33) : null);
                        C4bEligibilityState c4bEligibilityState34 = c4bEligibilityState2;
                        androidStatement4.bindBytes(3, c4bEligibilityState34 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyTaxesAppletAdapter.encode(c4bEligibilityState34) : null);
                        C4bEligibilityState c4bEligibilityState35 = c4bEligibilityState3;
                        androidStatement4.bindBytes(4, c4bEligibilityState35 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyFamiliesAppletAdapter.encode(c4bEligibilityState35) : null);
                        C4bEligibilityState c4bEligibilityState36 = c4bEligibilityState4;
                        androidStatement4.bindBytes(5, c4bEligibilityState36 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyGlobalBorrowAppletAdapter.encode(c4bEligibilityState36) : null);
                        C4bEligibilityState c4bEligibilityState37 = c4bEligibilityState5;
                        androidStatement4.bindBytes(6, c4bEligibilityState37 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyInvestingAppletAdapter.encode(c4bEligibilityState37) : null);
                        C4bEligibilityState c4bEligibilityState38 = c4bEligibilityState6;
                        androidStatement4.bindBytes(7, c4bEligibilityState38 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyTabHomeDesignSystemAdapter.encode(c4bEligibilityState38) : null);
                        C4bEligibilityState c4bEligibilityState39 = c4bEligibilityState7;
                        androidStatement4.bindBytes(8, c4bEligibilityState39 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).cashCardTabAdapter.encode(c4bEligibilityState39) : null);
                        C4bEligibilityState c4bEligibilityState40 = c4bEligibilityState8;
                        androidStatement4.bindBytes(9, c4bEligibilityState40 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).cashOffersTabAdapter.encode(c4bEligibilityState40) : null);
                        C4bEligibilityState c4bEligibilityState41 = c4bEligibilityState9;
                        androidStatement4.bindBytes(10, c4bEligibilityState41 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).paymentSendAsGiftCardAdapter.encode(c4bEligibilityState41) : null);
                        C4bEligibilityState c4bEligibilityState42 = c4bEligibilityState10;
                        androidStatement4.bindBytes(11, c4bEligibilityState42 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).paymentSendAsBtcAdapter.encode(c4bEligibilityState42) : null);
                        C4bEligibilityState c4bEligibilityState43 = c4bEligibilityState11;
                        androidStatement4.bindBytes(12, c4bEligibilityState43 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).paymentSendAsStockAdapter.encode(c4bEligibilityState43) : null);
                        C4bEligibilityState c4bEligibilityState44 = c4bEligibilityState12;
                        androidStatement4.bindBytes(13, c4bEligibilityState44 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).paymentPersonalToC4bAdapter.encode(c4bEligibilityState44) : null);
                        C4bEligibilityState c4bEligibilityState45 = c4bEligibilityState13;
                        androidStatement4.bindBytes(14, c4bEligibilityState45 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).settingsTaxPasswordAuthAppAdapter.encode(c4bEligibilityState45) : null);
                        C4bEligibilityState c4bEligibilityState46 = c4bEligibilityState14;
                        androidStatement4.bindBytes(15, c4bEligibilityState46 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).settingsInvestTrustedContactAppAdapter.encode(c4bEligibilityState46) : null);
                        C4bEligibilityState c4bEligibilityState47 = c4bEligibilityState15;
                        androidStatement4.bindBytes(16, c4bEligibilityState47 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).accountSwitcherAdapter.encode(c4bEligibilityState47) : null);
                        C4bEligibilityState c4bEligibilityState48 = c4bEligibilityState16;
                        androidStatement4.bindBytes(17, c4bEligibilityState48 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).activityTreehouseAdapter.encode(c4bEligibilityState48) : null);
                        C4bEligibilityState c4bEligibilityState49 = c4bEligibilityState17;
                        androidStatement4.bindBytes(18, c4bEligibilityState49 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).documentsBtcAdapter.encode(c4bEligibilityState49) : null);
                        C4bEligibilityState c4bEligibilityState50 = c4bEligibilityState18;
                        androidStatement4.bindBytes(19, c4bEligibilityState50 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).documentsStockAdapter.encode(c4bEligibilityState50) : null);
                        C4bEligibilityState c4bEligibilityState51 = c4bEligibilityState19;
                        androidStatement4.bindBytes(20, c4bEligibilityState51 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).documentsTaxesAdapter.encode(c4bEligibilityState51) : null);
                        C4bEligibilityState c4bEligibilityState52 = c4bEligibilityState20;
                        androidStatement4.bindBytes(21, c4bEligibilityState52 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).dda_tabAdapter.encode(c4bEligibilityState52) : null);
                        C4bEligibilityState c4bEligibilityState53 = c4bEligibilityState21;
                        androidStatement4.bindBytes(22, c4bEligibilityState53 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).remittanceSendAdapter.encode(c4bEligibilityState53) : null);
                        C4bEligibilityState c4bEligibilityState54 = c4bEligibilityState22;
                        androidStatement4.bindBytes(23, c4bEligibilityState54 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).tapToPayAdapter.encode(c4bEligibilityState54) : null);
                        C4bEligibilityState c4bEligibilityState55 = c4bEligibilityState23;
                        androidStatement4.bindBytes(24, c4bEligibilityState55 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).sponsorEligibleAdapter.encode(c4bEligibilityState55) : null);
                        C4bEligibilityState c4bEligibilityState56 = c4bEligibilityState24;
                        androidStatement4.bindBytes(25, c4bEligibilityState56 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneyEarningsAppletAdapter.encode(c4bEligibilityState56) : null);
                        C4bEligibilityState c4bEligibilityState57 = c4bEligibilityState25;
                        androidStatement4.bindBytes(26, c4bEligibilityState57 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).c4bPromotionVisibilityAdapter.encode(c4bEligibilityState57) : null);
                        C4bEligibilityState c4bEligibilityState58 = c4bEligibilityState26;
                        androidStatement4.bindBytes(27, c4bEligibilityState58 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).moneybotVisibilityAdapter.encode(c4bEligibilityState58) : null);
                        C4bEligibilityState c4bEligibilityState59 = c4bEligibilityState27;
                        androidStatement4.bindBytes(28, c4bEligibilityState59 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).personalizedAdsToggleAdapter.encode(c4bEligibilityState59) : null);
                        C4bEligibilityState c4bEligibilityState60 = c4bEligibilityState28;
                        androidStatement4.bindBytes(29, c4bEligibilityState60 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).poolsOnboardingVisibilityAdapter.encode(c4bEligibilityState60) : null);
                        C4bEligibilityState c4bEligibilityState61 = c4bEligibilityState29;
                        androidStatement4.bindBytes(30, c4bEligibilityState61 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).workAppletVisibilityAdapter.encode(c4bEligibilityState61) : null);
                        C4bEligibilityState c4bEligibilityState62 = c4bEligibilityState30;
                        androidStatement4.bindBytes(31, c4bEligibilityState62 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).nearbyPaymentFeatureVisibilityAdapter.encode(c4bEligibilityState62) : null);
                        C4bEligibilityState c4bEligibilityState63 = c4bEligibilityState31;
                        androidStatement4.bindBytes(32, c4bEligibilityState63 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).bitcoinAutoInvestAdapter.encode(c4bEligibilityState63) : null);
                        C4bEligibilityState c4bEligibilityState64 = c4bEligibilityState32;
                        androidStatement4.bindBytes(33, c4bEligibilityState64 != null ? (byte[]) ((SingleAccountHolderEligibility.Adapter) instrumentQueries2.instrumentAdapter).recurringP2pPaymentFeatureVisibilityAdapter.encode(c4bEligibilityState64) : null);
                        return Unit.INSTANCE;
                    }
                });
                instrumentQueries.notifyQueries(-1875755168, new ProfileQueries$$ExternalSyntheticLambda4(13));
                boolean areEqual = Intrinsics.areEqual(singleAccountHolderEligibility != null ? RealFeatureEligibilityRepository.access$toEligibleFeatureSet(realFeatureEligibilityRepository, singleAccountHolderEligibility) : EmptySet.INSTANCE, RealFeatureEligibilityRepository.access$toEligibleFeatureSet(realFeatureEligibilityRepository, (SingleAccountHolderEligibility) instrumentQueries.eligibility(str2).executeAsOne()));
                Analytics analytics = realFeatureEligibilityRepository.analytics;
                if (areEqual) {
                    analytics.track(new FeatureEligibilityRetrieveUnchanged(eligibilityRefreshAnalyticsData != null ? Long.valueOf(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null), null);
                } else {
                    analytics.track(new FeatureEligibilityRetrieveSucceeded(eligibilityRefreshAnalyticsData != null ? Long.valueOf(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null), null);
                }
                break;
            case 4:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindLong(0, (Long) obj5);
                androidStatement4.bindBytes(1, (byte[]) ((BlockersConfig.Adapter) ((GpsConfigQueries) obj4).gpsConfigAdapter).target_balance_amountAdapter.encode((OffersTabSearchResponse) obj3));
                androidStatement4.bindLong(2, (Long) obj2);
                androidStatement4.bindLong(3, Long.valueOf(j));
                break;
            case 5:
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj4;
                CameraProperties cameraProperties = (CameraProperties) obj;
                cameraProperties.getClass();
                ((StatefulWorkflow.RenderContext) obj5).$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow, new BadgeQueries$$ExternalSyntheticLambda3(selfieWorkflow, (SelfieWorkflow.Input) obj3, (SelfieState.WaitForCameraFeed) obj2, cameraProperties, this.f$4, 6)));
                break;
            case 6:
                SelfieWorkflow selfieWorkflow2 = (SelfieWorkflow) obj5;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj4;
                SelfieState.WaitForCameraFeed waitForCameraFeed = (SelfieState.WaitForCameraFeed) obj3;
                CameraProperties cameraProperties2 = (CameraProperties) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                VideoCaptureMethod videoCaptureMethod = selfieWorkflow2.videoCaptureMethod(input);
                TrackingEventsLogger trackingEventsLogger = selfieWorkflow2.trackingEventsLogger;
                VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Stream;
                long j3 = this.f$4;
                if (videoCaptureMethod == videoCaptureMethod2) {
                    TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, "webrtc", null, null, 8, null), false, 2, null);
                    updater.state = new SelfieState.WaitForWebRtcSetup(input.videoCaptureConfig.webRtcJwt, cameraProperties2, j3, SelfieWorkflowUtilsKt.createBackState(updater, false), waitForCameraFeed.posesNeeded, input.poseConfigs, true, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled);
                } else {
                    if (updater.state instanceof SelfieState.WaitForCameraFeed) {
                        SelfieCaptureState selfieCaptureState = SelfieCaptureState.IDLE;
                        Selfie.Pose pose = (Selfie.Pose) CollectionsKt.firstOrNull(waitForCameraFeed.posesNeeded);
                        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, null, pose != null ? pose.name() : null, null, 8, null), false, 2, null);
                    }
                    Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.first(waitForCameraFeed.posesNeeded);
                    Selfie.Pose pose3 = Selfie.Pose.Center;
                    List list = waitForCameraFeed.posesNeeded;
                    updater.state = pose2 == pose3 ? new SelfieState.StartCapture(null, RecyclerView.DECELERATION_RATE, null, list, null, System.currentTimeMillis(), j3, cameraProperties2, SelfieWorkflowUtilsKt.createBackState(updater, false), input.poseConfigs, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) : new SelfieState.ShowPoseHint(EmptyList.INSTANCE, list, true, cameraProperties2, j3, SelfieWorkflowUtilsKt.createBackState(updater, false), input.poseConfigs, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled);
                }
                break;
            default:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj5;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) ((EnumColumnAdapter) ((LaunchTracker) gpsConfigQueries.gpsConfigAdapter).appLaunchedCallback).encode((CurrencyCode) obj4));
                LaunchTracker launchTracker = (LaunchTracker) gpsConfigQueries.gpsConfigAdapter;
                androidStatement5.bindString(1, (String) ((EnumColumnAdapter) launchTracker.lastAppBecameInvisibleRealtimeMillis).encode((CurrencyCode) obj3));
                androidStatement5.bindBytes(2, (byte[]) ((WireRepeatedAdapter) launchTracker.launchInProgress).encode((List) obj2));
                androidStatement5.bindLong(3, Long.valueOf(j));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = j;
    }

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda3(String str, String str2, long j, LocalTabContentQueries localTabContentQueries, RewardSelection rewardSelection) {
        this.$r8$classId = 2;
        this.f$1 = str;
        this.f$0 = str2;
        this.f$4 = j;
        this.f$2 = localTabContentQueries;
        this.f$3 = rewardSelection;
    }

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda3(RealFeatureEligibilityRepository realFeatureEligibilityRepository, String str, long j, GetC4bEligibilityResponse getC4bEligibilityResponse, EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData) {
        this.$r8$classId = 3;
        this.f$0 = realFeatureEligibilityRepository;
        this.f$1 = str;
        this.f$4 = j;
        this.f$2 = getC4bEligibilityResponse;
        this.f$3 = eligibilityRefreshAnalyticsData;
    }
}
