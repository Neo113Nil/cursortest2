package ru.yandex.video.m3.previews;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/previews/RawThumbnail;", "", "type", "Lru/yandex/video/m3/previews/Type;", "tilesWidth", "", "tilesHeight", "durationSec", "", "positionSupplementMs", "", "pathProvider", "Lru/yandex/video/m3/previews/PathProvider;", "previewVersion", "Lru/yandex/video/m3/previews/PreviewVersion;", "(Lru/yandex/video/m3/previews/Type;IIFJLru/yandex/video/m3/previews/PathProvider;Lru/yandex/video/m3/previews/PreviewVersion;)V", "getDurationSec", "()F", "getPathProvider", "()Lru/yandex/video/m3/previews/PathProvider;", "getPositionSupplementMs", "()J", "getPreviewVersion", "()Lru/yandex/video/m3/previews/PreviewVersion;", "getTilesHeight", "()I", "getTilesWidth", "getType", "()Lru/yandex/video/m3/previews/Type;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawThumbnail {
    public static final int $stable = 8;
    private final float durationSec;
    private final PathProvider pathProvider;
    private final long positionSupplementMs;
    private final PreviewVersion previewVersion;
    private final int tilesHeight;
    private final int tilesWidth;
    private final Type type;

    private RawThumbnail(Type type, int i, int i2, float f, long j, PathProvider pathProvider, PreviewVersion previewVersion) {
        this.type = type;
        this.tilesWidth = i;
        this.tilesHeight = i2;
        this.durationSec = f;
        this.positionSupplementMs = j;
        this.pathProvider = pathProvider;
        this.previewVersion = previewVersion;
    }

    public final float getDurationSec() {
        return this.durationSec;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final long getPositionSupplementMs() {
        return this.positionSupplementMs;
    }

    public final PreviewVersion getPreviewVersion() {
        return this.previewVersion;
    }

    public final int getTilesHeight() {
        return this.tilesHeight;
    }

    public final int getTilesWidth() {
        return this.tilesWidth;
    }

    public final Type getType() {
        return this.type;
    }

    public /* synthetic */ RawThumbnail(Type type, int i, int i2, float f, long j, PathProvider pathProvider, PreviewVersion previewVersion, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, i, i2, f, j, pathProvider, previewVersion);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B?\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\r\u0010-\u001a\u00020\u0003H\u0000¢\u0006\u0002\b.R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/yandex/video/m3/previews/RawThumbnail$Builder;", "", "rawThumbnail", "Lru/yandex/video/m3/previews/RawThumbnail;", "(Lru/yandex/video/m3/previews/RawThumbnail;)V", "type", "Lru/yandex/video/m3/previews/Type;", "tilesWidth", "", "tilesHeight", "durationSec", "", "positionSupplementMs", "", "pathProvider", "Lru/yandex/video/m3/previews/PathProvider;", "previewVersion", "Lru/yandex/video/m3/previews/PreviewVersion;", "(Lru/yandex/video/m3/previews/Type;IIFJLru/yandex/video/m3/previews/PathProvider;Lru/yandex/video/m3/previews/PreviewVersion;)V", "getDurationSec", "()F", "setDurationSec", "(F)V", "getPathProvider", "()Lru/yandex/video/m3/previews/PathProvider;", "setPathProvider", "(Lru/yandex/video/m3/previews/PathProvider;)V", "getPositionSupplementMs", "()J", "setPositionSupplementMs", "(J)V", "getPreviewVersion", "()Lru/yandex/video/m3/previews/PreviewVersion;", "setPreviewVersion", "(Lru/yandex/video/m3/previews/PreviewVersion;)V", "getTilesHeight", "()I", "setTilesHeight", "(I)V", "getTilesWidth", "setTilesWidth", "getType", "()Lru/yandex/video/m3/previews/Type;", "setType", "(Lru/yandex/video/m3/previews/Type;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private float durationSec;
        private PathProvider pathProvider;
        private long positionSupplementMs;
        private PreviewVersion previewVersion;
        private int tilesHeight;
        private int tilesWidth;
        private Type type;

        public Builder(RawThumbnail rawThumbnail) {
            this(rawThumbnail.getType(), rawThumbnail.getTilesWidth(), rawThumbnail.getTilesHeight(), rawThumbnail.getDurationSec(), rawThumbnail.getPositionSupplementMs(), rawThumbnail.getPathProvider(), rawThumbnail.getPreviewVersion());
        }

        public final RawThumbnail build$video_player_internalRelease() {
            return new RawThumbnail(this.type, this.tilesWidth, this.tilesHeight, this.durationSec, this.positionSupplementMs, this.pathProvider, this.previewVersion, null);
        }

        public final float getDurationSec() {
            return this.durationSec;
        }

        public final PathProvider getPathProvider() {
            return this.pathProvider;
        }

        public final long getPositionSupplementMs() {
            return this.positionSupplementMs;
        }

        public final PreviewVersion getPreviewVersion() {
            return this.previewVersion;
        }

        public final int getTilesHeight() {
            return this.tilesHeight;
        }

        public final int getTilesWidth() {
            return this.tilesWidth;
        }

        public final Type getType() {
            return this.type;
        }

        public final void setDurationSec(float f) {
            this.durationSec = f;
        }

        public final void setPathProvider(PathProvider pathProvider) {
            this.pathProvider = pathProvider;
        }

        public final void setPositionSupplementMs(long j) {
            this.positionSupplementMs = j;
        }

        public final void setPreviewVersion(PreviewVersion previewVersion) {
            this.previewVersion = previewVersion;
        }

        public final void setTilesHeight(int i) {
            this.tilesHeight = i;
        }

        public final void setTilesWidth(int i) {
            this.tilesWidth = i;
        }

        public final void setType(Type type) {
            this.type = type;
        }

        public Builder(Type type, int i, int i2, float f, long j, PathProvider pathProvider, PreviewVersion previewVersion) {
            this.type = type;
            this.tilesWidth = i;
            this.tilesHeight = i2;
            this.durationSec = f;
            this.positionSupplementMs = j;
            this.pathProvider = pathProvider;
            this.previewVersion = previewVersion;
        }
    }
}
