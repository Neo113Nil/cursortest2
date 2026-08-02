package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lru/yandex/video/m3/data/ExtendedStalledReason;", "", "stalledReason", "Lru/yandex/video/m3/data/StalledReason;", "isLoadingBecauseInit", "", "isLoadingBecauseSetSource", "isLoadingBecauseRecover", "loadingBecauseSeeking", "loadingBecauseTrackChanged", "loadingBecauseLiveEdge", "firstEverStart", "loadingByInitOrSetSourceWithoutInitCodec", "playWhenReady", "initializedVideoDecoderCounter", "", "allowPrepareWithoutInitCodec", "isVideoTrackEnabled", "loadingBecauseAdPlayingStarting", "loadingBecauseAdPlayingEnding", "lastPlayWhenReadyChanged", "Lru/yandex/video/m3/data/LastPlayWhenReadyChanged;", "isPlaybackResumedSinceLastSetSource", "(Lru/yandex/video/m3/data/StalledReason;ZZZZZZZZZIZZZZLru/yandex/video/m3/data/LastPlayWhenReadyChanged;Z)V", "getAllowPrepareWithoutInitCodec", "()Z", "getFirstEverStart", "getInitializedVideoDecoderCounter", "()I", "getLastPlayWhenReadyChanged", "()Lru/yandex/video/m3/data/LastPlayWhenReadyChanged;", "getLoadingBecauseAdPlayingEnding", "getLoadingBecauseAdPlayingStarting", "getLoadingBecauseLiveEdge", "getLoadingBecauseSeeking", "getLoadingBecauseTrackChanged", "getLoadingByInitOrSetSourceWithoutInitCodec", "getPlayWhenReady", "getStalledReason", "()Lru/yandex/video/m3/data/StalledReason;", "equals", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ExtendedStalledReason {
    public static final int $stable = 0;
    private final boolean allowPrepareWithoutInitCodec;
    private final boolean firstEverStart;
    private final int initializedVideoDecoderCounter;
    private final boolean isLoadingBecauseInit;
    private final boolean isLoadingBecauseRecover;
    private final boolean isLoadingBecauseSetSource;
    private final boolean isPlaybackResumedSinceLastSetSource;
    private final boolean isVideoTrackEnabled;
    private final LastPlayWhenReadyChanged lastPlayWhenReadyChanged;
    private final boolean loadingBecauseAdPlayingEnding;
    private final boolean loadingBecauseAdPlayingStarting;
    private final boolean loadingBecauseLiveEdge;
    private final boolean loadingBecauseSeeking;
    private final boolean loadingBecauseTrackChanged;
    private final boolean loadingByInitOrSetSourceWithoutInitCodec;
    private final boolean playWhenReady;

    @NotNull
    private final StalledReason stalledReason;

    public ExtendedStalledReason(@NotNull StalledReason stalledReason, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, boolean z10, boolean z11, boolean z12, boolean z13, LastPlayWhenReadyChanged lastPlayWhenReadyChanged, boolean z14) {
        stalledReason.getClass();
        this.stalledReason = stalledReason;
        this.isLoadingBecauseInit = z;
        this.isLoadingBecauseSetSource = z2;
        this.isLoadingBecauseRecover = z3;
        this.loadingBecauseSeeking = z4;
        this.loadingBecauseTrackChanged = z5;
        this.loadingBecauseLiveEdge = z6;
        this.firstEverStart = z7;
        this.loadingByInitOrSetSourceWithoutInitCodec = z8;
        this.playWhenReady = z9;
        this.initializedVideoDecoderCounter = i;
        this.allowPrepareWithoutInitCodec = z10;
        this.isVideoTrackEnabled = z11;
        this.loadingBecauseAdPlayingStarting = z12;
        this.loadingBecauseAdPlayingEnding = z13;
        this.lastPlayWhenReadyChanged = lastPlayWhenReadyChanged;
        this.isPlaybackResumedSinceLastSetSource = z14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ExtendedStalledReason.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ExtendedStalledReason extendedStalledReason = (ExtendedStalledReason) other;
        return this.stalledReason == extendedStalledReason.stalledReason && this.isLoadingBecauseInit == extendedStalledReason.isLoadingBecauseInit && this.isLoadingBecauseSetSource == extendedStalledReason.isLoadingBecauseSetSource && this.isLoadingBecauseRecover == extendedStalledReason.isLoadingBecauseRecover && this.loadingBecauseSeeking == extendedStalledReason.loadingBecauseSeeking && this.loadingBecauseTrackChanged == extendedStalledReason.loadingBecauseTrackChanged && this.loadingBecauseLiveEdge == extendedStalledReason.loadingBecauseLiveEdge && this.firstEverStart == extendedStalledReason.firstEverStart && this.loadingByInitOrSetSourceWithoutInitCodec == extendedStalledReason.loadingByInitOrSetSourceWithoutInitCodec && this.playWhenReady == extendedStalledReason.playWhenReady && this.initializedVideoDecoderCounter == extendedStalledReason.initializedVideoDecoderCounter && this.allowPrepareWithoutInitCodec == extendedStalledReason.allowPrepareWithoutInitCodec && this.isVideoTrackEnabled == extendedStalledReason.isVideoTrackEnabled && this.loadingBecauseAdPlayingStarting == extendedStalledReason.loadingBecauseAdPlayingStarting && this.loadingBecauseAdPlayingEnding == extendedStalledReason.loadingBecauseAdPlayingEnding && Intrinsics.d(this.lastPlayWhenReadyChanged, extendedStalledReason.lastPlayWhenReadyChanged) && this.isPlaybackResumedSinceLastSetSource == extendedStalledReason.isPlaybackResumedSinceLastSetSource;
    }

    public final boolean getAllowPrepareWithoutInitCodec() {
        return this.allowPrepareWithoutInitCodec;
    }

    public final boolean getFirstEverStart() {
        return this.firstEverStart;
    }

    public final int getInitializedVideoDecoderCounter() {
        return this.initializedVideoDecoderCounter;
    }

    public final LastPlayWhenReadyChanged getLastPlayWhenReadyChanged() {
        return this.lastPlayWhenReadyChanged;
    }

    public final boolean getLoadingBecauseAdPlayingEnding() {
        return this.loadingBecauseAdPlayingEnding;
    }

    public final boolean getLoadingBecauseAdPlayingStarting() {
        return this.loadingBecauseAdPlayingStarting;
    }

    public final boolean getLoadingBecauseLiveEdge() {
        return this.loadingBecauseLiveEdge;
    }

    public final boolean getLoadingBecauseSeeking() {
        return this.loadingBecauseSeeking;
    }

    public final boolean getLoadingBecauseTrackChanged() {
        return this.loadingBecauseTrackChanged;
    }

    public final boolean getLoadingByInitOrSetSourceWithoutInitCodec() {
        return this.loadingByInitOrSetSourceWithoutInitCodec;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @NotNull
    public final StalledReason getStalledReason() {
        return this.stalledReason;
    }

    public int hashCode() {
        int e = k5r.e(k5r.e(k5r.e(k5r.e((k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(this.stalledReason.hashCode() * 31, 31, this.isLoadingBecauseInit), 31, this.isLoadingBecauseSetSource), 31, this.isLoadingBecauseRecover), 31, this.loadingBecauseSeeking), 31, this.loadingBecauseTrackChanged), 31, this.loadingBecauseLiveEdge), 31, this.firstEverStart), 31, this.loadingByInitOrSetSourceWithoutInitCodec), 31, this.playWhenReady) + this.initializedVideoDecoderCounter) * 31, 31, this.allowPrepareWithoutInitCodec), 31, this.isVideoTrackEnabled), 31, this.loadingBecauseAdPlayingStarting), 31, this.loadingBecauseAdPlayingEnding);
        LastPlayWhenReadyChanged lastPlayWhenReadyChanged = this.lastPlayWhenReadyChanged;
        return Boolean.hashCode(this.isPlaybackResumedSinceLastSetSource) + ((e + (lastPlayWhenReadyChanged != null ? lastPlayWhenReadyChanged.hashCode() : 0)) * 31);
    }

    /* renamed from: isLoadingBecauseInit, reason: from getter */
    public final boolean getIsLoadingBecauseInit() {
        return this.isLoadingBecauseInit;
    }

    /* renamed from: isLoadingBecauseRecover, reason: from getter */
    public final boolean getIsLoadingBecauseRecover() {
        return this.isLoadingBecauseRecover;
    }

    /* renamed from: isLoadingBecauseSetSource, reason: from getter */
    public final boolean getIsLoadingBecauseSetSource() {
        return this.isLoadingBecauseSetSource;
    }

    /* renamed from: isPlaybackResumedSinceLastSetSource, reason: from getter */
    public final boolean getIsPlaybackResumedSinceLastSetSource() {
        return this.isPlaybackResumedSinceLastSetSource;
    }

    /* renamed from: isVideoTrackEnabled, reason: from getter */
    public final boolean getIsVideoTrackEnabled() {
        return this.isVideoTrackEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtendedStalledReason(stalledReason=");
        sb.append(this.stalledReason);
        sb.append(", isLoadingBecauseInit=");
        sb.append(this.isLoadingBecauseInit);
        sb.append(", isLoadingBecauseSetSource=");
        sb.append(this.isLoadingBecauseSetSource);
        sb.append(", isLoadingBecauseRecover=");
        sb.append(this.isLoadingBecauseRecover);
        sb.append(", loadingBecauseSeeking=");
        sb.append(this.loadingBecauseSeeking);
        sb.append(", loadingBecauseTrackChanged=");
        sb.append(this.loadingBecauseTrackChanged);
        sb.append(", loadingBecauseLiveEdge=");
        sb.append(this.loadingBecauseLiveEdge);
        sb.append(", firstEverStart=");
        sb.append(this.firstEverStart);
        sb.append(", loadingByInitOrSetSourceWithoutInitCodec=");
        sb.append(this.loadingByInitOrSetSourceWithoutInitCodec);
        sb.append(", playWhenReady=");
        sb.append(this.playWhenReady);
        sb.append(", initializedVideoDecoderCounter=");
        sb.append(this.initializedVideoDecoderCounter);
        sb.append(", allowPrepareWithoutInitCodec=");
        sb.append(this.allowPrepareWithoutInitCodec);
        sb.append(", isVideoTrackEnabled=");
        sb.append(this.isVideoTrackEnabled);
        sb.append(", loadingBecauseAdPlayingStarting=");
        sb.append(this.loadingBecauseAdPlayingStarting);
        sb.append(", loadingBecauseAdPlayingEnding=");
        sb.append(this.loadingBecauseAdPlayingEnding);
        sb.append(", lastPlayWhenReadyChanged=");
        sb.append(this.lastPlayWhenReadyChanged);
        sb.append(", isPlaybackResumedSinceLastSetSource=");
        return dfi.j(sb, this.isPlaybackResumedSinceLastSetSource, ')');
    }
}
