package ru.yandex.video.m3.player.bandwidth;

import defpackage.ep4;
import defpackage.tse;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.coroutine.CoroutineQueue;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/SyncProgressAccumulatorNotifier;", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "Ltse;", "queueScope", "delegate", "<init>", "(Ltse;Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;)V", "Lzy11;", "responseStart", "()V", "Lep4;", "bandwidthInfo", "responseProgress", "(Lep4;)V", "responseEnd", "process", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;", "queue", "Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SyncProgressAccumulatorNotifier implements ProgressAccumulatorNotifier {
    public static final int $stable = 8;
    private final ProgressAccumulatorNotifier delegate;
    private final CoroutineQueue queue;

    public SyncProgressAccumulatorNotifier(tse tseVar, ProgressAccumulatorNotifier progressAccumulatorNotifier) {
        this.delegate = progressAccumulatorNotifier;
        this.queue = new CoroutineQueue(tseVar);
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void process() {
        CoroutineQueue.launch$default(this.queue, null, new SyncProgressAccumulatorNotifier$process$1(this, null), 1, null);
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseEnd() {
        CoroutineQueue.launch$default(this.queue, null, new SyncProgressAccumulatorNotifier$responseEnd$1(this, null), 1, null);
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseProgress(ep4 bandwidthInfo) {
        CoroutineQueue.launch$default(this.queue, null, new SyncProgressAccumulatorNotifier$responseProgress$1(this, bandwidthInfo, null), 1, null);
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseStart() {
        CoroutineQueue.launch$default(this.queue, null, new SyncProgressAccumulatorNotifier$responseStart$1(this, null), 1, null);
    }
}
