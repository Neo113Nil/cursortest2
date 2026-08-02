package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/RendererEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "decoderName", "", "format", "resolution", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Integer;)V", "getDecoderName", "()Ljava/lang/String;", "getFormat", "getResolution", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RendererEventData extends DefaultEventData {
    public static final int $stable = 8;
    private final String decoderName;
    private final String format;
    private final Integer[] resolution;

    public RendererEventData(String str, String str2, Integer[] numArr) {
        super(null, 1, null);
        this.decoderName = str;
        this.format = str2;
        this.resolution = numArr;
    }

    public final String getDecoderName() {
        return this.decoderName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer[] getResolution() {
        return this.resolution;
    }
}
