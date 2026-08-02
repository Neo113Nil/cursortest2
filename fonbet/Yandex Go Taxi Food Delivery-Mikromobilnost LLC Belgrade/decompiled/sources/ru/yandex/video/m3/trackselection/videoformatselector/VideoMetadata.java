package ru.yandex.video.m3.trackselection.videoformatselector;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.Format;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "", LaunchBrowserActivity.KEY_URI, "", "format", "Lru/yandex/video/m3/data/Format;", "(Ljava/lang/String;Lru/yandex/video/m3/data/Format;)V", "getFormat", "()Lru/yandex/video/m3/data/Format;", "getUri", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoMetadata {
    public static final int $stable = 0;
    private final Format format;
    private final String uri;

    private VideoMetadata(String str, Format format) {
        this.uri = str;
        this.format = format;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VideoMetadata.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        VideoMetadata videoMetadata = (VideoMetadata) other;
        return jl40.l(this.uri, videoMetadata.uri) && jl40.l(this.format, videoMetadata.format);
    }

    public final Format getFormat() {
        return this.format;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.format.hashCode() + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "VideoMetadata(uri='" + this.uri + "', format=" + this.format + ')';
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata$Builder;", "", LaunchBrowserActivity.KEY_URI, "", "format", "Lru/yandex/video/m3/data/Format;", "(Ljava/lang/String;Lru/yandex/video/m3/data/Format;)V", "getFormat", "()Lru/yandex/video/m3/data/Format;", "setFormat", "(Lru/yandex/video/m3/data/Format;)V", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "build", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Format format;
        private String uri;

        public Builder(String str, Format format) {
            this.uri = str;
            this.format = format;
        }

        public final VideoMetadata build() {
            return new VideoMetadata(this.uri, this.format, null);
        }

        public final Format getFormat() {
            return this.format;
        }

        public final String getUri() {
            return this.uri;
        }

        /* renamed from: setFormat, reason: collision with other method in class */
        public final /* synthetic */ void m904setFormat(Format format) {
            this.format = format;
        }

        /* renamed from: setUri, reason: collision with other method in class */
        public final /* synthetic */ void m905setUri(String str) {
            this.uri = str;
        }

        public final Builder setFormat(Format format) {
            this.format = format;
            return this;
        }

        public final Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }

    public /* synthetic */ VideoMetadata(String str, Format format, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, format);
    }
}
