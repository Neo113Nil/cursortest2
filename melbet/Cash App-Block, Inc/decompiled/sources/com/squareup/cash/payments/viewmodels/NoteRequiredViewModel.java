package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NoteRequiredViewModel {
    public final String body;
    public final String positiveButtonText;
    public final String title;

    public NoteRequiredViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.body = str2;
        this.positiveButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteRequiredViewModel)) {
            return false;
        }
        NoteRequiredViewModel noteRequiredViewModel = (NoteRequiredViewModel) obj;
        return Intrinsics.areEqual(this.title, noteRequiredViewModel.title) && Intrinsics.areEqual(this.body, noteRequiredViewModel.body) && Intrinsics.areEqual(this.positiveButtonText, noteRequiredViewModel.positiveButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.positiveButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.body);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoteRequiredViewModel(title=", this.title, ", body=", this.body, ", positiveButtonText="), this.positiveButtonText, ")");
    }
}
