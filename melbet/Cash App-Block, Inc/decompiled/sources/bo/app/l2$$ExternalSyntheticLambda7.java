package bo.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig;
import androidx.camera.camera2.pipe.CameraPipe$Config;
import androidx.camera.camera2.pipe.CameraPipe$ThreadConfig;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.CameraPipeKt;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.video.Recorder;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.ForegroundInfo;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkForegroundUpdater;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.internal.CashBalanceKt;
import app.cash.local.presenters.internal.CashBannerKt;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.LocalBrandBannersKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchCleared;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.views.wallet.TabContentViewKt$clickableWithRippleOnClick$2$1$1;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapClear;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewEvent;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.history.payments.presenters.ProfileActivityItemEventDecorator;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewEvent;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.scannerview.CameraOperator$cameraOpenCallback$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONObject;
import papa.InputEventTrigger;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class l2$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ l2$$ExternalSyntheticLambda7(LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, MenuItem menuItem, MutableState mutableState, LocationMenu locationMenu, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 6;
        this.f$0 = menuItem;
        this.f$1 = mutableState;
        this.f$2 = locationMenu;
        this.f$3 = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05f8  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        LocalBrandBannerModel localBrandBannerModel;
        LocalLocationDetail localLocationDetail;
        LocalCashMarketingContent localCashMarketingContent;
        LocalCashMarketingContent.Template template;
        LocalBrandBanner brandBannerForSpot;
        Pair pair;
        Unit logCustomEvent$lambda$1;
        Unit logPushNotificationActionClicked$lambda$1;
        char c;
        long j;
        Triple triple;
        Triple triple2;
        CurrencyCode currencyCode;
        WandScene$ring$3 wandScene$ring$3;
        WandScene$ring$3 wandScene$ring$32;
        SavedState savedState;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.$r8$classId) {
            case 0:
                return l2.a((l2) this.f$0, (JSONObject) this.f$1, (Long) this.f$2, (List) this.f$3);
            case 1:
                Context context = (Context) this.f$0;
                AutoValue_CameraThreadConfig autoValue_CameraThreadConfig = (AutoValue_CameraThreadConfig) this.f$1;
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) this.f$2;
                Recorder.AnonymousClass1 anonymousClass1 = (Recorder.AnonymousClass1) this.f$3;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl = new DaggerCameraAppComponent$CameraAppComponentImpl(new com.fillr.e0(context, autoValue_CameraThreadConfig, (CameraPipeImpl) ((Lazy) stuckPlayerDetector.player).getValue(), anonymousClass1, (CameraCoordinatorAdapter) stuckPlayerDetector.period, (CameraXConfig) stuckPlayerDetector.clock));
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                return daggerCameraAppComponent$CameraAppComponentImpl;
            case 2:
                CameraFactoryProvider cameraFactoryProvider = (CameraFactoryProvider) this.f$0;
                Context context2 = (Context) this.f$1;
                AutoValue_CameraThreadConfig autoValue_CameraThreadConfig2 = (AutoValue_CameraThreadConfig) this.f$2;
                DurationNs durationNs = (DurationNs) this.f$3;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context2);
                    persistentApplicationContext.getClass();
                    CameraPipe$ThreadConfig cameraPipe$ThreadConfig = new CameraPipe$ThreadConfig(new SequentialExecutor(autoValue_CameraThreadConfig2.cameraExecutor), 119);
                    Recorder.AnonymousClass1 anonymousClass12 = cameraFactoryProvider.sharedInteropCallbacks;
                    CameraPipeImpl CameraPipe = CameraPipeKt.CameraPipe(new CameraPipe$Config(persistentApplicationContext, cameraPipe$ThreadConfig, new CameraPipe$CameraInteropConfig((CameraOperator$cameraOpenCallback$1) anonymousClass12.val$videoEncoderSession, (Recorder.AnonymousClass4) anonymousClass12.this$0, durationNs)));
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                    }
                    return CameraPipe;
                } finally {
                    Trace.endSection();
                }
            case 3:
                Number number = (Number) this.f$0;
                InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) this.f$1;
                Number number2 = (Number) this.f$2;
                InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) this.f$3;
                if (!number.equals(transitionAnimationState.initialValue) || !number2.equals(transitionAnimationState.targetValue)) {
                    transitionAnimationState.initialValue = number;
                    transitionAnimationState.targetValue = number2;
                    transitionAnimationState.animation = new TargetBasedAnimation(infiniteRepeatableSpec, transitionAnimationState.typeConverter, number, number2, null);
                    InfiniteTransition.this.refreshChildNeeded$delegate.setValue(Boolean.TRUE);
                    transitionAnimationState.isFinished = false;
                    transitionAnimationState.startOnTheNextFrame = true;
                }
                return Unit.INSTANCE;
            case 4:
                WorkForegroundUpdater workForegroundUpdater = (WorkForegroundUpdater) this.f$0;
                UUID uuid = (UUID) this.f$1;
                ForegroundInfo foregroundInfo = (ForegroundInfo) this.f$2;
                Context context3 = (Context) this.f$3;
                String uuid2 = uuid.toString();
                WorkSpec workSpec = workForegroundUpdater.mWorkSpecDao.getWorkSpec(uuid2);
                if (workSpec == null || workSpec.state.isFinished()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    Processor processor = workForegroundUpdater.mForegroundProcessor;
                    synchronized (processor.mLock) {
                        try {
                            Logger$LogcatLogger.get().info(Processor.TAG, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            WorkerWrapper workerWrapper = (WorkerWrapper) processor.mEnqueuedWorkMap.remove(uuid2);
                            if (workerWrapper != null) {
                                if (processor.mForegroundLock == null) {
                                    PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(processor.mAppContext);
                                    processor.mForegroundLock = newWakeLock;
                                    newWakeLock.acquire();
                                }
                                processor.mForegroundWorkMap.put(uuid2, workerWrapper);
                                processor.mAppContext.startForegroundService(SystemForegroundDispatcher.createStartForegroundIntent(processor.mAppContext, Room.generationalId(workerWrapper.workSpec), foregroundInfo));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    WorkGenerationalId generationalId = Room.generationalId(workSpec);
                    String str = SystemForegroundDispatcher.TAG;
                    Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.mNotificationId);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.mForegroundServiceType);
                    intent.putExtra("KEY_NOTIFICATION", foregroundInfo.mNotification);
                    intent.putExtra("KEY_WORKSPEC_ID", generationalId.workSpecId);
                    intent.putExtra("KEY_GENERATION", generationalId.generation);
                    context3.startService(intent);
                }
                return null;
            case 5:
                OrderBuilderModel orderBuilderModel = (OrderBuilderModel) this.f$0;
                LocalMoney localMoney = (LocalMoney) this.f$1;
                State state = (State) this.f$2;
                MutableState mutableState = (MutableState) this.f$3;
                LocalCashMarketingContent localCashMarketingContent2 = ((Brand) state.getValue()).marketingContent;
                if (localCashMarketingContent2 == null) {
                    return null;
                }
                boolean z = orderBuilderModel.redeemLocalCash;
                LocalCashMarketingContent.Template template2 = z ? localCashMarketingContent2.order_details_redemption_on : localCashMarketingContent2.order_details_redemption_off;
                if (template2 == null) {
                    return null;
                }
                LocalMoney asLocalMoneyOrZero = CashBalanceKt.asLocalMoneyOrZero((LocalCashBalance) mutableState.getValue());
                return CashBannerKt.cashBannerModel(template2, z ? new LocalMoney(localMoney.amount, LocalCurrencyCode.USD) : asLocalMoneyOrZero, LocalMoneysKt.isPositive(asLocalMoneyOrZero) ? new LocalBrandBannerModel.Mode.Toggleable(z) : LocalBrandBannerModel.Mode.Fixed.INSTANCE);
            case 6:
                return LocalMoneysKt.times(CartBuilderKt.getCostInMenu(LocalMenuComboDetailsPresenter.createCartEntry((MenuItem) this.f$0, (MutableState) this.f$1), (LocationMenu) this.f$2), ((ParcelableSnapshotMutableIntState) this.f$3).getIntValue());
            case 7:
                MutableState mutableState2 = (MutableState) this.f$0;
                RealCartBuilder realCartBuilder = (RealCartBuilder) this.f$1;
                MutableState mutableState3 = (MutableState) this.f$2;
                State state2 = (State) this.f$3;
                GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) mutableState2.getValue();
                if (buyerInfo != null && (brandBannerForSpot = LocalBrandBanner.Companion.brandBannerForSpot(buyerInfo, LocalBrandBanner.Spot.CART)) != null) {
                    LocalBrandBanner.Action action = brandBannerForSpot.action;
                    if (action instanceof LocalBrandBanner.Action.ApplySingleOffer) {
                        String str2 = ((LocalBrandBanner.Action.ApplySingleOffer) action).offerToken;
                        String offerToken = DiscountCodeKt.getOfferToken(realCartBuilder.discountCodes);
                        if (offerToken == null ? false : Intrinsics.areEqual(str2, offerToken)) {
                            brandBannerForSpot = null;
                        }
                    }
                    if (brandBannerForSpot != null) {
                        localBrandBannerModel = LocalBrandBannersKt.toBannerModel(brandBannerForSpot);
                        if (localBrandBannerModel == null) {
                            return localBrandBannerModel;
                        }
                        LocalBrand localBrand = (LocalBrand) mutableState3.getValue();
                        if (localBrand == null || (localLocationDetail = localBrand.selected_location) == null || (localCashMarketingContent = localLocationDetail.local_cash_marketing_content) == null || (template = localCashMarketingContent.cart_toolbar) == null) {
                            return null;
                        }
                        return CashBannerKt.cashBannerModel(template, CashBalanceKt.asLocalMoneyOrZero((LocalCashBalance) state2.getValue()), LocalBrandBannerModel.Mode.Fixed.INSTANCE);
                    }
                }
                localBrandBannerModel = null;
                if (localBrandBannerModel == null) {
                }
                break;
            case 8:
                AndroidStringManager androidStringManager = ((FulfillmentPickerPresenter) this.f$0).stringManager;
                MutableState mutableState4 = (MutableState) this.f$1;
                MutableState mutableState5 = (MutableState) this.f$2;
                State state3 = (State) this.f$3;
                if (((DeliveryQuote) mutableState4.getValue()) != null) {
                    DeliveryQuote deliveryQuote = (DeliveryQuote) mutableState4.getValue();
                    deliveryQuote.getClass();
                    String str3 = (String) state3.getValue();
                    if (str3 == null) {
                        Object[] objArr3 = {LocalsKt.prettyPrint$default(deliveryQuote.deliveryFee, false, null, 7)};
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        str3 = new MessageFormat(resources.getString(R.string.local_presenters_delivery_fee)).format(objArr3);
                        str3.getClass();
                    }
                    ZoneId zoneId = deliveryQuote.location.zoneId;
                    pair = new Pair(str3, zoneId != null ? DateTimesKt.estimatedTime(deliveryQuote.fulfillment, androidStringManager, zoneId) : null);
                } else {
                    if (!((Boolean) mutableState5.getValue()).booleanValue()) {
                        return null;
                    }
                    pair = new Pair(androidStringManager.get(R.string.local_presenters_quote_loading), null);
                }
                return pair;
            case 9:
                CoroutineScope coroutineScope = (CoroutineScope) this.f$0;
                Function1 function1 = (Function1) this.f$1;
                JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$ModuleJob$run$3((LazyGridState) this.f$2, (CollapsingToolbarScaffoldState) this.f$3, objArr == true ? 1 : 0, 20), 3);
                function1.invoke(LocalSearchViewEvent$SearchCleared.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.f$0;
                Function1 function12 = (Function1) this.f$1;
                LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem = (LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) this.f$2;
                LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) this.f$3;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                String str4 = menuItem.counterModel.menuItemToken;
                str4.getClass();
                function12.invoke(new LocalBrandLocationMenuViewEvent.MenuItemClicked(str4, menuCategory.token, menuItem.counterModel.analyticsContext));
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f$0;
                Function0 function0 = (Function0) this.f$1;
                MutableState mutableState6 = (MutableState) this.f$2;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.f$3;
                long j2 = ((IntSize) mutableState6.getValue()).packedValue;
                JobKt.launch$default(coroutineScope2, null, null, new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, new PressInteraction.Press((Float.floatToRawIntBits(((int) (j2 & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((int) (j2 >> 32)) / 2.0f) << 32)), objArr2 == true ? 1 : 0, 0), 3);
                function0.invoke();
                return Unit.INSTANCE;
            case 12:
                return g6.a((String) this.f$0, (String) this.f$1, (String) this.f$2, (g6) this.f$3);
            case 13:
                logCustomEvent$lambda$1 = Braze.logCustomEvent$lambda$1((Braze) this.f$0, (String) this.f$1, (BrazeProperties) this.f$2, (BrazeProperties) this.f$3);
                return logCustomEvent$lambda$1;
            case 14:
                logPushNotificationActionClicked$lambda$1 = Braze.logPushNotificationActionClicked$lambda$1((String) this.f$0, (Braze) this.f$1, (String) this.f$2, (String) this.f$3);
                return logPushNotificationActionClicked$lambda$1;
            case 15:
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) this.f$0;
                Function1 function13 = (Function1) this.f$1;
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel sectionViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel) this.f$2;
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel rowViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel) this.f$3;
                searchBarKeyboardState.setOpen(false);
                function13.invoke(new AfterpaySearchViewEvent.SearchResultRowClicked(sectionViewModel.id, rowViewModel.id));
                return Unit.INSTANCE;
            case 16:
                JobKt.launch$default((CoroutineScope) this.f$0, null, null, new ToastKt$Toast$9$1((MutableTransitionState) this.f$1, (Function1) this.f$2, (InlineAppMessageV2ViewModel.Ready) this.f$3, null, 9), 3);
                return Unit.INSTANCE;
            case 17:
                BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) this.f$0;
                State state4 = (State) this.f$1;
                MutableState mutableState7 = (MutableState) this.f$2;
                State state5 = (State) this.f$3;
                Money money = (Money) state4.getValue();
                long j3 = ((BitcoinTransferViewEvent.AmountEntered) mutableState7.getValue()).amountCents;
                Instrument instrument = (Instrument) state5.getValue();
                InstrumentCellViewModel.Accessory.Push push = InstrumentCellViewModel.Accessory.Push.INSTANCE;
                AndroidStringManager androidStringManager2 = bitcoinTransferPresenter.stringManager;
                if (!bitcoinTransferPresenter.buyInstrumentSelectionEnabled) {
                    return null;
                }
                BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferPresenter.args;
                if (!bitcoinTransferScreen.isBuy || !(bitcoinTransferScreen.orderType instanceof BitcoinTransferScreen.OrderType.Standard)) {
                    return null;
                }
                Long l = money != null ? money.amount : null;
                long displayDivisor = j3 - ((money == null || (currencyCode = money.currency_code) == null) ? 100L : (long) Moneys.displayDivisor(currencyCode));
                if (displayDivisor < 0) {
                    displayDivisor = 0;
                }
                if (l != null) {
                    c = 1;
                    j = l.longValue();
                } else {
                    c = 1;
                    j = 0;
                }
                long min = Math.min(j, displayDivisor);
                if (l != null && l.longValue() > 0) {
                    if (j3 <= l.longValue()) {
                        triple2 = new Triple(androidStringManager2.get(R.string.instrument_cell_cash_balance_label), CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24)), null);
                    } else if (instrument != null && min > 0) {
                        String str5 = instrument.displayNameCompact;
                        Object[] objArr4 = {str5 != null ? str5 : ""};
                        Resources resources2 = androidStringManager2.resources;
                        resources2.getClass();
                        String format2 = new MessageFormat(resources2.getString(R.string.instrument_cell_cash_balance_and_additional_instrument_label)).format(objArr4);
                        format2.getClass();
                        InstrumentIcon.LocalIcon localIcon = new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                        InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, null, null, 7);
                        InstrumentIcon[] instrumentIconArr = new InstrumentIcon[2];
                        instrumentIconArr[0] = localIcon;
                        instrumentIconArr[c] = instrumentIcon$default;
                        triple = new Triple(format2, CollectionsKt__CollectionsKt.listOf((Object[]) instrumentIconArr), push);
                    } else if (instrument != null) {
                        String str6 = instrument.displayNameCompact;
                        triple = new Triple(str6 != null ? str6 : "", CollectionsKt__CollectionsJVMKt.listOf(GoogleMapKt.instrumentIcon$default(instrument, null, null, 7)), push);
                    } else {
                        triple2 = new Triple(androidStringManager2.get(R.string.instrument_cell_cash_balance_and_new_instrument_label), CollectionsKt__CollectionsKt.listOf((Object[]) new InstrumentIcon.LocalIcon[]{new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24), new InstrumentIcon.LocalIcon(Icons.Add16, null, null, null, null, 30)}), push);
                    }
                    return new InstrumentCellViewModel((String) triple2.first, null, true, (List) triple2.second, (InstrumentCellViewModel.Accessory.Push) triple2.third, null, androidStringManager2.get(R.string.instrument_cell_from_label), null, null, 416);
                }
                if (instrument == null) {
                    return null;
                }
                String str7 = instrument.displayNameCompact;
                triple = new Triple(str7 != null ? str7 : "", CollectionsKt__CollectionsJVMKt.listOf(GoogleMapKt.instrumentIcon$default(instrument, null, null, 7)), push);
                triple2 = triple;
                return new InstrumentCellViewModel((String) triple2.first, null, true, (List) triple2.second, (InstrumentCellViewModel.Accessory.Push) triple2.third, null, androidStringManager2.get(R.string.instrument_cell_from_label), null, null, 416);
            case 18:
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.f$0;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) this.f$1;
                Function1 function14 = (Function1) this.f$2;
                MutableState mutableState8 = (MutableState) this.f$3;
                focusOwnerImpl.clearFocus(false);
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                function14.invoke(new VerifyAliasViewEvent.SubmitCode((String) mutableState8.getValue()));
                return Unit.INSTANCE;
            case 19:
                FocusOwnerImpl focusOwnerImpl2 = (FocusOwnerImpl) this.f$0;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = (DelegatingSoftwareKeyboardController) this.f$1;
                VerifyAliasModel verifyAliasModel = (VerifyAliasModel) this.f$2;
                Function1 function15 = (Function1) this.f$3;
                focusOwnerImpl2.clearFocus(false);
                if (delegatingSoftwareKeyboardController3 != null) {
                    delegatingSoftwareKeyboardController3.hide();
                }
                int ordinal = verifyAliasModel.navigationButton.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        function15.invoke(VerifyAliasViewEvent.GoBack.INSTANCE);
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        function15.invoke(VerifyAliasViewEvent.Dismiss.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                SignatureState signatureState = (SignatureState) this.f$0;
                StampState stampState = (StampState) this.f$1;
                Function1 function16 = (Function1) this.f$2;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f$3;
                signatureState.getClass();
                if (((Boolean) Updater.derivedStateOf(new SignatureViewKt$$ExternalSyntheticLambda1(signatureState, 1)).getValue()).booleanValue()) {
                    signatureState.clear();
                    wandScene$ring$3 = new WandScene$ring$3(0, signatureState, SignatureState.class, "undo", "undo()V", 0, 13);
                } else {
                    wandScene$ring$3 = null;
                }
                if (stampState.getStamps$customizations().isEmpty()) {
                    wandScene$ring$32 = null;
                } else {
                    stampState.setStamps$customizations(EmptyList.INSTANCE);
                    stampState.customizationDeque.push(stampState.getStamps$customizations());
                    wandScene$ring$32 = new WandScene$ring$3(0, stampState, StampState.class, "undo", "undo()V", 0, 14);
                }
                if (wandScene$ring$3 != null || wandScene$ring$32 != null) {
                    function16.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapClear()));
                    snapshotStateList.add(new CopyCodeKt$$ExternalSyntheticLambda4(function16, wandScene$ring$3, wandScene$ring$32, false, 22));
                }
                return Unit.INSTANCE;
            case 21:
                return new Triple(Float.valueOf((float) Math.toRadians(((Number) ((Animatable) this.f$0).getValue()).floatValue())), Float.valueOf((float) Math.toRadians(((Number) ((Animatable) this.f$1).getValue()).floatValue())), new Vector4(RecyclerView.DECELERATION_RATE, ((Number) ((Animatable) this.f$2).getValue()).floatValue(), ((Number) ((Animatable) this.f$3).getValue()).floatValue(), RecyclerView.DECELERATION_RATE));
            case 22:
                return ((BetterNavigator) this.f$0).startPresenter((Screen) this.f$1, (String) this.f$2, null, (SavedState) this.f$3);
            case 23:
                BetterNavigator betterNavigator = (BetterNavigator) this.f$0;
                Screen screen = (Screen) this.f$1;
                String str8 = (String) this.f$2;
                Navigation.ScreenNavigation screenNavigation = (Navigation.ScreenNavigation) this.f$3;
                Navigation.ScreenNavigation.Restore restore = screenNavigation instanceof Navigation.ScreenNavigation.Restore ? (Navigation.ScreenNavigation.Restore) screenNavigation : null;
                if (restore == null || (savedState = restore.savedState) == null) {
                    savedState = (SavedState) betterNavigator.pausedStates.remove(str8);
                }
                return betterNavigator.startPresenter(screen, str8, null, savedState);
            case 24:
                ((Function1) this.f$0).invoke(new PromotionDetailsViewEvent.Click((String) this.f$1, (String) this.f$2, (DetailsPageInteractTapButton.DetailsPageButtonLocation) this.f$3));
                return Unit.INSTANCE;
            case 25:
                ((Function1) this.f$0).invoke(new DependentControlViewEvent$ToggleEvent$ToggleChanged(!((DependentControlsToggleViewModel) this.f$1).toggleChecked, (ControlType) this.f$2, (String) this.f$3));
                return Unit.INSTANCE;
            case 26:
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) this.f$0;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.f$1;
                return realActivityEmbeddedPresenter$Factory$Impl.create((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default((ActivitiesManager.ActivityContext) ((Lazy) cardStudioPresenter.analytics).getValue(), (ActivitiesCache) cardStudioPresenter.appConfig, (PaymentHistoryScreens$ProfileCompletePaymentHistory) cardStudioPresenter.args, false, null, InputEventTrigger.Companion.decoratedWith((DefaultActivityItemEventHandler$Factory$Impl) this.f$2, (ProfileActivityItemEventDecorator) this.f$3), null, null, null, 15864));
            case 27:
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) this.f$0;
                ProfilePaymentHistoryPresenter profilePaymentHistoryPresenter = (ProfilePaymentHistoryPresenter) this.f$1;
                return realActivityEmbeddedPresenter$Factory$Impl2.create(profilePaymentHistoryPresenter.navigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default((ActivitiesManager.ActivityContext) profilePaymentHistoryPresenter.activityContext$delegate.getValue(), profilePaymentHistoryPresenter.activitiesCache, profilePaymentHistoryPresenter.parentScreen, new RealGooglePayer$$ExternalSyntheticLambda0(profilePaymentHistoryPresenter, 9), 0, null, null, InputEventTrigger.Companion.decoratedWith((DefaultActivityItemEventHandler$Factory$Impl) this.f$2, (ProfileActivityItemEventDecorator) this.f$3), null, null, 7656));
            case 28:
                ((Function1) this.f$0).invoke(new InvestingCategoryFilterViewEvent.SelectDropDownOption(((InvestingCategoryFilterViewModel.Content.FilterOption.Selection) this.f$2).token, ((InvestingCategoryFilterViewModel.Content.FilterSection) this.f$1).token, ((InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow) this.f$3).token));
                return Unit.INSTANCE;
            default:
                MarkerLocation markerLocation = (MarkerLocation) this.f$0;
                Function1 function17 = (Function1) this.f$1;
                Function1 function18 = (Function1) this.f$2;
                Function0 function02 = (Function0) this.f$3;
                String token = markerLocation.getToken();
                function18.getClass();
                function02.getClass();
                if (token != null) {
                    if (function17 != null) {
                        function17.invoke(token);
                    } else {
                        function18.invoke(new CashMapViewEvent.MarkerClicked(token));
                    }
                    function02.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l2$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
