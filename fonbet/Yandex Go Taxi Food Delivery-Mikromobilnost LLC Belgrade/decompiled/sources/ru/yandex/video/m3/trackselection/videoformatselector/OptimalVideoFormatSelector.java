package ru.yandex.video.m3.trackselection.videoformatselector;

import android.content.Context;
import defpackage.jxi;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "", "", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "videosMetadata", "getOptimalVideoFormat", "(Ljava/util/List;)Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSize", "Lzy11;", "setSurfaceSize", "(Lru/yandex/video/m3/player/provider/model/SurfaceSize;)V", "", "whiteListFormatExtensions", "setWhiteListFormatExtensions", "(Ljava/util/List;)V", "", "serviceQuality", "setServiceQuality", "(I)V", "Landroid/content/Context;", "context", "setContext", "(Landroid/content/Context;)V", "", "value", "experimentalShouldConsiderSelectedUserQuality", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OptimalVideoFormatSelector {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void experimentalShouldConsiderSelectedUserQuality(OptimalVideoFormatSelector optimalVideoFormatSelector, boolean z) {
            OptimalVideoFormatSelector.super.experimentalShouldConsiderSelectedUserQuality(z);
        }

        @jxi
        @Deprecated
        public static void setContext(OptimalVideoFormatSelector optimalVideoFormatSelector, Context context) {
            OptimalVideoFormatSelector.super.setContext(context);
        }

        @Deprecated
        public static void setServiceQuality(OptimalVideoFormatSelector optimalVideoFormatSelector, int i) {
            OptimalVideoFormatSelector.super.setServiceQuality(i);
        }

        @Deprecated
        public static void setSurfaceSize(OptimalVideoFormatSelector optimalVideoFormatSelector, SurfaceSize surfaceSize) {
            OptimalVideoFormatSelector.super.setSurfaceSize(surfaceSize);
        }

        @Deprecated
        public static void setWhiteListFormatExtensions(OptimalVideoFormatSelector optimalVideoFormatSelector, List<String> list) {
            OptimalVideoFormatSelector.super.setWhiteListFormatExtensions(list);
        }
    }

    default void experimentalShouldConsiderSelectedUserQuality(boolean value) {
    }

    VideoMetadata getOptimalVideoFormat(List<VideoMetadata> videosMetadata) throws IllegalArgumentException;

    @jxi
    default void setContext(Context context) {
    }

    default void setServiceQuality(int serviceQuality) {
    }

    default void setSurfaceSize(SurfaceSize surfaceSize) {
    }

    default void setWhiteListFormatExtensions(List<String> whiteListFormatExtensions) {
    }
}
