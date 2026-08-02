package com.squareup.cash.payments.viewmodels;

import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WarningDialogViewModel {
    public final Color color;
    public final String cta;
    public final String message;
    public final String title;

    public WarningDialogViewModel(String str, String str2, String str3, Color color) {
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.cta = str3;
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningDialogViewModel)) {
            return false;
        }
        WarningDialogViewModel warningDialogViewModel = (WarningDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, warningDialogViewModel.title) && Intrinsics.areEqual(this.message, warningDialogViewModel.message) && Intrinsics.areEqual(this.cta, warningDialogViewModel.cta) && Intrinsics.areEqual(this.color, warningDialogViewModel.color);
    }

    public final int hashCode() {
        String str = this.title;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.cta;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color = this.color;
        return hashCode + (color != null ? color.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WarningDialogViewModel(title=", this.title, ", message=", this.message, ", cta=");
        m.append(this.cta);
        m.append(", color=");
        m.append(this.color);
        m.append(")");
        return m.toString();
    }
}
