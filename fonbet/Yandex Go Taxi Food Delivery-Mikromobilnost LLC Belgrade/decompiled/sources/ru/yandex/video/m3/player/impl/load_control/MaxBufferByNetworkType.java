package ru.yandex.video.m3.player.impl.load_control;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "", "", "maxBufferWifiMs", "maxBufferCellularMs", "<init>", "(JJ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "J", "getMaxBufferWifiMs", "()J", "getMaxBufferCellularMs", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaxBufferByNetworkType {
    public static final int $stable = 0;
    private final long maxBufferCellularMs;
    private final long maxBufferWifiMs;

    private MaxBufferByNetworkType(long j, long j2) {
        this.maxBufferWifiMs = j;
        this.maxBufferCellularMs = j2;
    }

    public static /* synthetic */ MaxBufferByNetworkType copy$default(MaxBufferByNetworkType maxBufferByNetworkType, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkType$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MaxBufferByNetworkType.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MaxBufferByNetworkType.Builder builder) {
                }
            };
        }
        return maxBufferByNetworkType.copy(tlsVar);
    }

    public final MaxBufferByNetworkType copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final long getMaxBufferCellularMs() {
        return this.maxBufferCellularMs;
    }

    public final long getMaxBufferWifiMs() {
        return this.maxBufferWifiMs;
    }

    public /* synthetic */ MaxBufferByNetworkType(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType$Builder;", "", "maxBufferByNetworkType", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "(Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;)V", "maxBufferWifiMs", "", "maxBufferCellularMs", "(JJ)V", "getMaxBufferCellularMs", "()J", "setMaxBufferCellularMs", "(J)V", "getMaxBufferWifiMs", "setMaxBufferWifiMs", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private long maxBufferCellularMs;
        private long maxBufferWifiMs;

        public Builder(MaxBufferByNetworkType maxBufferByNetworkType) {
            this(maxBufferByNetworkType.getMaxBufferWifiMs(), maxBufferByNetworkType.getMaxBufferCellularMs());
        }

        public final MaxBufferByNetworkType build$video_player_internalRelease() {
            return new MaxBufferByNetworkType(this.maxBufferWifiMs, this.maxBufferCellularMs, null);
        }

        public final long getMaxBufferCellularMs() {
            return this.maxBufferCellularMs;
        }

        public final long getMaxBufferWifiMs() {
            return this.maxBufferWifiMs;
        }

        public final void setMaxBufferCellularMs(long j) {
            this.maxBufferCellularMs = j;
        }

        public final void setMaxBufferWifiMs(long j) {
            this.maxBufferWifiMs = j;
        }

        public Builder(long j, long j2) {
            this.maxBufferWifiMs = j;
            this.maxBufferCellularMs = j2;
        }
    }
}
