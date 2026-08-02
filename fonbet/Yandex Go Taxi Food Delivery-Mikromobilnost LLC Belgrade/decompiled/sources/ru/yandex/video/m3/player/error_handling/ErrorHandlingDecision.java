package ru.yandex.video.m3.player.error_handling;

import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "", "()V", "PlayFromLive", "RepeatPrepare", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$PlayFromLive;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ErrorHandlingDecision {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$PlayFromLive;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayFromLive extends ErrorHandlingDecision {
        public static final int $stable = 0;
        public static final PlayFromLive INSTANCE = new PlayFromLive();

        private PlayFromLive() {
            super(null);
        }
    }

    public /* synthetic */ ErrorHandlingDecision(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorHandlingDecision() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "startPosition", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;", "autoPlay", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;", "preferredH264", "", "(Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;Z)V", "getAutoPlay", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;", "getPreferredH264", "()Z", "getStartPosition", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AutoPlay", "StartPosition", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RepeatPrepare extends ErrorHandlingDecision {
        public static final int $stable = 0;
        private final AutoPlay autoPlay;
        private final boolean preferredH264;
        private final StartPosition startPosition;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$AutoPlay;", "", "(Ljava/lang/String;I)V", "TRUE", "FALSE", "CURRENT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum AutoPlay {
            TRUE,
            FALSE,
            CURRENT
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision$RepeatPrepare$StartPosition;", "", "(Ljava/lang/String;I)V", "DEFAULT", "CURRENT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum StartPosition {
            DEFAULT,
            CURRENT
        }

        public RepeatPrepare(StartPosition startPosition, AutoPlay autoPlay, boolean z) {
            super(null);
            this.startPosition = startPosition;
            this.autoPlay = autoPlay;
            this.preferredH264 = z;
        }

        public static /* synthetic */ RepeatPrepare copy$default(RepeatPrepare repeatPrepare, StartPosition startPosition, AutoPlay autoPlay, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                startPosition = repeatPrepare.startPosition;
            }
            if ((i & 2) != 0) {
                autoPlay = repeatPrepare.autoPlay;
            }
            if ((i & 4) != 0) {
                z = repeatPrepare.preferredH264;
            }
            return repeatPrepare.copy(startPosition, autoPlay, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StartPosition getStartPosition() {
            return this.startPosition;
        }

        /* renamed from: component2, reason: from getter */
        public final AutoPlay getAutoPlay() {
            return this.autoPlay;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPreferredH264() {
            return this.preferredH264;
        }

        public final RepeatPrepare copy(StartPosition startPosition, AutoPlay autoPlay, boolean preferredH264) {
            return new RepeatPrepare(startPosition, autoPlay, preferredH264);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RepeatPrepare)) {
                return false;
            }
            RepeatPrepare repeatPrepare = (RepeatPrepare) other;
            return this.startPosition == repeatPrepare.startPosition && this.autoPlay == repeatPrepare.autoPlay && this.preferredH264 == repeatPrepare.preferredH264;
        }

        public final AutoPlay getAutoPlay() {
            return this.autoPlay;
        }

        public final boolean getPreferredH264() {
            return this.preferredH264;
        }

        public final StartPosition getStartPosition() {
            return this.startPosition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.preferredH264) + ((this.autoPlay.hashCode() + (this.startPosition.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RepeatPrepare(startPosition=");
            sb.append(this.startPosition);
            sb.append(", autoPlay=");
            sb.append(this.autoPlay);
            sb.append(", preferredH264=");
            return unr0.u(sb, this.preferredH264, ')');
        }

        public /* synthetic */ RepeatPrepare(StartPosition startPosition, AutoPlay autoPlay, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(startPosition, autoPlay, (i & 4) != 0 ? false : z);
        }
    }
}
