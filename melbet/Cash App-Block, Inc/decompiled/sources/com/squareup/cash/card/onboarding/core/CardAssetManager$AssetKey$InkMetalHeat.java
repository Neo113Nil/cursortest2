package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.cash.card.onboarding.CardModelView;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$InkMetalHeat extends LayoutCompat_androidKt {
    public final CardModelView.CardBack cardBack;
    public final CardModelView.CardFront cardFront;

    public CardAssetManager$AssetKey$InkMetalHeat(CardModelView.CardFront cardFront, CardModelView.CardBack cardBack) {
        this.cardFront = cardFront;
        this.cardBack = cardBack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAssetManager$AssetKey$InkMetalHeat)) {
            return false;
        }
        CardAssetManager$AssetKey$InkMetalHeat cardAssetManager$AssetKey$InkMetalHeat = (CardAssetManager$AssetKey$InkMetalHeat) obj;
        return this.cardFront.equals(cardAssetManager$AssetKey$InkMetalHeat.cardFront) && this.cardBack.equals(cardAssetManager$AssetKey$InkMetalHeat.cardBack);
    }

    public final int hashCode() {
        return this.cardBack.hashCode() + (this.cardFront.hashCode() * 31);
    }

    public final String toString() {
        return "InkMetalHeat(cardFront=" + this.cardFront + ", cardBack=" + this.cardBack + ")";
    }
}
