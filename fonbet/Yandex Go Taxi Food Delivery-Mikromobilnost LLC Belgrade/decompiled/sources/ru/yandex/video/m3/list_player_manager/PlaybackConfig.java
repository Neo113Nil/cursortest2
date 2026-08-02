package ru.yandex.video.m3.list_player_manager;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\u000bHÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "", "autoplay", "", "startPosition", "", "loopPlayback", "isMuted", "additionalParameters", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "(ZJZZLjava/util/Map;)V", "getAdditionalParameters", "()Ljava/util/Map;", "getAutoplay", "()Z", "getLoopPlayback", "getStartPosition", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaybackConfig {
    public static final int $stable = 8;
    private final Map<String, Object> additionalParameters;
    private final boolean autoplay;
    private final boolean isMuted;
    private final boolean loopPlayback;
    private final long startPosition;

    public /* synthetic */ PlaybackConfig(boolean z, long j, boolean z2, boolean z3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, z2, z3, (i & 16) != 0 ? null : map);
    }

    public static /* synthetic */ PlaybackConfig copy$default(PlaybackConfig playbackConfig, boolean z, long j, boolean z2, boolean z3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = playbackConfig.autoplay;
        }
        if ((i & 2) != 0) {
            j = playbackConfig.startPosition;
        }
        if ((i & 4) != 0) {
            z2 = playbackConfig.loopPlayback;
        }
        if ((i & 8) != 0) {
            z3 = playbackConfig.isMuted;
        }
        if ((i & 16) != 0) {
            map = playbackConfig.additionalParameters;
        }
        Map map2 = map;
        boolean z4 = z2;
        return playbackConfig.copy(z, j, z4, z3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoplay() {
        return this.autoplay;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartPosition() {
        return this.startPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoopPlayback() {
        return this.loopPlayback;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    public final Map<String, Object> component5() {
        return this.additionalParameters;
    }

    public final PlaybackConfig copy(boolean autoplay, long startPosition, boolean loopPlayback, boolean isMuted, Map<String, ? extends Object> additionalParameters) {
        return new PlaybackConfig(autoplay, startPosition, loopPlayback, isMuted, additionalParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackConfig)) {
            return false;
        }
        PlaybackConfig playbackConfig = (PlaybackConfig) other;
        return this.autoplay == playbackConfig.autoplay && this.startPosition == playbackConfig.startPosition && this.loopPlayback == playbackConfig.loopPlayback && this.isMuted == playbackConfig.isMuted && jl40.l(this.additionalParameters, playbackConfig.additionalParameters);
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final boolean getLoopPlayback() {
        return this.loopPlayback;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(qv10.c(Boolean.hashCode(this.autoplay) * 31, 31, this.startPosition), 31, this.loopPlayback), 31, this.isMuted);
        Map<String, Object> map = this.additionalParameters;
        return e + (map == null ? 0 : map.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackConfig(autoplay=");
        sb.append(this.autoplay);
        sb.append(", startPosition=");
        sb.append(this.startPosition);
        sb.append(", loopPlayback=");
        sb.append(this.loopPlayback);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", additionalParameters=");
        return smw0.n(sb, this.additionalParameters, ')');
    }

    public PlaybackConfig(boolean z, long j, boolean z2, boolean z3, Map<String, ? extends Object> map) {
        this.autoplay = z;
        this.startPosition = j;
        this.loopPlayback = z2;
        this.isMuted = z3;
        this.additionalParameters = map;
    }
}
