package ru.yandex.video.m3.player.ui.debug.manager;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.ui.debug.internal.model.History;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u008a@"}, d2 = {"<anonymous>", "Lru/yandex/video/m3/player/ui/debug/internal/model/History;", "bandwidthEstimate", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "loadedChunk", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "bytesLoaded", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bufferSize", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$historyFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$historyFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    public YandexPlayerDebugDataManager$DebugObserver$historyFlow$1(Continuation<? super YandexPlayerDebugDataManager$DebugObserver$historyFlow$1> continuation) {
        super(5, continuation);
    }

    @Override // defpackage.dms
    public final Object invoke(BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, Continuation<? super History> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$historyFlow$1 yandexPlayerDebugDataManager$DebugObserver$historyFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$historyFlow$1(continuation);
        yandexPlayerDebugDataManager$DebugObserver$historyFlow$1.L$0 = bandwidthEstimation;
        yandexPlayerDebugDataManager$DebugObserver$historyFlow$1.L$1 = loadedChunk;
        yandexPlayerDebugDataManager$DebugObserver$historyFlow$1.L$2 = bytesLoaded;
        yandexPlayerDebugDataManager$DebugObserver$historyFlow$1.L$3 = bufferSize;
        return yandexPlayerDebugDataManager$DebugObserver$historyFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new History((BandwidthEstimation) this.L$0, (LoadedChunk) this.L$1, (BytesLoaded) this.L$2, (BufferSize) this.L$3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
