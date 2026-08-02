package ru.yandex.video.m3.player.provider;

import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J'\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/StatefulObservable;", "T", "Lru/yandex/video/m3/player/provider/Consumer;", "", "stateful", "Lru/yandex/video/m3/player/provider/ValueObserver;", "observer", "Lzy11;", "addObserver", "(ZLru/yandex/video/m3/player/provider/ValueObserver;)V", "removeObserver", "(Lru/yandex/video/m3/player/provider/ValueObserver;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StatefulObservable<T> extends Consumer<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void addObserver$default(StatefulObservable statefulObservable, boolean z, ValueObserver valueObserver, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: addObserver");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        statefulObservable.addObserver(z, valueObserver);
    }

    void addObserver(boolean stateful, ValueObserver<T> observer);

    void removeObserver(ValueObserver<T> observer);
}
