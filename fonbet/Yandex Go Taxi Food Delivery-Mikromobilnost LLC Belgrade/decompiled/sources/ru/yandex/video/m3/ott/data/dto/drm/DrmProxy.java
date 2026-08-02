package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.jl40;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001fB#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "", "proxyUrl", "provisioningUrl", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "drmRequestParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getProxyUrl", "getProvisioningUrl", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getDrmRequestParams", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DrmProxy extends DrmConfig {
    public static final int $stable = 0;
    private final DrmRequestParams drmRequestParams;
    private final String provisioningUrl;
    private final String proxyUrl;

    public DrmProxy(String str, String str2, DrmRequestParams drmRequestParams) {
        super(null);
        this.proxyUrl = str;
        this.provisioningUrl = str2;
        this.drmRequestParams = drmRequestParams;
    }

    public static /* synthetic */ DrmProxy copy$default(DrmProxy drmProxy, tls tlsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmProxy$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmProxy.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmProxy.Builder builder) {
                }
            };
        }
        return drmProxy.copy(tlsVar);
    }

    public final DrmProxy copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DrmProxy drmProxy = (DrmProxy) other;
        return jl40.l(this.proxyUrl, drmProxy.proxyUrl) && jl40.l(this.provisioningUrl, drmProxy.provisioningUrl) && jl40.l(this.drmRequestParams, drmProxy.drmRequestParams);
    }

    public final DrmRequestParams getDrmRequestParams() {
        return this.drmRequestParams;
    }

    public final String getProvisioningUrl() {
        return this.provisioningUrl;
    }

    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    public int hashCode() {
        int hashCode = this.proxyUrl.hashCode() * 31;
        String str = this.provisioningUrl;
        return this.drmRequestParams.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DrmProxy(proxyUrl='" + this.proxyUrl + "', provisioningUrl=" + this.provisioningUrl + ", drmRequestParams=" + this.drmRequestParams + ')';
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy$Builder;", "", "drmProxy", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;)V", "proxyUrl", "", "provisioningUrl", "drmRequestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "getDrmRequestParams", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "setDrmRequestParams", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "getProvisioningUrl", "()Ljava/lang/String;", "setProvisioningUrl", "(Ljava/lang/String;)V", "getProxyUrl", "setProxyUrl", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DrmRequestParams drmRequestParams;
        private String provisioningUrl;
        private String proxyUrl;

        public Builder(DrmProxy drmProxy) {
            this(drmProxy.getProxyUrl(), drmProxy.getProvisioningUrl(), drmProxy.getDrmRequestParams());
        }

        public final DrmProxy build$video_player_internalRelease() {
            return new DrmProxy(this.proxyUrl, this.provisioningUrl, this.drmRequestParams);
        }

        public final DrmRequestParams getDrmRequestParams() {
            return this.drmRequestParams;
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

        public final void setProvisioningUrl(String str) {
            this.provisioningUrl = str;
        }

        public final void setProxyUrl(String str) {
            this.proxyUrl = str;
        }

        public Builder(String str, String str2, DrmRequestParams drmRequestParams) {
            this.proxyUrl = str;
            this.provisioningUrl = str2;
            this.drmRequestParams = drmRequestParams;
        }
    }
}
