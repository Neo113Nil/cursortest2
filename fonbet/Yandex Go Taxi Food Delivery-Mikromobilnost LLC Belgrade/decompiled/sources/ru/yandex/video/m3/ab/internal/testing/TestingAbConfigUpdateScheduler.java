package ru.yandex.video.m3.ab.internal.testing;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ab/internal/testing/TestingAbConfigUpdateScheduler;", "Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;", "actualScheduler", "<init>", "(Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;)V", "Lzy11;", "startUpdates", "()V", "forceUpdate", "stopUpdates", "Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TestingAbConfigUpdateScheduler implements AbConfigUpdateScheduler {
    public static final int $stable = 8;
    private final AbConfigUpdateScheduler actualScheduler;

    public TestingAbConfigUpdateScheduler(AbConfigUpdateScheduler abConfigUpdateScheduler) {
        this.actualScheduler = abConfigUpdateScheduler;
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void forceUpdate() {
        this.actualScheduler.forceUpdate();
        this.actualScheduler.startUpdates();
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void startUpdates() {
        this.actualScheduler.startUpdates();
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void stopUpdates() {
    }
}
