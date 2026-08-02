package ru.yandex.video.m3.data.network;

import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/data/network/UrlParams;", "", "scheme", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "pathSegments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getPathSegments", "getScheme", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UrlParams {
    public static final int $stable = 0;
    private final String host;
    private final String pathSegments;
    private final String scheme;

    private UrlParams(String str, String str2, String str3) {
        this.scheme = str;
        this.host = str2;
        this.pathSegments = str3;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getPathSegments() {
        return this.pathSegments;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public /* synthetic */ UrlParams(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/data/network/UrlParams$Builder;", "", "urlParams", "Lru/yandex/video/m3/data/network/UrlParams;", "(Lru/yandex/video/m3/data/network/UrlParams;)V", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "setHost", "pathSegments", "getPathSegments", "setPathSegments", "scheme", "getScheme", "setScheme", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String host;
        private String pathSegments;
        private String scheme;

        public Builder(UrlParams urlParams) {
            this(urlParams.getHost());
            this.scheme = urlParams.getScheme();
            this.pathSegments = urlParams.getPathSegments();
        }

        public final UrlParams build$video_player_internalRelease() {
            String str = this.scheme;
            if (str == null) {
                str = Constants.SCHEME;
            }
            String str2 = this.host;
            String str3 = this.pathSegments;
            if (str3 == null) {
                str3 = "";
            }
            return new UrlParams(str, str2, str3, null);
        }

        public final String getHost() {
            return this.host;
        }

        public final String getPathSegments() {
            return this.pathSegments;
        }

        public final String getScheme() {
            return this.scheme;
        }

        public final void setHost(String str) {
            this.host = str;
        }

        public final void setPathSegments(String str) {
            this.pathSegments = str;
        }

        public final void setScheme(String str) {
            this.scheme = str;
        }

        public Builder(String str) {
            this.host = str;
        }
    }
}
