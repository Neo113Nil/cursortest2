package ru.yandex.video.m3.player.tracks;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Format;
import ru.yandex.video.m3.data.TargetFormat;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "", Constants.KEY_MESSAGE, "", "targetFormat", "Lru/yandex/video/m3/data/TargetFormat;", "allFormats", "", "Lru/yandex/video/m3/data/Format;", "selectedFormats", "(Ljava/lang/String;Lru/yandex/video/m3/data/TargetFormat;Ljava/util/List;Ljava/util/List;)V", "getAllFormats", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getSelectedFormats", "getTargetFormat", "()Lru/yandex/video/m3/data/TargetFormat;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackSelectionInitializationError {
    public static final int $stable = 8;
    private final List<Format> allFormats;
    private final String message;
    private final List<Format> selectedFormats;
    private final TargetFormat targetFormat;

    public TrackSelectionInitializationError(String str, TargetFormat targetFormat, List<Format> list, List<Format> list2) {
        this.message = str;
        this.targetFormat = targetFormat;
        this.allFormats = list;
        this.selectedFormats = list2;
    }

    public final List<Format> getAllFormats() {
        return this.allFormats;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Format> getSelectedFormats() {
        return this.selectedFormats;
    }

    public final TargetFormat getTargetFormat() {
        return this.targetFormat;
    }
}
