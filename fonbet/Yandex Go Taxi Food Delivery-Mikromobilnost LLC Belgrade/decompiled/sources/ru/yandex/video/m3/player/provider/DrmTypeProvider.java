package ru.yandex.video.m3.player.provider;

import android.os.Handler;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.impl.utils.observable.StatefulProvider;
import ru.yandex.video.m3.player.provider.drm.DrmTypeConsumer;
import ru.yandex.video.m3.player.provider.drm.DrmTypeSupplier;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003B\u0019\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ*\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/provider/DrmTypeProvider;", "Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;", "Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "Lru/yandex/video/m3/player/provider/StatefulObservable;", "Lru/yandex/video/m3/data/DrmType;", "Lru/yandex/video/m3/player/impl/utils/observable/StatefulProvider;", "statefulProvider", "<init>", "(Lru/yandex/video/m3/player/impl/utils/observable/StatefulProvider;)V", "Landroid/os/Handler;", "observingThreadHandler", "(Landroid/os/Handler;)V", "", "stateful", "Lru/yandex/video/m3/player/provider/ValueObserver;", "observer", "Lzy11;", "addObserver", "(ZLru/yandex/video/m3/player/provider/ValueObserver;)V", "removeObserver", "(Lru/yandex/video/m3/player/provider/ValueObserver;)V", "value", "accept", "(Lru/yandex/video/m3/data/DrmType;)V", "get", "()Lru/yandex/video/m3/data/DrmType;", "Lru/yandex/video/m3/player/impl/utils/observable/StatefulProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmTypeProvider implements DrmTypeSupplier, DrmTypeConsumer, StatefulObservable<DrmType> {
    public static final int $stable = 8;
    private final StatefulProvider<DrmType> statefulProvider;

    public DrmTypeProvider(Handler handler) {
        this((StatefulProvider<DrmType>) new StatefulProvider(handler, null, 2, null));
    }

    @Override // ru.yandex.video.m3.player.provider.StatefulObservable
    public void addObserver(boolean stateful, ValueObserver<DrmType> observer) {
        this.statefulProvider.addObserver(stateful, observer);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public DrmType getValue() {
        return this.statefulProvider.get();
    }

    @Override // ru.yandex.video.m3.player.provider.StatefulObservable
    public void removeObserver(ValueObserver<DrmType> observer) {
        this.statefulProvider.removeObserver(observer);
    }

    @Override // ru.yandex.video.m3.player.provider.Consumer
    public void accept(DrmType value) {
        this.statefulProvider.accept(value);
    }

    private DrmTypeProvider(StatefulProvider<DrmType> statefulProvider) {
        this.statefulProvider = statefulProvider;
    }
}
