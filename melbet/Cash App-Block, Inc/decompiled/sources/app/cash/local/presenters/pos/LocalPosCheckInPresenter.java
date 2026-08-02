package app.cash.local.presenters.pos;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.core.text.TextUtilsCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.api.ApiResult;
import app.cash.arcade.values.NavigationIconType;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.agents.applets.presenters.Agent;
import com.squareup.cash.agents.applets.presenters.AgentsState;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeContentState;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$BenefitsBreakdown;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$CallToActions;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$CommonQuestions;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$DefaultPerks;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$Disclosures;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$Insights;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.screens.BitcoinMapOnboardingScreen;
import com.squareup.cash.bitcoin.screens.SendStablecoinScreen;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanLoadingPresenter$handleFailure$1;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanLoadingPresenter$handleSuccess$1;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanLoadingViewModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.applets.presenters.RealBorrowAppletRepository;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.applets.viewmodels.BorrowEntryPointModel;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDocumentPresenter$loadOrderDocument$1;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDocumentScreen;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$InputMode;
import com.squareup.cash.cashapplite.screens.LiteBalanceHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteCashOutScreen;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cdf.benefitleaflet.BenefitType;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentageSubmitter;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earningstracker.screens.EarningsTimeframeSelectorSheetScreen;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;
import com.squareup.cash.earningstracker.viewmodels.TimeframeViewModel;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.activity.presenters.DependentActivitiesContextKt;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.SkipPaymentViewModel;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.presenters.autoinvest.CancelRecurringEquityPurchasePresenter$models$1$1;
import com.squareup.cash.investing.presenters.categories.FilterMapperKt$WhenMappings;
import com.squareup.cash.investing.presenters.categories.InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1;
import com.squareup.cash.investing.presenters.categories.SelectionState;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityDisplayCategory;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.blockstable.api.v1.BlockStableService;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayOrderDocumentUrlRequest;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayOrderDocumentUrlResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet$TextContent$Content$NumberedList;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet$TextContent$Content$TextBulletList;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet$TextContent$Content$TextLine;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalPosCheckInPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object cameraPermissions;
    public final Object launcher;
    public final Object navigator;
    public final Object store;
    public final Object stringManager;

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalPosCheckInPresenter(AfterpayAppletScreen$AfterpayAppletInfoSheet afterpayAppletScreen$AfterpayAppletInfoSheet, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics) {
        ArrayList arrayList;
        InfoSheet.TextBulletList textBulletList;
        InfoSheet.NumberedList numberedList;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        String str;
        AfterpayAppletInfoSheetViewModel.TextContentItem textLine;
        InfoSheet.NumberedList numberedList2;
        ArrayList arrayList2;
        AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList.NumberedItem numberedItem;
        String str2;
        InfoSheet.TextBulletList textBulletList2;
        ArrayList arrayList3;
        Iterator it;
        this.$r8$classId = 2;
        afterpayAppletScreen$AfterpayAppletInfoSheet.getClass();
        this.stringManager = afterpayAppletScreen$AfterpayAppletInfoSheet;
        this.navigator = screenNavigator;
        this.launcher = realAfterpayAppletAnalytics;
        String str3 = afterpayAppletScreen$AfterpayAppletInfoSheet.title;
        String str4 = afterpayAppletScreen$AfterpayAppletInfoSheet.subtitle;
        List list = afterpayAppletScreen$AfterpayAppletInfoSheet.textContent;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zzkv zzkvVar = ((InfoSheet.TextContent) it2.next()).content;
                if (zzkvVar != null) {
                    InfoSheet$TextContent$Content$TextBulletList infoSheet$TextContent$Content$TextBulletList = zzkvVar instanceof InfoSheet$TextContent$Content$TextBulletList ? (InfoSheet$TextContent$Content$TextBulletList) zzkvVar : null;
                    if (infoSheet$TextContent$Content$TextBulletList != null) {
                        textBulletList = infoSheet$TextContent$Content$TextBulletList.value;
                        if (textBulletList == null) {
                            if (zzkvVar != null) {
                                InfoSheet$TextContent$Content$TextBulletList infoSheet$TextContent$Content$TextBulletList2 = zzkvVar instanceof InfoSheet$TextContent$Content$TextBulletList ? (InfoSheet$TextContent$Content$TextBulletList) zzkvVar : null;
                                if (infoSheet$TextContent$Content$TextBulletList2 != null) {
                                    textBulletList2 = infoSheet$TextContent$Content$TextBulletList2.value;
                                    textBulletList2.getClass();
                                    List list2 = textBulletList2.text_bullet_list_item;
                                    arrayList3 = new ArrayList();
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        String str5 = ((LocalizedString) it.next()).translated_value;
                                        if (str5 != null) {
                                            arrayList3.add(str5);
                                        }
                                    }
                                    arrayList3 = arrayList3.isEmpty() ? null : arrayList3;
                                    if (arrayList3 != null) {
                                        textLine = new AfterpayAppletInfoSheetViewModel.TextContentItem.BulletList(arrayList3);
                                    }
                                    textLine = null;
                                }
                            }
                            textBulletList2 = null;
                            textBulletList2.getClass();
                            List list22 = textBulletList2.text_bullet_list_item;
                            arrayList3 = new ArrayList();
                            it = list22.iterator();
                            while (it.hasNext()) {
                            }
                            if (arrayList3.isEmpty()) {
                            }
                            if (arrayList3 != null) {
                            }
                            textLine = null;
                        } else {
                            if (zzkvVar != null) {
                                InfoSheet$TextContent$Content$NumberedList infoSheet$TextContent$Content$NumberedList = zzkvVar instanceof InfoSheet$TextContent$Content$NumberedList ? (InfoSheet$TextContent$Content$NumberedList) zzkvVar : null;
                                if (infoSheet$TextContent$Content$NumberedList != null) {
                                    numberedList = infoSheet$TextContent$Content$NumberedList.value;
                                    if (numberedList == null) {
                                        if (zzkvVar != null) {
                                            InfoSheet$TextContent$Content$NumberedList infoSheet$TextContent$Content$NumberedList2 = zzkvVar instanceof InfoSheet$TextContent$Content$NumberedList ? (InfoSheet$TextContent$Content$NumberedList) zzkvVar : null;
                                            if (infoSheet$TextContent$Content$NumberedList2 != null) {
                                                numberedList2 = infoSheet$TextContent$Content$NumberedList2.value;
                                                numberedList2.getClass();
                                                List<InfoSheet.NumberedListItem> list3 = numberedList2.numbered_list_item;
                                                arrayList2 = new ArrayList();
                                                for (InfoSheet.NumberedListItem numberedListItem : list3) {
                                                    LocalizedString localizedString3 = numberedListItem.title;
                                                    if (localizedString3 == null || (str2 = localizedString3.translated_value) == null) {
                                                        numberedItem = null;
                                                    } else {
                                                        LocalizedString localizedString4 = numberedListItem.subtitle;
                                                        numberedItem = new AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList.NumberedItem(str2, localizedString4 != null ? localizedString4.translated_value : null);
                                                    }
                                                    if (numberedItem != null) {
                                                        arrayList2.add(numberedItem);
                                                    }
                                                }
                                                arrayList2 = arrayList2.isEmpty() ? null : arrayList2;
                                                if (arrayList2 != null) {
                                                    textLine = new AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList(arrayList2);
                                                }
                                                textLine = null;
                                            }
                                        }
                                        numberedList2 = null;
                                        numberedList2.getClass();
                                        List<InfoSheet.NumberedListItem> list32 = numberedList2.numbered_list_item;
                                        arrayList2 = new ArrayList();
                                        while (r0.hasNext()) {
                                        }
                                        if (arrayList2.isEmpty()) {
                                        }
                                        if (arrayList2 != null) {
                                        }
                                        textLine = null;
                                    } else {
                                        if (zzkvVar != null) {
                                            InfoSheet$TextContent$Content$TextLine infoSheet$TextContent$Content$TextLine = zzkvVar instanceof InfoSheet$TextContent$Content$TextLine ? (InfoSheet$TextContent$Content$TextLine) zzkvVar : null;
                                            if (infoSheet$TextContent$Content$TextLine != null) {
                                                localizedString = infoSheet$TextContent$Content$TextLine.value;
                                                if (localizedString != null) {
                                                    if (zzkvVar != null) {
                                                        InfoSheet$TextContent$Content$TextLine infoSheet$TextContent$Content$TextLine2 = zzkvVar instanceof InfoSheet$TextContent$Content$TextLine ? (InfoSheet$TextContent$Content$TextLine) zzkvVar : null;
                                                        if (infoSheet$TextContent$Content$TextLine2 != null) {
                                                            localizedString2 = infoSheet$TextContent$Content$TextLine2.value;
                                                            localizedString2.getClass();
                                                            str = localizedString2.translated_value;
                                                            if (str != null) {
                                                                textLine = new AfterpayAppletInfoSheetViewModel.TextContentItem.TextLine(str);
                                                            }
                                                        }
                                                    }
                                                    localizedString2 = null;
                                                    localizedString2.getClass();
                                                    str = localizedString2.translated_value;
                                                    if (str != null) {
                                                    }
                                                }
                                                textLine = null;
                                            }
                                        }
                                        localizedString = null;
                                        if (localizedString != null) {
                                        }
                                        textLine = null;
                                    }
                                }
                            }
                            numberedList = null;
                            if (numberedList == null) {
                            }
                        }
                        if (textLine == null) {
                            arrayList4.add(textLine);
                        }
                    }
                }
                textBulletList = null;
                if (textBulletList == null) {
                }
                if (textLine == null) {
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        AfterpayAppletScreen$AfterpayAppletInfoSheet afterpayAppletScreen$AfterpayAppletInfoSheet2 = (AfterpayAppletScreen$AfterpayAppletInfoSheet) this.stringManager;
        Button button = afterpayAppletScreen$AfterpayAppletInfoSheet2.ctaButton;
        AnalyticsEvent analyticsEvent = afterpayAppletScreen$AfterpayAppletInfoSheet2.analyticViewEvent;
        List listOf = analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null;
        AnalyticsEvent analyticsEvent2 = ((AfterpayAppletScreen$AfterpayAppletInfoSheet) this.stringManager).analyticDismissEvent;
        this.store = Updater.mutableStateOf$default(new AfterpayAppletInfoSheetViewModel(str3, str4, arrayList, button, listOf, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null, ((AfterpayAppletScreen$AfterpayAppletInfoSheet) this.stringManager).avatar));
        this.cameraPermissions = realRouter$Factory$Impl.create$1((BetterNavigator.ScreenNavigator) this.navigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleFailure(LocalPosCheckInPresenter localPosCheckInPresenter, ApiResult.Failure failure, BlockersData blockersData, ContinuationImpl continuationImpl) {
        ScenarioPlanLoadingPresenter$handleFailure$1 scenarioPlanLoadingPresenter$handleFailure$1;
        int i;
        if (continuationImpl instanceof ScenarioPlanLoadingPresenter$handleFailure$1) {
            scenarioPlanLoadingPresenter$handleFailure$1 = (ScenarioPlanLoadingPresenter$handleFailure$1) continuationImpl;
            int i2 = scenarioPlanLoadingPresenter$handleFailure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scenarioPlanLoadingPresenter$handleFailure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scenarioPlanLoadingPresenter$handleFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scenarioPlanLoadingPresenter$handleFailure$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScenarioPlan scenarioPlan = (ScenarioPlan) localPosCheckInPresenter.cameraPermissions;
                    scenarioPlanLoadingPresenter$handleFailure$1.L$0 = failure;
                    scenarioPlanLoadingPresenter$handleFailure$1.label = 1;
                    if (scenarioPlan.onFailure(blockersData, scenarioPlanLoadingPresenter$handleFailure$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    failure = scenarioPlanLoadingPresenter$handleFailure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(new ScenarioPlanScreens.ScenarioPlanErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) localPosCheckInPresenter.stringManager, failure, null), ((ScenarioPlanScreens.ScenarioPlanLoadingScreen) localPosCheckInPresenter.store).accentColor));
                return Unit.INSTANCE;
            }
        }
        scenarioPlanLoadingPresenter$handleFailure$1 = new ScenarioPlanLoadingPresenter$handleFailure$1(localPosCheckInPresenter, continuationImpl);
        Object obj2 = scenarioPlanLoadingPresenter$handleFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scenarioPlanLoadingPresenter$handleFailure$1.label;
        if (i != 0) {
        }
        ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(new ScenarioPlanScreens.ScenarioPlanErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) localPosCheckInPresenter.stringManager, failure, null), ((ScenarioPlanScreens.ScenarioPlanLoadingScreen) localPosCheckInPresenter.store).accentColor));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSuccess(LocalPosCheckInPresenter localPosCheckInPresenter, BlockersData blockersData, ResponseContext responseContext, ContinuationImpl continuationImpl) {
        ScenarioPlanLoadingPresenter$handleSuccess$1 scenarioPlanLoadingPresenter$handleSuccess$1;
        int i;
        if (continuationImpl instanceof ScenarioPlanLoadingPresenter$handleSuccess$1) {
            scenarioPlanLoadingPresenter$handleSuccess$1 = (ScenarioPlanLoadingPresenter$handleSuccess$1) continuationImpl;
            int i2 = scenarioPlanLoadingPresenter$handleSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scenarioPlanLoadingPresenter$handleSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scenarioPlanLoadingPresenter$handleSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scenarioPlanLoadingPresenter$handleSuccess$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScenarioPlan scenarioPlan = (ScenarioPlan) localPosCheckInPresenter.cameraPermissions;
                    scenarioPlanLoadingPresenter$handleSuccess$1.L$0 = blockersData;
                    scenarioPlanLoadingPresenter$handleSuccess$1.L$1 = responseContext;
                    scenarioPlanLoadingPresenter$handleSuccess$1.label = 1;
                    if (scenarioPlan.onSuccess(blockersData, scenarioPlanLoadingPresenter$handleSuccess$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    responseContext = scenarioPlanLoadingPresenter$handleSuccess$1.L$1;
                    blockersData = scenarioPlanLoadingPresenter$handleSuccess$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(((BlockersDataNavigator) localPosCheckInPresenter.launcher).getNext((ScenarioPlanScreens.ScenarioPlanLoadingScreen) localPosCheckInPresenter.store, blockersData.updateFromResponseContext(responseContext, false)));
                return Unit.INSTANCE;
            }
        }
        scenarioPlanLoadingPresenter$handleSuccess$1 = new ScenarioPlanLoadingPresenter$handleSuccess$1(localPosCheckInPresenter, continuationImpl);
        Object obj2 = scenarioPlanLoadingPresenter$handleSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scenarioPlanLoadingPresenter$handleSuccess$1.label;
        if (i != 0) {
        }
        Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
        ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(((BlockersDataNavigator) localPosCheckInPresenter.launcher).getNext((ScenarioPlanScreens.ScenarioPlanLoadingScreen) localPosCheckInPresenter.store, blockersData.updateFromResponseContext(responseContext, false)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadOrderDocument(LocalPosCheckInPresenter localPosCheckInPresenter, ContinuationImpl continuationImpl) {
        AfterPayOrderDocumentPresenter$loadOrderDocument$1 afterPayOrderDocumentPresenter$loadOrderDocument$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof AfterPayOrderDocumentPresenter$loadOrderDocument$1) {
            afterPayOrderDocumentPresenter$loadOrderDocument$1 = (AfterPayOrderDocumentPresenter$loadOrderDocument$1) continuationImpl;
            int i2 = afterPayOrderDocumentPresenter$loadOrderDocument$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterPayOrderDocumentPresenter$loadOrderDocument$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterPayOrderDocumentPresenter$loadOrderDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterPayOrderDocumentPresenter$loadOrderDocument$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) localPosCheckInPresenter.launcher;
                    GetAfterpayOrderDocumentUrlRequest getAfterpayOrderDocumentUrlRequest = new GetAfterpayOrderDocumentUrlRequest(((AfterPayOrderDocumentScreen) localPosCheckInPresenter.cameraPermissions).orderId, ByteString.EMPTY);
                    afterPayOrderDocumentPresenter$loadOrderDocument$1.label = 1;
                    obj = cashApProxyClientService.getAfterpayOrderDocumentUrl(getAfterpayOrderDocumentUrlRequest, afterPayOrderDocumentPresenter$loadOrderDocument$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new AfterPayOrderDocumentViewModel.Loaded(((GetAfterpayOrderDocumentUrlResponse) ((ApiResult.Success) apiResult).response).document_url);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return new AfterPayOrderDocumentViewModel.Error(TextUtilsCompat.errorMessaging((AndroidStringManager) localPosCheckInPresenter.stringManager, (ApiResult.Failure) apiResult, null).message);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        afterPayOrderDocumentPresenter$loadOrderDocument$1 = new AfterPayOrderDocumentPresenter$loadOrderDocument$1(localPosCheckInPresenter, continuationImpl);
        Object obj2 = afterPayOrderDocumentPresenter$loadOrderDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterPayOrderDocumentPresenter$loadOrderDocument$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    public static final void access$routeAction(LocalPosCheckInPresenter localPosCheckInPresenter, String str) {
        RealRouter realRouter = (RealRouter) localPosCheckInPresenter.cameraPermissions;
        AfterpayAppletScreen$AfterpayAppletInfoSheet afterpayAppletScreen$AfterpayAppletInfoSheet = (AfterpayAppletScreen$AfterpayAppletInfoSheet) localPosCheckInPresenter.stringManager;
        realRouter.route(new RoutingParams(afterpayAppletScreen$AfterpayAppletInfoSheet, null, new AfterpayAppletScreen$AfterpayAppletHomeScreen(afterpayAppletScreen$AfterpayAppletInfoSheet.referrerFlowToken), null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e6 A[EDGE_INSN: B:100:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e6 A[EDGE_INSN: B:113:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6 A[EDGE_INSN: B:30:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6 A[EDGE_INSN: B:61:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6 A[EDGE_INSN: B:74:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[EDGE_INSN: B:87:0x00e6->B:31:0x00e6 BREAK  A[LOOP:0: B:2:0x0008->B:48:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List getDisclosures(BenefitsHub benefitsHub) {
        Object obj;
        ImageResourcesKt imageResourcesKt;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown;
        BenefitsHub.DefaultPerks defaultPerks;
        BenefitsHub.CallToActions callToActions;
        BenefitsHub.CommonQuestions commonQuestions;
        BenefitsHub.Disclosures disclosures;
        BenefitsHub.Insights insights;
        Iterator it = benefitsHub.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BenefitsHub.Section section = (BenefitsHub.Section) obj;
            ReflectionFactory reflectionFactory = Reflection.factory;
            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Disclosures.class);
            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                ImageResourcesKt imageResourcesKt2 = section.Body;
                if (imageResourcesKt2 != null) {
                    BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown = imageResourcesKt2 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt2 : null;
                    if (benefitsHub$Section$Body_$BenefitsBreakdown != null) {
                        benefitsBreakdown = benefitsHub$Section$Body_$BenefitsBreakdown.value;
                        if (benefitsBreakdown == null) {
                            break;
                        }
                    }
                }
                benefitsBreakdown = null;
                if (benefitsBreakdown == null) {
                }
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                ImageResourcesKt imageResourcesKt3 = section.Body;
                if (imageResourcesKt3 != null) {
                    BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks = imageResourcesKt3 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt3 : null;
                    if (benefitsHub$Section$Body_$DefaultPerks != null) {
                        defaultPerks = benefitsHub$Section$Body_$DefaultPerks.value;
                        if (defaultPerks == null) {
                            break;
                        }
                    }
                }
                defaultPerks = null;
                if (defaultPerks == null) {
                }
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                ImageResourcesKt imageResourcesKt4 = section.Body;
                if (imageResourcesKt4 != null) {
                    BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions = imageResourcesKt4 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt4 : null;
                    if (benefitsHub$Section$Body_$CallToActions != null) {
                        callToActions = benefitsHub$Section$Body_$CallToActions.value;
                        if (callToActions == null) {
                            break;
                        }
                    }
                }
                callToActions = null;
                if (callToActions == null) {
                }
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                ImageResourcesKt imageResourcesKt5 = section.Body;
                if (imageResourcesKt5 != null) {
                    BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions = imageResourcesKt5 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt5 : null;
                    if (benefitsHub$Section$Body_$CommonQuestions != null) {
                        commonQuestions = benefitsHub$Section$Body_$CommonQuestions.value;
                        if (commonQuestions == null) {
                            break;
                        }
                    }
                }
                commonQuestions = null;
                if (commonQuestions == null) {
                }
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                ImageResourcesKt imageResourcesKt6 = section.Body;
                if (imageResourcesKt6 != null) {
                    BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures = imageResourcesKt6 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt6 : null;
                    if (benefitsHub$Section$Body_$Disclosures != null) {
                        disclosures = benefitsHub$Section$Body_$Disclosures.value;
                        if (disclosures == null) {
                            break;
                        }
                    }
                }
                disclosures = null;
                if (disclosures == null) {
                }
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                ImageResourcesKt imageResourcesKt7 = section.Body;
                if (imageResourcesKt7 != null) {
                    BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights = imageResourcesKt7 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt7 : null;
                    if (benefitsHub$Section$Body_$Insights != null) {
                        insights = benefitsHub$Section$Body_$Insights.value;
                        if (insights == null) {
                            break;
                        }
                    }
                }
                insights = null;
                if (insights == null) {
                }
            } else {
                continue;
            }
        }
        BenefitsHub.Section section2 = (BenefitsHub.Section) obj;
        if (section2 != null && (imageResourcesKt = section2.Body) != null) {
            BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures2 = imageResourcesKt instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt : null;
            BenefitsHub.Disclosures disclosures2 = benefitsHub$Section$Body_$Disclosures2 != null ? benefitsHub$Section$Body_$Disclosures2.value : null;
            if (disclosures2 != null) {
                return disclosures2.details;
            }
        }
        return null;
    }

    private final Object models$com$squareup$cash$cashapplite$presenters$LiteBalanceHomePresenter(Flow flow, Composer composer, int i) {
        String str;
        Long l;
        String str2;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.cameraPermissions;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-734648680);
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState(((BalanceAppletTileRepository) this.launcher).balanceModel(), null, gapComposer, 1);
        BalanceRepositoryModel balanceRepositoryModel = (BalanceRepositoryModel) collectAsState.getValue();
        long j = 0;
        Money money = balanceRepositoryModel != null ? balanceRepositoryModel.balance : new Money((Long) 0L, CurrencyCode.USD, 4);
        String format2 = ((MoneyFormatter) this.store).format(money);
        BalanceRepositoryModel balanceRepositoryModel2 = (BalanceRepositoryModel) collectAsState.getValue();
        Money money2 = balanceRepositoryModel2 != null ? balanceRepositoryModel2.convertedBalance : null;
        if (money2 != null) {
            CurrencyCode currencyCode = money2.currency_code;
            if (currencyCode != null) {
                String currencySymbol = moneyFormatter.currencySymbol(currencyCode);
                String format3 = moneyFormatter.format(money2);
                currencySymbol.getClass();
                format3.getClass();
                Object[] objArr = {"MX", currencySymbol, format3};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                str2 = new MessageFormat(resources.getString(R.string.lite_converted_balance_label)).format(objArr);
                str2.getClass();
            } else {
                str2 = null;
            }
            str = str2;
        } else {
            str = null;
        }
        Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 23));
        Long l2 = money.amount;
        long longValue = l2 != null ? l2.longValue() : 0L;
        if (money2 != null && (l = money2.amount) != null) {
            j = l.longValue();
        }
        LiteBalanceHomeViewModel liteBalanceHomeViewModel = new LiteBalanceHomeViewModel(format2, longValue, str, j, androidStringManager.get(R.string.lite_balance_home_title), androidStringManager.get(R.string.lite_balance_home_section_title), androidStringManager.get(R.string.lite_balance_home_disclaimer), CollectionsKt__CollectionsKt.listOf((Object[]) new LiteBalanceHomeViewModel.AccountDetailRow[]{new LiteBalanceHomeViewModel.AccountDetailRow(LiteBalanceHomeViewModel.RowId.US_ROUTING_AND_ACCOUNT, androidStringManager.get(R.string.lite_balance_home_row_us_routing_title), androidStringManager.get(R.string.lite_balance_home_row_us_routing_subtitle)), new LiteBalanceHomeViewModel.AccountDetailRow(LiteBalanceHomeViewModel.RowId.CLABE, androidStringManager.get(R.string.lite_balance_home_row_clabe_title), androidStringManager.get(R.string.lite_balance_home_row_clabe_subtitle)), new LiteBalanceHomeViewModel.AccountDetailRow(LiteBalanceHomeViewModel.RowId.DIGITAL_WALLET, androidStringManager.get(R.string.lite_balance_home_row_digital_wallet_title), androidStringManager.get(R.string.lite_balance_home_row_digital_wallet_subtitle))}));
        gapComposer.end(false);
        return liteBalanceHomeViewModel;
    }

    private final Object models$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter(Flow flow, Composer composer, int i) {
        Object viewAmount;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2082015349);
        final Money money = ((LiteCashOutScreen) this.store).balance;
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        CurrencyCode currencyCode2 = currencyCode;
        Long l = money.amount;
        l.getClass();
        double longValue = l.longValue();
        CurrencyCode currencyCode3 = money.currency_code;
        currencyCode3.getClass();
        double displayDivisor = longValue / Moneys.displayDivisor(currencyCode3);
        final int i2 = 0;
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(money);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new Function0() { // from class: com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    Money money2 = money;
                    switch (i3) {
                    }
                    return Updater.mutableStateOf$default(money2);
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CardScene$$ExternalSyntheticLambda1(19);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        boolean changedInstance2 = gapComposer.changedInstance(money);
        Object rememberedValue3 = gapComposer.rememberedValue();
        final int i3 = 1;
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new Function0() { // from class: com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    Money money2 = money;
                    switch (i32) {
                    }
                    return Updater.mutableStateOf$default(money2);
                }
            };
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, flow, new EngineInterceptor$intercept$2(26, mutableState2, flow, this, currencyCode2, mutableState, (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer, 0), (Continuation) null));
        WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig = new WithdrawViewModel$AmountConfig$KeypadConfig((Money) mutableState.getValue(), displayDivisor, currencyCode2);
        int ordinal = ((LiteCashOutPresenter$InputMode) mutableState2.getValue()).ordinal();
        if (ordinal == 0) {
            viewAmount = new WithdrawViewModel.ViewAmount(androidStringManager.get(R.string.lite_cash_out_title), "", withdrawViewModel$AmountConfig$KeypadConfig, EmptyList.INSTANCE, ((MoneyFormatter) this.cameraPermissions).format((Money) mutableState.getValue()), androidStringManager.get(R.string.lite_cash_out_next_button), androidStringManager.get(R.string.lite_cash_out_change_amount_button), DepositPreference.TRANSFER_SLOWLY_WITHOUT_FEE, null, WithdrawViewModel.ViewAmount.DepositPreferenceStyle.DEFAULT);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            viewAmount = new WithdrawViewModel.ChangeAmount(androidStringManager.get(R.string.lite_cash_out_title), "", withdrawViewModel$AmountConfig$KeypadConfig, EmptyList.INSTANCE, androidStringManager.get(R.string.lite_cash_out_save_amount_button), true);
        }
        gapComposer.end(false);
        return viewAmount;
    }

    private final Object models$com$squareup$cash$crypto$common$presenters$BitcoinP2pConversionCustomPercentagePresenter(Flow flow, Composer composer, int i) {
        CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen bitcoinP2pConversionCustomPercentageScreen = (CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen) this.launcher;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2063475105);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 1;
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Recipient$$ExternalSyntheticLambda2(i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState, 15));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.end(false);
            return AmountPickerViewModel.InitialLoading.INSTANCE;
        }
        AmountPickerViewModel.Ready ready = new AmountPickerViewModel.Ready(bitcoinP2pConversionCustomPercentageScreen.header, bitcoinP2pConversionCustomPercentageScreen.subtitle, ((AndroidStringManager) this.stringManager).get(R.string.bitcoin_p2p_conversion_custom_percentage_button_text), new AmountPickerViewModel.Ready.Amount.PercentAmount(new BigDecimal(1)), new AmountPickerViewModel.Ready.Amount.PercentAmount(new BigDecimal(bitcoinP2pConversionCustomPercentageScreen.maxPercentageBps / 100)), false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, ((NumberFormat) ((Lazy) this.cameraPermissions).getValue()).format((long) Math.rint(bitcoinP2pConversionCustomPercentageScreen.startingPercentageBps / 100.0d)), false, false, null, AmountPickerViewModel.Ready.CloseAction.Back, 7488);
        gapComposer.end(false);
        return ready;
    }

    private final Object models$com$squareup$cash$directdeposit$presenters$DirectDepositEditFullNamePresenter(Flow flow, Composer composer, int i) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-556017977);
        Object[] objArr = new Object[0];
        RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) this.launcher;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue, (Composer) gapComposer, 0);
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, rememberSaveable, 24));
        DirectDepositSingleInputViewModel directDepositSingleInputViewModel = new DirectDepositSingleInputViewModel(DirectDepositSingleInputViewModel.Type.Name.INSTANCE, androidStringManager.get(R.string.direct_deposit_edit_full_name_title), androidStringManager.get(R.string.direct_deposit_edit_full_name_hint), androidStringManager.get(R.string.direct_deposit_edit_paycheck_save_button), null, (InputFieldText) rememberSaveable.getValue(), androidStringManager.get(R.string.direct_deposit_edit_full_name_desc), !StringsKt.isBlank(((InputFieldText) rememberSaveable.getValue()).getValue()), 48);
        gapComposer.end(false);
        return directDepositSingleInputViewModel;
    }

    private final Object models$com$squareup$cash$directdeposit$presenters$DirectDepositEditPaycheckPercentagePresenter(Flow flow, Composer composer, int i) {
        int parseInt;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-467547641);
        Object[] objArr = new Object[0];
        RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) this.launcher;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue, (Composer) gapComposer, 0);
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, rememberSaveable, 26));
        NavigationIconType.Companion companion = NavigationIconType.Companion;
        DirectDepositSingleInputViewModel directDepositSingleInputViewModel = new DirectDepositSingleInputViewModel(DirectDepositSingleInputViewModel.Type.PaycheckPercentage.INSTANCE, androidStringManager.get(R.string.direct_deposit_edit_paycheck_percentage_title), "", androidStringManager.get(R.string.direct_deposit_edit_paycheck_save_button), androidStringManager.get(R.string.direct_deposit_edit_paycheck_desc), (InputFieldText) rememberSaveable.getValue(), null, !StringsKt.isBlank(((InputFieldText) rememberSaveable.getValue()).getValue()) && 1 <= (parseInt = Integer.parseInt(((InputFieldText) rememberSaveable.getValue()).getValue().toString())) && parseInt < 101, 128);
        gapComposer.end(false);
        return directDepositSingleInputViewModel;
    }

    private final Object models$com$squareup$cash$earningstracker$presenters$EarningsTimeframeSelectorSheetPresenter(Flow flow, Composer composer, int i) {
        EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(746375899);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((SyncValueReader) this.launcher).getSingleValueOrDefault(AndroidSyncValueSpecs.C4bEarningsTrackerSummary, null, new RecipientQueries$$ExternalSyntheticLambda0(this, 17));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(((EarningsTimeframeSelectorSheetScreen) this.cameraPermissions).selectedTimeframe);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, mutableState, 7));
        boolean changed = gapComposer.changed(((Timeframe) mutableState.getValue()).ordinal()) | gapComposer.changed((LocalDate) receiveValueAsState.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            Timeframe timeframe = (Timeframe) mutableState.getValue();
            LocalDate localDate = (LocalDate) receiveValueAsState.getValue();
            AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
            if (localDate == null) {
                earningsTimeframeSelectorSheetViewModel = new EarningsTimeframeSelectorSheetViewModel(EmptyList.INSTANCE);
            } else {
                boolean z = localDate.getYear() < DimensionKt.nowLocalDate((AndroidClock) this.store).getYear();
                Timeframe timeframe2 = Timeframe.MONTHLY;
                TimeframeViewModel timeframeViewModel = new TimeframeViewModel(timeframe2, androidStringManager.get(R.string.earnings_tracker_timeframe_selector_monthly), timeframe == timeframe2);
                Timeframe timeframe3 = Timeframe.YEARLY;
                ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(timeframeViewModel, new TimeframeViewModel(timeframe3, androidStringManager.get(R.string.earnings_tracker_timeframe_selector_yearly), timeframe == timeframe3));
                if (z) {
                    Timeframe timeframe4 = Timeframe.ALL_TIME;
                    mutableListOf.add(new TimeframeViewModel(timeframe4, androidStringManager.get(R.string.earnings_tracker_timeframe_selector_all_time), timeframe == timeframe4));
                }
                earningsTimeframeSelectorSheetViewModel = new EarningsTimeframeSelectorSheetViewModel(mutableListOf);
            }
            rememberedValue3 = earningsTimeframeSelectorSheetViewModel;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel2 = (EarningsTimeframeSelectorSheetViewModel) rememberedValue3;
        gapComposer.end(false);
        return earningsTimeframeSelectorSheetViewModel2;
    }

    private final Object models$com$squareup$cash$family$familyhub$presenters$DependentActivityPresenter(Flow flow, Composer composer, int i) {
        String format2;
        DependentActivityScreen dependentActivityScreen = (DependentActivityScreen) this.store;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1396218620);
        Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) null, this, 20));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(((RealCustomerStore) this.launcher).getCustomerForId(dependentActivityScreen.dependentCustomerToken), 15);
            gapComposer.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
            rememberedValue = realGooglePayer$createWallet$$inlined$filter$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, "", null, gapComposer, 48, 2);
        boolean z = ((String) collectAsState.getValue()).length() == 0;
        if (z) {
            format2 = androidStringManager.get(R.string.family_account_dependent_activity_view_toolbar_title_without_dependent_first_name);
        } else {
            if (z) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int ordinal = dependentActivityScreen.activityType.ordinal();
            if (ordinal == 0 || ordinal == 2 || ordinal == 3) {
                String str = (String) collectAsState.getValue();
                str.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_activity_view_toolbar_title)).format(new Object[]{str});
                format2.getClass();
            } else {
                String str2 = (String) collectAsState.getValue();
                str2.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_savings_activity_view_toolbar_title)).format(new Object[]{str2});
                format2.getClass();
            }
        }
        FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel(((RealActivityEmbeddedPresenter) this.cameraPermissions).models(gapComposer, 0), format2);
        gapComposer.end(false);
        return fullScreenActivityViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$investing$presenters$categories$InvestingCategoryFilterPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        Object obj;
        FilterDetails[] filterDetailsArr;
        MutableState mutableState2;
        InvestingCategoryFilterViewModel.Content.FilterSection filterSection;
        Iterator it;
        InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection;
        Object obj2;
        SelectionState groupedSingleSelect;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        InvestingScreens.InvestingCategoryFilterScreen investingCategoryFilterScreen = (InvestingScreens.InvestingCategoryFilterScreen) this.cameraPermissions;
        RealCategoryBackend realCategoryBackend = (RealCategoryBackend) this.launcher;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1050596759);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue == obj3) {
            rememberedValue = realCategoryBackend.categoryDetails(investingCategoryFilterScreen.token);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        boolean z = false;
        if (((CategoryDetails) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingCategoryFilterViewModel.Loading.INSTANCE;
        }
        boolean changed = gapComposer.changed((CategoryDetails) collectAsState.getValue());
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 10;
        if (changed || rememberedValue2 == obj3) {
            CategoryDetails categoryDetails = (CategoryDetails) collectAsState.getValue();
            categoryDetails.getClass();
            ArrayList arrayList = categoryDetails.filters;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(realCategoryBackend.filterDetails(((FilterGroup) it2.next()).token));
            }
            rememberedValue2 = new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]), 4);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, new FilterDetails[0], null, gapComposer, 0, 2);
        boolean changed2 = gapComposer.changed((FilterDetails[]) collectAsState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj3) {
            FilterDetails[] filterDetailsArr2 = (FilterDetails[]) collectAsState2.getValue();
            filterDetailsArr2.getClass();
            ArrayList arrayList3 = new ArrayList(filterDetailsArr2.length);
            int length = filterDetailsArr2.length;
            int i3 = 0;
            while (i3 < length) {
                FilterDetails filterDetails = filterDetailsArr2[i3];
                if (filterDetails instanceof FilterDetails.Categories) {
                    FilterDetails.Categories categories = (FilterDetails.Categories) filterDetails;
                    String str = categories.token.value;
                    String str2 = categories.name;
                    ArrayList arrayList4 = categories.categories;
                    filterDetailsArr = filterDetailsArr2;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, i2));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Category category = (Category) it3.next();
                        arrayList5.add(new InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox(category.token.value, category.name, category.filterDescription, false));
                        it3 = it3;
                        collectAsState = collectAsState;
                    }
                    mutableState2 = collectAsState;
                    filterSection = new InvestingCategoryFilterViewModel.Content.FilterSection(str, str2, arrayList5);
                } else {
                    filterDetailsArr = filterDetailsArr2;
                    mutableState2 = collectAsState;
                    if (!(filterDetails instanceof FilterDetails.Subfilters)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FilterDetails.Subfilters subfilters = (FilterDetails.Subfilters) filterDetails;
                    List list = subfilters.subfilters;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        SyncInvestmentFilterGroup.Subfilter subfilter = (SyncInvestmentFilterGroup.Subfilter) it4.next();
                        SyncInvestmentFilterGroup.Subfilter.SubfilterType subfilterType = subfilter.f1392type;
                        int i4 = subfilterType == null ? -1 : FilterMapperKt$WhenMappings.$EnumSwitchMapping$0[subfilterType.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                String str3 = subfilter.token;
                                str3.getClass();
                                String str4 = subfilter.name;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = subfilter.placeholder_text;
                                String str7 = str6 == null ? "" : str6;
                                List<SyncInvestmentFilterGroup.SubfilterOption> list2 = subfilter.options;
                                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (SyncInvestmentFilterGroup.SubfilterOption subfilterOption : list2) {
                                    Iterator it5 = it4;
                                    String str8 = subfilterOption.token;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    String str9 = subfilterOption.name;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    arrayList7.add(new InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow(str8, str9));
                                    it4 = it5;
                                }
                                it = it4;
                                selection = new InvestingCategoryFilterViewModel.Content.FilterOption.Selection(str3, str5, str7, null, arrayList7);
                                if (selection == null) {
                                    arrayList6.add(selection);
                                }
                                it4 = it;
                            } else if (i4 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        it = it4;
                        selection = null;
                        if (selection == null) {
                        }
                        it4 = it;
                    }
                    filterSection = new InvestingCategoryFilterViewModel.Content.FilterSection(subfilters.token.value, subfilters.name, arrayList6);
                }
                arrayList3.add(filterSection);
                i3++;
                filterDetailsArr2 = filterDetailsArr;
                collectAsState = mutableState2;
                z = false;
                i2 = 10;
            }
            mutableState = collectAsState;
            obj = null;
            gapComposer.updateRememberedValue(arrayList3);
            obj2 = arrayList3;
        } else {
            mutableState = collectAsState;
            obj = null;
            obj2 = rememberedValue3;
        }
        Object obj4 = (List) obj2;
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue4;
        if (rememberedValue4 == obj3) {
            Map map = investingCategoryFilterScreen.filterMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((FilterToken) entry.getKey()).value, entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!(((FilterConfiguration) entry2.getValue()) instanceof FilterConfiguration.Empty)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size()));
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                Object key = entry3.getKey();
                FilterConfiguration filterConfiguration = (FilterConfiguration) entry3.getValue();
                if (filterConfiguration instanceof FilterConfiguration.Categories) {
                    List list3 = ((FilterConfiguration.Categories) filterConfiguration).categoryTokens;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(((CategoryToken) it6.next()).value);
                    }
                    groupedSingleSelect = new SelectionState.MultiSelect(CollectionsKt.toSet(arrayList8));
                } else {
                    if (!(filterConfiguration instanceof FilterConfiguration.SubFilters)) {
                        if (filterConfiguration instanceof FilterConfiguration.Empty) {
                            a$$ExternalSyntheticBUOutline0.m$1("Empty filter configuration should not be configured");
                            return obj;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj;
                    }
                    groupedSingleSelect = new SelectionState.GroupedSingleSelect(((FilterConfiguration.SubFilters) filterConfiguration).subFilterSelections);
                }
                linkedHashMap3.put(key, groupedSingleSelect);
            }
            List list4 = MapsKt___MapsKt.toList(linkedHashMap3);
            SnapshotStateMap snapshotStateMap = new SnapshotStateMap();
            snapshotStateMap.putAll(MapsKt__MapsKt.toMap(list4));
            gapComposer.updateRememberedValue(snapshotStateMap);
            obj5 = snapshotStateMap;
        }
        SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj5;
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, snapshotStateMap2, this, obj4, mutableState, collectAsState2, 9));
        boolean changed3 = gapComposer.changed(obj4);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue5 == obj3) {
            rememberedValue5 = Updater.derivedStateOf(new IntentLauncher$$ExternalSyntheticLambda0(19, obj4, snapshotStateMap2));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        State state = (State) rememberedValue5;
        Iterator it7 = MapsKt___MapsKt.toList(snapshotStateMap2).iterator();
        while (true) {
            boolean z2 = true;
            while (it7.hasNext()) {
                SelectionState selectionState = (SelectionState) ((Pair) it7.next()).second;
                if (selectionState instanceof SelectionState.GroupedSingleSelect) {
                    List list5 = (Iterable) obj4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it8 = list5.iterator();
                        while (it8.hasNext()) {
                            if (((InvestingCategoryFilterViewModel.Content.FilterSection) it8.next()).options.size() == ((SelectionState.GroupedSingleSelect) selectionState).groups.size()) {
                                break;
                            }
                        }
                    }
                    z2 = false;
                } else if (!(selectionState instanceof SelectionState.MultiSelect)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return obj;
                }
            }
            InvestingCategoryFilterViewModel.Content content = new InvestingCategoryFilterViewModel.Content((snapshotStateMap2.isEmpty() || !z2) ? androidStringManager.get(R.string.filter_done) : androidStringManager.get(R.string.filter_submit), (List) state.getValue(), z2);
            gapComposer.end(false);
            return content;
        }
    }

    private final Object models$com$squareup$cash$investing$presenters$categories$InvestingFilterCategoriesPresenter(Flow flow, Composer composer, int i) {
        String str;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        InvestingScreens.FilterCategoriesScreen filterCategoriesScreen = (InvestingScreens.FilterCategoriesScreen) this.cameraPermissions;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1499341236);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = FlowKt.take(new InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1(((RealCategoryBackend) this.launcher).filterDetails(filterCategoriesScreen.filterConfiguration.filterToken), i2), 1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        if (((FilterDetails.Categories) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return FilterCategoriesViewModel.Loading.INSTANCE;
        }
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            FilterDetails.Categories categories = (FilterDetails.Categories) collectAsState.getValue();
            categories.getClass();
            ArrayList<Category> arrayList = categories.categories;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (Category category : arrayList) {
                boolean contains = filterCategoriesScreen.filterConfiguration.categoryTokens.contains(category.token);
                ColorModel colorModel = filterCategoriesScreen.accentColor;
                colorModel.getClass();
                arrayList2.add(new FilterCategoriesViewModel.ChoiceRowModel(category.token, contains, category.name, category.filterDescription, colorModel));
            }
            rememberedValue2 = Updater.mutableStateOf$default(arrayList2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, (Continuation) null, this, mutableState, 18));
        FilterDetails.Categories categories2 = (FilterDetails.Categories) collectAsState.getValue();
        categories2.getClass();
        String str2 = categories2.name;
        String str3 = androidStringManager.get(R.string.filter_reset);
        List list = (List) mutableState.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((FilterCategoriesViewModel.ChoiceRowModel) it.next()).isChecked) {
                    str = androidStringManager.get(R.string.filter_submit);
                    break;
                }
            }
        }
        str = androidStringManager.get(R.string.filter_done);
        String str4 = str;
        FilterCategoriesViewModel.Content content = new FilterCategoriesViewModel.Content(filterCategoriesScreen.accentColor, str2, str3, str4, (List) mutableState.getValue());
        gapComposer.end(false);
        return content;
    }

    public static BenefitType toAnalyticsType(PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType) {
        switch (paycheckDepositStatusActiveBenefitType) {
            case UNSPECIFIED:
                return BenefitType.UNSPECIFIED;
            case FREE_OVERDRAFT_COVERAGE:
                return BenefitType.FREE_OVERDRAFT_COVERAGE;
            case HIGH_INTEREST_SAVINGS:
                return BenefitType.HIGH_INTEREST_SAVINGS;
            case PRIORITY_PHONE_SUPPORT:
                return BenefitType.PRIORITY_PHONE_SUPPORT;
            case REIMBURSED_ATM_FEES:
                return BenefitType.REIMBURSED_ATM_FEES;
            case COVERED_PAPER_MONEY_DEPOSIT:
                return BenefitType.COVERED_PAPER_MONEY_DEPOSIT;
            case GUARANTEED_ACCESS_TO_BORROW:
                return BenefitType.GUARANTEED_ACCESS_TO_BORROW;
            case FREE_INTERNATIONAL_CARD_TRANSACTION:
                return BenefitType.UNSPECIFIED;
            case INCREASED_BORROW_LIMIT:
                return BenefitType.INCREASED_BORROW_LIMIT;
            case CUSTOM_WEEKLY_OFFERS:
                return BenefitType.UNSPECIFIED;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object realImageLoader$execute$2;
        MutableState mutableState;
        String str;
        Object editProfilePresenter$models$2$1;
        String str2;
        MutableState mutableState2;
        Continuation continuation;
        Object loaded;
        Continuation continuation2;
        AgentsHomeContentState failure;
        Continuation continuation3;
        Continuation continuation4;
        MutableState mutableState3;
        Object obj;
        Object obj2;
        Object setNamePresenter$models$1$1$1;
        Boolean bool;
        MutableState mutableState4;
        MutableState mutableState5;
        QrCodeModel models;
        String str3;
        Object content;
        Long l;
        BorrowAppletTileModel loading;
        BorrowAppletTileModel uninstalled;
        BorrowAppletTileModel.Visual visual;
        BorrowAppletTileModel.Visual visual2;
        BorrowAppletTileModel.Installed.Row.Text text;
        boolean z;
        Iterable iterable;
        Iterator it;
        boolean z2;
        SubFilterViewModel subFilterIncrementalViewModel;
        String str4;
        int i2 = this.$r8$classId;
        int i3 = 18;
        int i4 = 14;
        int i5 = 2;
        int i6 = 17;
        Object obj3 = this.store;
        int i7 = 10;
        Object obj4 = this.launcher;
        Object obj5 = this.cameraPermissions;
        int i8 = 1;
        Object obj6 = this.stringManager;
        Object obj7 = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj6;
                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = (AndroidPermissionManager$create$1) obj5;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-818521790);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj7) {
                    rememberedValue = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) ((LocalInstalledStore) obj3)).syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalCashBalance), 11), i5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, 0L, null, gapComposer, 48, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj7) {
                    rememberedValue2 = androidPermissionManager$create$1.$readonly.granted();
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Continuation continuation5 = null;
                if (rememberedValue3 == obj7) {
                    Object flowUtil$createFlow$$inlined$map$1 = new FlowUtil$createFlow$$inlined$map$1(0, androidPermissionManager$create$1.$readonly.denied(), new LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1(3, null, 0));
                    gapComposer.updateRememberedValue(flowUtil$createFlow$$inlined$map$1);
                    rememberedValue3 = flowUtil$createFlow$$inlined$map$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, 0, null, gapComposer, 48, 2);
                Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$2(flow, continuation5, this, 8));
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj7) {
                    rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState6 = (MutableState) rememberedValue4;
                Boolean bool2 = (Boolean) collectAsState2.getValue();
                Integer valueOf = Integer.valueOf(((Number) collectAsState3.getValue()).intValue());
                Boolean bool3 = (Boolean) mutableState6.getValue();
                bool3.getClass();
                boolean changed = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(this);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed || rememberedValue5 == obj7) {
                    mutableState = collectAsState2;
                    realImageLoader$execute$2 = new RealImageLoader$execute$2(this, mutableState6, mutableState, null, 9);
                    gapComposer.updateRememberedValue(realImageLoader$execute$2);
                    str = null;
                } else {
                    mutableState = collectAsState2;
                    realImageLoader$execute$2 = rememberedValue5;
                    str = 0;
                }
                Updater.LaunchedEffect(bool2, valueOf, bool3, (Function2) realImageLoader$execute$2, gapComposer);
                Object[] objArr = {LocalsKt.prettyPrint$default(new LocalMoney(((Number) collectAsState.getValue()).longValue(), LocalCurrencyCode.USD), false, str, 3)};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_check_in_local_cash_amount)).format(objArr);
                format2.getClass();
                LocalPosCheckInViewModel localPosCheckInViewModel = new LocalPosCheckInViewModel(format2, androidStringManager.get(R.string.local_presenters_check_in_explanation), Intrinsics.areEqual((Boolean) mutableState.getValue(), Boolean.TRUE));
                gapComposer.end(false);
                return localPosCheckInViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1802935854);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == obj7) {
                    BlockersData.Flow.INSTANCE.getClass();
                    rememberedValue6 = BlockersData.Flow.Companion.generateToken();
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                String str5 = (String) rememberedValue6;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                Continuation continuation6 = null;
                if (changedInstance || rememberedValue7 == obj7) {
                    rememberedValue7 = new EditProfilePresenter$models$2$1(this, continuation6, 5);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState produceState = Updater.produceState(gapComposer2, emptyMap, (Function2) rememberedValue7);
                Unit unit = Unit.INSTANCE;
                boolean changed2 = gapComposer2.changed(produceState) | gapComposer2.changedInstance(this);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue8 == obj7) {
                    str2 = str5;
                    editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1(produceState, this, str2, continuation6, 4);
                    mutableState2 = produceState;
                    continuation = null;
                    gapComposer2.updateRememberedValue(editProfilePresenter$models$2$1);
                } else {
                    mutableState2 = produceState;
                    editProfilePresenter$models$2$1 = rememberedValue8;
                    continuation = null;
                    str2 = str5;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) editProfilePresenter$models$2$1);
                Updater.LaunchedEffect(gapComposer2, flow, new zzmo(flow, continuation, this, str2, 20));
                Map map = (Map) mutableState2.getValue();
                if (map.isEmpty()) {
                    loaded = AddAccountOptionsViewModel.Loading.INSTANCE;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() != SettingVisibility.HIDDEN) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        arrayList.add(new AddAccountOptionsViewModel.Loaded.AccountOption((AddAccountOptionsViewModel.Loaded.AccountOption.OptionType) entry2.getKey(), entry2.getValue() == SettingVisibility.VISIBLE));
                    }
                    loaded = new AddAccountOptionsViewModel.Loaded(arrayList);
                }
                gapComposer2.end(false);
                return loaded;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1314894902);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer3.changedInstance(this);
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (changedInstance2 || rememberedValue9 == obj7) {
                    rememberedValue9 = new ContextKt$$ExternalSyntheticLambda1(this, 6);
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                Updater.DisposableEffect(unit2, (Function1) rememberedValue9, gapComposer3);
                Updater.LaunchedEffect(gapComposer3, flow, new EditProfilePresenter$models$2$1(flow, (Continuation) null, this, 25));
                AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel = (AfterpayAppletInfoSheetViewModel) ((ParcelableSnapshotMutableState) obj3).getValue();
                gapComposer3.end(false);
                return afterpayAppletInfoSheetViewModel;
            case 3:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj6;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-499929569);
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (rememberedValue10 == obj7) {
                    rememberedValue10 = ((RealAgentsRepository) obj3).state;
                    gapComposer4.updateRememberedValue(rememberedValue10);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue10, null, gapComposer4, 1);
                Boolean valueOf2 = Boolean.valueOf(((AgentsHomeScreen) obj4).refreshAgentsOnStart);
                boolean changedInstance3 = gapComposer4.changedInstance(this);
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (changedInstance3 || rememberedValue11 == obj7) {
                    continuation2 = null;
                    rememberedValue11 = new MLKitTitleGenerator$1(this, continuation2, 9);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                } else {
                    continuation2 = null;
                }
                Updater.LaunchedEffect(gapComposer4, valueOf2, (Function2) rememberedValue11);
                Updater.LaunchedEffect(gapComposer4, flow, new ToastKt$Toast$9$1(flow, continuation2, this, i5));
                String str6 = androidStringManager2.get(R.string.agents_home_title);
                String str7 = androidStringManager2.get(R.string.agents_home_create_button);
                AgentsState agentsState = (AgentsState) collectAsState4.getValue();
                if (Intrinsics.areEqual(agentsState, AgentsState.Loading.INSTANCE)) {
                    failure = AgentsHomeContentState.Loading.INSTANCE;
                } else if (agentsState instanceof AgentsState.Installed) {
                    ArrayList<Agent> arrayList2 = ((AgentsState.Installed) agentsState).agents;
                    if (arrayList2.isEmpty()) {
                        failure = new AgentsHomeContentState.Empty(androidStringManager2.get(R.string.agents_home_empty_title), androidStringManager2.get(R.string.agents_home_empty_body));
                    } else {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        for (Agent agent : arrayList2) {
                            String str8 = agent.id;
                            String str9 = agent.title;
                            if (StringsKt.isBlank(str9)) {
                                str9 = androidStringManager2.get(R.string.agents_home_card_default_title);
                            }
                            arrayList3.add(new AgentCardViewModel(str8, str9, agent.subtitle));
                        }
                        failure = new AgentsHomeContentState.Content(arrayList3);
                    }
                } else {
                    if (!(agentsState instanceof AgentsState.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    failure = new AgentsHomeContentState.Failure(androidStringManager2.get(R.string.agents_home_error_title));
                }
                AgentsHomeViewModel agentsHomeViewModel = new AgentsHomeViewModel(str6, str7, failure);
                gapComposer4.end(false);
                return agentsHomeViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(1251870038);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (rememberedValue12 == obj7) {
                    rememberedValue12 = Updater.mutableStateOf$default(BenefitsLeafletViewModel.Loading.INSTANCE);
                    gapComposer5.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState7 = (MutableState) rememberedValue12;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer5.changedInstance(this);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (changedInstance4 || rememberedValue13 == obj7) {
                    continuation3 = null;
                    rememberedValue13 = new MLKitTitleGenerator$prepareModel$1(this, mutableState7, continuation3, i3);
                    gapComposer5.updateRememberedValue(rememberedValue13);
                } else {
                    continuation3 = null;
                }
                Updater.LaunchedEffect(gapComposer5, unit3, (Function2) rememberedValue13);
                Updater.LaunchedEffect(gapComposer5, flow, new ToastKt$Toast$9$1(flow, continuation3, this, 13));
                BenefitsLeafletViewModel benefitsLeafletViewModel = (BenefitsLeafletViewModel) mutableState7.getValue();
                gapComposer5.end(false);
                return benefitsLeafletViewModel;
            case 5:
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj6;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(744688907);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer6.changedInstance(this);
                Object rememberedValue14 = gapComposer6.rememberedValue();
                if (changedInstance5 || rememberedValue14 == obj7) {
                    continuation4 = null;
                    rememberedValue14 = new AmountPickerCondensedView.AnonymousClass14(this, continuation4, 11);
                    gapComposer6.updateRememberedValue(rememberedValue14);
                } else {
                    continuation4 = null;
                }
                Updater.LaunchedEffect(gapComposer6, unit4, (Function2) rememberedValue14);
                Updater.LaunchedEffect(gapComposer6, flow, new ToastKt$Toast$9$1(flow, continuation4, this, 16));
                RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel = new RecurringDepositsFirstTimeUserViewModel(androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_title), androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_subtitle), androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_continue_label), CollectionsKt__CollectionsKt.listOf((Object[]) new RecurringDepositsFirstTimeUserViewModel.InfoSection[]{new RecurringDepositsFirstTimeUserViewModel.InfoSection(androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_first_info_section_title), androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_first_info_section_description), RecurringDepositsFirstTimeUserViewModel.InfoSection.Icon.CIRCULAR_ARROWS), new RecurringDepositsFirstTimeUserViewModel.InfoSection(androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_second_info_section_title), androidStringManager3.get(R.string.recurring_deposits_first_time_user_experience_second_info_section_description), RecurringDepositsFirstTimeUserViewModel.InfoSection.Icon.PENCIL)}));
                gapComposer6.end(false);
                return recurringDepositsFirstTimeUserViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-418607986);
                Object rememberedValue15 = gapComposer7.rememberedValue();
                if (rememberedValue15 == obj7) {
                    Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new Object(), NeverEqualPolicy.INSTANCE);
                    gapComposer7.updateRememberedValue(parcelableSnapshotMutableState);
                    rememberedValue15 = parcelableSnapshotMutableState;
                }
                MutableState mutableState8 = (MutableState) rememberedValue15;
                Object rememberedValue16 = gapComposer7.rememberedValue();
                if (rememberedValue16 == obj7) {
                    rememberedValue16 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState9 = (MutableState) rememberedValue16;
                Object rememberedValue17 = gapComposer7.rememberedValue();
                if (rememberedValue17 == obj7) {
                    rememberedValue17 = Updater.mutableStateOf$default(BenefitsHubViewModel.Loading.INSTANCE);
                    gapComposer7.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState10 = (MutableState) rememberedValue17;
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer7.changedInstance(this);
                Object rememberedValue18 = gapComposer7.rememberedValue();
                if (changedInstance6 || rememberedValue18 == obj7) {
                    mutableState3 = mutableState10;
                    Object benefitsHubPresenter$models$1$1 = new BenefitsHubPresenter$models$1$1(mutableState8, this, mutableState3, mutableState9, (Continuation) null);
                    gapComposer7.updateRememberedValue(benefitsHubPresenter$models$1$1);
                    rememberedValue18 = benefitsHubPresenter$models$1$1;
                } else {
                    mutableState3 = mutableState10;
                }
                Updater.LaunchedEffect(gapComposer7, unit5, (Function2) rememberedValue18);
                MutableState mutableState11 = mutableState3;
                Updater.LaunchedEffect(gapComposer7, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, mutableState11, mutableState9, mutableState8, 22));
                BenefitsHubViewModel benefitsHubViewModel = (BenefitsHubViewModel) mutableState11.getValue();
                gapComposer7.end(false);
                return benefitsHubViewModel;
            case 7:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj6;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1894796741);
                Object rememberedValue19 = gapComposer8.rememberedValue();
                if (rememberedValue19 == obj7) {
                    rememberedValue19 = ((SyncValueReader) obj3).getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(i7));
                    gapComposer8.updateRememberedValue(rememberedValue19);
                }
                Continuation continuation7 = null;
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue19, null, gapComposer8, 1);
                Unit unit6 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer8.changedInstance(this);
                Object rememberedValue20 = gapComposer8.rememberedValue();
                if (changedInstance7 || rememberedValue20 == obj7) {
                    rememberedValue20 = new MLKitTitleGenerator$1(this, continuation7, i3);
                    gapComposer8.updateRememberedValue(rememberedValue20);
                }
                Updater.LaunchedEffect(gapComposer8, unit6, (Function2) rememberedValue20);
                Updater.LaunchedEffect(gapComposer8, flow, new BenefitsHubPresenter$models$1$1(flow, continuation7, this, collectAsState5, 15));
                PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = new PdsaBenefitsExplainerViewModel$Loaded(androidStringManager4.get(R.string.pdsa_benefits_explainer_sheet_title), androidStringManager4.get(R.string.pdsa_benefits_explainer_sheet_body), androidStringManager4.get(R.string.pdsa_benefits_explainer_sheet_primary_button_text));
                gapComposer8.end(false);
                return pdsaBenefitsExplainerViewModel$Loaded;
            case 8:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(1728853770);
                Object rememberedValue21 = gapComposer9.rememberedValue();
                if (rememberedValue21 == obj7) {
                    rememberedValue21 = ((RealBitcoinMapEligibilityManager) obj4).isLightningWithdrawEligible();
                    gapComposer9.updateRememberedValue(rememberedValue21);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer9, 48, 2);
                Updater.LaunchedEffect(gapComposer9, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) null, this, i4));
                if (((Boolean) collectAsState6.getValue()) != null) {
                    Boolean bool4 = (Boolean) collectAsState6.getValue();
                    bool4.getClass();
                    obj = new BitcoinMapOnboardingViewModel.Loaded(bool4.booleanValue());
                } else {
                    obj = BitcoinMapOnboardingViewModel.Loading.INSTANCE;
                }
                gapComposer9.end(false);
                return obj;
            case 9:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj6;
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(533409331);
                Object rememberedValue22 = gapComposer10.rememberedValue();
                if (rememberedValue22 == obj7) {
                    Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealProfileManager) obj5).publicProfile(), i6);
                    gapComposer10.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue22 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue22, null, null, gapComposer10, 48, 2);
                Object rememberedValue23 = gapComposer10.rememberedValue();
                if (rememberedValue23 == obj7) {
                    obj2 = null;
                    rememberedValue23 = Updater.mutableStateOf$default(null);
                    gapComposer10.updateRememberedValue(rememberedValue23);
                } else {
                    obj2 = null;
                }
                MutableState mutableState12 = (MutableState) rememberedValue23;
                Object rememberedValue24 = gapComposer10.rememberedValue();
                if (rememberedValue24 == obj7) {
                    rememberedValue24 = Updater.mutableStateOf$default(obj2);
                    gapComposer10.updateRememberedValue(rememberedValue24);
                }
                MutableState mutableState13 = (MutableState) rememberedValue24;
                Object rememberedValue25 = gapComposer10.rememberedValue();
                if (rememberedValue25 == obj7) {
                    rememberedValue25 = Updater.mutableStateOf$default(obj2);
                    gapComposer10.updateRememberedValue(rememberedValue25);
                }
                MutableState mutableState14 = (MutableState) rememberedValue25;
                Object rememberedValue26 = gapComposer10.rememberedValue();
                if (rememberedValue26 == obj7) {
                    rememberedValue26 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer10.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState15 = (MutableState) rememberedValue26;
                Boolean bool5 = (Boolean) mutableState15.getValue();
                bool5.booleanValue();
                boolean changedInstance8 = gapComposer10.changedInstance(this);
                Object rememberedValue27 = gapComposer10.rememberedValue();
                if (changedInstance8 || rememberedValue27 == obj7) {
                    bool = bool5;
                    setNamePresenter$models$1$1$1 = new SetNamePresenter$models$1$1$1(this, mutableState13, mutableState12, mutableState14, null, 7);
                    mutableState4 = mutableState13;
                    mutableState5 = mutableState12;
                    gapComposer10.updateRememberedValue(setNamePresenter$models$1$1$1);
                } else {
                    mutableState5 = mutableState12;
                    mutableState4 = mutableState13;
                    setNamePresenter$models$1$1$1 = rememberedValue27;
                    bool = bool5;
                }
                Updater.LaunchedEffect(gapComposer10, bool, (Function2) setNamePresenter$models$1$1$1);
                Updater.LaunchedEffect(gapComposer10, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, mutableState14, mutableState15, 19));
                String str10 = (String) mutableState5.getValue();
                String str11 = (String) mutableState4.getValue();
                if (str11 != null) {
                    gapComposer10.startReplaceGroup(-738090124);
                    gapComposer10.end(false);
                    models = new QrCodeModel(str11, 3, false);
                } else if (str10 == null) {
                    gapComposer10.startReplaceGroup(-738088137);
                    gapComposer10.end(false);
                    models = new QrCodeModel((String) null, 4, true);
                } else {
                    gapComposer10.startReplaceGroup(-738085251);
                    models = ((RealQrCodesPresenter) obj3).models(new QrCodeArgs((Integer) null, (Integer) null, (Integer) null, (Integer) null, (CurrencyCode) null, 0, 72), str10, gapComposer10, 0);
                    gapComposer10.end(false);
                }
                String str12 = (String) collectAsState7.getValue();
                str3 = str12 != null ? str12 : "";
                Resources resources2 = androidStringManager5.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.stablecoin_deposit_description)).format(new Object[]{str3, "USDC"});
                format3.getClass();
                String format4 = new MessageFormat(resources2.getString(R.string.stablecoin_deposit_copy_disclaimer)).format(new Object[]{"Solana"});
                format4.getClass();
                StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = new StablecoinDepositViewModel$Loaded(models, format3, "Solana", format4);
                gapComposer10.end(false);
                return stablecoinDepositViewModel$Loaded;
            case 10:
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj6;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(1368346940);
                Object rememberedValue28 = gapComposer11.rememberedValue();
                if (rememberedValue28 == obj7) {
                    rememberedValue28 = factory.create(MoneyFormatterConfig.STANDARD);
                    gapComposer11.updateRememberedValue(rememberedValue28);
                }
                MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue28;
                Object rememberedValue29 = gapComposer11.rememberedValue();
                if (rememberedValue29 == obj7) {
                    rememberedValue29 = factory.createNoSymbolCompact();
                    gapComposer11.updateRememberedValue(rememberedValue29);
                }
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) rememberedValue29;
                Object rememberedValue30 = gapComposer11.rememberedValue();
                if (rememberedValue30 == obj7) {
                    rememberedValue30 = ((RealBalanceSnapshotManager) obj4).select();
                    gapComposer11.updateRememberedValue(rememberedValue30);
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue30, null, null, gapComposer11, 48, 2);
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState8.getValue();
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(balanceSnapshot != null ? balanceSnapshot.balance : null, gapComposer11);
                Object[] objArr2 = new Object[0];
                Object rememberedValue31 = gapComposer11.rememberedValue();
                if (rememberedValue31 == obj7) {
                    rememberedValue31 = new SsnViewKt$$ExternalSyntheticLambda0(10);
                    gapComposer11.updateRememberedValue(rememberedValue31);
                }
                MutableState mutableState16 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue31, gapComposer11, 48);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Object[] objArr3 = new Object[0];
                Object rememberedValue32 = gapComposer11.rememberedValue();
                if (rememberedValue32 == obj7) {
                    rememberedValue32 = new SsnViewKt$$ExternalSyntheticLambda0(11);
                    gapComposer11.updateRememberedValue(rememberedValue32);
                }
                Object rememberSaveable = SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue32, gapComposer11, 48);
                ref$ObjectRef.element = rememberSaveable;
                long longValue = ((ParcelableSnapshotMutableLongState) rememberSaveable).getLongValue();
                Money money = (Money) rememberUpdatedState.getValue();
                boolean z3 = longValue > ((money == null || (l = money.amount) == null) ? 0L : l.longValue()) || ((ParcelableSnapshotMutableLongState) ref$ObjectRef.element).getLongValue() <= 0;
                Updater.LaunchedEffect(gapComposer11, flow, new EngineInterceptor$intercept$2(16, rememberUpdatedState, flow, ref$ObjectRef, this, moneyFormatter2, mutableState16, (Continuation) null));
                if (((BalanceSnapshot) collectAsState8.getValue()) == null) {
                    content = SendStablecoinModel.Loading.INSTANCE;
                } else {
                    Money money2 = (Money) rememberUpdatedState.getValue();
                    money2.getClass();
                    String format5 = moneyFormatter.format(money2);
                    Money money3 = (Money) rememberUpdatedState.getValue();
                    money3.getClass();
                    content = new SendStablecoinModel.Content(!z3, money3, z3, (String) mutableState16.getValue(), Recorder$$ExternalSyntheticOutline2.m$1(format5, " available"), ((SendStablecoinScreen) obj5).showQrScannerButton);
                }
                gapComposer11.end(false);
                return content;
            case 11:
                m1222models(flow, composer, i);
                return Unit.INSTANCE;
            case 12:
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj6;
                BlockersScreens.CardActivationQrScreen cardActivationQrScreen = (BlockersScreens.CardActivationQrScreen) obj5;
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-946557981);
                Object rememberedValue33 = gapComposer12.rememberedValue();
                if (rememberedValue33 == obj7) {
                    rememberedValue33 = ((PermissionChecker) obj4).granted("android.permission.CAMERA");
                    gapComposer12.updateRememberedValue(rememberedValue33);
                }
                MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue33, Boolean.FALSE, null, gapComposer12, 48, 2);
                Unit unit7 = Unit.INSTANCE;
                boolean changedInstance9 = gapComposer12.changedInstance(this);
                Object rememberedValue34 = gapComposer12.rememberedValue();
                if (changedInstance9 || rememberedValue34 == obj7) {
                    rememberedValue34 = new AmountPickerCondensedView.AnonymousClass14(this, null, 27);
                    gapComposer12.updateRememberedValue(rememberedValue34);
                }
                Updater.LaunchedEffect(gapComposer12, unit7, (Function2) rememberedValue34);
                String str13 = cardActivationQrScreen.titleText;
                str3 = str13 != null ? str13 : "";
                String str14 = cardActivationQrScreen.buttonText;
                if (str14 == null) {
                    str14 = androidStringManager6.get(R.string.blockers_card_activation_missing_text);
                }
                String str15 = cardActivationQrScreen.instructionText;
                if (str15 == null) {
                    str15 = androidStringManager6.get(R.string.blockers_card_activation_qr_instruction);
                }
                CardActivationQrViewModel cardActivationQrViewModel = new CardActivationQrViewModel(str14, str3, str15, ((Boolean) collectAsState9.getValue()).booleanValue());
                Updater.LaunchedEffect(gapComposer12, flow, new CashtagPresenter$models$2$1(flow, (Continuation) null, this, i7));
                gapComposer12.end(false);
                return cardActivationQrViewModel;
            case 13:
                m1222models(flow, composer, i);
                return Unit.INSTANCE;
            case 14:
                m1222models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-26465536);
                Object rememberedValue35 = gapComposer13.rememberedValue();
                if (rememberedValue35 == obj7) {
                    rememberedValue35 = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer13.updateRememberedValue(rememberedValue35);
                }
                MutableState mutableState17 = (MutableState) rememberedValue35;
                if (((Boolean) mutableState17.getValue()).booleanValue()) {
                    gapComposer13.startReplaceGroup(1839343888);
                    boolean changedInstance10 = gapComposer13.changedInstance(this);
                    Object rememberedValue36 = gapComposer13.rememberedValue();
                    if (changedInstance10 || rememberedValue36 == obj7) {
                        rememberedValue36 = new FileBlockerView$6$2$2(this, mutableState17, (Continuation) null, i6);
                        gapComposer13.updateRememberedValue(rememberedValue36);
                    }
                    Updater.LaunchedEffect(gapComposer13, "load-scenario-plan", (Function2) rememberedValue36);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.startReplaceGroup(1839699458);
                    gapComposer13.end(false);
                }
                Object obj8 = ((Boolean) mutableState17.getValue()).booleanValue() ? ScenarioPlanLoadingViewModel.Loading.INSTANCE : ScenarioPlanLoadingViewModel.Loaded.INSTANCE;
                gapComposer13.end(false);
                return obj8;
            case 16:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-634143987);
                Object rememberedValue37 = gapComposer14.rememberedValue();
                if (rememberedValue37 == obj7) {
                    rememberedValue37 = ((RealBorrowAppletRepository) obj6).tileEntryPointModel;
                    gapComposer14.updateRememberedValue(rememberedValue37);
                }
                BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations = null;
                MutableState collectAsState10 = Updater.collectAsState((StateFlow) rememberedValue37, null, gapComposer14, 1);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj5;
                verifyCheckDialogPresenter.getClass();
                gapComposer14.startReplaceGroup(-1613152821);
                boolean changed3 = gapComposer14.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue38 = gapComposer14.rememberedValue();
                if (changed3 || rememberedValue38 == obj7) {
                    rememberedValue38 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, i6);
                    gapComposer14.updateRememberedValue(rememberedValue38);
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue38, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer14, 0, 2).getValue();
                gapComposer14.end(false);
                PromotedAppletTileViewModel.Loaded loaded2 = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
                BorrowEntryPointModel borrowEntryPointModel = (BorrowEntryPointModel) collectAsState10.getValue();
                if (borrowEntryPointModel != null) {
                    if (borrowEntryPointModel instanceof BorrowEntryPointModel.Installed) {
                        BorrowEntryPointModel.Installed installed = (BorrowEntryPointModel.Installed) borrowEntryPointModel;
                        BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = installed.fullWidthTile;
                        List<BorrowData.AppletData.EntryPointData.TileEntryPoint.Row> list = fullWidthTile.rows;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row row : list) {
                            zzjk zzjkVar = row.visual;
                            BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations2 = zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations ? (BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) zzjkVar : borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations;
                            BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations2 != null ? borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations2.value : borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations;
                            BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic = zzjkVar instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic ? (BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) zzjkVar : borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations;
                            BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic = borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic != 0 ? borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic.value : borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations;
                            if (allocations != 0) {
                                List<BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation> list2 = allocations.values;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations.Allocation allocation : list2) {
                                    Color color = allocation.color;
                                    color.getClass();
                                    Float f = allocation.percent;
                                    f.getClass();
                                    arrayList5.add(new Pair(color, f));
                                }
                                visual2 = new BorrowAppletTileModel.Visual.Allocations(arrayList5);
                            } else if (graphic != 0) {
                                Color color2 = graphic.primary_color;
                                color2.getClass();
                                visual2 = new BorrowAppletTileModel.Visual.Graphic(color2, graphic.foreground_icon, graphic.foreground_color);
                            } else {
                                visual2 = null;
                            }
                            BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.DetailText detailText = row.text;
                            if (detailText != null) {
                                LocalizedString localizedString = detailText.emphasis;
                                String str16 = localizedString != null ? localizedString.translated_value : null;
                                LocalizedString localizedString2 = detailText.brief;
                                text = new BorrowAppletTileModel.Installed.Row.Text(str16, localizedString2 != null ? localizedString2.translated_value : null);
                            } else {
                                text = null;
                            }
                            arrayList4.add(new BorrowAppletTileModel.Installed.Row(visual2, text));
                            borrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations = null;
                        }
                        Iterator it2 = arrayList4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                visual = ((BorrowAppletTileModel.Installed.Row) it2.next()).visual;
                                if (visual != null) {
                                }
                            } else {
                                visual = null;
                            }
                        }
                        String str17 = installed.clientRoute;
                        LocalizedString localizedString3 = fullWidthTile.title;
                        localizedString3.getClass();
                        String str18 = localizedString3.translated_value;
                        str18.getClass();
                        uninstalled = new BorrowAppletTileModel.Installed(str17, str18, arrayList4, visual);
                    } else {
                        if (!(borrowEntryPointModel instanceof BorrowEntryPointModel.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BorrowEntryPointModel.Uninstalled uninstalled2 = (BorrowEntryPointModel.Uninstalled) borrowEntryPointModel;
                        String str19 = uninstalled2.clientRoute;
                        BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = uninstalled2.halfWidthTile;
                        LocalizedString localizedString4 = halfWidthTile.title;
                        localizedString4.getClass();
                        String str20 = localizedString4.translated_value;
                        str20.getClass();
                        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic2 = halfWidthTile.graphic;
                        graphic2.getClass();
                        Color color3 = graphic2.primary_color;
                        color3.getClass();
                        BorrowAppletTileModel.Visual.Graphic graphic3 = new BorrowAppletTileModel.Visual.Graphic(color3, graphic2.foreground_icon, graphic2.foreground_color);
                        LocalizedString localizedString5 = halfWidthTile.secondary_text;
                        uninstalled = new BorrowAppletTileModel.Uninstalled(str19, str20, graphic3, localizedString5 != null ? localizedString5.translated_value : null, loaded2);
                    }
                    loading = uninstalled;
                } else {
                    loading = new BorrowAppletTileModel.Loading();
                }
                Updater.LaunchedEffect(gapComposer14, flow, new RealBoostSelector$removeBoost$1(flow, (Continuation) null, this, Updater.rememberUpdatedState(loading, gapComposer14), 11));
                gapComposer14.end(false);
                return loading;
            case 17:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-199469462);
                Object rememberedValue39 = gapComposer15.rememberedValue();
                if (rememberedValue39 == obj7) {
                    rememberedValue39 = Updater.mutableStateOf$default(AfterPayOrderDocumentViewModel.Loading.INSTANCE);
                    gapComposer15.updateRememberedValue(rememberedValue39);
                }
                MutableState mutableState18 = (MutableState) rememberedValue39;
                Continuation continuation8 = null;
                Updater.LaunchedEffect(gapComposer15, flow, new RealBoostSelector$removeBoost$1(flow, continuation8, this, mutableState18, 19));
                if (((AfterPayOrderDocumentViewModel) mutableState18.getValue()) instanceof AfterPayOrderDocumentViewModel.Loading) {
                    gapComposer15.startReplaceGroup(1840375439);
                    boolean changedInstance11 = gapComposer15.changedInstance(this);
                    Object rememberedValue40 = gapComposer15.rememberedValue();
                    if (changedInstance11 || rememberedValue40 == obj7) {
                        rememberedValue40 = new CardStudioPresenter$models$1$1(this, mutableState18, continuation8, 3);
                        gapComposer15.updateRememberedValue(rememberedValue40);
                    }
                    Updater.LaunchedEffect(gapComposer15, "load-order-documents", (Function2) rememberedValue40);
                    gapComposer15.end(false);
                } else {
                    gapComposer15.startReplaceGroup(1840691608);
                    gapComposer15.end(false);
                }
                AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel = (AfterPayOrderDocumentViewModel) mutableState18.getValue();
                gapComposer15.end(false);
                return afterPayOrderDocumentViewModel;
            case 18:
                return models$com$squareup$cash$cashapplite$presenters$LiteBalanceHomePresenter(flow, composer, i);
            case 19:
                return models$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter(flow, composer, i);
            case 20:
                return models$com$squareup$cash$crypto$common$presenters$BitcoinP2pConversionCustomPercentagePresenter(flow, composer, i);
            case 21:
                return models$com$squareup$cash$directdeposit$presenters$DirectDepositEditFullNamePresenter(flow, composer, i);
            case 22:
                return models$com$squareup$cash$directdeposit$presenters$DirectDepositEditPaycheckPercentagePresenter(flow, composer, i);
            case 23:
                return models$com$squareup$cash$earningstracker$presenters$EarningsTimeframeSelectorSheetPresenter(flow, composer, i);
            case 24:
                return models$com$squareup$cash$family$familyhub$presenters$DependentActivityPresenter(flow, composer, i);
            case 25:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(-704706838);
                Object rememberedValue41 = gapComposer16.rememberedValue();
                if (rememberedValue41 == obj7) {
                    Object transform$special$$inlined$map$1 = new Transform$special$$inlined$map$1(((RealLegacyActivityEntityManager) obj4).renderedPayment(((HistoryScreens.SkipPayment) obj5).paymentToken), this, i6);
                    gapComposer16.updateRememberedValue(transform$special$$inlined$map$1);
                    rememberedValue41 = transform$special$$inlined$map$1;
                }
                MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue41, new SkipPaymentViewModel(((AndroidStringManager) obj6).get(R.string.history_skip_loan_payment_default_message)), null, gapComposer16, 0, 2);
                Updater.LaunchedEffect(gapComposer16, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) null, this, i4));
                SkipPaymentViewModel skipPaymentViewModel = (SkipPaymentViewModel) collectAsState11.getValue();
                gapComposer16.end(false);
                return skipPaymentViewModel;
            case 26:
                m1222models(flow, composer, i);
                return Unit.INSTANCE;
            case 27:
                return models$com$squareup$cash$investing$presenters$categories$InvestingCategoryFilterPresenter(flow, composer, i);
            case 28:
                return models$com$squareup$cash$investing$presenters$categories$InvestingFilterCategoriesPresenter(flow, composer, i);
            default:
                AndroidStringManager androidStringManager7 = (AndroidStringManager) obj6;
                InvestingScreens.FilterSubFiltersScreen filterSubFiltersScreen = (InvestingScreens.FilterSubFiltersScreen) obj5;
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(436529707);
                Object rememberedValue42 = gapComposer17.rememberedValue();
                if (rememberedValue42 == obj7) {
                    rememberedValue42 = FlowKt.take(new InvestingFilterCategoriesPresenter$models$lambda$0$$inlined$map$1(((RealCategoryBackend) obj4).filterDetails(filterSubFiltersScreen.filterConfiguration.filterToken), i8), 1);
                    gapComposer17.updateRememberedValue(rememberedValue42);
                }
                MutableState collectAsState12 = Updater.collectAsState((Flow) rememberedValue42, null, null, gapComposer17, 48, 2);
                if (((FilterDetails.Subfilters) collectAsState12.getValue()) == null) {
                    gapComposer17.end(false);
                    return FilterSubFiltersViewModel.Loading.INSTANCE;
                }
                FilterDetails.Subfilters subfilters = (FilterDetails.Subfilters) collectAsState12.getValue();
                subfilters.getClass();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                Object rememberedValue43 = gapComposer17.rememberedValue();
                if (rememberedValue43 == obj7) {
                    List<SyncInvestmentFilterGroup.Subfilter> list3 = subfilters.subfilters;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (SyncInvestmentFilterGroup.Subfilter subfilter : list3) {
                        ColorModel colorModel = filterSubFiltersScreen.accentColor;
                        subfilter.getClass();
                        String str21 = subfilter.token;
                        SyncInvestmentFilterGroup.Subfilter.SubfilterType subfilterType = subfilter.f1392type;
                        colorModel.getClass();
                        String str22 = subfilter.name;
                        subfilterType.getClass();
                        int ordinal = subfilterType.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                str21.getClass();
                                str22.getClass();
                                List list4 = subfilter.options;
                                String str23 = subfilter.placeholder_text;
                                str23.getClass();
                                Long l2 = subfilter.placeholder_index;
                                l2.getClass();
                                subFilterIncrementalViewModel = new SubFilterViewModel.SubFilterIncrementalViewModel(str21, str22, list4, str23, (int) l2.longValue(), true, true, null);
                                str4 = str21;
                            } else if (ordinal == 2) {
                                str21.getClass();
                                str22.getClass();
                                subFilterIncrementalViewModel = new SubFilterViewModel.SubFilterSelectionViewModel(colorModel, str21, str22, null, subfilter.options);
                                str4 = str21;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            arrayList6.add(subFilterIncrementalViewModel.copyWithSelectedOption((String) filterSubFiltersScreen.filterConfiguration.subFilterSelections.get(str4)));
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$1(subfilterType, "Unsupported type ");
                        }
                        return null;
                        break;
                    }
                    rememberedValue43 = Updater.mutableStateOf$default(arrayList6);
                    gapComposer17.updateRememberedValue(rememberedValue43);
                }
                MutableState mutableState19 = (MutableState) rememberedValue43;
                ref$ObjectRef2.element = mutableState19;
                Iterable iterable2 = (Iterable) mutableState19.getValue();
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                        if (((SubFilterViewModel) it3.next()).getSelectedOptionToken() == null) {
                            z = false;
                            iterable = (Iterable) ((MutableState) ref$ObjectRef2.element).getValue();
                            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (((SubFilterViewModel) it.next()).getSelectedOptionToken() != null) {
                                        z2 = false;
                                        FilterSubFiltersViewModel.Content content2 = new FilterSubFiltersViewModel.Content(androidStringManager7.get(R.string.filter_reset), z2 ? androidStringManager7.get(R.string.filter_done) : androidStringManager7.get(R.string.filter_submit), !z || z2, (List) ((MutableState) ref$ObjectRef2.element).getValue(), filterSubFiltersScreen.accentColor);
                                        Updater.LaunchedEffect(flow, content2, ref$ObjectRef2.element, new GLThread$start$2(flow, content2, this, ref$ObjectRef2, null, 19), gapComposer17);
                                        gapComposer17.end(false);
                                        return content2;
                                    }
                                }
                            }
                            z2 = true;
                            FilterSubFiltersViewModel.Content content22 = new FilterSubFiltersViewModel.Content(androidStringManager7.get(R.string.filter_reset), z2 ? androidStringManager7.get(R.string.filter_done) : androidStringManager7.get(R.string.filter_submit), !z || z2, (List) ((MutableState) ref$ObjectRef2.element).getValue(), filterSubFiltersScreen.accentColor);
                            Updater.LaunchedEffect(flow, content22, ref$ObjectRef2.element, new GLThread$start$2(flow, content22, this, ref$ObjectRef2, null, 19), gapComposer17);
                            gapComposer17.end(false);
                            return content22;
                        }
                    }
                }
                z = true;
                iterable = (Iterable) ((MutableState) ref$ObjectRef2.element).getValue();
                if (iterable instanceof Collection) {
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                }
                z2 = true;
                FilterSubFiltersViewModel.Content content222 = new FilterSubFiltersViewModel.Content(androidStringManager7.get(R.string.filter_reset), z2 ? androidStringManager7.get(R.string.filter_done) : androidStringManager7.get(R.string.filter_submit), !z || z2, (List) ((MutableState) ref$ObjectRef2.element).getValue(), filterSubFiltersScreen.accentColor);
                Updater.LaunchedEffect(flow, content222, ref$ObjectRef2.element, new GLThread$start$2(flow, content222, this, ref$ObjectRef2, null, 19), gapComposer17);
                gapComposer17.end(false);
                return content222;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider launcher;
        public final Provider permissionManager;
        public final Provider store;
        public final LambdaProvider stringManager;

        public MetroFactory(TemporaryStorage.MetroFactory metroFactory, RealSessionFlags.MetroFactory metroFactory2, RealRecipientRepository.MetroFactory metroFactory3, LambdaProvider lambdaProvider) {
            this.permissionManager = metroFactory;
            this.launcher = metroFactory2;
            this.store = metroFactory3;
            this.stringManager = lambdaProvider;
        }

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, Factory factory, Factory factory2, Factory factory3) {
            this.stringManager = lambdaProvider;
            this.permissionManager = factory;
            this.launcher = factory2;
            this.store = factory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory, RealSessionFlags.MetroFactory metroFactory2) {
            this.permissionManager = doubleCheck;
            this.stringManager = lambdaProvider;
            this.launcher = metroFactory;
            this.store = metroFactory2;
        }
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealInputFieldTextSaver realInputFieldTextSaver, DirectDepositEditFullNameScreen directDepositEditFullNameScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        directDepositEditFullNameScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realInputFieldTextSaver;
        this.store = directDepositEditFullNameScreen;
        this.navigator = screenNavigator;
        this.cameraPermissions = directDepositEditFullNameScreen.question;
    }

    public LocalPosCheckInPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, AppConfigManager appConfigManager, CoroutineContext coroutineContext, BlockersScreens.ContactsPermissionExplanationSheet contactsPermissionExplanationSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        this.stringManager = appConfigManager;
        this.launcher = coroutineContext;
        this.store = contactsPermissionExplanationSheet;
        this.navigator = screenNavigator;
        this.cameraPermissions = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalPosCheckInPresenter(RealLegacyActivityEntityManager realLegacyActivityEntityManager, PaymentManager paymentManager, AndroidStringManager androidStringManager, HistoryScreens.SkipPayment skipPayment, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        skipPayment.getClass();
        this.launcher = realLegacyActivityEntityManager;
        this.store = paymentManager;
        this.stringManager = androidStringManager;
        this.cameraPermissions = skipPayment;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealInputFieldTextSaver realInputFieldTextSaver, DirectDepositEditPaycheckPercentageScreen directDepositEditPaycheckPercentageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        directDepositEditPaycheckPercentageScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realInputFieldTextSaver;
        this.store = directDepositEditPaycheckPercentageScreen;
        this.navigator = screenNavigator;
        this.cameraPermissions = directDepositEditPaycheckPercentageScreen.question;
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl, KeyValue keyValue, RecurringDepositsFirstTimeUserScreen recurringDepositsFirstTimeUserScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        recurringDepositsFirstTimeUserScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = keyValue;
        this.store = recurringDepositsFirstTimeUserScreen;
        this.navigator = screenNavigator;
        this.cameraPermissions = new SizeMap(screenNavigator);
    }

    public LocalPosCheckInPresenter(AppService appService, FlowStarter flowStarter, AndroidStringManager androidStringManager, InvestingScreens.CancelRecurringPurchase.Equity equity, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        equity.getClass();
        this.launcher = appService;
        this.store = flowStarter;
        this.stringManager = androidStringManager;
        this.cameraPermissions = equity;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(AgentsHomeScreen agentsHomeScreen, RealAgentsRepository realAgentsRepository, AndroidStringManager androidStringManager, FlowStarter flowStarter, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        agentsHomeScreen.getClass();
        this.launcher = agentsHomeScreen;
        this.store = realAgentsRepository;
        this.stringManager = androidStringManager;
        this.cameraPermissions = flowStarter;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(Analytics analytics, RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, BitcoinMapOnboardingScreen bitcoinMapOnboardingScreen) {
        this.$r8$classId = 8;
        bitcoinMapOnboardingScreen.getClass();
        this.stringManager = analytics;
        this.launcher = realBitcoinMapEligibilityManager;
        this.navigator = screenNavigator;
        this.store = bitcoinMapOnboardingScreen;
        this.cameraPermissions = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
    }

    public LocalPosCheckInPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        this.launcher = analytics;
        this.stringManager = androidStringManager;
        this.store = syncValueReader;
        this.navigator = screenNavigator;
        this.cameraPermissions = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, Map map, ScenarioPlanScreens.ScenarioPlanLoadingScreen scenarioPlanLoadingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        scenarioPlanLoadingScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = blockersDataNavigator;
        this.store = scenarioPlanLoadingScreen;
        this.navigator = screenNavigator;
        ScenarioPlans scenarioPlans = scenarioPlanLoadingScreen.plan;
        ScenarioPlan.Factory factory = (ScenarioPlan.Factory) map.get(scenarioPlans);
        if (factory != null) {
            this.cameraPermissions = factory.create(scenarioPlanLoadingScreen.input, scenarioPlanLoadingScreen.exitScreen);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(scenarioPlans, "No valid scenario plan found for plan ");
            throw null;
        }
    }

    public LocalPosCheckInPresenter(BalanceAppletTileRepository balanceAppletTileRepository, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, LiteBalanceHomeScreen liteBalanceHomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        liteBalanceHomeScreen.getClass();
        this.launcher = balanceAppletTileRepository;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        this.store = factory.create(MoneyFormatterConfig.STANDARD);
        this.cameraPermissions = factory.createNoSymbol();
    }

    public LocalPosCheckInPresenter(FlowStarter flowStarter, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, LiteCashOutScreen liteCashOutScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 19;
        liteCashOutScreen.getClass();
        this.launcher = flowStarter;
        this.stringManager = androidStringManager;
        this.store = liteCashOutScreen;
        this.navigator = screenNavigator;
        this.cameraPermissions = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public /* synthetic */ LocalPosCheckInPresenter(Object obj, Object obj2, Object obj3, BlockersScreens blockersScreens, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.stringManager = obj;
        this.launcher = obj2;
        this.store = obj3;
        this.cameraPermissions = blockersScreens;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen bitcoinP2pConversionCustomPercentageScreen, BetterNavigator.ScreenNavigator screenNavigator, BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter, AndroidStringManager androidStringManager) {
        this.$r8$classId = 20;
        bitcoinP2pConversionCustomPercentageScreen.getClass();
        this.launcher = bitcoinP2pConversionCustomPercentageScreen;
        this.navigator = screenNavigator;
        this.store = bitcoinP2pConversionPercentageSubmitter;
        this.stringManager = androidStringManager;
        this.cameraPermissions = LazyKt.lazy(new Recipient$$ExternalSyntheticLambda2(2));
    }

    public LocalPosCheckInPresenter(PermissionChecker permissionChecker, AndroidStringManager androidStringManager, BlockerFlowListener blockerFlowListener, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.CardActivationQrScreen cardActivationQrScreen) {
        this.$r8$classId = 12;
        this.launcher = permissionChecker;
        this.stringManager = androidStringManager;
        this.store = blockerFlowListener;
        this.navigator = screenNavigator;
        this.cameraPermissions = cardActivationQrScreen;
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealCategoryBackend realCategoryBackend, Analytics analytics, InvestingScreens.InvestingCategoryFilterScreen investingCategoryFilterScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        investingCategoryFilterScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realCategoryBackend;
        this.store = analytics;
        this.cameraPermissions = investingCategoryFilterScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(CashApProxyClientService cashApProxyClientService, AndroidStringManager androidStringManager, IntentLauncher intentLauncher, AfterPayOrderDocumentScreen afterPayOrderDocumentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        afterPayOrderDocumentScreen.getClass();
        this.launcher = cashApProxyClientService;
        this.stringManager = androidStringManager;
        this.store = intentLauncher;
        this.cameraPermissions = afterPayOrderDocumentScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(RealBorrowAppletRepository realBorrowAppletRepository, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, LendingAppService lendingAppService, RealMoneyNavigatorHelper realMoneyNavigatorHelper, MoneyAnalyticsService moneyAnalyticsService, RealRouter$Factory$Impl realRouter$Factory$Impl, Navigator navigator) {
        this.$r8$classId = 16;
        navigator.getClass();
        this.stringManager = realBorrowAppletRepository;
        this.launcher = lendingAppService;
        this.store = moneyAnalyticsService;
        this.navigator = realRouter$Factory$Impl.create$1(navigator);
        this.cameraPermissions = promotedAppletTilePresenter$Factory$Impl.create(AppletId.BORROW);
    }

    public LocalPosCheckInPresenter(RealSettingsEligibilityManager realSettingsEligibilityManager, FlowStarter flowStarter, Analytics analytics, AddAccountScreen addAccountScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        addAccountScreen.getClass();
        this.stringManager = realSettingsEligibilityManager;
        this.launcher = flowStarter;
        this.store = analytics;
        this.cameraPermissions = addAccountScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealCategoryBackend realCategoryBackend, Analytics analytics, InvestingScreens.FilterSubFiltersScreen filterSubFiltersScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 29;
        filterSubFiltersScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realCategoryBackend;
        this.store = analytics;
        this.cameraPermissions = filterSubFiltersScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(SyncValueReader syncValueReader, AndroidClock androidClock, AndroidStringManager androidStringManager, EarningsTimeframeSelectorSheetScreen earningsTimeframeSelectorSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        earningsTimeframeSelectorSheetScreen.getClass();
        this.launcher = syncValueReader;
        this.store = androidClock;
        this.stringManager = androidStringManager;
        this.cameraPermissions = earningsTimeframeSelectorSheetScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, ActivityClientService activityClientService, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, SavingsActivityItemEventDecorator savingsActivityItemEventDecorator, DependentActivityScreen dependentActivityScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        ActivitiesManager.ActivityContext dependentActivitiesContext$default;
        this.$r8$classId = 24;
        dependentActivityScreen.getClass();
        String str = dependentActivityScreen.dependentCustomerToken;
        this.launcher = realCustomerStore;
        this.stringManager = androidStringManager;
        this.store = dependentActivityScreen;
        this.navigator = screenNavigator;
        int ordinal = dependentActivityScreen.activityType.ordinal();
        if (ordinal == 0) {
            dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(str, dependentActivityScreen.forManagedAccount ? ActivityScope.MY_ACTIVITY : ActivityScope.SPONSORED_ACCOUNT, 2);
        } else if (ordinal == 1) {
            dependentActivitiesContext$default = ViewConfigurationCompat.savingsActivityContext$default(str, null, null, ActivityScope.SPONSORED_ACCOUNT, 6);
        } else if (ordinal == 2) {
            dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(str, activityClientService, ActivityDisplayCategory.ADC_BITCOIN);
        } else if (ordinal == 3) {
            dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(str, activityClientService, ActivityDisplayCategory.ADC_INVESTING);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
        this.cameraPermissions = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(dependentActivitiesContext$default, null, dependentActivityScreen, false, null, InputEventTrigger.Companion.decoratedWith(defaultActivityItemEventHandler$Factory$Impl, savingsActivityItemEventDecorator), null, null, null, 15866));
    }

    public LocalPosCheckInPresenter(AndroidStringManager androidStringManager, RealCategoryBackend realCategoryBackend, Analytics analytics, InvestingScreens.FilterCategoriesScreen filterCategoriesScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        filterCategoriesScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realCategoryBackend;
        this.store = analytics;
        this.cameraPermissions = filterCategoriesScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(AndroidPermissionManager androidPermissionManager, AndroidStringManager androidStringManager, RealLocalLauncher realLocalLauncher, LocalInstalledStore localInstalledStore, LocalPosCheckInScreen localPosCheckInScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        localPosCheckInScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realLocalLauncher;
        this.store = localInstalledStore;
        this.navigator = screenNavigator;
        this.cameraPermissions = androidPermissionManager.create("android.permission.CAMERA");
    }

    public LocalPosCheckInPresenter(BlockStableService blockStableService, RealQrCodesPresenter realQrCodesPresenter, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        this.launcher = blockStableService;
        this.store = realQrCodesPresenter;
        this.cameraPermissions = realProfileManager;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(LocalizedMoneyFormatter.Factory factory, RealBalanceSnapshotManager realBalanceSnapshotManager, CryptoFlowStarter cryptoFlowStarter, SendStablecoinScreen sendStablecoinScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        sendStablecoinScreen.getClass();
        this.stringManager = factory;
        this.launcher = realBalanceSnapshotManager;
        this.store = cryptoFlowStarter;
        this.cameraPermissions = sendStablecoinScreen;
        this.navigator = screenNavigator;
    }

    public LocalPosCheckInPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, BankingBenefitsAppService bankingBenefitsAppService, Analytics analytics, BenefitsLeafletSheetScreen benefitsLeafletSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        benefitsLeafletSheetScreen.getClass();
        this.stringManager = bankingBenefitsAppService;
        this.launcher = analytics;
        this.store = benefitsLeafletSheetScreen;
        this.navigator = screenNavigator;
        this.cameraPermissions = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalPosCheckInPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, BankingBenefitsAppService bankingBenefitsAppService, AndroidStringManager androidStringManager, Analytics analytics, BenefitsHubScreen benefitsHubScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        benefitsHubScreen.getClass();
        this.launcher = bankingBenefitsAppService;
        this.stringManager = androidStringManager;
        this.store = analytics;
        this.navigator = screenNavigator;
        this.cameraPermissions = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m1222models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.$r8$classId;
        int i7 = 2;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        int i8 = 16;
        flow.getClass();
        switch (i6) {
            case 11:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1797147102);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2(this, continuation, 5);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i8);
                    break;
                }
                break;
            case 12:
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(871754974);
                if ((i & 48) == 0) {
                    i5 = i | (gapComposer2.changedInstance(this) ? 32 : 16);
                } else {
                    i5 = i;
                }
                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 17) != 16)) {
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CancelRecurringEquityPurchasePresenter$models$1$1(this, null);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, this, (Function2) rememberedValue2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 25);
                    break;
                }
                break;
            case 13:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-345258814);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 19));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 23);
                    break;
                }
                break;
            case 14:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(-1224029758);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer4.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                int i9 = 26;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer4, flow, new CashtagPresenter$models$2$1(flow, continuation, this, i9));
                    boolean changedInstance3 = gapComposer4.changedInstance(this);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CardModelView.AnonymousClass1.C00581(this, continuation, i7);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer4, this, (Function2) rememberedValue3);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer4.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i9);
                    break;
                }
                break;
        }
    }
}
