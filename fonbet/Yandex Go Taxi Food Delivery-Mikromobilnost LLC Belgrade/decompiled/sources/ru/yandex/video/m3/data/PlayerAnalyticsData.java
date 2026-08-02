package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlayerAnalyticsData;
import ru.yandex.video.m3.data.dto.ExternalStalled;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/data/PlayerAnalyticsData;", "", "Lru/yandex/video/m3/data/dto/ExternalStalled;", "externalStalled", "<init>", "(Lru/yandex/video/m3/data/dto/ExternalStalled;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlayerAnalyticsData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/PlayerAnalyticsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/data/dto/ExternalStalled;", "getExternalStalled", "()Lru/yandex/video/m3/data/dto/ExternalStalled;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerAnalyticsData {
    public static final int $stable = 0;
    private final ExternalStalled externalStalled;

    private PlayerAnalyticsData(ExternalStalled externalStalled) {
        this.externalStalled = externalStalled;
    }

    public static /* synthetic */ PlayerAnalyticsData copy$default(PlayerAnalyticsData playerAnalyticsData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.PlayerAnalyticsData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerAnalyticsData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerAnalyticsData.Builder builder) {
                }
            };
        }
        return playerAnalyticsData.copy(tlsVar);
    }

    public final PlayerAnalyticsData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return PlayerAnalyticsData.class.equals(other != null ? other.getClass() : null) && jl40.l(this.externalStalled, ((PlayerAnalyticsData) other).externalStalled);
    }

    public final ExternalStalled getExternalStalled() {
        return this.externalStalled;
    }

    public int hashCode() {
        ExternalStalled externalStalled = this.externalStalled;
        if (externalStalled != null) {
            return externalStalled.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlayerAnalyticsData(externalStalled=" + this.externalStalled + ')';
    }

    public /* synthetic */ PlayerAnalyticsData(ExternalStalled externalStalled, DefaultConstructorMarker defaultConstructorMarker) {
        this(externalStalled);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/data/PlayerAnalyticsData$Builder;", "", "playerAnalyticsData", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "(Lru/yandex/video/m3/data/PlayerAnalyticsData;)V", "()V", "externalStalled", "Lru/yandex/video/m3/data/dto/ExternalStalled;", "getExternalStalled", "()Lru/yandex/video/m3/data/dto/ExternalStalled;", "setExternalStalled", "(Lru/yandex/video/m3/data/dto/ExternalStalled;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private ExternalStalled externalStalled;

        public Builder(PlayerAnalyticsData playerAnalyticsData) {
            this();
            this.externalStalled = playerAnalyticsData.getExternalStalled();
        }

        public final PlayerAnalyticsData build$video_player_internalRelease() {
            return new PlayerAnalyticsData(this.externalStalled, null);
        }

        public final ExternalStalled getExternalStalled() {
            return this.externalStalled;
        }

        public final void setExternalStalled(ExternalStalled externalStalled) {
            this.externalStalled = externalStalled;
        }

        public Builder() {
        }
    }
}
