package ru.yandex.video.m3.trackselection.videoformatselector;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Format;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadataAnalytics;", "", LaunchBrowserActivity.KEY_URI, "", "format", "Lru/yandex/video/m3/data/Format;", "(Ljava/lang/String;Lru/yandex/video/m3/data/Format;)V", "getFormat", "()Lru/yandex/video/m3/data/Format;", "getUri", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoMetadataAnalytics {
    public static final int $stable = 0;

    @ysq0("format")
    private final Format format;

    @ysq0(LaunchBrowserActivity.KEY_URI)
    private final String uri;

    public VideoMetadataAnalytics(String str, Format format) {
        this.uri = str;
        this.format = format;
    }

    public static /* synthetic */ VideoMetadataAnalytics copy$default(VideoMetadataAnalytics videoMetadataAnalytics, String str, Format format, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoMetadataAnalytics.uri;
        }
        if ((i & 2) != 0) {
            format = videoMetadataAnalytics.format;
        }
        return videoMetadataAnalytics.copy(str, format);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final Format getFormat() {
        return this.format;
    }

    public final VideoMetadataAnalytics copy(String uri, Format format) {
        return new VideoMetadataAnalytics(uri, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMetadataAnalytics)) {
            return false;
        }
        VideoMetadataAnalytics videoMetadataAnalytics = (VideoMetadataAnalytics) other;
        return jl40.l(this.uri, videoMetadataAnalytics.uri) && jl40.l(this.format, videoMetadataAnalytics.format);
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
        return "VideoMetadataAnalytics(uri=" + this.uri + ", format=" + this.format + ')';
    }
}
