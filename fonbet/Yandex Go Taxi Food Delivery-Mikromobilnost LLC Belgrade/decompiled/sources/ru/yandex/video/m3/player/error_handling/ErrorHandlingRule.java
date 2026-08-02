package ru.yandex.video.m3.player.error_handling;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "", "apply", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "playbackException", "Lru/yandex/video/m3/player/PlaybackException;", "canErrorBeHandled", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ErrorHandlingRule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule$Companion;", "", "()V", "AUTO_PLAY_CURRENT", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;", "getAUTO_PLAY_CURRENT", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;", "AUTO_PLAY_FALSE", "getAUTO_PLAY_FALSE", "AUTO_PLAY_TRUE", "getAUTO_PLAY_TRUE", "CURRENT_START_POSITION", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;", "getCURRENT_START_POSITION", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;", "DEFAULT_START_POSITION", "getDEFAULT_START_POSITION", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ErrorHandlingDecision.RepeatPrepare.StartPosition DEFAULT_START_POSITION = ErrorHandlingDecision.RepeatPrepare.StartPosition.DEFAULT;
        private static final ErrorHandlingDecision.RepeatPrepare.StartPosition CURRENT_START_POSITION = ErrorHandlingDecision.RepeatPrepare.StartPosition.CURRENT;
        private static final ErrorHandlingDecision.RepeatPrepare.AutoPlay AUTO_PLAY_TRUE = ErrorHandlingDecision.RepeatPrepare.AutoPlay.TRUE;
        private static final ErrorHandlingDecision.RepeatPrepare.AutoPlay AUTO_PLAY_FALSE = ErrorHandlingDecision.RepeatPrepare.AutoPlay.FALSE;
        private static final ErrorHandlingDecision.RepeatPrepare.AutoPlay AUTO_PLAY_CURRENT = ErrorHandlingDecision.RepeatPrepare.AutoPlay.CURRENT;

        private Companion() {
        }

        public final ErrorHandlingDecision.RepeatPrepare.AutoPlay getAUTO_PLAY_CURRENT() {
            return AUTO_PLAY_CURRENT;
        }

        public final ErrorHandlingDecision.RepeatPrepare.AutoPlay getAUTO_PLAY_FALSE() {
            return AUTO_PLAY_FALSE;
        }

        public final ErrorHandlingDecision.RepeatPrepare.AutoPlay getAUTO_PLAY_TRUE() {
            return AUTO_PLAY_TRUE;
        }

        public final ErrorHandlingDecision.RepeatPrepare.StartPosition getCURRENT_START_POSITION() {
            return CURRENT_START_POSITION;
        }

        public final ErrorHandlingDecision.RepeatPrepare.StartPosition getDEFAULT_START_POSITION() {
            return DEFAULT_START_POSITION;
        }
    }

    ErrorHandlingResult apply(PlaybackException playbackException);

    boolean canErrorBeHandled(PlaybackException playbackException);
}
