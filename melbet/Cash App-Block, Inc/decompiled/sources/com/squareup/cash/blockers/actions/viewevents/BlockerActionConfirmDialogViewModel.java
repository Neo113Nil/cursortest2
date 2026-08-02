package com.squareup.cash.blockers.actions.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BlockerActionConfirmDialogViewModel {
    public final String cancelButtonText;
    public final String confirmButtonText;
    public final String message;
    public final String title;

    public BlockerActionConfirmDialogViewModel(String str, String str2, String str3, String str4) {
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
        this.cancelButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerActionConfirmDialogViewModel)) {
            return false;
        }
        BlockerActionConfirmDialogViewModel blockerActionConfirmDialogViewModel = (BlockerActionConfirmDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, blockerActionConfirmDialogViewModel.title) && Intrinsics.areEqual(this.message, blockerActionConfirmDialogViewModel.message) && Intrinsics.areEqual(this.confirmButtonText, blockerActionConfirmDialogViewModel.confirmButtonText) && Intrinsics.areEqual(this.cancelButtonText, blockerActionConfirmDialogViewModel.cancelButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmButtonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cancelButtonText;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerActionConfirmDialogViewModel(title=", this.title, ", message=", this.message, ", confirmButtonText="), this.confirmButtonText, ", cancelButtonText=", this.cancelButtonText, ")");
    }
}
