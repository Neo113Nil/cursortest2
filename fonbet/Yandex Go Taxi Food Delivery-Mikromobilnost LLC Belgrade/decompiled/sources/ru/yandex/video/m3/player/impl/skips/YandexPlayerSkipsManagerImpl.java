package ru.yandex.video.m3.player.impl.skips;

import defpackage.h5z0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/skips/YandexPlayerSkipsManagerImpl;", "Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "analyticsObservers", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "skips", "Lzy11;", "notifySkipsUpdated", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "type", "", "isEnabled", "updateAutoSkipsByType", "(Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;Z)V", "start", "stop", "()V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "currentSkips", "Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerSkipsManagerImpl implements YandexPlayerSkipsManager {
    public static final int $stable = 8;
    private final ObserverDispatcher<PlayerAnalyticsObserver> analyticsObservers;
    private List<PlayerSkip> currentSkips;

    public YandexPlayerSkipsManagerImpl(ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher) {
        this.analyticsObservers = observerDispatcher;
    }

    private final void notifySkipsUpdated(List<PlayerSkip> skips) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onSkipsUpdated(skips);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
    public void start(List<PlayerSkip> skips) {
        this.currentSkips = skips;
        notifySkipsUpdated(skips);
    }

    @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
    public void stop() {
        this.currentSkips = null;
    }

    @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
    public void updateAutoSkipsByType(PlayerSkip.Type type, final boolean isEnabled) {
        ArrayList arrayList;
        List<PlayerSkip> list = this.currentSkips;
        if (list != null) {
            List<PlayerSkip> list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (PlayerSkip playerSkip : list2) {
                if (playerSkip.getType() == type && playerSkip.getAutoSkip() != isEnabled) {
                    playerSkip = playerSkip.copy(new tls() { // from class: ru.yandex.video.m3.player.impl.skips.YandexPlayerSkipsManagerImpl$updateAutoSkipsByType$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((PlayerSkip.Builder) obj);
                            return zy11.a;
                        }

                        public final void invoke(PlayerSkip.Builder builder) {
                            builder.setAutoSkip(isEnabled);
                        }
                    });
                }
                arrayList.add(playerSkip);
            }
            notifySkipsUpdated(arrayList);
        } else {
            arrayList = null;
        }
        this.currentSkips = arrayList;
    }
}
