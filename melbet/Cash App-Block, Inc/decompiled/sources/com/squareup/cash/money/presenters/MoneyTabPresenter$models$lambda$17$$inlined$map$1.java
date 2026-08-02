package com.squareup.cash.money.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.lifecycle.Lifecycle;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.db.TooltipMessage;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewEvent;
import com.squareup.cash.money.applets.db.PromotedAppletTiles;
import com.squareup.cash.money.applets.sections.PromotedAppletTile;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.loadable.Loadable;
import com.squareup.cash.money.loadable.LoadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotDisclosureManager$special$$inlined$map$1$2$1;
import com.squareup.cash.moneybot.presenters.MemoryTooltipData;
import com.squareup.cash.moneybot.presenters.MoneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.moneybot.presenters.RealMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.notifications.NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1;
import com.squareup.cash.notifications.NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper$special$$inlined$map$1$2$1;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper$special$$inlined$map$2$2$1;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1;
import com.squareup.cash.offers.db.OffersSearch;
import com.squareup.cash.offers.presenters.OffersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.protos.cash.staff.syncvalues.VersionedCashForWorkApplet;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.cards.CardTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabPresenter$models$lambda$17$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinishSetupTileBadgeCounter $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x02c5  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:264:0x034d  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x0389  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x0393  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:308:0x03cf  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x0408  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:342:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:366:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:380:0x04be  */
        /* JADX WARN: Removed duplicated region for block: B:386:0x04c8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:401:0x04fc  */
        /* JADX WARN: Removed duplicated region for block: B:407:0x0506  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x054a  */
        /* JADX WARN: Removed duplicated region for block: B:431:0x0554  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x0586  */
        /* JADX WARN: Removed duplicated region for block: B:451:0x0590  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x05c3  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x05cd  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x064c  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x0656  */
        /* JADX WARN: Removed duplicated region for block: B:522:0x0688  */
        /* JADX WARN: Removed duplicated region for block: B:528:0x0692  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:542:0x06c4  */
        /* JADX WARN: Removed duplicated region for block: B:548:0x06ce  */
        /* JADX WARN: Removed duplicated region for block: B:560:0x0700  */
        /* JADX WARN: Removed duplicated region for block: B:566:0x070a  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x073c  */
        /* JADX WARN: Removed duplicated region for block: B:586:0x0746  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x0778  */
        /* JADX WARN: Removed duplicated region for block: B:604:0x0782  */
        /* JADX WARN: Removed duplicated region for block: B:618:0x07b4  */
        /* JADX WARN: Removed duplicated region for block: B:624:0x07be  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            CardTheme cardTheme;
            MerchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1 merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1;
            int i2;
            MerchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1 merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1;
            int i3;
            SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
            int i4;
            SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1 squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1;
            int i5;
            SquareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1;
            int i6;
            SquareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1 squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1;
            int i7;
            RealPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1 realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1;
            int i8;
            Object obj2;
            LoadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1 loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1;
            int i9;
            MoneyTabPresenter$models$$inlined$filterIsInstance$1$2$1 moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1;
            int i10;
            MoneyTabPresenter$models$lambda$31$$inlined$map$1$2$1 moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1;
            int i11;
            CashForWorkAppletV1 cashForWorkAppletV1;
            RealMoneybotDisclosureManager$special$$inlined$map$1$2$1 realMoneybotDisclosureManager$special$$inlined$map$1$2$1;
            int i12;
            MoneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1;
            int i13;
            MoneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1 moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1;
            int i14;
            MoneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
            int i15;
            MoneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1 moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1;
            int i16;
            MoneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1;
            int i17;
            MoneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1 moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1;
            int i18;
            RealMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1 realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1;
            int i19;
            AppMessageAction appMessageAction;
            String str;
            MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1 moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i20;
            NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1 notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1;
            int i21;
            NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1 notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1;
            int i22;
            RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1 realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1;
            int i23;
            RealAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1 realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1;
            int i24;
            BugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
            int i25;
            RealOffersAnalyticsHelper$special$$inlined$map$1$2$1 realOffersAnalyticsHelper$special$$inlined$map$1$2$1;
            int i26;
            RealOffersAnalyticsHelper$special$$inlined$map$2$2$1 realOffersAnalyticsHelper$special$$inlined$map$2$2$1;
            int i27;
            RealOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1 realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1;
            int i28;
            FilterGroupSection filterGroupSection;
            OffersTabSearchResponse offersTabSearchResponse;
            OffersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i29;
            OffersHomePresenter$models$lambda$0$$inlined$map$1$2$1 offersHomePresenter$models$lambda$0$$inlined$map$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i32 = anonymousClass1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) obj;
                                if (issuedCard != null && ((!issuedCard.isVirtual || issuedCard.activated || issuedCard.physicalCardOrderState != CashAppCard.PhysicalCardOrderState.NO_CARD) && (cardTheme = issuedCard.cardTheme) != null)) {
                                    r5 = cardTheme.id;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(r5, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    break;
                case 1:
                    if (continuation instanceof MerchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1) {
                        merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1 = (MerchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1) continuation;
                        int i33 = merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj4 = merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                if (obj instanceof MerchantProfileViewEvent.PaymentHistoryViewEvent) {
                                    merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1 = new MerchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj42 = merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = merchantProfilePresenter$models$lambda$28$$inlined$filterIsInstance$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof MerchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1) {
                        merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1 = (MerchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1) continuation;
                        int i34 = merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj5 = merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll = ((MerchantProfileViewEvent.PaymentHistoryViewEvent) obj).event;
                                merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(profilePaymentHistoryViewEvent$ViewAll, merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1 = new MerchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = merchantProfilePresenter$models$lambda$28$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) {
                        squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = (SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) continuation;
                        int i35 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj6 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                if (obj instanceof SquareLoyaltyDetailsViewEvent.LoyaltyGenericTreeElementsViewEvent) {
                                    squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) == coroutineSingletons5) {
                                        break;
                                    }
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = new SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj62 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1) {
                        squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1 = (SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                        int i36 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj7 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = ((SquareLoyaltyDetailsViewEvent.LoyaltyGenericTreeElementsViewEvent) obj).event;
                                squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(genericTreeElementsViewEvent, squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1 = new SquareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = squareLoyaltyDetailsPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof SquareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) {
                        squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = (SquareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) continuation;
                        int i37 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj8 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                if (obj instanceof SquareLoyaltySheetViewEvent.LoyaltyGenericTreeElementsViewEvent) {
                                    squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1) == coroutineSingletons7) {
                                        break;
                                    }
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj8);
                            }
                            break;
                        }
                    }
                    squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1 = new SquareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj82 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$filterIsInstance$1$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof SquareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1) {
                        squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1 = (SquareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                        int i38 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj9 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = ((SquareLoyaltySheetViewEvent.LoyaltyGenericTreeElementsViewEvent) obj).event;
                                squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(genericTreeElementsViewEvent2, squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1 = new SquareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = squareLoyaltySheetPresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof RealPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1) {
                        realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1 = (RealPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1) continuation;
                        int i39 = realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                ArrayList arrayList = new ArrayList();
                                for (PromotedAppletTiles promotedAppletTiles : (List) obj) {
                                    EnumEntriesList enumEntriesList = AppletId.$ENTRIES;
                                    ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
                                    while (true) {
                                        if (m.hasNext()) {
                                            obj2 = m.next();
                                            if (Intrinsics.areEqual(((AppletId) obj2).name(), promotedAppletTiles.appletId)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    AppletId appletId = (AppletId) obj2;
                                    PromotedAppletTile promotedAppletTile = appletId != null ? new PromotedAppletTile(appletId, promotedAppletTiles.title, promotedAppletTiles.subtitle, promotedAppletTiles.image) : null;
                                    if (promotedAppletTile != null) {
                                        arrayList.add(promotedAppletTile);
                                    }
                                }
                                realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList, realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj10);
                            }
                            break;
                        }
                    }
                    realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1 = new RealPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realPromotedAppletTileStore$getPromotedAppletTiles$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof LoadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1) {
                        loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1 = (LoadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1) continuation;
                        int i40 = loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj11 = loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                Loadable.Loaded loaded = new Loadable.Loaded(obj);
                                loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(loaded, loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1 = new LoadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = loadableStateKt$collectAsLoadableState$lambda$0$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof MoneyTabPresenter$models$$inlined$filterIsInstance$1$2$1) {
                        moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1 = (MoneyTabPresenter$models$$inlined$filterIsInstance$1$2$1) continuation;
                        int i41 = moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj12 = moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                if (obj instanceof MoneyTabEvent.SuspensionsBannerClicked) {
                                    moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                        break;
                                    }
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj12);
                            }
                            break;
                        }
                    }
                    moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1 = new MoneyTabPresenter$models$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj122 = moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = moneyTabPresenter$models$$inlined$filterIsInstance$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof MoneyTabPresenter$models$lambda$31$$inlined$map$1$2$1) {
                        moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1 = (MoneyTabPresenter$models$lambda$31$$inlined$map$1$2$1) continuation;
                        int i42 = moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj13 = moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) obj;
                                Boolean valueOf = Boolean.valueOf((versionedCashForWorkApplet == null || (cashForWorkAppletV1 = versionedCashForWorkApplet.cash_for_work_applet_v1) == null) ? false : Intrinsics.areEqual(cashForWorkAppletV1.shows_banner, Boolean.TRUE));
                                moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj13);
                            }
                            break;
                        }
                    }
                    moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = moneyTabPresenter$models$lambda$31$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                    break;
                case 11:
                    if (continuation instanceof RealMoneybotDisclosureManager$special$$inlined$map$1$2$1) {
                        realMoneybotDisclosureManager$special$$inlined$map$1$2$1 = (RealMoneybotDisclosureManager$special$$inlined$map$1$2$1) continuation;
                        int i43 = realMoneybotDisclosureManager$special$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realMoneybotDisclosureManager$special$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj14 = realMoneybotDisclosureManager$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realMoneybotDisclosureManager$special$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
                                r5 = cashGlobalUserSettings != null ? cashGlobalUserSettings.moneybot_persistent_disclosure_agreement : null;
                                realMoneybotDisclosureManager$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r5, realMoneybotDisclosureManager$special$$inlined$map$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj14);
                            }
                            break;
                        }
                    }
                    realMoneybotDisclosureManager$special$$inlined$map$1$2$1 = new RealMoneybotDisclosureManager$special$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = realMoneybotDisclosureManager$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realMoneybotDisclosureManager$special$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof MoneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) {
                        moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 = (MoneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) continuation;
                        int i44 = moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj15 = moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                if (obj instanceof MoneybotAutomationsViewEvent.TabToolbarEvent) {
                                    moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1) == coroutineSingletons14) {
                                        break;
                                    }
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1 = new MoneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj152 = moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = moneybotAutomationsPresenter$models$lambda$1$$inlined$filterIsInstance$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 13:
                    if (continuation instanceof MoneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1) {
                        moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1 = (MoneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1) continuation;
                        int i45 = moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj16 = moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = ((MoneybotAutomationsViewEvent.TabToolbarEvent) obj).tabToolbarEvent;
                                moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(tabToolbarInternalViewEvent, moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj16);
                            }
                            break;
                        }
                    }
                    moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1 = new MoneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = moneybotAutomationsPresenter$models$lambda$1$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof MoneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (MoneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i46 = moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj17 = moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                Object obj18 = ((Versioned) obj).value;
                                if (obj18 != null) {
                                    moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(obj18, moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons16) {
                                        break;
                                    }
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new MoneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj172 = moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = moneybotChatPresenter$models$chatSessionManager$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i15 != 0) {
                    }
                case 15:
                    if (continuation instanceof MoneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1) {
                        moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1 = (MoneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1) continuation;
                        int i47 = moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj19 = moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                if (((Lifecycle.State) obj).compareTo(Lifecycle.State.RESUMED) >= 0) {
                                    moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons17) {
                                        break;
                                    }
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1 = new MoneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1(this, continuation);
                    Object obj192 = moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = moneybotHomePresenter$models$2$1$invokeSuspend$lambda$0$$inlined$filter$1$2$1.label;
                    if (i16 != 0) {
                    }
                case 16:
                    if (continuation instanceof MoneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) {
                        moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = (MoneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) continuation;
                        int i48 = moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj20 = moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                if (obj instanceof MoneybotHomeViewEvent.TabToolbarEvent) {
                                    moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1) == coroutineSingletons18) {
                                        break;
                                    }
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj20);
                            }
                            break;
                        }
                    }
                    moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1 = new MoneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj202 = moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = moneybotHomePresenter$models$lambda$6$$inlined$filterIsInstance$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 17:
                    if (continuation instanceof MoneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1) {
                        moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1 = (MoneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                        int i49 = moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj21 = moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                TabToolbarInternalViewEvent tabToolbarInternalViewEvent2 = ((MoneybotHomeViewEvent.TabToolbarEvent) obj).tabToolbarEvent;
                                moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(tabToolbarInternalViewEvent2, moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1) == coroutineSingletons19) {
                                    break;
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj21);
                            }
                            break;
                        }
                    }
                    moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1 = new MoneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = moneybotHomePresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 18:
                    if (continuation instanceof RealMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1) {
                        realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1 = (RealMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1) continuation;
                        int i50 = realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj22 = realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj22);
                                TooltipMessage tooltipMessage = (TooltipMessage) CollectionsKt.firstOrNull((List) obj);
                                if (tooltipMessage != null && (appMessageAction = tooltipMessage.tooltip) != null && (str = appMessageAction.text) != null) {
                                    r5 = new MemoryTooltipData(tooltipMessage.messageToken, str);
                                }
                                realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r5, realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1) == coroutineSingletons20) {
                                    break;
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj22);
                            }
                            break;
                        }
                    }
                    realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1 = new RealMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1(this, continuation);
                    Object obj222 = realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = realMoneybotMemoryTooltipManager$special$$inlined$map$1$2$1.label;
                    if (i19 != 0) {
                    }
                    break;
                case 19:
                    if (continuation instanceof MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1 = (MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i51 = moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj23 = moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                if (!((Boolean) obj).booleanValue()) {
                                    moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons21) {
                                        break;
                                    }
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj23);
                            }
                            break;
                        }
                    }
                    moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1 = new MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj232 = moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i20 != 0) {
                    }
                case 20:
                    if (continuation instanceof NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1) {
                        notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1 = (NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1) continuation;
                        int i52 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj24 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                if (((Boolean) obj).booleanValue()) {
                                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1) == coroutineSingletons22) {
                                        break;
                                    }
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1 = new NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1(this, continuation);
                    Object obj242 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$filter$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1) {
                        notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1 = (NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1) continuation;
                        int i53 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj25 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                Boolean bool = Boolean.FALSE;
                                notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(bool, notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1 = new NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1(this, continuation);
                    Object obj252 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1) {
                        realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1 = (RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1) continuation;
                        int i54 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj26 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                if (((Lifecycle.State) obj) == Lifecycle.State.RESUMED) {
                                    realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1) == coroutineSingletons24) {
                                        break;
                                    }
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1 = new RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1(this, continuation);
                    Object obj262 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$filter$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof RealAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1) {
                        realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1 = (RealAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1) continuation;
                        int i55 = realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                if (((Lifecycle.State) obj) == Lifecycle.State.RESUMED) {
                                    realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1) == coroutineSingletons25) {
                                        break;
                                    }
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj27);
                            }
                            break;
                        }
                    }
                    realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1 = new RealAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1(this, continuation);
                    Object obj272 = realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = realAndroidNotificationSettingsChecker$special$$inlined$filter$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof BugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (BugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i56 = bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj28 = bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                Region region = ((SelectRegion) obj).region;
                                r5 = region != null ? region.name() : null;
                                if (r5 != null) {
                                    bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(r5, bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons26) {
                                        break;
                                    }
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj28);
                            }
                            break;
                        }
                    }
                    bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new BugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj282 = bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = bugsnagClientSandboxSetupTeardown$setup$1$1$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof RealOffersAnalyticsHelper$special$$inlined$map$1$2$1) {
                        realOffersAnalyticsHelper$special$$inlined$map$1$2$1 = (RealOffersAnalyticsHelper$special$$inlined$map$1$2$1) continuation;
                        int i57 = realOffersAnalyticsHelper$special$$inlined$map$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realOffersAnalyticsHelper$special$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realOffersAnalyticsHelper$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realOffersAnalyticsHelper$special$$inlined$map$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                Slots slots = (Slots) CollectionsKt.firstOrNull((List) obj);
                                r5 = slots != null ? slots.offerly_token : null;
                                realOffersAnalyticsHelper$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r5, realOffersAnalyticsHelper$special$$inlined$map$1$2$1) == coroutineSingletons27) {
                                    break;
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj29);
                            }
                            break;
                        }
                    }
                    realOffersAnalyticsHelper$special$$inlined$map$1$2$1 = new RealOffersAnalyticsHelper$special$$inlined$map$1$2$1(this, continuation);
                    Object obj292 = realOffersAnalyticsHelper$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realOffersAnalyticsHelper$special$$inlined$map$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof RealOffersAnalyticsHelper$special$$inlined$map$2$2$1) {
                        realOffersAnalyticsHelper$special$$inlined$map$2$2$1 = (RealOffersAnalyticsHelper$special$$inlined$map$2$2$1) continuation;
                        int i58 = realOffersAnalyticsHelper$special$$inlined$map$2$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realOffersAnalyticsHelper$special$$inlined$map$2$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj30 = realOffersAnalyticsHelper$special$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realOffersAnalyticsHelper$special$$inlined$map$2$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                List list = (List) obj;
                                r5 = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                                realOffersAnalyticsHelper$special$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(r5, realOffersAnalyticsHelper$special$$inlined$map$2$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    realOffersAnalyticsHelper$special$$inlined$map$2$2$1 = new RealOffersAnalyticsHelper$special$$inlined$map$2$2$1(this, continuation);
                    Object obj302 = realOffersAnalyticsHelper$special$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realOffersAnalyticsHelper$special$$inlined$map$2$2$1.label;
                    if (i27 != 0) {
                    }
                case 27:
                    if (continuation instanceof RealOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1) {
                        realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1 = (RealOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1) continuation;
                        int i59 = realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj31 = realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                OffersSearch offersSearch = (OffersSearch) obj;
                                if (offersSearch == null || (offersTabSearchResponse = offersSearch.offers_search_response) == null || (filterGroupSection = offersTabSearchResponse.filter_group_sections) == null) {
                                    filterGroupSection = new FilterGroupSection((List) null, 3);
                                }
                                realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(filterGroupSection, realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1) == coroutineSingletons29) {
                                    break;
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj31);
                            }
                            break;
                        }
                    }
                    realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1 = new RealOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1(this, continuation);
                    Object obj312 = realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realOffersTabRepository$filterGroupsSection$$inlined$map$1$2$1.label;
                    if (i28 != 0) {
                    }
                    break;
                case 28:
                    if (continuation instanceof OffersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (OffersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i60 = offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj33 = offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                if (obj instanceof BoostAction.Error) {
                                    offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons30) {
                                        break;
                                    }
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new OffersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj332 = offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = offersFullscreenCollectionPresenter$models$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof OffersHomePresenter$models$lambda$0$$inlined$map$1$2$1) {
                        offersHomePresenter$models$lambda$0$$inlined$map$1$2$1 = (OffersHomePresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                        int i61 = offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj34 = offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                Slots slots2 = (Slots) CollectionsKt.firstOrNull((List) obj);
                                r5 = slots2 != null ? slots2.token : null;
                                offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r5, offersHomePresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons31) {
                                    break;
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj34);
                            }
                            break;
                        }
                    }
                    offersHomePresenter$models$lambda$0$$inlined$map$1$2$1 = new OffersHomePresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj342 = offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = offersHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if (i30 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabPresenter$models$lambda$17$$inlined$map$1(FinishSetupTileBadgeCounter finishSetupTileBadgeCounter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = finishSetupTileBadgeCounter;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 11;
        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = finishSetupTileBadgeCounter.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = finishSetupTileBadgeCounter.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 23), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = finishSetupTileBadgeCounter.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 5), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = finishSetupTileBadgeCounter.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i2), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = finishSetupTileBadgeCounter.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, 9), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = finishSetupTileBadgeCounter.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = finishSetupTileBadgeCounter.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 12), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect8 = finishSetupTileBadgeCounter.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 13), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
