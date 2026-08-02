package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/data/DelegatePrepareParams;", "", "prepareWithoutInitCodecs", "", "preferredH264", "manifestDataSourceParameters", "Lru/yandex/video/m3/data/DataSourceParameters;", "chunkDataSourceParameters", "playbackParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "(ZZLru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/PlaybackParameters;)V", "getChunkDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters", "getPlaybackParameters", "()Lru/yandex/video/m3/data/PlaybackParameters;", "getPreferredH264", "()Z", "getPrepareWithoutInitCodecs", "equals", "other", "hashCode", "", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DelegatePrepareParams {
    public static final int $stable = 8;
    private final DataSourceParameters chunkDataSourceParameters;
    private final DataSourceParameters manifestDataSourceParameters;
    private final PlaybackParameters playbackParameters;
    private final boolean preferredH264;
    private final boolean prepareWithoutInitCodecs;

    private DelegatePrepareParams(boolean z, boolean z2, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, PlaybackParameters playbackParameters) {
        this.prepareWithoutInitCodecs = z;
        this.preferredH264 = z2;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
        this.playbackParameters = playbackParameters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DelegatePrepareParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DelegatePrepareParams delegatePrepareParams = (DelegatePrepareParams) other;
        return this.prepareWithoutInitCodecs == delegatePrepareParams.prepareWithoutInitCodecs && this.preferredH264 == delegatePrepareParams.preferredH264 && jl40.l(this.manifestDataSourceParameters, delegatePrepareParams.manifestDataSourceParameters) && jl40.l(this.chunkDataSourceParameters, delegatePrepareParams.chunkDataSourceParameters) && jl40.l(this.playbackParameters, delegatePrepareParams.playbackParameters);
    }

    public final DataSourceParameters getChunkDataSourceParameters() {
        return this.chunkDataSourceParameters;
    }

    public final DataSourceParameters getManifestDataSourceParameters() {
        return this.manifestDataSourceParameters;
    }

    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    public final boolean getPreferredH264() {
        return this.preferredH264;
    }

    public final boolean getPrepareWithoutInitCodecs() {
        return this.prepareWithoutInitCodecs;
    }

    public int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.prepareWithoutInitCodecs) * 31, 31, this.preferredH264);
        DataSourceParameters dataSourceParameters = this.manifestDataSourceParameters;
        int hashCode = (e + (dataSourceParameters != null ? dataSourceParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters2 = this.chunkDataSourceParameters;
        int hashCode2 = (hashCode + (dataSourceParameters2 != null ? dataSourceParameters2.hashCode() : 0)) * 31;
        PlaybackParameters playbackParameters = this.playbackParameters;
        return hashCode2 + (playbackParameters != null ? playbackParameters.hashCode() : 0);
    }

    public String toString() {
        return "DelegatePrepareParams(chunkDataSourceParameters=" + this.chunkDataSourceParameters + ", prepareWithoutInitCodecs=" + this.prepareWithoutInitCodecs + ", preferredH264=" + this.preferredH264 + ", manifestDataSourceParameters=" + this.manifestDataSourceParameters + ", playbackParameters=" + this.playbackParameters + ')';
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001fJ\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001fR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006 "}, d2 = {"Lru/yandex/video/m3/data/DelegatePrepareParams$Builder;", "", "()V", "<set-?>", "Lru/yandex/video/m3/data/DataSourceParameters;", "chunkDataSourceParameters", "getChunkDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "setChunkDataSourceParameters", "(Lru/yandex/video/m3/data/DataSourceParameters;)V", "manifestDataSourceParameters", "getManifestDataSourceParameters", "setManifestDataSourceParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "getPlaybackParameters", "()Lru/yandex/video/m3/data/PlaybackParameters;", "setPlaybackParameters", "(Lru/yandex/video/m3/data/PlaybackParameters;)V", "", "preferredH264", "getPreferredH264", "()Ljava/lang/Boolean;", "setPreferredH264", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "prepareWithoutInitCodecs", "getPrepareWithoutInitCodecs", "setPrepareWithoutInitCodecs", "build", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "(Ljava/lang/Boolean;)Lru/yandex/video/m3/data/DelegatePrepareParams$Builder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DataSourceParameters chunkDataSourceParameters;
        private DataSourceParameters manifestDataSourceParameters;
        private PlaybackParameters playbackParameters;
        private Boolean preferredH264;
        private Boolean prepareWithoutInitCodecs;

        public final DelegatePrepareParams build() {
            Boolean bool = this.prepareWithoutInitCodecs;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.preferredH264;
            return new DelegatePrepareParams(booleanValue, bool2 != null ? bool2.booleanValue() : false, this.manifestDataSourceParameters, this.chunkDataSourceParameters, this.playbackParameters, null);
        }

        public final DataSourceParameters getChunkDataSourceParameters() {
            return this.chunkDataSourceParameters;
        }

        public final DataSourceParameters getManifestDataSourceParameters() {
            return this.manifestDataSourceParameters;
        }

        public final PlaybackParameters getPlaybackParameters() {
            return this.playbackParameters;
        }

        public final Boolean getPreferredH264() {
            return this.preferredH264;
        }

        public final Boolean getPrepareWithoutInitCodecs() {
            return this.prepareWithoutInitCodecs;
        }

        public final /* synthetic */ void setChunkDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.chunkDataSourceParameters = dataSourceParameters;
        }

        public final /* synthetic */ void setManifestDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.manifestDataSourceParameters = dataSourceParameters;
        }

        public final /* synthetic */ void setPlaybackParameters(PlaybackParameters playbackParameters) {
            this.playbackParameters = playbackParameters;
        }

        /* renamed from: setPreferredH264, reason: collision with other method in class */
        public final /* synthetic */ void m736setPreferredH264(Boolean bool) {
            this.preferredH264 = bool;
        }

        /* renamed from: setPrepareWithoutInitCodecs, reason: collision with other method in class */
        public final /* synthetic */ void m737setPrepareWithoutInitCodecs(Boolean bool) {
            this.prepareWithoutInitCodecs = bool;
        }

        public final Builder setPreferredH264(Boolean preferredH264) {
            this.preferredH264 = preferredH264;
            return this;
        }

        public final Builder setPrepareWithoutInitCodecs(Boolean prepareWithoutInitCodecs) {
            this.prepareWithoutInitCodecs = prepareWithoutInitCodecs;
            return this;
        }
    }

    public /* synthetic */ DelegatePrepareParams(boolean z, boolean z2, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, PlaybackParameters playbackParameters, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, dataSourceParameters, dataSourceParameters2, playbackParameters);
    }
}
