package com.squareup.cash.shopping.autofill.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DialogViewModel {
    public final String body;
    public final String primaryActionText;
    public final String secondaryActionText;
    public final String title;

    public DialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.primaryActionText = str3;
        this.secondaryActionText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogViewModel)) {
            return false;
        }
        DialogViewModel dialogViewModel = (DialogViewModel) obj;
        return Intrinsics.areEqual(this.title, dialogViewModel.title) && Intrinsics.areEqual(this.body, dialogViewModel.body) && Intrinsics.areEqual(this.primaryActionText, dialogViewModel.primaryActionText) && Intrinsics.areEqual(this.secondaryActionText, dialogViewModel.secondaryActionText);
    }

    public final int hashCode() {
        return this.secondaryActionText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.primaryActionText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DialogViewModel(title=", this.title, ", body=", this.body, ", primaryActionText="), this.primaryActionText, ", secondaryActionText=", this.secondaryActionText, ")");
    }
}
