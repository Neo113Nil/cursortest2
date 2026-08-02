package ru.yandex.video.m3.player;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.AbrPreferences;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B/\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/AbrPreferences;", "", "", "defaultQuality", "", "preferHD", "lastUserSelectedVideoHeightPx", "shouldConsiderSelectedUserQuality", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/AbrPreferences$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/AbrPreferences;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getDefaultQuality", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "getPreferHD", "()Ljava/lang/Boolean;", "getLastUserSelectedVideoHeightPx", "Z", "getShouldConsiderSelectedUserQuality", "()Z", "Companion", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbrPreferences {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer defaultQuality;
    private final Integer lastUserSelectedVideoHeightPx;
    private final Boolean preferHD;
    private final boolean shouldConsiderSelectedUserQuality;

    private AbrPreferences(Integer num, Boolean bool, Integer num2, boolean z) {
        this.defaultQuality = num;
        this.preferHD = bool;
        this.lastUserSelectedVideoHeightPx = num2;
        this.shouldConsiderSelectedUserQuality = z;
    }

    public static /* synthetic */ AbrPreferences copy$default(AbrPreferences abrPreferences, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.AbrPreferences$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AbrPreferences.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AbrPreferences.Builder builder) {
                }
            };
        }
        return abrPreferences.copy(tlsVar);
    }

    public final AbrPreferences copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbrPreferences.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbrPreferences abrPreferences = (AbrPreferences) other;
        return jl40.l(this.defaultQuality, abrPreferences.defaultQuality) && jl40.l(this.preferHD, abrPreferences.preferHD) && jl40.l(this.lastUserSelectedVideoHeightPx, abrPreferences.lastUserSelectedVideoHeightPx) && this.shouldConsiderSelectedUserQuality == abrPreferences.shouldConsiderSelectedUserQuality;
    }

    public final Integer getDefaultQuality() {
        return this.defaultQuality;
    }

    public final Integer getLastUserSelectedVideoHeightPx() {
        return this.lastUserSelectedVideoHeightPx;
    }

    public final Boolean getPreferHD() {
        return this.preferHD;
    }

    public final boolean getShouldConsiderSelectedUserQuality() {
        return this.shouldConsiderSelectedUserQuality;
    }

    public int hashCode() {
        Integer num = this.defaultQuality;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Boolean bool = this.preferHD;
        int hashCode = (intValue + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.lastUserSelectedVideoHeightPx;
        return Boolean.hashCode(this.shouldConsiderSelectedUserQuality) + ((hashCode + (num2 != null ? num2.intValue() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AbrPreferences(defaultQuality=");
        sb.append(this.defaultQuality);
        sb.append(", preferHD=");
        sb.append(this.preferHD);
        sb.append(", lastUserSelectedVideoHeightPx=");
        sb.append(this.lastUserSelectedVideoHeightPx);
        sb.append(", shouldConsiderSelectedUserQuality=");
        return unr0.u(sb, this.shouldConsiderSelectedUserQuality, ')');
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/AbrPreferences$Companion;", "", "()V", "Empty", "Lru/yandex/video/m3/player/AbrPreferences;", "Empty$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbrPreferences Empty$video_player_internalRelease() {
            return new AbrPreferences(null, Boolean.FALSE, null, false, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbrPreferences(Integer num, Boolean bool, Integer num2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, bool, num2, z);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\r\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001dR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/AbrPreferences$Builder;", "", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "(Lru/yandex/video/m3/player/AbrPreferences;)V", "defaultQuality", "", "preferHD", "", "lastUserSelectedVideoHeightPx", "shouldConsiderSelectedUserQuality", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Z)V", "getDefaultQuality", "()Ljava/lang/Integer;", "setDefaultQuality", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLastUserSelectedVideoHeightPx", "setLastUserSelectedVideoHeightPx", "getPreferHD", "()Ljava/lang/Boolean;", "setPreferHD", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShouldConsiderSelectedUserQuality", "()Z", "setShouldConsiderSelectedUserQuality", "(Z)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Integer defaultQuality;
        private Integer lastUserSelectedVideoHeightPx;
        private Boolean preferHD;
        private boolean shouldConsiderSelectedUserQuality;

        public Builder(AbrPreferences abrPreferences) {
            this(abrPreferences.getDefaultQuality(), abrPreferences.getPreferHD(), abrPreferences.getLastUserSelectedVideoHeightPx(), abrPreferences.getShouldConsiderSelectedUserQuality());
        }

        public final AbrPreferences build$video_player_internalRelease() {
            return new AbrPreferences(this.defaultQuality, this.preferHD, this.lastUserSelectedVideoHeightPx, this.shouldConsiderSelectedUserQuality, null);
        }

        public final Integer getDefaultQuality() {
            return this.defaultQuality;
        }

        public final Integer getLastUserSelectedVideoHeightPx() {
            return this.lastUserSelectedVideoHeightPx;
        }

        public final Boolean getPreferHD() {
            return this.preferHD;
        }

        public final boolean getShouldConsiderSelectedUserQuality() {
            return this.shouldConsiderSelectedUserQuality;
        }

        public final void setDefaultQuality(Integer num) {
            this.defaultQuality = num;
        }

        public final void setLastUserSelectedVideoHeightPx(Integer num) {
            this.lastUserSelectedVideoHeightPx = num;
        }

        public final void setPreferHD(Boolean bool) {
            this.preferHD = bool;
        }

        public final void setShouldConsiderSelectedUserQuality(boolean z) {
            this.shouldConsiderSelectedUserQuality = z;
        }

        public Builder(Integer num, Boolean bool, Integer num2, boolean z) {
            this.defaultQuality = num;
            this.preferHD = bool;
            this.lastUserSelectedVideoHeightPx = num2;
            this.shouldConsiderSelectedUserQuality = z;
        }
    }
}
