package com.squareup.cash.offers.views;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MemoryTooltip;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.SlashCommandViewModel;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewEvent;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewEvent;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.views.chat.RotatingPromptItem;
import com.squareup.cash.moneybot.views.plugins.TokenRange;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.PillViewModel;
import com.squareup.cash.offers.viewmodels.shared.OffersLinkViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFilterGroupSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.squareup.cash.moneybot.backend.api.model.chat.Chat] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UrlTapAction urlTapAction;
        int i = this.$r8$classId;
        r3 = null;
        String str = null;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                focusOwnerImpl.clearFocus(false);
                break;
            case 1:
                MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) obj2;
                MutableState mutableState = (MutableState) obj;
                MoneybotChatPresenter.TokenStreamingState tokenStreamingState = ((MoneybotChatPresenter.ChatSessionState) mutableState.getValue()).tokenStreamingState;
                boolean booleanValue = ((Boolean) moneybotChatPresenter.sendMessageAnimating$delegate.getValue()).booleanValue();
                MoneybotChatPresenter.ToolRequestState toolRequestState = ((MoneybotChatPresenter.ChatSessionState) mutableState.getValue()).toolRequestInProgress;
                Set streamingKickoffTexts = moneybotChatPresenter.getStreamingKickoffTexts();
                List pendingMessages = moneybotChatPresenter.getPendingMessages();
                ChatSession chatSession = ((MoneybotChatPresenter.ChatSessionState) mutableState.getValue()).session;
                ChatSession.Ok ok = chatSession instanceof ChatSession.Ok ? (ChatSession.Ok) chatSession : null;
                break;
            case 2:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) cardLockPresenter.flowNavigationHelper;
                if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && ((RealUserSessionPager) cardLockPresenter.analytics).hasMoreSessions) {
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$2$1(cardLockPresenter, r3, 17), 3);
                }
                break;
            case 3:
                ((Function1) obj2).invoke((ChatCardViewEvent) obj);
                break;
            case 4:
                ((Function1) obj2).invoke(((RotatingPromptItem) obj).prompt);
                break;
            case 5:
                break;
            case 6:
                MoneybotChatViewEvent moneybotChatViewEvent = (MoneybotChatViewEvent) obj2;
                Function1 function1 = (Function1) obj;
                if (moneybotChatViewEvent != null) {
                    function1.invoke(moneybotChatViewEvent);
                }
                break;
            case 7:
                ((MutableState) obj).setValue(Boolean.FALSE);
                ((ManagedActivityResultLauncher) obj2).launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default());
                break;
            case 8:
                ((Function1) obj2).invoke((SlashCommandViewModel) obj);
                break;
            case 9:
                ((Function1) obj2).invoke(new MoneybotFeedbackViewEvent.OptionSelected(((MoneybotFeedbackViewModel.ReasonOption) obj).option));
                break;
            case 10:
                ((Function1) obj2).invoke(((MoneybotHomeViewModel.NextBestAction.Action) obj).event);
                break;
            case 11:
                ((Function1) obj2).invoke(((MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow) obj).rowClickEvent);
                break;
            case 12:
                MemoryTooltip memoryTooltip = (MemoryTooltip) obj2;
                Function1 function12 = (Function1) obj;
                if (memoryTooltip != null) {
                    function12.invoke(new MoneybotChatViewEvent.MemoryTooltipDismissed(memoryTooltip.messageToken));
                }
                break;
            case 13:
                Function0 function0 = (Function0) obj;
                if (((String) obj2).length() == 0) {
                    function0.invoke();
                }
                break;
            case 14:
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj2;
                MutableState mutableState2 = (MutableState) obj;
                if (realCashVibrator != null) {
                    realCashVibrator.vibrate(100L);
                }
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 15:
                ((Function1) obj2).invoke(((PromptButtonListViewModel.Button) obj).tapEvent);
                break;
            case 16:
                ((Function1) obj2).invoke(((TokenRange) obj).placeholderKey);
                break;
            case 17:
                ((Function1) obj2).invoke(new MoneybotStaticPickerViewEvent.OptionTapped(((MoneybotStaticPickerViewModel.Option) obj).value));
                break;
            case 18:
                ((Function1) obj2).invoke(((Track) obj).musicId);
                break;
            case 19:
                Timber.Forest.i("NEARBY - Stopped observing Bluetooth device state", new Object[0]);
                ((RealBleManager) obj2).activity.unregisterReceiver((zabs) obj);
                break;
            case 20:
                break;
            case 21:
                RealSearchTrackingManager realSearchTrackingManager = (RealSearchTrackingManager) obj2;
                Set set = ((TrackingAction.StartTracking) ((TrackingAction) obj)).filterToken;
                realSearchTrackingManager.getClass();
                if (set.isEmpty()) {
                    Timber.Forest.e("Filter token is empty", new Object[0]);
                } else {
                    SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(realSearchTrackingManager.observabilityManager, null, "offers_search_queryFilterNullState", Thread$State$EnumUnboxingLocalUtility.m("filterToken", CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62)), null, 8);
                    realSearchTrackingManager.nullStateSpan = startTrackingSpan$default;
                    realSearchTrackingManager.mapAndRequestSpan = startTrackingSpan$default != null ? SpanTracking.childSpanStarted$default(startTrackingSpan$default, null, "offers_search_serverRequestAndResponseMapping", null, 12) : null;
                }
                break;
            case 22:
                OffersFilterGroupSheetViewModel.FilterViewModel filterViewModel = (OffersFilterGroupSheetViewModel.FilterViewModel) obj;
                ((Function1) obj2).invoke(new OffersFilterGroupSheetViewEvent.FilterSelected(filterViewModel.token, filterViewModel.tapEventSpecs));
                break;
            case 23:
                ((Function1) obj2).invoke(new OffersFilterGroupSheetViewEvent.FilterApplied(((OffersFilterGroupSheetViewModel) obj).applyTapEventSpecs));
                break;
            case 24:
                Function1 function13 = (Function1) obj;
                TapAction tapAction = ((OffersLinkViewModel) obj2).tapAction;
                zzle zzleVar = tapAction.action;
                TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                if (tapAction$Action$UrlAction != null && (urlTapAction = tapAction$Action$UrlAction.value) != null) {
                    str = urlTapAction.action_url;
                }
                List list = tapAction.analytics_tap_events;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
                }
                if (str != null) {
                    function13.invoke(new OffersDetailsSheetViewEvent.LearnMoreClicked(str, arrayList));
                }
                break;
            case 25:
                ((Function1) obj2).invoke(((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton) obj).event);
                break;
            case 26:
                ((Function1) obj2).invoke(((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard) ((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton) obj)).primaryButton.event);
                break;
            case 27:
                ((Function1) obj2).invoke(((OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection) obj).linkEvent);
                break;
            case 28:
                OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile = (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) obj;
                ((Function1) obj2).invoke(new OffersHomeViewEvent.OffersHeroTileClicked(currentTile.tapActionUrl, currentTile.itemToken, currentTile.tapEventSpecs));
                break;
            default:
                PillViewModel pillViewModel = (PillViewModel) obj;
                ((Function1) obj2).invoke(new OffersHomeViewEvent.OffersHomePillClicked(pillViewModel.tapActionUrl, pillViewModel.tapEventSpecs));
                break;
        }
        return Unit.INSTANCE;
    }
}
