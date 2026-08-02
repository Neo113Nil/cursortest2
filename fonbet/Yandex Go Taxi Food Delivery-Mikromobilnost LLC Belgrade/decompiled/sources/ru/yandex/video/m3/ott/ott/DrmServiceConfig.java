package ru.yandex.video.m3.ott.ott;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "", "origin", "", "referer", "authorizationCookie", "authToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getAuthorizationCookie", "getOrigin", "getReferer", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmServiceConfig {
    public static final int $stable = 0;
    private final String authToken;
    private final String authorizationCookie;
    private final String origin;
    private final String referer;

    public /* synthetic */ DrmServiceConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getAuthorizationCookie() {
        return this.authorizationCookie;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getReferer() {
        return this.referer;
    }

    private DrmServiceConfig(String str, String str2, String str3, String str4) {
        this.origin = str;
        this.referer = str2;
        this.authorizationCookie = str3;
        this.authToken = str4;
    }

    public /* synthetic */ DrmServiceConfig(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ott/ott/DrmServiceConfig$Builder;", "", "drmServiceConfig", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "(Lru/yandex/video/m3/ott/ott/DrmServiceConfig;)V", "origin", "", "referer", "(Ljava/lang/String;Ljava/lang/String;)V", "authToken", "getAuthToken", "()Ljava/lang/String;", "setAuthToken", "(Ljava/lang/String;)V", "authorizationCookie", "getAuthorizationCookie", "setAuthorizationCookie", "getOrigin", "setOrigin", "getReferer", "setReferer", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String authToken;
        private String authorizationCookie;
        private String origin;
        private String referer;

        public Builder(DrmServiceConfig drmServiceConfig) {
            this(drmServiceConfig.getOrigin(), drmServiceConfig.getReferer());
            this.authorizationCookie = drmServiceConfig.getAuthorizationCookie();
            this.authToken = drmServiceConfig.getAuthToken();
        }

        public final DrmServiceConfig build$video_player_internalRelease() {
            String str = this.origin;
            String str2 = this.referer;
            String str3 = this.authorizationCookie;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.authToken;
            return new DrmServiceConfig(str, str2, str3, str4 != null ? str4 : "", null);
        }

        public final String getAuthToken() {
            return this.authToken;
        }

        public final String getAuthorizationCookie() {
            return this.authorizationCookie;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final String getReferer() {
            return this.referer;
        }

        public final void setAuthToken(String str) {
            this.authToken = str;
        }

        public final void setAuthorizationCookie(String str) {
            this.authorizationCookie = str;
        }

        public final void setOrigin(String str) {
            this.origin = str;
        }

        public final void setReferer(String str) {
            this.referer = str;
        }

        public Builder(String str, String str2) {
            this.origin = str;
            this.referer = str2;
        }
    }
}
