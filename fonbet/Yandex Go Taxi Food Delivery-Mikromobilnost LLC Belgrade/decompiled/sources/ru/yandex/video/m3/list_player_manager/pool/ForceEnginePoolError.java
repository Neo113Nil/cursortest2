package ru.yandex.video.m3.list_player_manager.pool;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/list_player_manager/pool/ForceEnginePoolError;", "", "playerIndex", "", "playbackConfig", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playersIndexWithEngine", "", "(ILru/yandex/video/m3/list_player_manager/PlaybackConfig;Ljava/util/List;)V", "getPlaybackConfig", "()Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "getPlayerIndex", "()I", "getPlayersIndexWithEngine", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ForceEnginePoolError {
    public static final int $stable = 8;
    private final PlaybackConfig playbackConfig;
    private final int playerIndex;
    private final List<Integer> playersIndexWithEngine;

    public ForceEnginePoolError(int i, PlaybackConfig playbackConfig, List<Integer> list) {
        this.playerIndex = i;
        this.playbackConfig = playbackConfig;
        this.playersIndexWithEngine = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForceEnginePoolError copy$default(ForceEnginePoolError forceEnginePoolError, int i, PlaybackConfig playbackConfig, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = forceEnginePoolError.playerIndex;
        }
        if ((i2 & 2) != 0) {
            playbackConfig = forceEnginePoolError.playbackConfig;
        }
        if ((i2 & 4) != 0) {
            list = forceEnginePoolError.playersIndexWithEngine;
        }
        return forceEnginePoolError.copy(i, playbackConfig, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final PlaybackConfig getPlaybackConfig() {
        return this.playbackConfig;
    }

    public final List<Integer> component3() {
        return this.playersIndexWithEngine;
    }

    public final ForceEnginePoolError copy(int playerIndex, PlaybackConfig playbackConfig, List<Integer> playersIndexWithEngine) {
        return new ForceEnginePoolError(playerIndex, playbackConfig, playersIndexWithEngine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForceEnginePoolError)) {
            return false;
        }
        ForceEnginePoolError forceEnginePoolError = (ForceEnginePoolError) other;
        return this.playerIndex == forceEnginePoolError.playerIndex && jl40.l(this.playbackConfig, forceEnginePoolError.playbackConfig) && jl40.l(this.playersIndexWithEngine, forceEnginePoolError.playersIndexWithEngine);
    }

    public final PlaybackConfig getPlaybackConfig() {
        return this.playbackConfig;
    }

    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    public final List<Integer> getPlayersIndexWithEngine() {
        return this.playersIndexWithEngine;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.playerIndex) * 31;
        PlaybackConfig playbackConfig = this.playbackConfig;
        return this.playersIndexWithEngine.hashCode() + ((hashCode + (playbackConfig == null ? 0 : playbackConfig.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForceEnginePoolError(playerIndex=");
        sb.append(this.playerIndex);
        sb.append(", playbackConfig=");
        sb.append(this.playbackConfig);
        sb.append(", playersIndexWithEngine=");
        return unr0.t(sb, this.playersIndexWithEngine, ')');
    }
}
