package ru.yandex.video.m3.list_player_manager;

import defpackage.zxc0;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import ru.yandex.video.m3.ui.PlayerView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 ,2\u00020\u0001:\u0001,J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H&¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH&¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH&¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H&¢\u0006\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\f¨\u0006-À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "Lzy11;", "attachEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachEngine", "()Lru/yandex/video/m3/player/YandexPlayer;", "", "isWithEngine", "()Z", "getEngine", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "observer", "addInternalObserver", "(Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;)V", "removeInternalObserver", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "Lru/yandex/video/m3/ui/PlayerView;", "playerView", "onAttachToView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/ui/PlayerView;)V", "onDetachFromView", "()V", "", "w", "h", "oldw", "oldh", "onPlayerViewSizeChange", "(IIII)V", "getAttachedView", "()Lru/yandex/video/m3/ui/ListYandexPlayerView;", "getListPlayerIndex", "()I", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "getCurrentPlaybackConfig", "()Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "release", "getWillPlayWhenReady", "willPlayWhenReady", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalListYandexPlayer extends ListYandexPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer$Companion;", "", "()V", "impl", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final InternalListYandexPlayer impl(ListYandexPlayer player) {
            return (InternalListYandexPlayer) player;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void goToLive(InternalListYandexPlayer internalListYandexPlayer) {
            InternalListYandexPlayer.super.goToLive();
        }

        @Deprecated
        public static boolean isInLive(InternalListYandexPlayer internalListYandexPlayer) {
            return InternalListYandexPlayer.super.isInLive();
        }
    }

    void addInternalObserver(ListPlayerInternalObserver observer);

    void attachEngine(YandexPlayer<zxc0> engine);

    YandexPlayer<zxc0> detachEngine();

    /* renamed from: getAttachedView */
    ListYandexPlayerView getListYandexPlayerView();

    /* renamed from: getCurrentPlaybackConfig */
    PlaybackConfig getPlaybackConfig();

    YandexPlayer<zxc0> getEngine();

    int getListPlayerIndex();

    boolean getWillPlayWhenReady();

    boolean isWithEngine();

    void onAttachToView(ListYandexPlayerView listYandexPlayerView, PlayerView playerView);

    void onDetachFromView();

    void onPlayerViewSizeChange(int w, int h, int oldw, int oldh);

    void release();

    void removeInternalObserver(ListPlayerInternalObserver observer);
}
