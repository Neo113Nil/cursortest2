package com.squareup.cash.appupdate.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AppUpdateDialogViewModel {
    public final String cancelButtonTitle;
    public final String message;
    public final String title;
    public final String updateButtonTitle;

    public AppUpdateDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.updateButtonTitle = str3;
        this.cancelButtonTitle = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUpdateDialogViewModel)) {
            return false;
        }
        AppUpdateDialogViewModel appUpdateDialogViewModel = (AppUpdateDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, appUpdateDialogViewModel.title) && Intrinsics.areEqual(this.message, appUpdateDialogViewModel.message) && Intrinsics.areEqual(this.updateButtonTitle, appUpdateDialogViewModel.updateButtonTitle) && Intrinsics.areEqual(this.cancelButtonTitle, appUpdateDialogViewModel.cancelButtonTitle);
    }

    public final int hashCode() {
        return this.cancelButtonTitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.updateButtonTitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppUpdateDialogViewModel(title=", this.title, ", message=", this.message, ", updateButtonTitle="), this.updateButtonTitle, ", cancelButtonTitle=", this.cancelButtonTitle, ")");
    }
}
