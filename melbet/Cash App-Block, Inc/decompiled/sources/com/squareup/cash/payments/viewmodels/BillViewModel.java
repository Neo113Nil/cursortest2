package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BillViewModel {
    public final boolean isCompleted;
    public final String text;
    public final int textColor;

    public BillViewModel(String str, int i, boolean z) {
        str.getClass();
        this.text = str;
        this.textColor = i;
        this.isCompleted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillViewModel)) {
            return false;
        }
        BillViewModel billViewModel = (BillViewModel) obj;
        return Intrinsics.areEqual(this.text, billViewModel.text) && this.textColor == billViewModel.textColor && this.isCompleted == billViewModel.isCompleted;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.textColor, this.text.hashCode() * 31, 31), 31, this.isCompleted);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("BillViewModel(text=", this.textColor, this.text, ", textColor=", ", isCompleted="), this.isCompleted, ", shouldAnimate=false)");
    }
}
