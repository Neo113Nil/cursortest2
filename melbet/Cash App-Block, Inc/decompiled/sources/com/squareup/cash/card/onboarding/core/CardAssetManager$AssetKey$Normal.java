package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$Normal extends LayoutCompat_androidKt {
    public final CardTheme.BackgroundImage background;

    public CardAssetManager$AssetKey$Normal(CardTheme.BackgroundImage backgroundImage) {
        this.background = backgroundImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardAssetManager$AssetKey$Normal) && this.background == ((CardAssetManager$AssetKey$Normal) obj).background;
    }

    public final int hashCode() {
        CardTheme.BackgroundImage backgroundImage = this.background;
        if (backgroundImage == null) {
            return 0;
        }
        return backgroundImage.hashCode();
    }

    public final String toString() {
        return "Normal(background=" + this.background + ")";
    }
}
