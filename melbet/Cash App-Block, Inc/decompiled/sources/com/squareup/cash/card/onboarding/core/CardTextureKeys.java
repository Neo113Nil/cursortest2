package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;

/* loaded from: classes6.dex */
public final class CardTextureKeys {
    public final LayoutCompat_androidKt albedo;
    public final LayoutCompat_androidKt heatColors;
    public final LayoutCompat_androidKt holoBase;
    public final LayoutCompat_androidKt holoReflect;
    public final LayoutCompat_androidKt inkMetalHeat;
    public final LayoutCompat_androidKt normal;
    public final LayoutCompat_androidKt shimmer;
    public final LayoutCompat_androidKt snakeSkin;

    public CardTextureKeys(LayoutCompat_androidKt layoutCompat_androidKt, LayoutCompat_androidKt layoutCompat_androidKt2, LayoutCompat_androidKt layoutCompat_androidKt3, LayoutCompat_androidKt layoutCompat_androidKt4, LayoutCompat_androidKt layoutCompat_androidKt5, LayoutCompat_androidKt layoutCompat_androidKt6, LayoutCompat_androidKt layoutCompat_androidKt7, LayoutCompat_androidKt layoutCompat_androidKt8) {
        this.albedo = layoutCompat_androidKt;
        this.normal = layoutCompat_androidKt2;
        this.inkMetalHeat = layoutCompat_androidKt3;
        this.heatColors = layoutCompat_androidKt4;
        this.shimmer = layoutCompat_androidKt5;
        this.holoBase = layoutCompat_androidKt6;
        this.holoReflect = layoutCompat_androidKt7;
        this.snakeSkin = layoutCompat_androidKt8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTextureKeys)) {
            return false;
        }
        CardTextureKeys cardTextureKeys = (CardTextureKeys) obj;
        return this.albedo.equals(cardTextureKeys.albedo) && this.normal.equals(cardTextureKeys.normal) && this.inkMetalHeat.equals(cardTextureKeys.inkMetalHeat) && this.heatColors.equals(cardTextureKeys.heatColors) && this.shimmer.equals(cardTextureKeys.shimmer) && this.holoBase.equals(cardTextureKeys.holoBase) && this.holoReflect.equals(cardTextureKeys.holoReflect) && this.snakeSkin.equals(cardTextureKeys.snakeSkin);
    }

    public final int hashCode() {
        int hashCode = (this.heatColors.hashCode() + ((this.inkMetalHeat.hashCode() + ((this.normal.hashCode() + (this.albedo.hashCode() * 31)) * 31)) * 31)) * 31;
        CardAssetManager$AssetKey$Placeholder cardAssetManager$AssetKey$Placeholder = CardAssetManager$AssetKey$Placeholder.INSTANCE;
        return this.snakeSkin.hashCode() + ((cardAssetManager$AssetKey$Placeholder.hashCode() + ((this.holoReflect.hashCode() + ((this.holoBase.hashCode() + ((this.shimmer.hashCode() + ((cardAssetManager$AssetKey$Placeholder.hashCode() + hashCode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTextureKeys(albedo=");
        sb.append(this.albedo);
        sb.append(", normal=");
        sb.append(this.normal);
        sb.append(", inkMetalHeat=");
        sb.append(this.inkMetalHeat);
        sb.append(", heatColors=");
        sb.append(this.heatColors);
        sb.append(", heatMask=");
        CardAssetManager$AssetKey$Placeholder cardAssetManager$AssetKey$Placeholder = CardAssetManager$AssetKey$Placeholder.INSTANCE;
        sb.append(cardAssetManager$AssetKey$Placeholder);
        sb.append(", shimmer=");
        sb.append(this.shimmer);
        sb.append(", holoBase=");
        sb.append(this.holoBase);
        sb.append(", holoReflect=");
        sb.append(this.holoReflect);
        sb.append(", icon=");
        sb.append(cardAssetManager$AssetKey$Placeholder);
        sb.append(", snakeSkin=");
        sb.append(this.snakeSkin);
        sb.append(")");
        return sb.toString();
    }
}
