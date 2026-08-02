package com.squareup.cash.formview.components;

import android.app.Activity;
import android.content.ComponentName;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.core.os.BundleKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.molecule.RecompositionMode;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.tapandpay.zzag;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zza;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectRemoveFavorite;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractShareCompleted;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenLaunchApplet;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManagePendingRequestTapOne;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.cryptonauts.api.CryptoCustomerControlsService;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.deposits.physical.presenter.map.LimitReachedDialogPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.SwipeToLoadOnboardingPresenter;
import com.squareup.cash.deposits.physical.viewmodels.location.LocationDeniedEvents;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogEvent;
import com.squareup.cash.deposits.physical.viewmodels.result.ExitResult;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.earnings.backend.api.PayerResult;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.presenters.payers.PayerTaggingPromptPresenter$models$1$1;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewEvent$Close;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewEvent;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileEvent$EarningsAppletOnClickTile;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewEvent;
import com.squareup.cash.earningstracker.viewmodels.NetEarningsInfoSheetViewEvent;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.data.RealApprovedContactsAppletTileRepository;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewEvent$ApprovedContactsAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewEvent$FamilyAppletOnClickTile;
import com.squareup.cash.family.familyhub.backend.api.BalanceType;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferAction;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter$models$3$1;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyPendingRequestsPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitErrorScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.screens.SponsorResourcesScreen;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationResult;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewEvent$Confirm;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewEvent$Close;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewEvent$Confirm;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewEvent;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionDialogViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionResult$Negative;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionResult$Positive;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewEvent$NegativeClick;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewEvent$TapBack;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.data.RemoveFavoriteAnalytics;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewEvent$OkClicked;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewEvent;
import com.squareup.cash.featureflags.JsonFeatureFlags$MigratedSyncValuesFlag;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormView$renderViewModel$4;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.formview.presenters.FormPresenter$models$2$1$1;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.ClientScenarioAndFlowToken;
import com.squareup.cash.formview.viewmodels.FormCashtagViewEvent$InputChange;
import com.squareup.cash.formview.viewmodels.FormCashtagViewModel;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.api.SearchResult;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchViewKt$GlobalSearch$1$1$2;
import com.squareup.cash.google.pay.GooglePayPresenter;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1$1$1;
import com.squareup.cash.google.pay.GooglePayProvisioningGateway;
import com.squareup.cash.google.pay.GooglePayer$GooglePayEvent$CreateWalletResult;
import com.squareup.cash.google.pay.RealGooglePayer;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.mooncake.components.MooncakeCashtagEditor;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.mooncake.components.MooncakeSmallText;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.MetadataSection$AppSection;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profilemigration.real.RealMigratedSyncValueBugsnagMetadata;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.scrubbing.EmptyTextWatcher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.OnTransitionListener;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubRequest;
import com.squareup.protos.cash.aegis.api.GetSafetyEducationHubResponse;
import com.squareup.protos.cash.aegis.api.SetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.fiatly.api.v1.CustomP2PLimit;
import com.squareup.protos.cash.fiatly.api.v1.FiatlyService;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsRequest;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.cash.investcustomer.api.v1.InvestCustomerService;
import com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsRequest;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.SetPayersForCustomerRequest;
import com.squareup.protos.cash.piggybank.appapi.FamiliesSavingsScreensRequest;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFeatureFlagsResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiAppMesssages;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.ShareResultsReceiver$ShareResult;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.ByteArrayProtoReader32;
import com.squareup.workflow1.TimerWorker$run$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import okio.ByteString;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$4$2;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class FormCashtag extends ContourLayout implements FormEventful, IndividualFormRequirementProvider, OnTransitionListener {
    public final MooncakeCashtagEditor cashtagEditorView;
    public final FormBlocker.Element.CashtagElement cashtagElement;
    public final AppCompatTextView cashtagSymbolView;
    public final MooncakeEditText cashtagView;
    public final ClientScenarioAndFlowToken clientScenarioAndFlowToken;
    public final FormCashtagPresenter.TransformerFactory factory;
    public final String formElementId;
    public final SharedFlowImpl formEvents;
    public String hint;
    public final MooncakeSmallText previewView;
    public boolean textPrefilled;
    public FormCashtagPresenter transformer;
    public final SharedFlowImpl validated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCashtag(FormCashtagPresenter.TransformerFactory transformerFactory, String str, FormBlocker.Element.CashtagElement cashtagElement, ContextThemeWrapper contextThemeWrapper, ClientScenarioAndFlowToken clientScenarioAndFlowToken) {
        super(contextThemeWrapper);
        clientScenarioAndFlowToken.getClass();
        this.factory = transformerFactory;
        this.formElementId = str;
        this.cashtagElement = cashtagElement;
        this.clientScenarioAndFlowToken = clientScenarioAndFlowToken;
        MooncakeCashtagEditor mooncakeCashtagEditor = new MooncakeCashtagEditor(contextThemeWrapper);
        this.cashtagEditorView = mooncakeCashtagEditor;
        MooncakeEditText mooncakeEditText = mooncakeCashtagEditor.editText;
        this.cashtagView = mooncakeEditText;
        this.cashtagSymbolView = mooncakeCashtagEditor.currencyText;
        MooncakeSmallText mooncakeSmallText = new MooncakeSmallText(contextThemeWrapper, null);
        this.previewView = mooncakeSmallText;
        this.hint = "";
        final int i = 0;
        this.validated = FlowKt.MutableSharedFlow$default(0, 20, null, 5);
        this.formEvents = FlowKt.MutableSharedFlow$default(0, 20, null, 5);
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.formview.components.FormCashtag$$ExternalSyntheticLambda0
            public final /* synthetic */ FormCashtag f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                FormCashtag formCashtag = this.f$0;
                switch (i2) {
                    case 0:
                        return new YInt(formCashtag.m3810bottomdBGyhoQ(formCashtag.previewView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(formCashtag.getDip(8) + formCashtag.m3810bottomdBGyhoQ(formCashtag.cashtagEditorView));
                }
            }
        });
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new GpsConfigQueries$$ExternalSyntheticLambda1(4));
        final int i2 = 1;
        leftTo.rightTo(1, new GpsConfigQueries$$ExternalSyntheticLambda1(5));
        ContourLayout.layoutBy$default(this, mooncakeCashtagEditor, leftTo, ContourLayout.topTo(new GpsConfigQueries$$ExternalSyntheticLambda1(6)));
        ContourLayout.layoutBy$default(this, mooncakeSmallText, ContourLayout.leftTo(new GpsConfigQueries$$ExternalSyntheticLambda1(7)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.formview.components.FormCashtag$$ExternalSyntheticLambda0
            public final /* synthetic */ FormCashtag f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                FormCashtag formCashtag = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(formCashtag.m3810bottomdBGyhoQ(formCashtag.previewView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(formCashtag.getDip(8) + formCashtag.m3810bottomdBGyhoQ(formCashtag.cashtagEditorView));
                }
            }
        }));
        mooncakeEditText.addTextChangedListener(new EmptyTextWatcher() { // from class: com.squareup.cash.formview.components.FormCashtag.7
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                editable.getClass();
                int length = editable.toString().length();
                FormCashtag formCashtag = FormCashtag.this;
                MooncakeEditText mooncakeEditText2 = formCashtag.cashtagView;
                if (length == 0) {
                    mooncakeEditText2.setHint(formCashtag.hint);
                } else {
                    mooncakeEditText2.setHint((CharSequence) null);
                }
                mooncakeEditText2.requestLayout();
            }
        });
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass8(null));
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FormCashtag$isRequirementFulfilled$1(this, null), this.validated);
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        MooncakeEditText mooncakeEditText = this.cashtagView;
        mooncakeEditText.requestFocus();
        Keyboards.showKeyboard(mooncakeEditText);
    }

    /* renamed from: com.squareup.cash.formview.components.FormCashtag$8, reason: invalid class name */
    public final class AnonymousClass8 extends SuspendLambda implements Function2 {
        public int label;

        public AnonymousClass8(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FormCashtag.this.new AnonymousClass8(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Continuation continuation = null;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                FormCashtag formCashtag = FormCashtag.this;
                FormCashtagPresenter.TransformerFactory transformerFactory = formCashtag.factory;
                ClientScenarioAndFlowToken clientScenarioAndFlowToken = formCashtag.clientScenarioAndFlowToken;
                FormBlocker.Element.CashtagElement cashtagElement = formCashtag.cashtagElement;
                FormCashtagPresenter.Factory.Impl impl = (FormCashtagPresenter.Factory.Impl) transformerFactory;
                impl.getClass();
                clientScenarioAndFlowToken.getClass();
                cashtagElement.getClass();
                FormCashtagPresenter.MetroFactory metroFactory = impl.delegateFactory;
                AppService appService = (AppService) metroFactory.appService.invoke();
                Signal signal = (Signal) metroFactory.signOut.invoke();
                appService.getClass();
                signal.getClass();
                formCashtag.transformer = new FormCashtagPresenter(appService, signal, clientScenarioAndFlowToken, cashtagElement);
                MooncakeEditText mooncakeEditText = formCashtag.cashtagView;
                mooncakeEditText.getClass();
                int i2 = 0;
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FormCashtag$8$invokeSuspend$$inlined$map$1(FlowKt.callbackFlow(new TimerWorker$run$1(mooncakeEditText, continuation, 18)), i2), new AnonymousClass2(formCashtag, continuation, i2), 3);
                RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                Flow moleculeFlow$default = BundleKt.moleculeFlow$default(new FormCashtag$8$$ExternalSyntheticLambda0(i2, formCashtag, flowKt__MergeKt$flatMapConcat$$inlined$map$1));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(formCashtag, i2);
                this.label = 1;
                if (((AbstractFlow) moleculeFlow$default).collect(anonymousClass4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.formview.components.FormCashtag$8$4, reason: invalid class name */
        public final class AnonymousClass4 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;

            public /* synthetic */ AnonymousClass4(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str;
                Object value;
                EmptyMap emptyMap;
                int i;
                int i2 = this.$r8$classId;
                int i3 = 1;
                Back back = Back.INSTANCE;
                Object obj2 = this.this$0;
                Continuation continuation2 = null;
                switch (i2) {
                    case 0:
                        FormCashtagViewModel formCashtagViewModel = (FormCashtagViewModel) obj;
                        FormCashtag formCashtag = (FormCashtag) obj2;
                        MooncakeEditText mooncakeEditText = formCashtag.cashtagView;
                        if (!formCashtag.textPrefilled && (str = formCashtagViewModel.cashtagPrefill) != null && str.length() != 0) {
                            mooncakeEditText.setText(formCashtagViewModel.cashtagPrefill);
                            mooncakeEditText.setSelection(mooncakeEditText.length());
                            formCashtag.textPrefilled = true;
                        }
                        String str2 = formCashtagViewModel.hint;
                        if (str2 == null) {
                            str2 = "";
                        }
                        formCashtag.hint = str2;
                        mooncakeEditText.setHint(str2);
                        formCashtag.cashtagSymbolView.setText(formCashtagViewModel.cashtagSymbol);
                        formCashtag.previewView.setText(formCashtagViewModel.previewText);
                        StateFlowKt.emitOrThrow(formCashtag.validated, Boolean.valueOf(formCashtagViewModel.isSubmittable));
                        break;
                    case 1:
                        EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) endAppLockPresenter.appLockState;
                        LocationDeniedEvents locationDeniedEvents = (LocationDeniedEvents) obj;
                        if (!Intrinsics.areEqual(locationDeniedEvents, LocationDeniedEvents.UpdatePermissions.INSTANCE)) {
                            if (!Intrinsics.areEqual(locationDeniedEvents, LocationDeniedEvents.Ignore.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator.goTo(back);
                            }
                        } else {
                            ((IntentLauncher) endAppLockPresenter.accountOutboundNavigator).launchSettings();
                            screenNavigator.goTo(back);
                        }
                        break;
                    case 2:
                        BetterNavigator.ScreenNavigator screenNavigator2 = ((LimitReachedDialogPresenter) obj2).navigator;
                        LimitReachedDialogEvent limitReachedDialogEvent = (LimitReachedDialogEvent) obj;
                        if (!Intrinsics.areEqual(limitReachedDialogEvent, LimitReachedDialogEvent.ActionNegativeClick.INSTANCE)) {
                            if (!Intrinsics.areEqual(limitReachedDialogEvent, LimitReachedDialogEvent.ActionPositiveClick.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator2.goTo(back);
                            }
                        } else {
                            screenNavigator2.goTo(new Finish(ExitResult.INSTANCE));
                        }
                        break;
                    case 3:
                        SwipeToLoadOnboardingPresenter swipeToLoadOnboardingPresenter = (SwipeToLoadOnboardingPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator3 = swipeToLoadOnboardingPresenter.navigator;
                        FormViewEvent formViewEvent = (FormViewEvent) obj;
                        if (formViewEvent instanceof FormViewEvent.PrimaryActionSelected) {
                            BooleanPreference booleanPreference = swipeToLoadOnboardingPresenter.physicalDepositViewed;
                            booleanPreference.preferences.edit().putBoolean(booleanPreference.key, true).commit();
                            screenNavigator3.goTo(back);
                        } else if (formViewEvent instanceof FormViewEvent.Close) {
                            screenNavigator3.goTo(back);
                        }
                        break;
                    case 4:
                        RealPromotionDetailsAnalyticsService realPromotionDetailsAnalyticsService = (RealPromotionDetailsAnalyticsService) ((DisclosurePresenter) obj2).args;
                        ComponentName componentName = ((ShareResultsReceiver$ShareResult) obj).componentName;
                        String packageName = componentName != null ? componentName.getPackageName() : null;
                        PromotionDetails promotionDetails = realPromotionDetailsAnalyticsService.args;
                        PromotionDetails.Identifier identifier = promotionDetails.identifier;
                        if (!(identifier instanceof PromotionDetails.Identifier.TemplateToken)) {
                            if (!(identifier instanceof PromotionDetails.Identifier.DetailsToken)) {
                                if (!(identifier instanceof PromotionDetails.Identifier.TreehousePath)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else {
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractShareCompleted(null, null, ((PromotionDetails.Identifier.DetailsToken) identifier).token, realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, packageName, 3), null);
                            }
                        } else {
                            PromotionDetails.Identifier.TemplateToken templateToken = (PromotionDetails.Identifier.TemplateToken) identifier;
                            realPromotionDetailsAnalyticsService.track(new DetailsPageInteractShareCompleted(templateToken.templateToken, templateToken.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, packageName, 4), null);
                        }
                        break;
                    case 5:
                        if (((EarningsActivityListViewEvent$Close) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                            break;
                        }
                    case 6:
                        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                        CoroutineScope coroutineScope = (CoroutineScope) cardStudioPresenter.analytics;
                        PayerTaggingPromptViewEvent payerTaggingPromptViewEvent = (PayerTaggingPromptViewEvent) obj;
                        if (!(payerTaggingPromptViewEvent instanceof PayerTaggingPromptViewEvent.Confirm)) {
                            if (!(payerTaggingPromptViewEvent instanceof PayerTaggingPromptViewEvent.Dismiss)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                JobKt.launch$default(coroutineScope, null, null, new PayerTaggingPromptPresenter$models$1$1(cardStudioPresenter, continuation2, i3), 3);
                            }
                        } else {
                            JobKt.launch$default(coroutineScope, null, null, new PayerTaggingPromptPresenter$models$1$1(cardStudioPresenter, continuation2, 0), 3);
                        }
                        ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(back);
                        break;
                    case 7:
                        if (!Intrinsics.areEqual((EarningsAppletTileEvent$EarningsAppletOnClickTile) obj, EarningsAppletTileEvent$EarningsAppletOnClickTile.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                            ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) localEditorialPresenter.service)).submitSelectItemEvent(ItemId.EARNINGS.INSTANCE, null, MoneySelectAction.TAP);
                            RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) localEditorialPresenter.installedStore;
                            EarningsTrackerEntrypoint earningsTrackerEntrypoint = EarningsTrackerEntrypoint.MONEY_TAB;
                            realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerOpenLaunchApplet(earningsTrackerEntrypoint), null);
                            ((Navigator) localEditorialPresenter.clock).goTo(new EarningsTrackerScreen(earningsTrackerEntrypoint, null));
                            break;
                        }
                    case 8:
                        NetEarningsInfoSheetPresenter netEarningsInfoSheetPresenter = (NetEarningsInfoSheetPresenter) obj2;
                        NetEarningsInfoSheetViewEvent netEarningsInfoSheetViewEvent = (NetEarningsInfoSheetViewEvent) obj;
                        if (!Intrinsics.areEqual(netEarningsInfoSheetViewEvent, NetEarningsInfoSheetViewEvent.SheetDismissed.INSTANCE) && !Intrinsics.areEqual(netEarningsInfoSheetViewEvent, NetEarningsInfoSheetViewEvent.ActionButtonClick.INSTANCE)) {
                            if (!Intrinsics.areEqual(netEarningsInfoSheetViewEvent, NetEarningsInfoSheetViewEvent.ProcessingFeeClick.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                netEarningsInfoSheetPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), "https://internal.cash.app/dl/view/support/CASH_FOR_BUSINESS_FEES");
                            }
                        } else {
                            netEarningsInfoSheetPresenter.navigator.goTo(back);
                        }
                        break;
                    case 9:
                        AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile allowanceAppletTileViewEvent$AllowanceAppletOnClickTile = (AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile) obj;
                        if (allowanceAppletTileViewEvent$AllowanceAppletOnClickTile == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                            JobKt.launch$default((CoroutineScope) disclosurePresenter.blockersNavigator, null, null, new RealAppConfigManager$update$2$2(allowanceAppletTileViewEvent$AllowanceAppletOnClickTile.url, disclosurePresenter, continuation2, 28), 3);
                            break;
                        }
                    case 10:
                        if (((ApprovedContactsAppletTileViewEvent$ApprovedContactsAppletOnClickTile) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            EndAppLockPresenter endAppLockPresenter2 = (EndAppLockPresenter) obj2;
                            ((Navigator) endAppLockPresenter2.accountOutboundNavigator).goTo(new SelectCustomerScreen(PlatformKt.activeAccountToken((SessionManager) endAppLockPresenter2.navigatorSwitcher), null, new MoneyTabScreen(null), new P2PScreenMode.AllowList(null)));
                            break;
                        }
                    case 11:
                        if (!Intrinsics.areEqual((FamilyAppletTileViewEvent$FamilyAppletOnClickTile) obj, FamilyAppletTileViewEvent$FamilyAppletOnClickTile.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                            ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) disclosurePresenter2.analytics)).submitSelectItemEvent(ItemId.FAMILY.INSTANCE, null, MoneySelectAction.TAP);
                            FamilyAppletConfig familyAppletConfig = (FamilyAppletConfig) ((RealFamilyAppletTileRepository) disclosurePresenter2.appService).familyAppletConfig.$$delegate_0.getValue();
                            if (familyAppletConfig instanceof FamilyAppletConfig.Sponsor) {
                                ((Navigator) disclosurePresenter2.launcher).goTo(new FamilyHome(null, null, null, 7));
                            } else if (Intrinsics.areEqual(familyAppletConfig, FamilyAppletConfig.Unverified.INSTANCE)) {
                                JobKt.launch$default((CoroutineScope) disclosurePresenter2.stringManager, null, null, new GooglePayPresenter$models$1$1(disclosurePresenter2, continuation2, 18), 3);
                            } else if (Intrinsics.areEqual(familyAppletConfig, FamilyAppletConfig.VerifiedNonSponsor.INSTANCE)) {
                                ((RealRouter) disclosurePresenter2.args).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), "https://internal.cash.app/dl/flow/FAMILY_ACCOUNT_STATE%3Fparams%3DCAQaAA==");
                            }
                            break;
                        }
                    case 12:
                        Object emit = ((RealDependentControlStatusManager) obj2).dependentControlStatus.emit((DependentControlStatus) ((Pair) obj).second, continuation);
                        if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 13:
                        StateFlowImpl stateFlowImpl = ((RealTargetEntityManager) obj2).cachedSyncValues;
                        do {
                            value = stateFlowImpl.getValue();
                            emptyMap = EmptyMap.INSTANCE;
                            emptyMap.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, emptyMap));
                    case 14:
                        DependentControlStatus dependentControlStatus = (DependentControlStatus) obj;
                        if (dependentControlStatus instanceof DependentControlStatus.Error) {
                            DependentControlStatus.Error error = (DependentControlStatus.Error) dependentControlStatus;
                            BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) obj2;
                            BetterNavigator.ScreenNavigator screenNavigator4 = baseDependentControlPresenter.navigator;
                            AndroidStringManager androidStringManager = baseDependentControlPresenter.deps.stringManager;
                            ControlType controlType = baseDependentControlPresenter.getControlType();
                            if (!error.initial) {
                                DependentControlStatus.Loaded loaded = error.previousLoaded;
                                if (loaded == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    break;
                                } else {
                                    boolean controlEnabled = loaded.getControlEnabled();
                                    int ordinal = controlType.ordinal();
                                    if (ordinal == 2) {
                                        i = !controlEnabled ? R.string.family_account_dependent_cash_app_card_control_unlock_error_dialog_title : R.string.family_account_dependent_cash_app_card_control_lock_error_dialog_title;
                                    } else if (ordinal == 3) {
                                        i = !controlEnabled ? R.string.family_account_dependent_stock_enable_error_dialog_title : R.string.family_account_dependent_stock_disable_error_dialog_title;
                                    } else if (ordinal == 4) {
                                        i = !controlEnabled ? R.string.family_account_dependent_bitcoin_enable_error_dialog_title : R.string.family_account_dependent_bitcoin_disable_error_dialog_title;
                                    } else if (ordinal == 5) {
                                        i = !controlEnabled ? R.string.family_account_dependent_promotions_enable_error_dialog_title : R.string.family_account_dependent_promotions_disable_error_dialog_title;
                                    }
                                    screenNavigator4.goTo(new ControlErrorScreen(androidStringManager.get(i), androidStringManager.get(R.string.family_account_dependent_control_error_dialog_message), androidStringManager.get(R.string.family_account_dependent_control_error_done_button)));
                                }
                            }
                        }
                        break;
                    case 15:
                        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj2;
                        ControlDisablingConfirmationScreen controlDisablingConfirmationScreen = (ControlDisablingConfirmationScreen) verifyCheckDialogPresenter.args;
                        BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator;
                        ControlDisablingConfirmationViewEvent controlDisablingConfirmationViewEvent = (ControlDisablingConfirmationViewEvent) obj;
                        if (!Intrinsics.areEqual(controlDisablingConfirmationViewEvent, ControlDisablingConfirmationViewEvent.Cancel.INSTANCE)) {
                            if (!Intrinsics.areEqual(controlDisablingConfirmationViewEvent, ControlDisablingConfirmationViewEvent.Confirm.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator5.giveAnswer(controlDisablingConfirmationScreen.askedQuestion, new ControlDisablingConfirmationResult.Positive(controlDisablingConfirmationScreen.limit));
                            }
                        } else {
                            screenNavigator5.giveAnswer(controlDisablingConfirmationScreen.askedQuestion, new ControlDisablingConfirmationResult.Negative(controlDisablingConfirmationScreen.limit));
                        }
                        break;
                    case 16:
                        if (!Intrinsics.areEqual((ControlErrorViewEvent$Confirm) obj, ControlErrorViewEvent$Confirm.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator);
                            break;
                        }
                    case 17:
                        if (((FullScreenActivityViewEvent$Exit) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) ((LocalPosCheckInPresenter) obj2).navigator).goTo(back);
                            break;
                        }
                    case 18:
                        if (!Intrinsics.areEqual((DependentDetailIntroductionViewEvent$Close) obj, DependentDetailIntroductionViewEvent$Close.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator);
                            break;
                        }
                    case 19:
                        FamilyPendingRequestsPresenter familyPendingRequestsPresenter = (FamilyPendingRequestsPresenter) obj2;
                        FamilyPendingRequestsViewEvent familyPendingRequestsViewEvent = (FamilyPendingRequestsViewEvent) obj;
                        if (!Intrinsics.areEqual(familyPendingRequestsViewEvent, FamilyPendingRequestsViewEvent.TapBack.INSTANCE)) {
                            if (!(familyPendingRequestsViewEvent instanceof FamilyPendingRequestsViewEvent.TapOnPendingRequest)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                FamilyPendingRequestsViewEvent.TapOnPendingRequest tapOnPendingRequest = (FamilyPendingRequestsViewEvent.TapOnPendingRequest) familyPendingRequestsViewEvent;
                                familyPendingRequestsPresenter.analytics.track(new SponsoredAccountManagePendingRequestTapOne(tapOnPendingRequest.requesterCustomerToken, SponsoredAccountManagePendingRequestTapOne.PendingRequestLocation.AllPendingRequestsList), null);
                                RealRouter realRouter = familyPendingRequestsPresenter.router;
                                String str3 = tapOnPendingRequest.url;
                                FamilyPendingRequestsScreen familyPendingRequestsScreen = familyPendingRequestsPresenter.args;
                                realRouter.route(new RoutingParams(familyPendingRequestsScreen, null, familyPendingRequestsScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str3);
                            }
                        } else {
                            familyPendingRequestsPresenter.navigator.goTo(back);
                        }
                        break;
                    case 20:
                        ManagedAccountTransferManager$ManagedAccountTransferAction managedAccountTransferManager$ManagedAccountTransferAction = (ManagedAccountTransferManager$ManagedAccountTransferAction) obj;
                        CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator;
                        ManagedAccountTransferLoadingScreen managedAccountTransferLoadingScreen = (ManagedAccountTransferLoadingScreen) cardStudioPresenter2.appConfig;
                        ((RealManagedAccountTransferManager) cardStudioPresenter2.args).actions.resetReplayCache();
                        if (!(managedAccountTransferManager$ManagedAccountTransferAction instanceof ManagedAccountTransferManager$ManagedAccountTransferAction.Success)) {
                            if (!(managedAccountTransferManager$ManagedAccountTransferAction instanceof ManagedAccountTransferManager$ManagedAccountTransferAction.Error)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator6.goTo(back);
                            }
                        } else {
                            screenNavigator6.goTo(((BlockersDataNavigator) cardStudioPresenter2.analytics).getNext(managedAccountTransferLoadingScreen, FlowStarter.startFlow$default((FlowStarter) cardStudioPresenter2.ioContext, BlockersData.Flow.TRANSFER, managedAccountTransferLoadingScreen.exitScreen, null, ClientScenario.PAYMENT_FLOW, (String) cardStudioPresenter2.cardStudioQueries, null, null, null, null, 980).updateFromResponseContext(((ManagedAccountTransferManager$ManagedAccountTransferAction.Success) managedAccountTransferManager$ManagedAccountTransferAction).responseContext, true)));
                        }
                        break;
                    case 21:
                        if (!Intrinsics.areEqual((SetDependentCustomLimitErrorViewEvent$Confirm) obj, SetDependentCustomLimitErrorViewEvent$Confirm.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator);
                            break;
                        }
                    case 22:
                        MusicPresenter musicPresenter = (MusicPresenter) obj2;
                        SponsorResourcesViewEvent sponsorResourcesViewEvent = (SponsorResourcesViewEvent) obj;
                        if (!Intrinsics.areEqual(sponsorResourcesViewEvent, SponsorResourcesViewEvent.TapBack.INSTANCE)) {
                            if (!(sponsorResourcesViewEvent instanceof SponsorResourcesViewEvent.TapRow)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                RealRouter realRouter2 = (RealRouter) musicPresenter.args;
                                String str4 = ((SponsorResourcesViewEvent.TapRow) sponsorResourcesViewEvent).url;
                                SponsorResourcesScreen sponsorResourcesScreen = (SponsorResourcesScreen) musicPresenter.musicPlayer;
                                realRouter2.route(new RoutingParams(sponsorResourcesScreen, null, sponsorResourcesScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str4);
                            }
                        } else {
                            ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                        }
                        break;
                    case 23:
                        BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator;
                        ContactPermissionDialogViewEvent contactPermissionDialogViewEvent = (ContactPermissionDialogViewEvent) obj;
                        if (!Intrinsics.areEqual(contactPermissionDialogViewEvent, ContactPermissionDialogViewEvent.Cancel.INSTANCE)) {
                            if (!Intrinsics.areEqual(contactPermissionDialogViewEvent, ContactPermissionDialogViewEvent.Confirm.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator7.goTo(new Finish(ContactPermissionResult$Positive.INSTANCE));
                            }
                        } else {
                            screenNavigator7.goTo(new Finish(ContactPermissionResult$Negative.INSTANCE));
                        }
                        break;
                    case 24:
                        if (!Intrinsics.areEqual((SelectSponsorErrorViewEvent$NegativeClick) obj, SelectSponsorErrorViewEvent$NegativeClick.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                            break;
                        }
                    case 25:
                        if (!Intrinsics.areEqual((SafetyEducationPageViewEvent$TapBack) obj, SafetyEducationPageViewEvent$TapBack.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                            break;
                        }
                    case 26:
                        EndAppLockPresenter endAppLockPresenter3 = (EndAppLockPresenter) obj2;
                        FavoriteAddedViewEvent favoriteAddedViewEvent = (FavoriteAddedViewEvent) obj;
                        if (!(favoriteAddedViewEvent instanceof FavoriteAddedViewEvent.CloseClicked)) {
                            if (!(favoriteAddedViewEvent instanceof FavoriteAddedViewEvent.ViewFavoritesClicked)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                ((EglCore) endAppLockPresenter3.accountOutboundNavigator).showListFavorites(PersonalProfileViewOpenScreen.EntryPoint.APP_MESSAGE);
                            }
                        } else {
                            ((BetterNavigator.ScreenNavigator) endAppLockPresenter3.appLockState).goTo(back);
                        }
                        break;
                    case 27:
                        if (((FavoritesMessageViewEvent$OkClicked) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                            break;
                        }
                    case 28:
                        ((Ui.EventReceiver) obj2).sendEvent((FormViewEvent) obj);
                        break;
                    default:
                        ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) obj2;
                        arcadeFormTextInputGroupView.onEvent.invoke(new FormViewEvent.ElementEvent.StartInput(arcadeFormTextInputGroupView.formElementId));
                        break;
                }
                return Unit.INSTANCE;
            }

            public /* synthetic */ AnonymousClass4(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
                this.$r8$classId = i;
                this.this$0 = moleculePresenter;
            }
        }

        /* renamed from: com.squareup.cash.formview.components.FormCashtag$8$2, reason: invalid class name */
        public final class AnonymousClass2 extends SuspendLambda implements Function2 {
            public final /* synthetic */ int $r8$classId;
            public Object L$0;
            public int label;
            public final /* synthetic */ Object this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.L$0 = obj;
                this.this$0 = obj2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2((FormCashtag) obj2, continuation, 0);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    case 1:
                        return new AnonymousClass2((RealPayerRepository) this.L$0, (List) obj2, continuation, 1);
                    case 2:
                        return new AnonymousClass2((TransfersPresenter) this.L$0, (EarningsTrackerViewEvent) obj2, continuation, 2);
                    case 3:
                        AnonymousClass2 anonymousClass22 = new AnonymousClass2((RealApprovedContactsAppletTileRepository) obj2, continuation, 3);
                        anonymousClass22.L$0 = obj;
                        return anonymousClass22;
                    case 4:
                        AnonymousClass2 anonymousClass23 = new AnonymousClass2((List) obj2, continuation, 4);
                        anonymousClass23.L$0 = obj;
                        return anonymousClass23;
                    case 5:
                        AnonymousClass2 anonymousClass24 = new AnonymousClass2((BaseDependentControlPresenter) obj2, continuation, 5);
                        anonymousClass24.L$0 = obj;
                        return anonymousClass24;
                    case 6:
                        return new AnonymousClass2((RealBitcoinAmountPickerPresenter) this.L$0, (MutableState) obj2, continuation, 6);
                    case 7:
                        return new AnonymousClass2((SavingsScreenViewEvent.BalanceSeenEvent) this.L$0, (DependentSavingsScreenPresenter) obj2, continuation, 7);
                    case 8:
                        return new AnonymousClass2((DependentSavingsScreenPresenter) this.L$0, (MutableState) obj2, continuation, 8);
                    case 9:
                        return new AnonymousClass2((PoolsListPresenter) this.L$0, (MutableState) obj2, continuation, 9);
                    case 10:
                        return new AnonymousClass2((PoolsListPresenter) this.L$0, (Money) obj2, continuation, 10);
                    case 11:
                        return new AnonymousClass2((Animatable) this.L$0, (WalletMetrics) obj2, continuation, 11);
                    case 12:
                        return new AnonymousClass2((SelectSponsorPresenter) this.L$0, (BlockerAction) obj2, continuation, 12);
                    case 13:
                        return new AnonymousClass2((VerifyCheckDialogPresenter) this.L$0, (MutableState) obj2, continuation, 13);
                    case 14:
                        return new AnonymousClass2((LocalEditorialPresenter) this.L$0, (ListFavoritesViewEvent) obj2, continuation, 14);
                    case 15:
                        return new AnonymousClass2((RealFeatureFlagManager) this.L$0, (ApiResult.Success) obj2, continuation, 15);
                    case 16:
                        return new AnonymousClass2((FormEventful) this.L$0, (FormView) obj2, continuation, 16);
                    case 17:
                        return new AnonymousClass2((List) this.L$0, (FormView) obj2, continuation, 17);
                    case 18:
                        return new AnonymousClass2((FormView) this.L$0, (Ui.EventReceiver) obj2, continuation, 18);
                    case 19:
                        return new AnonymousClass2((ArcadeFormDateInputView) this.L$0, (MutableState) obj2, continuation, 19);
                    case 20:
                        return new AnonymousClass2((List) this.L$0, (ArcadeFormTextInputGroupView) obj2, continuation, 20);
                    case 21:
                        return new AnonymousClass2((FormPresenter) this.L$0, (BlockerAction) obj2, continuation, 21);
                    case 22:
                        AnonymousClass2 anonymousClass25 = new AnonymousClass2((RealGlobalSearchRepository) obj2, continuation, 22);
                        anonymousClass25.L$0 = obj;
                        return anonymousClass25;
                    case 23:
                        return new AnonymousClass2((ActivitySectionPresenter) this.L$0, (FormattedPaymentHistoryActivityItem) obj2, continuation, 23);
                    case 24:
                        return new AnonymousClass2((LocalEditorialPresenter) this.L$0, (MutableState) obj2, continuation, 24);
                    case 25:
                        return new AnonymousClass2((RowSectionPresenter) this.L$0, (MutableState) obj2, continuation, 25);
                    case 26:
                        return new AnonymousClass2((RowSectionPresenter) this.L$0, (GlobalSearchViewEvent.RowSectionEvent) obj2, continuation, 26);
                    case 27:
                        AnonymousClass2 anonymousClass26 = new AnonymousClass2((GlobalSearchViewModel.ErrorToast) obj2, continuation, 27);
                        anonymousClass26.L$0 = obj;
                        return anonymousClass26;
                    case 28:
                        return new AnonymousClass2((LazyListState) this.L$0, (SearchBarKeyboardState) obj2, continuation, 28);
                    default:
                        return new AnonymousClass2((GooglePayPresenter) obj2, continuation, 29);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (this.$r8$classId) {
                    case 18:
                        ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                        break;
                }
                return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0188, code lost:
            
                if (((kotlinx.coroutines.flow.Flow) r0).collect(r2, r26) == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0162, code lost:
            
                if (com.squareup.cash.google.pay.GooglePayPresenter.access$reportFailure(r14, r0, r26) == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0174, code lost:
            
                if (r0 == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:329:0x07b6, code lost:
            
                if (r0.updateLimit(r14, r26) == r2) goto L317;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
            
                if (com.squareup.cash.google.pay.GooglePayPresenter.access$reportFailure(r14, r0, r26) == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:342:0x06c9, code lost:
            
                if (r1 == r2) goto L317;
             */
            /* JADX WARN: Code restructure failed: missing block: B:346:0x0744, code lost:
            
                if (r1 == r2) goto L317;
             */
            /* JADX WARN: Code restructure failed: missing block: B:350:0x0757, code lost:
            
                if (r1 == r2) goto L317;
             */
            /* JADX WARN: Code restructure failed: missing block: B:354:0x0780, code lost:
            
                if (r1 == r2) goto L317;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0150, code lost:
            
                if (r2 != r3) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:377:0x087f, code lost:
            
                if (r0.updateLimit(null, r26) == r4) goto L354;
             */
            /* JADX WARN: Code restructure failed: missing block: B:386:0x081a, code lost:
            
                if (r2 == r4) goto L354;
             */
            /* JADX WARN: Code restructure failed: missing block: B:390:0x0849, code lost:
            
                if (r2 == r4) goto L354;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
            
                if (r4 != r3) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:431:0x0976, code lost:
            
                if (r3.updateLastBalanceSeen(r7, r0, r1) == r4) goto L410;
             */
            /* JADX WARN: Code restructure failed: missing block: B:433:?, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:437:0x098c, code lost:
            
                if (r3.updateLastBalanceSeen(com.squareup.cash.family.familyhub.backend.api.BalanceType.GeneralSavings.INSTANCE, r0, r1) == r4) goto L410;
             */
            /* JADX WARN: Code restructure failed: missing block: B:444:0x09bf, code lost:
            
                if (r3.updateLastBalanceSeen(r7, r5, r2) == r4) goto L410;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
            
                if (r4 == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
            
                if (r4 == r3) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
            
                if (r4 == r3) goto L57;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:511:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r12v0, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r12v19 */
            /* JADX WARN: Type inference failed for: r12v3, types: [int] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object payersForCustomer;
                Object invoke;
                Object allowlistForCustomer;
                AppletAvailabilityState appletAvailabilityState;
                Object blockedCustomers;
                Object familiesSavingsScreens;
                Object customLimits;
                Object p2PControls;
                ApiResult apiResult;
                Object customLimits2;
                Object p2PControls2;
                Object cryptoControls;
                Object customerControls;
                ApiResult apiResult2;
                Object safetyEducationHub;
                Object obj2;
                Object activeWalletId;
                String str;
                Object first;
                Object access$reportFailure;
                Object activeWalletId2;
                Object result;
                Object provision;
                int i = this.$r8$classId;
                int i2 = 28;
                Back back = Back.INSTANCE;
                int i3 = 4;
                int i4 = 2;
                int i5 = 3;
                ?? r12 = 0;
                Object obj3 = this.this$0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                switch (i) {
                    case 0:
                        FormCashtagViewEvent$InputChange formCashtagViewEvent$InputChange = (FormCashtagViewEvent$InputChange) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i6 = this.label;
                        if (i6 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            FormCashtag formCashtag = (FormCashtag) obj3;
                            SharedFlowImpl sharedFlowImpl = formCashtag.formEvents;
                            FormViewEvent.UpdateResultEvent.CashtagChanged cashtagChanged = new FormViewEvent.UpdateResultEvent.CashtagChanged(formCashtag.formElementId, new SubmitFormRequest.ElementResult.CashtagResult(formCashtagViewEvent$InputChange.input, ByteString.EMPTY));
                            this.L$0 = null;
                            this.label = 1;
                            if (sharedFlowImpl.emit(cashtagChanged, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i7 = this.label;
                        if (i7 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            PaychecksAppService paychecksAppService = ((RealPayerRepository) this.L$0).appService;
                            SetPayersForCustomerRequest setPayersForCustomerRequest = new SetPayersForCustomerRequest((List) obj3, ByteString.EMPTY);
                            this.label = 1;
                            payersForCustomer = paychecksAppService.setPayersForCustomer(setPayersForCustomerRequest, this);
                            if (payersForCustomer == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            payersForCustomer = obj;
                        }
                        ApiResult apiResult3 = (ApiResult) payersForCustomer;
                        if (apiResult3 instanceof ApiResult.Success) {
                            return new PayerResult.Success(Unit.INSTANCE);
                        }
                        if (apiResult3 instanceof ApiResult.Failure) {
                            return new PayerResult.Failure();
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 2:
                        TransfersPresenter transfersPresenter = (TransfersPresenter) this.L$0;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i8 = this.label;
                        if (i8 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            zzr zzrVar = (zzr) transfersPresenter.analytics;
                            EarningsTrackerScreen earningsTrackerScreen = (EarningsTrackerScreen) transfersPresenter.router;
                            String str2 = ((EarningsTrackerViewEvent.CustomerClicked) ((EarningsTrackerViewEvent) obj3)).customerToken;
                            this.label = 1;
                            invoke = zzrVar.invoke(earningsTrackerScreen, str2, this);
                            if (invoke == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            invoke = obj;
                        }
                        Screen screen = (Screen) invoke;
                        if (screen == null) {
                            return Unit.INSTANCE;
                        }
                        ((BetterNavigator.ScreenNavigator) transfersPresenter.navigator).goTo(screen);
                        return Unit.INSTANCE;
                    case 3:
                        RealApprovedContactsAppletTileRepository realApprovedContactsAppletTileRepository = (RealApprovedContactsAppletTileRepository) obj3;
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i9 = this.label;
                        if (i9 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            BlocklyService blocklyService = realApprovedContactsAppletTileRepository.blocklyService;
                            GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest(PlatformKt.activeAccountToken(realApprovedContactsAppletTileRepository.sessionManager));
                            this.L$0 = flowCollector;
                            this.label = 1;
                            allowlistForCustomer = blocklyService.getAllowlistForCustomer(getAllowlistForCustomerRequest, this);
                            if (allowlistForCustomer == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i9 != 1) {
                                if (i9 == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            allowlistForCustomer = obj;
                        }
                        ApiResult apiResult4 = (ApiResult) allowlistForCustomer;
                        if (apiResult4 instanceof ApiResult.Success) {
                            GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) ((ApiResult.Success) apiResult4).response;
                            if (!getAllowlistForCustomerResponse.allowed_customers.isEmpty() || Intrinsics.areEqual(getAllowlistForCustomerResponse.has_had_approved_contacts, Boolean.TRUE)) {
                                appletAvailabilityState = AppletAvailabilityState.UNAVAILABLE;
                                this.L$0 = null;
                                this.label = 2;
                                if (flowCollector.emit(appletAvailabilityState, this) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        appletAvailabilityState = AppletAvailabilityState.AVAILABLE;
                        this.L$0 = null;
                        this.label = 2;
                        if (flowCollector.emit(appletAvailabilityState, this) == coroutineSingletons4) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.label;
                        if (i10 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            int size = ((List) obj3).size();
                            ArrayList arrayList = new ArrayList(size);
                            while (r12 < size) {
                                arrayList.add(RealFamilyAppletTileRepository.LOADING_AVATAR);
                                r12++;
                            }
                            this.L$0 = null;
                            this.label = 1;
                            if (flowCollector2.emit(arrayList, this) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 5:
                        BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) obj3;
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Continuation continuation = null;
                            JobKt.launch$default(coroutineScope, null, null, new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, i5), 3);
                            JobKt.launch$default(coroutineScope, null, null, new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, continuation, i3), 3);
                            this.L$0 = null;
                            this.label = 1;
                            if (baseDependentControlPresenter.onInitialize(this) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 6:
                        RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) this.L$0;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i12 = this.label;
                        if (i12 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            BlocklyService blocklyService2 = (BlocklyService) realBitcoinAmountPickerPresenter.args;
                            GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest(((DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents).dependentCustomerToken, BlockingContext.FAMILY_BLOCKLIST);
                            this.label = 1;
                            blockedCustomers = blocklyService2.getBlockedCustomers(getBlockedCustomersRequest, this);
                            if (blockedCustomers == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            blockedCustomers = obj;
                        }
                        ApiResult apiResult5 = (ApiResult) blockedCustomers;
                        if (apiResult5 instanceof ApiResult.Success) {
                            ((MutableState) obj3).setValue((GetBlockedCustomersResponse) ((ApiResult.Success) apiResult5).response);
                        }
                        return Unit.INSTANCE;
                    case 7:
                        SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent = (SavingsScreenViewEvent.BalanceSeenEvent) this.L$0;
                        DependentSavingsScreenPresenter dependentSavingsScreenPresenter = (DependentSavingsScreenPresenter) obj3;
                        GpsConfigQueries gpsConfigQueries = dependentSavingsScreenPresenter.goalLocalStatus;
                        DependentGeneralSavingsScreen dependentGeneralSavingsScreen = dependentSavingsScreenPresenter.screen;
                        EglCore eglCore = dependentSavingsScreenPresenter.dependentSavingsStore;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i13 = this.label;
                        if (i13 != 0) {
                            if (i13 == 1 || i13 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i13 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen savingsAndGoalBalanceSeen = (SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen) balanceSeenEvent;
                            gpsConfigQueries.setLastSeenValues(savingsAndGoalBalanceSeen.token, savingsAndGoalBalanceSeen.amount, savingsAndGoalBalanceSeen.remainingBalance, new Long((long) Math.floor(savingsAndGoalBalanceSeen.progress * 10000.0f)));
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        boolean z5 = balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen;
                        BalanceType.Savings savings = BalanceType.Savings.INSTANCE;
                        if (!z5) {
                            if (!(balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen)) {
                                if (balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen) {
                                    SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen goalBalanceSeen = (SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen) balanceSeenEvent;
                                    gpsConfigQueries.setLastSeenValues(goalBalanceSeen.token, goalBalanceSeen.amount, goalBalanceSeen.remainingBalance, new Long((long) Math.floor(goalBalanceSeen.progress * 10000.0f)));
                                    return Unit.INSTANCE;
                                }
                                if (!(balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Money money = ((SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen) balanceSeenEvent).amount;
                                String str3 = dependentGeneralSavingsScreen.dependentCustomerToken;
                                this.label = 3;
                                break;
                            } else {
                                Money money2 = ((SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen) balanceSeenEvent).amount;
                                String str4 = dependentGeneralSavingsScreen.dependentCustomerToken;
                                this.label = 2;
                                break;
                            }
                        } else {
                            Money money3 = ((SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen) balanceSeenEvent).amount;
                            String str5 = dependentGeneralSavingsScreen.dependentCustomerToken;
                            this.label = 1;
                            break;
                        }
                        break;
                    case 8:
                        DependentSavingsScreenPresenter dependentSavingsScreenPresenter2 = (DependentSavingsScreenPresenter) this.L$0;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i14 = this.label;
                        if (i14 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            PiggybankAppService piggybankAppService = dependentSavingsScreenPresenter2.piggybankAppService;
                            FamiliesSavingsScreensRequest familiesSavingsScreensRequest = new FamiliesSavingsScreensRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), dependentSavingsScreenPresenter2.screen.dependentCustomerToken, ByteString.EMPTY);
                            this.label = 1;
                            familiesSavingsScreens = piggybankAppService.familiesSavingsScreens(familiesSavingsScreensRequest, this);
                            if (familiesSavingsScreens == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        } else {
                            if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            familiesSavingsScreens = obj;
                        }
                        ApiResult apiResult6 = (ApiResult) familiesSavingsScreens;
                        if (apiResult6 instanceof ApiResult.Success) {
                            ((MutableState) obj3).setValue(((ApiResult.Success) apiResult6).response);
                        } else if (apiResult6 instanceof ApiResult.Failure.HttpFailure) {
                            Timber.Forest.w("Server returned " + ((ApiResult.Failure.HttpFailure) apiResult6).code + " error. response=" + apiResult6, new Object[0]);
                        } else {
                            if (!(apiResult6 instanceof ApiResult.Failure.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest.w("Server returned network failure", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult6).error);
                        }
                        return Unit.INSTANCE;
                    case 9:
                        MutableState mutableState = (MutableState) obj3;
                        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.L$0;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                        SetDependentCustomLimitScreen setDependentCustomLimitScreen = (SetDependentCustomLimitScreen) poolsListPresenter.analytics;
                        AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i15 = this.label;
                        if (i15 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SetDependentCustomLimitScreen.LimitCategory limitCategory = setDependentCustomLimitScreen.limitCategory;
                            if (!(limitCategory instanceof SetDependentCustomLimitScreen.LimitCategory.P2PSend)) {
                                if (!(limitCategory instanceof SetDependentCustomLimitScreen.LimitCategory.CashCardSpend)) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1(limitCategory, "Secondary button tapped but not supported for ");
                                    return null;
                                }
                                mutableState.setValue(Boolean.TRUE);
                                CustomLimit.LimitType limitType = CustomLimit.LimitType.LIMIT_TYPE_DEFAULT_CARD_SPEND_AMOUNT_30_DAY;
                                this.label = 2;
                                AegisService aegisService = (AegisService) poolsListPresenter.args;
                                String str6 = setDependentCustomLimitScreen.dependentCustomerToken;
                                ByteString byteString = ByteString.EMPTY;
                                customLimits = aegisService.setCustomLimits(new SetCustomLimitsRequest(str6, CollectionsKt__CollectionsJVMKt.listOf(new CustomLimit(limitType, null, null, byteString)), byteString), this);
                                break;
                            } else {
                                mutableState.setValue(Boolean.TRUE);
                                CustomP2PLimit.LimitType limitType2 = CustomP2PLimit.LimitType.LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_30_DAY;
                                this.label = 1;
                                p2PControls = ((FiatlyService) poolsListPresenter.localeAssetProvider).setP2PControls(new SetP2PControlsRequest(((SetDependentCustomLimitScreen) poolsListPresenter.analytics).dependentCustomerToken, new P2PControls(11, null, CollectionsKt__CollectionsJVMKt.listOf(new CustomP2PLimit(limitType2, null, null, ByteString.EMPTY)))), this);
                                break;
                            }
                            return coroutineSingletons10;
                        }
                        if (i15 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            p2PControls = obj;
                            apiResult = (ApiResult) p2PControls;
                        } else {
                            if (i15 != 2) {
                                if (i15 != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                screenNavigator.goTo(back);
                                return Unit.INSTANCE;
                            }
                            SafeTrace.throwOnFailure(obj);
                            customLimits = obj;
                            apiResult = (ApiResult) customLimits;
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                            screenNavigator.goTo(new SetDependentCustomLimitErrorScreen(androidStringManager.get(R.string.family_account_dependent_set_custom_limit_error_dialog_title), androidStringManager.get(R.string.family_account_dependent_investing_set_custom_limit_error_dialog_message), androidStringManager.get(R.string.family_account_dependent_investing_set_custom_limit_error_dialog_positive_button_text)));
                            return Unit.INSTANCE;
                        }
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        RealDependentControlStatusManager realDependentControlStatusManager = (RealDependentControlStatusManager) poolsListPresenter.flowToken;
                        this.label = 3;
                        break;
                    case 10:
                        Money money4 = (Money) obj3;
                        PoolsListPresenter poolsListPresenter2 = (PoolsListPresenter) this.L$0;
                        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) poolsListPresenter2.navigator;
                        AndroidStringManager androidStringManager2 = (AndroidStringManager) poolsListPresenter2.stringManager;
                        SetDependentCustomLimitScreen setDependentCustomLimitScreen2 = (SetDependentCustomLimitScreen) poolsListPresenter2.analytics;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i16 = this.label;
                        if (i16 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SetDependentCustomLimitScreen.LimitCategory limitCategory2 = setDependentCustomLimitScreen2.limitCategory;
                            if (!(limitCategory2 instanceof SetDependentCustomLimitScreen.LimitCategory.BuyStock)) {
                                if (!(limitCategory2 instanceof SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin)) {
                                    if (!(limitCategory2 instanceof SetDependentCustomLimitScreen.LimitCategory.P2PSend)) {
                                        if (!(limitCategory2 instanceof SetDependentCustomLimitScreen.LimitCategory.CashCardSpend)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        CustomLimit.LimitType limitType3 = CustomLimit.LimitType.LIMIT_TYPE_SPONSORED_CARD_SPEND_AMOUNT_30_DAY;
                                        this.label = 4;
                                        AegisService aegisService2 = (AegisService) poolsListPresenter2.args;
                                        String str7 = setDependentCustomLimitScreen2.dependentCustomerToken;
                                        ByteString byteString2 = ByteString.EMPTY;
                                        customLimits2 = aegisService2.setCustomLimits(new SetCustomLimitsRequest(str7, CollectionsKt__CollectionsJVMKt.listOf(new CustomLimit(limitType3, money4, null, byteString2)), byteString2), this);
                                        break;
                                    } else {
                                        CustomP2PLimit.LimitType limitType4 = CustomP2PLimit.LimitType.LIMIT_TYPE_SPONSORED_P2P_SEND_AMOUNT_30_DAY;
                                        this.label = 3;
                                        p2PControls2 = ((FiatlyService) poolsListPresenter2.localeAssetProvider).setP2PControls(new SetP2PControlsRequest(((SetDependentCustomLimitScreen) poolsListPresenter2.analytics).dependentCustomerToken, new P2PControls(11, null, CollectionsKt__CollectionsJVMKt.listOf(new CustomP2PLimit(limitType4, money4, null, ByteString.EMPTY)))), this);
                                        break;
                                    }
                                } else {
                                    CryptoCustomerControlsService cryptoCustomerControlsService = (CryptoCustomerControlsService) poolsListPresenter2.sessionManager;
                                    Member.Builder builder = new Member.Builder((boolean) r12);
                                    builder.customer_token = setDependentCustomLimitScreen2.dependentCustomerToken;
                                    UiAppMesssages.Builder builder2 = new UiAppMesssages.Builder(1);
                                    WithdrawalDetails.Builder builder3 = new WithdrawalDetails.Builder(13);
                                    builder3.withdrawalType = ((SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin) limitCategory2).frequency;
                                    builder3.customer_supplied_amount = money4;
                                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(new CryptoExchangeCustomerControl.CryptoExchangeLimit((CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency) builder3.withdrawalType, (Money) builder3.customer_supplied_amount, (Money) builder3.customer_token, builder3.buildUnknownFields()));
                                    listOf.getClass();
                                    TransactorKt.checkElementsNotNull(listOf);
                                    builder2.app_message_tokens = listOf;
                                    builder.sponsorship_tier = new SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl(new CryptoExchangeCustomerControl(builder2.app_message_notifications_enabled, builder2.app_message_tokens, builder2.buildUnknownFields()));
                                    SetCryptoControlsRequest setCryptoControlsRequest = new SetCryptoControlsRequest((String) builder.customer_token, (SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl) builder.sponsorship_tier, builder.buildUnknownFields());
                                    this.label = 2;
                                    cryptoControls = cryptoCustomerControlsService.setCryptoControls(setCryptoControlsRequest, this);
                                    break;
                                }
                            } else {
                                InvestCustomerService investCustomerService = (InvestCustomerService) poolsListPresenter2.repository;
                                Group.Builder builder4 = new Group.Builder((boolean) r12);
                                builder4.name = setDependentCustomLimitScreen2.dependentCustomerToken;
                                builder4.participants = new CustomerLimit(((SetDependentCustomLimitScreen.LimitCategory.BuyStock) limitCategory2).frequency, money4, null, ByteString.EMPTY);
                                SetCustomerControlsRequest setCustomerControlsRequest = new SetCustomerControlsRequest((String) builder4.name, (Boolean) builder4.group_image, (CustomerLimit) builder4.participants, builder4.buildUnknownFields());
                                this.label = 1;
                                customerControls = investCustomerService.setCustomerControls(setCustomerControlsRequest, this);
                                break;
                            }
                            return coroutineSingletons11;
                        }
                        if (i16 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            customerControls = obj;
                            apiResult2 = (ApiResult) customerControls;
                        } else if (i16 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            cryptoControls = obj;
                            apiResult2 = (ApiResult) cryptoControls;
                        } else if (i16 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            p2PControls2 = obj;
                            apiResult2 = (ApiResult) p2PControls2;
                        } else {
                            if (i16 != 4) {
                                if (i16 != 5) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                screenNavigator2.goTo(back);
                                return Unit.INSTANCE;
                            }
                            SafeTrace.throwOnFailure(obj);
                            customLimits2 = obj;
                            apiResult2 = (ApiResult) customLimits2;
                        }
                        if (apiResult2 instanceof ApiResult.Failure) {
                            screenNavigator2.goTo(new SetDependentCustomLimitErrorScreen(androidStringManager2.get(R.string.family_account_dependent_set_custom_limit_error_dialog_title), androidStringManager2.get(R.string.family_account_dependent_investing_set_custom_limit_error_dialog_message), androidStringManager2.get(R.string.family_account_dependent_investing_set_custom_limit_error_dialog_positive_button_text)));
                            return Unit.INSTANCE;
                        }
                        if (!(apiResult2 instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        RealDependentControlStatusManager realDependentControlStatusManager2 = (RealDependentControlStatusManager) poolsListPresenter2.flowToken;
                        this.label = 5;
                        break;
                    case 11:
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i17 = this.label;
                        if (i17 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Animatable animatable = (Animatable) this.L$0;
                            Float f = new Float(((WalletMetrics) obj3).dollarRestTopPx);
                            SpringSpec spring$default = AnimatableKt.spring$default(0.88f, 420.0f, null, 4);
                            this.label = 1;
                            if (Animatable.animateTo$default(animatable, f, spring$default, null, null, this, 12) == coroutineSingletons12) {
                                return coroutineSingletons12;
                            }
                        } else {
                            if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 12:
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i18 = this.label;
                        if (i18 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SelectSponsorPresenter selectSponsorPresenter = (SelectSponsorPresenter) this.L$0;
                            SelectSponsorScreen selectSponsorScreen = selectSponsorPresenter.selectSponsorScreen;
                            selectSponsorScreen.getClass();
                            this.label = 1;
                            if (BlockersHelper.handleBlockerAction$default(selectSponsorPresenter.blockersHelper, (BlockerAction) obj3, selectSponsorScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons13) {
                                return coroutineSingletons13;
                            }
                        } else {
                            if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 13:
                        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.L$0;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i19 = this.label;
                        if (i19 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            AegisService aegisService3 = (AegisService) verifyCheckDialogPresenter.args;
                            GetSafetyEducationHubRequest getSafetyEducationHubRequest = new GetSafetyEducationHubRequest(ByteString.EMPTY);
                            this.label = 1;
                            safetyEducationHub = aegisService3.getSafetyEducationHub(getSafetyEducationHubRequest, this);
                            if (safetyEducationHub == coroutineSingletons14) {
                                return coroutineSingletons14;
                            }
                        } else {
                            if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            safetyEducationHub = obj;
                        }
                        ApiResult apiResult7 = (ApiResult) safetyEducationHub;
                        if (apiResult7 instanceof ApiResult.Success) {
                            SafetyEducationHub safetyEducationHub2 = ((GetSafetyEducationHubResponse) ((ApiResult.Success) apiResult7).response).safety_education_hub;
                            safetyEducationHub2.getClass();
                            ((MutableState) obj3).setValue(new SafetyHubViewModel.Loaded(safetyEducationHub2));
                        } else {
                            ((BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator).goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 14:
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i20 = this.label;
                        if (i20 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealFavoritesManager realFavoritesManager = (RealFavoritesManager) ((LocalEditorialPresenter) this.L$0).service;
                            String str8 = ((ListFavoritesViewEvent.FavoriteClicked) ((ListFavoritesViewEvent) obj3)).customerId;
                            FavoriteOrigin favoriteOrigin = FavoriteOrigin.FAVORITE_ORIGIN_FAVORITES_MANAGEMENT;
                            RemoveFavoriteAnalytics removeFavoriteAnalytics = new RemoveFavoriteAnalytics(CustomerProfileConnectRemoveFavorite.Origin.FAVORITES_MANAGEMENT);
                            this.label = 1;
                            if (realFavoritesManager.removeFavorite(str8, favoriteOrigin, removeFavoriteAnalytics, this) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        } else {
                            if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 15:
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i21 = this.label;
                        if (i21 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.L$0;
                            List list = ((GetFeatureFlagsResponse) ((ApiResult.Success) obj3).response).feature_flags;
                            JsonFeatureFlags$MigratedSyncValuesFlag jsonFeatureFlags$MigratedSyncValuesFlag = JsonFeatureFlags$MigratedSyncValuesFlag.INSTANCE;
                            list.getClass();
                            jsonFeatureFlags$MigratedSyncValuesFlag.getClass();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (Intrinsics.areEqual(((FeatureFlag) obj2).name, (String) jsonFeatureFlags$MigratedSyncValuesFlag.root)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            FeatureFlag featureFlag = (FeatureFlag) obj2;
                            String str9 = featureFlag != null ? featureFlag.selected_option_value : null;
                            this.label = 1;
                            RealMigratedSyncValueBugsnagMetadata realMigratedSyncValueBugsnagMetadata = realFeatureFlagManager.migratedSyncValueBugsnagMetadata;
                            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Migrated Sync values updated to ", str9), new Object[0]);
                            realMigratedSyncValueBugsnagMetadata.bugsnagClient.addMetadata(MetadataSection$AppSection.INSTANCE, MetadataSection$AppSection.MigratedSyncValuesKey.INSTANCE, str9);
                            Unit unit = Unit.INSTANCE;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (unit == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        } else {
                            if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 16:
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i22 = this.label;
                        if (i22 != 0) {
                            if (i22 == 1) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl2 = ((FormCashtag) ((FormEventful) this.L$0)).formEvents;
                        FormView$renderViewModel$4.AnonymousClass2 anonymousClass2 = new FormView$renderViewModel$4.AnonymousClass2((FormView) obj3, 1);
                        this.label = 1;
                        sharedFlowImpl2.collect(anonymousClass2, this);
                        return coroutineSingletons18;
                    case 17:
                        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i23 = this.label;
                        if (i23 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            List list2 = (List) this.L$0;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((FormRequirementProvider) it2.next()).requirements());
                            }
                            Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
                            FormView$renderViewModel$4.AnonymousClass2 anonymousClass22 = new FormView$renderViewModel$4.AnonymousClass2((FormView) obj3, i4);
                            this.label = 1;
                            Object combineInternal = CombineKt.combineInternal(this, new CardModelView$textures$$inlined$combine$1.AnonymousClass2(flowArr, i3), new CardModelView$textures$$inlined$combine$1.AnonymousClass3(i5, z ? 1 : 0, i5), anonymousClass22, flowArr);
                            Object obj5 = combineInternal;
                            if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj5 = Unit.INSTANCE;
                            }
                            if (obj5 == obj4) {
                                return obj4;
                            }
                        } else {
                            if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 18:
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i24 = this.label;
                        if (i24 != 0) {
                            if (i24 == 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(obj);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl3 = ((FormView) this.L$0).viewEvents;
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4((Ui.EventReceiver) obj3, i2);
                        this.label = 1;
                        sharedFlowImpl3.getClass();
                        SharedFlowImpl.collect$suspendImpl(sharedFlowImpl3, anonymousClass4, this);
                        return coroutineSingletons19;
                    case 19:
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i25 = this.label;
                        if (i25 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(i2, (MutableState) obj3)), 1);
                            DataStoreImpl$data$1.AnonymousClass2 anonymousClass23 = new DataStoreImpl$data$1.AnonymousClass2(i4, z2 ? 1 : 0, 22);
                            this.label = 1;
                            if (FlowKt.first(drop, anonymousClass23, this) == coroutineSingletons20) {
                                return coroutineSingletons20;
                            }
                        } else {
                            if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        ArcadeFormDateInputView arcadeFormDateInputView = (ArcadeFormDateInputView) this.L$0;
                        arcadeFormDateInputView.onEvent.invoke(new FormViewEvent.ElementEvent.StartInput(arcadeFormDateInputView.formElementId));
                        return Unit.INSTANCE;
                    case 20:
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i26 = this.label;
                        if (i26 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            List list3 = (List) this.L$0;
                            ArrayList arrayList3 = new ArrayList(list3.size());
                            int size2 = list3.size();
                            for (int i27 = 0; i27 < size2; i27++) {
                                arrayList3.add(FlowKt.drop(Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(12, (TextFieldState) list3.get(i27))), 1));
                            }
                            int i28 = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
                            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new Camera$special$$inlined$map$1(new ChannelFlowBuilder(arrayList3, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND, 1), 1), 1);
                            AnonymousClass4 anonymousClass42 = new AnonymousClass4((ArcadeFormTextInputGroupView) obj3, 29);
                            this.label = 1;
                            if (take.collect(anonymousClass42, this) == coroutineSingletons21) {
                                return coroutineSingletons21;
                            }
                        } else {
                            if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 21:
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i29 = this.label;
                        if (i29 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            FormPresenter formPresenter = (FormPresenter) this.L$0;
                            BlockersScreens.FormScreen formScreen = formPresenter.args;
                            FormPresenter$models$2$1$1 formPresenter$models$2$1$1 = new FormPresenter$models$2$1$1(2, null);
                            this.label = 1;
                            if (BlockersHelper.handleBlockerAction$default(formPresenter.blockersHelper, (BlockerAction) obj3, formScreen, null, null, false, null, formPresenter$models$2$1$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons22) {
                                return coroutineSingletons22;
                            }
                        } else {
                            if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 22:
                        SearchResult searchResult = (SearchResult) this.L$0;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i30 = this.label;
                        if (i30 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SharedFlowImpl sharedFlowImpl4 = ((RealGlobalSearchRepository) obj3).cachedData;
                            this.L$0 = null;
                            this.label = 1;
                            if (sharedFlowImpl4.emit(searchResult, this) == coroutineSingletons23) {
                                return coroutineSingletons23;
                            }
                        } else {
                            if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 23:
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i31 = this.label;
                        if (i31 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealGlobalSearchRepository.RealSectionHandle realSectionHandle = ((ActivitySectionPresenter) this.L$0).sectionHandle;
                            String rowId = ((FormattedPaymentHistoryActivityItem) obj3).getRowId();
                            this.label = 1;
                            if (realSectionHandle.tryUpdateItem(rowId, this) == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        } else {
                            if (i31 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 24:
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i32 = this.label;
                        if (i32 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            ChannelAsFlow channelAsFlow = ((RealActivityScreenInitialArgumentsSupplier) ((LocalEditorialPresenter) this.L$0).stringManager).initialSearchQueries;
                            TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1((MutableState) obj3, (Continuation) (z3 ? 1 : 0), 11);
                            this.label = 1;
                            if (FlowKt.collectLatest(channelAsFlow, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons25) {
                                return coroutineSingletons25;
                            }
                        } else {
                            if (i32 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 25:
                        MutableState mutableState2 = (MutableState) obj3;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i33 = this.label;
                        if (i33 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            mutableState2.setValue(Boolean.TRUE);
                            RealGlobalSearchRepository.RealSectionHandle realSectionHandle2 = ((RowSectionPresenter) this.L$0).sectionHandle;
                            this.label = 1;
                            if (realSectionHandle2.loadMore(this) == coroutineSingletons26) {
                                return coroutineSingletons26;
                            }
                        } else {
                            if (i33 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        mutableState2.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    case 26:
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i34 = this.label;
                        if (i34 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RowSectionPresenter rowSectionPresenter = (RowSectionPresenter) this.L$0;
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = rowSectionPresenter.analyticsHelper;
                            SearchOrigin searchOrigin = rowSectionPresenter.screen.searchOrigin;
                            GlobalSearchViewModel.Item item = ((GlobalSearchViewEvent.RowSectionEvent.RowViewed) ((GlobalSearchViewEvent.RowSectionEvent) obj3)).item;
                            String str10 = item.key;
                            String str11 = item.entityId;
                            String str12 = item.entityType;
                            String str13 = item.metadataJson;
                            this.label = 1;
                            if (realGlobalSearchAnalyticsHelper.submitViewItemEvent(searchOrigin, str10, str11, str12, str13, this) == coroutineSingletons27) {
                                return coroutineSingletons27;
                            }
                        } else {
                            if (i34 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 27:
                        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i35 = this.label;
                        if (i35 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (((GlobalSearchViewModel.ErrorToast) obj3) != null) {
                                produceStateScope.setValue(Boolean.TRUE);
                                Duration.Companion companion = Duration.Companion;
                                long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                                this.L$0 = produceStateScope;
                                this.label = 1;
                                if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons28) {
                                    return coroutineSingletons28;
                                }
                            }
                        } else {
                            if (i35 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        produceStateScope.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    case 28:
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i36 = this.label;
                        if (i36 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SafeFlow snapshotFlow = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.L$0, 6));
                            GlobalSearchViewKt$GlobalSearch$1$1$2 globalSearchViewKt$GlobalSearch$1$1$2 = new GlobalSearchViewKt$GlobalSearch$1$1$2((SearchBarKeyboardState) obj3, 0);
                            this.label = 1;
                            if (snapshotFlow.collect(globalSearchViewKt$GlobalSearch$1$1$2, this) == coroutineSingletons29) {
                                return coroutineSingletons29;
                            }
                        } else {
                            if (i36 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    default:
                        GooglePayPresenter googlePayPresenter = (GooglePayPresenter) obj3;
                        BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen = googlePayPresenter.args;
                        RealGooglePayer realGooglePayer = googlePayPresenter.googlePayer;
                        CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        switch (this.label) {
                            case 0:
                                SafeTrace.throwOnFailure(obj);
                                this.label = 1;
                                activeWalletId = realGooglePayer.getActiveWalletId(this);
                                break;
                            case 1:
                                SafeTrace.throwOnFailure(obj);
                                activeWalletId = obj;
                                str = (String) activeWalletId;
                                if (str == null) {
                                    zzag apiClient = realGooglePayer.getApiClient();
                                    Activity activity = realGooglePayer.activity;
                                    apiClient.getClass();
                                    zacn builder5 = zacn.builder();
                                    builder5.zaa = new OneShotDisposable(activity, 21);
                                    builder5.zac = 2112;
                                    apiClient.zae(0, builder5.build());
                                    RealGooglePayer$createWallet$$inlined$map$1 realGooglePayer$createWallet$$inlined$map$1 = new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(realGooglePayer.activityResults, 0), new DataStoreImpl$data$1.AnonymousClass2(i4, z4 ? 1 : 0, 23), 3), r12);
                                    this.L$0 = null;
                                    this.label = 2;
                                    first = FlowKt.first(realGooglePayer$createWallet$$inlined$map$1, this);
                                    break;
                                }
                                this.L$0 = str;
                                this.label = 6;
                                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                                cancellableContinuationImpl.initCancellability();
                                zzag apiClient2 = realGooglePayer.getApiClient();
                                apiClient2.getClass();
                                zacn builder6 = zacn.builder();
                                builder6.zaa = new zza(apiClient2, 7);
                                builder6.zac = 2109;
                                apiClient2.zae(0, builder6.build()).addOnCompleteListener(new KotlinExtensions$await$4$2(cancellableContinuationImpl));
                                result = cancellableContinuationImpl.getResult();
                                break;
                            case 2:
                                SafeTrace.throwOnFailure(obj);
                                first = obj;
                                int i37 = ((GooglePayer$GooglePayEvent$CreateWalletResult) first).result;
                                if (i37 != -1) {
                                    if (i37 == 0) {
                                        googlePayPresenter.blockerFlowAnalytics.onFlowCancelled(provisionGooglePayScreen.blockersData);
                                        googlePayPresenter.navigator.goTo(provisionGooglePayScreen.blockersData.exitScreen);
                                        return Unit.INSTANCE;
                                    }
                                    DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.UNKNOWN_ERROR;
                                    this.L$0 = null;
                                    this.label = 3;
                                    access$reportFailure = GooglePayPresenter.access$reportFailure(googlePayPresenter, provisioningResult, this);
                                    break;
                                }
                                this.L$0 = null;
                                this.label = 4;
                                activeWalletId2 = realGooglePayer.getActiveWalletId(this);
                                break;
                            case 3:
                                SafeTrace.throwOnFailure(obj);
                                access$reportFailure = obj;
                                if (((Boolean) access$reportFailure).booleanValue()) {
                                    return Unit.INSTANCE;
                                }
                                this.L$0 = null;
                                this.label = 4;
                                activeWalletId2 = realGooglePayer.getActiveWalletId(this);
                                break;
                            case 4:
                                SafeTrace.throwOnFailure(obj);
                                activeWalletId2 = obj;
                                str = (String) activeWalletId2;
                                if (str == null) {
                                    DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult2 = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.NO_ACTIVE_WALLET;
                                    this.L$0 = null;
                                    this.label = 5;
                                    break;
                                }
                                this.L$0 = str;
                                this.label = 6;
                                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                                cancellableContinuationImpl2.initCancellability();
                                zzag apiClient22 = realGooglePayer.getApiClient();
                                apiClient22.getClass();
                                zacn builder62 = zacn.builder();
                                builder62.zaa = new zza(apiClient22, 7);
                                builder62.zac = 2109;
                                apiClient22.zae(0, builder62.build()).addOnCompleteListener(new KotlinExtensions$await$4$2(cancellableContinuationImpl2));
                                result = cancellableContinuationImpl2.getResult();
                                break;
                            case 5:
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            case 6:
                                String str14 = (String) this.L$0;
                                SafeTrace.throwOnFailure(obj);
                                str = str14;
                                result = obj;
                                String str15 = (String) result;
                                if (str15 == null) {
                                    DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult3 = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.UNKNOWN_ERROR;
                                    this.L$0 = null;
                                    this.label = 7;
                                    break;
                                } else {
                                    GooglePayProvisioningGateway googlePayProvisioningGateway = googlePayPresenter.provisioningGateway;
                                    this.L$0 = null;
                                    this.label = 8;
                                    provision = googlePayProvisioningGateway.provision(provisionGooglePayScreen, str, str15, this);
                                    break;
                                }
                                return coroutineSingletons30;
                            case 7:
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            case 8:
                                SafeTrace.throwOnFailure(obj);
                                provision = obj;
                                GooglePayPresenter$models$1$1$1$1 googlePayPresenter$models$1$1$1$1 = new GooglePayPresenter$models$1$1$1$1(googlePayPresenter, r12);
                                this.L$0 = null;
                                this.label = 9;
                                break;
                            case 9:
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            default:
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass2(Object obj, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.this$0 = obj;
            }
        }
    }
}
