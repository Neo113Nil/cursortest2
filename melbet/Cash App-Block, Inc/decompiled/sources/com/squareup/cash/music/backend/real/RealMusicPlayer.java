package com.squareup.cash.music.backend.real;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.PlaybackInfo;
import androidx.media3.exoplayer.PlaylistTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder$DefaultShuffleOrder;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.music.backend.api.PlaybackState;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealMusicPlayer {
    public final StuckPlayerDetector mediaPlayer;
    public final ToolbarTuckTargets musicRepository;
    public final ReadonlyStateFlow playbackProgress;
    public final LinkedHashMap previouslyPlayedUrls = new LinkedHashMap();

    public RealMusicPlayer(ToolbarTuckTargets toolbarTuckTargets, StuckPlayerDetector stuckPlayerDetector) {
        this.musicRepository = toolbarTuckTargets;
        this.mediaPlayer = stuckPlayerDetector;
        this.playbackProgress = (ReadonlyStateFlow) stuckPlayerDetector.period;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object play(String str, ContinuationImpl continuationImpl) {
        RealMusicPlayer$play$1 realMusicPlayer$play$1;
        int i;
        String str2;
        LinkedHashMap linkedHashMap;
        String str3;
        Music music;
        if (continuationImpl instanceof RealMusicPlayer$play$1) {
            realMusicPlayer$play$1 = (RealMusicPlayer$play$1) continuationImpl;
            int i2 = realMusicPlayer$play$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMusicPlayer$play$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMusicPlayer$play$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMusicPlayer$play$1.label;
                str2 = 0;
                str2 = 0;
                linkedHashMap = this.previouslyPlayedUrls;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str3 = (String) linkedHashMap.get(str);
                    if (str3 == null) {
                        realMusicPlayer$play$1.L$0 = str;
                        realMusicPlayer$play$1.label = 1;
                        ToolbarTuckTargets toolbarTuckTargets = this.musicRepository;
                        obj = JobKt.withContext((CoroutineContext) toolbarTuckTargets.endCornerCenterX$delegate, new RealMusicRepository$searchMusic$2(toolbarTuckTargets, str, str2, i3), realMusicPlayer$play$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    str2 = str3;
                    if (str2 != 0) {
                        StuckPlayerDetector stuckPlayerDetector = this.mediaPlayer;
                        ExoPlayer exoPlayer = (ExoPlayer) stuckPlayerDetector.player;
                        if (!Intrinsics.areEqual((String) stuckPlayerDetector.stuckPlayingNotEndingDetector, str2)) {
                            stuckPlayerDetector.stuckPlayingNotEndingDetector = str2;
                            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) exoPlayer;
                            exoPlayerImpl.setRepeatMode(1);
                            exoPlayerImpl.setMediaItems(ImmutableList.of((Object) MediaItem.fromUri(str2)));
                            exoPlayerImpl.prepare();
                            exoPlayerImpl.addListener((RealMediaPlayer$playerListener$1) stuckPlayerDetector.stuckSuppressedDetector);
                            exoPlayerImpl.setPlayWhenReady(true);
                        } else if (((ReadonlyStateFlow) stuckPlayerDetector.stuckBufferingDetector).$$delegate_0.getValue() == PlaybackState.PAUSED) {
                            ((ExoPlayerImpl) exoPlayer).setPlayWhenReady(true);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = realMusicPlayer$play$1.L$0;
                SafeTrace.throwOnFailure(obj);
                music = (Music) obj;
                if (music != null && (str3 = music.track_preview_url) != null) {
                    linkedHashMap.put(str, str3);
                    str2 = str3;
                }
                if (str2 != 0) {
                }
                return Unit.INSTANCE;
            }
        }
        realMusicPlayer$play$1 = new RealMusicPlayer$play$1(this, continuationImpl);
        Object obj2 = realMusicPlayer$play$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMusicPlayer$play$1.label;
        str2 = 0;
        str2 = 0;
        linkedHashMap = this.previouslyPlayedUrls;
        int i32 = 1;
        if (i != 0) {
        }
        music = (Music) obj2;
        if (music != null) {
            linkedHashMap.put(str, str3);
            str2 = str3;
        }
        if (str2 != 0) {
        }
        return Unit.INSTANCE;
    }

    public final void stop() {
        PlaylistTimeline playlistTimeline;
        int i;
        int i2;
        Pair maskWindowPositionMsOrGetPeriodPositionUs;
        StuckPlayerDetector stuckPlayerDetector = this.mediaPlayer;
        stuckPlayerDetector.stuckPlayingNotEndingDetector = null;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) ((ExoPlayer) stuckPlayerDetector.player);
        exoPlayerImpl.verifyApplicationThread();
        exoPlayerImpl.stopInternal(null);
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        long j = exoPlayerImpl.playbackInfo.positionUs;
        exoPlayerImpl.currentCueGroup = new CueGroup(regularImmutableList);
        ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) ((ExoPlayer) stuckPlayerDetector.player);
        ArrayList arrayList = exoPlayerImpl2.mediaSourceHolderSnapshots;
        exoPlayerImpl2.verifyApplicationThread();
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size > 0 && min != 0) {
            PlaybackInfo playbackInfo = exoPlayerImpl2.playbackInfo;
            int currentWindowIndexInternal = exoPlayerImpl2.getCurrentWindowIndexInternal(playbackInfo);
            long contentPositionInternal = exoPlayerImpl2.getContentPositionInternal(playbackInfo);
            Timeline timeline = playbackInfo.timeline;
            exoPlayerImpl2.pendingOperationAcks++;
            for (int i3 = min - 1; i3 >= 0; i3--) {
                arrayList.remove(i3);
            }
            ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = exoPlayerImpl2.shuffleOrder;
            int[] iArr = shuffleOrder$DefaultShuffleOrder.shuffled;
            int[] iArr2 = new int[iArr.length - min];
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                if (i6 < 0 || i6 >= min) {
                    int i7 = i5 - i4;
                    if (i6 >= 0) {
                        i6 -= min;
                    }
                    iArr2[i7] = i6;
                } else {
                    i4++;
                }
            }
            exoPlayerImpl2.shuffleOrder = new ShuffleOrder$DefaultShuffleOrder(iArr2, new Random(shuffleOrder$DefaultShuffleOrder.random.nextLong()));
            PlaylistTimeline playlistTimeline2 = new PlaylistTimeline(exoPlayerImpl2.mediaSourceHolderSnapshots, exoPlayerImpl2.shuffleOrder);
            if (timeline.isEmpty() || playlistTimeline2.isEmpty()) {
                playlistTimeline = playlistTimeline2;
                i = -1;
                i2 = 0;
                boolean z = !timeline.isEmpty() && playlistTimeline.isEmpty();
                maskWindowPositionMsOrGetPeriodPositionUs = exoPlayerImpl2.maskWindowPositionMsOrGetPeriodPositionUs(playlistTimeline, z ? -1 : currentWindowIndexInternal, z ? -9223372036854775807L : contentPositionInternal);
            } else {
                Pair periodPositionUs = timeline.getPeriodPositionUs(exoPlayerImpl2.window, exoPlayerImpl2.period, currentWindowIndexInternal, Util.msToUs(contentPositionInternal));
                Object obj = periodPositionUs.first;
                if (playlistTimeline2.getIndexOfPeriod(obj) != -1) {
                    playlistTimeline = playlistTimeline2;
                    maskWindowPositionMsOrGetPeriodPositionUs = periodPositionUs;
                    i = -1;
                    i2 = 0;
                } else {
                    i2 = 0;
                    i = -1;
                    int resolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(exoPlayerImpl2.window, exoPlayerImpl2.period, exoPlayerImpl2.repeatMode, exoPlayerImpl2.shuffleModeEnabled, obj, timeline, playlistTimeline2);
                    playlistTimeline = playlistTimeline2;
                    if (resolveSubsequentPeriod != -1) {
                        Timeline.Window window = exoPlayerImpl2.window;
                        playlistTimeline.getWindow(resolveSubsequentPeriod, window, 0L);
                        maskWindowPositionMsOrGetPeriodPositionUs = exoPlayerImpl2.maskWindowPositionMsOrGetPeriodPositionUs(playlistTimeline, resolveSubsequentPeriod, Util.usToMs(window.defaultPositionUs));
                    } else {
                        maskWindowPositionMsOrGetPeriodPositionUs = exoPlayerImpl2.maskWindowPositionMsOrGetPeriodPositionUs(playlistTimeline, -1, -9223372036854775807L);
                    }
                }
            }
            PlaybackInfo maskTimelineAndPosition = exoPlayerImpl2.maskTimelineAndPosition(playbackInfo, playlistTimeline, maskWindowPositionMsOrGetPeriodPositionUs);
            int i8 = maskTimelineAndPosition.playbackState;
            if (i8 != 1 && i8 != 4 && currentWindowIndexInternal >= 0 && currentWindowIndexInternal < min) {
                if (ExoPlayerImplInternal.resolveSubsequentPeriod(exoPlayerImpl2.window, exoPlayerImpl2.period, exoPlayerImpl2.repeatMode, exoPlayerImpl2.shuffleModeEnabled, playbackInfo.periodId.periodUid, timeline, playlistTimeline) == i) {
                    maskTimelineAndPosition = ExoPlayerImpl.maskPlaybackState(maskTimelineAndPosition, 4);
                }
            }
            PlaybackInfo playbackInfo2 = maskTimelineAndPosition;
            ExoPlayerImplInternal exoPlayerImplInternal = exoPlayerImpl2.internalPlayer;
            ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder2 = exoPlayerImpl2.shuffleOrder;
            SystemHandlerWrapper systemHandlerWrapper = exoPlayerImplInternal.handler;
            systemHandlerWrapper.getClass();
            SystemHandlerWrapper.SystemMessage obtainSystemMessage = SystemHandlerWrapper.obtainSystemMessage();
            obtainSystemMessage.message = systemHandlerWrapper.handler.obtainMessage(20, i2, min, shuffleOrder$DefaultShuffleOrder2);
            obtainSystemMessage.sendToTarget();
            exoPlayerImpl2.updatePlaybackInfo(playbackInfo2, 0, !playbackInfo2.periodId.periodUid.equals(exoPlayerImpl2.playbackInfo.periodId.periodUid), 4, exoPlayerImpl2.getCurrentPositionUsInternal(playbackInfo2), -1, false);
        }
        ((ExoPlayerImpl) ((ExoPlayer) stuckPlayerDetector.player)).removeListener((RealMediaPlayer$playerListener$1) stuckPlayerDetector.stuckSuppressedDetector);
        StateFlowImpl stateFlowImpl = (StateFlowImpl) stuckPlayerDetector.clock;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        StateFlowImpl stateFlowImpl2 = (StateFlowImpl) stuckPlayerDetector.handler;
        PlaybackState playbackState = PlaybackState.STOPPED;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, playbackState);
    }
}
