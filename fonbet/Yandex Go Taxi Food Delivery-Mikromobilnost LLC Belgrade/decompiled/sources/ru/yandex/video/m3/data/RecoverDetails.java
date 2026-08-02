package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.player.PreparingParams;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001#B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/data/RecoverDetails;", "", "", "externalPlayWhenReady", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "Lru/yandex/video/m3/data/PlaybackStats;", "playbackStats", "<init>", "(ZLru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/data/PlaybackStats;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/RecoverDetails$Builder;", "Lzy11;", "builderAction", "copy$video_player_internalRelease", "(Ltls;)Lru/yandex/video/m3/data/RecoverDetails;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getExternalPlayWhenReady", "()Z", "Lru/yandex/video/m3/player/PreparingParams;", "getPreparingParams", "()Lru/yandex/video/m3/player/PreparingParams;", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecoverDetails {
    public static final int $stable = 8;
    private final boolean externalPlayWhenReady;
    private final PlaybackStats playbackStats;
    private final PreparingParams preparingParams;

    private RecoverDetails(boolean z, PreparingParams preparingParams, PlaybackStats playbackStats) {
        this.externalPlayWhenReady = z;
        this.preparingParams = preparingParams;
        this.playbackStats = playbackStats;
    }

    public static /* synthetic */ RecoverDetails copy$video_player_internalRelease$default(RecoverDetails recoverDetails, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.RecoverDetails$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((RecoverDetails.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(RecoverDetails.Builder builder) {
                }
            };
        }
        return recoverDetails.copy$video_player_internalRelease(tlsVar);
    }

    public final RecoverDetails copy$video_player_internalRelease(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RecoverDetails.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        RecoverDetails recoverDetails = (RecoverDetails) other;
        return this.externalPlayWhenReady == recoverDetails.externalPlayWhenReady && jl40.l(this.preparingParams, recoverDetails.preparingParams) && jl40.l(this.playbackStats, recoverDetails.playbackStats);
    }

    public final boolean getExternalPlayWhenReady() {
        return this.externalPlayWhenReady;
    }

    public final PlaybackStats getPlaybackStats() {
        return this.playbackStats;
    }

    public final PreparingParams getPreparingParams() {
        return this.preparingParams;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.externalPlayWhenReady) * 31;
        PreparingParams preparingParams = this.preparingParams;
        int hashCode2 = (hashCode + (preparingParams != null ? preparingParams.hashCode() : 0)) * 31;
        PlaybackStats playbackStats = this.playbackStats;
        return hashCode2 + (playbackStats != null ? playbackStats.hashCode() : 0);
    }

    public String toString() {
        return "RecoverDetails(externalPlayWhenReady=" + this.externalPlayWhenReady + ", preparingParams=" + this.preparingParams + ", playbackStats=" + this.playbackStats + ')';
    }

    public /* synthetic */ RecoverDetails(boolean z, PreparingParams preparingParams, PlaybackStats playbackStats, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, preparingParams, playbackStats);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/data/RecoverDetails$Builder;", "", "instance", "Lru/yandex/video/m3/data/RecoverDetails;", "(Lru/yandex/video/m3/data/RecoverDetails;)V", "externalPlayWhenReady", "", "(Z)V", "getExternalPlayWhenReady", "()Z", "setExternalPlayWhenReady", "playbackStats", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "setPlaybackStats", "(Lru/yandex/video/m3/data/PlaybackStats;)V", "preparingParams", "Lru/yandex/video/m3/player/PreparingParams;", "getPreparingParams", "()Lru/yandex/video/m3/player/PreparingParams;", "setPreparingParams", "(Lru/yandex/video/m3/player/PreparingParams;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private boolean externalPlayWhenReady;
        private PlaybackStats playbackStats;
        private PreparingParams preparingParams;

        public Builder(RecoverDetails recoverDetails) {
            this(recoverDetails.getExternalPlayWhenReady());
            this.preparingParams = recoverDetails.getPreparingParams();
            this.playbackStats = recoverDetails.getPlaybackStats();
        }

        public final RecoverDetails build$video_player_internalRelease() {
            return new RecoverDetails(this.externalPlayWhenReady, this.preparingParams, this.playbackStats, null);
        }

        public final boolean getExternalPlayWhenReady() {
            return this.externalPlayWhenReady;
        }

        public final PlaybackStats getPlaybackStats() {
            return this.playbackStats;
        }

        public final PreparingParams getPreparingParams() {
            return this.preparingParams;
        }

        public final void setExternalPlayWhenReady(boolean z) {
            this.externalPlayWhenReady = z;
        }

        public final void setPlaybackStats(PlaybackStats playbackStats) {
            this.playbackStats = playbackStats;
        }

        public final void setPreparingParams(PreparingParams preparingParams) {
            this.preparingParams = preparingParams;
        }

        public Builder(boolean z) {
            this.externalPlayWhenReady = z;
        }
    }
}
