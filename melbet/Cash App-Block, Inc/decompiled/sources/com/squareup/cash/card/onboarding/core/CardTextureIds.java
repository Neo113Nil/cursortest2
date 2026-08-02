package com.squareup.cash.card.onboarding.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardTextureIds {
    public final int albedo;
    public final int heatColors;
    public final int heatMask;
    public final int holoBase;
    public final int holoReflect;
    public final int icon;
    public final int inkMetalHeat;
    public final int normal;
    public final int shimmer;
    public final int snakeSkin;

    public CardTextureIds(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.albedo = i;
        this.normal = i2;
        this.inkMetalHeat = i3;
        this.heatColors = i4;
        this.heatMask = i5;
        this.shimmer = i6;
        this.holoBase = i7;
        this.holoReflect = i8;
        this.icon = i9;
        this.snakeSkin = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTextureIds)) {
            return false;
        }
        CardTextureIds cardTextureIds = (CardTextureIds) obj;
        return this.albedo == cardTextureIds.albedo && this.normal == cardTextureIds.normal && this.inkMetalHeat == cardTextureIds.inkMetalHeat && this.heatColors == cardTextureIds.heatColors && this.heatMask == cardTextureIds.heatMask && this.shimmer == cardTextureIds.shimmer && this.holoBase == cardTextureIds.holoBase && this.holoReflect == cardTextureIds.holoReflect && this.icon == cardTextureIds.icon && this.snakeSkin == cardTextureIds.snakeSkin;
    }

    public final int hashCode() {
        return Integer.hashCode(this.snakeSkin) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.holoReflect, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.holoBase, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.shimmer, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.heatMask, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.heatColors, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inkMetalHeat, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.normal, Integer.hashCode(this.albedo) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.albedo, this.normal, "CardTextureIds(albedo=", ", normal=", ", inkMetalHeat=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.inkMetalHeat, this.heatColors, ", heatColors=", ", heatMask=", m107m);
        Recorder$$ExternalSyntheticOutline1.m105m(this.heatMask, this.shimmer, ", shimmer=", ", holoBase=", m107m);
        Recorder$$ExternalSyntheticOutline1.m105m(this.holoBase, this.holoReflect, ", holoReflect=", ", icon=", m107m);
        return Recorder$$ExternalSyntheticOutline1.m(this.icon, this.snakeSkin, ", snakeSkin=", ")", m107m);
    }
}
