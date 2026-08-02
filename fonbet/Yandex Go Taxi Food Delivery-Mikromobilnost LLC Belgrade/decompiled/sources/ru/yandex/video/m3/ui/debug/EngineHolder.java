package ru.yandex.video.m3.ui.debug;

import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ui/debug/EngineHolder;", "", "engine", "Lru/yandex/video/m3/player/YandexPlayer;", "observer", "Lru/yandex/video/m3/player/PlayerObserver;", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerObserver;)V", "getEngine", "()Lru/yandex/video/m3/player/YandexPlayer;", "getObserver", "()Lru/yandex/video/m3/player/PlayerObserver;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EngineHolder {
    public static final int $stable = 0;
    private final YandexPlayer<?> engine;
    private final PlayerObserver<Object> observer;

    public EngineHolder(YandexPlayer<?> yandexPlayer, PlayerObserver<Object> playerObserver) {
        this.engine = yandexPlayer;
        this.observer = playerObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EngineHolder copy$default(EngineHolder engineHolder, YandexPlayer yandexPlayer, PlayerObserver playerObserver, int i, Object obj) {
        if ((i & 1) != 0) {
            yandexPlayer = engineHolder.engine;
        }
        if ((i & 2) != 0) {
            playerObserver = engineHolder.observer;
        }
        return engineHolder.copy(yandexPlayer, playerObserver);
    }

    public final YandexPlayer<?> component1() {
        return this.engine;
    }

    public final PlayerObserver<Object> component2() {
        return this.observer;
    }

    public final EngineHolder copy(YandexPlayer<?> engine, PlayerObserver<Object> observer) {
        return new EngineHolder(engine, observer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineHolder)) {
            return false;
        }
        EngineHolder engineHolder = (EngineHolder) other;
        return jl40.l(this.engine, engineHolder.engine) && jl40.l(this.observer, engineHolder.observer);
    }

    public final YandexPlayer<?> getEngine() {
        return this.engine;
    }

    public final PlayerObserver<Object> getObserver() {
        return this.observer;
    }

    public int hashCode() {
        return this.observer.hashCode() + (this.engine.hashCode() * 31);
    }

    public String toString() {
        return "EngineHolder(engine=" + this.engine + ", observer=" + this.observer + ')';
    }
}
