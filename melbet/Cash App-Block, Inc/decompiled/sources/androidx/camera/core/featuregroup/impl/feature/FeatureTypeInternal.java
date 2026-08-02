package androidx.camera.core.featuregroup.impl.feature;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FeatureTypeInternal {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ FeatureTypeInternal[] $VALUES;
    public static final FeatureTypeInternal DYNAMIC_RANGE;
    public static final FeatureTypeInternal FPS_RANGE;
    public static final FeatureTypeInternal IMAGE_FORMAT;
    public static final FeatureTypeInternal VIDEO_STABILIZATION;

    static {
        FeatureTypeInternal featureTypeInternal = new FeatureTypeInternal("DYNAMIC_RANGE", 0);
        DYNAMIC_RANGE = featureTypeInternal;
        FeatureTypeInternal featureTypeInternal2 = new FeatureTypeInternal("FPS_RANGE", 1);
        FPS_RANGE = featureTypeInternal2;
        FeatureTypeInternal featureTypeInternal3 = new FeatureTypeInternal("VIDEO_STABILIZATION", 2);
        VIDEO_STABILIZATION = featureTypeInternal3;
        FeatureTypeInternal featureTypeInternal4 = new FeatureTypeInternal("IMAGE_FORMAT", 3);
        IMAGE_FORMAT = featureTypeInternal4;
        FeatureTypeInternal[] featureTypeInternalArr = {featureTypeInternal, featureTypeInternal2, featureTypeInternal3, featureTypeInternal4, new FeatureTypeInternal("RECORDING_QUALITY", 4)};
        $VALUES = featureTypeInternalArr;
        $ENTRIES = new EnumEntriesList(featureTypeInternalArr);
    }

    public static FeatureTypeInternal valueOf(String str) {
        return (FeatureTypeInternal) Enum.valueOf(FeatureTypeInternal.class, str);
    }

    public static FeatureTypeInternal[] values() {
        return (FeatureTypeInternal[]) $VALUES.clone();
    }
}
