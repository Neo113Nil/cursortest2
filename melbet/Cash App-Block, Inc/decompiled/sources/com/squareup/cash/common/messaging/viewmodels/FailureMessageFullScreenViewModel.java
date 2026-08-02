package com.squareup.cash.common.messaging.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FailureMessageFullScreenViewModel {
    public final boolean finishAppAfterwards;
    public final String message;
    public final String title;

    public FailureMessageFullScreenViewModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.finishAppAfterwards = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureMessageFullScreenViewModel)) {
            return false;
        }
        FailureMessageFullScreenViewModel failureMessageFullScreenViewModel = (FailureMessageFullScreenViewModel) obj;
        return Intrinsics.areEqual(this.title, failureMessageFullScreenViewModel.title) && Intrinsics.areEqual(this.message, failureMessageFullScreenViewModel.message) && this.finishAppAfterwards == failureMessageFullScreenViewModel.finishAppAfterwards;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.finishAppAfterwards) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FailureMessageFullScreenViewModel(title=", this.title, ", message=", this.message, ", finishAppAfterwards="), this.finishAppAfterwards, ")");
    }
}
