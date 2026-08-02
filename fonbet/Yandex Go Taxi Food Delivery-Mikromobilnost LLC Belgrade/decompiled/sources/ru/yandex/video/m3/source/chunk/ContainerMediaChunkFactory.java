package ru.yandex.video.m3.source.chunk;

import androidx.media3.common.a;
import defpackage.fee;
import defpackage.hl51;
import defpackage.jxi;
import defpackage.kpg;
import defpackage.npg;
import defpackage.nsb;
import defpackage.osb;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u008b\u0001\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006%"}, d2 = {"Lru/yandex/video/m3/source/chunk/ContainerMediaChunkFactory;", "", "<init>", "()V", "", "value", "shouldValidateRangeRequests", "(Z)Lru/yandex/video/m3/source/chunk/ContainerMediaChunkFactory;", "shouldInterruptPendingRequests", "enableLowLatency$video_player_internalRelease", "enableLowLatency", "Lkpg;", "dataSource", "Lnpg;", "dataSpec", "Landroidx/media3/common/a;", "trackFormat", "", "trackSelectionReason", "trackSelectionData", "", "startTimeUs", "endTimeUs", "clippedStartTimeUs", "clippedEndTimeUs", "chunkIndex", "chunkCount", "sampleOffsetUs", "Losb;", "chunkExtractor", "shouldSpliceIn", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lnsb;", "createChunk", "(Lkpg;Lnpg;Landroidx/media3/common/a;ILjava/lang/Object;JJJJJIJLosb;ZI)Lnsb;", "validateRangeRequests", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContainerMediaChunkFactory {
    public static final int $stable = 8;
    private boolean enableLowLatency;
    private boolean validateRangeRequests;

    public final nsb createChunk(kpg dataSource, npg dataSpec, a trackFormat, int trackSelectionReason, Object trackSelectionData, long startTimeUs, long endTimeUs, long clippedStartTimeUs, long clippedEndTimeUs, long chunkIndex, int chunkCount, long sampleOffsetUs, osb chunkExtractor, boolean shouldSpliceIn, int trackType) {
        return (this.validateRangeRequests || this.enableLowLatency) ? new hl51(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, clippedStartTimeUs, clippedEndTimeUs, chunkIndex, chunkCount, sampleOffsetUs, chunkExtractor) : new fee(dataSource, dataSpec, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, clippedStartTimeUs, clippedEndTimeUs, chunkIndex, chunkCount, sampleOffsetUs, chunkExtractor);
    }

    public final ContainerMediaChunkFactory enableLowLatency$video_player_internalRelease(boolean value) {
        this.enableLowLatency = value;
        return this;
    }

    @jxi
    public final ContainerMediaChunkFactory shouldInterruptPendingRequests(boolean value) {
        return this;
    }

    public final ContainerMediaChunkFactory shouldValidateRangeRequests(boolean value) {
        this.validateRangeRequests = value;
        return this;
    }
}
