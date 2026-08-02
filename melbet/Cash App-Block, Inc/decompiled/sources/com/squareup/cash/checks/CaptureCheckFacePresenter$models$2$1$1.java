package com.squareup.cash.checks;

import android.graphics.PointF;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.core.app.ActivityCompat;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.businessaccount.backend.real.RealKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$State;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPaySheetAnalyticsContext;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetResult;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewEvent;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter$models$1$2;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.cashapppay.presenters.StatusInterstitialPresenter;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantClicked;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantDeleteCancelled;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantDeleted;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.GoBack;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewEvent;
import com.squareup.cash.cdf.businessgrant.BusinessGrantRemoveCancel;
import com.squareup.cash.cdf.businessgrant.BusinessGrantViewOpenDetails;
import com.squareup.cash.cdf.check.CheckDepositEnterAmount;
import com.squareup.cash.cdf.check.CheckDepositExit;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositClickDirections;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositClickFeeStatus;
import com.squareup.cash.checks.CheckDepositAmountViewEvent;
import com.squareup.cash.checks.ConfirmBackOfCheckEvent;
import com.squareup.cash.checks.ConfirmFrontOfCheckEvent;
import com.squareup.cash.checks.screens.CheckDepositAmountScreen;
import com.squareup.cash.checks.screens.ConfirmBackOfCheckScreen;
import com.squareup.cash.checks.screens.ConfirmFrontOfCheckScreen;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.blockers.ClientScenarioRouter;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.RealRawSyncValueService;
import com.squareup.cash.clientsync.RealRawSyncValueService$encodeFlow$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.SyncValuesWithoutType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2$special$$inlined$map$1$2$1;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.clipboard.RealClipboardObserver$clipboardPolling$$inlined$map$1$2$1;
import com.squareup.cash.core.navigationcontainer.UiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibility;
import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibilityStatus;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.eligibility.status.RealBitcoinEligibilityStatusProvider;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1;
import com.squareup.cash.data.profile.RealProfileManager$scenarioPlan$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.data.profile.documents.RealDocumentsManager$categories$$inlined$map$1$2$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.ExpiresAt;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.activity.CashActivityQueries$allActivityByPaymentType$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.profile.BalanceData;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.profile.documents.DocumentCategory;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1;
import com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory;
import com.squareup.cash.deposits.physical.presenter.address.PhysicalDepositAddressEntryPresenter$models$1$1;
import com.squareup.cash.deposits.physical.presenter.details.PaperMoneyDepositMerchantDetailsPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.PaperMoneyDepositOnboardingPresenter;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.screens.SelectedRecentAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.deposits.physical.viewmodels.address.AddressSearchViewModel;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryEvent;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.ui.ScenarioPlanEntry;
import com.squareup.util.android.SecurePixelCopy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.cryptocurrency.CryptoEligibilities;
import squareup.cash.cryptocurrency.CryptoEligibilityStatus;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CaptureCheckFacePresenter$models$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cameraPermissionGranted$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CaptureCheckFacePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptureCheckFacePresenter$models$2$1$1(CaptureCheckFacePresenter captureCheckFacePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = captureCheckFacePresenter;
        this.$cameraPermissionGranted$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cameraPermissionGranted$delegate;
        CaptureCheckFacePresenter captureCheckFacePresenter = this.this$0;
        switch (i) {
            case 0:
                return new CaptureCheckFacePresenter$models$2$1$1(captureCheckFacePresenter, mutableState, continuation, 0);
            default:
                return new CaptureCheckFacePresenter$models$2$1$1(captureCheckFacePresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CaptureCheckFacePresenter$models$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cameraPermissionGranted$delegate;
        CaptureCheckFacePresenter captureCheckFacePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = captureCheckFacePresenter.cameraPermissionGrants;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, captureCheckFacePresenter, mutableState);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = captureCheckFacePresenter.cameraPermissionDenials;
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(19, mutableState);
                    this.label = 1;
                    if (cardModelView$iconTexture$$inlined$map$1.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $cameraPermissionGranted$delegate;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$cameraPermissionGranted$delegate = obj2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$data$profile$RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2(Object obj, Continuation continuation) {
            RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1 realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1;
            int i;
            if (continuation instanceof RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1) {
                realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1 = (RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1) continuation;
                int i2 = realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.this$0;
                        Pair pair = new Pair((NotificationChannelId) this.$cameraPermissionGranted$delegate, (NotificationChannelToggleState) obj);
                        realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(pair, realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1 = new RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1(this, continuation);
            Object obj22 = realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$data$profile$documents$RealDocumentsManager$categories$$inlined$map$1$2(Object obj, Continuation continuation) {
            RealDocumentsManager$categories$$inlined$map$1$2$1 realDocumentsManager$categories$$inlined$map$1$2$1;
            int i;
            if (continuation instanceof RealDocumentsManager$categories$$inlined$map$1$2$1) {
                realDocumentsManager$categories$$inlined$map$1$2$1 = (RealDocumentsManager$categories$$inlined$map$1$2$1) continuation;
                int i2 = realDocumentsManager$categories$$inlined$map$1$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realDocumentsManager$categories$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realDocumentsManager$categories$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realDocumentsManager$categories$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.this$0;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (FillrWidgetVersion.allowed(((DocumentCategory) obj3).version_data, ((RealDocumentsManager) this.$cameraPermissionGranted$delegate).currentVersion)) {
                                arrayList.add(obj3);
                            }
                        }
                        realDocumentsManager$categories$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(arrayList, realDocumentsManager$categories$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            realDocumentsManager$categories$$inlined$map$1$2$1 = new RealDocumentsManager$categories$$inlined$map$1$2$1(this, continuation);
            Object obj22 = realDocumentsManager$categories$$inlined$map$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realDocumentsManager$categories$$inlined$map$1$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r9, r1) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        
            if (r0.prefetch(r1) == r2) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$deposits$physical$backend$real$barcode$RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1(Object obj, Continuation continuation) {
            RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1 realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1;
            int i;
            FlowCollector flowCollector;
            boolean booleanValue;
            int i2;
            RealTransferManager$addCash$$inlined$map$1 access$barcodeInfoFlow;
            RealCashDepositBarcodeManager realCashDepositBarcodeManager = (RealCashDepositBarcodeManager) this.$cameraPermissionGranted$delegate;
            if (continuation instanceof RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1) {
                realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1 = (RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1) continuation;
                int i3 = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        flowCollector = (FlowCollector) this.this$0;
                        booleanValue = ((Boolean) obj).booleanValue();
                        i2 = 0;
                        if (booleanValue) {
                            access$barcodeInfoFlow = RealCashDepositBarcodeManager.access$barcodeInfoFlow(realCashDepositBarcodeManager);
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.L$3 = null;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.Z$0 = booleanValue;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.I$0 = i2;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label = 2;
                        } else {
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.L$3 = flowCollector;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.Z$0 = booleanValue;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.I$0 = 0;
                            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label = 1;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.I$0;
                        booleanValue = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.Z$0;
                        flowCollector = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.L$3;
                        SafeTrace.throwOnFailure(obj2);
                    }
                    access$barcodeInfoFlow = RealCashDepositBarcodeManager.access$barcodeInfoFlow(realCashDepositBarcodeManager);
                    realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.L$3 = null;
                    realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.Z$0 = booleanValue;
                    realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.I$0 = i2;
                    realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label = 2;
                }
            }
            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1 = new RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1(this, continuation);
            Object obj22 = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label;
            if (i != 0) {
            }
            access$barcodeInfoFlow = RealCashDepositBarcodeManager.access$barcodeInfoFlow(realCashDepositBarcodeManager);
            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.L$3 = null;
            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.Z$0 = booleanValue;
            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.I$0 = i2;
            realCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1.label = 2;
        }

        private final Object emit$com$squareup$cash$deposits$physical$presenter$address$PhysicalDepositAddressEntryPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$cameraPermissionGranted$delegate;
            PhysicalCashDepositAddressEntryScreen physicalCashDepositAddressEntryScreen = (PhysicalCashDepositAddressEntryScreen) poolsListPresenter.sessionManager;
            AddressAnalyticsFactory addressAnalyticsFactory = (AddressAnalyticsFactory) poolsListPresenter.moneyFormatter;
            Analytics analytics = (Analytics) poolsListPresenter.analytics;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            PhysicalDepositAddressEntryEvent physicalDepositAddressEntryEvent = (PhysicalDepositAddressEntryEvent) obj;
            Continuation continuation2 = null;
            if (physicalDepositAddressEntryEvent instanceof PhysicalDepositAddressEntryEvent.AddressRecentClick) {
                analytics.track(addressAnalyticsFactory.selectAddressEvent(true), null);
                AskedQuestion askedQuestion = physicalCashDepositAddressEntryScreen.question;
                AddressSearchViewModel addressSearchViewModel = ((PhysicalDepositAddressEntryEvent.AddressRecentClick) physicalDepositAddressEntryEvent).address;
                screenNavigator.giveAnswer(askedQuestion, new SelectedRecentAddressResult(addressSearchViewModel.primaryText, addressSearchViewModel.secondaryText, addressSearchViewModel.formattedAddress, addressSearchViewModel.latitude, addressSearchViewModel.longitude));
            } else if (physicalDepositAddressEntryEvent instanceof PhysicalDepositAddressEntryEvent.AddressSearchResultClick) {
                analytics.track(addressAnalyticsFactory.selectAddressEvent(false), null);
                AskedQuestion askedQuestion2 = physicalCashDepositAddressEntryScreen.question;
                SearchLocation searchLocation = ((PhysicalDepositAddressEntryEvent.AddressSearchResultClick) physicalDepositAddressEntryEvent).location;
                screenNavigator.giveAnswer(askedQuestion2, new SelectedSearchAddressResult(searchLocation.identifier, searchLocation.primaryText, searchLocation.secondaryText, searchLocation.fullText, (LocationSearchClient$SessionId$GoogleSessionId) poolsListPresenter.localeAssetProvider));
            } else if (physicalDepositAddressEntryEvent instanceof PhysicalDepositAddressEntryEvent.ClearAllAddressRecentClick) {
                JobKt.launch$default(coroutineScope, null, null, new PhysicalDepositAddressEntryPresenter$models$1$1(poolsListPresenter, continuation2, 2), 3);
            } else if (physicalDepositAddressEntryEvent instanceof PhysicalDepositAddressEntryEvent.Exit) {
                screenNavigator.goTo(Back.INSTANCE);
            } else {
                if (!(physicalDepositAddressEntryEvent instanceof PhysicalDepositAddressEntryEvent.SearchTextChange)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((StateFlowImpl) poolsListPresenter.flowToken).setValue(((PhysicalDepositAddressEntryEvent.SearchTextChange) physicalDepositAddressEntryEvent).text);
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$deposits$physical$presenter$details$PaperMoneyDepositMerchantDetailsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            PaperMoneyDepositMerchantDetailsPresenter paperMoneyDepositMerchantDetailsPresenter = (PaperMoneyDepositMerchantDetailsPresenter) this.this$0;
            BetterNavigator.ScreenNavigator screenNavigator = paperMoneyDepositMerchantDetailsPresenter.navigator;
            Analytics analytics = paperMoneyDepositMerchantDetailsPresenter.analytics;
            AndroidStringManager androidStringManager = paperMoneyDepositMerchantDetailsPresenter.stringManager;
            PaperMoneyDepositMerchantDetailsScreen paperMoneyDepositMerchantDetailsScreen = paperMoneyDepositMerchantDetailsPresenter.args;
            LocationDetailsViewEvent locationDetailsViewEvent = (LocationDetailsViewEvent) obj;
            if (locationDetailsViewEvent instanceof LocationDetailsViewEvent.CopyAddressClick) {
                GlobalAddress globalAddress = paperMoneyDepositMerchantDetailsScreen.retailerLocation.address;
                globalAddress.getClass();
                paperMoneyDepositMerchantDetailsPresenter.clipboardManager.copy(androidStringManager.get(R.string.pmd_copy_address_clipboard_label), AddressKt.buildAsString(globalAddress, false));
                ((MutableState) this.$cameraPermissionGranted$delegate).setValue(androidStringManager.get(R.string.address_copied));
            } else {
                if (locationDetailsViewEvent instanceof LocationDetailsViewEvent.PrimaryButtonClick) {
                    analytics.track(new PaperMoneyDepositClickDirections(), null);
                    IntentLauncher intentLauncher = paperMoneyDepositMerchantDetailsPresenter.launcher;
                    GlobalAddress globalAddress2 = paperMoneyDepositMerchantDetailsScreen.retailerLocation.address;
                    globalAddress2.getClass();
                    intentLauncher.launchMap(StringsKt.trim(StringsKt__StringsJVMKt.replace$default(AddressKt.buildAsString(globalAddress2, false), "\n", " ")).toString(), 0.0d, 0.0d);
                } else if (locationDetailsViewEvent instanceof LocationDetailsViewEvent.SecondaryButtonClick) {
                    screenNavigator.goTo(new PaperMoneyDepositBarcodeScreen(paperMoneyDepositMerchantDetailsScreen.paperCashDepositBlocker, PaperMoneyDepositBarcodeScreen.Origin.MERCHANT_DETAILS, paperMoneyDepositMerchantDetailsScreen.blockersData));
                } else if (locationDetailsViewEvent instanceof LocationDetailsViewEvent.FeeInformationClick) {
                    analytics.track(new PaperMoneyDepositClickFeeStatus(), null);
                    AtmPmdExplainerScreen.AtmPmdExplainerOrigin atmPmdExplainerOrigin = AtmPmdExplainerScreen.AtmPmdExplainerOrigin.PMD;
                    BenefitExplainerScreen benefitExplainerScreen = paperMoneyDepositMerchantDetailsScreen.explainerScreen;
                    List<BenefitExplainerScreen.Element> list = benefitExplainerScreen != null ? benefitExplainerScreen.elements : null;
                    list.getClass();
                    BenefitExplainerScreen benefitExplainerScreen2 = paperMoneyDepositMerchantDetailsScreen.explainerScreen;
                    List<BenefitExplainerScreen.Element> list2 = benefitExplainerScreen2 != null ? benefitExplainerScreen2.footer_elements : null;
                    list2.getClass();
                    screenNavigator.goTo(new AtmPmdExplainerScreen(atmPmdExplainerOrigin, list, list2, paperMoneyDepositMerchantDetailsScreen.blockersData));
                } else if (!Intrinsics.areEqual(locationDetailsViewEvent, LocationDetailsViewEvent.BackOrOutsideClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:403:0x07c4, code lost:
        
            if (r0 != null) goto L367;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0340  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x040a  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x076e  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0778  */
        /* JADX WARN: Removed duplicated region for block: B:417:0x07f7  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:423:0x0801  */
        /* JADX WARN: Removed duplicated region for block: B:437:0x0842  */
        /* JADX WARN: Removed duplicated region for block: B:443:0x084e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x0a8d  */
        /* JADX WARN: Removed duplicated region for block: B:552:0x0a97  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
        /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r14v65 */
        /* JADX WARN: Type inference failed for: r14v74 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            RealKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1 realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1;
            int i;
            List list;
            CardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1 cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1;
            int i2;
            CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1 cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1;
            int i3;
            PaymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1 paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1;
            int i4;
            Object obj2;
            RealRawSyncValueService$encodeFlow$$inlined$map$1$2$1 realRawSyncValueService$encodeFlow$$inlined$map$1$2$1;
            int i5;
            RealSyncValueReaderV2$special$$inlined$map$1$2$1 realSyncValueReaderV2$special$$inlined$map$1$2$1;
            int i6;
            RealClipboardObserver$clipboardPolling$$inlined$map$1$2$1 realClipboardObserver$clipboardPolling$$inlined$map$1$2$1;
            int i7;
            UiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1 uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1;
            int i8;
            RealBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1 realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1;
            int i9;
            CryptoEligibilityStatus cryptoEligibilityStatus;
            RealBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1 realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1;
            int i10;
            RealAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1 realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1;
            int i11;
            RealProfileManager$scenarioPlan$$inlined$map$1$2$1 realProfileManager$scenarioPlan$$inlined$map$1$2$1;
            int i12;
            Object obj3;
            String str;
            int i13 = this.$r8$classId;
            int i14 = 5;
            Back back = Back.INSTANCE;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            int i15 = 1;
            Object obj4 = this.this$0;
            Object obj5 = this.$cameraPermissionGranted$delegate;
            Object obj6 = 0;
            ScenarioPlan scenarioPlan = null;
            r14 = null;
            r14 = null;
            r14 = null;
            BitcoinEligibilityStatus bitcoinEligibilityStatus = null;
            Money money = null;
            LinkedHashMap linkedHashMap = null;
            Object obj7 = null;
            obj6 = 0;
            switch (i13) {
                case 0:
                    MutableState mutableState = (MutableState) obj5;
                    if (((Boolean) obj).booleanValue()) {
                        z = true;
                    } else {
                        ActivityCompat.requestPermissions(((CaptureCheckFacePresenter) obj4).permissionManager.activity, AndroidPermissionManager.REQUEST_CAMERA, 2);
                    }
                    mutableState.setValue(Boolean.valueOf(z));
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof RealKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1) {
                        realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1 = (RealKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1) continuation;
                        int i16 = realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.label;
                        if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                            realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                            Object obj8 = realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.result;
                            Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                FlowCollector flowCollector = (FlowCollector) obj4;
                                KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
                                if (kybEligibilityWarning != null && (list = kybEligibilityWarning.banner_details) != null) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Object next = it.next();
                                            if (((KybEligibilityWarning.BannerDetail) next).restricted_feature == ((KybEligibilityWarning.RestrictedFeature) obj5)) {
                                                obj7 = next;
                                            }
                                        }
                                    }
                                    obj6 = (KybEligibilityWarning.BannerDetail) obj7;
                                }
                                realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj6, realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1) == obj9) {
                                    return obj9;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1 = new RealKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.result;
                    Object obj92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realKybRestrictionManager$get$lambda$1$$inlined$map$1$2$1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj4;
                    RealRouter realRouter = (RealRouter) cardStudioPresenter.appConfig;
                    AfterPayOrderDetailsScreen afterPayOrderDetailsScreen = (AfterPayOrderDetailsScreen) cardStudioPresenter.analytics;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                    AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent = (AfterPayOrderDetailsViewEvent) obj;
                    if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.CloseOrderDetailsButtonClicked) {
                        screenNavigator.goTo(back);
                    } else if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.OverflowMenuClicked) {
                        screenNavigator.goTo(new OrderDetailsOverflowActionSheetScreen(((AfterPayOrderDetailsViewEvent.OverflowMenuClicked) afterPayOrderDetailsViewEvent).actions, afterPayOrderDetailsScreen));
                    } else if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.PayEarlyButtonClicked) {
                        realRouter.route(new RoutingParams(AfterPayOrderDetailsScreen.copy$default(afterPayOrderDetailsScreen), null, null, null, null, null, 510), ((AfterPayOrderDetailsViewEvent.PayEarlyButtonClicked) afterPayOrderDetailsViewEvent).clientRouteUrl);
                    } else if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.PaymentMethodInfoButtonClicked) {
                        screenNavigator.goTo(new AfterPayInfoSheetScreen(((AfterPayOrderDetailsViewEvent.PaymentMethodInfoButtonClicked) afterPayOrderDetailsViewEvent).infoSheetViewModel, new AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics(afterPayOrderDetailsScreen.orderId)));
                    } else if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.ScheduledPaymentClicked) {
                        AfterPayOrderDetailsViewEvent.ScheduledPaymentClicked scheduledPaymentClicked = (AfterPayOrderDetailsViewEvent.ScheduledPaymentClicked) afterPayOrderDetailsViewEvent;
                        screenNavigator.goTo(new AfterPayInfoSheetScreen(scheduledPaymentClicked.infoSheetViewModel, new AfterPaySheetAnalyticsContext.PaymentDetails(afterPayOrderDetailsScreen.orderId, scheduledPaymentClicked.paymentStatus)));
                    } else if (afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.OpenUrl) {
                        realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((AfterPayOrderDetailsViewEvent.OpenUrl) afterPayOrderDetailsViewEvent).url);
                    } else {
                        if (!(afterPayOrderDetailsViewEvent instanceof AfterPayOrderDetailsViewEvent.TryAgainClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((MutableState) obj5).setValue(new AfterPayOrderDetailsPresenter$State(AfterPayOrderDetailsViewModel.OrderDetailsLoading.INSTANCE));
                    }
                    return Unit.INSTANCE;
                case 3:
                    AfterPayOrderDocumentViewEvent afterPayOrderDocumentViewEvent = (AfterPayOrderDocumentViewEvent) obj;
                    if (afterPayOrderDocumentViewEvent instanceof AfterPayOrderDocumentViewEvent.GoBack) {
                        ((BetterNavigator.ScreenNavigator) ((LocalPosCheckInPresenter) obj4).navigator).goTo(back);
                    } else {
                        if (!(afterPayOrderDocumentViewEvent instanceof AfterPayOrderDocumentViewEvent.TryAgainClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((MutableState) obj5).setValue(AfterPayOrderDocumentViewModel.Loading.INSTANCE);
                    }
                    return Unit.INSTANCE;
                case 4:
                    ErrorPresenter errorPresenter = (ErrorPresenter) obj4;
                    CardStudioMoreSheetScreen cardStudioMoreSheetScreen = (CardStudioMoreSheetScreen) errorPresenter.args;
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) errorPresenter.navigator;
                    MutableState mutableState2 = (MutableState) obj5;
                    CardStudioMoreSheetViewEvent cardStudioMoreSheetViewEvent = (CardStudioMoreSheetViewEvent) obj;
                    if (Intrinsics.areEqual(cardStudioMoreSheetViewEvent, CardStudioMoreSheetViewEvent.ToggleCashtag.INSTANCE)) {
                        mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                    } else if (Intrinsics.areEqual(cardStudioMoreSheetViewEvent, CardStudioMoreSheetViewEvent.StartOver.INSTANCE)) {
                        screenNavigator2.giveAnswer(cardStudioMoreSheetScreen.question, new CardStudioMoreSheetResult.StartOver(((Boolean) mutableState2.getValue()).booleanValue()));
                    } else if (Intrinsics.areEqual(cardStudioMoreSheetViewEvent, CardStudioMoreSheetViewEvent.DoneClicked.INSTANCE)) {
                        screenNavigator2.giveAnswer(cardStudioMoreSheetScreen.question, new CardStudioMoreSheetResult.Done(((Boolean) mutableState2.getValue()).booleanValue()));
                    } else {
                        if (!Intrinsics.areEqual(cardStudioMoreSheetViewEvent, CardStudioMoreSheetViewEvent.Dismiss.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator2.giveAnswer(cardStudioMoreSheetScreen.question, CardStudioMoreSheetResult.Dismissed.INSTANCE);
                    }
                    return Unit.INSTANCE;
                case 5:
                    PointF pointF = (PointF) obj;
                    float f = pointF.x;
                    MutableState mutableState3 = (MutableState) obj5;
                    CardTheme cardTheme = CardStudioViewKt.BLACK_CARD_THEME;
                    ((HeatRenderer) obj4).applyHeat(f - Float.intBitsToFloat((int) (((Offset) mutableState3.getValue()).packedValue >> 32)), pointF.y - Float.intBitsToFloat((int) (((Offset) mutableState3.getValue()).packedValue & BodyPartID.bodyIdMax)));
                    return Unit.INSTANCE;
                case 6:
                    CardStylePickerPresenter cardStylePickerPresenter = (CardStylePickerPresenter) obj5;
                    CoroutineScope coroutineScope = (CoroutineScope) obj4;
                    CardStylePickerViewEvent cardStylePickerViewEvent = (CardStylePickerViewEvent) obj;
                    if (cardStylePickerViewEvent instanceof CardStylePickerViewEvent.CardSelected) {
                        JobKt.launch$default(coroutineScope, null, null, new CardStylePickerPresenter$models$1$1(cardStylePickerPresenter, cardStylePickerViewEvent, obj6, z3 ? 1 : 0), 3);
                    } else if (Intrinsics.areEqual(cardStylePickerViewEvent, CardStylePickerViewEvent.Exit.INSTANCE)) {
                        JobKt.launch$default(coroutineScope, null, null, new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, obj6, z2 ? 1 : 0), 3);
                    } else {
                        if (!(cardStylePickerViewEvent instanceof CardStylePickerViewEvent.OnScrollToTheme)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new CardStylePickerPresenter$models$1$1(cardStylePickerPresenter, cardStylePickerViewEvent, obj6, i15), 3);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CardStyleScreen cardStyleScreen = ((CardStylePickerPresenter) obj5).args;
                    if (continuation instanceof CardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = (CardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i17 = cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                            Object obj10 = cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                FlowCollector flowCollector2 = (FlowCollector) obj4;
                                List list2 = ((StampsConfig) obj).stamps;
                                if (list2 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj11 : list2) {
                                        Stamp stamp = (Stamp) obj11;
                                        if (!cardStyleScreen.availableStamps.isEmpty()) {
                                            List list3 = cardStyleScreen.availableStamps;
                                            String str2 = stamp.name;
                                            str2.getClass();
                                            if (list3.contains(str2)) {
                                            }
                                        }
                                        arrayList.add(obj11);
                                    }
                                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    if (mapCapacity < 16) {
                                        mapCapacity = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(mapCapacity);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        String str3 = ((Stamp) next2).name;
                                        str3.getClass();
                                        linkedHashMap.put(str3, next2);
                                    }
                                }
                                if (linkedHashMap != null) {
                                    cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector2.emit(linkedHashMap, cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj10);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = new CardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj102 = cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = cardStylePickerPresenter$stampsConfig$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1) {
                        cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                        int i18 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                        if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                            Object obj12 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                FlowCollector flowCollector3 = (FlowCollector) obj4;
                                if (!((ListIndices) obj5).sectionRanges.isEmpty()) {
                                    cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.label = 1;
                                    if (flowCollector3.emit(obj, cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj12);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    Object obj122 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = cardStylePickerViewKt$CardStylePicker$1$1$1$7$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = (PaymentDeviceCustomizationPresenter) obj5;
                    if (continuation instanceof PaymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1) {
                        paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1 = (PaymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i19 = paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                            Object obj13 = paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                FlowCollector flowCollector4 = (FlowCollector) obj4;
                                List<Stamp> list4 = ((StampsConfig) obj).stamps;
                                if (list4 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Stamp stamp2 : list4) {
                                        String str4 = stamp2.name;
                                        Pair pair = (str4 != null && (paymentDeviceCustomizationPresenter.getBlockerAvailableStamps().isEmpty() || paymentDeviceCustomizationPresenter.getBlockerAvailableStamps().contains(str4))) ? new Pair(str4, stamp2) : null;
                                        if (pair != null) {
                                            arrayList2.add(pair);
                                        }
                                    }
                                    obj2 = MapsKt__MapsKt.toMap(arrayList2);
                                    break;
                                }
                                obj2 = EmptyMap.INSTANCE;
                                obj2.getClass();
                                paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(obj2, paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj13);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1 = new PaymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = paymentDeviceCustomizationPresenter$stampsConfig$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    StatusInterstitialPresenter statusInterstitialPresenter = (StatusInterstitialPresenter) obj5;
                    BlockersScreens.StatusInterstitial statusInterstitial = statusInterstitialPresenter.args;
                    CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                    StatusInterstitialViewEvent statusInterstitialViewEvent = (StatusInterstitialViewEvent) obj;
                    if (Intrinsics.areEqual(statusInterstitialViewEvent, StatusInterstitialViewEvent.Finished.INSTANCE)) {
                        JobKt.launch$default(coroutineScope2, null, null, new CardModelView.AnonymousClass1.C00581(statusInterstitialPresenter, obj6, 20), 3);
                    } else {
                        if (!Intrinsics.areEqual(statusInterstitialViewEvent, StatusInterstitialViewEvent.Dismiss.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockerAction dismissAction = statusInterstitial.getDismissAction();
                        if (dismissAction != null) {
                            JobKt.launch$default(coroutineScope2, null, null, new EntitySyncerKt$hasSyncedFlow$1(statusInterstitialPresenter, dismissAction, (Continuation) obj6, i14), 3);
                        } else {
                            statusInterstitialPresenter.blockerFlowAnalytics.onFlowCancelled(statusInterstitial.getBlockersData());
                            statusInterstitialPresenter.navigator.goTo(statusInterstitial.getBlockersData().exitScreen);
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    MutableState mutableState4 = (MutableState) obj5;
                    MusicPresenter musicPresenter = (MusicPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                    Analytics analytics = (Analytics) musicPresenter.args;
                    CashAppPaySettingsViewEvent cashAppPaySettingsViewEvent = (CashAppPaySettingsViewEvent) obj;
                    Continuation continuation2 = null;
                    if (cashAppPaySettingsViewEvent instanceof BusinessGrantClicked) {
                        CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel = ((BusinessGrantClicked) cashAppPaySettingsViewEvent).businessViewModel;
                        analytics.track(new BusinessGrantViewOpenDetails(cashAppPaySettingsRowViewModel$BusinessViewModel.businessGrantId), null);
                        screenNavigator3.goTo(new LinkedBusinessDetailsSheet(cashAppPaySettingsRowViewModel$BusinessViewModel.businessGrantId, cashAppPaySettingsRowViewModel$BusinessViewModel.image, cashAppPaySettingsRowViewModel$BusinessViewModel.title, cashAppPaySettingsRowViewModel$BusinessViewModel.actionType, cashAppPaySettingsRowViewModel$BusinessViewModel.renderingBehavior));
                    } else if (cashAppPaySettingsViewEvent instanceof BusinessGrantDeleted) {
                        mutableState4.setValue(Boolean.TRUE);
                        JobKt.launch$default((CoroutineScope) musicPresenter.musicRepository, null, null, new CardStudioPresenter$models$1$1(26, mutableState4, musicPresenter, cashAppPaySettingsViewEvent, continuation2), 3);
                    } else if (cashAppPaySettingsViewEvent instanceof BusinessGrantDeleteCancelled) {
                        analytics.track(new BusinessGrantRemoveCancel(((BusinessGrantDeleteCancelled) cashAppPaySettingsViewEvent).businessGrantId), null);
                    } else {
                        if (!Intrinsics.areEqual(cashAppPaySettingsViewEvent, GoBack.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator3.goTo(back);
                    }
                    return Unit.INSTANCE;
                case 12:
                    MutableState mutableState5 = (MutableState) obj5;
                    CheckDepositAmountPresenter checkDepositAmountPresenter = (CheckDepositAmountPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator4 = checkDepositAmountPresenter.navigator;
                    Analytics analytics2 = checkDepositAmountPresenter.analytics;
                    CheckDepositAmountScreen checkDepositAmountScreen = checkDepositAmountPresenter.args;
                    CheckDepositAmountViewEvent checkDepositAmountViewEvent = (CheckDepositAmountViewEvent) obj;
                    if (Intrinsics.areEqual(checkDepositAmountViewEvent, CheckDepositAmountViewEvent.Close.INSTANCE)) {
                        analytics2.track(new CheckDepositExit(CheckDepositExit.Step.AMOUNT_ENTRY), null);
                        checkDepositAmountPresenter.blockerFlowAnalytics.onFlowCancelled(checkDepositAmountScreen.blockersData);
                        screenNavigator4.goTo(checkDepositAmountScreen.blockersData.exitScreen);
                    } else if (checkDepositAmountViewEvent instanceof CheckDepositAmountViewEvent.PrimaryButtonClicked) {
                        Money money2 = (Money) mutableState5.getValue();
                        money2.getClass();
                        Long l = money2.amount;
                        l.getClass();
                        Integer num = new Integer((int) l.longValue());
                        Money money3 = (Money) mutableState5.getValue();
                        money3.getClass();
                        CurrencyCode currencyCode = money3.currency_code;
                        currencyCode.getClass();
                        analytics2.track(new CheckDepositEnterAmount(num, UtilsKt.getAsCdfCurrencyCode(currencyCode)), null);
                        BlockersData blockersData = checkDepositAmountScreen.blockersData;
                        Money money4 = (Money) mutableState5.getValue();
                        money4.getClass();
                        screenNavigator4.goTo(new ConfirmFrontOfCheckScreen(BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, money4, null, null, null, null, null, false, null, null, null, -1, 65471), checkDepositAmountScreen.checkDepositBlocker));
                    } else {
                        if (!(checkDepositAmountViewEvent instanceof CheckDepositAmountViewEvent.AmountChanged)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str5 = ((CheckDepositAmountViewEvent.AmountChanged) checkDepositAmountViewEvent).amount;
                        if (str5.length() > 0) {
                            CheckDepositBlocker.AmountEntryData amountEntryData = checkDepositAmountScreen.checkDepositBlocker.amount_entry_data;
                            amountEntryData.getClass();
                            Money money5 = amountEntryData.maximum_amount;
                            money5.getClass();
                            CurrencyCode currencyCode2 = money5.currency_code;
                            currencyCode2.getClass();
                            money = Moneys.parseMoneyFromString$default(str5, currencyCode2);
                        }
                        mutableState5.setValue(money);
                    }
                    return Unit.INSTANCE;
                case 13:
                    ConfirmBackOfCheckPresenter confirmBackOfCheckPresenter = (ConfirmBackOfCheckPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator5 = confirmBackOfCheckPresenter.navigator;
                    MutableState mutableState6 = (MutableState) obj5;
                    ConfirmBackOfCheckEvent confirmBackOfCheckEvent = (ConfirmBackOfCheckEvent) obj;
                    if (confirmBackOfCheckEvent instanceof ConfirmBackOfCheckEvent.CallToActionClick) {
                        if (((Boolean) mutableState6.getValue()).booleanValue()) {
                            ConfirmBackOfCheckScreen confirmBackOfCheckScreen = confirmBackOfCheckPresenter.args;
                            screenNavigator5.goTo(new VerifyCheckDepositScreen(confirmBackOfCheckScreen.blockersData, confirmBackOfCheckScreen.checkDepositBlocker));
                        }
                    } else if (confirmBackOfCheckEvent instanceof ConfirmBackOfCheckEvent.CloseClick) {
                        screenNavigator5.goTo(back);
                    } else {
                        if (!(confirmBackOfCheckEvent instanceof ConfirmBackOfCheckEvent.ConfirmCheckChange)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        mutableState6.setValue(Boolean.valueOf(((ConfirmBackOfCheckEvent.ConfirmCheckChange) confirmBackOfCheckEvent).isChecked));
                    }
                    return Unit.INSTANCE;
                case 14:
                    ConfirmFrontOfCheckPresenter confirmFrontOfCheckPresenter = (ConfirmFrontOfCheckPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator6 = confirmFrontOfCheckPresenter.navigator;
                    MutableState mutableState7 = (MutableState) obj5;
                    ConfirmFrontOfCheckEvent confirmFrontOfCheckEvent = (ConfirmFrontOfCheckEvent) obj;
                    if (confirmFrontOfCheckEvent instanceof ConfirmFrontOfCheckEvent.CallToActionClick) {
                        if (((Boolean) mutableState7.getValue()).booleanValue()) {
                            ConfirmFrontOfCheckScreen confirmFrontOfCheckScreen = confirmFrontOfCheckPresenter.args;
                            screenNavigator6.goTo(new ConfirmBackOfCheckScreen(confirmFrontOfCheckScreen.blockersData, confirmFrontOfCheckScreen.checkDepositBlocker));
                        }
                    } else if (confirmFrontOfCheckEvent instanceof ConfirmFrontOfCheckEvent.CloseClick) {
                        screenNavigator6.goTo(back);
                    } else {
                        if (!(confirmFrontOfCheckEvent instanceof ConfirmFrontOfCheckEvent.ConfirmCheckChange)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        mutableState7.setValue(Boolean.valueOf(((ConfirmFrontOfCheckEvent.ConfirmCheckChange) confirmFrontOfCheckEvent).isChecked));
                    }
                    return Unit.INSTANCE;
                case 15:
                    BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                    Navigator navigator = ((ClientScenarioRouter) obj4).navigator;
                    if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                        BlockersData copy$default = BlockersData.copy$default(BlockersData.DUMMY, BlockersData.Flow.SERVER_FLOW, null, null, null, null, null, null, null, false, false, null, null, null, false, RoutesKt.getClientScenarioProto((ClientRoute.ClientScenario) obj5), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.DEEPLINK, (String) obj6, 6), null, null, null, null, null, null, null, false, null, null, null, -65538, JpegConstants.JPEG_APP15_MARKER);
                        String str6 = ((BlockersHelper.BlockersAction.ShowError) blockersAction).message;
                        navigator.goTo(new BlockersScreens.Error(copy$default, str6, null));
                        Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Failed to initiate client scenario: ", str6), new Object[0]);
                    } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                        navigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof RealRawSyncValueService$encodeFlow$$inlined$map$1$2$1) {
                        realRawSyncValueService$encodeFlow$$inlined$map$1$2$1 = (RealRawSyncValueService$encodeFlow$$inlined$map$1$2$1) continuation;
                        int i20 = realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.label;
                        if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                            realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                            Object obj14 = realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                FlowCollector flowCollector5 = (FlowCollector) obj4;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = ((List) obj).iterator();
                                while (it3.hasNext()) {
                                    SyncValue syncValue = ((SyncEntity) ((RealRawSyncValueService) obj5).decryptor.decryptEntity((com.squareup.cash.clientsync.models.SyncEntity) it3.next()).entityProto).sync_value;
                                    ByteString encodeByteString = syncValue != null ? syncValue.encodeByteString() : null;
                                    if (encodeByteString != null) {
                                        arrayList3.add(encodeByteString);
                                    }
                                }
                                realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector5.emit(arrayList3, realRawSyncValueService$encodeFlow$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj14);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realRawSyncValueService$encodeFlow$$inlined$map$1$2$1 = new RealRawSyncValueService$encodeFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realRawSyncValueService$encodeFlow$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof RealSyncValueReaderV2$special$$inlined$map$1$2$1) {
                        realSyncValueReaderV2$special$$inlined$map$1$2$1 = (RealSyncValueReaderV2$special$$inlined$map$1$2$1) continuation;
                        int i21 = realSyncValueReaderV2$special$$inlined$map$1$2$1.label;
                        if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                            realSyncValueReaderV2$special$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realSyncValueReaderV2$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realSyncValueReaderV2$special$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                FlowCollector flowCollector6 = (FlowCollector) obj4;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Object obj16 : (List) obj) {
                                    SyncValueType syncValueType = ((com.squareup.cash.clientsync.models.SyncEntity) obj16).valueType;
                                    Object obj17 = linkedHashMap2.get(syncValueType);
                                    if (obj17 == null) {
                                        obj17 = new ArrayList();
                                        linkedHashMap2.put(syncValueType, obj17);
                                    }
                                    ((List) obj17).add(obj16);
                                }
                                RealSyncValueReaderV2 realSyncValueReaderV2 = (RealSyncValueReaderV2) obj5;
                                List list5 = (List) linkedHashMap2.get(null);
                                if (list5 == null) {
                                    list5 = EmptyList.INSTANCE;
                                }
                                if (!list5.isEmpty() && !realSyncValueReaderV2.hasReportedSyncValuesWithoutType) {
                                    RealClientSyncErrorReporter realClientSyncErrorReporter = realSyncValueReaderV2.errorReporter;
                                    int i22 = SyncValuesWithoutType.$r8$clinit;
                                    realClientSyncErrorReporter.reportNonFatal(SecurePixelCopy.create(list5));
                                    realSyncValueReaderV2.hasReportedSyncValuesWithoutType = true;
                                }
                                realSyncValueReaderV2$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector6.emit(linkedHashMap2, realSyncValueReaderV2$special$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj15);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realSyncValueReaderV2$special$$inlined$map$1$2$1 = new RealSyncValueReaderV2$special$$inlined$map$1$2$1(this, continuation);
                    Object obj152 = realSyncValueReaderV2$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realSyncValueReaderV2$special$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof RealClipboardObserver$clipboardPolling$$inlined$map$1$2$1) {
                        realClipboardObserver$clipboardPolling$$inlined$map$1$2$1 = (RealClipboardObserver$clipboardPolling$$inlined$map$1$2$1) continuation;
                        int i23 = realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.label;
                        if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                            realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                            Object obj18 = realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                List currentClipboardItems = ((RealClipboardObserver) obj5).currentClipboardItems();
                                realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.label = 1;
                                if (((FlowCollector) obj4).emit(currentClipboardItems, realClipboardObserver$clipboardPolling$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj18);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realClipboardObserver$clipboardPolling$$inlined$map$1$2$1 = new RealClipboardObserver$clipboardPolling$$inlined$map$1$2$1(this, continuation);
                    Object obj182 = realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realClipboardObserver$clipboardPolling$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof UiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1) {
                        uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1 = (UiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i24 = uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                            uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                            Object obj19 = uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                Object obj20 = ((NavigationModel.Ready.Swipe) obj5).pages.get(((Number) obj).intValue());
                                uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (((FlowCollector) obj4).emit(obj20, uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons8) {
                                    return coroutineSingletons8;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj19);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1 = new UiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = uiContainer$SwipeableScreenContent$4$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof RealBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1) {
                        realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1 = (RealBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1) continuation;
                        int i25 = realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.label;
                        if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                            Object obj21 = realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                FlowCollector flowCollector7 = (FlowCollector) obj4;
                                RealBitcoinEligibilityStatusProvider realBitcoinEligibilityStatusProvider = (RealBitcoinEligibilityStatusProvider) obj;
                                BitcoinEligibility bitcoinEligibility = (BitcoinEligibility) obj5;
                                int i26 = realBitcoinEligibilityStatusProvider.$r8$classId;
                                Object obj22 = realBitcoinEligibilityStatusProvider.eligibilities;
                                switch (i26) {
                                    case 0:
                                        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj22;
                                        int ordinal = bitcoinEligibility.ordinal();
                                        if (ordinal == 0) {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_p2p_send;
                                        } else if (ordinal == 1) {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_p2p_receive;
                                        } else if (ordinal == 2) {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_withdraw;
                                        } else if (ordinal == 3) {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_deposit;
                                        } else if (ordinal == 4) {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_lightning_withdraw;
                                        } else if (ordinal != 5) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            cryptoEligibilityStatus = cryptoEligibilities.btc_lightning_deposit;
                                        }
                                        int ordinal2 = cryptoEligibilityStatus.ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 != 1) {
                                                if (ordinal2 != 2) {
                                                    if (ordinal2 != 3) {
                                                        if (ordinal2 == 4) {
                                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.INELIGIBLE;
                                                            break;
                                                        } else {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        }
                                                    } else {
                                                        bitcoinEligibilityStatus = BitcoinEligibilityStatus.ELIGIBLE;
                                                        break;
                                                    }
                                                } else {
                                                    bitcoinEligibilityStatus = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                                                    break;
                                                }
                                            } else {
                                                bitcoinEligibilityStatus = BitcoinEligibilityStatus.PENDING_APPROVAL;
                                                break;
                                            }
                                        } else {
                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.UNSPECIFIED;
                                            break;
                                        }
                                    default:
                                        BalanceData balanceData = (BalanceData) obj22;
                                        int ordinal3 = bitcoinEligibility.ordinal();
                                        if (ordinal3 != 0) {
                                            if (ordinal3 != 2) {
                                                if (ordinal3 != 3) {
                                                    bitcoinEligibilityStatus = BitcoinEligibilityStatus.UNSPECIFIED;
                                                    break;
                                                } else {
                                                    int ordinal4 = balanceData.enable_cryptocurrency_transfer_in_status.ordinal();
                                                    if (ordinal4 != 0) {
                                                        if (ordinal4 != 1) {
                                                            if (ordinal4 != 2) {
                                                                if (ordinal4 != 3) {
                                                                    if (ordinal4 == 4) {
                                                                        bitcoinEligibilityStatus = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                                                                        break;
                                                                    } else {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        break;
                                                                    }
                                                                } else {
                                                                    bitcoinEligibilityStatus = BitcoinEligibilityStatus.ELIGIBLE;
                                                                    break;
                                                                }
                                                            } else {
                                                                bitcoinEligibilityStatus = BitcoinEligibilityStatus.PENDING_APPROVAL;
                                                                break;
                                                            }
                                                        } else {
                                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                                                            break;
                                                        }
                                                    } else {
                                                        bitcoinEligibilityStatus = BitcoinEligibilityStatus.INELIGIBLE;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int ordinal5 = balanceData.enable_cryptocurrency_transfer_out_status.ordinal();
                                                if (ordinal5 != 0) {
                                                    if (ordinal5 != 1) {
                                                        if (ordinal5 != 2) {
                                                            if (ordinal5 != 3) {
                                                                if (ordinal5 == 4) {
                                                                    bitcoinEligibilityStatus = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                                                                    break;
                                                                } else {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    break;
                                                                }
                                                            } else {
                                                                bitcoinEligibilityStatus = BitcoinEligibilityStatus.ELIGIBLE;
                                                                break;
                                                            }
                                                        } else {
                                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.PENDING_APPROVAL;
                                                            break;
                                                        }
                                                    } else {
                                                        bitcoinEligibilityStatus = BitcoinEligibilityStatus.CAN_BE_ELIGIBLE;
                                                        break;
                                                    }
                                                } else {
                                                    bitcoinEligibilityStatus = BitcoinEligibilityStatus.INELIGIBLE;
                                                    break;
                                                }
                                            }
                                        } else if (balanceData.bitcoin_p2p_enabled) {
                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.ELIGIBLE;
                                            break;
                                        } else {
                                            bitcoinEligibilityStatus = BitcoinEligibilityStatus.UNSPECIFIED;
                                            break;
                                        }
                                }
                                realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.label = 1;
                                if (flowCollector7.emit(bitcoinEligibilityStatus, realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj21);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1 = new RealBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realBitcoinEligibilityRepo$getStatus$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) obj5;
                    if (continuation instanceof RealBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1) {
                        realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1 = (RealBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1) continuation;
                        int i27 = realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.label;
                        if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                            realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.label = i27 - PKIFailureInfo.systemUnavail;
                            Object obj23 = realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                PaymentQueries paymentQueries = realBitcoinRoundUpsRepo.cashActivityQueries;
                                List list6 = (List) obj;
                                paymentQueries.getClass();
                                list6.getClass();
                                CashActivityQueries$allActivityByPaymentType$2 cashActivityQueries$allActivityByPaymentType$2 = CashActivityQueries$allActivityByPaymentType$2.INSTANCE;
                                FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new PinsQueries.Get_pinQuery(paymentQueries, list6, new CashActivityQueries$$ExternalSyntheticLambda1(paymentQueries, i15))), realBitcoinRoundUpsRepo.ioContext);
                                realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.label = 1;
                                if (FlowKt.emitAll((FlowCollector) obj4, mapToList, realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1) == coroutineSingletons10) {
                                    return coroutineSingletons10;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj23);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1 = new RealBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1(this, continuation);
                    Object obj232 = realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realBitcoinRoundUpsRepo$special$$inlined$transform$1$1$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    if (continuation instanceof RealAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1) {
                        realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1 = (RealAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1) continuation;
                        int i28 = realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.label;
                        if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                            realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                            Object obj24 = realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                FlowCollector flowCollector8 = (FlowCollector) obj4;
                                ExpiresAt expiresAt = (ExpiresAt) obj;
                                long millis = ((RealAppConfigManager) obj5).clock.millis();
                                Long l2 = expiresAt.expires_at;
                                l2.getClass();
                                if (millis < l2.longValue()) {
                                    Timber.Forest.d("Not updating web login config. Expires at " + expiresAt, new Object[0]);
                                } else {
                                    Timber.Forest.d("Updating web login config...", new Object[0]);
                                    realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector8.emit(obj, realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1) == coroutineSingletons11) {
                                        return coroutineSingletons11;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj24);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1 = new RealAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1(this, continuation);
                    Object obj242 = realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realAppConfigManager$updateWebLoginConfig$$inlined$filter$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof RealProfileManager$scenarioPlan$$inlined$map$1$2$1) {
                        realProfileManager$scenarioPlan$$inlined$map$1$2$1 = (RealProfileManager$scenarioPlan$$inlined$map$1$2$1) continuation;
                        int i29 = realProfileManager$scenarioPlan$$inlined$map$1$2$1.label;
                        if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$scenarioPlan$$inlined$map$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                            Object obj25 = realProfileManager$scenarioPlan$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realProfileManager$scenarioPlan$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                FlowCollector flowCollector9 = (FlowCollector) obj4;
                                Iterator it4 = ((List) obj).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj3 = it4.next();
                                        if (((ScenarioPlanEntry) obj3).client_scenario == ((ClientScenario) obj5)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                ScenarioPlanEntry scenarioPlanEntry = (ScenarioPlanEntry) obj3;
                                if (scenarioPlanEntry != null) {
                                    ClientScenario clientScenario = scenarioPlanEntry.client_scenario;
                                    clientScenario.getClass();
                                    com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan2 = scenarioPlanEntry.scenario_plan;
                                    scenarioPlan2.getClass();
                                    scenarioPlan = new ScenarioPlan(clientScenario, scenarioPlan2);
                                }
                                realProfileManager$scenarioPlan$$inlined$map$1$2$1.label = 1;
                                if (flowCollector9.emit(scenarioPlan, realProfileManager$scenarioPlan$$inlined$map$1$2$1) == coroutineSingletons12) {
                                    return coroutineSingletons12;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj25);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realProfileManager$scenarioPlan$$inlined$map$1$2$1 = new RealProfileManager$scenarioPlan$$inlined$map$1$2$1(this, continuation);
                    Object obj252 = realProfileManager$scenarioPlan$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realProfileManager$scenarioPlan$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 24:
                    return emit$com$squareup$cash$data$profile$RealProfileNotificationsRepository$getChannelStates$lambda$0$1$$inlined$map$1$2(obj, continuation);
                case 25:
                    return emit$com$squareup$cash$data$profile$documents$RealDocumentsManager$categories$$inlined$map$1$2(obj, continuation);
                case 26:
                    return emit$com$squareup$cash$deposits$physical$backend$real$barcode$RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1(obj, continuation);
                case 27:
                    return emit$com$squareup$cash$deposits$physical$presenter$address$PhysicalDepositAddressEntryPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 28:
                    return emit$com$squareup$cash$deposits$physical$presenter$details$PaperMoneyDepositMerchantDetailsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                default:
                    MutableState mutableState8 = (MutableState) obj5;
                    PaperMoneyDepositOnboardingPresenter paperMoneyDepositOnboardingPresenter = (PaperMoneyDepositOnboardingPresenter) obj4;
                    PaperCashDepositBlocker.TutorialCarousel tutorialCarousel = paperMoneyDepositOnboardingPresenter.tutorialBlockerInfo;
                    Object obj26 = (PaperMoneyDepositOnboardingEvent) obj;
                    if (obj26 instanceof PaperMoneyDepositOnboardingEvent.ButtonClick) {
                        PaperMoneyDepositOnboardingEvent.Paged paged = (PaperMoneyDepositOnboardingEvent.Paged) obj26;
                        if (paperMoneyDepositOnboardingPresenter.isLastPage(paged)) {
                            PaperMoneyDepositOnboardingPresenter.access$onClose(paperMoneyDepositOnboardingPresenter, paged);
                        } else {
                            int i30 = ((PaperMoneyDepositOnboardingEvent.ButtonClick) obj26).page + 1;
                            String str7 = tutorialCarousel.next_page_button_text;
                            str7.getClass();
                            mutableState8.setValue(new PaperMoneyDepositOnboardingViewModel(str7, tutorialCarousel.pages, i30));
                        }
                    } else if (obj26 instanceof PaperMoneyDepositOnboardingEvent.Close) {
                        PaperMoneyDepositOnboardingPresenter.access$onClose(paperMoneyDepositOnboardingPresenter, (PaperMoneyDepositOnboardingEvent.Paged) obj26);
                    } else {
                        if (!(obj26 instanceof PaperMoneyDepositOnboardingEvent.PageSwipeEvent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        int i31 = ((PaperMoneyDepositOnboardingEvent.PageSwipeEvent) obj26).page;
                        if (paperMoneyDepositOnboardingPresenter.isLastPage((PaperMoneyDepositOnboardingEvent.Paged) obj26)) {
                            str = tutorialCarousel.submit_button_text;
                            str.getClass();
                        } else {
                            str = tutorialCarousel.next_page_button_text;
                            str.getClass();
                        }
                        mutableState8.setValue(new PaperMoneyDepositOnboardingViewModel(str, tutorialCarousel.pages, i31));
                    }
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.this$0 = moleculePresenter;
            this.$cameraPermissionGranted$delegate = mutableState;
        }
    }
}
