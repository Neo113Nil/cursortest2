package ru.yandex.video.m3.player.ui.debug.manager;

import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.ui.debug.internal.model.TracksAndDecoders;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u008a@"}, d2 = {"<anonymous>", "Lru/yandex/video/m3/player/ui/debug/internal/model/TracksAndDecoders;", "videoTrack", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "audioTrack", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "subtitlesTrack", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "videoDecoderData", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "audioDecoderData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    public YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1(Continuation<? super YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1> continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, DecoderData decoderData, DecoderData decoderData2, Continuation<? super TracksAndDecoders> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1 yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1(continuation);
        yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.L$0 = videoTrackData;
        yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.L$1 = audioTrackData;
        yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.L$2 = subtitlesTrackData;
        yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.L$3 = decoderData;
        yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.L$4 = decoderData2;
        return yandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new TracksAndDecoders((VideoTrackData) this.L$0, (AudioTrackData) this.L$1, (SubtitlesTrackData) this.L$2, (DecoderData) this.L$3, (DecoderData) this.L$4);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
