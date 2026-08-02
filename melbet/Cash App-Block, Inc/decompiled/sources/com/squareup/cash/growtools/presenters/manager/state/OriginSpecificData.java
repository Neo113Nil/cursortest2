package com.squareup.cash.growtools.presenters.manager.state;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OriginSpecificData {
    public final boolean enabled;
    public final TargetData targetData;
    public final String title;
    public final String toggleOffDialogConfirmButton;
    public final String toggleOffDialogMessage;
    public final String toggleText;

    public interface TargetData {
        String getAltDescription();

        GrowToolsManagerViewModel.Loaded.Header.Target getTarget();
    }

    public OriginSpecificData(String str, String str2, boolean z, TargetData targetData, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.toggleText = str2;
        this.enabled = z;
        this.targetData = targetData;
        this.toggleOffDialogMessage = str3;
        this.toggleOffDialogConfirmButton = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GrowToolsManagerViewModel.Loaded buildModel(GrowToolsManagerState growToolsManagerState, UiCallbackModel uiCallbackModel, AndroidStringManager androidStringManager) {
        boolean z;
        boolean isInteractive;
        GrowToolsManagerViewModel.Loaded.Header.Target target;
        GrowToolsManagerState.ShowDialog showDialog;
        GrowToolsManagerViewModel.Loaded.Dialog dialog;
        growToolsManagerState.getClass();
        uiCallbackModel.getClass();
        boolean isInteractive2 = growToolsManagerState.isInteractive();
        boolean z2 = this.enabled;
        if (!isInteractive2) {
            if (!z2) {
                z = true;
                boolean isInteractive3 = growToolsManagerState.isInteractive();
                isInteractive = growToolsManagerState.isInteractive();
                TargetData targetData = this.targetData;
                if (isInteractive) {
                    GrowToolsManagerViewModel.Loaded.Header.Target target2 = targetData.getTarget();
                    String altDescription = targetData.getAltDescription();
                    String str = target2.name;
                    GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar growToolsAvatar = target2.avatar;
                    Icons icons = target2.badge;
                    String str2 = target2.actionButtonText;
                    str.getClass();
                    altDescription.getClass();
                    growToolsAvatar.getClass();
                    target = new GrowToolsManagerViewModel.Loaded.Header.Target(str, altDescription, growToolsAvatar, icons, str2);
                } else {
                    target = targetData.getTarget();
                }
                GrowToolsManagerViewModel.Loaded.Header header = new GrowToolsManagerViewModel.Loaded.Header(this.title, this.toggleText, z, isInteractive3, target, false);
                showDialog = (GrowToolsManagerState.ShowDialog) growToolsManagerState.showDialog$delegate.getValue();
                if (showDialog == null) {
                    int ordinal = showDialog.f1143type.ordinal();
                    if (ordinal == 0) {
                        dialog = new GrowToolsManagerViewModel.Loaded.Dialog(androidStringManager.get(R.string.grow_tools_toggle_off_dialog_title), this.toggleOffDialogMessage, this.toggleOffDialogConfirmButton, androidStringManager.get(R.string.grow_tools_toggle_off_dialog_cancel), false);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        dialog = new GrowToolsManagerViewModel.Loaded.Dialog(androidStringManager.get(R.string.grow_tools_error_dialog_title), androidStringManager.get(R.string.grow_tools_error_dialog_body), androidStringManager.get(R.string.grow_tools_ok));
                    }
                } else {
                    dialog = null;
                }
                return new GrowToolsManagerViewModel.Loaded(header, null, uiCallbackModel, dialog);
            }
            z2 = false;
        }
        z = z2;
        boolean isInteractive32 = growToolsManagerState.isInteractive();
        isInteractive = growToolsManagerState.isInteractive();
        TargetData targetData2 = this.targetData;
        if (isInteractive) {
        }
        GrowToolsManagerViewModel.Loaded.Header header2 = new GrowToolsManagerViewModel.Loaded.Header(this.title, this.toggleText, z, isInteractive32, target, false);
        showDialog = (GrowToolsManagerState.ShowDialog) growToolsManagerState.showDialog$delegate.getValue();
        if (showDialog == null) {
        }
        return new GrowToolsManagerViewModel.Loaded(header2, null, uiCallbackModel, dialog);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginSpecificData)) {
            return false;
        }
        OriginSpecificData originSpecificData = (OriginSpecificData) obj;
        return Intrinsics.areEqual(this.title, originSpecificData.title) && Intrinsics.areEqual(this.toggleText, originSpecificData.toggleText) && this.enabled == originSpecificData.enabled && this.targetData.equals(originSpecificData.targetData) && Intrinsics.areEqual(this.toggleOffDialogMessage, originSpecificData.toggleOffDialogMessage) && Intrinsics.areEqual(this.toggleOffDialogConfirmButton, originSpecificData.toggleOffDialogConfirmButton);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.targetData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.toggleText), 31, this.enabled)) * 31, 31, this.toggleOffDialogMessage), 31, this.toggleOffDialogConfirmButton);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OriginSpecificData(title=", this.title, ", toggleText=", this.toggleText, ", enabled=");
        m.append(this.enabled);
        m.append(", targetData=");
        m.append(this.targetData);
        m.append(", toggleOffDialogMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.toggleOffDialogMessage, ", toggleOffDialogConfirmButton=", this.toggleOffDialogConfirmButton, ", isAvatarClickable=false)");
    }
}
