package com.squareup.cash.card.onboarding.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$ContouredText extends LayoutCompat_androidKt {
    public final int color;
    public final String text;

    public CardAssetManager$AssetKey$ContouredText(String str, int i) {
        str.getClass();
        this.text = str;
        this.color = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAssetManager$AssetKey$ContouredText)) {
            return false;
        }
        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = (CardAssetManager$AssetKey$ContouredText) obj;
        return Intrinsics.areEqual(this.text, cardAssetManager$AssetKey$ContouredText.text) && this.color == cardAssetManager$AssetKey$ContouredText.color;
    }

    public final int hashCode() {
        return Integer.hashCode(this.color) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("ContouredText(text=", this.color, this.text, ", color=", ")");
    }
}
