package ru.yandex.video.m3.player.error_handling;

import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "", "()V", "Handled", "HandledByExternalErrorHandler", "HandledByStrategy", "Ignored", "NotHandled", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$Handled;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$HandledByExternalErrorHandler;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$HandledByStrategy;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$Ignored;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$NotHandled;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ErrorHandlingResult {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$Handled;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "decision", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "rule", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "(Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;)V", "getDecision", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "getRule$video_player_internalRelease", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "component1", "component2", "component2$video_player_internalRelease", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Handled extends ErrorHandlingResult {
        public static final int $stable = 8;
        private final ErrorHandlingDecision decision;
        private final ErrorHandlingRule rule;

        public Handled(ErrorHandlingDecision errorHandlingDecision, ErrorHandlingRule errorHandlingRule) {
            super(null);
            this.decision = errorHandlingDecision;
            this.rule = errorHandlingRule;
        }

        public static /* synthetic */ Handled copy$default(Handled handled, ErrorHandlingDecision errorHandlingDecision, ErrorHandlingRule errorHandlingRule, int i, Object obj) {
            if ((i & 1) != 0) {
                errorHandlingDecision = handled.decision;
            }
            if ((i & 2) != 0) {
                errorHandlingRule = handled.rule;
            }
            return handled.copy(errorHandlingDecision, errorHandlingRule);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorHandlingDecision getDecision() {
            return this.decision;
        }

        /* renamed from: component2$video_player_internalRelease, reason: from getter */
        public final ErrorHandlingRule getRule() {
            return this.rule;
        }

        public final Handled copy(ErrorHandlingDecision decision, ErrorHandlingRule rule) {
            return new Handled(decision, rule);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Handled)) {
                return false;
            }
            Handled handled = (Handled) other;
            return jl40.l(this.decision, handled.decision) && jl40.l(this.rule, handled.rule);
        }

        public final ErrorHandlingDecision getDecision() {
            return this.decision;
        }

        public final ErrorHandlingRule getRule$video_player_internalRelease() {
            return this.rule;
        }

        public int hashCode() {
            return this.rule.hashCode() + (this.decision.hashCode() * 31);
        }

        public String toString() {
            return "Handled(decision=" + this.decision + ", rule=" + this.rule + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$HandledByExternalErrorHandler;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HandledByExternalErrorHandler extends ErrorHandlingResult {
        public static final int $stable = 0;
        public static final HandledByExternalErrorHandler INSTANCE = new HandledByExternalErrorHandler();

        private HandledByExternalErrorHandler() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$HandledByStrategy;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HandledByStrategy extends ErrorHandlingResult {
        public static final int $stable = 0;
        public static final HandledByStrategy INSTANCE = new HandledByStrategy();

        private HandledByStrategy() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$Ignored;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ignored extends ErrorHandlingResult {
        public static final int $stable = 0;
        private final String message;

        public Ignored(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ Ignored copy$default(Ignored ignored, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ignored.message;
            }
            return ignored.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Ignored copy(String message) {
            return new Ignored(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ignored) && jl40.l(this.message, ((Ignored) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("Ignored(message="), this.message, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult$NotHandled;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotHandled extends ErrorHandlingResult {
        public static final int $stable = 0;
        public static final NotHandled INSTANCE = new NotHandled();

        private NotHandled() {
            super(null);
        }
    }

    public /* synthetic */ ErrorHandlingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorHandlingResult() {
    }
}
