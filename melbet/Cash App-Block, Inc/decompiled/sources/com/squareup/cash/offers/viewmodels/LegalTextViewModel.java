package com.squareup.cash.offers.viewmodels;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LegalTextViewModel {
    public final String text;
    public final Color textColor;

    public LegalTextViewModel(Color color, String str) {
        str.getClass();
        this.text = str;
        this.textColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalTextViewModel)) {
            return false;
        }
        LegalTextViewModel legalTextViewModel = (LegalTextViewModel) obj;
        return Intrinsics.areEqual(this.text, legalTextViewModel.text) && Intrinsics.areEqual(this.textColor, legalTextViewModel.textColor);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Color color = this.textColor;
        return hashCode + (color == null ? 0 : color.hashCode());
    }

    public final String toString() {
        return "LegalTextViewModel(text=" + this.text + ", textColor=" + this.textColor + ")";
    }
}
