package ru.yandex.video.m3.model.config.mediasource;

import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "", "", "minLoadableRetryCount", "", "maxRetryDelayMs", "<init>", "(IJ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getMinLoadableRetryCount", "J", "getMaxRetryDelayMs", "()J", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadErrorHandlingConfig {
    public static final int $stable = 0;
    private final long maxRetryDelayMs;
    private final int minLoadableRetryCount;

    private LoadErrorHandlingConfig(int i, long j) {
        this.minLoadableRetryCount = i;
        this.maxRetryDelayMs = j;
    }

    public static /* synthetic */ LoadErrorHandlingConfig copy$default(LoadErrorHandlingConfig loadErrorHandlingConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadErrorHandlingConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadErrorHandlingConfig.Builder builder) {
                }
            };
        }
        return loadErrorHandlingConfig.copy(tlsVar);
    }

    public final LoadErrorHandlingConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LoadErrorHandlingConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LoadErrorHandlingConfig loadErrorHandlingConfig = (LoadErrorHandlingConfig) other;
        return this.minLoadableRetryCount == loadErrorHandlingConfig.minLoadableRetryCount && this.maxRetryDelayMs == loadErrorHandlingConfig.maxRetryDelayMs;
    }

    public final long getMaxRetryDelayMs() {
        return this.maxRetryDelayMs;
    }

    public final int getMinLoadableRetryCount() {
        return this.minLoadableRetryCount;
    }

    public int hashCode() {
        return Long.hashCode(this.maxRetryDelayMs) + (this.minLoadableRetryCount * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadErrorHandlingConfig(minLoadableRetryCount=");
        sb.append(this.minLoadableRetryCount);
        sb.append(", maxRetryDelayMs=");
        return oyr.n(this.maxRetryDelayMs, ", )", sb);
    }

    public /* synthetic */ LoadErrorHandlingConfig(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig$Builder;", "", "loadErrorHandlingConfig", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "(Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;)V", "()V", "maxRetryDelayMs", "", "getMaxRetryDelayMs", "()Ljava/lang/Long;", "setMaxRetryDelayMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minLoadableRetryCount", "", "getMinLoadableRetryCount", "()Ljava/lang/Integer;", "setMinLoadableRetryCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long maxRetryDelayMs;
        private Integer minLoadableRetryCount;

        public Builder(LoadErrorHandlingConfig loadErrorHandlingConfig) {
            this();
            this.minLoadableRetryCount = Integer.valueOf(loadErrorHandlingConfig.getMinLoadableRetryCount());
            this.maxRetryDelayMs = Long.valueOf(loadErrorHandlingConfig.getMaxRetryDelayMs());
        }

        public final LoadErrorHandlingConfig build$video_player_internalRelease() {
            Integer num = this.minLoadableRetryCount;
            int intValue = num != null ? num.intValue() : 3;
            Long l = this.maxRetryDelayMs;
            return new LoadErrorHandlingConfig(intValue, l != null ? l.longValue() : 5000L, null);
        }

        public final Long getMaxRetryDelayMs() {
            return this.maxRetryDelayMs;
        }

        public final Integer getMinLoadableRetryCount() {
            return this.minLoadableRetryCount;
        }

        public final void setMaxRetryDelayMs(Long l) {
            this.maxRetryDelayMs = l;
        }

        public final void setMinLoadableRetryCount(Integer num) {
            this.minLoadableRetryCount = num;
        }

        public Builder() {
        }
    }
}
