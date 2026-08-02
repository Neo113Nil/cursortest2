package ru.yandex.video.m3.player.impl.load_control;

import defpackage.bq6;
import defpackage.cq6;
import defpackage.md6;
import defpackage.q2k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.load_control.provider.CurrentTimeProvider;
import ru.yandex.video.m3.player.impl.load_control.provider.CurrentTimeProviderImpl;
import ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle;
import ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycleBufferDurationProvider;
import ru.yandex.video.m3.player.impl.load_control.provider.WatchedTimeProvider;
import ru.yandex.video.m3.player.impl.load_control.provider.WatchedTimeProviderImpl;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/BufferGoalManagerAdapter;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;", "Lbq6;", "bufferGoalManager", "", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "providers", "Lru/yandex/video/m3/player/impl/load_control/provider/CurrentTimeProvider;", "currentTimeProvider", "Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProvider;", "watchedTimeProvider", "<init>", "(Lbq6;Ljava/util/List;Lru/yandex/video/m3/player/impl/load_control/provider/CurrentTimeProvider;Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProvider;)V", "", "getMaxBufferMs", "()J", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Lbq6;", "Ljava/util/List;", "Lru/yandex/video/m3/player/impl/load_control/provider/CurrentTimeProvider;", "Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BufferGoalManagerAdapter implements DependentLifecycleBufferDurationProvider {
    public static final int $stable = 8;
    private final bq6 bufferGoalManager;
    private final CurrentTimeProvider currentTimeProvider;
    private final List<DependentLifecycle> providers;
    private final WatchedTimeProvider watchedTimeProvider;

    public /* synthetic */ BufferGoalManagerAdapter(bq6 bq6Var, List list, CurrentTimeProvider currentTimeProvider, WatchedTimeProvider watchedTimeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bq6Var, list, (i & 4) != 0 ? new CurrentTimeProviderImpl() : currentTimeProvider, (i & 8) != 0 ? new WatchedTimeProviderImpl() : watchedTimeProvider);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.BufferDurationProvider
    /* renamed from: getMaxBufferMs */
    public long getBufferDuration() {
        Double d;
        bq6 bq6Var = this.bufferGoalManager;
        Double valueOf = Double.valueOf(this.currentTimeProvider.getCurrentTimeMs() / 1000.0d);
        Double valueOf2 = Double.valueOf(this.watchedTimeProvider.getWatchedTimeMs() / 1000.0d);
        bq6Var.getClass();
        md6 md6Var = new md6(4, valueOf2, valueOf);
        Map map = bq6Var.a;
        Iterator it = a.x0(map.keySet(), q2k0.a).iterator();
        do {
            d = null;
            Object obj = null;
            d = null;
            if (!it.hasNext()) {
                break;
            }
            cq6[] cq6VarArr = (cq6[]) map.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (cq6VarArr != null) {
                ArrayList arrayList = new ArrayList();
                for (cq6 cq6Var : cq6VarArr) {
                    Double a = cq6Var.a(md6Var);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        double doubleValue = ((Number) obj).doubleValue();
                        do {
                            Object next = it2.next();
                            double doubleValue2 = ((Number) next).doubleValue();
                            if (Double.compare(doubleValue, doubleValue2) > 0) {
                                obj = next;
                                doubleValue = doubleValue2;
                            }
                        } while (it2.hasNext());
                    }
                }
                d = (Double) obj;
            }
        } while (d == null);
        return (long) ((d != null ? d.doubleValue() : bq6.b) * 1000.0d);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        this.currentTimeProvider.release(yandexPlayer);
        this.watchedTimeProvider.release(yandexPlayer);
        Iterator<T> it = this.providers.iterator();
        while (it.hasNext()) {
            ((DependentLifecycle) it.next()).release(yandexPlayer);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        this.currentTimeProvider.start(yandexPlayer);
        this.watchedTimeProvider.start(yandexPlayer);
        Iterator<T> it = this.providers.iterator();
        while (it.hasNext()) {
            ((DependentLifecycle) it.next()).start(yandexPlayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferGoalManagerAdapter(bq6 bq6Var, List<? extends DependentLifecycle> list, CurrentTimeProvider currentTimeProvider, WatchedTimeProvider watchedTimeProvider) {
        this.bufferGoalManager = bq6Var;
        this.providers = list;
        this.currentTimeProvider = currentTimeProvider;
        this.watchedTimeProvider = watchedTimeProvider;
    }
}
