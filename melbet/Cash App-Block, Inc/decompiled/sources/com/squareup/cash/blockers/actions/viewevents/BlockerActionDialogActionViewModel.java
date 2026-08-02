package com.squareup.cash.blockers.actions.viewevents;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BlockerActionDialogActionViewModel {
    public final String message;
    public final BlockerAction.DialogAction.Button.Style primaryButtonStyle;
    public final String primaryButtonText;
    public final BlockerAction.DialogAction.Button.Style secondaryButtonStyle;
    public final String secondaryButtonText;
    public final String title;

    public BlockerActionDialogActionViewModel(String str, String str2, String str3, BlockerAction.DialogAction.Button.Style style, String str4, BlockerAction.DialogAction.Button.Style style2) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.primaryButtonText = str3;
        this.primaryButtonStyle = style;
        this.secondaryButtonText = str4;
        this.secondaryButtonStyle = style2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerActionDialogActionViewModel)) {
            return false;
        }
        BlockerActionDialogActionViewModel blockerActionDialogActionViewModel = (BlockerActionDialogActionViewModel) obj;
        return Intrinsics.areEqual(this.title, blockerActionDialogActionViewModel.title) && Intrinsics.areEqual(this.message, blockerActionDialogActionViewModel.message) && Intrinsics.areEqual(this.primaryButtonText, blockerActionDialogActionViewModel.primaryButtonText) && this.primaryButtonStyle == blockerActionDialogActionViewModel.primaryButtonStyle && Intrinsics.areEqual(this.secondaryButtonText, blockerActionDialogActionViewModel.secondaryButtonText) && this.secondaryButtonStyle == blockerActionDialogActionViewModel.secondaryButtonStyle;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.primaryButtonText);
        BlockerAction.DialogAction.Button.Style style = this.primaryButtonStyle;
        int hashCode = (m + (style == null ? 0 : style.hashCode())) * 31;
        String str = this.secondaryButtonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BlockerAction.DialogAction.Button.Style style2 = this.secondaryButtonStyle;
        return hashCode2 + (style2 != null ? style2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerActionDialogActionViewModel(title=", this.title, ", message=", this.message, ", primaryButtonText=");
        m.append(this.primaryButtonText);
        m.append(", primaryButtonStyle=");
        m.append(this.primaryButtonStyle);
        m.append(", secondaryButtonText=");
        m.append(this.secondaryButtonText);
        m.append(", secondaryButtonStyle=");
        m.append(this.secondaryButtonStyle);
        m.append(")");
        return m.toString();
    }
}
