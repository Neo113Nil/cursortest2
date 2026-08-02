package ru.yandex.video.m3.player.tracking;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/tracking/LoadCanceled;", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", LaunchBrowserActivity.KEY_URI, "loadDurationMs", "", "bytesLoaded", PlaybackException.ErrorInRenderer.TRACK_TYPE, "trackFormat", "dataType", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBytesLoaded", "()J", "getDataType", "()Ljava/lang/String;", "getHost", "getLoadDurationMs", "getTrackFormat", "getTrackType", "getUri", "equals", "", "other", "hashCode", "", "toString", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadCanceled {
    public static final int $stable = 0;
    private final long bytesLoaded;
    private final String dataType;
    private final String host;
    private final long loadDurationMs;
    private final String trackFormat;
    private final String trackType;
    private final String uri;

    private LoadCanceled(String str, String str2, long j, long j2, String str3, String str4, String str5) {
        this.host = str;
        this.uri = str2;
        this.loadDurationMs = j;
        this.bytesLoaded = j2;
        this.trackType = str3;
        this.trackFormat = str4;
        this.dataType = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LoadCanceled.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LoadCanceled loadCanceled = (LoadCanceled) other;
        return jl40.l(this.host, loadCanceled.host) && jl40.l(this.uri, loadCanceled.uri) && this.loadDurationMs == loadCanceled.loadDurationMs && this.bytesLoaded == loadCanceled.bytesLoaded && jl40.l(this.trackType, loadCanceled.trackType) && jl40.l(this.trackFormat, loadCanceled.trackFormat) && jl40.l(this.dataType, loadCanceled.dataType);
    }

    public final long getBytesLoaded() {
        return this.bytesLoaded;
    }

    public final String getDataType() {
        return this.dataType;
    }

    public final String getHost() {
        return this.host;
    }

    public final long getLoadDurationMs() {
        return this.loadDurationMs;
    }

    public final String getTrackFormat() {
        return this.trackFormat;
    }

    public final String getTrackType() {
        return this.trackType;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.dataType.hashCode() + unr0.b(unr0.b(qv10.c(qv10.c(unr0.b(this.host.hashCode() * 31, 31, this.uri), 31, this.loadDurationMs), 31, this.bytesLoaded), 31, this.trackType), 31, this.trackFormat);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadCanceled(host='");
        sb.append(this.host);
        sb.append("', uri='");
        sb.append(this.uri);
        sb.append("', loadDurationMs=");
        sb.append(this.loadDurationMs);
        sb.append(", bytesLoaded=");
        sb.append(this.bytesLoaded);
        sb.append(", trackType='");
        sb.append(this.trackType);
        sb.append("', trackFormat='");
        sb.append(this.trackFormat);
        sb.append("', dataType='");
        return oyr.t(sb, this.dataType, "')");
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\nR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/player/tracking/LoadCanceled$Builder;", "", "()V", "<set-?>", "", "bytesLoaded", "getBytesLoaded", "()J", "setBytesLoaded", "(J)V", "", "dataType", "getDataType", "()Ljava/lang/String;", "setDataType", "(Ljava/lang/String;)V", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "getHost", "setHost", "loadDurationMs", "getLoadDurationMs", "setLoadDurationMs", "trackFormat", "getTrackFormat", "setTrackFormat", PlaybackException.ErrorInRenderer.TRACK_TYPE, "getTrackType", "setTrackType", LaunchBrowserActivity.KEY_URI, "getUri", "setUri", "build", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String host = "unknown";
        private String uri = "unknown";
        private long loadDurationMs = -1;
        private long bytesLoaded = -1;
        private String trackType = "TRACK_TYPE_UNKNOWN";
        private String trackFormat = "TRACK_FORMAT_UNKNOWN";
        private String dataType = "DATA_TYPE_UNKNOWN";

        public final LoadCanceled build() {
            return new LoadCanceled(this.host, this.uri, this.loadDurationMs, this.bytesLoaded, this.trackType, this.trackFormat, this.dataType, null);
        }

        public final long getBytesLoaded() {
            return this.bytesLoaded;
        }

        public final String getDataType() {
            return this.dataType;
        }

        public final String getHost() {
            return this.host;
        }

        public final long getLoadDurationMs() {
            return this.loadDurationMs;
        }

        public final String getTrackFormat() {
            return this.trackFormat;
        }

        public final String getTrackType() {
            return this.trackType;
        }

        public final String getUri() {
            return this.uri;
        }

        /* renamed from: setBytesLoaded, reason: collision with other method in class */
        public final /* synthetic */ void m813setBytesLoaded(long j) {
            this.bytesLoaded = j;
        }

        /* renamed from: setDataType, reason: collision with other method in class */
        public final /* synthetic */ void m814setDataType(String str) {
            this.dataType = str;
        }

        /* renamed from: setHost, reason: collision with other method in class */
        public final /* synthetic */ void m815setHost(String str) {
            this.host = str;
        }

        /* renamed from: setLoadDurationMs, reason: collision with other method in class */
        public final /* synthetic */ void m816setLoadDurationMs(long j) {
            this.loadDurationMs = j;
        }

        /* renamed from: setTrackFormat, reason: collision with other method in class */
        public final /* synthetic */ void m817setTrackFormat(String str) {
            this.trackFormat = str;
        }

        /* renamed from: setTrackType, reason: collision with other method in class */
        public final /* synthetic */ void m818setTrackType(String str) {
            this.trackType = str;
        }

        /* renamed from: setUri, reason: collision with other method in class */
        public final /* synthetic */ void m819setUri(String str) {
            this.uri = str;
        }

        public final Builder setBytesLoaded(long bytesLoaded) {
            this.bytesLoaded = bytesLoaded;
            return this;
        }

        public final Builder setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        public final Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public final Builder setLoadDurationMs(long loadDurationMs) {
            this.loadDurationMs = loadDurationMs;
            return this;
        }

        public final Builder setTrackFormat(String trackFormat) {
            this.trackFormat = trackFormat;
            return this;
        }

        public final Builder setTrackType(String trackType) {
            this.trackType = trackType;
            return this;
        }

        public final Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }

    public /* synthetic */ LoadCanceled(String str, String str2, long j, long j2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, str3, str4, str5);
    }
}
