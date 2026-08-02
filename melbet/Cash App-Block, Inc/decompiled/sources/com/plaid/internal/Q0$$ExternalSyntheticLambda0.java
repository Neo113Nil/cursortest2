package com.plaid.internal;

import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlViewLayoutManager;
import androidx.navigation.fragment.FragmentKt;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.google.android.material.button.MaterialButtonGroup;
import com.google.android.material.textfield.ClearTextEndIconDelegate;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.textfield.PasswordToggleEndIconDelegate;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.knotapi.knot.webview.PopupChromeClient;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$Failover$NavigateRetryAuto;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$MrzManualEntry$NavigateSkip;
import com.miteksystems.misnap.workflow.fragment.NavigationAction$NfcSelection$NavigateNfc;
import com.miteksystems.misnap.workflow.fragment.NavigationError;
import com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment;
import com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment;
import com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.arcade.treehouse.ClickableCellBinding;
import com.squareup.cash.arcade.treehouse.LegacyDialogBinding;
import com.squareup.cash.blockers.actions.viewevents.Dismiss;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionListSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyMagicViewEvent$Retry;
import com.squareup.cash.blockers.views.BlockerContainerView;
import com.squareup.cash.blockers.views.FileBlockerView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.InstrumentSelectionDetailsSheet;
import com.squareup.cash.blockers.views.InstrumentSelectionListSheet;
import com.squareup.cash.blockers.views.InstrumentSelectionView;
import com.squareup.cash.blockers.views.VerifyMagicView;
import com.squareup.cash.buynowpaylater.viewmodels.OrderDetailsOverFlowSheetViewEvent;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsOverflowSheetView;
import com.squareup.cash.ui.widget.AmountSelector;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q0$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Q0$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r9 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        r8 = r8.eventReceiver;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r8 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        r8.sendEvent(new com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e1, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e5, code lost:
    
        return;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        AmountSelectorWidgetModel.Item item;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Q0.a((Q0) obj, view);
                return;
            case 1:
                ((PlayerControlView) obj).updateIsFullscreen(!r8.isFullscreen);
                return;
            case 2:
                PlayerControlView playerControlView = ((PlayerControlView.TextTrackSelectionAdapter) obj).this$0;
                Player player = playerControlView.player;
                if (player == null || !((ExoPlayerImpl) player).isCommandAvailable(29)) {
                    return;
                }
                TrackSelectionParameters trackSelectionParameters = ((ExoPlayerImpl) playerControlView.player).getTrackSelectionParameters();
                Player player2 = playerControlView.player;
                DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) trackSelectionParameters;
                parameters.getClass();
                DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
                builder.clearOverridesOfType(1);
                builder.setTrackTypeDisabled(1, false);
                ((ExoPlayerImpl) player2).setTrackSelectionParameters(builder.build());
                playerControlView.settingsAdapter.subTexts[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
                playerControlView.settingsWindow.dismiss();
                return;
            case 3:
                PlayerControlView.SettingViewHolder settingViewHolder = (PlayerControlView.SettingViewHolder) obj;
                PlayerControlView playerControlView2 = PlayerControlView.this;
                int bindingAdapterPosition = settingViewHolder.getBindingAdapterPosition();
                View view2 = playerControlView2.settingsButton;
                if (bindingAdapterPosition == 0) {
                    PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = playerControlView2.playbackSpeedAdapter;
                    view2.getClass();
                    playerControlView2.displaySettingsWindow(playbackSpeedAdapter, view2);
                    return;
                } else {
                    if (bindingAdapterPosition != 1) {
                        playerControlView2.settingsWindow.dismiss();
                        return;
                    }
                    PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter = playerControlView2.audioTrackSelectionAdapter;
                    view2.getClass();
                    playerControlView2.displaySettingsWindow(textTrackSelectionAdapter, view2);
                    return;
                }
            case 4:
                PlayerControlView playerControlView3 = ((PlayerControlView.TextTrackSelectionAdapter) obj).this$0;
                Player player3 = playerControlView3.player;
                if (player3 == null || !((ExoPlayerImpl) player3).isCommandAvailable(29)) {
                    return;
                }
                TrackSelectionParameters trackSelectionParameters2 = ((ExoPlayerImpl) playerControlView3.player).getTrackSelectionParameters();
                Player player4 = playerControlView3.player;
                DefaultTrackSelector.Parameters parameters2 = (DefaultTrackSelector.Parameters) trackSelectionParameters2;
                parameters2.getClass();
                DefaultTrackSelector.Parameters.Builder builder2 = new DefaultTrackSelector.Parameters.Builder(parameters2);
                builder2.clearOverridesOfType(3);
                builder2.setIgnoredTextSelectionFlags();
                builder2.setPreferredTextLanguage();
                builder2.setPreferredTextRoleFlags();
                ((ExoPlayerImpl) player4).setTrackSelectionParameters(builder2.build());
                playerControlView3.settingsWindow.dismiss();
                return;
            case 5:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager.resetHideCallbacks();
                if (view.getId() == R.id.exo_overflow_show) {
                    playerControlViewLayoutManager.overflowShowAnimator.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        playerControlViewLayoutManager.overflowHideAnimator.start();
                        return;
                    }
                    return;
                }
            case 6:
                DefaultInAppMessageViewWrapper.createClickListener$lambda$0((DefaultInAppMessageViewWrapper) obj, view);
                return;
            case 7:
                DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$1((DefaultInAppMessageModalViewFactory) obj, view);
                return;
            case 8:
                InAppMessageModalView.resetMessageMargins$lambda$0((InAppMessageModalView) obj, view);
                return;
            case 9:
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) obj;
                Object obj2 = MaterialButtonGroup.OVERFLOW_BUTTON_TAG;
                materialButtonGroup.updateOverflowMenuItemsState();
                MenuPopupHelper menuPopupHelper = (MenuPopupHelper) materialButtonGroup.popupMenu.this$0;
                if (menuPopupHelper.isShowing()) {
                    return;
                }
                if (menuPopupHelper.mAnchorView != null) {
                    menuPopupHelper.showPopup(0, 0, false, false);
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("MenuPopupHelper cannot be used without an anchor");
                    return;
                }
            case 10:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) obj;
                EditText editText = clearTextEndIconDelegate.editText;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    clearTextEndIconDelegate.editText.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                clearTextEndIconDelegate.refreshIconState();
                return;
            case 11:
                ((DropdownMenuEndIconDelegate) obj).showHideDropdown();
                return;
            case 12:
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = (PasswordToggleEndIconDelegate) obj;
                EditText editText2 = passwordToggleEndIconDelegate.editText;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = passwordToggleEndIconDelegate.editText;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    i2 = 1;
                }
                EditText editText4 = passwordToggleEndIconDelegate.editText;
                if (i2 != 0) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    passwordToggleEndIconDelegate.editText.setSelection(selectionEnd);
                }
                passwordToggleEndIconDelegate.refreshIconState();
                return;
            case 13:
                ((PopupChromeClient) obj).lambda$onCreateWindow$1(view);
                return;
            case 14:
                FailoverFragment failoverFragment = (FailoverFragment) obj;
                zzc zzcVar = FailoverFragment.Companion;
                try {
                    FragmentKt.findNavController(failoverFragment).navigate(R.id.navigateAutoSession);
                    return;
                } catch (Exception e) {
                    Log.e("FailoverScreen", "Nav Graph Error", e);
                    failoverFragment.b$2().postNavigationError$workflow_release(new NavigationError(e, FailoverFragment.class, failoverFragment.hashCode(), NavigationAction$Failover$NavigateRetryAuto.INSTANCE));
                    return;
                }
            case 15:
                NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = (NfcMrz1LineManualEntryFragment) obj;
                NfcMrz1LineManualEntryFragment.Companion companion = NfcMrz1LineManualEntryFragment.Companion;
                try {
                    FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).navigate(R.id.navigateSkip);
                } catch (Exception e2) {
                    Log.e("Mrz1LineManualEntry", "Nav Graph Error", e2);
                    nfcMrz1LineManualEntryFragment.b$3().postNavigationError$workflow_release(new NavigationError(e2, NfcMrz1LineManualEntryFragment.class, nfcMrz1LineManualEntryFragment.hashCode(), NavigationAction$MrzManualEntry$NavigateSkip.INSTANCE));
                }
                MiSnapWorkflowViewModel b$3 = nfcMrz1LineManualEntryFragment.b$3();
                Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
                requireContext.getClass();
                b$3.postError$workflow_release(requireContext, MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
                return;
            case 16:
                NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = (NfcMrzDataManualEntryFragment) obj;
                NfcMrzDataManualEntryFragment.Companion companion2 = NfcMrzDataManualEntryFragment.Companion;
                try {
                    FragmentKt.findNavController(nfcMrzDataManualEntryFragment).navigate(R.id.navigateSkip);
                } catch (Exception e3) {
                    Log.e("MrzDataManualEntry", "Nav Graph Error", e3);
                    nfcMrzDataManualEntryFragment.b$4().postNavigationError$workflow_release(new NavigationError(e3, NfcMrzDataManualEntryFragment.class, nfcMrzDataManualEntryFragment.hashCode(), NavigationAction$MrzManualEntry$NavigateSkip.INSTANCE));
                }
                MiSnapWorkflowViewModel b$4 = nfcMrzDataManualEntryFragment.b$4();
                Context requireContext2 = nfcMrzDataManualEntryFragment.requireContext();
                requireContext2.getClass();
                b$4.postError$workflow_release(requireContext2, MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
                return;
            case 17:
                NfcSelectionFragment nfcSelectionFragment = (NfcSelectionFragment) obj;
                zzd zzdVar = NfcSelectionFragment.Companion;
                try {
                    FragmentKt.findNavController(nfcSelectionFragment).navigate(R.id.navigateSkip);
                } catch (Exception e4) {
                    Log.e("NfcSelectionFragment", "Nav Graph Error", e4);
                    nfcSelectionFragment.b$5().postNavigationError$workflow_release(new NavigationError(e4, NfcSelectionFragment.class, nfcSelectionFragment.hashCode(), NavigationAction$NfcSelection$NavigateNfc.INSTANCE$3));
                }
                MiSnapWorkflowViewModel b$5 = nfcSelectionFragment.b$5();
                Context requireContext3 = nfcSelectionFragment.requireContext();
                requireContext3.getClass();
                b$5.postError$workflow_release(requireContext3, MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
                return;
            case 18:
                int i3 = TorchView.$r8$clinit;
                MutableLiveData mutableLiveData = ((TorchView) obj).b;
                Boolean valueOf = Boolean.valueOf(!r8.h);
                if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                    mutableLiveData.setValue(valueOf);
                    return;
                } else {
                    mutableLiveData.postValue(valueOf);
                    return;
                }
            case 19:
                AmountPickerCondensedView amountPickerCondensedView = (AmountPickerCondensedView) obj;
                AmountSelector amountSelector = amountPickerCondensedView.amountSelector;
                amountSelector.getClass();
                Iterator it = new ViewGroupKt$children$1(amountSelector).iterator();
                while (true) {
                    ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                    if (!viewGroupKt$iterator$1.hasNext()) {
                        item = null;
                        break;
                    } else {
                        Object next = viewGroupKt$iterator$1.next();
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        View view3 = (View) next;
                        if (view3.getVisibility() == 0 && view3.isSelected()) {
                            AmountSelectorWidgetModel amountSelectorWidgetModel = amountSelector.model;
                            if (amountSelectorWidgetModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("model");
                                throw null;
                            }
                            item = (AmountSelectorWidgetModel.Item) amountSelectorWidgetModel.items.get(i2);
                            break;
                        } else {
                            i2 = i4;
                        }
                    }
                }
                break;
            case 20:
                int i5 = ClickableCellBinding.$r8$clinit;
                ((PageFetcher$generateNewPagingSource$3) obj).invoke();
                return;
            case 21:
                ((PageFetcher$generateNewPagingSource$3) obj).invoke();
                return;
            case 22:
                ((LegacyDialogBinding) obj).onClickOutside.invoke();
                return;
            case 23:
                Ui.EventReceiver eventReceiver = ((BlockerContainerView) obj).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(Dismiss.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 24:
                ((FileBlockerView$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 25:
                Ui.EventReceiver eventReceiver2 = ((InstrumentSelectionDetailsSheet) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(InstrumentSelectionDetailsSheetViewEvent.Close.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 26:
                Ui.EventReceiver eventReceiver3 = ((InstrumentSelectionListSheet) obj).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(InstrumentSelectionListSheetViewEvent.Close.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 27:
                Ui.EventReceiver eventReceiver4 = ((InstrumentSelectionView) obj).eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(InstrumentSelectionViewEvent.Close.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 28:
                int i6 = VerifyMagicView.$r8$clinit;
                ((Ui.EventReceiver) obj).sendEvent(VerifyMagicViewEvent$Retry.INSTANCE);
                return;
            default:
                Ui.EventReceiver eventReceiver5 = ((AfterPayOrderDetailsOverflowSheetView) obj).eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(OrderDetailsOverFlowSheetViewEvent.OverflowCloseButtonClicked.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
