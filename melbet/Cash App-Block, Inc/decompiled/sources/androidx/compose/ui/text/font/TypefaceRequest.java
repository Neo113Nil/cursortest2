package androidx.compose.ui.text.font;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TypefaceRequest {
    public final FontFamily fontFamily;
    public final int fontStyle;
    public final int fontSynthesis;
    public final FontWeight fontWeight;
    public final Object resourceLoaderCacheKey;

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.areEqual(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.areEqual(this.fontWeight, typefaceRequest.fontWeight) && this.fontStyle == typefaceRequest.fontStyle && this.fontSynthesis == typefaceRequest.fontSynthesis && Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fontSynthesis, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fontStyle, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.weight) * 31, 31), 31);
        Object obj = this.resourceLoaderCacheKey;
        return m + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.fontStyle;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.fontSynthesis;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.resourceLoaderCacheKey, ')');
    }
}
