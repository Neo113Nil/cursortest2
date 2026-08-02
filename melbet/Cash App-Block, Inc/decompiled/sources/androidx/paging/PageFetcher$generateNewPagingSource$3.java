package androidx.paging;

import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.core.view.ContentInfoCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.protocol.host.arcade.ActivityItemProtocolNode;
import app.cash.arcade.protocol.host.arcade.BottomSheetProtocolNode$OnBack;
import app.cash.arcade.protocol.host.arcade.BottomSheetProtocolNode$OnClickOutside;
import app.cash.arcade.protocol.host.arcade.BottomSheetProtocolNode$OnUserHidden;
import app.cash.arcade.protocol.host.arcade.ButtonProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.CardUpsellProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.ClickableCellProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.IconButtonProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.InputFieldProtocolNode$OnLeadingIconClick;
import app.cash.arcade.protocol.host.arcade.InputFieldProtocolNode$OnTrailingIconClick;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnBackClicked;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnCloseClicked;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnHelpClicked;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerProtocolNode$OnPrimaryAmountToggled;
import app.cash.arcade.protocol.host.arcade.LegacyDialogProtocolNode$CancelActionOnClick;
import app.cash.arcade.protocol.host.arcade.LegacyDialogProtocolNode$ConfirmActionOnClick;
import app.cash.arcade.protocol.host.arcade.LegacyDialogProtocolNode$OnBack;
import app.cash.arcade.protocol.host.arcade.LegacyDialogProtocolNode$OnClickOutside;
import app.cash.arcade.protocol.host.arcade.PullToRefreshProtocolNode$OnRefresh;
import app.cash.arcade.protocol.host.arcade.QrCodeScannerProtocolNode$OnButtonClick;
import app.cash.arcade.protocol.host.arcade.ReactionDialogAnchorProtocolNode$OnDismiss;
import app.cash.arcade.protocol.host.arcade.RoundedRectProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.StackedAvatarProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.TimelineItemProtocolNode$OnClick;
import app.cash.arcade.protocol.host.arcade.TitleBarCoreProtocolNode$EndPrimaryActionCallback;
import app.cash.arcade.protocol.host.arcade.TitleBarCoreProtocolNode$EndSecondaryActionCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class PageFetcher$generateNewPagingSource$3 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageFetcher$generateNewPagingSource$3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                ((PageFetcher) this.receiver).loadRequests.send(new PageFetcher$LoadRequest$Refresh(false, PageFetcher$RefreshType$All.INSTANCE$1));
                return Unit.INSTANCE;
            case 1:
                return ((TextContextMenuDataProvider) this.receiver).data();
            case 2:
                ((PageFetcher) this.receiver).loadRequests.send(new PageFetcher$LoadRequest$Refresh(false, PageFetcher$RefreshType$All.INSTANCE$1));
                return Unit.INSTANCE;
            case 3:
                ActivityItemProtocolNode.OnClick onClick = (ActivityItemProtocolNode.OnClick) this.receiver;
                onClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(onClick.id, 1, null, null, null));
                return Unit.INSTANCE;
            case 4:
                ((BottomSheetProtocolNode$OnBack) this.receiver).getClass();
                new ContentInfoCompat.CompatImpl(0, 3, null, null, null);
                throw null;
            case 5:
                BottomSheetProtocolNode$OnClickOutside bottomSheetProtocolNode$OnClickOutside = (BottomSheetProtocolNode$OnClickOutside) this.receiver;
                bottomSheetProtocolNode$OnClickOutside.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(bottomSheetProtocolNode$OnClickOutside.id, 2, null, null, null));
                return Unit.INSTANCE;
            case 6:
                BottomSheetProtocolNode$OnUserHidden bottomSheetProtocolNode$OnUserHidden = (BottomSheetProtocolNode$OnUserHidden) this.receiver;
                bottomSheetProtocolNode$OnUserHidden.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(bottomSheetProtocolNode$OnUserHidden.id, 1, null, null, null));
                return Unit.INSTANCE;
            case 7:
                ButtonProtocolNode$OnClick buttonProtocolNode$OnClick = (ButtonProtocolNode$OnClick) this.receiver;
                buttonProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(buttonProtocolNode$OnClick.id, 4, null, null, null));
                return Unit.INSTANCE;
            case 8:
                CardUpsellProtocolNode$OnClick cardUpsellProtocolNode$OnClick = (CardUpsellProtocolNode$OnClick) this.receiver;
                cardUpsellProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(cardUpsellProtocolNode$OnClick.id, 4, null, null, null));
                return Unit.INSTANCE;
            case 9:
                ClickableCellProtocolNode$OnClick clickableCellProtocolNode$OnClick = (ClickableCellProtocolNode$OnClick) this.receiver;
                clickableCellProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(clickableCellProtocolNode$OnClick.id, 1, null, null, null));
                return Unit.INSTANCE;
            case 10:
                IconButtonProtocolNode$OnClick iconButtonProtocolNode$OnClick = (IconButtonProtocolNode$OnClick) this.receiver;
                iconButtonProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(iconButtonProtocolNode$OnClick.id, 3, null, null, null));
                return Unit.INSTANCE;
            case 11:
                throw Boxes$$ExternalSyntheticOutline1.m(this.receiver);
            case 12:
                InputFieldProtocolNode$OnLeadingIconClick inputFieldProtocolNode$OnLeadingIconClick = (InputFieldProtocolNode$OnLeadingIconClick) this.receiver;
                inputFieldProtocolNode$OnLeadingIconClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(inputFieldProtocolNode$OnLeadingIconClick.id, 9, null, null, null));
                return Unit.INSTANCE;
            case 13:
                InputFieldProtocolNode$OnTrailingIconClick inputFieldProtocolNode$OnTrailingIconClick = (InputFieldProtocolNode$OnTrailingIconClick) this.receiver;
                inputFieldProtocolNode$OnTrailingIconClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(inputFieldProtocolNode$OnTrailingIconClick.id, 12, null, null, null));
                return Unit.INSTANCE;
            case 14:
                LegacyAmountPickerProtocolNode$OnBackClicked legacyAmountPickerProtocolNode$OnBackClicked = (LegacyAmountPickerProtocolNode$OnBackClicked) this.receiver;
                legacyAmountPickerProtocolNode$OnBackClicked.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyAmountPickerProtocolNode$OnBackClicked.id, 18, null, null, null));
                return Unit.INSTANCE;
            case 15:
                LegacyAmountPickerProtocolNode$OnCloseClicked legacyAmountPickerProtocolNode$OnCloseClicked = (LegacyAmountPickerProtocolNode$OnCloseClicked) this.receiver;
                legacyAmountPickerProtocolNode$OnCloseClicked.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyAmountPickerProtocolNode$OnCloseClicked.id, 5, null, null, null));
                return Unit.INSTANCE;
            case 16:
                LegacyAmountPickerProtocolNode$OnHelpClicked legacyAmountPickerProtocolNode$OnHelpClicked = (LegacyAmountPickerProtocolNode$OnHelpClicked) this.receiver;
                legacyAmountPickerProtocolNode$OnHelpClicked.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyAmountPickerProtocolNode$OnHelpClicked.id, 6, null, null, null));
                return Unit.INSTANCE;
            case 17:
                LegacyAmountPickerProtocolNode$OnPrimaryAmountToggled legacyAmountPickerProtocolNode$OnPrimaryAmountToggled = (LegacyAmountPickerProtocolNode$OnPrimaryAmountToggled) this.receiver;
                legacyAmountPickerProtocolNode$OnPrimaryAmountToggled.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyAmountPickerProtocolNode$OnPrimaryAmountToggled.id, 8, null, null, null));
                return Unit.INSTANCE;
            case 18:
                LegacyDialogProtocolNode$CancelActionOnClick legacyDialogProtocolNode$CancelActionOnClick = (LegacyDialogProtocolNode$CancelActionOnClick) this.receiver;
                legacyDialogProtocolNode$CancelActionOnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyDialogProtocolNode$CancelActionOnClick.id, 9, null, null, null));
                return Unit.INSTANCE;
            case 19:
                LegacyDialogProtocolNode$ConfirmActionOnClick legacyDialogProtocolNode$ConfirmActionOnClick = (LegacyDialogProtocolNode$ConfirmActionOnClick) this.receiver;
                legacyDialogProtocolNode$ConfirmActionOnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyDialogProtocolNode$ConfirmActionOnClick.id, 7, null, null, null));
                return Unit.INSTANCE;
            case 20:
                ((LegacyDialogProtocolNode$OnBack) this.receiver).getClass();
                new ContentInfoCompat.CompatImpl(0, 2, null, null, null);
                throw null;
            case 21:
                LegacyDialogProtocolNode$OnClickOutside legacyDialogProtocolNode$OnClickOutside = (LegacyDialogProtocolNode$OnClickOutside) this.receiver;
                legacyDialogProtocolNode$OnClickOutside.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(legacyDialogProtocolNode$OnClickOutside.id, 1, null, null, null));
                return Unit.INSTANCE;
            case 22:
                PullToRefreshProtocolNode$OnRefresh pullToRefreshProtocolNode$OnRefresh = (PullToRefreshProtocolNode$OnRefresh) this.receiver;
                pullToRefreshProtocolNode$OnRefresh.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(pullToRefreshProtocolNode$OnRefresh.id, 3, null, null, null));
                return Unit.INSTANCE;
            case 23:
                QrCodeScannerProtocolNode$OnButtonClick qrCodeScannerProtocolNode$OnButtonClick = (QrCodeScannerProtocolNode$OnButtonClick) this.receiver;
                qrCodeScannerProtocolNode$OnButtonClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(qrCodeScannerProtocolNode$OnButtonClick.id, 3, null, null, null));
                return Unit.INSTANCE;
            case 24:
                ReactionDialogAnchorProtocolNode$OnDismiss reactionDialogAnchorProtocolNode$OnDismiss = (ReactionDialogAnchorProtocolNode$OnDismiss) this.receiver;
                reactionDialogAnchorProtocolNode$OnDismiss.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(reactionDialogAnchorProtocolNode$OnDismiss.id, 4, null, null, null));
                return Unit.INSTANCE;
            case 25:
                RoundedRectProtocolNode$OnClick roundedRectProtocolNode$OnClick = (RoundedRectProtocolNode$OnClick) this.receiver;
                roundedRectProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(roundedRectProtocolNode$OnClick.id, 6, null, null, null));
                return Unit.INSTANCE;
            case 26:
                StackedAvatarProtocolNode$OnClick stackedAvatarProtocolNode$OnClick = (StackedAvatarProtocolNode$OnClick) this.receiver;
                stackedAvatarProtocolNode$OnClick.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(stackedAvatarProtocolNode$OnClick.id, 3, null, null, null));
                return Unit.INSTANCE;
            case 27:
                ((TimelineItemProtocolNode$OnClick) this.receiver).getClass();
                new ContentInfoCompat.CompatImpl(0, 3, null, null, null);
                throw null;
            case 28:
                TitleBarCoreProtocolNode$EndPrimaryActionCallback titleBarCoreProtocolNode$EndPrimaryActionCallback = (TitleBarCoreProtocolNode$EndPrimaryActionCallback) this.receiver;
                titleBarCoreProtocolNode$EndPrimaryActionCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarCoreProtocolNode$EndPrimaryActionCallback.id, 5, null, null, null));
                return Unit.INSTANCE;
            default:
                TitleBarCoreProtocolNode$EndSecondaryActionCallback titleBarCoreProtocolNode$EndSecondaryActionCallback = (TitleBarCoreProtocolNode$EndSecondaryActionCallback) this.receiver;
                titleBarCoreProtocolNode$EndSecondaryActionCallback.eventSink.sendEvent(new ContentInfoCompat.CompatImpl(titleBarCoreProtocolNode$EndSecondaryActionCallback.id, 7, null, null, null));
                return Unit.INSTANCE;
        }
    }
}
