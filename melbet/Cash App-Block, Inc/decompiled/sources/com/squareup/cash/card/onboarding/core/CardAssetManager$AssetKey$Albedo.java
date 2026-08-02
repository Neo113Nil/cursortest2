package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardAssetManager$AssetKey$Albedo extends LayoutCompat_androidKt {
    public final int backInkColor;
    public final CardTheme.BackgroundImage background;
    public final CardModelView.CardBack cardBack;
    public final int color;
    public final CardTheme.Identifier id;
    public final int magStripeColor;
    public final int opacity;

    public CardAssetManager$AssetKey$Albedo(CardTheme.Identifier identifier, int i, CardTheme.BackgroundImage backgroundImage, int i2, int i3, CardModelView.CardBack cardBack, int i4) {
        identifier.getClass();
        this.id = identifier;
        this.color = i;
        this.background = backgroundImage;
        this.backInkColor = i2;
        this.magStripeColor = i3;
        this.cardBack = cardBack;
        this.opacity = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAssetManager$AssetKey$Albedo)) {
            return false;
        }
        CardAssetManager$AssetKey$Albedo cardAssetManager$AssetKey$Albedo = (CardAssetManager$AssetKey$Albedo) obj;
        return this.id == cardAssetManager$AssetKey$Albedo.id && this.color == cardAssetManager$AssetKey$Albedo.color && this.background == cardAssetManager$AssetKey$Albedo.background && this.backInkColor == cardAssetManager$AssetKey$Albedo.backInkColor && this.magStripeColor == cardAssetManager$AssetKey$Albedo.magStripeColor && this.cardBack.equals(cardAssetManager$AssetKey$Albedo.cardBack) && this.opacity == cardAssetManager$AssetKey$Albedo.opacity;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, this.id.hashCode() * 31, 31);
        CardTheme.BackgroundImage backgroundImage = this.background;
        return Integer.hashCode(this.opacity) + ((this.cardBack.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.magStripeColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backInkColor, (m + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Albedo(id=");
        sb.append(this.id);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", backInkColor=");
        sb.append(this.backInkColor);
        sb.append(", magStripeColor=");
        sb.append(this.magStripeColor);
        sb.append(", cardBack=");
        sb.append(this.cardBack);
        sb.append(", opacity=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.opacity, ")", sb);
    }
}
