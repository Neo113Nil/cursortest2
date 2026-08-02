package com.squareup.cash.buynowpaylater.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TextWithIcon {
    public final InfoSheetViewModel infoSheetViewModel;
    public final TextModel textModel;

    public TextWithIcon(TextModel textModel, InfoSheetViewModel infoSheetViewModel) {
        this.textModel = textModel;
        this.infoSheetViewModel = infoSheetViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithIcon)) {
            return false;
        }
        TextWithIcon textWithIcon = (TextWithIcon) obj;
        return Intrinsics.areEqual(this.textModel, textWithIcon.textModel) && this.infoSheetViewModel.equals(textWithIcon.infoSheetViewModel);
    }

    public final int hashCode() {
        TextModel textModel = this.textModel;
        return this.infoSheetViewModel.stackableContent.hashCode() + ((textModel == null ? 0 : textModel.hashCode()) * 31);
    }

    public final String toString() {
        return "TextWithIcon(textModel=" + this.textModel + ", infoSheetViewModel=" + this.infoSheetViewModel + ")";
    }
}
