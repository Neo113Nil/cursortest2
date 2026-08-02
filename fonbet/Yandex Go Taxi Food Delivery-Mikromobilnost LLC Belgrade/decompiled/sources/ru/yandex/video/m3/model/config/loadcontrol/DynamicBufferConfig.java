package ru.yandex.video.m3.model.config.loadcontrol;

import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.model.config.loadcontrol.DynamicBufferConfig;
import ru.yandex.video.m3.player.impl.load_control.DynamicBufferDependNetworkQualityParams;
import ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkType;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "maxBufferByNetworkType", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "dynamicBufferParams", "<init>", "(Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "getMaxBufferByNetworkType", "()Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "getDynamicBufferParams", "()Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DynamicBufferConfig {
    public static final int $stable = 0;
    private final DynamicBufferDependNetworkQualityParams dynamicBufferParams;
    private final MaxBufferByNetworkType maxBufferByNetworkType;

    private DynamicBufferConfig(MaxBufferByNetworkType maxBufferByNetworkType, DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams) {
        this.maxBufferByNetworkType = maxBufferByNetworkType;
        this.dynamicBufferParams = dynamicBufferDependNetworkQualityParams;
    }

    public static /* synthetic */ DynamicBufferConfig copy$default(DynamicBufferConfig dynamicBufferConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.loadcontrol.DynamicBufferConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DynamicBufferConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DynamicBufferConfig.Builder builder) {
                }
            };
        }
        return dynamicBufferConfig.copy(tlsVar);
    }

    public final DynamicBufferConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DynamicBufferConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DynamicBufferConfig dynamicBufferConfig = (DynamicBufferConfig) other;
        return jl40.l(this.maxBufferByNetworkType, dynamicBufferConfig.maxBufferByNetworkType) && jl40.l(this.dynamicBufferParams, dynamicBufferConfig.dynamicBufferParams);
    }

    public final DynamicBufferDependNetworkQualityParams getDynamicBufferParams() {
        return this.dynamicBufferParams;
    }

    public final MaxBufferByNetworkType getMaxBufferByNetworkType() {
        return this.maxBufferByNetworkType;
    }

    public int hashCode() {
        int hashCode = this.maxBufferByNetworkType.hashCode() * 31;
        DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams = this.dynamicBufferParams;
        return hashCode + (dynamicBufferDependNetworkQualityParams != null ? dynamicBufferDependNetworkQualityParams.hashCode() : 0);
    }

    public String toString() {
        return "DynamicBufferConfig(maxBufferByNetworkType=" + this.maxBufferByNetworkType + ", dynamicBufferParams=" + this.dynamicBufferParams + ')';
    }

    public /* synthetic */ DynamicBufferConfig(MaxBufferByNetworkType maxBufferByNetworkType, DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(maxBufferByNetworkType, dynamicBufferDependNetworkQualityParams);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig$Builder;", "", "dynamicBufferConfig", "Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "(Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;)V", "maxBufferByNetworkType", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "(Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;)V", "dynamicBufferParams", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "getDynamicBufferParams", "()Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "setDynamicBufferParams", "(Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;)V", "getMaxBufferByNetworkType", "()Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "setMaxBufferByNetworkType", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DynamicBufferDependNetworkQualityParams dynamicBufferParams;
        private MaxBufferByNetworkType maxBufferByNetworkType;

        public Builder(DynamicBufferConfig dynamicBufferConfig) {
            this(dynamicBufferConfig.getMaxBufferByNetworkType());
            this.dynamicBufferParams = dynamicBufferConfig.getDynamicBufferParams();
        }

        public final DynamicBufferConfig build$video_player_internalRelease() {
            return new DynamicBufferConfig(this.maxBufferByNetworkType, this.dynamicBufferParams, null);
        }

        public final DynamicBufferDependNetworkQualityParams getDynamicBufferParams() {
            return this.dynamicBufferParams;
        }

        public final MaxBufferByNetworkType getMaxBufferByNetworkType() {
            return this.maxBufferByNetworkType;
        }

        public final void setDynamicBufferParams(DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams) {
            this.dynamicBufferParams = dynamicBufferDependNetworkQualityParams;
        }

        public final void setMaxBufferByNetworkType(MaxBufferByNetworkType maxBufferByNetworkType) {
            this.maxBufferByNetworkType = maxBufferByNetworkType;
        }

        public Builder(MaxBufferByNetworkType maxBufferByNetworkType) {
            this.maxBufferByNetworkType = maxBufferByNetworkType;
        }
    }
}
