package ru.yandex.video.m3.player;

import android.content.Context;
import defpackage.ny61;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0002\b\fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/SimplePlayerStrategyBuilder;", "", "()V", "context", "Landroid/content/Context;", "getContext$annotations", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "build", "Lru/yandex/video/m3/player/SimplePlayerStrategy;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimplePlayerStrategyBuilder {
    public static final int $stable = 8;
    private Context context;
    private PlayerLogger playerLogger;

    private static /* synthetic */ void getContext$annotations() {
    }

    public final SimplePlayerStrategy build$video_player_internalRelease(YandexPlayer<?> player) {
        Context context = this.context;
        if (context == null) {
            ny61.t("Please specify context");
            return null;
        }
        DefaultResourceProvider defaultResourceProvider = new DefaultResourceProvider(context);
        PlayerLogger playerLogger = this.playerLogger;
        if (playerLogger == null) {
            playerLogger = new DummyPlayerLogger();
        }
        return new SimplePlayerStrategy(player, defaultResourceProvider, playerLogger);
    }

    public final SimplePlayerStrategyBuilder context(Context context) {
        this.context = context;
        return this;
    }

    public final SimplePlayerStrategyBuilder playerLogger(PlayerLogger playerLogger) {
        this.playerLogger = playerLogger;
        return this;
    }
}
