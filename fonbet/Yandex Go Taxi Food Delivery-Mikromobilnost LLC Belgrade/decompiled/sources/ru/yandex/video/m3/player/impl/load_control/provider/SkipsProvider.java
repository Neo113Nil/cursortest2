package ru.yandex.video.m3.player.impl.load_control.provider;

import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00062\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/SkipsProvider;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lkotlin/Function1;", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "Lzy11;", "onSkipsUpdatedCallback", "<init>", "(Ltls;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "skips", "onSkipsUpdated", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Ltls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkipsProvider implements DependentLifecycle, PlayerAnalyticsObserver {
    public static final int $stable = 0;
    private final tls onSkipsUpdatedCallback;

    public SkipsProvider(tls tlsVar) {
        this.onSkipsUpdatedCallback = tlsVar;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        this.onSkipsUpdatedCallback.invoke(EmptyList.a);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSkipsUpdated(List<PlayerSkip> skips) {
        this.onSkipsUpdatedCallback.invoke(skips);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.removeAnalyticsObserver(this);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.addAnalyticsObserver(this);
    }
}
