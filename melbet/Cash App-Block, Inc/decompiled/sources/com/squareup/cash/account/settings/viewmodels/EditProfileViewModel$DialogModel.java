package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class EditProfileViewModel$DialogModel {
    public final String message;
    public final String positiveButtonText;
    public final String title;

    public EditProfileViewModel$DialogModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileViewModel$DialogModel)) {
            return false;
        }
        EditProfileViewModel$DialogModel editProfileViewModel$DialogModel = (EditProfileViewModel$DialogModel) obj;
        return Intrinsics.areEqual(this.title, editProfileViewModel$DialogModel.title) && Intrinsics.areEqual(this.message, editProfileViewModel$DialogModel.message) && Intrinsics.areEqual(this.positiveButtonText, editProfileViewModel$DialogModel.positiveButtonText);
    }

    public final int hashCode() {
        return this.positiveButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DialogModel(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ")");
    }
}
