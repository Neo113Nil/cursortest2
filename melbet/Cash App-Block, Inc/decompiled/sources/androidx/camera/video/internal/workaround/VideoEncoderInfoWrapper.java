package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class VideoEncoderInfoWrapper implements VideoEncoderInfo {
    public final Range _supportedHeights;
    public final Range _supportedWidths;
    public final HashSet extraSupportedSizes;
    public final VideoEncoderInfo videoEncoderInfo;

    public VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo) {
        this.videoEncoderInfo = videoEncoderInfo;
        HashSet hashSet = new HashSet();
        this.extraSupportedSizes = hashSet;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        Range create = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / widthAlignment)) * widthAlignment));
        create.getClass();
        this._supportedWidths = create;
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range create2 = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / heightAlignment)) * heightAlignment));
        create2.getClass();
        this._supportedHeights = create2;
        Set singleton = MediaCodecInfoReportIncorrectInfoQuirk.INCORRECT_FHD_PROFILE_MODEL_LIST.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET;
        singleton.getClass();
        hashSet.addAll(singleton);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.videoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.videoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.videoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this._supportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this._supportedWidths;
        boolean contains = range.contains((Range) valueOf);
        VideoEncoderInfo videoEncoderInfo = this.videoEncoderInfo;
        if (contains && i % videoEncoderInfo.getWidthAlignment() == 0) {
            return this._supportedHeights;
        }
        StringBuilder sb = new StringBuilder("Not supported width: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        sb.append(" or can not be divided by alignment ");
        sb.append(widthAlignment);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this._supportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this._supportedHeights;
        boolean contains = range.contains((Range) valueOf);
        VideoEncoderInfo videoEncoderInfo = this.videoEncoderInfo;
        if (contains && i % videoEncoderInfo.getHeightAlignment() == 0) {
            return this._supportedWidths;
        }
        StringBuilder sb = new StringBuilder("Not supported height: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        sb.append(" or can not be divided by alignment ");
        sb.append(heightAlignment);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.videoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i, int i2) {
        VideoEncoderInfo videoEncoderInfo = this.videoEncoderInfo;
        if (videoEncoderInfo.isSizeSupported(i, i2)) {
            return true;
        }
        HashSet hashSet = this.extraSupportedSizes;
        if (hashSet == null || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return true;
                }
            }
        }
        return this._supportedWidths.contains((Range) Integer.valueOf(i)) && this._supportedHeights.contains((Range) Integer.valueOf(i2)) && i % videoEncoderInfo.getWidthAlignment() == 0 && i2 % videoEncoderInfo.getHeightAlignment() == 0;
    }
}
