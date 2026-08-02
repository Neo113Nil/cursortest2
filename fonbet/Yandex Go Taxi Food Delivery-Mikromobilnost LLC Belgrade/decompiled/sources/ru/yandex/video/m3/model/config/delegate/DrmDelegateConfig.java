package ru.yandex.video.m3.model.config.delegate;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "", "preferL3DRMSecurityLevel", "", "minLoadableRetryCount", "", "authorizationCookie", "", "authToken", "experimentalEnableDrmSessionForClearVideo", "(ZILjava/lang/String;Ljava/lang/String;Z)V", "getAuthToken", "()Ljava/lang/String;", "getAuthorizationCookie", "getExperimentalEnableDrmSessionForClearVideo", "()Z", "getMinLoadableRetryCount", "()I", "getPreferL3DRMSecurityLevel", "equals", "other", "hashCode", "toString", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmDelegateConfig {
    public static final int $stable = 0;
    private final String authToken;
    private final String authorizationCookie;
    private final boolean experimentalEnableDrmSessionForClearVideo;
    private final int minLoadableRetryCount;
    private final boolean preferL3DRMSecurityLevel;

    private DrmDelegateConfig(boolean z, int i, String str, String str2, boolean z2) {
        this.preferL3DRMSecurityLevel = z;
        this.minLoadableRetryCount = i;
        this.authorizationCookie = str;
        this.authToken = str2;
        this.experimentalEnableDrmSessionForClearVideo = z2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmDelegateConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DrmDelegateConfig drmDelegateConfig = (DrmDelegateConfig) other;
        return this.preferL3DRMSecurityLevel == drmDelegateConfig.preferL3DRMSecurityLevel && jl40.l(this.authorizationCookie, drmDelegateConfig.authorizationCookie) && jl40.l(this.authToken, drmDelegateConfig.authToken) && this.experimentalEnableDrmSessionForClearVideo == drmDelegateConfig.experimentalEnableDrmSessionForClearVideo && this.minLoadableRetryCount == drmDelegateConfig.minLoadableRetryCount;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getAuthorizationCookie() {
        return this.authorizationCookie;
    }

    public final boolean getExperimentalEnableDrmSessionForClearVideo() {
        return this.experimentalEnableDrmSessionForClearVideo;
    }

    public final int getMinLoadableRetryCount() {
        return this.minLoadableRetryCount;
    }

    public final boolean getPreferL3DRMSecurityLevel() {
        return this.preferL3DRMSecurityLevel;
    }

    public int hashCode() {
        return unr0.e(unr0.b(unr0.b(Boolean.hashCode(this.preferL3DRMSecurityLevel) * 31, 31, this.authorizationCookie), 31, this.authToken), 31, this.experimentalEnableDrmSessionForClearVideo) + this.minLoadableRetryCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrmDelegateConfig(preferL3DRMSecurityLevel=");
        sb.append(this.preferL3DRMSecurityLevel);
        sb.append(", authorizationCookie='");
        sb.append(this.authorizationCookie);
        sb.append("', authToken='");
        sb.append(this.authToken);
        sb.append("', experimentalEnableDrmSessionForClearVideo=");
        sb.append(this.experimentalEnableDrmSessionForClearVideo);
        sb.append(", minLoadableRetryCount=");
        return oyr.s(sb, this.minLoadableRetryCount, ')');
    }

    public /* synthetic */ DrmDelegateConfig(boolean z, int i, String str, String str2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, str, str2, z2);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0002\b!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014¨\u0006\""}, d2 = {"Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig$Builder;", "", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "(Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;)V", "()V", "authToken", "", "getAuthToken", "()Ljava/lang/String;", "setAuthToken", "(Ljava/lang/String;)V", "authorizationCookie", "getAuthorizationCookie", "setAuthorizationCookie", "experimentalEnableDrmSessionForClearVideo", "", "getExperimentalEnableDrmSessionForClearVideo", "()Ljava/lang/Boolean;", "setExperimentalEnableDrmSessionForClearVideo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "minLoadableRetryCount", "", "getMinLoadableRetryCount", "()Ljava/lang/Integer;", "setMinLoadableRetryCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "preferL3DRMSecurityLevel", "getPreferL3DRMSecurityLevel", "setPreferL3DRMSecurityLevel", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String authToken;
        private String authorizationCookie;
        private Boolean experimentalEnableDrmSessionForClearVideo;
        private Integer minLoadableRetryCount;
        private Boolean preferL3DRMSecurityLevel;

        public Builder(DrmDelegateConfig drmDelegateConfig) {
            this();
            this.preferL3DRMSecurityLevel = Boolean.valueOf(drmDelegateConfig.getPreferL3DRMSecurityLevel());
            this.authorizationCookie = drmDelegateConfig.getAuthorizationCookie();
            this.authToken = drmDelegateConfig.getAuthToken();
            this.experimentalEnableDrmSessionForClearVideo = Boolean.valueOf(drmDelegateConfig.getExperimentalEnableDrmSessionForClearVideo());
            this.minLoadableRetryCount = Integer.valueOf(drmDelegateConfig.getMinLoadableRetryCount());
        }

        public final DrmDelegateConfig build$video_player_internalRelease() {
            Boolean bool = this.preferL3DRMSecurityLevel;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Integer num = this.minLoadableRetryCount;
            int intValue = num != null ? num.intValue() : 3;
            String str = this.authorizationCookie;
            if (str == null) {
                str = "";
            }
            String str2 = this.authToken;
            String str3 = str2 != null ? str2 : "";
            Boolean bool2 = this.experimentalEnableDrmSessionForClearVideo;
            return new DrmDelegateConfig(booleanValue, intValue, str, str3, bool2 != null ? bool2.booleanValue() : false, null);
        }

        public final String getAuthToken() {
            return this.authToken;
        }

        public final String getAuthorizationCookie() {
            return this.authorizationCookie;
        }

        public final Boolean getExperimentalEnableDrmSessionForClearVideo() {
            return this.experimentalEnableDrmSessionForClearVideo;
        }

        public final Integer getMinLoadableRetryCount() {
            return this.minLoadableRetryCount;
        }

        public final Boolean getPreferL3DRMSecurityLevel() {
            return this.preferL3DRMSecurityLevel;
        }

        public final void setAuthToken(String str) {
            this.authToken = str;
        }

        public final void setAuthorizationCookie(String str) {
            this.authorizationCookie = str;
        }

        public final void setExperimentalEnableDrmSessionForClearVideo(Boolean bool) {
            this.experimentalEnableDrmSessionForClearVideo = bool;
        }

        public final void setMinLoadableRetryCount(Integer num) {
            this.minLoadableRetryCount = num;
        }

        public final void setPreferL3DRMSecurityLevel(Boolean bool) {
            this.preferL3DRMSecurityLevel = bool;
        }

        public Builder() {
        }
    }
}
