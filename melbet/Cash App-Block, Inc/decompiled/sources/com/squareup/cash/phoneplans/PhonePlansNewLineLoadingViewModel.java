package com.squareup.cash.phoneplans;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhonePlansNewLineLoadingViewModel {
    public final String body;
    public final boolean isCloseable;
    public final String title;

    public PhonePlansNewLineLoadingViewModel(String str, String str2, boolean z) {
        this.title = str;
        this.body = str2;
        this.isCloseable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonePlansNewLineLoadingViewModel)) {
            return false;
        }
        PhonePlansNewLineLoadingViewModel phonePlansNewLineLoadingViewModel = (PhonePlansNewLineLoadingViewModel) obj;
        return this.title.equals(phonePlansNewLineLoadingViewModel.title) && Intrinsics.areEqual(this.body, phonePlansNewLineLoadingViewModel.body) && this.isCloseable == phonePlansNewLineLoadingViewModel.isCloseable;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        return Boolean.hashCode(this.isCloseable) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhonePlansNewLineLoadingViewModel(title=", this.title, ", body=", this.body, ", isCloseable="), this.isCloseable, ")");
    }
}
