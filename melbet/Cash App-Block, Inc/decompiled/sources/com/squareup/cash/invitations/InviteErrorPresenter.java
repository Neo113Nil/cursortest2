package com.squareup.cash.invitations;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.internal.zzd;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileCashtagRequiredViewModel;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewModel;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$Header$Style$Active;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$Header$Style$Inactive;
import com.squareup.cash.cdf.limits.LimitsBrowseLimitTypeScreen;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.presenters.InvestmentOrderPresenter$Empty;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.limits.screens.LimitsCategoryData;
import com.squareup.cash.limits.screens.LimitsCategoryType;
import com.squareup.cash.limits.screens.LimitsSectionData;
import com.squareup.cash.limits.screens.LimitsSectionIconData;
import com.squareup.cash.limits.screens.LimitsSectionScreen;
import com.squareup.cash.limits.screens.ProgressBarData;
import com.squareup.cash.limits.screens.ProgressType;
import com.squareup.cash.limits.viewmodels.LimitItem;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsCategoryViewModel$LimitsCategory;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.limits.viewmodels.ProgressViewModel;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.onboarding.backend.OnboardableCountries;
import com.squareup.cash.onboarding.screens.CountrySelectorScreen;
import com.squareup.cash.onboarding.viewmodels.CountrySelectorViewModel;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.presenters.PaychecksActivityFeedProducer;
import com.squareup.cash.paychecks.presenters.PaychecksAugmentedActivityRequestHandler;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewModel;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModelKt$WhenMappings;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AppMessagesOptionsViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewModel;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportLoadClientScenarioPresenter$loadClientScenario$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.DoubleCheck;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteErrorPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;
    public final Object args;
    public final Object navigator;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck) {
            this.analytics = doubleCheck;
        }
    }

    public InviteErrorPresenter(SessionManager sessionManager, PaychecksAppService paychecksAppService, ActivityClientService activityClientService, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, PaychecksActivityFeedProducer paychecksActivityFeedProducer) {
        this.$r8$classId = 5;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        String activeAccountToken = PlatformKt.activeAccountToken(sessionManager);
        this.args = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN_PAYCHECKS, activeAccountToken, (String) null, 12), ActivityScope.MY_ACTIVITY, new PaychecksAugmentedActivityRequestHandler(paychecksAppService, activityClientService), 8), null, null, false, null, null, null, null, paychecksActivityFeedProducer, 12282));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadClientScenario(InviteErrorPresenter inviteErrorPresenter, ContinuationImpl continuationImpl) {
        SupportLoadClientScenarioPresenter$loadClientScenario$1 supportLoadClientScenarioPresenter$loadClientScenario$1;
        int i;
        ChannelFlowTransformLatest completeClientScenario;
        SupportScreens.SupportLoadClientScenarioScreen supportLoadClientScenarioScreen = (SupportScreens.SupportLoadClientScenarioScreen) inviteErrorPresenter.args;
        if (continuationImpl instanceof SupportLoadClientScenarioPresenter$loadClientScenario$1) {
            supportLoadClientScenarioPresenter$loadClientScenario$1 = (SupportLoadClientScenarioPresenter$loadClientScenario$1) continuationImpl;
            int i2 = supportLoadClientScenarioPresenter$loadClientScenario$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportLoadClientScenarioPresenter$loadClientScenario$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportLoadClientScenarioPresenter$loadClientScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportLoadClientScenarioPresenter$loadClientScenario$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenario valueOf = ClientScenario.valueOf(supportLoadClientScenarioScreen.scenarioString);
                    RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) inviteErrorPresenter.analytics;
                    SupportScreens.FlowScreens.Data data = supportLoadClientScenarioScreen.data;
                    completeClientScenario = realClientScenarioCompleter.completeClientScenario(valueOf, (r24 & 2) != 0 ? null : null, data.exitScreen, (r24 & 8) != 0 ? null : null, BlockersData.Flow.PROFILE_BLOCKERS, true, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? EmptyList.INSTANCE : CollectionsKt__CollectionsKt.listOfNotNull(data.paymentToken), null, null, false);
                    RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(completeClientScenario, 25);
                    supportLoadClientScenarioPresenter$loadClientScenario$1.label = 1;
                    obj = FlowKt.first(realDrawerOpener$getDrawerScreen$$inlined$map$1, supportLoadClientScenarioPresenter$loadClientScenario$1);
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
                ((BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator).goTo((Screen) obj);
                return Unit.INSTANCE;
            }
        }
        supportLoadClientScenarioPresenter$loadClientScenario$1 = new SupportLoadClientScenarioPresenter$loadClientScenario$1(inviteErrorPresenter, continuationImpl);
        Object obj2 = supportLoadClientScenarioPresenter$loadClientScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportLoadClientScenarioPresenter$loadClientScenario$1.label;
        if (i != 0) {
        }
        ((BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator).goTo((Screen) obj2);
        return Unit.INSTANCE;
    }

    public static LimitsSectionType toLimitsSectionType(LimitsSectionIconData limitsSectionIconData) {
        int ordinal = limitsSectionIconData.ordinal();
        if (ordinal == 0) {
            return LimitsSectionType.SEND_AND_RECEIVE;
        }
        if (ordinal == 1) {
            return LimitsSectionType.DEPOSIT_AND_WITHDRAW;
        }
        if (ordinal == 2) {
            return LimitsSectionType.CASH_CARD;
        }
        if (ordinal == 3) {
            return LimitsSectionType.BITCOIN;
        }
        if (ordinal == 4) {
            return LimitsSectionType.STOCKS;
        }
        if (ordinal == 5) {
            return LimitsSectionType.UNKNOWN;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08a1  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [com.squareup.cash.phoneplans.PhonePlansHomeViewModel$Content$Header$CtaStyle] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        LimitsBrowseLimitTypeScreen.LimitType limitType;
        int i2;
        Iterator it;
        String str;
        Iterator it2;
        LimitsSectionType limitsSectionType;
        Iterator it3;
        int i3;
        Object staticLimit;
        LimitsSectionType limitsSectionType2;
        Iterator it4;
        LimitItem limitItem;
        ?? r13;
        ProgressViewModel simpleProgress;
        Object phonePlansHomePresenter$models$1$1;
        Pair pair;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        PhonePlansHomeViewModel.Content.Header inactive;
        MobilePlanHome.InfoCards infoCards;
        Pair pair2;
        Object content;
        ?? r5;
        String str2;
        int i4 = this.$r8$classId;
        int i5 = 11;
        int i6 = 21;
        int i7 = 23;
        int i8 = 28;
        int i9 = 10;
        int i10 = 5;
        int i11 = 1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = this.analytics;
        Object obj2 = this.args;
        int i12 = 0;
        Continuation continuation2 = null;
        switch (i4) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1433292009);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    continuation = null;
                    rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                Updater.LaunchedEffect(gapComposer, flow, new CashMapPresenter$models$3$1(flow, continuation, this, 2));
                InviteErrorViewModel inviteErrorViewModel = new InviteErrorViewModel(((BlockersScreens.InviteErrorScreen) obj2).message);
                gapComposer.end(false);
                return inviteErrorViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(591882516);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(InvestmentOrderPresenter$Empty.INSTANCE);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState4 = (MutableState) rememberedValue2;
                Updater.LaunchedEffect(gapComposer2, flow, new GLThread$start$2(flow, (Continuation) null, this, mutableState4, 16));
                Screen screen = (Screen) mutableState4.getValue();
                gapComposer2.end(false);
                return screen;
            case 2:
                Continuation continuation3 = null;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1203316048);
                LimitsSectionScreen limitsSectionScreen = (LimitsSectionScreen) obj2;
                int ordinal = toLimitsSectionType(limitsSectionScreen.sectionData.icon).ordinal();
                if (ordinal == 0) {
                    limitType = null;
                } else if (ordinal == 1) {
                    limitType = LimitsBrowseLimitTypeScreen.LimitType.SEND_AND_RECEIVE;
                } else if (ordinal == 2) {
                    limitType = LimitsBrowseLimitTypeScreen.LimitType.DEPOSIT_AND_WITHDRAW;
                } else if (ordinal == 3) {
                    limitType = LimitsBrowseLimitTypeScreen.LimitType.CASH_CARD;
                } else if (ordinal == 4) {
                    limitType = LimitsBrowseLimitTypeScreen.LimitType.BITCOIN;
                } else {
                    if (ordinal != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    limitType = LimitsBrowseLimitTypeScreen.LimitType.STOCKS;
                }
                if (limitType != null) {
                    gapComposer3.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer3, limitType, new RealKeyStoreProvider$setEntry$2(limitType, continuation3, this, 6));
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1106436997);
                    gapComposer3.end(false);
                }
                Updater.LaunchedEffect(gapComposer3, flow, new CashMapPresenter$models$3$1(flow, continuation3, this, i10));
                LimitsSectionData limitsSectionData = limitsSectionScreen.sectionData;
                String str3 = limitsSectionData.accentColor;
                ColorModel accented = str3 != null ? new ColorModel.Accented(ColorsKt.toColor(str3)) : ColorModel.CashGreen.INSTANCE;
                ArrayList arrayList = limitsSectionData.categories;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    String str4 = ((LimitsCategoryData) obj3).header;
                    Object obj4 = linkedHashMap.get(str4);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(str4, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                String str5 = limitsSectionData.title;
                LimitsSectionType limitsSectionType3 = toLimitsSectionType(limitsSectionData.icon);
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                Iterator it5 = linkedHashMap.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    String str6 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            if (((LimitsCategoryData) it6.next()).f1169type == LimitsCategoryType.PROGRESSIVE) {
                                i2 = i11;
                                ?? r11 = i2 == 0 ? str6 : continuation3;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, i9));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    LimitsCategoryData limitsCategoryData = (LimitsCategoryData) it.next();
                                    int ordinal2 = limitsCategoryData.f1169type.ordinal();
                                    if (ordinal2 != 0) {
                                        if (ordinal2 == i11) {
                                            List list2 = limitsCategoryData.progressBars;
                                            if (list2 != null) {
                                                List list3 = list2;
                                                r13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i9));
                                                Iterator it7 = list3.iterator();
                                                while (it7.hasNext()) {
                                                    ProgressBarData progressBarData = (ProgressBarData) it7.next();
                                                    ProgressType progressType = progressBarData.progressType;
                                                    Iterator it8 = it7;
                                                    Double d = progressBarData.consumedProportion;
                                                    String str7 = progressBarData.amountRemaining;
                                                    String str8 = progressBarData.amountUsed;
                                                    String str9 = progressBarData.limitThresholdAmount;
                                                    int ordinal3 = progressType.ordinal();
                                                    if (ordinal3 == 0) {
                                                        simpleProgress = new ProgressViewModel.SimpleProgress(progressBarData.primaryText, progressBarData.secondaryText, progressBarData.progress, null, accented);
                                                    } else if (ordinal3 == 1) {
                                                        String str10 = progressBarData.header;
                                                        String str11 = progressBarData.primaryText;
                                                        String str12 = str9 == null ? "" : str9;
                                                        if (str8 == null) {
                                                            str8 = "";
                                                        }
                                                        simpleProgress = new ProgressViewModel.MoneyProgress(str10, str8, str7 == null ? "" : str7, str12, str11, d != null ? d.doubleValue() : 0.0d, accented);
                                                    } else if (ordinal3 == 2) {
                                                        String str13 = progressBarData.header;
                                                        String str14 = progressBarData.primaryText;
                                                        String str15 = str9 == null ? "" : str9;
                                                        if (str8 == null) {
                                                            str8 = "";
                                                        }
                                                        simpleProgress = new ProgressViewModel.CountProgress(str13, str8, str7 == null ? "" : str7, str15, str14, d != null ? d.doubleValue() : 0.0d, accented);
                                                    } else {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    }
                                                    r13.add(simpleProgress);
                                                    it7 = it8;
                                                }
                                            } else {
                                                r13 = 0;
                                            }
                                            if (r13 == 0) {
                                                r13 = EmptyList.INSTANCE;
                                            }
                                            staticLimit = new LimitItemViewModel.ProgressBarLimit(null, r13);
                                            str = str5;
                                            it2 = it5;
                                            limitsSectionType = limitsSectionType3;
                                            it3 = it;
                                            i3 = 1;
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                        return null;
                                    }
                                    List list4 = limitsCategoryData.legacyItems;
                                    if (list4 == null) {
                                        list4 = EmptyList.INSTANCE;
                                    }
                                    String str16 = i2 != 0 ? null : str6;
                                    List list5 = list4;
                                    str = str5;
                                    it2 = it5;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                    Iterator it9 = list5.iterator();
                                    while (it9.hasNext()) {
                                        String str17 = (String) it9.next();
                                        Iterator it10 = it9;
                                        MatcherMatchResult find = new Regex("\\$[\\d,]+").find(str17);
                                        if (find != null) {
                                            String value = find.getValue();
                                            String obj5 = StringsKt.trim(StringsKt__StringsJVMKt.replace$default(str17, value, "")).toString();
                                            if (obj5.length() > 0) {
                                                StringBuilder sb = new StringBuilder();
                                                limitsSectionType2 = limitsSectionType3;
                                                String valueOf = String.valueOf(obj5.charAt(0));
                                                valueOf.getClass();
                                                it4 = it;
                                                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                                                upperCase.getClass();
                                                sb.append((Object) upperCase);
                                                sb.append(obj5.substring(1));
                                                obj5 = sb.toString();
                                            } else {
                                                limitsSectionType2 = limitsSectionType3;
                                                it4 = it;
                                            }
                                            limitItem = new LimitItem(obj5, value);
                                        } else {
                                            limitsSectionType2 = limitsSectionType3;
                                            it4 = it;
                                            MatcherMatchResult find2 = new Regex("^(.+)\\s+(\\d+)$").find(str17);
                                            limitItem = find2 != null ? new LimitItem((String) ((MatcherMatchResult$groupValues$1) find2.getGroupValues()).get(1), (String) ((MatcherMatchResult$groupValues$1) find2.getGroupValues()).get(2)) : new LimitItem(str17, "");
                                        }
                                        arrayList4.add(limitItem);
                                        it9 = it10;
                                        it = it4;
                                        limitsSectionType3 = limitsSectionType2;
                                    }
                                    limitsSectionType = limitsSectionType3;
                                    it3 = it;
                                    i3 = 1;
                                    staticLimit = new LimitItemViewModel.StaticLimit(str16, arrayList4, list4);
                                    arrayList3.add(staticLimit);
                                    it5 = it2;
                                    it = it3;
                                    i11 = i3;
                                    str5 = str;
                                    limitsSectionType3 = limitsSectionType;
                                    i9 = 10;
                                }
                                arrayList2.add(new LimitsCategoryViewModel$LimitsCategory(r11, arrayList3));
                                limitsSectionType3 = limitsSectionType3;
                                continuation3 = null;
                                i9 = 10;
                                i12 = 0;
                            }
                        }
                    }
                    i2 = i12;
                    if (i2 == 0) {
                    }
                    ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, i9));
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    arrayList2.add(new LimitsCategoryViewModel$LimitsCategory(r11, arrayList32));
                    limitsSectionType3 = limitsSectionType3;
                    continuation3 = null;
                    i9 = 10;
                    i12 = 0;
                }
                LimitViewModel limitViewModel = new LimitViewModel(str5, arrayList2, accented, limitsSectionType3, limitsSectionData.description);
                gapComposer3.end(false);
                return limitViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-785728846);
                Updater.LaunchedEffect(gapComposer4, flow, new RealMRIFactory$sign$2(flow, continuation2, this, 16));
                AndroidStringManager androidStringManager = (AndroidStringManager) obj;
                String str18 = androidStringManager.get(R.string.offers_how_it_works_label);
                OffersTimelineViewModelV2.Item item = new OffersTimelineViewModelV2.Item(androidStringManager.get(R.string.offers_timeline_first_step_title), null);
                String str19 = ((OffersScreen$OffersTimelineScreenV2) obj2).storeName;
                str19.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.offers_timeline_second_step_title)).format(new Object[]{str19});
                format2.getClass();
                OffersTimelineViewModelV2 offersTimelineViewModelV2 = new OffersTimelineViewModelV2(str18, androidStringManager.get(R.string.offers_timeline_button_text), CollectionsKt__CollectionsKt.listOf((Object[]) new OffersTimelineViewModelV2.Item[]{item, new OffersTimelineViewModelV2.Item(format2, null), new OffersTimelineViewModelV2.Item(androidStringManager.get(R.string.offers_timeline_third_step_title), androidStringManager.get(R.string.offers_timeline_third_step_description))}));
                gapComposer4.end(false);
                return offersTimelineViewModelV2;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-892635607);
                Updater.LaunchedEffect(gapComposer5, flow, new RealMRIFactory$sign$2(flow, continuation2, this, i7));
                CountrySelectorViewModel countrySelectorViewModel = new CountrySelectorViewModel((List) obj2, ((CountrySelectorScreen) obj).selectedCountry);
                gapComposer5.end(false);
                return countrySelectorViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(544511234);
                Updater.LaunchedEffect(gapComposer6, flow, new MainPaymentPresenter$models$4$4(flow, continuation2, this, i10));
                PaychecksActivityListViewModel paychecksActivityListViewModel = new PaychecksActivityListViewModel(((RealActivityEmbeddedPresenter) obj2).models(gapComposer6, 0));
                gapComposer6.end(false);
                return paychecksActivityListViewModel;
            case 6:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 7:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(473636623);
                Updater.LaunchedEffect(gapComposer7, flow, new MainPaymentPresenter$models$4$4(flow, continuation2, this, i8));
                PaymentScreens.RecipientSelectionWarningScreen recipientSelectionWarningScreen = (PaymentScreens.RecipientSelectionWarningScreen) obj2;
                String str20 = recipientSelectionWarningScreen.title;
                String str21 = (String) recipientSelectionWarningScreen.message.getValue();
                String str22 = recipientSelectionWarningScreen.positiveButtonText;
                if (str22 == null) {
                    str22 = ((AndroidStringManager) obj).get(R.string.payment_recipient_selection_warning_dismiss);
                }
                RecipientSelectionWarningViewModel recipientSelectionWarningViewModel = new RecipientSelectionWarningViewModel(str20, str21, str22);
                gapComposer7.end(false);
                return recipientSelectionWarningViewModel;
            case 8:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(958740355);
                Object[] objArr = new Object[0];
                Object rememberedValue3 = gapComposer8.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda0(i8);
                    gapComposer8.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer8, 48);
                Object[] objArr2 = new Object[0];
                Object rememberedValue4 = gapComposer8.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new MainPaymentViewKt$$ExternalSyntheticLambda0(29);
                    gapComposer8.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue4, gapComposer8, 48);
                Object rememberedValue5 = gapComposer8.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer8);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue5;
                Object[] objArr3 = new Object[0];
                WorkLauncherImpl workLauncherImpl = PhonePlansHomeViewKt.MobilePlanHomeSaver;
                Object rememberedValue6 = gapComposer8.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new DateScrubber$$ExternalSyntheticLambda0(i11);
                    gapComposer8.updateRememberedValue(rememberedValue6);
                }
                MutableState rememberSaveable = SaverKt.rememberSaveable(objArr3, (Saver) workLauncherImpl, (Function0) rememberedValue6, (Composer) gapComposer8, MLKEMEngine.KyberPolyBytes);
                Integer valueOf2 = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changed = gapComposer8.changed(mutableState5) | gapComposer8.changed(mutableState6) | gapComposer8.changedInstance(this) | gapComposer8.changed(rememberSaveable);
                Object rememberedValue7 = gapComposer8.rememberedValue();
                if (changed || rememberedValue7 == neverEqualPolicy) {
                    pair = null;
                    mutableState = rememberSaveable;
                    phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(this, mutableState, mutableState5, mutableState6, null, 0);
                    mutableState2 = mutableState5;
                    mutableState3 = mutableState6;
                    gapComposer8.updateRememberedValue(phonePlansHomePresenter$models$1$1);
                } else {
                    mutableState2 = mutableState5;
                    mutableState = rememberSaveable;
                    mutableState3 = mutableState6;
                    phonePlansHomePresenter$models$1$1 = rememberedValue7;
                    pair = null;
                }
                Updater.LaunchedEffect(gapComposer8, valueOf2, (Function2) phonePlansHomePresenter$models$1$1);
                MutableState mutableState7 = mutableState;
                Updater.LaunchedEffect(gapComposer8, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (MoleculePresenter) this, mutableState7, (State) parcelableSnapshotMutableIntState, 8));
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    content = PhonePlansHomeViewModel.Loading.INSTANCE;
                } else {
                    if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                        if (mutableState7.getValue() != null) {
                            Object value2 = mutableState7.getValue();
                            value2.getClass();
                            MobilePlanHome mobilePlanHome = (MobilePlanHome) value2;
                            MobilePlanHome.Header header = mobilePlanHome.header;
                            header.getClass();
                            InputState_androidKt inputState_androidKt = header.style;
                            if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Active) {
                                MobilePlanHome.ActiveHeader activeHeader = ((MobilePlanHome$Header$Style$Active) inputState_androidKt).value;
                                String str23 = activeHeader.title;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                String str24 = activeHeader.cta_text;
                                MobilePlanHome.CtaStyle ctaStyle = activeHeader.cta_style;
                                int i13 = ctaStyle == null ? -1 : PhonePlansHomeViewModelKt$WhenMappings.$EnumSwitchMapping$0[ctaStyle.ordinal()];
                                if (i13 == -1 || i13 == 1) {
                                    r5 = pair;
                                } else if (i13 == 2) {
                                    r5 = PhonePlansHomeViewModel.Content.Header.CtaStyle.Link;
                                } else if (i13 == 3) {
                                    r5 = PhonePlansHomeViewModel.Content.Header.CtaStyle.Button;
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                inactive = new PhonePlansHomeViewModel.Content.Header.Active(str23, str24, r5);
                                infoCards = mobilePlanHome.info_cards;
                                if (infoCards != null) {
                                    MobilePlanHome.InfoCard infoCard = infoCards.first;
                                    MobilePlanHome.InfoCard infoCard2 = infoCards.second;
                                    if (infoCard != null && infoCard2 != null) {
                                        pair2 = new Pair(PhonePlansHomeViewKt.toViewModel(infoCard), PhonePlansHomeViewKt.toViewModel(infoCard2));
                                        List<MobilePlanHome.Link> list6 = mobilePlanHome.links;
                                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                        for (MobilePlanHome.Link link : list6) {
                                            String str25 = link.icon_id;
                                            if (str25 == null) {
                                                str25 = "";
                                            }
                                            String str26 = link.label;
                                            if (str26 == null) {
                                                str26 = "";
                                            }
                                            arrayList5.add(new PhonePlansHomeViewModel.Content.Link(str25, str26));
                                        }
                                        content = new PhonePlansHomeViewModel.Content(inactive, pair2, arrayList5);
                                    }
                                }
                                pair2 = pair;
                                List<MobilePlanHome.Link> list62 = mobilePlanHome.links;
                                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
                                while (r0.hasNext()) {
                                }
                                content = new PhonePlansHomeViewModel.Content(inactive, pair2, arrayList52);
                            } else if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Inactive) {
                                MobilePlanHome.InactiveHeader inactiveHeader = ((MobilePlanHome$Header$Style$Inactive) inputState_androidKt).value;
                                String str27 = inactiveHeader.title;
                                if (str27 == null) {
                                    str27 = "";
                                }
                                String str28 = inactiveHeader.body;
                                if (str28 == null) {
                                    str28 = "";
                                }
                                inactive = new PhonePlansHomeViewModel.Content.Header.Inactive(str27, str28, inactiveHeader.cta_text);
                                infoCards = mobilePlanHome.info_cards;
                                if (infoCards != null) {
                                }
                                pair2 = pair;
                                List<MobilePlanHome.Link> list622 = mobilePlanHome.links;
                                ArrayList arrayList522 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list622, 10));
                                while (r0.hasNext()) {
                                }
                                content = new PhonePlansHomeViewModel.Content(inactive, pair2, arrayList522);
                            } else if (inputState_androidKt == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unsupported header");
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Unexpected state");
                        }
                        return pair;
                    }
                    content = PhonePlansHomeViewModel.Error.INSTANCE;
                }
                Object obj6 = content;
                gapComposer8.end(false);
                return obj6;
            case 9:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1578166119);
                Object rememberedValue8 = gapComposer9.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = Updater.mutableStateOf$default(Boolean.valueOf(((BooleanPreference) obj).get()));
                    gapComposer9.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState8 = (MutableState) rememberedValue8;
                Object rememberedValue9 = gapComposer9.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = Updater.mutableStateOf$default(Boolean.valueOf(((BooleanPreference) obj2).get()));
                    gapComposer9.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState9 = (MutableState) rememberedValue9;
                Updater.LaunchedEffect(gapComposer9, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (Object) this, mutableState9, mutableState8, 15));
                AppMessagesOptionsViewModel appMessagesOptionsViewModel = new AppMessagesOptionsViewModel(((Boolean) mutableState8.getValue()).booleanValue(), ((Boolean) mutableState9.getValue()).booleanValue());
                gapComposer9.end(false);
                return appMessagesOptionsViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1741425084);
                Object rememberedValue10 = gapComposer10.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = Updater.mutableStateOf$default(new IncomingRequestsViewModel(null));
                    gapComposer10.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState10 = (MutableState) rememberedValue10;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer10.changedInstance(this);
                Object rememberedValue11 = gapComposer10.rememberedValue();
                if (changedInstance2 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new PhonePlansHomePresenter$models$1$1(this, mutableState10, (Continuation) null);
                    gapComposer10.updateRememberedValue(rememberedValue11);
                }
                Updater.LaunchedEffect(gapComposer10, unit2, (Function2) rememberedValue11);
                Updater.LaunchedEffect(gapComposer10, flow, new PhonePlansHomePresenter$models$1$1(22, mutableState10, (MoleculePresenter) this, (Object) flow, continuation4));
                IncomingRequestsViewModel incomingRequestsViewModel = (IncomingRequestsViewModel) mutableState10.getValue();
                gapComposer10.end(false);
                return incomingRequestsViewModel;
            case 11:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj2;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-883723331);
                Updater.LaunchedEffect(gapComposer11, flow, new PdfPreviewPresenter$models$1$1(flow, continuation2, this, 22));
                Object rememberedValue12 = gapComposer11.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealJurisdictionConfigManager) obj).select(), 17);
                    gapComposer11.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
                    rememberedValue12 = realDrawerOpener$getDrawerScreen$$inlined$map$1;
                }
                String str29 = (String) Updater.collectAsState((Flow) rememberedValue12, "", null, gapComposer11, 48, 2).getValue();
                str29.getClass();
                Resources resources2 = androidStringManager2.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.profile_cash_app_cashtag_required_message)).format(new Object[]{str29});
                format3.getClass();
                ProfileCashtagRequiredViewModel profileCashtagRequiredViewModel = new ProfileCashtagRequiredViewModel(format3, androidStringManager2.get(R.string.profile_cash_app_cashtag_required_positive));
                gapComposer11.end(false);
                return profileCashtagRequiredViewModel;
            case 12:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-443638254);
                Updater.LaunchedEffect(gapComposer12, flow, new PdfPreviewPresenter$models$1$1(flow, continuation2, this, 24));
                Object rememberedValue13 = gapComposer12.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    RealOfflineManager realOfflineManager = (RealOfflineManager) ((OfflineManager) obj);
                    SqlDriver sqlDriver = realOfflineManager.offlineQueries.driver;
                    OfflineQueries$$ExternalSyntheticLambda1 offlineQueries$$ExternalSyntheticLambda1 = new OfflineQueries$$ExternalSyntheticLambda1(5);
                    sqlDriver.getClass();
                    rememberedValue13 = new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-1157014783, new String[]{"pendingPayment", "pendingTransfer"}, sqlDriver, "Offline.sq", "hasPendingRequest", "SELECT count(*) > 0\nFROM (\n  SELECT external_id\n  FROM pendingPayment\n  WHERE succeeded = 0\n  UNION\n  SELECT external_id\n  FROM pendingTransfer\n  WHERE succeeded = 0\n)", offlineQueries$$ExternalSyntheticLambda1)), realOfflineManager.ioDispatcher), i5);
                    gapComposer12.updateRememberedValue(rememberedValue13);
                }
                ProfileConfirmSignOutViewModel profileConfirmSignOutViewModel = new ProfileConfirmSignOutViewModel(((AndroidStringManager) obj2).get(((Number) Updater.collectAsState((Flow) rememberedValue13, Integer.valueOf(R.string.profile_sign_out_message), null, gapComposer12, 0, 2).getValue()).intValue()));
                gapComposer12.end(false);
                return profileConfirmSignOutViewModel;
            case 13:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-1534602836);
                Object rememberedValue14 = gapComposer13.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = StateFlowKt.mapState(((SyncValueReader) obj).getSingleValue(AndroidSyncValueSpecs.PasswordInfo), new OpenSourceKt$$ExternalSyntheticLambda8(2));
                    gapComposer13.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue14, null, gapComposer13, 1);
                Updater.LaunchedEffect(gapComposer13, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation2, this, 6));
                TaxesPasswordViewModel taxesPasswordViewModel = new TaxesPasswordViewModel(((Boolean) collectAsState.getValue()).booleanValue());
                gapComposer13.end(false);
                return taxesPasswordViewModel;
            case 14:
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj;
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-623506776);
                Updater.LaunchedEffect(gapComposer14, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation2, this, 13));
                ProfileScreens.ConfirmReplaceInfoSheet confirmReplaceInfoSheet = (ProfileScreens.ConfirmReplaceInfoSheet) obj2;
                String str30 = (String) confirmReplaceInfoSheet.infoText.getValue();
                int ordinal4 = confirmReplaceInfoSheet.f1190type.ordinal();
                if (ordinal4 == 0) {
                    str2 = androidStringManager3.get(R.string.replace_name);
                } else if (ordinal4 == 1) {
                    str2 = androidStringManager3.get(R.string.replace_email);
                } else if (ordinal4 == 2) {
                    str2 = androidStringManager3.get(R.string.replace_phone_number);
                } else {
                    if (ordinal4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = androidStringManager3.get(R.string.replace_address);
                }
                ConfirmReplaceInfoViewModel confirmReplaceInfoViewModel = new ConfirmReplaceInfoViewModel(str30, str2, androidStringManager3.get(R.string.cancel));
                gapComposer14.end(false);
                return confirmReplaceInfoViewModel;
            case 15:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 16:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(1683029667);
                Updater.LaunchedEffect(gapComposer15, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation2, this, 26));
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj;
                Object[] objArr4 = {Integer.valueOf(((BlockersScreens.ConfirmFirstScheduledReloadNoticeScreen) obj2).selectedDate)};
                Resources resources3 = androidStringManager4.resources;
                resources3.getClass();
                String format4 = new MessageFormat(resources3.getString(R.string.blockers_recurring_transfer_days_end_of_month_prompt)).format(objArr4);
                format4.getClass();
                ConfirmFirstScheduledReloadNoticeViewModel confirmFirstScheduledReloadNoticeViewModel = new ConfirmFirstScheduledReloadNoticeViewModel(format4, androidStringManager4.get(R.string.blockers_recurring_transfer_prompt_confirm_label));
                gapComposer15.end(false);
                return confirmFirstScheduledReloadNoticeViewModel;
            case 17:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 18:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(600422860);
                Updater.LaunchedEffect(gapComposer16, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation2, this, 17));
                RestrictedItemWarningSheetViewModel restrictedItemWarningSheetViewModel = new RestrictedItemWarningSheetViewModel(((ShoppingScreen$RestrictedItemWarningSheetScreen) obj2).name);
                gapComposer16.end(false);
                return restrictedItemWarningSheetViewModel;
            case 19:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(1640771751);
                Object rememberedValue15 = gapComposer17.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = ((SyncValueReader) obj2).getSingleValue(AndroidSyncValueSpecs.CommerceBrowserAutofillPreferences);
                    gapComposer17.updateRememberedValue(rememberedValue15);
                }
                Continuation continuation5 = null;
                MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue15, null, gapComposer17, 1);
                boolean changed2 = gapComposer17.changed((CommerceBrowserAutofillPreferences) collectAsState2.getValue());
                Object rememberedValue16 = gapComposer17.rememberedValue();
                if (changed2 || rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = Recorder$$ExternalSyntheticOutline1.m(!(((CommerceBrowserAutofillPreferences) collectAsState2.getValue()) != null ? Intrinsics.areEqual(r0.opt_out, Boolean.TRUE) : false), gapComposer17);
                }
                MutableState mutableState11 = (MutableState) rememberedValue16;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer17.changedInstance(this) | gapComposer17.changed(mutableState11);
                Object rememberedValue17 = gapComposer17.rememberedValue();
                if (changedInstance3 || rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = new ProfileCropView.AnonymousClass3(this, mutableState11, continuation5, 25);
                    gapComposer17.updateRememberedValue(rememberedValue17);
                }
                Updater.LaunchedEffect(gapComposer17, unit3, (Function2) rememberedValue17);
                Updater.LaunchedEffect(gapComposer17, flow, new TaxWebAppPresenter$models$1$1(flow, continuation5, (MoleculePresenter) this, mutableState11, 3));
                ShoppingSettingsViewModel shoppingSettingsViewModel = new ShoppingSettingsViewModel(((Boolean) mutableState11.getValue()).booleanValue());
                gapComposer17.end(false);
                return shoppingSettingsViewModel;
            case 20:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-1362585133);
                Object rememberedValue18 = gapComposer18.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen = (SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen) obj2;
                    rememberedValue18 = Updater.mutableStateOf$default(new SingleUsePaymentPlanDetailsViewModel(singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.downPayment, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.estimatedTotal));
                    gapComposer18.updateRememberedValue(rememberedValue18);
                }
                Updater.LaunchedEffect(gapComposer18, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation2, this, i8));
                SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel = (SingleUsePaymentPlanDetailsViewModel) ((MutableState) rememberedValue18).getValue();
                gapComposer18.end(false);
                return singleUsePaymentPlanDetailsViewModel;
            case 21:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 22:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(-512089268);
                Object rememberedValue19 = gapComposer19.rememberedValue();
                if (rememberedValue19 == neverEqualPolicy) {
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj;
                    RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = new RealRecipientRepository$suggestions$$inlined$map$1(FlowKt.flowOn(FlowKt.transformLatest((Flow) markwonConfiguration.theme, new RealPasscodeProvider$getPasscode$1(continuation2, markwonConfiguration, i9)), (CoroutineContext) markwonConfiguration.syntaxHighlight), i6);
                    gapComposer19.updateRememberedValue(realRecipientRepository$suggestions$$inlined$map$1);
                    rememberedValue19 = realRecipientRepository$suggestions$$inlined$map$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue19, TransactionPickerViewModel.Loading.INSTANCE, null, gapComposer19, 0, 2);
                Updater.LaunchedEffect(gapComposer19, flow, new ArticlePresenter$models$1$1(flow, continuation2, this, i5));
                TransactionPickerViewModel transactionPickerViewModel = (TransactionPickerViewModel) collectAsState3.getValue();
                gapComposer19.end(false);
                return transactionPickerViewModel;
            case 23:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 24:
                m3587models(flow, composer, i);
                return Unit.INSTANCE;
            case 25:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj;
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(359961417);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer20.changedInstance(this);
                Object rememberedValue20 = gapComposer20.rememberedValue();
                if (changedInstance4 || rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = new ExoPlayerVideoView.AnonymousClass2(this, continuation2, i10);
                    gapComposer20.updateRememberedValue(rememberedValue20);
                }
                Updater.LaunchedEffect(gapComposer20, unit4, (Function2) rememberedValue20);
                Updater.LaunchedEffect(gapComposer20, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation2, this, i6));
                String str31 = androidStringManager5.get(R.string.transfers_linked_accounts_nux_hero_text);
                String str32 = androidStringManager5.get(R.string.transfers_linked_accounts_nux_item_one_label);
                zzd zzdVar = Icons.Companion;
                LinkedAccountsNuxViewModel linkedAccountsNuxViewModel = new LinkedAccountsNuxViewModel(str31, androidStringManager5.get(R.string.transfers_linked_accounts_nux_cta_button_label), CollectionsKt__CollectionsKt.listOf((Object[]) new LinkedAccountsNuxViewModel.InfoItem[]{new LinkedAccountsNuxViewModel.InfoItem(str32, "MAHps6"), new LinkedAccountsNuxViewModel.InfoItem(androidStringManager5.get(R.string.transfers_linked_accounts_nux_item_two_label), "2QZJ1D")}));
                gapComposer20.end(false);
                return linkedAccountsNuxViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(388187299);
                Updater.LaunchedEffect(gapComposer21, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation2, this, i7));
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj;
                RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = new RecurringReloadsChangeInstrumentViewModel(androidStringManager6.get(R.string.recurring_reloads_change_instrument_title), androidStringManager6.get(R.string.recurring_reloads_change_instrument_body), androidStringManager6.get(R.string.recurring_reloads_change_instrument_button));
                gapComposer21.end(false);
                return recurringReloadsChangeInstrumentViewModel;
        }
    }

    public /* synthetic */ InviteErrorPresenter(Object obj, Object obj2, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.analytics = obj;
        this.args = obj2;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 6;
        quickPayExitRouterScreen.getClass();
        this.analytics = quickPayExitRouterScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl;
    }

    public InviteErrorPresenter(Analytics analytics, BlockersScreens.InviteErrorScreen inviteErrorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        inviteErrorScreen.getClass();
        this.analytics = analytics;
        this.args = inviteErrorScreen;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, BlockersScreens.ConfirmFirstScheduledReloadNoticeScreen confirmFirstScheduledReloadNoticeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        confirmFirstScheduledReloadNoticeScreen.getClass();
        this.analytics = androidStringManager;
        this.args = confirmFirstScheduledReloadNoticeScreen;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, PaymentScreens.RecipientSelectionWarningScreen recipientSelectionWarningScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        recipientSelectionWarningScreen.getClass();
        this.analytics = androidStringManager;
        this.args = recipientSelectionWarningScreen;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, OffersScreen$OffersTimelineScreenV2 offersScreen$OffersTimelineScreenV2, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        offersScreen$OffersTimelineScreenV2.getClass();
        this.analytics = androidStringManager;
        this.args = offersScreen$OffersTimelineScreenV2;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(ShoppingScreen$RestrictedItemWarningSheetScreen shoppingScreen$RestrictedItemWarningSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics) {
        this.$r8$classId = 18;
        shoppingScreen$RestrictedItemWarningSheetScreen.getClass();
        this.args = shoppingScreen$RestrictedItemWarningSheetScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
    }

    public InviteErrorPresenter(RealSupportNavigator realSupportNavigator, SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable chatSurveyUnavailable, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        chatSurveyUnavailable.getClass();
        this.analytics = realSupportNavigator;
        this.args = chatSurveyUnavailable;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(BetterNavigator.ScreenNavigator screenNavigator, CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog, Analytics analytics) {
        this.$r8$classId = 17;
        cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.getClass();
        this.navigator = screenNavigator;
        this.args = cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
        this.analytics = analytics;
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, RecurringReloadsChangeInstrumentScreen recurringReloadsChangeInstrumentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        recurringReloadsChangeInstrumentScreen.getClass();
        this.analytics = androidStringManager;
        this.navigator = screenNavigator;
        this.args = realTransfersInboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public InviteErrorPresenter(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, BetterNavigator.ScreenNavigator screenNavigator, TapToPayErrorScreen tapToPayErrorScreen) {
        this.$r8$classId = 24;
        tapToPayErrorScreen.getClass();
        this.analytics = realTapToPayAnalyticsHelper;
        this.navigator = screenNavigator;
        this.args = tapToPayErrorScreen;
    }

    public InviteErrorPresenter(OnboardableCountries onboardableCountries, CountrySelectorScreen countrySelectorScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        countrySelectorScreen.getClass();
        this.analytics = countrySelectorScreen;
        this.navigator = screenNavigator;
        this.args = CollectionsKt.sortedWith(onboardableCountries.countries, new b.C0008b(25));
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, KeyValue keyValue, LinkedAccountsNuxScreen linkedAccountsNuxScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        linkedAccountsNuxScreen.getClass();
        this.analytics = androidStringManager;
        this.args = keyValue;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(MarkwonConfiguration markwonConfiguration, SupportChatScreens.FlowScreen.ChatTransactionPicker chatTransactionPicker, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        chatTransactionPicker.getClass();
        this.analytics = markwonConfiguration;
        this.args = chatTransactionPicker;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(RealClientScenarioCompleter realClientScenarioCompleter, SupportScreens.SupportLoadClientScenarioScreen supportLoadClientScenarioScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        supportLoadClientScenarioScreen.getClass();
        this.analytics = realClientScenarioCompleter;
        this.args = supportLoadClientScenarioScreen;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(AndroidStringManager androidStringManager, ProfileScreens.ConfirmReplaceInfoSheet confirmReplaceInfoSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        confirmReplaceInfoSheet.getClass();
        this.analytics = androidStringManager;
        this.args = confirmReplaceInfoSheet;
        this.navigator = screenNavigator;
    }

    public /* synthetic */ InviteErrorPresenter(Object obj, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.args = obj;
        this.analytics = analytics;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(ColorModel colorModel, String str, String str2) {
        this.$r8$classId = 1;
        str.getClass();
        colorModel.getClass();
        this.analytics = str;
        this.args = colorModel;
        this.navigator = str2;
    }

    public InviteErrorPresenter(SyncValueReader syncValueReader, FlowStarter flowStarter, BetterNavigator.ScreenNavigator screenNavigator, ProfileScreens.TaxesPasswordScreen taxesPasswordScreen) {
        this.$r8$classId = 13;
        taxesPasswordScreen.getClass();
        this.analytics = syncValueReader;
        this.args = flowStarter;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics) {
        this.$r8$classId = 20;
        singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.getClass();
        this.args = singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
    }

    public InviteErrorPresenter(Analytics analytics, LimitsSectionScreen limitsSectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        limitsSectionScreen.getClass();
        this.analytics = analytics;
        this.args = limitsSectionScreen;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(RealP2pSettingsManager realP2pSettingsManager, AndroidStringManager androidStringManager, ProfileScreens.IncomingRequestsScreen incomingRequestsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        incomingRequestsScreen.getClass();
        this.analytics = realP2pSettingsManager;
        this.args = androidStringManager;
        this.navigator = screenNavigator;
    }

    public InviteErrorPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, CashSubscriptionsAppService cashSubscriptionsAppService, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        this.analytics = cashSubscriptionsAppService;
        this.navigator = screenNavigator;
        this.args = LazyKt.lazy(new ProfileKt$$ExternalSyntheticLambda11(6, realRouter$Factory$Impl, this));
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3587models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.$r8$classId;
        int i9 = 24;
        int i10 = 10;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        int i11 = 1;
        int i12 = 16;
        flow.getClass();
        switch (i8) {
            case 6:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1228048242);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation, i9);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(this, flow, i, 22);
                    break;
                }
                break;
            case 15:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(188013184);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer2, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation, this, 14));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, i9);
                    break;
                }
                break;
            case 17:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1700666675);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, i12));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, i10);
                    break;
                }
                break;
            case 21:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(-865591604);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer4.changedInstance(flow) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer4, flow, new ArticlePresenter$models$1$1(flow, continuation, this, i10));
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer4.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, i12);
                    break;
                }
                break;
            case 23:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(2048342174);
                if ((i & 6) == 0) {
                    i6 = i | (gapComposer5.changedInstance(flow) ? 4 : 2);
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                int i13 = 21;
                if (gapComposer5.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer5.changedInstance(this);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 23);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer5, unit, (Function2) rememberedValue2);
                    Updater.LaunchedEffect(gapComposer5, flow, new ArticlePresenter$models$1$1(flow, continuation, this, i13));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer5.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, i13);
                    break;
                }
                break;
            default:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(-1761232257);
                if ((i & 6) == 0) {
                    i7 = i | (gapComposer6.changedInstance(flow) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= gapComposer6.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer6.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance3 = gapComposer6.changedInstance(this);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 26);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer6, unit2, (Function2) rememberedValue3);
                    Updater.LaunchedEffect(gapComposer6, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, i11));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup6 = gapComposer6.endRestartGroup();
                if (endRestartGroup6 != null) {
                    endRestartGroup6.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, 7);
                    break;
                }
                break;
        }
    }
}
