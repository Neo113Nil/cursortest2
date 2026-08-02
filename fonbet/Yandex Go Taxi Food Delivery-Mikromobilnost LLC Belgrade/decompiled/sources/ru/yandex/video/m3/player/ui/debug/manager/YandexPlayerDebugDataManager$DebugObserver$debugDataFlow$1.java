package ru.yandex.video.m3.player.ui.debug.manager;

import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.ui.debug.internal.model.History;
import ru.yandex.video.m3.player.ui.debug.internal.model.OtherData;
import ru.yandex.video.m3.player.ui.debug.internal.model.TimerData;
import ru.yandex.video.m3.player.ui.debug.internal.model.TracksAndDecoders;
import ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u008a@"}, d2 = {"<anonymous>", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "content", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", BaseTrack.KEY_TRACK, "Lru/yandex/video/m3/player/ui/debug/internal/model/TracksAndDecoders;", "staff", "Lru/yandex/video/m3/player/ui/debug/internal/model/OtherData;", "history", "Lru/yandex/video/m3/player/ui/debug/internal/model/History;", "timer", "Lru/yandex/video/m3/player/ui/debug/internal/model/TimerData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ YandexPlayerDebugDataManager this$0;
    final /* synthetic */ YandexPlayerDebugDataManager.DebugObserver this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1(YandexPlayerDebugDataManager yandexPlayerDebugDataManager, YandexPlayerDebugDataManager.DebugObserver debugObserver, Continuation<? super YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1> continuation) {
        super(6, continuation);
        this.this$0 = yandexPlayerDebugDataManager;
        this.this$1 = debugObserver;
    }

    @Override // defpackage.ems
    public final Object invoke(ContentData contentData, TracksAndDecoders tracksAndDecoders, OtherData otherData, History history, TimerData timerData, Continuation<? super DebugData> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1 yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1(this.this$0, this.this$1, continuation);
        yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.L$0 = contentData;
        yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.L$1 = tracksAndDecoders;
        yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.L$2 = otherData;
        yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.L$3 = history;
        yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.L$4 = timerData;
        return yandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List list3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ContentData contentData = (ContentData) this.L$0;
        TracksAndDecoders tracksAndDecoders = (TracksAndDecoders) this.L$1;
        OtherData otherData = (OtherData) this.L$2;
        History history = (History) this.L$3;
        TimerData timerData = (TimerData) this.L$4;
        YandexPlayer yandexPlayer = this.this$0.player;
        String videoSessionId = yandexPlayer != null ? yandexPlayer.getVideoSessionId() : null;
        DebugData debugData = (DebugData) ((r0) this.this$0._debugData).getValue();
        VideoTrackData videoTrackData = tracksAndDecoders.getVideoTrackData();
        AudioTrackData audioTrackData = tracksAndDecoders.getAudioTrackData();
        SubtitlesTrackData subtitlesTrackData = tracksAndDecoders.getSubtitlesTrackData();
        Size viewPortSize = otherData.getViewPortSize();
        DrmMode drmMode = otherData.getDrmMode();
        int droppedFrames = otherData.getDroppedFrames();
        String networkTypeName = otherData.getNetworkTypeName();
        String lastError = otherData.getLastError();
        BandwidthEstimation lastBandwidthEstimation = history.getLastBandwidthEstimation();
        LoadedChunk lastLoadedChunk = history.getLastLoadedChunk();
        BytesLoaded bytesLoaded = history.getBytesLoaded();
        BufferSize currentBufferSize = history.getCurrentBufferSize();
        DecoderData audioDecoderData = tracksAndDecoders.getAudioDecoderData();
        DecoderData videoDecoderData = tracksAndDecoders.getVideoDecoderData();
        Long targetBufferSize = timerData.getTargetBufferSize();
        LatencyData latencyData = timerData.getLatencyData();
        String dateTime = timerData.getDateTime();
        SessionColor sessionColor = timerData.getSessionColor();
        list = this.this$1.bandwidthHistory;
        List J0 = a.J0(list);
        list2 = this.this$1.chunksHistory;
        List J02 = a.J0(list2);
        list3 = this.this$1.bufferSizeHistory;
        return DebugData.copy$default(debugData, videoSessionId, contentData, videoTrackData, audioTrackData, subtitlesTrackData, viewPortSize, videoDecoderData, audioDecoderData, drmMode, droppedFrames, networkTypeName, lastBandwidthEstimation, lastLoadedChunk, bytesLoaded, currentBufferSize, targetBufferSize, latencyData, lastError, dateTime, sessionColor, J0, J02, a.J0(list3), System.currentTimeMillis(), videoSessionId != null ? this.this$1.obtainVsidBitmap(videoSessionId) : null, false, SelfTester_JCP.DECRYPT_CFB, null);
    }
}
