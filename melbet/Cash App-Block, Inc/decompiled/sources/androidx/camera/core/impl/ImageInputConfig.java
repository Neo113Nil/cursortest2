package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;

/* loaded from: classes3.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_INPUT_DYNAMIC_RANGE;
    public static final AutoValue_Config_Option OPTION_INPUT_FORMAT;
    public static final AutoValue_Config_Option OPTION_SECONDARY_INPUT_FORMAT;

    static {
        Class cls = Integer.TYPE;
        OPTION_INPUT_FORMAT = new AutoValue_Config_Option("camerax.core.imageInput.inputFormat", cls, null);
        OPTION_SECONDARY_INPUT_FORMAT = new AutoValue_Config_Option("camerax.core.imageInput.secondaryInputFormat", cls, null);
        OPTION_INPUT_DYNAMIC_RANGE = new AutoValue_Config_Option("camerax.core.imageInput.inputDynamicRange", DynamicRange.class, null);
    }

    default DynamicRange getDynamicRange() {
        DynamicRange dynamicRange = (DynamicRange) retrieveOption(OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
        dynamicRange.getClass();
        return dynamicRange;
    }

    default int getInputFormat() {
        return ((Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }
}
