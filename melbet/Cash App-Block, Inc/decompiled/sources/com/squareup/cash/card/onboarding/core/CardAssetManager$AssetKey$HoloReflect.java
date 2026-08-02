package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$HoloReflect extends LayoutCompat_androidKt {
    public final CardTheme.Identifier id;

    public CardAssetManager$AssetKey$HoloReflect(CardTheme.Identifier identifier) {
        identifier.getClass();
        this.id = identifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardAssetManager$AssetKey$HoloReflect) && this.id == ((CardAssetManager$AssetKey$HoloReflect) obj).id;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return "HoloReflect(id=" + this.id + ")";
    }
}
