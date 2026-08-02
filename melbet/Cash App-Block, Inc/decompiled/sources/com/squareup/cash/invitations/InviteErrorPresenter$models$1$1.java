package com.squareup.cash.invitations;

import android.nfc.NfcAdapter;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import coil3.disk.DiskLruCache;
import coil3.disk.RealDiskCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewOpenPersonalization;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.asset.AssetPoolCreatePoolStart;
import com.squareup.cash.cdf.asset.AssetPoolViewMemberList;
import com.squareup.cash.cdf.asset.AssetRequestLoadingStarted;
import com.squareup.cash.cdf.asset.AssetRequestReceiveWarning;
import com.squareup.cash.cdf.asset.AssetSendLoadingStarted;
import com.squareup.cash.cdf.asset.AssetSendReceiveWarning;
import com.squareup.cash.cdf.asset.PoolViewerType;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletViewViewLeaflet;
import com.squareup.cash.cdf.benefitleaflet.BenefitType;
import com.squareup.cash.cdf.browser.BrowserViewOpenRedemptionSheet;
import com.squareup.cash.cdf.contact.ContactInviteViewError;
import com.squareup.cash.cdf.localization.LocalizationViewLanguageDisclosure;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentGetPaidReceivedMultiplePaymentsLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentStillLookingMoreInfoPageLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentStillLookingNotSeeingPersonHalfSheetView;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewSettings;
import com.squareup.cash.cdf.p2pallowlist.P2PAllowListViewStart;
import com.squareup.cash.cdf.p2pblocklist.P2PBlockListViewStart;
import com.squareup.cash.cdf.passkey.PasskeyViewManagementScreen;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nfc.presenters.NfcNotAvailablePresenter;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.paymentpad.presenters.RealLowDiskSpaceAlertManager;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentRecipientPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.performance.AggregatingScrollPerformanceTracker;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.performance.ScrollEventData;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteErrorPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteErrorPresenter$models$1$1(Object obj, Continuation continuation, int i) {
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
                return new InviteErrorPresenter$models$1$1((InviteErrorPresenter) obj2, continuation, 0);
            case 1:
                return new InviteErrorPresenter$models$1$1((RealKeyStoreProvider) obj2, continuation, 1);
            case 2:
                return new InviteErrorPresenter$models$1$1((LocalCashBalancePresenter) obj2, continuation, 2);
            case 3:
                return new InviteErrorPresenter$models$1$1((CashMapPresenter) obj2, continuation, 3);
            case 4:
                return new InviteErrorPresenter$models$1$1((VerifyCheckDialogPresenter) obj2, continuation, 4);
            case 5:
                return new InviteErrorPresenter$models$1$1((MoneyTabPresenter) obj2, continuation, 5);
            case 6:
                return new InviteErrorPresenter$models$1$1((NfcNotAvailablePresenter) obj2, continuation, 6);
            case 7:
                return new InviteErrorPresenter$models$1$1((RealOffersTabRepository) obj2, continuation, 7);
            case 8:
                return new InviteErrorPresenter$models$1$1((LocalCashBalancePresenter) obj2, continuation, 8);
            case 9:
                return new InviteErrorPresenter$models$1$1((DisclosurePresenter) obj2, continuation, 9);
            case 10:
                return new InviteErrorPresenter$models$1$1((LocalHomePresenter) obj2, continuation, 10);
            case 11:
                return new InviteErrorPresenter$models$1$1((TaxReturnsPresenter) obj2, continuation, 11);
            case 12:
                return new InviteErrorPresenter$models$1$1((CardLockPresenter) obj2, continuation, 12);
            case 13:
                return new InviteErrorPresenter$models$1$1((LocalCashBalancePresenter) obj2, continuation, 13);
            case 14:
                return new InviteErrorPresenter$models$1$1((WorkHomePresenter) obj2, continuation, 14);
            case 15:
                return new InviteErrorPresenter$models$1$1((RealLowDiskSpaceAlertManager) obj2, continuation, 15);
            case 16:
                return new InviteErrorPresenter$models$1$1((MainPaymentPresenter) obj2, continuation, 16);
            case 17:
                return new InviteErrorPresenter$models$1$1((TaxReturnsPresenter) obj2, continuation, 17);
            case 18:
                return new InviteErrorPresenter$models$1$1((ParcelableSnapshotMutableLongState) obj2, continuation, 18);
            case 19:
                return new InviteErrorPresenter$models$1$1((TaxReturnsPresenter) obj2, continuation, 19);
            case 20:
                return new InviteErrorPresenter$models$1$1((TaxReturnsPresenter) obj2, continuation, 20);
            case 21:
                return new InviteErrorPresenter$models$1$1((TaxReturnsPresenter) obj2, continuation, 21);
            case 22:
                return new InviteErrorPresenter$models$1$1((PaymentLoadingPresenter) obj2, continuation, 22);
            case 23:
                return new InviteErrorPresenter$models$1$1((PersonalizePaymentRecipientPresenter) obj2, continuation, 23);
            case 24:
                return new InviteErrorPresenter$models$1$1((InviteErrorPresenter) obj2, continuation, 24);
            case 25:
                return new InviteErrorPresenter$models$1$1((AggregatingScrollPerformanceTracker) obj2, continuation, 25);
            case 26:
                return new InviteErrorPresenter$models$1$1((JankStatsAggregator) obj2, continuation, 26);
            case 27:
                return new InviteErrorPresenter$models$1$1((PoolMemberListPresenter) obj2, continuation, 27);
            case 28:
                return new InviteErrorPresenter$models$1$1((StartPoolPresenter) obj2, continuation, 28);
            default:
                return new InviteErrorPresenter$models$1$1((ChannelListPresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 26:
                ((InviteErrorPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((InviteErrorPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Lazy lazy;
        int i = 2;
        int i2 = 0;
        boolean z = true;
        char c = 1;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((InviteErrorPresenter) this.this$0).analytics).track(new ContactInviteViewError(), null);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Certificate certificate = ((KeyStore) ((RealKeyStoreProvider) this.this$0).keyStore.delegate).getCertificate("TTP-wrapping-key");
                certificate.getClass();
                return certificate;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
                ((Analytics) localCashBalancePresenter.analytics).track(new LocalizationViewLanguageDisclosure(((Locale) ((RealLocaleManager) localCashBalancePresenter.screen).resolvedLocale.$$delegate_0.getValue()).toLanguageTag()), null);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashMapPresenter cashMapPresenter = (CashMapPresenter) this.this$0;
                cashMapPresenter.navigator.goTo(cashMapPresenter.locationDeniedScreen);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((VerifyCheckDialogPresenter) this.this$0).navigator).track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.MCF_ERROR_DIALOG, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MoneyTabPresenter) this.this$0).moneyContentSpanTrackingService.endInitialLoadingStateSpan();
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NfcNotAvailablePresenter nfcNotAvailablePresenter = (NfcNotAvailablePresenter) this.this$0;
                NfcAdapter nfcAdapter = (NfcAdapter) nfcNotAvailablePresenter.nfcManager.nfcAdapter$delegate.getValue();
                if (nfcAdapter != null && nfcAdapter.isEnabled()) {
                    nfcNotAvailablePresenter.navigator.goTo(nfcNotAvailablePresenter.screen.nextScreen);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = ((RealOffersTabRepository) this.this$0).cashDatabase.offersRecentlyViewedQueries;
                OffersAvatarKt$$ExternalSyntheticLambda0 offersAvatarKt$$ExternalSyntheticLambda0 = new OffersAvatarKt$$ExternalSyntheticLambda0(c == true ? 1 : 0);
                gpsConfigQueries.getClass();
                SqlDriver sqlDriver = gpsConfigQueries.driver;
                MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda6 = new MusicViewKt$$ExternalSyntheticLambda6(18, offersAvatarKt$$ExternalSyntheticLambda0, gpsConfigQueries);
                sqlDriver.getClass();
                return new SimpleQuery(-1735401891, new String[]{"offersRecentlyViewed"}, sqlDriver, "OffersRecentlyViewed.sq", "selectAll", "SELECT token, type, last_updated\nFROM offersRecentlyViewed\nORDER BY last_updated DESC", musicViewKt$$ExternalSyntheticLambda6).executeAsList();
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealOffersAnalytics) ((LocalCashBalancePresenter) this.this$0).timestampFormatter).clearCache();
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((DisclosurePresenter) this.this$0).analytics).track(new BenefitLeafletViewViewLeaflet(BenefitType.CUSTOM_WEEKLY_OFFERS), null);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBoostSyncer realBoostSyncer = (RealBoostSyncer) ((BoostSyncer) ((LocalHomePresenter) this.this$0).clearMarketingBadgesIfNeeded);
                JobKt.launch$default(realBoostSyncer.scope, null, null, new RealBoostSyncer$refresh$1(realBoostSyncer, z, (Continuation) null, i2), 3);
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.this$0;
                Analytics analytics = (Analytics) taxReturnsPresenter.args;
                OffersScreen$OffersRedemptionScreen offersScreen$OffersRedemptionScreen = (OffersScreen$OffersRedemptionScreen) taxReturnsPresenter.router;
                analytics.track(new BrowserViewOpenRedemptionSheet(offersScreen$OffersRedemptionScreen.origin, offersScreen$OffersRedemptionScreen.infoContext, offersScreen$OffersRedemptionScreen.referrerFlowToken, offersScreen$OffersRedemptionScreen.entityToken, offersScreen$OffersRedemptionScreen.entryUrl), null);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardLockPresenter) this.this$0).navigateToFailureScreen();
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalCashBalancePresenter localCashBalancePresenter2 = (LocalCashBalancePresenter) this.this$0;
                P2PListScreen p2PListScreen = (P2PListScreen) localCashBalancePresenter2.service;
                boolean z2 = p2PListScreen.screenMode instanceof P2PScreenMode.AllowList;
                Analytics analytics2 = (Analytics) localCashBalancePresenter2.analytics;
                if (z2) {
                    analytics2.track(new P2PAllowListViewStart(p2PListScreen.forCustomerToken), null);
                } else {
                    analytics2.track(new P2PBlockListViewStart(p2PListScreen.forCustomerToken, null), null);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealPasskeyAnalytics) ((WorkHomePresenter) this.this$0).payPresenter).analytics.track(new PasskeyViewManagementScreen(), null);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealDiskCache realDiskCache = (RealDiskCache) ((RealLowDiskSpaceAlertManager) this.this$0).imageLoader.options.diskCacheLazy.getValue();
                if (realDiskCache != null) {
                    DiskLruCache diskLruCache = realDiskCache.cache;
                    synchronized (diskLruCache.lock) {
                        try {
                            diskLruCache.initialize();
                            for (DiskLruCache.Entry entry : (DiskLruCache.Entry[]) diskLruCache.lruEntries.values().toArray(new DiskLruCache.Entry[0])) {
                                diskLruCache.removeEntry(entry);
                            }
                            diskLruCache.mostRecentTrimFailed = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ((RealLowDiskSpaceAlertManager) this.this$0).observabilityManager.addAction(new com.squareup.kotterknife.Lazy(11));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((MainPaymentPresenter) this.this$0).hideSections;
                Boolean valueOf = Boolean.valueOf(!r0.args.isFiatPayment);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, valueOf);
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter2 = (TaxReturnsPresenter) this.this$0;
                Analytics analytics3 = (Analytics) taxReturnsPresenter2.args;
                String str = ((PaymentScreens.NearbyPayRequestHelp) taxReturnsPresenter2.router).flowToken;
                if (str == null) {
                    str = "";
                }
                analytics3.track(new NearbyPaymentStillLookingNotSeeingPersonHalfSheetView(str), null);
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableLongState) this.this$0).setLongValue(0L);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter3 = (TaxReturnsPresenter) this.this$0;
                PaymentScreens.NearbyPayersSheet nearbyPayersSheet = (PaymentScreens.NearbyPayersSheet) taxReturnsPresenter3.router;
                int size = ((List) nearbyPayersSheet.payers.getValue()).size();
                Analytics analytics4 = (Analytics) taxReturnsPresenter3.args;
                Long l = nearbyPayersSheet.totalAmountCents;
                String str2 = nearbyPayersSheet.flowToken;
                Long valueOf2 = Long.valueOf(l != null ? l.longValue() : 0L);
                Integer valueOf3 = Integer.valueOf(size);
                if (str2 == null) {
                    str2 = "";
                }
                analytics4.track(new NearbyPaymentGetPaidReceivedMultiplePaymentsLand(valueOf3, valueOf2, str2), null);
                String str3 = nearbyPayersSheet.flowToken;
                analytics4.track(new NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand(Integer.valueOf(size), str3 != null ? str3 : ""), null);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter4 = (TaxReturnsPresenter) this.this$0;
                Analytics analytics5 = (Analytics) taxReturnsPresenter4.args;
                String str4 = ((PaymentScreens.NearbyPaymentsInfo) taxReturnsPresenter4.router).flowToken;
                if (str4 == null) {
                    str4 = "";
                }
                analytics5.track(new NearbyPaymentStillLookingMoreInfoPageLand(str4), null);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter5 = (TaxReturnsPresenter) this.this$0;
                PaymentScreens.NoteRequired noteRequired = (PaymentScreens.NoteRequired) taxReturnsPresenter5.router;
                Orientation orientation = noteRequired.orientation;
                if (orientation != null) {
                    Analytics analytics6 = (Analytics) taxReturnsPresenter5.args;
                    boolean z3 = noteRequired.isAmountFirst;
                    int i3 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                    if (i3 == 1) {
                        PaymentAssetType paymentAssetType = PaymentAssetType.CASH;
                        AssetSendReceiveWarning.PaymentFlow paymentFlow = z3 ? AssetSendReceiveWarning.PaymentFlow.AMOUNT_FIRST : AssetSendReceiveWarning.PaymentFlow.PERSON_FIRST;
                        AssetSendReceiveWarning.WarningType warningType = AssetSendReceiveWarning.WarningType.NO_INITIATOR_NOTE;
                        analytics6.track(new AssetSendReceiveWarning(paymentFlow), null);
                    } else {
                        if (i3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        PaymentAssetType paymentAssetType2 = PaymentAssetType.CASH;
                        AssetRequestReceiveWarning.PaymentFlow paymentFlow2 = z3 ? AssetRequestReceiveWarning.PaymentFlow.AMOUNT_FIRST : AssetRequestReceiveWarning.PaymentFlow.PERSON_FIRST;
                        AssetRequestReceiveWarning.WarningType warningType2 = AssetRequestReceiveWarning.WarningType.NO_INITIATOR_NOTE;
                        analytics6.track(new AssetRequestReceiveWarning(paymentFlow2), null);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) this.this$0;
                String str5 = (String) paymentLoadingPresenter.flowToken;
                String str6 = (String) paymentLoadingPresenter.paymentToken;
                ((Analytics) paymentLoadingPresenter.analytics).track(paymentLoadingPresenter.isRequest ? new AssetRequestLoadingStarted(str6, str5) : new AssetSendLoadingStarted(str6, str5), null);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = (PersonalizePaymentRecipientPresenter) this.this$0;
                Analytics analytics7 = personalizePaymentRecipientPresenter.analytics;
                PaymentScreens.PersonalizePaymentRecipient personalizePaymentRecipient = personalizePaymentRecipientPresenter.args;
                analytics7.track(new ActivityRecordViewOpenPersonalization(personalizePaymentRecipient.source, personalizePaymentRecipient.entity.entity_token), null);
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) this.this$0;
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) inviteErrorPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                realRouter$Factory$Impl.create$1(screenNavigator).route(new RoutingParams(null, null, null, null, null, null, 511), ((PaymentScreens.QuickPayExitRouterScreen) inviteErrorPresenter.analytics).clientRoute);
                screenNavigator.goTo(new Finish(null));
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = (AggregatingScrollPerformanceTracker) this.this$0;
                ArrayList arrayList = aggregatingScrollPerformanceTracker.pendingScrollEvents;
                Lazy lazy2 = aggregatingScrollPerformanceTracker.msPerFrame$delegate;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = ((ScrollEventData) it.next()).frameTimestamps;
                    if (list.size() < i) {
                        lazy = lazy2;
                    } else {
                        long longValue = (((Number) CollectionsKt.last(list)).longValue() - ((Number) CollectionsKt.first(list)).longValue()) / 1000000;
                        int size2 = list.size();
                        int size3 = list.size();
                        int i4 = 0;
                        int i5 = 1;
                        while (i5 < size3) {
                            Lazy lazy3 = lazy2;
                            int roundToInt = MathKt__MathJVMKt.roundToInt(((((Number) list.get(i5)).longValue() - ((Number) list.get(i5 - 1)).longValue()) / 1000000.0d) / ((Number) lazy3.getValue()).floatValue());
                            if (roundToInt < 1) {
                                roundToInt = 1;
                            }
                            i4 += roundToInt;
                            i5++;
                            lazy2 = lazy3;
                        }
                        lazy = lazy2;
                        aggregatingScrollPerformanceTracker.totalScrollDurationMs += longValue;
                        aggregatingScrollPerformanceTracker.totalFramesRendered += size2;
                        int i6 = i4 - size2;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        aggregatingScrollPerformanceTracker.totalScrollHitchTimeMs += ((Number) lazy.getValue()).floatValue() * i6;
                    }
                    i = 2;
                    lazy2 = lazy;
                }
                aggregatingScrollPerformanceTracker.pendingScrollEvents.clear();
                if (aggregatingScrollPerformanceTracker.totalFramesRendered < 5) {
                    return null;
                }
                long j = aggregatingScrollPerformanceTracker.totalScrollDurationMs;
                double d = j / 1000.0d;
                PerformanceMeasureScrollPerformance performanceMeasureScrollPerformance = new PerformanceMeasureScrollPerformance(aggregatingScrollPerformanceTracker.element, Long.valueOf(j), Integer.valueOf(d > 0.0d ? (int) (aggregatingScrollPerformanceTracker.totalScrollHitchTimeMs / d) : 0));
                aggregatingScrollPerformanceTracker.totalScrollDurationMs = 0L;
                aggregatingScrollPerformanceTracker.totalFramesRendered = 0;
                aggregatingScrollPerformanceTracker.totalScrollHitchTimeMs = 0.0d;
                return performanceMeasureScrollPerformance;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return null;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PoolMemberListPresenter poolMemberListPresenter = (PoolMemberListPresenter) this.this$0;
                Analytics analytics8 = poolMemberListPresenter.analytics;
                String str7 = poolMemberListPresenter.args.flowToken;
                boolean z4 = poolMemberListPresenter.isOwner;
                str7.getClass();
                analytics8.track(new AssetPoolViewMemberList(str7, z4 ? PoolViewerType.OWNER : PoolViewerType.CONTRIBUTOR), null);
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StartPoolPresenter startPoolPresenter = (StartPoolPresenter) this.this$0;
                StartPoolScreen startPoolScreen = startPoolPresenter.args;
                Money money = startPoolScreen.amount;
                if (money != null) {
                    Analytics analytics9 = startPoolPresenter.analytics;
                    Double d2 = money.amount != null ? new Double(r2.longValue()) : null;
                    String str8 = startPoolPresenter.flowToken;
                    String name = startPoolScreen.entryPoint.name();
                    str8.getClass();
                    name.getClass();
                    analytics9.track(new AssetPoolCreatePoolStart(d2, str8, name), null);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ChannelListPresenter channelListPresenter = (ChannelListPresenter) this.this$0;
                channelListPresenter.analytics.track(new NotificationsSettingsViewSettings(zzaky.getChannelListSettingsPage(channelListPresenter.args.categoryType)), null);
                return Unit.INSTANCE;
        }
    }
}
