package androidx.camera.core.impl;

import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceSizeDefinition {
    public final Size analysisSize;
    public final LinkedHashMap maximum16x9SizeMap;
    public final LinkedHashMap maximum4x3SizeMap;
    public final LinkedHashMap maximumSizeMap;
    public final Size previewSize;
    public final Size recordSize;
    public final LinkedHashMap s1440pSizeMap;
    public final LinkedHashMap s720pSizeMap;
    public final LinkedHashMap ultraMaximumSizeMap;

    public AutoValue_SurfaceSizeDefinition(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null analysisSize");
            throw null;
        }
        this.analysisSize = size;
        this.s720pSizeMap = linkedHashMap;
        this.previewSize = size2;
        this.s1440pSizeMap = linkedHashMap2;
        this.recordSize = size3;
        this.maximumSizeMap = linkedHashMap3;
        this.maximum4x3SizeMap = linkedHashMap4;
        this.maximum16x9SizeMap = linkedHashMap5;
        this.ultraMaximumSizeMap = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_SurfaceSizeDefinition)) {
            return false;
        }
        AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition = (AutoValue_SurfaceSizeDefinition) obj;
        return this.analysisSize.equals(autoValue_SurfaceSizeDefinition.analysisSize) && this.s720pSizeMap.equals(autoValue_SurfaceSizeDefinition.s720pSizeMap) && this.previewSize.equals(autoValue_SurfaceSizeDefinition.previewSize) && this.s1440pSizeMap.equals(autoValue_SurfaceSizeDefinition.s1440pSizeMap) && this.recordSize.equals(autoValue_SurfaceSizeDefinition.recordSize) && this.maximumSizeMap.equals(autoValue_SurfaceSizeDefinition.maximumSizeMap) && this.maximum4x3SizeMap.equals(autoValue_SurfaceSizeDefinition.maximum4x3SizeMap) && this.maximum16x9SizeMap.equals(autoValue_SurfaceSizeDefinition.maximum16x9SizeMap) && this.ultraMaximumSizeMap.equals(autoValue_SurfaceSizeDefinition.ultraMaximumSizeMap);
    }

    public final int hashCode() {
        return this.ultraMaximumSizeMap.hashCode() ^ ((((((((((((((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.s720pSizeMap.hashCode()) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.s1440pSizeMap.hashCode()) * 1000003) ^ this.recordSize.hashCode()) * 1000003) ^ this.maximumSizeMap.hashCode()) * 1000003) ^ this.maximum4x3SizeMap.hashCode()) * 1000003) ^ this.maximum16x9SizeMap.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.analysisSize + ", s720pSizeMap=" + this.s720pSizeMap + ", previewSize=" + this.previewSize + ", s1440pSizeMap=" + this.s1440pSizeMap + ", recordSize=" + this.recordSize + ", maximumSizeMap=" + this.maximumSizeMap + ", maximum4x3SizeMap=" + this.maximum4x3SizeMap + ", maximum16x9SizeMap=" + this.maximum16x9SizeMap + ", ultraMaximumSizeMap=" + this.ultraMaximumSizeMap + "}";
    }
}
