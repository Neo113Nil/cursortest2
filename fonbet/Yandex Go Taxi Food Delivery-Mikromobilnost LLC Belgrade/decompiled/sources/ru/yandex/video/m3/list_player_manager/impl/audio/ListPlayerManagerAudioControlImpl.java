package ru.yandex.video.m3.list_player_manager.impl.audio;

import defpackage.h5z0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerAudioStateObserver;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/audio/ListPlayerManagerAudioControlImpl;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "<init>", "()V", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;)V", "removeObserver", "", "isMuted", "()Z", "isNotMuted", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "listYandexPlayer", "onGet", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;)V", "onReturn", "onRelease", "", "listPlayers", "Ljava/util/List;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "listPlayerObserver", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPlayerManagerAudioControlImpl implements ListPlayerManagerAudioControl {
    public static final int $stable = 8;
    private final List<ListYandexPlayer> listPlayers = new ArrayList();
    private final ObserverDispatcher<ListPlayerAudioStateObserver> observerDispatcher = new ObserverDispatcher<>();
    private final ListPlayerObserver listPlayerObserver = new ListPlayerObserver() { // from class: ru.yandex.video.m3.list_player_manager.impl.audio.ListPlayerManagerAudioControlImpl$listPlayerObserver$1
        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onMutedChanged(boolean muted) {
            ObserverDispatcher observerDispatcher;
            HashSet H0;
            Object failure;
            observerDispatcher = ListPlayerManagerAudioControlImpl.this.observerDispatcher;
            ListPlayerManagerAudioControlImpl listPlayerManagerAudioControlImpl = ListPlayerManagerAudioControlImpl.this;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerAudioStateObserver) it.next()).onMutedSet(listPlayerManagerAudioControlImpl.isMuted());
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
    };

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public void addObserver(ListPlayerAudioStateObserver observer) {
        this.observerDispatcher.add((ObserverDispatcher<ListPlayerAudioStateObserver>) observer);
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public boolean isMuted() {
        return !isNotMuted();
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public boolean isNotMuted() {
        Object obj;
        Iterator<T> it = this.listPlayers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((ListYandexPlayer) obj).isMuted()) {
                break;
            }
        }
        return ((ListYandexPlayer) obj) != null;
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public void onGet(ListYandexPlayer listYandexPlayer) {
        listYandexPlayer.addObserver(this.listPlayerObserver);
        this.listPlayers.add(listYandexPlayer);
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public void onRelease() {
        Iterator<T> it = this.listPlayers.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayer) it.next()).removeObserver(this.listPlayerObserver);
        }
        this.listPlayers.clear();
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public void onReturn(ListYandexPlayer listYandexPlayer) {
        listYandexPlayer.removeObserver(this.listPlayerObserver);
        this.listPlayers.remove(listYandexPlayer);
    }

    @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl
    public void removeObserver(ListPlayerAudioStateObserver observer) {
        this.observerDispatcher.remove(observer);
    }
}
