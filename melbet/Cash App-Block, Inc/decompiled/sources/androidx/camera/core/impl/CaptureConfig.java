package androidx.camera.core.impl;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CaptureConfig {
    public final List mCameraCaptureCallbacks;
    public final OptionsBundle mImplementationOptions;
    public final ArrayList mSurfaces;
    public final TagBundle mTagBundle;
    public final int mTemplateType;
    public static final AutoValue_Config_Option OPTION_ROTATION = new AutoValue_Config_Option("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final AutoValue_Config_Option OPTION_JPEG_QUALITY = new AutoValue_Config_Option("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final AutoValue_Config_Option OPTION_RESOLVED_FRAME_RATE = new AutoValue_Config_Option("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    public CaptureConfig(ArrayList arrayList, OptionsBundle optionsBundle, int i, ArrayList arrayList2, TagBundle tagBundle) {
        this.mSurfaces = arrayList;
        this.mImplementationOptions = optionsBundle;
        this.mTemplateType = i;
        this.mCameraCaptureCallbacks = Collections.unmodifiableList(arrayList2);
        this.mTagBundle = tagBundle;
    }

    public final Range getExpectedFrameRateRange() {
        Range range = (Range) this.mImplementationOptions.retrieveOption(OPTION_RESOLVED_FRAME_RATE, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        Objects.requireNonNull(range);
        return range;
    }
}
