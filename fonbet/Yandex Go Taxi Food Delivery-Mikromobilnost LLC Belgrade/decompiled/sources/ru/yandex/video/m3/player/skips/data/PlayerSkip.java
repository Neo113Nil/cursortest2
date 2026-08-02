package ru.yandex.video.m3.player.skips.data;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%¨\u0006)"}, d2 = {"Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "", "", "contentId", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "type", "", "autoSkip", "", "startTimeMs", "endTimeMs", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;ZJJ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getContentId", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "getType", "()Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "Z", "getAutoSkip", "()Z", "J", "getStartTimeMs", "()J", "getEndTimeMs", "Builder", "Type", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerSkip {
    public static final int $stable = 0;
    private final boolean autoSkip;
    private final String contentId;
    private final long endTimeMs;
    private final long startTimeMs;
    private final Type type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "", "(Ljava/lang/String;I)V", "Intro", "Recap", "Credits", "NextEpisode", "Other", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        Intro,
        Recap,
        Credits,
        NextEpisode,
        Other
    }

    private PlayerSkip(String str, Type type, boolean z, long j, long j2) {
        this.contentId = str;
        this.type = type;
        this.autoSkip = z;
        this.startTimeMs = j;
        this.endTimeMs = j2;
    }

    public static /* synthetic */ PlayerSkip copy$default(PlayerSkip playerSkip, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.skips.data.PlayerSkip$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerSkip.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerSkip.Builder builder) {
                }
            };
        }
        return playerSkip.copy(tlsVar);
    }

    public final PlayerSkip copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlayerSkip.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlayerSkip playerSkip = (PlayerSkip) other;
        return this.autoSkip == playerSkip.autoSkip && this.startTimeMs == playerSkip.startTimeMs && this.endTimeMs == playerSkip.endTimeMs && jl40.l(this.contentId, playerSkip.contentId) && this.type == playerSkip.type;
    }

    public final boolean getAutoSkip() {
        return this.autoSkip;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + unr0.b(qv10.c(qv10.c(Boolean.hashCode(this.autoSkip) * 31, 31, this.startTimeMs), 31, this.endTimeMs), 31, this.contentId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerSkip(contentId='");
        sb.append(this.contentId);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", autoSkip=");
        sb.append(this.autoSkip);
        sb.append(", startTimeMs=");
        sb.append(this.startTimeMs);
        sb.append(", endTimeMs=");
        return b64.o(sb, this.endTimeMs, ')');
    }

    public /* synthetic */ PlayerSkip(String str, Type type, boolean z, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, z, j, j2);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\r\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/skips/data/PlayerSkip$Builder;", "", "playerSkip", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "(Lru/yandex/video/m3/player/skips/data/PlayerSkip;)V", "contentId", "", "type", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "autoSkip", "", "startTimeMs", "", "endTimeMs", "(Ljava/lang/String;Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;ZJJ)V", "getAutoSkip", "()Z", "setAutoSkip", "(Z)V", "getContentId", "()Ljava/lang/String;", "setContentId", "(Ljava/lang/String;)V", "getEndTimeMs", "()J", "setEndTimeMs", "(J)V", "getStartTimeMs", "setStartTimeMs", "getType", "()Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "setType", "(Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private boolean autoSkip;
        private String contentId;
        private long endTimeMs;
        private long startTimeMs;
        private Type type;

        public Builder(PlayerSkip playerSkip) {
            this(playerSkip.getContentId(), playerSkip.getType(), playerSkip.getAutoSkip(), playerSkip.getStartTimeMs(), playerSkip.getEndTimeMs());
        }

        public final PlayerSkip build$video_player_internalRelease() {
            return new PlayerSkip(this.contentId, this.type, this.autoSkip, this.startTimeMs, this.endTimeMs, null);
        }

        public final boolean getAutoSkip() {
            return this.autoSkip;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final long getEndTimeMs() {
            return this.endTimeMs;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs;
        }

        public final Type getType() {
            return this.type;
        }

        public final void setAutoSkip(boolean z) {
            this.autoSkip = z;
        }

        public final void setContentId(String str) {
            this.contentId = str;
        }

        public final void setEndTimeMs(long j) {
            this.endTimeMs = j;
        }

        public final void setStartTimeMs(long j) {
            this.startTimeMs = j;
        }

        public final void setType(Type type) {
            this.type = type;
        }

        public Builder(String str, Type type, boolean z, long j, long j2) {
            this.contentId = str;
            this.type = type;
            this.autoSkip = z;
            this.startTimeMs = j;
            this.endTimeMs = j2;
        }
    }
}
