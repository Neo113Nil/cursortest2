package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/data/DrmParameters;", "", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "drmConfig", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "drmSecurityLevel", "<init>", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/DrmParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/DrmParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "getDrmSecurityLevel", "()Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmParameters {
    public static final int $stable = 0;
    private final DrmConfig drmConfig;
    private final DrmSecurityLevel drmSecurityLevel;

    private DrmParameters(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel) {
        this.drmConfig = drmConfig;
        this.drmSecurityLevel = drmSecurityLevel;
    }

    public static /* synthetic */ DrmParameters copy$default(DrmParameters drmParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.DrmParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmParameters.Builder builder) {
                }
            };
        }
        return drmParameters.copy(tlsVar);
    }

    public final DrmParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DrmParameters drmParameters = (DrmParameters) other;
        return jl40.l(this.drmConfig, drmParameters.drmConfig) && this.drmSecurityLevel == drmParameters.drmSecurityLevel;
    }

    public final DrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    public final DrmSecurityLevel getDrmSecurityLevel() {
        return this.drmSecurityLevel;
    }

    public int hashCode() {
        return this.drmSecurityLevel.hashCode() + (this.drmConfig.hashCode() * 31);
    }

    public String toString() {
        return "DrmParameters(drmConfig=" + this.drmConfig + ", drmSecurityLevel=" + this.drmSecurityLevel + ')';
    }

    public /* synthetic */ DrmParameters(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(drmConfig, drmSecurityLevel);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/data/DrmParameters$Builder;", "", "drmParameters", "Lru/yandex/video/m3/data/DrmParameters;", "(Lru/yandex/video/m3/data/DrmParameters;)V", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "drmSecurityLevel", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "setDrmConfig", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;)V", "getDrmSecurityLevel", "()Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "setDrmSecurityLevel", "(Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DrmConfig drmConfig;
        private DrmSecurityLevel drmSecurityLevel;

        public Builder(DrmParameters drmParameters) {
            this(drmParameters.getDrmConfig(), drmParameters.getDrmSecurityLevel());
        }

        public final DrmParameters build$video_player_internalRelease() {
            return new DrmParameters(this.drmConfig, this.drmSecurityLevel, null);
        }

        public final DrmConfig getDrmConfig() {
            return this.drmConfig;
        }

        public final DrmSecurityLevel getDrmSecurityLevel() {
            return this.drmSecurityLevel;
        }

        public final void setDrmConfig(DrmConfig drmConfig) {
            this.drmConfig = drmConfig;
        }

        public final void setDrmSecurityLevel(DrmSecurityLevel drmSecurityLevel) {
            this.drmSecurityLevel = drmSecurityLevel;
        }

        public Builder(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel) {
            this.drmConfig = drmConfig;
            this.drmSecurityLevel = drmSecurityLevel;
        }
    }
}
