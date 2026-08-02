package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TextCardViewModel {
    public final int gradientIndex;
    public final String text;

    public TextCardViewModel(String str, int i) {
        str.getClass();
        this.text = str;
        this.gradientIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextCardViewModel)) {
            return false;
        }
        TextCardViewModel textCardViewModel = (TextCardViewModel) obj;
        return Intrinsics.areEqual(this.text, textCardViewModel.text) && this.gradientIndex == textCardViewModel.gradientIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.gradientIndex) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("TextCardViewModel(text=", this.gradientIndex, this.text, ", gradientIndex=", ")");
    }
}
