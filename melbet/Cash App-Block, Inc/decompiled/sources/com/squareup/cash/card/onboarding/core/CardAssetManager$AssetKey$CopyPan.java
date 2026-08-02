package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.cash.card.onboarding.CardModelView;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$CopyPan extends LayoutCompat_androidKt {
    public final CardModelView.CardBack cardBack;

    public CardAssetManager$AssetKey$CopyPan(CardModelView.CardBack cardBack) {
        this.cardBack = cardBack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardAssetManager$AssetKey$CopyPan) && this.cardBack.equals(((CardAssetManager$AssetKey$CopyPan) obj).cardBack);
    }

    public final int hashCode() {
        return this.cardBack.hashCode();
    }

    public final String toString() {
        return "CopyPan(cardBack=" + this.cardBack + ")";
    }
}
