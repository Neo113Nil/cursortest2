package com.squareup.cash.phoneplans;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.text.TextUtilsCompat;
import androidx.room.util.DBUtil;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewEvent;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewModel;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeResponse;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeViewError;
import com.squareup.cash.cdf.asset.AssetPoolPoolSubmitContribution;
import com.squareup.cash.cdf.asset.AssetRequestAddRecipientFromShareSheet;
import com.squareup.cash.cdf.asset.AssetRequestSubmitTransaction;
import com.squareup.cash.cdf.asset.AssetSendSubmitTransaction;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.SuggestionStrategy;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectAddFavorite;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectRemoveFavorite;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentStillLookingPageLand;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.favorites.data.AddFavoriteAnalytics;
import com.squareup.cash.favorites.data.FavoritesManager$Operation$Add$Result;
import com.squareup.cash.favorites.data.FavoritesManager$Operation$Remove$Result;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.data.RemoveFavoriteAnalytics;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableBratHype;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.PaymentInitiator$Result;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.NearbyPermissionsPromptSheetPresenter;
import com.squareup.cash.payments.presenters.PaymentClaimPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.QuickPayPresenter;
import com.squareup.cash.payments.presenters.QuickPayState;
import com.squareup.cash.payments.presenters.RealPaymentConfigurationRouter;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.pools.backend.api.LoadPoolStatus;
import com.squareup.cash.pools.backend.api.PoolData;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.CashInstrumentTypeExtensionsKt$WhenMappings;
import com.squareup.cash.pools.presenters.PoolContributeWithNotePresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter$models$1$3$WhenMappings;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$PasscodeToggleData;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.cash.nearby.api.v1.BroadcasterProfileData;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionRequest;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionResponse;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.nearby.api.v1.NearbySession;
import com.squareup.protos.cash.nearby.api.v1.NearbySessionService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.PoolOwnerContributionFlowParameters;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PhonePlansHomePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $isError$delegate;
    public final /* synthetic */ Object $isLoading$delegate;
    public Object $model;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansHomePresenter$models$1$1(PaymentConfigurationPresenter paymentConfigurationPresenter, RealPaymentConfigurationRouter realPaymentConfigurationRouter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.this$0 = paymentConfigurationPresenter;
        this.$isError$delegate = realPaymentConfigurationRouter;
        this.$model = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r0 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r0 == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$profile$presenters$RealGenericProfileElementsPresenter$models$1$3(Object obj) {
        Object addFavorite;
        Object removeFavorite;
        MutableState mutableState = (MutableState) this.$model;
        GenericProfileElementsViewEvent genericProfileElementsViewEvent = (GenericProfileElementsViewEvent) this.$isLoading$delegate;
        RealGenericProfileElementsPresenter realGenericProfileElementsPresenter = (RealGenericProfileElementsPresenter) this.this$0;
        EglCore eglCore = realGenericProfileElementsPresenter.favoritesNavigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(Boolean.TRUE);
            ProfileScreens.ProfileScreen.Customer customer = realGenericProfileElementsPresenter.screen.customer;
            if (customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) {
                String str = (String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer).customerId.getValue();
                List list = (List) ((State) this.$isError$delegate).getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Recipient) it.next()).customerId);
                }
                boolean contains = arrayList.contains(str);
                RealFavoritesManager realFavoritesManager = realGenericProfileElementsPresenter.favoritesManager;
                if (contains) {
                    String str2 = ((GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked) genericProfileElementsViewEvent).customerId;
                    FavoriteOrigin favoriteOrigin = FavoriteOrigin.FAVORITE_ORIGIN_CUSTOMER_PROFILE;
                    RemoveFavoriteAnalytics removeFavoriteAnalytics = new RemoveFavoriteAnalytics(CustomerProfileConnectRemoveFavorite.Origin.CUSTOMER_PROFILE);
                    this.label = 1;
                    removeFavorite = realFavoritesManager.removeFavorite(str2, favoriteOrigin, removeFavoriteAnalytics, this);
                } else {
                    String str3 = ((GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked) genericProfileElementsViewEvent).customerId;
                    FavoriteOrigin favoriteOrigin2 = FavoriteOrigin.FAVORITE_ORIGIN_CUSTOMER_PROFILE;
                    String str4 = realGenericProfileElementsPresenter.inAppMessageToken;
                    AddFavoriteAnalytics addFavoriteAnalytics = new AddFavoriteAnalytics(null, null, CustomerProfileConnectAddFavorite.Origin.CUSTOMER_PROFILE);
                    this.label = 2;
                    addFavorite = realFavoritesManager.addFavorite(str3, favoriteOrigin2, str4, addFavoriteAnalytics, this);
                }
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            SafeTrace.throwOnFailure(obj);
            removeFavorite = obj;
            if (RealGenericProfileElementsPresenter$models$1$3$WhenMappings.$EnumSwitchMapping$0[((FavoritesManager$Operation$Remove$Result) removeFavorite).ordinal()] == 1) {
                eglCore.showNoNetworkConnection();
            }
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            addFavorite = obj;
            int ordinal = ((FavoritesManager$Operation$Add$Result) addFavorite).ordinal();
            if (ordinal == 0) {
                String str5 = ((GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked) genericProfileElementsViewEvent).name;
                eglCore.getClass();
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) eglCore.eglDisplay;
                AndroidStringManager androidStringManager = (AndroidStringManager) eglCore.eglContext;
                screenNavigator.goTo(new FavoritesMessage(androidStringManager.get(R.string.favorites_limit_title), androidStringManager.get(R.string.favorites_limit_message)));
            } else if (ordinal == 2) {
                GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked addOrRemoveAsFavoriteClicked = (GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked) genericProfileElementsViewEvent;
                EglCore.showAddedFavoriteSuccess$default(realGenericProfileElementsPresenter.favoritesNavigator, addOrRemoveAsFavoriteClicked.name, addOrRemoveAsFavoriteClicked.photo, addOrRemoveAsFavoriteClicked.accentColor, addOrRemoveAsFavoriteClicked.monogram, true);
            } else if (ordinal == 3) {
                eglCore.showNoNetworkConnection();
            }
        }
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0048, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$profile$presenters$RealProfilePasscodePresenter$passcodeToggleData$2(Object obj) {
        Object obj2;
        Instrument instrument;
        BalanceSnapshot balanceSnapshot;
        Instrument instrument2;
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance;
        String str = (String) this.$isError$delegate;
        TransfersPresenter transfersPresenter = (TransfersPresenter) this.$isLoading$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow select = ((RealInstrumentManager) transfersPresenter.issuedCardManager).select();
            this.label = 1;
            obj = FlowKt.first(select, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    balanceSnapshot = (BalanceSnapshot) this.$model;
                    instrument2 = (Instrument) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
                    if (!Intrinsics.areEqual(cryptoBalance$BitcoinBalance == null ? cryptoBalance$BitcoinBalance.instrumentToken : null, str)) {
                        obj = null;
                    }
                    CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance2 = (CryptoBalance$BitcoinBalance) obj;
                    if (instrument2 == null) {
                        return new RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument(instrument2);
                    }
                    if (balanceSnapshot != null) {
                        return new RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BalanceVerificationInstrument(balanceSnapshot);
                    }
                    if (cryptoBalance$BitcoinBalance2 != null) {
                        return new RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BitcoinVerificationInstrument(cryptoBalance$BitcoinBalance2);
                    }
                    return null;
                }
                instrument = (Instrument) this.this$0;
                SafeTrace.throwOnFailure(obj);
                BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) obj;
                if (!Intrinsics.areEqual(balanceSnapshot2 != null ? balanceSnapshot2.token : null, str)) {
                    obj = null;
                }
                BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) obj;
                ChannelFlowTransformLatest bitcoinBalance = ((RealCryptoBalanceRepo) transfersPresenter.syncValueReader).getBitcoinBalance();
                this.this$0 = instrument;
                this.$model = balanceSnapshot3;
                this.label = 3;
                Object first = FlowKt.first(bitcoinBalance, this);
                if (first != coroutineSingletons) {
                    balanceSnapshot = balanceSnapshot3;
                    obj = first;
                    instrument2 = instrument;
                    cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
                    if (!Intrinsics.areEqual(cryptoBalance$BitcoinBalance == null ? cryptoBalance$BitcoinBalance.instrumentToken : null, str)) {
                    }
                    CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance22 = (CryptoBalance$BitcoinBalance) obj;
                    if (instrument2 == null) {
                    }
                }
                return coroutineSingletons;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((Instrument) obj2).token, str)) {
                break;
            }
        }
        instrument = (Instrument) obj2;
        ChannelFlowTransformLatest select2 = ((RealBalanceSnapshotManager) transfersPresenter.accountFormatter).select();
        this.this$0 = instrument;
        this.label = 2;
        obj = FlowKt.first(select2, this);
    }

    private final Object invokeSuspend$com$squareup$cash$profile$presenters$allowedaccounts$RealAllowedAccountsSectionPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$isLoading$delegate;
            WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope, (SetDefaultInstrumentPresenter) this.$isError$delegate, (MutableState) this.$model, 12);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$isError$delegate;
        Object obj3 = this.$isLoading$delegate;
        switch (i) {
            case 0:
                return new PhonePlansHomePresenter$models$1$1((InviteErrorPresenter) this.this$0, (MutableState) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (WorkHomePresenter) obj3, (State) obj2, 1);
                phonePlansHomePresenter$models$1$1.this$0 = obj;
                return phonePlansHomePresenter$models$1$1;
            case 2:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$12 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (TapToPayPresenter) obj3, (State) obj2, 2);
                phonePlansHomePresenter$models$1$12.this$0 = obj;
                return phonePlansHomePresenter$models$1$12;
            case 3:
                return new PhonePlansHomePresenter$models$1$1((MainPaymentPadPresenter) this.this$0, (MutableState) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                return new PhonePlansHomePresenter$models$1$1((CardLockPresenter) this.this$0, (MutableState) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                return new PhonePlansHomePresenter$models$1$1((LocalPosLocalCashRedemptionPresenter) this.this$0, (MutableState) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 5);
            case 6:
                return new PhonePlansHomePresenter$models$1$1((TaxReturnsPresenter) this.this$0, (NearbyAdvertisement) this.$model, (SnapshotStateMap) obj3, (SnapshotStateSet) obj2, continuation, 6);
            case 7:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$13 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (NearbyPermissionsPromptSheetPresenter) obj3, (State) obj2, 7);
                phonePlansHomePresenter$models$1$13.this$0 = obj;
                return phonePlansHomePresenter$models$1$13;
            case 8:
                int i2 = 8;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$14 = new PhonePlansHomePresenter$models$1$1(i2, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$14.this$0 = obj;
                return phonePlansHomePresenter$models$1$14;
            case 9:
                return new PhonePlansHomePresenter$models$1$1((PaymentConfigurationPresenter) this.this$0, (RealPaymentConfigurationRouter) obj2, (MutableState) this.$model, (MutableState) obj3, continuation);
            case 10:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$15 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (TaxReturnsPresenter) obj3, (State) obj2, 10);
                phonePlansHomePresenter$models$1$15.this$0 = obj;
                return phonePlansHomePresenter$models$1$15;
            case 11:
                return new PhonePlansHomePresenter$models$1$1((QuickPayPresenter) this.$model, (QuickPayState) obj3, (List) obj2, continuation, 11);
            case 12:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$16 = new PhonePlansHomePresenter$models$1$1((Channel) this.$model, (Function0) obj3, (Function1) obj2, continuation, 12);
                phonePlansHomePresenter$models$1$16.this$0 = obj;
                return phonePlansHomePresenter$models$1$16;
            case 13:
                int i3 = 13;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$17 = new PhonePlansHomePresenter$models$1$1(i3, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$17.this$0 = obj;
                return phonePlansHomePresenter$models$1$17;
            case 14:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$18 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (WorkHomePresenter) obj3, (State) obj2, 14);
                phonePlansHomePresenter$models$1$18.this$0 = obj;
                return phonePlansHomePresenter$models$1$18;
            case 15:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$19 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (WorkHomePresenter) obj3, (State) obj2, 15);
                phonePlansHomePresenter$models$1$19.this$0 = obj;
                return phonePlansHomePresenter$models$1$19;
            case 16:
                return new PhonePlansHomePresenter$models$1$1(16, (MutableState) this.$model, obj3, obj2, continuation);
            case 17:
                return new PhonePlansHomePresenter$models$1$1((ProfilePresenter) this.this$0, (MutableState) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 17);
            case 18:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$110 = new PhonePlansHomePresenter$models$1$1(obj3, obj2, continuation, (MutableState) this.$model);
                phonePlansHomePresenter$models$1$110.this$0 = obj;
                return phonePlansHomePresenter$models$1$110;
            case 19:
                int i4 = 19;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$111 = new PhonePlansHomePresenter$models$1$1(i4, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$111.this$0 = obj;
                return phonePlansHomePresenter$models$1$111;
            case 20:
                int i5 = 20;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$112 = new PhonePlansHomePresenter$models$1$1(i5, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$112.this$0 = obj;
                return phonePlansHomePresenter$models$1$112;
            case 21:
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$113 = new PhonePlansHomePresenter$models$1$1((Flow) this.$model, continuation, (PdfPreviewPresenter) obj3, (State) obj2, 21);
                phonePlansHomePresenter$models$1$113.this$0 = obj;
                return phonePlansHomePresenter$models$1$113;
            case 22:
                int i6 = 22;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$114 = new PhonePlansHomePresenter$models$1$1(i6, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$114.this$0 = obj;
                return phonePlansHomePresenter$models$1$114;
            case 23:
                return new PhonePlansHomePresenter$models$1$1((InviteErrorPresenter) obj2, (MutableState) obj3, continuation);
            case 24:
                return new PhonePlansHomePresenter$models$1$1(24, (MutableState) this.$model, (IncomingRequestsViewEvent) obj3, (InviteErrorPresenter) obj2, continuation);
            case 25:
                int i7 = 25;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$115 = new PhonePlansHomePresenter$models$1$1(i7, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$115.this$0 = obj;
                return phonePlansHomePresenter$models$1$115;
            case 26:
                return new PhonePlansHomePresenter$models$1$1((RealGenericProfileElementsPresenter) this.this$0, (GenericProfileElementsViewEvent) obj3, (MutableState) this.$model, (State) obj2, continuation);
            case 27:
                return new PhonePlansHomePresenter$models$1$1((TransfersPresenter) obj3, (String) obj2, continuation);
            case 28:
                int i8 = 28;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$116 = new PhonePlansHomePresenter$models$1$1(i8, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$116.this$0 = obj;
                return phonePlansHomePresenter$models$1$116;
            default:
                int i9 = 29;
                PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$117 = new PhonePlansHomePresenter$models$1$1(i9, (MutableState) this.$model, (MoleculePresenter) obj2, obj3, continuation);
                phonePlansHomePresenter$models$1$117.this$0 = obj;
                return phonePlansHomePresenter$models$1$117;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((PhonePlansHomePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.util.List, kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r4v41, types: [com.squareup.cash.payments.screens.InstrumentSelectionData] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.squareup.cash.payments.screens.InstrumentSelectionData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object mobilePlanHome;
        Object nearbySession;
        NearbyContext nearbyContext;
        BroadcasterProfileData broadcasterProfileData;
        String str;
        BroadcasterProfileData broadcasterProfileData2;
        String str2;
        BroadcasterProfileData broadcasterProfileData3;
        String str3;
        BroadcasterProfileData broadcasterProfileData4;
        String str4;
        BroadcasterProfileData broadcasterProfileData5;
        BroadcasterProfileData broadcasterProfileData6;
        String str5;
        SuggestionStrategy suggestionStrategy;
        SuggestionStrategy suggestionStrategy2;
        PaymentInitiatorData createPaymentInitiatorData$presenters;
        Object initiate;
        SuggestionStrategy suggestionStrategy3;
        SuggestionStrategy suggestionStrategy4;
        Object initiate2;
        BetterNavigator.ScreenNavigator screenNavigator;
        InstrumentSelection instrumentSelection;
        InstrumentType instrumentType;
        InstrumentSelection instrumentSelection2;
        CashInstrumentType cashInstrumentType;
        InstrumentType instrumentType2;
        Object withContext;
        MutableState mutableState;
        Object firstOrNull;
        IncomingRequestsViewModel incomingRequestsViewModel;
        Object updateIncomingRequestPolicy;
        IncomingRequestPolicy incomingRequestPolicy;
        int i = this.$r8$classId;
        int i2 = 23;
        int i3 = 8;
        int i4 = 2;
        int i5 = 14;
        Object obj2 = this.$isLoading$delegate;
        Object obj3 = this.$isError$delegate;
        int i6 = 1;
        r12 = null;
        String str6 = null;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) this.$model;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState4.setValue(Boolean.TRUE);
                    mutableState3.setValue(Boolean.FALSE);
                    CashSubscriptionsAppService cashSubscriptionsAppService = (CashSubscriptionsAppService) ((InviteErrorPresenter) this.this$0).analytics;
                    GetMobilePlanHomeRequest getMobilePlanHomeRequest = new GetMobilePlanHomeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    z = true;
                    this.label = 1;
                    mobilePlanHome = cashSubscriptionsAppService.getMobilePlanHome(getMobilePlanHomeRequest, this);
                    if (mobilePlanHome == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mobilePlanHome = obj;
                    z = true;
                }
                ApiResult apiResult = (ApiResult) mobilePlanHome;
                if (apiResult instanceof ApiResult.Success) {
                    Boolean bool = Boolean.FALSE;
                    mutableState4.setValue(bool);
                    mutableState3.setValue(bool);
                    mutableState2.setValue(((GetMobilePlanHomeResponse) ((ApiResult.Success) apiResult).response).mobile_plan_home);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState4.setValue(Boolean.FALSE);
                    if (mutableState2.getValue() != null) {
                        z = false;
                    }
                    mutableState3.setValue(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$model;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope, (WorkHomePresenter) obj2, (State) obj3, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$model;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$12 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope2, (TapToPayPresenter) obj2, (State) obj3, 24);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState5 = (MutableState) obj2;
                MainPaymentPadPresenter mainPaymentPadPresenter = (MainPaymentPadPresenter) this.this$0;
                AndroidStringManager androidStringManager = mainPaymentPadPresenter.stringManager;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) mainPaymentPadPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableBratHype.INSTANCE)).enabled() && ((PaymentPadTheme) ((MutableState) this.$model).getValue()) == PaymentPadTheme.BRAT) {
                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("360", androidStringManager.get(R.string.brat_hype_code_360)), new Pair("365", androidStringManager.get(R.string.brat_hype_code_365)), new Pair("666", androidStringManager.get(R.string.brat_hype_code_666)), new Pair("999", androidStringManager.get(R.string.brat_hype_code_999)));
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new OverlayKt$$ExternalSyntheticLambda1(i3, mutableState5));
                        DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) mapOf, (MutableState) obj3, mutableState5, (Continuation) null, 18);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, dotGridKt$DotGrid$3$1, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState6 = (MutableState) this.$model;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState6.setValue(Boolean.FALSE);
                    if (((NearbyPayRequestTab) ((MutableState) obj2).getValue()) == NearbyPayRequestTab.PAY && ((List) ((MutableState) obj3).getValue()).isEmpty()) {
                        this.label = 1;
                        if (JobKt.delay(10000L, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState6.setValue(Boolean.TRUE);
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.this$0;
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                String str7 = (String) cardLockPresenter.ioDispatcher;
                str7.getClass();
                analytics.track(new NearbyPaymentStillLookingPageLand(str7), null);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtensionsKt$combine$$inlined$combine$1 models = ((RealInstrumentRowLoader) ((LocalPosLocalCashRedemptionPresenter) this.this$0).service).models(LocalPosLocalCashRedemptionPresenter.access$models$rawAmountAsMoney((MutableState) this.$model), EmptyList.INSTANCE, (InstrumentSelection) ((MutableState) obj2).getValue(), true, true, false, false);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(i2, (MutableState) obj3);
                    this.label = 1;
                    if (models.collect(anonymousClass1, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) this.$model;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NearbySessionService nearbySessionService = (NearbySessionService) ((TaxReturnsPresenter) this.this$0).args;
                    ByteString.Companion companion = ByteString.Companion;
                    GetNearbySessionRequest getNearbySessionRequest = new GetNearbySessionRequest(ByteString.Companion.of$default(nearbyAdvertisement.toByteArray()));
                    this.label = 1;
                    nearbySession = nearbySessionService.getNearbySession(getNearbySessionRequest, this);
                    if (nearbySession == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    nearbySession = obj;
                }
                ApiResult apiResult2 = (ApiResult) nearbySession;
                if (apiResult2 instanceof ApiResult.Success) {
                    SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                    GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) ((ApiResult.Success) apiResult2).response;
                    NearbySession nearbySession2 = getNearbySessionResponse.nearby_session;
                    Character monogram = (nearbySession2 == null || (broadcasterProfileData6 = nearbySession2.broadcaster_profile_data) == null || (str5 = broadcasterProfileData6.display_name) == null) ? null : GrpcStatus.Companion.monogram(str5);
                    NearbySession nearbySession3 = getNearbySessionResponse.nearby_session;
                    Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, (nearbySession3 == null || (broadcasterProfileData5 = nearbySession3.broadcaster_profile_data) == null) ? null : broadcasterProfileData5.customer_token, null, null, null));
                    NearbySession nearbySession4 = getNearbySessionResponse.nearby_session;
                    NearbyAvatarInfo nearbyAvatarInfo = new NearbyAvatarInfo(monogram, uiColor, (nearbySession4 == null || (broadcasterProfileData4 = nearbySession4.broadcaster_profile_data) == null || (str4 = broadcasterProfileData4.profile_photo_url) == null) ? null : new Image(str4, str4, 4));
                    NearbySession nearbySession5 = getNearbySessionResponse.nearby_session;
                    snapshotStateMap.put(nearbyAdvertisement, new NearbyPerson(nearbyAvatarInfo, (nearbySession5 == null || (broadcasterProfileData3 = nearbySession5.broadcaster_profile_data) == null || (str3 = broadcasterProfileData3.display_name) == null) ? "" : str3, (nearbySession5 == null || (broadcasterProfileData2 = nearbySession5.broadcaster_profile_data) == null || (str2 = broadcasterProfileData2.customer_token) == null) ? "" : str2, (nearbySession5 == null || (broadcasterProfileData = nearbySession5.broadcaster_profile_data) == null || (str = broadcasterProfileData.cashtag) == null) ? "" : str, (nearbySession5 == null || (nearbyContext = nearbySession5.nearby_context) == null) ? null : nearbyContext.context_token));
                } else {
                    ((SnapshotStateSet) obj3).add(nearbyAdvertisement);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$model;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(7, coroutineScope3, (NearbyPermissionsPromptSheetPresenter) obj2, (State) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$22 = new AndroidPermissionChecker$granted$$inlined$map$2$2(i3, coroutineScope4, (PaymentClaimPresenter) obj3, (MutableState) this.$model);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(androidPermissionChecker$granted$$inlined$map$2$22, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((PaymentConfigurationViewModel) ((MutableState) this.$model).getValue()) instanceof PaymentConfigurationViewModel.RequestShareOption) {
                        paymentConfigurationPresenter.analytics.track(new AssetRequestAddRecipientFromShareSheet(paymentConfigurationPresenter.paymentToken.toString(), paymentConfigurationPresenter.flowToken), null);
                        PaymentRouterData paymentRouterData = (PaymentRouterData) ((MutableState) obj2).getValue();
                        this.label = 1;
                        if (((RealPaymentConfigurationRouter) obj3).nextStep(paymentRouterData, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$model;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$13 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope5, (TaxReturnsPresenter) obj2, (State) obj3, 28);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$13, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                QuickPayPresenter quickPayPresenter = (QuickPayPresenter) this.$model;
                PaymentScreens.QuickPay quickPay = quickPayPresenter.args;
                QuickPayState quickPayState = (QuickPayState) obj2;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics2 = quickPayPresenter.analytics;
                    Orientation orientation = quickPayState.orientation;
                    PaymentAssetType paymentAssetType = PaymentAssetType.CASH;
                    quickPay.getClass();
                    PaymentScreens.QuickPay.QuickPayAnalytics quickPayAnalytics = quickPay.analytics;
                    orientation.getClass();
                    int i19 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                    if (i19 == 1) {
                        String uuid = quickPayAnalytics.externalPaymentId.toString();
                        Origin origin = quickPayAnalytics.origin;
                        String str8 = quickPayAnalytics.section;
                        Integer num = quickPayAnalytics.sectionIndex;
                        Integer num2 = quickPayAnalytics.sectionTotal;
                        Integer num3 = quickPayAnalytics.searchTextLength;
                        String str9 = quickPayAnalytics.searchType;
                        Integer num4 = quickPayAnalytics.matchedAliasLength;
                        com.squareup.cash.recipients.backend.api.SuggestionStrategy suggestionStrategy5 = quickPayAnalytics.suggestionStrategy;
                        switch (suggestionStrategy5 == null ? -1 : AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$0[suggestionStrategy5.ordinal()]) {
                            case 1:
                                suggestionStrategy = SuggestionStrategy.RECENTS;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            case 2:
                                suggestionStrategy = SuggestionStrategy.REMOTE_SUGGESTIONS;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            case 3:
                                suggestionStrategy = SuggestionStrategy.CONTACTS_ON_CASH;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            case 4:
                                suggestionStrategy = SuggestionStrategy.CONTACTS_OFF_CASH;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            case 5:
                                suggestionStrategy = SuggestionStrategy.REMOTE_SEARCH;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            case 6:
                                suggestionStrategy = SuggestionStrategy.REMOTE;
                                suggestionStrategy2 = suggestionStrategy;
                                break;
                            default:
                                suggestionStrategy2 = null;
                                break;
                        }
                        analytics2.track(new AssetSendSubmitTransaction(quickPayAnalytics.absoluteIndex, null, uuid, num4, origin, paymentAssetType, Boolean.FALSE, null, quickPayAnalytics.remoteSuggestionType, num3, str9, str8, num, num2, quickPayAnalytics.sectionId, suggestionStrategy2, null, null, null, null, null, null, null, 133694998), null);
                    } else {
                        if (i19 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String uuid2 = quickPayAnalytics.externalPaymentId.toString();
                        Origin origin2 = quickPayAnalytics.origin;
                        String str10 = quickPayAnalytics.section;
                        Integer num5 = quickPayAnalytics.sectionIndex;
                        Integer num6 = quickPayAnalytics.sectionTotal;
                        Integer num7 = quickPayAnalytics.searchTextLength;
                        String str11 = quickPayAnalytics.searchType;
                        Integer num8 = quickPayAnalytics.matchedAliasLength;
                        com.squareup.cash.recipients.backend.api.SuggestionStrategy suggestionStrategy6 = quickPayAnalytics.suggestionStrategy;
                        switch (suggestionStrategy6 == null ? -1 : AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$0[suggestionStrategy6.ordinal()]) {
                            case 1:
                                suggestionStrategy3 = SuggestionStrategy.RECENTS;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 2:
                                suggestionStrategy3 = SuggestionStrategy.REMOTE_SUGGESTIONS;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 3:
                                suggestionStrategy3 = SuggestionStrategy.CONTACTS_ON_CASH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 4:
                                suggestionStrategy3 = SuggestionStrategy.CONTACTS_OFF_CASH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 5:
                                suggestionStrategy3 = SuggestionStrategy.REMOTE_SEARCH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 6:
                                suggestionStrategy3 = SuggestionStrategy.REMOTE;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            default:
                                suggestionStrategy4 = null;
                                break;
                        }
                        analytics2.track(new AssetRequestSubmitTransaction(quickPayAnalytics.absoluteIndex, uuid2, num8, origin2, Boolean.FALSE, null, quickPayAnalytics.remoteSuggestionType, num7, str11, str10, num5, num6, quickPayAnalytics.sectionId, suggestionStrategy4, null, null, null, null, 8127242), null);
                    }
                    createPaymentInitiatorData$presenters = quickPayPresenter.createPaymentInitiatorData$presenters(quickPayState, (List) obj3, quickPay.moneybotContext);
                    RealPaymentInitiator realPaymentInitiator = quickPayPresenter.paymentInitiator;
                    ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                    Screen screen = quickPay.exitScreen;
                    Screen screen2 = quickPay.exitScreenOnSuccess;
                    this.this$0 = createPaymentInitiatorData$presenters;
                    this.label = 1;
                    initiate = realPaymentInitiator.initiate(createPaymentInitiatorData$presenters, clientScenario, screen, screen2, false, this);
                    if (initiate == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PaymentInitiatorData paymentInitiatorData = (PaymentInitiatorData) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    createPaymentInitiatorData$presenters = paymentInitiatorData;
                    initiate = obj;
                }
                PaymentInitiator$Result paymentInitiator$Result = (PaymentInitiator$Result) initiate;
                ?? createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                BalanceSnapshot balanceSnapshot = quickPayState.balanceSnapshot;
                if (balanceSnapshot != null) {
                    createListBuilder.add(balanceSnapshot.token);
                }
                List list = quickPayState.instruments;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Instrument) it.next()).token);
                }
                createListBuilder.addAll(arrayList);
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                String str12 = quickPayState.selectedInstrumentToken;
                InstrumentLinkingConfig instrumentLinkingConfig = quickPayState.instrumentLinkingConfig;
                instrumentLinkingConfig.getClass();
                List list2 = quickPayState.paymentGetters;
                BetterNavigator.ScreenNavigator screenNavigator2 = quickPayPresenter.navigator;
                if (paymentInitiator$Result instanceof PaymentInitiator$Result.InitiatePayment) {
                    screenNavigator2.goTo(((PaymentInitiator$Result.InitiatePayment) paymentInitiator$Result).screen);
                } else if (paymentInitiator$Result instanceof PaymentInitiator$Result.SelectCard) {
                    build.getClass();
                    list2.getClass();
                    createPaymentInitiatorData$presenters.getClass();
                    SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                    HistoryScreens.SelectPaymentInstrument.NextScreen nextScreen = HistoryScreens.SelectPaymentInstrument.NextScreen.SEND_PAYMENT;
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PaymentRecipient) it2.next()).paymentInfo);
                    }
                    Money money = createPaymentInitiatorData$presenters.amount;
                    BlockersData.Flow.INSTANCE.getClass();
                    screenNavigator2.goTo(new HistoryScreens.SelectPaymentInstrument(build, arrayList2, money, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.credit_card_fee_bps, str12, false, BlockersData.Flow.Companion.generateToken(), null, null, null, nextScreen, 60288));
                } else if (paymentInitiator$Result instanceof PaymentInitiator$Result.ConfirmDuplicate) {
                    screenNavigator2.goTo(new PaymentScreens.ConfirmDuplicate(createPaymentInitiatorData$presenters.amount, DBUtil.redactList(list2)));
                } else {
                    if (!(paymentInitiator$Result instanceof PaymentInitiator$Result.LongerNote)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(new PaymentScreens.NoteRequired((Redacted) DBUtil.redactList(list2), quickPay.orientation, false));
                }
                return Unit.INSTANCE;
            case 12:
                PointerInputScope pointerInputScope = (PointerInputScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2(pointerInputScope, (Channel) this.$model, (Function0) obj2, (Function1) obj3, (Continuation) null, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(poolsListPresenter$models$2$2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$23 = new AndroidPermissionChecker$granted$$inlined$map$2$2(12, coroutineScope6, (PdfPreviewPresenter) obj3, (MutableState) this.$model);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(androidPermissionChecker$granted$$inlined$map$2$23, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$model;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope7, (WorkHomePresenter) obj2, (State) obj3, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$model;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$12 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope8, (WorkHomePresenter) obj2, (State) obj3, 3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(wirelessProviderListPresenter$models$1$1$12, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                MutableState mutableState7 = (MutableState) this.$model;
                PoolContributeWithNoteViewModel.Review review = (PoolContributeWithNoteViewModel.Review) obj3;
                Money money2 = review.amount;
                PoolContributeWithNotePresenter poolContributeWithNotePresenter = (PoolContributeWithNotePresenter) obj2;
                PoolContributeScreen poolContributeScreen = poolContributeWithNotePresenter.args;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics3 = poolContributeWithNotePresenter.analytics;
                    String str13 = poolContributeScreen.flowToken;
                    String str14 = poolContributeScreen.poolToken;
                    str13.getClass();
                    str14.getClass();
                    analytics3.track(new AssetPoolPoolSubmitContribution(str14, str13), null);
                    boolean z2 = poolContributeWithNotePresenter.isOwner;
                    BetterNavigator.ScreenNavigator screenNavigator3 = poolContributeWithNotePresenter.navigator;
                    if (z2) {
                        FlowStarter flowStarter = poolContributeWithNotePresenter.blockersNavigator;
                        String str15 = poolContributeScreen.poolToken;
                        String uuid3 = poolContributeWithNotePresenter.paymentToken.toString();
                        uuid3.getClass();
                        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) mutableState7.getValue();
                        if (instrumentSelectionRowViewModel == null || (cashInstrumentType = instrumentSelectionRowViewModel.cashInstrumentType) == null) {
                            instrumentType = null;
                        } else {
                            switch (CashInstrumentTypeExtensionsKt$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()]) {
                                case 1:
                                    instrumentType2 = InstrumentType.CASH_BALANCE;
                                    break;
                                case 2:
                                    instrumentType2 = InstrumentType.CREDIT_CARD;
                                    break;
                                case 3:
                                    instrumentType2 = InstrumentType.DEBIT_CARD;
                                    break;
                                case 4:
                                    instrumentType2 = InstrumentType.BANK_ACCOUNT;
                                    break;
                                case 5:
                                    instrumentType2 = InstrumentType.LINE_OF_CREDIT;
                                    break;
                                case 6:
                                    instrumentType2 = InstrumentType.GOOGLE_PAY;
                                    break;
                                case 7:
                                    throw new NotImplementedError(null, 1, null);
                                case 8:
                                case 9:
                                    Path$$ExternalSyntheticBUOutline0.m$1(cashInstrumentType, "Unexpected instrument type ");
                                    return null;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                            instrumentType = instrumentType2;
                        }
                        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = (InstrumentSelectionRowViewModel) mutableState7.getValue();
                        if (instrumentSelectionRowViewModel2 != null && (instrumentSelection2 = instrumentSelectionRowViewModel2.instrumentSelection) != null) {
                            str6 = instrumentSelection2.instrument_token;
                        }
                        String str16 = review.note;
                        PoolDetailsScreen poolDetailsScreen = new PoolDetailsScreen(poolContributeScreen.poolToken, null, null, null, null, poolContributeScreen.poolBalance, 28);
                        str15.getClass();
                        money2.getClass();
                        screenNavigator3.goTo(FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) flowStarter, Flow$Type.MONEY_POOL_OWNER_CONTRIBUTION, new PoolOwnerContributionFlowParameters(str15, money2, uuid3, null, instrumentType, str6, str16, ByteString.EMPTY), poolDetailsScreen, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
                        return Unit.INSTANCE;
                    }
                    RealPaymentInitiator realPaymentInitiator2 = poolContributeWithNotePresenter.paymentInitiator;
                    UUID generate = RealUuidGenerator.generate();
                    String str17 = poolContributeScreen.poolToken;
                    String str18 = (String) poolContributeScreen.poolName.getValue();
                    Money money3 = poolContributeScreen.poolBalance;
                    long amount = Moneys.amount(money2);
                    CurrencyCode currencyCode = money2.currency_code;
                    currencyCode.getClass();
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel3 = (InstrumentSelectionRowViewModel) mutableState7.getValue();
                    String str19 = (instrumentSelectionRowViewModel3 == null || (instrumentSelection = instrumentSelectionRowViewModel3.instrumentSelection) == null) ? null : instrumentSelection.instrument_token;
                    String str20 = review.note;
                    this.this$0 = screenNavigator3;
                    this.label = 1;
                    Money money4 = new Money(new Long(amount), currencyCode, 4);
                    r12 = str19 != null ? new InstrumentSelectionData(str19, null, CashInstrumentType.CASH_BALANCE, Moneys.zero(CurrencyCode.USD)) : null;
                    PoolDetailsScreen poolDetailsScreen2 = new PoolDetailsScreen(str17, null, null, null, null, money3, 30);
                    ?? r6 = r12;
                    Orientation orientation2 = Orientation.CASH;
                    ClientScenario.Companion companion2 = ClientScenario.INSTANCE;
                    EmptyList emptyList = EmptyList.INSTANCE;
                    initiate2 = realPaymentInitiator2.initiate(generate, money4, str18, emptyList, r6, (r57 & 32) != 0 ? null : null, (r57 & 64) != 0 ? null : null, (r57 & 128) != 0 ? null : str17, (r57 & 256) != 0 ? null : str20, (r57 & 512) != 0 ? EmptyList.INSTANCE : emptyList, orientation2, AppCreationActivity.HOMESCREEN, poolDetailsScreen2, (32768 & r57) != 0 ? PaymentScreens$HomeScreens$Home.INSTANCE : null, true, true, null, null, null, (2097152 & r57) != 0 ? null : null, (4194304 & r57) != 0 ? null : null, (8388608 & r57) != 0 ? null : null, (16777216 & r57) != 0 ? null : null, (33554432 & r57) != 0 ? null : null, (r57 & 67108864) != 0 ? null : null, this);
                    if (initiate2 == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                    screenNavigator = screenNavigator3;
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screenNavigator = (BetterNavigator.ScreenNavigator) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    initiate2 = obj;
                }
                screenNavigator.goTo((Screen) initiate2);
                return Unit.INSTANCE;
            case 17:
                ProfilePresenter profilePresenter = (ProfilePresenter) this.this$0;
                PoolDetailsScreen poolDetailsScreen3 = (PoolDetailsScreen) profilePresenter.paymentsInboundNavigator;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPoolsRepository realPoolsRepository = (RealPoolsRepository) profilePresenter.profileRepo;
                    String str21 = poolDetailsScreen3.token;
                    this.label = 1;
                    withContext = JobKt.withContext(realPoolsRepository.ioDispatcher, new RingtoneView.AnonymousClass1(realPoolsRepository, str21, r12, i6), this);
                    if (withContext == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                MutableState mutableState8 = (MutableState) this.$model;
                MutableState mutableState9 = (MutableState) obj2;
                MutableState mutableState10 = (MutableState) obj3;
                LoadPoolStatus loadPoolStatus = (LoadPoolStatus) withContext;
                if ((loadPoolStatus instanceof LoadPoolStatus.HttpFailure) || (loadPoolStatus instanceof LoadPoolStatus.NetworkFailure) || (loadPoolStatus instanceof LoadPoolStatus.ResponseFailure)) {
                    Analytics analytics4 = profilePresenter.analytics;
                    String str22 = (String) profilePresenter.profileDetailsProvider;
                    String str23 = poolDetailsScreen3.token;
                    str22.getClass();
                    str23.getClass();
                    analytics4.track(new AssetPoolPoolHomeViewError(str22, str23), null);
                    mutableState8.setValue(loadPoolStatus);
                } else if (loadPoolStatus instanceof LoadPoolStatus.Success) {
                    PoolData poolData = ((LoadPoolStatus.Success) loadPoolStatus).data;
                    mutableState9.setValue(poolData.pool);
                    mutableState10.setValue(Boolean.valueOf(Intrinsics.areEqual(poolData.viewerCanLeavePool, Boolean.TRUE)));
                    mutableState8.setValue(null);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(new AppLockMonitor$special$$inlined$map$2((Money) obj3, 19), (RealCurrencyConverter) obj2);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(29, (MutableState) this.$model);
                    this.this$0 = null;
                    this.label = 1;
                    if (convert.collect(anonymousClass12, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$13 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope9, (PdfPreviewPresenter) obj3, (MutableState) this.$model, 9);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(wirelessProviderListPresenter$models$1$1$13, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj3;
                    int i29 = ((DeviceManagerListScreen) pdfPreviewPresenter.pdfFile$delegate).removeAttemptCount;
                    this.this$0 = null;
                    this.label = 1;
                    if (PdfPreviewPresenter.access$removeAllDevices(pdfPreviewPresenter, i29, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableState) this.$model).setValue(null);
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$model;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$24 = new AndroidPermissionChecker$granted$$inlined$map$2$2(i5, coroutineScope10, (PdfPreviewPresenter) obj2, (State) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(androidPermissionChecker$granted$$inlined$map$2$24, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$25 = new AndroidPermissionChecker$granted$$inlined$map$2$2(16, coroutineScope11, (InviteErrorPresenter) obj3, (MutableState) this.$model);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(androidPermissionChecker$granted$$inlined$map$2$25, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj2;
                    IncomingRequestsViewModel incomingRequestsViewModel2 = (IncomingRequestsViewModel) mutableState.getValue();
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(((RealP2pSettingsManager) ((InviteErrorPresenter) obj3).analytics).select(), 5);
                    this.$model = mutableState;
                    this.this$0 = incomingRequestsViewModel2;
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(cashQrScannerPresenter$special$$inlined$filter$1, this);
                    if (firstOrNull == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                    incomingRequestsViewModel = incomingRequestsViewModel2;
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    incomingRequestsViewModel = (IncomingRequestsViewModel) this.this$0;
                    mutableState = (MutableState) this.$model;
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                incomingRequestsViewModel.getClass();
                mutableState.setValue(new IncomingRequestsViewModel((IncomingRequestPolicy) firstOrNull));
                return Unit.INSTANCE;
            case 24:
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj3;
                MutableState mutableState11 = (MutableState) this.$model;
                IncomingRequestsViewEvent incomingRequestsViewEvent = (IncomingRequestsViewEvent) obj2;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    IncomingRequestsViewEvent.NewPolicy newPolicy = (IncomingRequestsViewEvent.NewPolicy) incomingRequestsViewEvent;
                    IncomingRequestPolicy incomingRequestPolicy2 = newPolicy.current;
                    if (incomingRequestPolicy2 == newPolicy.policy) {
                        return Unit.INSTANCE;
                    }
                    IncomingRequestsViewModel incomingRequestsViewModel3 = (IncomingRequestsViewModel) mutableState11.getValue();
                    IncomingRequestPolicy incomingRequestPolicy3 = newPolicy.policy;
                    incomingRequestsViewModel3.getClass();
                    mutableState11.setValue(new IncomingRequestsViewModel(incomingRequestPolicy3));
                    Timber.Forest.i("Change policy from " + incomingRequestPolicy2 + " -> " + newPolicy.policy, new Object[0]);
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) inviteErrorPresenter.analytics;
                    IncomingRequestPolicy incomingRequestPolicy4 = newPolicy.policy;
                    this.this$0 = incomingRequestPolicy2;
                    this.label = 1;
                    updateIncomingRequestPolicy = realP2pSettingsManager.updateIncomingRequestPolicy(incomingRequestPolicy4, this);
                    if (updateIncomingRequestPolicy == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                    incomingRequestPolicy = incomingRequestPolicy2;
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    incomingRequestPolicy = (IncomingRequestPolicy) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    updateIncomingRequestPolicy = obj;
                }
                ApiResult apiResult3 = (ApiResult) updateIncomingRequestPolicy;
                IncomingRequestsViewModel incomingRequestsViewModel4 = (IncomingRequestsViewModel) mutableState11.getValue();
                if (apiResult3 instanceof ApiResult.Success) {
                    incomingRequestPolicy = (IncomingRequestPolicy) ((ApiResult.Success) apiResult3).response;
                } else {
                    if (!(apiResult3 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator).goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) inviteErrorPresenter.args, (ApiResult.Failure) apiResult3, new Integer(R.string.profile_error_message_update)).message, null, 14));
                }
                incomingRequestsViewModel4.getClass();
                mutableState11.setValue(new IncomingRequestsViewModel(incomingRequestPolicy));
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$26 = new AndroidPermissionChecker$granted$$inlined$map$2$2(17, coroutineScope12, (ProfilePrivacyPresenter) obj3, (MutableState) this.$model);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(androidPermissionChecker$granted$$inlined$map$2$26, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                return invokeSuspend$com$squareup$cash$profile$presenters$RealGenericProfileElementsPresenter$models$1$3(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$profile$presenters$RealProfilePasscodePresenter$passcodeToggleData$2(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$profile$presenters$allowedaccounts$RealAllowedAccountsSectionPresenter$models$$inlined$CollectEffect$1(obj);
            default:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$14 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope13, (WorkHomePresenter) obj3, (MutableState) this.$model, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(wirelessProviderListPresenter$models$1$1$14, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansHomePresenter$models$1$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isLoading$delegate = obj;
        this.$isError$delegate = obj2;
        this.$model = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansHomePresenter$models$1$1(MoleculePresenter moleculePresenter, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$model = obj;
        this.$isLoading$delegate = obj2;
        this.$isError$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansHomePresenter$models$1$1(TransfersPresenter transfersPresenter, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 27;
        this.$isLoading$delegate = transfersPresenter;
        this.$isError$delegate = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansHomePresenter$models$1$1(InviteErrorPresenter inviteErrorPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 23;
        this.$isError$delegate = inviteErrorPresenter;
        this.$isLoading$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansHomePresenter$models$1$1(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isLoading$delegate = obj;
        this.$isError$delegate = moleculePresenter;
        this.$model = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansHomePresenter$models$1$1(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, GenericProfileElementsViewEvent genericProfileElementsViewEvent, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.this$0 = realGenericProfileElementsPresenter;
        this.$isLoading$delegate = genericProfileElementsViewEvent;
        this.$model = mutableState;
        this.$isError$delegate = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansHomePresenter$models$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = obj;
        this.$isLoading$delegate = obj2;
        this.$isError$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansHomePresenter$models$1$1(Object obj, Object obj2, Continuation continuation, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.$isLoading$delegate = obj;
        this.$isError$delegate = obj2;
        this.$model = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansHomePresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = flow;
        this.$isLoading$delegate = moleculePresenter;
        this.$isError$delegate = state;
    }
}
