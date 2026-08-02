package ru.yandex.video.m3.player.impl.concurrent;

import kotlin.Metadata;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.PrepareConfig;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManagerImpl;", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "sourceIndexGenerator", "Lru/yandex/video/m3/player/IndexGenerator;", "(Lru/yandex/video/m3/player/IndexGenerator;)V", "currentConfig", "Lru/yandex/video/m3/player/impl/PrepareConfig;", "currentPrepareIndex", "", "<set-?>", "currentSourceIndex", "getCurrentSourceIndex", "()I", "isNotActive", "", "()Z", "isReleased", "setReleased", "(Z)V", "isStopped", "setStopped", "beginPrepare", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager$Indices;", "prepareConfig", "isActualPrepare", "prepareIndex", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConcurrentPlayerStateManagerImpl implements ConcurrentPlayerStateManager {
    public static final int $stable = 8;
    private volatile int currentPrepareIndex;
    private volatile boolean isReleased;
    private volatile boolean isStopped;
    private final IndexGenerator sourceIndexGenerator;
    private volatile PrepareConfig currentConfig = new PrepareConfig(null, null, null, 7, null);
    private volatile int currentSourceIndex = -1;

    public ConcurrentPlayerStateManagerImpl(IndexGenerator indexGenerator) {
        this.sourceIndexGenerator = indexGenerator;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager
    public synchronized ConcurrentPlayerStateManager.Indices beginPrepare(PrepareConfig prepareConfig) {
        try {
            if (!prepareConfig.equals(this.currentConfig)) {
                this.currentConfig = prepareConfig;
                this.currentSourceIndex = this.sourceIndexGenerator.getNextIndex();
            }
            this.currentPrepareIndex++;
        } catch (Throwable th) {
            throw th;
        }
        return new ConcurrentPlayerStateManager.Indices(this.currentPrepareIndex, getCurrentSourceIndex());
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager
    public int getCurrentSourceIndex() {
        return this.currentSourceIndex;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager
    public boolean isActualPrepare(int prepareIndex) {
        return this.currentPrepareIndex == prepareIndex;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateProvider
    public boolean isNotActive() {
        if (getCurrentSourceIndex() == -1) {
            return true;
        }
        return super.isNotActive();
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager, ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateProvider
    /* renamed from: isReleased, reason: from getter */
    public boolean getIsReleased() {
        return this.isReleased;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager, ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateProvider
    /* renamed from: isStopped, reason: from getter */
    public boolean getIsStopped() {
        return this.isStopped;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager
    public void setReleased(boolean z) {
        this.isReleased = z;
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager
    public void setStopped(boolean z) {
        this.isStopped = z;
    }
}
