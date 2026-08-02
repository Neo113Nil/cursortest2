package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class GenericConfirmDialogViewModel {
    public final String confirmButtonText;
    public final String message;
    public final String title;

    public GenericConfirmDialogViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericConfirmDialogViewModel)) {
            return false;
        }
        GenericConfirmDialogViewModel genericConfirmDialogViewModel = (GenericConfirmDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, genericConfirmDialogViewModel.title) && Intrinsics.areEqual(this.message, genericConfirmDialogViewModel.message) && Intrinsics.areEqual(this.confirmButtonText, genericConfirmDialogViewModel.confirmButtonText);
    }

    public final int hashCode() {
        return this.confirmButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericConfirmDialogViewModel(title=", this.title, ", message=", this.message, ", confirmButtonText="), this.confirmButtonText, ")");
    }
}
