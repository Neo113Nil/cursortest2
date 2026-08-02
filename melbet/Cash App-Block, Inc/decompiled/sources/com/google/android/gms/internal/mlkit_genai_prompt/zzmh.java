package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter$models$5$3;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.RefreshState;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$7$1;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuToken;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.wallet.AddRemoveStateDialogModel;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.google.maps.android.compose.InputHandlerKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewModel;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.presenters.PaymentHistoryAvatarFactory;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.presenters.OrderItemEventHandler;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinLocationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinSellerMarkerLocation;
import com.squareup.cash.bitcoin.viewmodels.map.FilteredLocations;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.ConfirmCvvPresenter$WhenMappings;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.SignatureViewEvent;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewEnrichedReceipt;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPaymentInitiate;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPurchasesSelectOrder;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPurchasesViewOrder;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.cdf.gps.GpsConsentRequest;
import com.squareup.cash.cdf.gps.GpsEventTrigger;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.LocalClientBannerView;
import com.squareup.cash.cdf.localclient.LocalClientBrandProfileViewItem;
import com.squareup.cash.cdf.localclient.LocalClientMapClickBrandCard;
import com.squareup.cash.cdf.localclient.LocalClientTabView;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignViewAllMessages;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.ClipboardItem;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel$TitleNamingConvention$AppendName;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel$TitleNamingConvention$Default;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedRecentAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.featureflags.AmplitudeExperiments$AfterpayAppletEnrichedReceipts;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$2;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.orderly.plasma.OmsInitiateLoanPaymentFlowParameters;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import okio.Okio;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class zzmh extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmh(String str, DisclosurePresenter disclosurePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.zzb = str;
        this.zza = disclosurePresenter;
        this.zzc = mutableState;
        this.zzd = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object invokeSuspend$com$squareup$cash$bitcoin$views$exchange$BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$2$1(Object obj) {
        String str;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) this.zza;
        Function1 function1 = (Function1) this.zzb;
        AmountDisplayState amountDisplayState = (AmountDisplayState) this.zzc;
        boolean booleanValue = ((Boolean) ((MutableState) this.zzd).getValue()).booleanValue();
        function1.getClass();
        if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent) {
            if (!booleanValue) {
                Iterator it = ((BitcoinTransferViewModel.Content.BottomSheetContent) bitcoinTransferViewModel).amountSelections.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((AmountSelection) obj2).isSelected()) {
                        break;
                    }
                }
                AmountSelection amountSelection = (AmountSelection) obj2;
                if (amountSelection != 0 && (amountSelection instanceof AmountSelection.HasAmount)) {
                    function1.invoke(new BitcoinTransferViewEvent.ItemSelected(amountSelection));
                    AmountSelection.HasAmount hasAmount = (AmountSelection.HasAmount) amountSelection;
                    function1.invoke(new BitcoinTransferViewEvent.AmountEntered(String.valueOf(hasAmount.getAmount()), hasAmount.getAmount()));
                    AmountDisplayState.reset$default(amountDisplayState, BitcoinExchangeViewKt.amountString(hasAmount), 2);
                }
            }
        } else if ((bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent) && (str = ((BitcoinTransferViewModel.Content.FullScreenContent) bitcoinTransferViewModel).restoreKeypadAmount) != null) {
            AmountDisplayState.reset$default(amountDisplayState, str, 2);
            function1.invoke(new BitcoinTransferViewEvent.AmountEntered(str, MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d)));
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$blockers$presenters$FilesetUploadPresenter$launchCameraPermissionHandler$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.zza;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) this.zzb;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(filesetUploadPresenter, (KClassImpl$Data$$Lambda$23) this.zzc, continuation, 14), 3);
        JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(filesetUploadPresenter, (ConvertFromJavaKt$$Lambda$4) this.zzd, continuation, 15), 3);
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$blockers$presenters$GpsLocationConsentBlockerPresenter$models$3$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = (GpsLocationConsentBlockerPresenter) this.zza;
        boolean booleanValue = ((Boolean) ((MutableState) this.zzb).getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) ((MutableState) this.zzc).getValue()).booleanValue();
        boolean booleanValue3 = ((Boolean) ((MutableState) this.zzd).getValue()).booleanValue();
        GpsLocationConsentBlocker gpsLocationConsentBlocker = gpsLocationConsentBlockerPresenter.args.blocker;
        GpsConsentRequest.GpsConsentStatus gpsConsentStatus = booleanValue ? GpsConsentRequest.GpsConsentStatus.ALWAYS : booleanValue2 ? GpsConsentRequest.GpsConsentStatus.WHILE_USING_APP : GpsConsentRequest.GpsConsentStatus.DENIED;
        GpsLocationConsentBlocker.TriggerSource triggerSource = gpsLocationConsentBlocker.trigger_source;
        int i = triggerSource == null ? -1 : GpsLocationConsentBlockerPresenter.WhenMappings.$EnumSwitchMapping$1[triggerSource.ordinal()];
        gpsLocationConsentBlockerPresenter.analytics.track(new GpsConsentRequest(gpsConsentStatus, booleanValue3, i != 1 ? i != 2 ? i != 3 ? null : GpsEventTrigger.SUSPENSION_CHECK : GpsEventTrigger.CARD_TRANSACTION_AUTH_PROMPT : GpsEventTrigger.CARD_ACTIVATION, gpsLocationConsentBlocker.event_token), null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.zzb;
        Object obj3 = this.zzd;
        Object obj4 = this.zzc;
        switch (i) {
            case 0:
                zzmh zzmhVar = new zzmh((String) obj2, (zzmz) obj4, (Context) obj3, continuation, 0);
                zzmhVar.zza = obj;
                return zzmhVar;
            case 1:
                zzmh zzmhVar2 = new zzmh((PointerInputScope) obj2, (TextDragObserver) obj4, (TextFieldSelectionManager) obj3, continuation, 1);
                zzmhVar2.zza = obj;
                return zzmhVar2;
            case 2:
                return new zzmh((ExoPlayer) this.zza, (View) obj2, (Function2) obj4, (Function2) obj3, continuation, 2);
            case 3:
                zzmh zzmhVar3 = new zzmh((LocationMenu) obj2, continuation, (LocalBrandLocationMenuPresenter) obj4, (MutableState) obj3, 3);
                zzmhVar3.zza = obj;
                return zzmhVar3;
            case 4:
                return new zzmh((LocalMenuItemDetailsPresenter) this.zza, (CartBuilder) obj2, (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) obj4, (MenuItem) obj3, continuation, 4);
            case 5:
                zzmh zzmhVar4 = new zzmh((OrderStatus) obj2, continuation, (LocalOrderStatusPresenter) obj4, (MutableState) obj3, 5);
                zzmhVar4.zza = obj;
                return zzmhVar4;
            case 6:
                zzmh zzmhVar5 = new zzmh((LocalBrandBannerModel) obj2, continuation, (LocalBrandProfilePresenter) obj4, (State) obj3, 6);
                zzmhVar5.zza = obj;
                return zzmhVar5;
            case 7:
                return new zzmh((CashMapViewModel) this.zza, (List) obj2, (MutableState) obj4, (LocalHomePresenter) obj3, continuation, 7);
            case 8:
                return new zzmh((String) obj2, (DisclosurePresenter) this.zza, (MutableState) obj4, (MutableState) obj3, continuation);
            case 9:
                zzmh zzmhVar6 = new zzmh((TabContentPresenter) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 9);
                zzmhVar6.zza = obj;
                return zzmhVar6;
            case 10:
                return new zzmh((TabContentPresenter) this.zza, (MutableState) obj2, (MutableState) obj4, (State) obj3, continuation, 10);
            case 11:
                return new zzmh((BrandCollectionModel) this.zza, (LinkedHashMap) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 11);
            case 12:
                zzmh zzmhVar7 = new zzmh((ProfileDocumentModel) obj2, continuation, (AccountDocumentsDownloadOptionsPresenter) obj4, (MutableState) obj3, 12);
                zzmhVar7.zza = obj;
                return zzmhVar7;
            case 13:
                zzmh zzmhVar8 = new zzmh((ReceiptPresenter) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 13);
                zzmhVar8.zza = obj;
                return zzmhVar8;
            case 14:
                return new zzmh((AfterpayAppletHomePresenter) this.zza, (MutableState) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 14);
            case 15:
                return new zzmh((ActivityItem) this.zza, (ActivityItemViewEvent) obj2, (OrderItemEventHandler) obj4, (ActivityItemViewModel) obj3, continuation, 15);
            case 16:
                return new zzmh((List) this.zza, (Function1) obj2, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj4, (MutableState) obj3, continuation, 16);
            case 17:
                return new zzmh((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.zza, (RealHapticVibrator) obj2, (Haptics) obj4, (MutableState) obj3, continuation, 17);
            case 18:
                zzmh zzmhVar9 = new zzmh((MoleculePresenterKt$asPresenter$1) obj2, (AnchoredDraggableState) obj4, (Widget) obj3, continuation, 18);
                zzmhVar9.zza = obj;
                return zzmhVar9;
            case 19:
                zzmh zzmhVar10 = new zzmh(this.zzb, continuation, (ErrorPresenter) obj4, (MutableState) obj3, 19);
                zzmhVar10.zza = obj;
                return zzmhVar10;
            case 20:
                zzmh zzmhVar11 = new zzmh((Boolean) obj2, continuation, (ProfilePresenter) obj4, (MutableState) obj3, 20);
                zzmhVar11.zza = obj;
                return zzmhVar11;
            case 21:
                zzmh zzmhVar12 = new zzmh((LocationSelection) obj2, continuation, (FilteredLocations) obj4, (BitcoinMapPresenter) obj3, 21);
                zzmhVar12.zza = obj;
                return zzmhVar12;
            case 22:
                zzmh zzmhVar13 = new zzmh((AddressResult) obj2, (Integer) obj4, continuation, (BitcoinMapPresenter) obj3);
                zzmhVar13.zza = obj;
                return zzmhVar13;
            case 23:
                return new zzmh((BitcoinTransferPresenter) this.zza, (MutableState) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 23);
            case 24:
                zzmh zzmhVar14 = new zzmh((State) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 24);
                zzmhVar14.zza = obj;
                return zzmhVar14;
            case 25:
                return new zzmh((BitcoinTransferViewModel) this.zza, (Function1) obj2, (AmountDisplayState) obj4, (MutableState) obj3, continuation, 25);
            case 26:
                zzmh zzmhVar15 = new zzmh((Instrument) obj2, continuation, (MusicPresenter) obj4, (MutableState) obj3, 26);
                zzmhVar15.zza = obj;
                return zzmhVar15;
            case 27:
                zzmh zzmhVar16 = new zzmh((FilesetUploadPresenter) obj2, (KClassImpl$Data$$Lambda$23) obj4, (ConvertFromJavaKt$$Lambda$4) obj3, continuation, 27);
                zzmhVar16.zza = obj;
                return zzmhVar16;
            case 28:
                return new zzmh((GpsLocationConsentBlockerPresenter) this.zza, (MutableState) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 28);
            default:
                zzmh zzmhVar17 = new zzmh((LocalHomePresenter) obj2, (MutableState) obj4, (SignatureViewEvent) obj3, continuation, 29);
                zzmhVar17.zza = obj;
                return zzmhVar17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((zzmh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08f7  */
    /* JADX WARN: Type inference failed for: r1v144, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.media3.common.Player] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list;
        BrandCollectionModel.Location location;
        int i;
        String format2;
        Object obj3;
        String orderPaymentPlanReceiptUrl;
        Boolean bool;
        String orderPaymentPlanReceiptUrl2;
        AmountSheetSavedState amountSelectorState;
        String format3;
        int i2 = this.$r8$classId;
        int i3 = 27;
        int i4 = 3;
        int i5 = 1;
        Object obj4 = this.zzc;
        BitcoinSellerMarkerLocation bitcoinSellerMarkerLocation = null;
        r9 = null;
        r9 = null;
        StyledCardViewModel styledCardViewModel = null;
        BrandCollectionModel.Location location2 = null;
        Object obj5 = this.zzd;
        Object obj6 = this.zzb;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                zzmd zzmdVar = (zzmd) ((Map) this.zza).remove((String) obj6);
                if (zzmdVar != null) {
                    try {
                        zzmz.zzr((Context) obj5, zzmdVar);
                    } catch (IOException e) {
                        Okio.boxInt(Log.e("CacheManager", "Failed to delete cache", e));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.zza;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                PointerInputScope pointerInputScope = (PointerInputScope) obj6;
                JobKt.launch$default(coroutineScope, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, (TextDragObserver) obj4, r9, 0), 1);
                JobKt.launch$default(coroutineScope, null, coroutineStart, new VirtualCameraState$connect$2$1(pointerInputScope, (TextFieldSelectionManager) obj5, r9, 26), 1);
                return Unit.INSTANCE;
            case 2:
                Function2 function2 = (Function2) obj5;
                View view = (View) obj6;
                ExoPlayer exoPlayer = (ExoPlayer) this.zza;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object tag = view.getTag();
                r9 = tag instanceof Player ? (Player) tag : null;
                if (r9 != null && !r9.equals(exoPlayer) && ((ExoPlayerImpl) r9).isCommandAvailable(27)) {
                    function2.invoke(r9, view);
                }
                if (((ExoPlayerImpl) exoPlayer).isCommandAvailable(27)) {
                    ((Function2) obj4).invoke(exoPlayer, view);
                    view.setTag(exoPlayer);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj5;
                String m1213firstAvailableMenuTokenOrNull7E0CHp4 = ((LocalBrandLocationMenuPresenter) obj4).m1213firstAvailableMenuTokenOrNull7E0CHp4((LocationMenu) obj6);
                mutableState.setValue(m1213firstAvailableMenuTokenOrNull7E0CHp4 != null ? new MenuToken(m1213firstAvailableMenuTokenOrNull7E0CHp4) : null);
                return Unit.INSTANCE;
            case 4:
                LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData = (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) obj4;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) this.zza;
                Analytics analytics = localMenuItemDetailsPresenter.analytics;
                LocalMenuItemDetailsScreen localMenuItemDetailsScreen = localMenuItemDetailsPresenter.screen;
                BrandSpot brandSpot = localMenuItemDetailsScreen.brandSpot;
                String str = brandSpot.brandToken;
                String str2 = brandSpot.locationToken;
                String str3 = str2 == null ? null : str2;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localMenuItemDetailsPresenter.sessionManager);
                String str4 = ((RealCartBuilder) ((CartBuilder) obj6)).checkoutFlowToken;
                String str5 = localMenuItemDetailsScreen.itemToken;
                Boolean bool2 = Boolean.FALSE;
                boolean z = menuItemAddedContextComboData instanceof LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData;
                Boolean valueOf = Boolean.valueOf(z);
                LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData comboSlotItemContextData = z ? (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData) menuItemAddedContextComboData : null;
                String str6 = comboSlotItemContextData != null ? comboSlotItemContextData.parentComboItemToken : null;
                String joinToString$default = CollectionsKt.joinToString$default(((MenuItem) obj5).discountTokens, ",", null, null, 0, null, LocalMenuItemDetailsPresenter$models$5$3.INSTANCE$2, 30);
                analytics.track(new LocalClientBrandProfileViewItem(str, str3, activeAccountTokenOrNull, str4, str5, bool2, valueOf, str6, joinToString$default.length() == 0 ? null : joinToString$default, 4), null);
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope2, null, null, new SliderState$drag$2((OrderStatus) obj6, (LocalOrderStatusPresenter) obj4, (MutableState) obj5, null, 28), 3);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalBrandBannerModel localBrandBannerModel = (LocalBrandBannerModel) obj6;
                Analytics analytics2 = ((LocalBrandProfilePresenter) obj4).analytics;
                State state = (State) obj5;
                String str7 = ((BrandSpot) state.getValue()).brandToken;
                String str8 = ((BrandSpot) state.getValue()).locationToken;
                if (str8 == null) {
                    str8 = null;
                }
                analytics2.track(new LocalClientBannerView(str7, str8, BannerLocation.BRAND_PROFILE, AnalyticsKt.toBannerType(localBrandBannerModel.f917type), AnalyticsKt.toOfferToken(localBrandBannerModel.mode)), null);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocationSelection locationSelection = ((CashMapViewModel) this.zza).selectedLocation;
                String str9 = locationSelection != null ? locationSelection.locationToken : null;
                ((MutableState) obj4).setValue(str9);
                if (str9 != null) {
                    Iterator it = ((List) obj6).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((BrandCollectionData.Location) obj2).clientRoute, str9)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    BrandCollectionData.Location location3 = (BrandCollectionData.Location) obj2;
                    if (location3 != null) {
                        BrandSpot brandSpot2 = location3.brandSpot;
                        Analytics analytics3 = (Analytics) ((LocalHomePresenter) obj5).embeddedMapEnabled$delegate;
                        String str10 = brandSpot2.brandToken;
                        String str11 = brandSpot2.locationToken;
                        if (str11 == null) {
                            str11 = null;
                        }
                        analytics3.track(new LocalClientMapClickBrandCard(str10, str11 != null ? str11 : ""), null);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                String str12 = (String) obj6;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj4;
                if (!((Boolean) mutableState2.getValue()).booleanValue() && str12 == null && (list = (List) ((MutableState) obj5).getValue()) != null && (!list.isEmpty())) {
                    mutableState2.setValue(Boolean.TRUE);
                    Analytics analytics4 = (Analytics) ((DisclosurePresenter) this.zza).analytics;
                    if (str12 == null) {
                        str12 = null;
                    }
                    analytics4.track(new LocalMarketingBuyerMarketingCampaignViewAllMessages(str12), null);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope3, null, null, new TabContentPresenter$models$7$1((TabContentPresenter) obj6, (MutableState) obj4, r9, i4), 3);
                MutableState mutableState3 = (MutableState) obj5;
                mutableState3.setValue(RefreshState.copy$default((RefreshState) mutableState3.getValue(), 27));
                return Unit.INSTANCE;
            case 10:
                MutableState mutableState4 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj6;
                if (((Map) mutableState5.getValue()).isEmpty() || ((Boolean) mutableState4.getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                mutableState4.setValue(Boolean.TRUE);
                Analytics analytics5 = ((TabContentPresenter) this.zza).analytics;
                String joinToString$default2 = CollectionsKt.joinToString$default(((Map) mutableState5.getValue()).keySet(), ",", null, null, 0, null, new Data$$ExternalSyntheticLambda0(i3), 30);
                Boolean bool3 = (Boolean) ((State) obj5).getValue();
                bool3.getClass();
                analytics5.track(new LocalClientTabView(joinToString$default2, bool3), null);
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState6 = (MutableState) obj4;
                for (?? r1 : ((BrandCollectionModel) this.zza).locations) {
                    BrandCollectionModel.Location location4 = (BrandCollectionModel.Location) r1;
                    BrandFollowViewModel brandFollowViewModel = location4.addRemoveState;
                    BrandFollowViewModel brandFollowViewModel2 = (BrandFollowViewModel) ((Map) mutableState6.getValue()).get(location4.brandSpot);
                    BrandFollowViewModel.Remove remove = BrandFollowViewModel.Remove.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(brandFollowViewModel, remove);
                    BrandFollowViewModel.Add add = BrandFollowViewModel.Add.INSTANCE;
                    if ((areEqual && (Intrinsics.areEqual(brandFollowViewModel2, add) || Intrinsics.areEqual(brandFollowViewModel2, BrandFollowViewModel.Adding.INSTANCE))) || (Intrinsics.areEqual(brandFollowViewModel, add) && (Intrinsics.areEqual(brandFollowViewModel2, remove) || Intrinsics.areEqual(brandFollowViewModel2, BrandFollowViewModel.Removing.INSTANCE)))) {
                        location2 = r1;
                        location = location2;
                        if (location != null) {
                            MutableState mutableState7 = (MutableState) obj5;
                            AddRemoveStateDialogModel addRemoveStateDialogModel = (AddRemoveStateDialogModel) mutableState7.getValue();
                            int i6 = addRemoveStateDialogModel != null ? addRemoveStateDialogModel.key : 0;
                            String str13 = location.artwork;
                            LocalColor localColor = location.backgroundColor;
                            BrandFollowViewModel brandFollowViewModel3 = location.addRemoveState;
                            brandFollowViewModel3.getClass();
                            mutableState7.setValue(new AddRemoveStateDialogModel(i6 + 1, str13, localColor, brandFollowViewModel3));
                        }
                        mutableState6.setValue((LinkedHashMap) obj6);
                        return Unit.INSTANCE;
                    }
                }
                location = location2;
                if (location != null) {
                }
                mutableState6.setValue((LinkedHashMap) obj6);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProfileDocumentModel profileDocumentModel = (ProfileDocumentModel) obj6;
                long j = profileDocumentModel.documentDate;
                MutableState mutableState8 = (MutableState) obj5;
                Calendar calendar = AccountDocumentsDownloadOptionsPresenter.cal;
                AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel = (AccountDocumentsDownloadOptionsViewModel) mutableState8.getValue();
                AndroidStringManager androidStringManager = ((AccountDocumentsDownloadOptionsPresenter) obj4).stringManager;
                int ordinal = profileDocumentModel.category.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    i = R.string.documents_download_options_title_stock;
                } else {
                    if (ordinal != 3) {
                        if (ordinal == 4 || ordinal == 5) {
                            throw new NotImplementedError(null, 1, null);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = R.string.documents_download_options_title_bitcoin;
                }
                String str14 = androidStringManager.get(i);
                Calendar calendar2 = AccountDocumentsDownloadOptionsPresenter.cal;
                Resources resources = androidStringManager.resources;
                FillrWidgetFactory fillrWidgetFactory = profileDocumentModel.titleNamingConvention;
                String str15 = profileDocumentModel.name;
                if (fillrWidgetFactory instanceof ProfileDocumentModel$TitleNamingConvention$AppendName) {
                    String str16 = ((ProfileDocumentModel$TitleNamingConvention$AppendName) fillrWidgetFactory).dependentName;
                    Calendar calendar3 = AccountDocumentsDownloadOptionsPresenter.cal;
                    calendar3.setTimeInMillis(j);
                    String valueOf2 = String.valueOf(calendar3.get(1));
                    str15.getClass();
                    valueOf2.getClass();
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.documents_download_options_description_dependents)).format(new Object[]{str16, str15, valueOf2});
                    format2.getClass();
                } else {
                    if (!(fillrWidgetFactory instanceof ProfileDocumentModel$TitleNamingConvention$Default)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Calendar calendar4 = AccountDocumentsDownloadOptionsPresenter.cal;
                    calendar4.setTimeInMillis(j);
                    String valueOf3 = String.valueOf(calendar4.get(1));
                    str15.getClass();
                    valueOf3.getClass();
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.documents_download_options_description)).format(new Object[]{str15, valueOf3});
                    format2.getClass();
                }
                accountDocumentsDownloadOptionsViewModel.getClass();
                mutableState8.setValue(new AccountDocumentsDownloadOptionsViewModel(str14, format2));
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState9 = (MutableState) obj5;
                ReceiptPresenter receiptPresenter = (ReceiptPresenter) obj6;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.zza;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState10 = (MutableState) obj4;
                if (((SingleActivity) mutableState10.getValue()).loadingState == LoadingState.LOADING && ((SingleActivity) mutableState10.getValue()).activityItem == null) {
                    obj3 = ReceiptPresenter.IntermediateState.Loading.INSTANCE;
                } else {
                    LoadingState loadingState = ((SingleActivity) mutableState10.getValue()).loadingState;
                    LoadingState loadingState2 = LoadingState.ERROR;
                    Object obj7 = ReceiptPresenter.IntermediateState.LoadingError.INSTANCE;
                    if (loadingState != loadingState2 && (((SingleActivity) mutableState10.getValue()).activityItem instanceof FormattedPaymentHistoryActivityItem)) {
                        ActivityItem activityItem = ((SingleActivity) mutableState10.getValue()).activityItem;
                        activityItem.getClass();
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) activityItem;
                        StackedAvatarViewModel avatarViewModel = receiptPresenter.paymentHistoryAvatarFactory.getAvatarViewModel(formattedPaymentHistoryActivityItem);
                        AvatarBadgeViewModel avatarBadge = PaymentHistoryAvatarFactory.getAvatarBadge(formattedPaymentHistoryActivityItem);
                        if (!((Boolean) mutableState9.getValue()).booleanValue()) {
                            mutableState9.setValue(Boolean.TRUE);
                            RealActivityAnalyticsService realActivityAnalyticsService = (RealActivityAnalyticsService) receiptPresenter.activityAnalyticsService;
                            Analytics analytics6 = realActivityAnalyticsService.analyticsService;
                            String str17 = formattedPaymentHistoryActivityItem.getUiPayment().token;
                            String str18 = str17 == null ? "" : str17;
                            ActivityItemType itemType = ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem);
                            analytics6.track(new ActivityRecordViewEnrichedReceipt(str18, itemType != null ? itemType.toString() : null, realActivityAnalyticsService.getActivityFlowToken(), realActivityAnalyticsService.searchFlowToken, realActivityAnalyticsService.queryToken), null);
                        }
                        String rowId = formattedPaymentHistoryActivityItem.getRowId();
                        String str19 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
                        String str20 = str19 == null ? "" : str19;
                        String str21 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
                        String str22 = str21 == null ? "" : str21;
                        String str23 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
                        String str24 = str23 == null ? "" : str23;
                        AvatarBadgeViewModel avatarBadge2 = PaymentHistoryAvatarFactory.getAvatarBadge(formattedPaymentHistoryActivityItem);
                        ActivityItemOrigin activityItemOrigin = ActivityItemOrigin.HISTORY;
                        HistoryScreens.PaymentReceipt paymentReceipt = receiptPresenter.args;
                        ActivitiesManager.ActivityContext activityContext = receiptPresenter.activityContext;
                        obj7 = new ReceiptPresenter.IntermediateState.Loaded(formattedPaymentHistoryActivityItem, avatarViewModel, avatarBadge, new ActivityItemViewModel(rowId, str20, str22, str24, (ItemAccessory) null, avatarViewModel, avatarBadge2, false, new ActivityItemPresentationContext(activityItemOrigin, 0, paymentReceipt, activityContext.activityScope, activityContext.activityToken, 1), (Icons) null, (ReactionsState) null, "", 5632));
                    }
                    obj3 = obj7;
                }
                produceStateScope.setValue(obj3);
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState11 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AfterpayAppletHomePresenter afterpayAppletHomePresenter = (AfterpayAppletHomePresenter) this.zza;
                MutableState mutableState12 = (MutableState) obj6;
                Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                if (((IssuedCardFactory.IssuedCard) mutableState12.getValue()) != null) {
                    IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) mutableState12.getValue();
                    if ((issuedCard != null ? issuedCard.cardTheme : null) != null && ((String) mutableState11.getValue()).length() > 0) {
                        String str25 = (String) mutableState11.getValue();
                        IssuedCardFactory.IssuedCard issuedCard2 = (IssuedCardFactory.IssuedCard) mutableState12.getValue();
                        issuedCard2.getClass();
                        CardTheme cardTheme = issuedCard2.cardTheme;
                        cardTheme.getClass();
                        styledCardViewModel = new StyledCardViewModel(str25, true, cardTheme, false, null, (byte[]) ((MutableState) obj5).getValue(), false, null, null, null, null, null, null, 65496);
                        afterpayAppletHomePresenter.styledCardViewModel$delegate.setValue(styledCardViewModel);
                        return Unit.INSTANCE;
                    }
                }
                if (((IssuedCardFactory.IssuedCard) mutableState12.getValue()) != null) {
                    IssuedCardFactory.IssuedCard issuedCard3 = (IssuedCardFactory.IssuedCard) mutableState12.getValue();
                    if ((issuedCard3 != null ? issuedCard3.cardTheme : null) == null) {
                        Timber.Forest.w("No card theme found for issued card", new Object[0]);
                    }
                }
                afterpayAppletHomePresenter.styledCardViewModel$delegate.setValue(styledCardViewModel);
                return Unit.INSTANCE;
            case 15:
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj6;
                ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) obj5;
                OrderItemEventHandler orderItemEventHandler = (OrderItemEventHandler) obj4;
                RealRouter$Factory$Impl realRouter$Factory$Impl = orderItemEventHandler.routerFactory;
                FeatureFlagManager featureFlagManager = orderItemEventHandler.featureFlagManager;
                Navigator navigator = orderItemEventHandler.navigator;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = orderItemEventHandler.afterpayAppletAnalytics;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityItem activityItem2 = (ActivityItem) this.zza;
                if (!(activityItem2 instanceof OrderActivityItem)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                if (activityItemViewEvent instanceof ActivityItemViewEvent.InlineButtonClicked) {
                    OrderActivityItem orderActivityItem = (OrderActivityItem) activityItem2;
                    ActivityItemPresentationContext activityItemPresentationContext = activityItemViewModel.presentationContext;
                    AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
                    OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
                    CashAppPayMerchantRenderData cashAppPayMerchantRenderData = orderActivityData.orderRenderData.merchant;
                    String str26 = cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.merchant_token : null;
                    String str27 = orderActivityData.recipientId;
                    if (cashAppPayMerchantRenderData != null) {
                        str27 = null;
                    }
                    realAfterpayAppletAnalytics.analytics.track(new AfterpayAppletPaymentInitiate(realAfterpayAppletAnalytics.afterpayAppletFlowToken, str26, str27), null);
                    FlowStarter flowStarter = orderItemEventHandler.flowStarter;
                    Flow$Type flow$Type = Flow$Type.OMS_INITIATE_LOAN_PAYMENT_FLOW;
                    OmsInitiateLoanPaymentFlowParameters omsInitiateLoanPaymentFlowParameters = new OmsInitiateLoanPaymentFlowParameters(ActivityItemKt.getItemId(orderActivityItem), null, null, EmptyList.INSTANCE, ByteString.EMPTY);
                    Screen screen = activityItemPresentationContext.screen;
                    navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(flowStarter, flow$Type, omsInitiateLoanPaymentFlowParameters, screen == null ? PaymentScreens$HomeScreens$Home.INSTANCE : screen, null, screen, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.MONEY_TAB, realAfterpayAppletAnalytics.afterpayAppletFlowToken, BlockerFlowReferrerType.AFTERPAY_APPLET), null, 920));
                } else if (!(activityItemViewEvent instanceof ActivityItemViewEvent.PaymentHistoryButtonClicked)) {
                    if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                        OrderActivityItem orderActivityItem2 = (OrderActivityItem) activityItem2;
                        ActivityItemPresentationContext activityItemPresentationContext2 = activityItemViewModel.presentationContext;
                        OrderActivityData orderActivityData2 = (OrderActivityData) orderActivityItem2;
                        CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData2.orderRenderData;
                        if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$AfterpayAppletEnrichedReceipts.INSTANCE)).enabled()) {
                            orderPaymentPlanReceiptUrl2 = cashAppPayOrderRenderData.view_enriched_receipt_url;
                            if (orderPaymentPlanReceiptUrl2 == null) {
                                orderPaymentPlanReceiptUrl2 = OrderItemEventHandler.getOrderPaymentPlanReceiptUrl(cashAppPayOrderRenderData);
                            }
                        } else {
                            orderPaymentPlanReceiptUrl2 = OrderItemEventHandler.getOrderPaymentPlanReceiptUrl(cashAppPayOrderRenderData);
                        }
                        if (orderPaymentPlanReceiptUrl2 != null) {
                            String itemId = ActivityItemKt.getItemId(orderActivityItem2);
                            int i7 = activityItemPresentationContext2.rowIndex;
                            CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = cashAppPayOrderRenderData.merchant;
                            realAfterpayAppletAnalytics.analytics.track(new AfterpayAppletPurchasesSelectOrder(realAfterpayAppletAnalytics.afterpayAppletFlowToken, itemId, cashAppPayMerchantRenderData2 != null ? cashAppPayMerchantRenderData2.merchant_token : null, Integer.valueOf(i7), OrderItemEventHandler.amountDisplayed(orderActivityItem2), OrderItemEventHandler.numberOfPaymentsRemaining(orderActivityItem2), OrderItemEventHandler.nextPayment(orderActivityItem2), orderItemEventHandler.nextPaymentDue(orderActivityItem2), OrderItemEventHandler.toCdfOrderState(orderActivityData2.orderRowState), cashAppPayMerchantRenderData2 == null ? orderActivityData2.recipientId : null), null);
                            RealRouter create$1 = realRouter$Factory$Impl.create$1(navigator);
                            Screen screen2 = activityItemPresentationContext2.screen;
                            create$1.route(new RoutingParams(screen2, null, screen2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), orderPaymentPlanReceiptUrl2);
                        }
                    } else if (activityItemViewEvent instanceof ActivityItemViewEvent.VisibilityChanged) {
                        OrderActivityItem orderActivityItem3 = (OrderActivityItem) activityItem2;
                        ActivityItemPresentationContext activityItemPresentationContext3 = activityItemViewModel.presentationContext;
                        if (((ActivityItemViewEvent.VisibilityChanged) activityItemViewEvent).visibility == ActivityItemViewEvent.VisibilityChanged.Visibility.FullyVisible) {
                            String itemId2 = ActivityItemKt.getItemId(orderActivityItem3);
                            int i8 = activityItemPresentationContext3.rowIndex;
                            OrderActivityData orderActivityData3 = (OrderActivityData) orderActivityItem3;
                            CashAppPayMerchantRenderData cashAppPayMerchantRenderData3 = orderActivityData3.orderRenderData.merchant;
                            AfterpayAppletPurchasesViewOrder afterpayAppletPurchasesViewOrder = new AfterpayAppletPurchasesViewOrder(realAfterpayAppletAnalytics.afterpayAppletFlowToken, itemId2, cashAppPayMerchantRenderData3 != null ? cashAppPayMerchantRenderData3.merchant_token : null, Integer.valueOf(i8), OrderItemEventHandler.amountDisplayed(orderActivityItem3), OrderItemEventHandler.numberOfPaymentsRemaining(orderActivityItem3), OrderItemEventHandler.nextPayment(orderActivityItem3), orderItemEventHandler.nextPaymentDue(orderActivityItem3), OrderItemEventHandler.toCdfOrderState(orderActivityData3.orderRowState), cashAppPayMerchantRenderData3 == null ? orderActivityData3.recipientId : null);
                            int hashCode = afterpayAppletPurchasesViewOrder.hashCode();
                            LinkedHashSet linkedHashSet = realAfterpayAppletAnalytics.loggedImpressionEventHashes;
                            if (!linkedHashSet.contains(Integer.valueOf(hashCode))) {
                                realAfterpayAppletAnalytics.analytics.track(afterpayAppletPurchasesViewOrder, null);
                                linkedHashSet.add(Integer.valueOf(hashCode));
                            }
                        }
                    } else {
                        if (!(activityItemViewEvent instanceof ActivityItemViewEvent.ReactionSelected) && !Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ReactionSelectorDismissed.INSTANCE) && !Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.AvatarClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        OrderActivityItem orderActivityItem4 = (OrderActivityItem) activityItem2;
                        ActivityItemPresentationContext activityItemPresentationContext4 = activityItemViewModel.presentationContext;
                        String itemId3 = ActivityItemKt.getItemId(orderActivityItem4);
                        int i9 = activityItemPresentationContext4.rowIndex;
                        OrderActivityData orderActivityData4 = (OrderActivityData) orderActivityItem4;
                        String str28 = orderActivityData4.recipientId;
                        CashAppPayOrderRenderData cashAppPayOrderRenderData2 = orderActivityData4.orderRenderData;
                        CashAppPayMerchantRenderData cashAppPayMerchantRenderData4 = cashAppPayOrderRenderData2.merchant;
                        String str29 = cashAppPayMerchantRenderData4 != null ? cashAppPayMerchantRenderData4.merchant_token : null;
                        UiCustomer uiCustomer = orderActivityData4.orderDisplayUiCustomer;
                        realAfterpayAppletAnalytics.analytics.track(new AfterpayAppletPurchasesSelectOrder(realAfterpayAppletAnalytics.afterpayAppletFlowToken, itemId3, str29, Integer.valueOf(i9), OrderItemEventHandler.amountDisplayed(orderActivityItem4), OrderItemEventHandler.numberOfPaymentsRemaining(orderActivityItem4), OrderItemEventHandler.nextPayment(orderActivityItem4), orderItemEventHandler.nextPaymentDue(orderActivityItem4), OrderItemEventHandler.toCdfOrderState(orderActivityData4.orderRowState), cashAppPayMerchantRenderData4 == null ? str28 : null), null);
                        String str30 = uiCustomer != null ? uiCustomer.payment_url : null;
                        if (str30 == null || str30.length() == 0) {
                            CashAppPayMerchantRenderData cashAppPayMerchantRenderData5 = cashAppPayOrderRenderData2.merchant;
                            String str31 = cashAppPayMerchantRenderData5 != null ? cashAppPayMerchantRenderData5.merchant_token : null;
                            String str32 = str31 == null ? cashAppPayOrderRenderData2.merchant == null ? str28 : null : str31;
                            if (str32 != null) {
                                StateFlowKt.emitOrThrow(((RealPaymentManager) orderItemEventHandler.paymentManager).paymentActions, new PaymentAction.ShowProfile(re$$ExternalSyntheticOutline0.m(), ActivityItemKt.getItemId(orderActivityItem4), uiCustomer != null ? uiCustomer.threaded_customer_id : null, str32, str31 != null, (uiCustomer == null || (bool = uiCustomer.is_business) == null) ? false : bool.booleanValue()));
                            } else {
                                if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$AfterpayAppletEnrichedReceipts.INSTANCE)).enabled()) {
                                    orderPaymentPlanReceiptUrl = cashAppPayOrderRenderData2.view_enriched_receipt_url;
                                    if (orderPaymentPlanReceiptUrl == null) {
                                        orderPaymentPlanReceiptUrl = OrderItemEventHandler.getOrderPaymentPlanReceiptUrl(cashAppPayOrderRenderData2);
                                    }
                                } else {
                                    orderPaymentPlanReceiptUrl = OrderItemEventHandler.getOrderPaymentPlanReceiptUrl(cashAppPayOrderRenderData2);
                                }
                                if (orderPaymentPlanReceiptUrl != null) {
                                    RealRouter create$12 = realRouter$Factory$Impl.create$1(navigator);
                                    Screen screen3 = activityItemPresentationContext4.screen;
                                    create$12.route(new RoutingParams(screen3, null, screen3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), orderPaymentPlanReceiptUrl);
                                }
                            }
                        } else {
                            RealRouter create$13 = realRouter$Factory$Impl.create$1(navigator);
                            Screen screen4 = activityItemPresentationContext4.screen;
                            create$13.route(new RoutingParams(screen4, null, screen4, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str30);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 16:
                MutableState mutableState13 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list2 = (List) this.zza;
                if (!list2.isEmpty()) {
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate firstSelectableOrNull = LoadableStateKt.firstSelectableOrNull(list2);
                    Function1 function1 = (Function1) obj6;
                    if (((Boolean) mutableState13.getValue()).booleanValue()) {
                        if (firstSelectableOrNull == null) {
                            firstSelectableOrNull = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj4;
                        }
                        function1.invoke(firstSelectableOrNull);
                    } else {
                        function1.invoke(firstSelectableOrNull);
                    }
                    mutableState13.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 17:
                MutableState mutableState14 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.zza;
                if (calendarDate != null && ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) mutableState14.getValue()) != null && !calendarDate.equals((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) mutableState14.getValue())) {
                    ((RealHapticVibrator) obj6).vibrate(((Haptics) obj4).input.standard);
                }
                mutableState14.setValue(calendarDate);
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Presenter.Binding start$default = Presenter.start$default((MoleculePresenterKt$asPresenter$1) obj6, coroutineScope4, (LifecycleOwner) ((AnchoredDraggableState) obj4).anchoredDragScope);
                Widget widget = (Widget) obj5;
                ((Ui) widget).setEventReceiver(new PaymentPasscodeActivity$loadView$2(start$default, 1));
                JobKt.launch$default(coroutineScope4, null, CoroutineStart.UNDISPATCHED, new MLKitTitleGenerator$prepareModel$1(start$default, widget, r9, 16), 1);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BitcoinGraphModel bitcoinGraphModel = (BitcoinGraphModel) obj6;
                ((MutableState) obj5).setValue(new InvestingGraphContentModel.Loaded(bitcoinGraphModel.points, bitcoinGraphModel.smoothedPoints, r13.size(), bitcoinGraphModel.isStale ? InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE : new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Bitcoin.INSTANCE), null, null, null, Long.valueOf(bitcoinGraphModel.firstTickY), Long.valueOf(bitcoinGraphModel.lastTickY), 112));
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState15 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean booleanValue = ((Boolean) obj6).booleanValue();
                ProfilePresenter profilePresenter = (ProfilePresenter) obj4;
                ClipboardItem clipboardItem = (ClipboardItem) CollectionsKt.firstOrNull(((RealClipboardObserver) profilePresenter.principalAccountToken).currentClipboardItems());
                String str33 = clipboardItem != null ? clipboardItem.text : null;
                if (str33 == null || StringsKt.isBlank(str33)) {
                    ProfilePresenter.trackPasteAddress(profilePresenter.analytics, null);
                    ProfilePresenter.access$showInvalidCryptoAddressDialog(profilePresenter, BitcoinQrCodeScannerPresenter$State.ProcessingCode.CodeSource.MANUALLY_PASTED, booleanValue);
                    mutableState15.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState15.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE));
                } else {
                    mutableState15.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState15.getValue(), false, null, new BitcoinQrCodeScannerPresenter$State.ProcessingCode(str33, BitcoinQrCodeScannerPresenter$State.ProcessingCode.CodeSource.MANUALLY_PASTED), false, null, 239));
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocationSelection locationSelection2 = (LocationSelection) obj6;
                Iterator it2 = ((FilteredLocations) obj4).locations.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next = it2.next();
                        if (Intrinsics.areEqual(((BitcoinSellerMarkerLocation) next).token, locationSelection2.locationToken)) {
                            bitcoinSellerMarkerLocation = next;
                        }
                    }
                }
                BitcoinSellerMarkerLocation bitcoinSellerMarkerLocation2 = bitcoinSellerMarkerLocation;
                if (bitcoinSellerMarkerLocation2 != null) {
                    ((BitcoinMapPresenter) obj5).navigator.goTo(new BitcoinLocationScreen(bitcoinSellerMarkerLocation2.bitcoinSellerLocation));
                }
                return Unit.INSTANCE;
            case 22:
                BitcoinMapPresenter bitcoinMapPresenter = (BitcoinMapPresenter) obj5;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AddressResult addressResult = (AddressResult) obj6;
                if (!addressResult.equals(NoAddressResult.INSTANCE)) {
                    if (addressResult instanceof SelectedRecentAddressResult) {
                        SelectedRecentAddressResult selectedRecentAddressResult = (SelectedRecentAddressResult) addressResult;
                        bitcoinMapPresenter.cashMapPresenter.searchLocation(new LocationViewModel(selectedRecentAddressResult.latitude, selectedRecentAddressResult.longitude, 12.5f));
                    } else {
                        if (!(addressResult instanceof SelectedSearchAddressResult)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope5, null, null, new SsnPresenter$models$2$2(bitcoinMapPresenter, addressResult, r9, i5), 3);
                    }
                }
                return Unit.INSTANCE;
            case 23:
                MutableState mutableState16 = (MutableState) obj4;
                MutableState mutableState17 = (MutableState) obj6;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) this.zza;
                if (bitcoinTransferPresenter.args.showKeypad || ((List) mutableState17.getValue()).isEmpty() || ((CurrencyCode) mutableState16.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                AmountSheetSavedState amountSheetSavedState = bitcoinTransferPresenter.initialSavedState.uiState;
                AmountSheetSavedState.AmountKeypadState amountKeypadState = amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState ? (AmountSheetSavedState.AmountKeypadState) amountSheetSavedState : null;
                if (amountKeypadState == null) {
                    return Unit.INSTANCE;
                }
                String str34 = amountKeypadState.rawAmount;
                CurrencyCode currencyCode = (CurrencyCode) mutableState16.getValue();
                currencyCode.getClass();
                Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(str34, currencyCode);
                List<Object> list3 = (List) mutableState17.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (Object obj8 : list3) {
                        if (obj8 instanceof AmountSelection.HasAmount) {
                            long amount = ((AmountSelection.HasAmount) obj8).getAmount();
                            Long l = parseMoneyFromString$default.amount;
                            if (l != null && amount == l.longValue()) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                ((MutableState) obj5).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 24:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.zza;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((State) obj6).getValue()).booleanValue()) {
                    amountSelectorState = new AmountSheetSavedState.AmountKeypadState(((BitcoinTransferViewEvent.AmountEntered) ((MutableState) obj4).getValue()).rawAmount);
                } else {
                    Object obj9 = (AmountSelection) ((MutableState) obj5).getValue();
                    AmountSelection.HasAmount hasAmount = obj9 instanceof AmountSelection.HasAmount ? (AmountSelection.HasAmount) obj9 : null;
                    amountSelectorState = new AmountSheetSavedState.AmountSelectorState(hasAmount != null ? new Long(hasAmount.getAmount()) : null);
                }
                ((BitcoinTransferScreen.SavedState) produceStateScope2.getValue()).getClass();
                produceStateScope2.setValue(new BitcoinTransferScreen.SavedState(amountSelectorState));
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$bitcoin$views$exchange$BitcoinExchangeViewKt$BitcoinExchangeContent$1$1$2$1(obj);
            case 26:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Instrument instrument = (Instrument) obj6;
                MutableState mutableState18 = (MutableState) obj5;
                InstrumentType instrumentType = instrument.cardBrand;
                instrumentType.getClass();
                String str35 = instrument.suffix;
                str35.getClass();
                Resources resources2 = ((AndroidStringManager) ((MusicPresenter) obj4).musicRepository).resources;
                int i10 = InputHandlerKt.toBrand(instrumentType).cvvLength;
                int i11 = ConfirmCvvPresenter$WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    resources2.getClass();
                    format3 = new MessageFormat(resources2.getString(R.string.confirm_cvv_title_visa_mc)).format(new Object[]{str35});
                    format3.getClass();
                } else if (i11 != 3) {
                    resources2.getClass();
                    format3 = new MessageFormat(resources2.getString(R.string.confirm_cvv_title_default)).format(new Object[]{str35});
                    format3.getClass();
                } else {
                    resources2.getClass();
                    format3 = new MessageFormat(resources2.getString(R.string.confirm_cvv_title_amex)).format(new Object[]{str35});
                    format3.getClass();
                }
                mutableState18.setValue(new ConfirmCvvViewModel(i10, format3));
                return Unit.INSTANCE;
            case 27:
                return invokeSuspend$com$squareup$cash$blockers$presenters$FilesetUploadPresenter$launchCameraPermissionHandler$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$blockers$presenters$GpsLocationConsentBlockerPresenter$models$3$1(obj);
            default:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) obj4).setValue(Boolean.TRUE);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj6;
                JobKt.launch$default(coroutineScope6, (CoroutineContext) localHomePresenter.store, null, new SsnPresenter$models$2$2((SignatureViewEvent) obj5, localHomePresenter, r9, 28), 2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmh(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
        this.zzd = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmh(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmh(Object obj, Continuation continuation, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmh(AddressResult addressResult, Integer num, Continuation continuation, BitcoinMapPresenter bitcoinMapPresenter) {
        super(2, continuation);
        this.$r8$classId = 22;
        this.zzb = addressResult;
        this.zzc = num;
        this.zzd = bitcoinMapPresenter;
    }
}
