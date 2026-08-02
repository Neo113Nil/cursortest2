package com.squareup.cash.payments.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ToolbarViewModel {
    public final String actionText;
    public final boolean isActionEnabled;
    public final boolean isInstrumentSelectionOpen;
    public final String title;

    public ToolbarViewModel(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.title = str;
        this.isInstrumentSelectionOpen = z;
        this.actionText = str2;
        this.isActionEnabled = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarViewModel)) {
            return false;
        }
        ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj;
        return Intrinsics.areEqual(this.title, toolbarViewModel.title) && this.isInstrumentSelectionOpen == toolbarViewModel.isInstrumentSelectionOpen && Intrinsics.areEqual(this.actionText, toolbarViewModel.actionText) && this.isActionEnabled == toolbarViewModel.isActionEnabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.isInstrumentSelectionOpen);
        String str = this.actionText;
        return Boolean.hashCode(this.isActionEnabled) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("ToolbarViewModel(title=", this.title, ", isInstrumentSelectionOpen=", ", actionText=", this.isInstrumentSelectionOpen), this.actionText, ", isActionEnabled=", this.isActionEnabled, ")");
    }
}
