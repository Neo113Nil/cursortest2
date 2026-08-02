package com.squareup.cash.p2pblocking.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AllowlistSkipDialogModel {
    public final String cancelButtonText;
    public final String confirmButtonText;
    public final String message;
    public final String title;

    public AllowlistSkipDialogModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str3, str4);
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
        this.cancelButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowlistSkipDialogModel)) {
            return false;
        }
        AllowlistSkipDialogModel allowlistSkipDialogModel = (AllowlistSkipDialogModel) obj;
        return Intrinsics.areEqual(this.title, allowlistSkipDialogModel.title) && this.message.equals(allowlistSkipDialogModel.message) && Intrinsics.areEqual(this.confirmButtonText, allowlistSkipDialogModel.confirmButtonText) && Intrinsics.areEqual(this.cancelButtonText, allowlistSkipDialogModel.cancelButtonText);
    }

    public final int hashCode() {
        return this.cancelButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.confirmButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AllowlistSkipDialogModel(title=", this.title, ", message=", this.message, ", confirmButtonText="), this.confirmButtonText, ", cancelButtonText=", this.cancelButtonText, ")");
    }
}
