package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.jl40;
import defpackage.smw0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "proxyUrl", "", "provisioningUrl", "drmRequestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "freeRequestParams", "", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Ljava/util/Map;)V", "getFreeRequestParams", "()Ljava/util/Map;", "equals", "", "other", "", "hashCode", "", "toString", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmProxyWithFreeRequestParams extends DrmProxy {
    public static final int $stable = 8;
    private final Map<String, String> freeRequestParams;

    private DrmProxyWithFreeRequestParams(String str, String str2, DrmRequestParams drmRequestParams, Map<String, String> map) {
        super(str, str2, drmRequestParams);
        this.freeRequestParams = map;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.drm.DrmProxy
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return DrmProxyWithFreeRequestParams.class.equals(other != null ? other.getClass() : null) && super.equals(other) && jl40.l(this.freeRequestParams, ((DrmProxyWithFreeRequestParams) other).freeRequestParams);
    }

    public final Map<String, String> getFreeRequestParams() {
        return this.freeRequestParams;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.drm.DrmProxy
    public int hashCode() {
        return this.freeRequestParams.hashCode() + (super.hashCode() * 31);
    }

    @Override // ru.yandex.video.m3.ott.data.dto.drm.DrmProxy
    public String toString() {
        return smw0.n(new StringBuilder("DrmProxyWithFreeRequestParams(freeRequestParams="), this.freeRequestParams, ')');
    }

    public /* synthetic */ DrmProxyWithFreeRequestParams(String str, String str2, DrmRequestParams drmRequestParams, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, drmRequestParams, map);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\u0010\nJ\r\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams$Builder;", "", "drmProxy", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;)V", "proxyUrl", "", "provisioningUrl", "freeRequestParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "drmRequestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getDrmRequestParams", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "setDrmRequestParams", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "getFreeRequestParams", "()Ljava/util/Map;", "setFreeRequestParams", "(Ljava/util/Map;)V", "getProvisioningUrl", "()Ljava/lang/String;", "setProvisioningUrl", "(Ljava/lang/String;)V", "getProxyUrl", "setProxyUrl", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DrmRequestParams drmRequestParams;
        private Map<String, String> freeRequestParams;
        private String provisioningUrl;
        private String proxyUrl;

        public Builder(DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams) {
            this(drmProxyWithFreeRequestParams.getProxyUrl(), drmProxyWithFreeRequestParams.getProvisioningUrl(), drmProxyWithFreeRequestParams.getFreeRequestParams());
        }

        public final DrmProxyWithFreeRequestParams build$video_player_internalRelease() {
            String str = this.proxyUrl;
            String str2 = this.provisioningUrl;
            DrmRequestParams drmRequestParams = this.drmRequestParams;
            if (drmRequestParams == null) {
                drmRequestParams = DrmRequestParams.INSTANCE.getDUMMY$video_player_internalRelease();
            }
            return new DrmProxyWithFreeRequestParams(str, str2, drmRequestParams, this.freeRequestParams, null);
        }

        public final DrmRequestParams getDrmRequestParams() {
            return this.drmRequestParams;
        }

        public final Map<String, String> getFreeRequestParams() {
            return this.freeRequestParams;
        }

        public final String getProvisioningUrl() {
            return this.provisioningUrl;
        }

        public final String getProxyUrl() {
            return this.proxyUrl;
        }

        public final void setDrmRequestParams(DrmRequestParams drmRequestParams) {
            this.drmRequestParams = drmRequestParams;
        }

        public final void setFreeRequestParams(Map<String, String> map) {
            this.freeRequestParams = map;
        }

        public final void setProvisioningUrl(String str) {
            this.provisioningUrl = str;
        }

        public final void setProxyUrl(String str) {
            this.proxyUrl = str;
        }

        public Builder(String str, String str2, Map<String, String> map) {
            this.proxyUrl = str;
            this.provisioningUrl = str2;
            this.freeRequestParams = map;
        }
    }
}
