package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$HoloBase extends LayoutCompat_androidKt {
    public final CardTheme.Identifier id;

    public CardAssetManager$AssetKey$HoloBase(CardTheme.Identifier identifier) {
        identifier.getClass();
        this.id = identifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardAssetManager$AssetKey$HoloBase) && this.id == ((CardAssetManager$AssetKey$HoloBase) obj).id;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return "HoloBase(id=" + this.id + ")";
    }
}
