package ru.yandex.video.m3.player.error_handling;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorSource;", "", "()V", "Player", "PlayerDelegate", "Prepare", "Strategy", "Lru/yandex/video/m3/player/error_handling/ErrorSource$Player;", "Lru/yandex/video/m3/player/error_handling/ErrorSource$PlayerDelegate;", "Lru/yandex/video/m3/player/error_handling/ErrorSource$Prepare;", "Lru/yandex/video/m3/player/error_handling/ErrorSource$Strategy;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ErrorSource {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorSource$Player;", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Player extends ErrorSource {
        public static final int $stable = 0;
        public static final Player INSTANCE = new Player();

        private Player() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorSource$PlayerDelegate;", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "playerWasReadyForFirstPlayback", "", "playerWasPlayWhenReadyBeforeError", "(ZZ)V", "getPlayerWasPlayWhenReadyBeforeError", "()Z", "getPlayerWasReadyForFirstPlayback", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerDelegate extends ErrorSource {
        public static final int $stable = 0;
        private final boolean playerWasPlayWhenReadyBeforeError;
        private final boolean playerWasReadyForFirstPlayback;

        public PlayerDelegate(boolean z, boolean z2) {
            super(null);
            this.playerWasReadyForFirstPlayback = z;
            this.playerWasPlayWhenReadyBeforeError = z2;
        }

        public final boolean getPlayerWasPlayWhenReadyBeforeError() {
            return this.playerWasPlayWhenReadyBeforeError;
        }

        public final boolean getPlayerWasReadyForFirstPlayback() {
            return this.playerWasReadyForFirstPlayback;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorSource$Prepare;", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Prepare extends ErrorSource {
        public static final int $stable = 0;
        public static final Prepare INSTANCE = new Prepare();

        private Prepare() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorSource$Strategy;", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "playerWasPlayWhenReadyBeforeError", "", "(Z)V", "getPlayerWasPlayWhenReadyBeforeError", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Strategy extends ErrorSource {
        public static final int $stable = 0;
        private final boolean playerWasPlayWhenReadyBeforeError;

        public Strategy(boolean z) {
            super(null);
            this.playerWasPlayWhenReadyBeforeError = z;
        }

        public final boolean getPlayerWasPlayWhenReadyBeforeError() {
            return this.playerWasPlayWhenReadyBeforeError;
        }
    }

    public /* synthetic */ ErrorSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorSource() {
    }
}
