package androidx.compose.ui.text.font;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ResourceFont {
    public final int resId;
    public final int style;
    public final FontVariation$Settings variationSettings;
    public final FontWeight weight;

    public ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation$Settings fontVariation$Settings) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = fontVariation$Settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(this.weight, resourceFont.weight) && this.style == resourceFont.style && this.variationSettings.equals(resourceFont.variationSettings);
    }

    public final int hashCode() {
        return this.variationSettings.settings.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.style, ((this.resId * 31) + this.weight.weight) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.resId);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", style=");
        int i = this.style;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", loadingStrategy=Blocking)");
        return sb.toString();
    }
}
