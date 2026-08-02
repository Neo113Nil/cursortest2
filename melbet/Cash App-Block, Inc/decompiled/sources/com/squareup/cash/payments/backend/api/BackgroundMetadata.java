package com.squareup.cash.payments.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BackgroundMetadata {
    public final String accessibilityDescription;
    public final Color backgroundColor;
    public final String backgroundUrl;
    public final String carouselUrl;
    public final List effects;
    public final String id;
    public final boolean isActive;
    public final boolean isDefault;
    public final TextFormat textFormat;

    public BackgroundMetadata(String str, String str2, String str3, boolean z, Color color, boolean z2, TextFormat textFormat, List list, String str4) {
        list.getClass();
        this.id = str;
        this.backgroundUrl = str2;
        this.carouselUrl = str3;
        this.isActive = z;
        this.backgroundColor = color;
        this.isDefault = z2;
        this.textFormat = textFormat;
        this.effects = list;
        this.accessibilityDescription = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundMetadata)) {
            return false;
        }
        BackgroundMetadata backgroundMetadata = (BackgroundMetadata) obj;
        return this.id.equals(backgroundMetadata.id) && this.backgroundUrl.equals(backgroundMetadata.backgroundUrl) && this.carouselUrl.equals(backgroundMetadata.carouselUrl) && this.isActive == backgroundMetadata.isActive && this.backgroundColor.equals(backgroundMetadata.backgroundColor) && this.isDefault == backgroundMetadata.isDefault && this.textFormat.equals(backgroundMetadata.textFormat) && Intrinsics.areEqual(this.effects, backgroundMetadata.effects) && Intrinsics.areEqual(this.accessibilityDescription, backgroundMetadata.accessibilityDescription);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.textFormat.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.backgroundUrl), 31, this.carouselUrl), 31, this.isActive), 31), 31, this.isDefault)) * 31, 31, this.effects);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BackgroundMetadata(id=", this.id, ", backgroundUrl=", this.backgroundUrl, ", carouselUrl=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.carouselUrl, ", isActive=", this.isActive, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", isDefault=");
        m.append(this.isDefault);
        m.append(", textFormat=");
        m.append(this.textFormat);
        m.append(", effects=");
        m.append(this.effects);
        m.append(", accessibilityDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibilityDescription, ")");
    }
}
