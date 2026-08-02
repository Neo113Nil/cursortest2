package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

/* loaded from: classes4.dex */
public final class DownsampleStrategy$None {
    public static final DownsampleStrategy$None CENTER_OUTSIDE;
    public static final DownsampleStrategy$None DEFAULT;
    public static final boolean IS_BITMAP_FACTORY_SCALING_SUPPORTED;
    public static final DownsampleStrategy$None NONE;
    public static final Option OPTION;
    public final /* synthetic */ int $r8$classId;
    public static final DownsampleStrategy$None FIT_CENTER = new DownsampleStrategy$None(3);
    public static final DownsampleStrategy$None CENTER_INSIDE = new DownsampleStrategy$None(1);

    static {
        DownsampleStrategy$None downsampleStrategy$None = new DownsampleStrategy$None(2);
        CENTER_OUTSIDE = downsampleStrategy$None;
        NONE = new DownsampleStrategy$None(0);
        DEFAULT = downsampleStrategy$None;
        OPTION = Option.memory(downsampleStrategy$None, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        IS_BITMAP_FACTORY_SCALING_SUPPORTED = true;
    }

    public /* synthetic */ DownsampleStrategy$None(int i) {
        this.$r8$classId = i;
    }

    public final int getSampleSizeRounding(int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 0:
                return 2;
            case 1:
                if (getScaleFactor(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return FIT_CENTER.getSampleSizeRounding(i, i2, i3, i4);
            case 2:
                return 2;
            default:
                return IS_BITMAP_FACTORY_SCALING_SUPPORTED ? 2 : 1;
        }
    }

    public final float getScaleFactor(int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 0:
                return 1.0f;
            case 1:
                return Math.min(1.0f, FIT_CENTER.getScaleFactor(i, i2, i3, i4));
            case 2:
                return Math.max(i3 / i, i4 / i2);
            default:
                if (IS_BITMAP_FACTORY_SCALING_SUPPORTED) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
        }
    }
}
