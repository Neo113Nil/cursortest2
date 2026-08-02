package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class DefaultLoadControl {
    public static final RegularImmutableList LOCAL_PLAYBACK_SCHEMES;
    public final DefaultAllocator allocator;
    public final long backBufferDurationUs;
    public final long bufferForPlaybackAfterRebufferForLocalPlaybackUs;
    public final long bufferForPlaybackAfterRebufferUs;
    public final long bufferForPlaybackForLocalPlaybackUs;
    public final long bufferForPlaybackUs;
    public final ConcurrentHashMap loadingStates;
    public final long maxBufferForLocalPlaybackUs;
    public final long maxBufferUs;
    public final long minBufferForLocalPlaybackUs;
    public final long minBufferUs;
    public final Timeline.Period period;
    public final RegularImmutableMap playerTargetBufferBytesOverwrites;
    public final boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
    public final int targetBufferBytesOverwrite;
    public long threadId;
    public final Timeline.Window window;

    public final class PlayerLoadingState {
        public int allocatedCounts;
        public boolean isLoading;
        public int referenceCount;
        public int targetBufferBytes;
    }

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        PlatformKt.checkElementsNotNull(6, objArr);
        LOCAL_PLAYBACK_SCHEMES = ImmutableList.asImmutableList(6, objArr);
    }

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator();
        assertGreaterOrEqual("bufferForPlaybackMs", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, "0");
        assertGreaterOrEqual("bufferForPlaybackForLocalPlaybackMs", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, "0");
        assertGreaterOrEqual("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        assertGreaterOrEqual("bufferForPlaybackAfterRebufferForLocalPlaybackMs", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, "0");
        assertGreaterOrEqual("minBufferMs", 50000, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "bufferForPlaybackMs");
        assertGreaterOrEqual("minBufferForLocalPlaybackMs", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "bufferForPlaybackForLocalPlaybackMs");
        assertGreaterOrEqual("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual("minBufferForLocalPlaybackMs", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        assertGreaterOrEqual("maxBufferMs", 50000, 50000, "minBufferMs");
        assertGreaterOrEqual("maxBufferForLocalPlaybackMs", 50000, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, "minBufferForLocalPlaybackMs");
        assertGreaterOrEqual("backBufferDurationMs", 0, 0, "0");
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.allocator = defaultAllocator;
        long msToUs = Util.msToUs(50000L);
        this.minBufferUs = msToUs;
        long msToUs2 = Util.msToUs(1000L);
        this.minBufferForLocalPlaybackUs = msToUs2;
        this.maxBufferUs = msToUs;
        this.maxBufferForLocalPlaybackUs = msToUs;
        this.bufferForPlaybackUs = msToUs2;
        this.bufferForPlaybackForLocalPlaybackUs = msToUs2;
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(2000L);
        this.bufferForPlaybackAfterRebufferForLocalPlaybackUs = msToUs2;
        this.targetBufferBytesOverwrite = -1;
        this.prioritizeTimeOverSizeThresholdsForLocalPlayback = true;
        this.backBufferDurationUs = Util.msToUs(0L);
        this.loadingStates = new ConcurrentHashMap();
        this.playerTargetBufferBytesOverwrites = RegularImmutableMap.copyOf((Map) RegularImmutableMap.EMPTY);
        this.threadId = -1L;
    }

    public static void assertGreaterOrEqual(String str, int i, int i2, String str2) {
        Trace.checkArgument(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldContinueLoading(LoadControl$Parameters loadControl$Parameters) {
        int i;
        boolean z;
        long j;
        float f;
        PlayerId playerId = loadControl$Parameters.playerId;
        long j2 = loadControl$Parameters.bufferedDurationUs;
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        PlayerLoadingState playerLoadingState2 = (PlayerLoadingState) this.loadingStates.get(playerId);
        playerLoadingState2.getClass();
        synchronized (playerLoadingState2) {
            i = playerLoadingState2.allocatedCounts;
        }
        int i2 = i * this.allocator.individualAllocationSize;
        PlayerLoadingState playerLoadingState3 = (PlayerLoadingState) this.loadingStates.get(playerId);
        playerLoadingState3.getClass();
        boolean z2 = i2 >= playerLoadingState3.targetBufferBytes;
        if (playerId.equals(PlayerId.PRELOAD)) {
            return !z2;
        }
        Timeline timeline = loadControl$Parameters.timeline;
        MediaItem.LocalConfiguration localConfiguration = timeline.getWindow(timeline.getPeriodByUid(loadControl$Parameters.mediaPeriodId.periodUid, this.period).windowIndex, this.window, 0L).mediaItem.localConfiguration;
        if (localConfiguration != null) {
            String scheme = localConfiguration.uri.getScheme();
            if (TextUtils.isEmpty(scheme) || LOCAL_PLAYBACK_SCHEMES.contains(scheme)) {
                z = true;
                j = !z ? this.minBufferForLocalPlaybackUs : this.minBufferUs;
                long j3 = !z ? this.maxBufferForLocalPlaybackUs : this.maxBufferUs;
                f = loadControl$Parameters.playbackSpeed;
                if (f > 1.0f) {
                    j = Math.min(Util.getMediaDurationForPlayoutDuration(j, f), j3);
                }
                if (j2 >= Math.max(j, 500000L)) {
                    boolean z3 = (z ? this.prioritizeTimeOverSizeThresholdsForLocalPlayback : false) || !z2;
                    playerLoadingState.isLoading = z3;
                    if (!z3 && j2 < 500000) {
                        Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j2 >= j3 || z2) {
                    playerLoadingState.isLoading = false;
                }
                return playerLoadingState.isLoading;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        f = loadControl$Parameters.playbackSpeed;
        if (f > 1.0f) {
        }
        if (j2 >= Math.max(j, 500000L)) {
        }
        return playerLoadingState.isLoading;
    }

    public final void updateAllocator() {
        boolean isEmpty = this.loadingStates.isEmpty();
        DefaultAllocator defaultAllocator = this.allocator;
        int i = 0;
        if (isEmpty) {
            synchronized (defaultAllocator) {
                if (defaultAllocator.trimOnReset) {
                    defaultAllocator.setTargetBufferSize(0);
                }
            }
        } else {
            Iterator it = this.loadingStates.values().iterator();
            while (it.hasNext()) {
                i += ((PlayerLoadingState) it.next()).targetBufferBytes;
            }
            defaultAllocator.setTargetBufferSize(i);
        }
    }
}
