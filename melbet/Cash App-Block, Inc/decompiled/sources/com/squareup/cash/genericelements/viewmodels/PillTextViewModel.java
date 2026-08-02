package com.squareup.cash.genericelements.viewmodels;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PillTextViewModel extends GenericBaseViewModel {
    public final Alignment alignment;
    public final Color backgroundColor;
    public final String text;
    public final Color textColor;

    public PillTextViewModel(Color color, Color color2, String str, Alignment alignment) {
        str.getClass();
        this.backgroundColor = color;
        this.textColor = color2;
        this.text = str;
        this.alignment = alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PillTextViewModel)) {
            return false;
        }
        PillTextViewModel pillTextViewModel = (PillTextViewModel) obj;
        return Intrinsics.areEqual(this.backgroundColor, pillTextViewModel.backgroundColor) && Intrinsics.areEqual(this.textColor, pillTextViewModel.textColor) && Intrinsics.areEqual(this.text, pillTextViewModel.text) && this.alignment == pillTextViewModel.alignment;
    }

    @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int hashCode() {
        Color color = this.backgroundColor;
        int hashCode = (color == null ? 0 : color.hashCode()) * 31;
        Color color2 = this.textColor;
        return this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (color2 != null ? color2.hashCode() : 0)) * 31, 31, this.text);
    }

    public final String toString() {
        return "PillTextViewModel(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", text=" + this.text + ", alignment=" + this.alignment + ")";
    }
}
