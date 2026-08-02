package ru.yandex.video.m3.player;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/PlayerIndexGenerator;", "", "()V", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "getNextIndex", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerIndexGenerator {
    public static final PlayerIndexGenerator INSTANCE = new PlayerIndexGenerator();
    private static final AtomicInteger index = new AtomicInteger(0);
    public static final int $stable = 8;

    private PlayerIndexGenerator() {
    }

    public final int getNextIndex() {
        return index.getAndIncrement();
    }
}
