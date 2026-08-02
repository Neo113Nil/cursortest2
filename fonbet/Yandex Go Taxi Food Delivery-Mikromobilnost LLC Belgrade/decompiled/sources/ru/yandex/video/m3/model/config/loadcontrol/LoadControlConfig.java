package ru.yandex.video.m3.model.config.loadcontrol;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u00012BS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b&\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b*\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b1\u0010-¨\u00063"}, d2 = {"Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "", "", "bufferForPlaybackMs", "bufferForPlaybackAfterRebufferMs", "", "maxBufferMs", "maxBufferBytes", "", "memoryRatio", "backBufferDurationMs", "", "retainBackBufferFromKeyframe", "Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "dynamicBufferConfig", "bufferSizeBySkips", "<init>", "(IIJIFIZLru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getBufferForPlaybackMs", "getBufferForPlaybackAfterRebufferMs", "J", "getMaxBufferMs", "()J", "getMaxBufferBytes", "F", "getMemoryRatio", "()F", "getBackBufferDurationMs", "Z", "getRetainBackBufferFromKeyframe", "()Z", "Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "getDynamicBufferConfig", "()Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "getBufferSizeBySkips", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadControlConfig {
    public static final int $stable = 0;
    private final int backBufferDurationMs;
    private final int bufferForPlaybackAfterRebufferMs;
    private final int bufferForPlaybackMs;
    private final boolean bufferSizeBySkips;
    private final DynamicBufferConfig dynamicBufferConfig;
    private final int maxBufferBytes;
    private final long maxBufferMs;
    private final float memoryRatio;
    private final boolean retainBackBufferFromKeyframe;

    private LoadControlConfig(int i, int i2, long j, int i3, float f, int i4, boolean z, DynamicBufferConfig dynamicBufferConfig, boolean z2) {
        this.bufferForPlaybackMs = i;
        this.bufferForPlaybackAfterRebufferMs = i2;
        this.maxBufferMs = j;
        this.maxBufferBytes = i3;
        this.memoryRatio = f;
        this.backBufferDurationMs = i4;
        this.retainBackBufferFromKeyframe = z;
        this.dynamicBufferConfig = dynamicBufferConfig;
        this.bufferSizeBySkips = z2;
    }

    public static /* synthetic */ LoadControlConfig copy$default(LoadControlConfig loadControlConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadControlConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadControlConfig.Builder builder) {
                }
            };
        }
        return loadControlConfig.copy(tlsVar);
    }

    public final LoadControlConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LoadControlConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LoadControlConfig loadControlConfig = (LoadControlConfig) other;
        return this.bufferForPlaybackMs == loadControlConfig.bufferForPlaybackMs && this.bufferForPlaybackAfterRebufferMs == loadControlConfig.bufferForPlaybackAfterRebufferMs && this.maxBufferMs == loadControlConfig.maxBufferMs && this.maxBufferBytes == loadControlConfig.maxBufferBytes && this.memoryRatio == loadControlConfig.memoryRatio && this.backBufferDurationMs == loadControlConfig.backBufferDurationMs && this.retainBackBufferFromKeyframe == loadControlConfig.retainBackBufferFromKeyframe && jl40.l(this.dynamicBufferConfig, loadControlConfig.dynamicBufferConfig) && this.bufferSizeBySkips == loadControlConfig.bufferSizeBySkips;
    }

    public final int getBackBufferDurationMs() {
        return this.backBufferDurationMs;
    }

    public final int getBufferForPlaybackAfterRebufferMs() {
        return this.bufferForPlaybackAfterRebufferMs;
    }

    public final int getBufferForPlaybackMs() {
        return this.bufferForPlaybackMs;
    }

    public final boolean getBufferSizeBySkips() {
        return this.bufferSizeBySkips;
    }

    public final DynamicBufferConfig getDynamicBufferConfig() {
        return this.dynamicBufferConfig;
    }

    public final int getMaxBufferBytes() {
        return this.maxBufferBytes;
    }

    public final long getMaxBufferMs() {
        return this.maxBufferMs;
    }

    public final float getMemoryRatio() {
        return this.memoryRatio;
    }

    public final boolean getRetainBackBufferFromKeyframe() {
        return this.retainBackBufferFromKeyframe;
    }

    public int hashCode() {
        int e = unr0.e((g8e.c(this.memoryRatio, (qv10.c(((this.bufferForPlaybackMs * 31) + this.bufferForPlaybackAfterRebufferMs) * 31, 31, this.maxBufferMs) + this.maxBufferBytes) * 31, 31) + this.backBufferDurationMs) * 31, 31, this.retainBackBufferFromKeyframe);
        DynamicBufferConfig dynamicBufferConfig = this.dynamicBufferConfig;
        return Boolean.hashCode(this.bufferSizeBySkips) + ((e + (dynamicBufferConfig != null ? dynamicBufferConfig.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadControlConfig(bufferForPlaybackMs=");
        sb.append(this.bufferForPlaybackMs);
        sb.append(", bufferForPlaybackAfterRebufferMs=");
        sb.append(this.bufferForPlaybackAfterRebufferMs);
        sb.append(", maxBufferMs=");
        sb.append(this.maxBufferMs);
        sb.append(", maxBufferBytes=");
        sb.append(this.maxBufferBytes);
        sb.append(", memoryRatio=");
        sb.append(this.memoryRatio);
        sb.append(", backBufferDurationMs=");
        sb.append(this.backBufferDurationMs);
        sb.append(", retainBackBufferFromKeyframe=");
        sb.append(this.retainBackBufferFromKeyframe);
        sb.append(", dynamicBufferConfig=");
        sb.append(this.dynamicBufferConfig);
        sb.append(", bufferSizeBySkips=");
        return unr0.u(sb, this.bufferSizeBySkips, ')');
    }

    public /* synthetic */ LoadControlConfig(int i, int i2, long j, int i3, float f, int i4, boolean z, DynamicBufferConfig dynamicBufferConfig, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, i3, f, i4, z, dynamicBufferConfig, z2);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u00104\u001a\u00020\u0003H\u0000¢\u0006\u0002\b5R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00101\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018¨\u00066"}, d2 = {"Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig$Builder;", "", "loadControlConfig", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "(Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;)V", "()V", "backBufferDurationMs", "", "getBackBufferDurationMs", "()Ljava/lang/Integer;", "setBackBufferDurationMs", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bufferForPlaybackAfterRebufferMs", "getBufferForPlaybackAfterRebufferMs", "setBufferForPlaybackAfterRebufferMs", "bufferForPlaybackMs", "getBufferForPlaybackMs", "setBufferForPlaybackMs", "bufferSizeBySkips", "", "getBufferSizeBySkips", "()Ljava/lang/Boolean;", "setBufferSizeBySkips", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "dynamicBufferConfig", "Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "getDynamicBufferConfig", "()Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;", "setDynamicBufferConfig", "(Lru/yandex/video/m3/model/config/loadcontrol/DynamicBufferConfig;)V", "maxBufferBytes", "getMaxBufferBytes", "setMaxBufferBytes", "maxBufferMs", "", "getMaxBufferMs", "()Ljava/lang/Long;", "setMaxBufferMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "memoryRatio", "", "getMemoryRatio", "()Ljava/lang/Float;", "setMemoryRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "retainBackBufferFromKeyframe", "getRetainBackBufferFromKeyframe", "setRetainBackBufferFromKeyframe", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Integer backBufferDurationMs;
        private Integer bufferForPlaybackAfterRebufferMs;
        private Integer bufferForPlaybackMs;
        private Boolean bufferSizeBySkips;
        private DynamicBufferConfig dynamicBufferConfig;
        private Integer maxBufferBytes;
        private Long maxBufferMs;
        private Float memoryRatio;
        private Boolean retainBackBufferFromKeyframe;

        public Builder(LoadControlConfig loadControlConfig) {
            this();
            this.bufferForPlaybackMs = Integer.valueOf(loadControlConfig.getBufferForPlaybackMs());
            this.bufferForPlaybackAfterRebufferMs = Integer.valueOf(loadControlConfig.getBufferForPlaybackAfterRebufferMs());
            this.maxBufferMs = Long.valueOf(loadControlConfig.getMaxBufferMs());
            this.maxBufferBytes = Integer.valueOf(loadControlConfig.getMaxBufferBytes());
            this.memoryRatio = Float.valueOf(loadControlConfig.getMemoryRatio());
            this.backBufferDurationMs = Integer.valueOf(loadControlConfig.getBackBufferDurationMs());
            this.retainBackBufferFromKeyframe = Boolean.valueOf(loadControlConfig.getRetainBackBufferFromKeyframe());
            this.dynamicBufferConfig = loadControlConfig.getDynamicBufferConfig();
            this.bufferSizeBySkips = Boolean.valueOf(loadControlConfig.getBufferSizeBySkips());
        }

        public final LoadControlConfig build$video_player_internalRelease() {
            Integer num = this.bufferForPlaybackMs;
            int intValue = num != null ? num.intValue() : 1000;
            Integer num2 = this.bufferForPlaybackAfterRebufferMs;
            int intValue2 = num2 != null ? num2.intValue() : 2000;
            Long l = this.maxBufferMs;
            long longValue = l != null ? l.longValue() : MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS;
            Integer num3 = this.maxBufferBytes;
            int intValue3 = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
            Float f = this.memoryRatio;
            float floatValue = f != null ? f.floatValue() : 0.3f;
            Integer num4 = this.backBufferDurationMs;
            int intValue4 = num4 != null ? num4.intValue() : 0;
            Boolean bool = this.retainBackBufferFromKeyframe;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            DynamicBufferConfig dynamicBufferConfig = this.dynamicBufferConfig;
            Boolean bool2 = this.bufferSizeBySkips;
            return new LoadControlConfig(intValue, intValue2, longValue, intValue3, floatValue, intValue4, booleanValue, dynamicBufferConfig, bool2 != null ? bool2.booleanValue() : false, null);
        }

        public final Integer getBackBufferDurationMs() {
            return this.backBufferDurationMs;
        }

        public final Integer getBufferForPlaybackAfterRebufferMs() {
            return this.bufferForPlaybackAfterRebufferMs;
        }

        public final Integer getBufferForPlaybackMs() {
            return this.bufferForPlaybackMs;
        }

        public final Boolean getBufferSizeBySkips() {
            return this.bufferSizeBySkips;
        }

        public final DynamicBufferConfig getDynamicBufferConfig() {
            return this.dynamicBufferConfig;
        }

        public final Integer getMaxBufferBytes() {
            return this.maxBufferBytes;
        }

        public final Long getMaxBufferMs() {
            return this.maxBufferMs;
        }

        public final Float getMemoryRatio() {
            return this.memoryRatio;
        }

        public final Boolean getRetainBackBufferFromKeyframe() {
            return this.retainBackBufferFromKeyframe;
        }

        public final void setBackBufferDurationMs(Integer num) {
            this.backBufferDurationMs = num;
        }

        public final void setBufferForPlaybackAfterRebufferMs(Integer num) {
            this.bufferForPlaybackAfterRebufferMs = num;
        }

        public final void setBufferForPlaybackMs(Integer num) {
            this.bufferForPlaybackMs = num;
        }

        public final void setBufferSizeBySkips(Boolean bool) {
            this.bufferSizeBySkips = bool;
        }

        public final void setDynamicBufferConfig(DynamicBufferConfig dynamicBufferConfig) {
            this.dynamicBufferConfig = dynamicBufferConfig;
        }

        public final void setMaxBufferBytes(Integer num) {
            this.maxBufferBytes = num;
        }

        public final void setMaxBufferMs(Long l) {
            this.maxBufferMs = l;
        }

        public final void setMemoryRatio(Float f) {
            this.memoryRatio = f;
        }

        public final void setRetainBackBufferFromKeyframe(Boolean bool) {
            this.retainBackBufferFromKeyframe = bool;
        }

        public Builder() {
        }
    }
}
