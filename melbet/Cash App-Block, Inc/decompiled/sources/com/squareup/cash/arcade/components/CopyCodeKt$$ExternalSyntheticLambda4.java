package com.squareup.cash.arcade.components;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.camera.core.AspectRatio;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.style.BaselineShiftKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Answer;
import app.cash.broadway.screen.Screen;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.maps.android.compose.clustering.ClusteringMarkerProperties;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.presenters.OrderItemEventHandler$Factory$Impl;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelCache;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.compose.CopyCheckIconState;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.bugreporting.viewmodels.DeviceMetrics;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewEvent;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewModel;
import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStyleItemViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.CardStyleSectionViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.cashapppay.viewmodels.GrantViewEvent;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapBack;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndo;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncEntityStore;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.franklin.common.PriceTick;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class CopyCodeKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                CopyCodeState copyCodeState = (CopyCodeState) obj;
                ((Function0) obj3).invoke();
                ((Function1) obj2).invoke(copyCodeState);
                copyCodeState.isAnimating$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                ClusteringMarkerProperties clusteringMarkerProperties = (ClusteringMarkerProperties) obj3;
                clusteringMarkerProperties.anchor$delegate.setValue((Offset) obj2);
                clusteringMarkerProperties.zIndex$delegate.setValue((Float) obj);
                return Unit.INSTANCE;
            case 2:
                SignatureStateListener signatureStateListener = (SignatureStateListener) obj3;
                SignatureState signatureState = (SignatureState) obj2;
                MutableState mutableState = (MutableState) obj;
                if (signatureStateListener != null) {
                    signatureStateListener.onGlyphAdded();
                }
                Signature signature$customizations = signatureState.getSignature$customizations();
                if (signature$customizations != null) {
                    signature$customizations.finishGlyph();
                }
                Signature signature$customizations2 = signatureState.getSignature$customizations();
                if (signature$customizations2 != null) {
                    Bitmap bitmap = signature$customizations2.getBitmap();
                    mutableState.setValue(CollectionsKt.plus((Collection) mutableState.getValue(), (Object) new Pair(bitmap.copy(Bitmap.Config.ALPHA_8, false), Long.valueOf(SystemClock.uptimeMillis()))));
                    AspectRatio.clip(bitmap, signatureState.getClipPath$customizations());
                }
                signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                return Unit.INSTANCE;
            case 3:
                return ((OrderItemEventHandler$Factory$Impl) obj3).create((Navigator) obj, (Function1) obj2);
            case 4:
                AfterpaySearchViewModel.FilterPillViewModel filterPillViewModel = (AfterpaySearchViewModel.FilterPillViewModel) obj;
                ((SearchBarKeyboardState) obj3).setOpen(false);
                ((Function1) obj2).invoke(new AfterpaySearchViewEvent.FilterClicked(filterPillViewModel.id, filterPillViewModel.f1044type));
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj2).invoke(new AfterpaySearchViewEvent.FilterBottomSheetViewEvent.UpdateFilterSelection(((AfterpaySearchViewModel.FilterBottomSheetViewModel) obj3).filterGroupId, (String) ((MutableState) obj).getValue()));
                return Unit.INSTANCE;
            case 6:
                ((Function2) obj3).invoke(((RetroTransaction.Button) obj2).actionUrl, ((RetroTransaction) obj).tapEventSpec);
                return Unit.INSTANCE;
            case 7:
                Function1 function1 = (Function1) obj2;
                InlineAppMessageV2ViewModel.Ready ready = (InlineAppMessageV2ViewModel.Ready) obj3;
                MutableState mutableState2 = (MutableState) obj;
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    function1.invoke(new AppMessageViewEvent.AppMessageViewed(ready.messageToken));
                    mutableState2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 8:
                Shaker shaker = (Shaker) obj;
                ((NetworkFetcher$fetch$2) obj3).invoke(BalanceAppletTileViewEvent.BalanceAppletOnClickCashOut.INSTANCE);
                if (!((BalanceAppletTileViewModel.BalanceMovementButtons) obj2).canWithdraw) {
                    shaker.shake();
                }
                return Unit.INSTANCE;
            case 9:
                HistoricalRange historicalRange = (HistoricalRange) obj3;
                RealBitcoinGraphModelCache realBitcoinGraphModelCache = (RealBitcoinGraphModelCache) obj;
                Long l = ((PriceTick) obj2).time;
                l.getClass();
                return BaselineShiftKt.formattedTime(historicalRange, l.longValue(), TimeUnit.SECONDS, realBitcoinGraphModelCache.clock, realBitcoinGraphModelCache.dateFormatManager);
            case 10:
                ((Function0) obj3).invoke();
                JobKt.launch$default((CoroutineScope) obj2, null, null, new AmountPickerCondensedView.AnonymousClass14((CopyCheckIconState) obj, objArr == true ? 1 : 0, 22), 3);
                return Unit.INSTANCE;
            case 11:
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                MutableState mutableState4 = (MutableState) obj;
                if (((bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent) && ((Boolean) mutableState3.getValue()).booleanValue()) || ((bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent) && ((Boolean) mutableState4.getValue()).booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj;
                Function1 function12 = (Function1) obj2;
                if (!((BankAccountLinkingViewModel) obj3).loading) {
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                    function12.invoke(BankAccountLinkingViewEvent.Back.INSTANCE);
                }
                return Unit.INSTANCE;
            case 13:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj3;
                Function1 function13 = (Function1) obj2;
                MutableState mutableState5 = (MutableState) obj;
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                function13.invoke(new ReferralCodeViewEvent.SubmitAction((String) mutableState5.getValue()));
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj2).invoke(new BorrowLimitHubViewEvent.TapIncreaseLimitActionRow((String) obj3, ((BorrowLimitHubViewModel.CtaBullet) obj).title));
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj2).invoke(new BorrowHomeViewEvent.TapViewAllLoanHistory((BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData) obj3, ((BorrowHomeViewModel.Tile.LoanHistoryTileModel) obj).tileData.loans));
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj2).invoke(new BugReportingViewEvent.Submit((DeviceMetrics) obj3, (DiagnosticContext) obj));
                return Unit.INSTANCE;
            case 17:
                Function1 function14 = (Function1) obj2;
                KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) obj;
                KybEligibilityWarning.Action action = ((KybRestrictionBannerViewModel) obj3).bannerDetail.action;
                String str = action != null ? action.route_url : null;
                str.getClass();
                function14.invoke(new KybRestrictionBannerViewEvent.PrimaryActionEvent(str, bannerDetail));
                return Unit.INSTANCE;
            case 18:
                TextureViewFpsTracker textureViewFpsTracker = (TextureViewFpsTracker) obj3;
                ((MutableState) obj).setValue(Boolean.FALSE);
                textureViewFpsTracker.getClass();
                ((Function1) obj2).invoke(new CardPreviewViewEvent.OrderCard(textureViewFpsTracker.getAverageFps()));
                return Unit.INSTANCE;
            case 19:
                ((SnapshotStateList) obj3).add(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(13, obj, (Function1) obj2));
                return Unit.INSTANCE;
            case 20:
                Function1 function15 = (Function1) obj2;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                function15.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapBack()));
                if (((SnapshotStateList) obj3).isEmpty() && snapshotStateList.isEmpty()) {
                    function15.invoke(CardStudioViewEvent.Exit.INSTANCE);
                } else {
                    function15.invoke(CardStudioViewEvent.ShowExitDialog.INSTANCE);
                }
                return Unit.INSTANCE;
            case 21:
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
                SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj;
                if (((CardStudioViewModel.Content) obj3).customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                    if (!snapshotStateList2.isEmpty()) {
                        ((Function0) snapshotStateList2.remove(snapshotStateList2.size() - 1)).invoke();
                    }
                } else if (!snapshotStateList3.isEmpty()) {
                    ((Function0) snapshotStateList3.remove(snapshotStateList3.size() - 1)).invoke();
                }
                return Unit.INSTANCE;
            case 22:
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj;
                ((Function1) obj2).invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.FALSE)));
                if (function0 != null) {
                    function0.invoke();
                }
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                ((SnapshotStateList) obj3).add(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(14, obj, (Function1) obj2));
                return Unit.INSTANCE;
            case 24:
                CardStyleItemViewModel cardStyleItemViewModel = (CardStyleItemViewModel) obj;
                Function1 function16 = (Function1) obj2;
                ArrayList arrayList = ((CardStylePickerViewModel) obj3).sections;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((CardStyleSectionViewModel) it.next()).cards, arrayList2);
                }
                function16.invoke(new CardStylePickerViewEvent.CardSelected(arrayList2.indexOf(cardStyleItemViewModel)));
                return Unit.INSTANCE;
            case 25:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                Function0 function03 = (Function0) obj3;
                if (((ZoomLevel) ((MutableState) obj).getValue()) == ZoomLevel.NEAR) {
                    cardDesignLibraryScene.zoomOut();
                } else if (function03 != null) {
                    function03.invoke();
                }
                return Unit.INSTANCE;
            case 26:
                Function1 function17 = (Function1) obj2;
                UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                if (((GrantViewModel) obj3) instanceof GrantViewModel.InTransactionTopUpInfo) {
                    function17.invoke(GrantViewEvent.InTransactionTopUpInfoClosed.INSTANCE);
                    if (uiContainerKt$BottomSheet$1$sheetScope$1 != null) {
                        JobKt.launch$default(uiContainerKt$BottomSheet$1$sheetScope$1.$scope, null, null, new RealSheetState$peek$3(uiContainerKt$BottomSheet$1$sheetScope$1.$state, objArr2 == true ? 1 : 0, 10), 3);
                    }
                } else {
                    function17.invoke(GrantViewEvent.Dismiss.INSTANCE);
                }
                return Unit.INSTANCE;
            case 27:
                return ((BootstrappedSyncEntityStore) obj3).destinationStore.getEntity((String) obj2, (SyncEntityType) obj);
            case 28:
                BetterNavigator betterNavigator = (BetterNavigator) obj3;
                return betterNavigator.startPresenter((Screen) obj2, betterNavigator.swipeStateKey, null, (SavedState) obj);
            default:
                BackStack$ScreenEntry.Overlay overlay = (BackStack$ScreenEntry.Overlay) obj2;
                return ((BetterNavigator) obj3).startPresenter(overlay.args, overlay.stateKey, (Answer) obj, overlay.presenterState);
        }
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
    }
}
