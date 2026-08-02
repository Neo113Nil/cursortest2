package ru.yandex.video.m3.data.loadcontrol;

import defpackage.jl40;
import defpackage.oo31;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.loadcontrol.LoadControlBufferState;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u00010Ba\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b.\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b/\u0010,¨\u00061"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "", "", "lastEstimatedMaxTargetBuffer", "bufferForPlaybackMs", "bufferForPlaybackAfterRebufferMs", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "lastSCLParameters", "lastSCLTimestamp", "", "lastSCLResult", "lastSSPParameters", "lastSSPTimestamp", "lastSSPResult", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;Ljava/lang/Long;Ljava/lang/Boolean;Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;Ljava/lang/Long;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getLastEstimatedMaxTargetBuffer", "()J", "Ljava/lang/Long;", "getBufferForPlaybackMs", "()Ljava/lang/Long;", "getBufferForPlaybackAfterRebufferMs", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "getLastSCLParameters$video_player_internalRelease", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "getLastSCLTimestamp", "Ljava/lang/Boolean;", "getLastSCLResult", "()Ljava/lang/Boolean;", "getLastSSPParameters$video_player_internalRelease", "getLastSSPTimestamp", "getLastSSPResult", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadControlBufferState {
    public static final int $stable = 0;
    private final Long bufferForPlaybackAfterRebufferMs;
    private final Long bufferForPlaybackMs;
    private final long lastEstimatedMaxTargetBuffer;
    private final LoadControlParameters lastSCLParameters;
    private final Boolean lastSCLResult;
    private final Long lastSCLTimestamp;
    private final LoadControlParameters lastSSPParameters;
    private final Boolean lastSSPResult;
    private final Long lastSSPTimestamp;

    private LoadControlBufferState(long j, Long l, Long l2, LoadControlParameters loadControlParameters, Long l3, Boolean bool, LoadControlParameters loadControlParameters2, Long l4, Boolean bool2) {
        this.lastEstimatedMaxTargetBuffer = j;
        this.bufferForPlaybackMs = l;
        this.bufferForPlaybackAfterRebufferMs = l2;
        this.lastSCLParameters = loadControlParameters;
        this.lastSCLTimestamp = l3;
        this.lastSCLResult = bool;
        this.lastSSPParameters = loadControlParameters2;
        this.lastSSPTimestamp = l4;
        this.lastSSPResult = bool2;
    }

    public static /* synthetic */ LoadControlBufferState copy$default(LoadControlBufferState loadControlBufferState, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.loadcontrol.LoadControlBufferState$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadControlBufferState.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadControlBufferState.Builder builder) {
                }
            };
        }
        return loadControlBufferState.copy(tlsVar);
    }

    public final LoadControlBufferState copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadControlBufferState)) {
            return false;
        }
        LoadControlBufferState loadControlBufferState = (LoadControlBufferState) other;
        return this.lastEstimatedMaxTargetBuffer == loadControlBufferState.lastEstimatedMaxTargetBuffer && jl40.l(this.bufferForPlaybackMs, loadControlBufferState.bufferForPlaybackMs) && jl40.l(this.bufferForPlaybackAfterRebufferMs, loadControlBufferState.bufferForPlaybackAfterRebufferMs) && jl40.l(this.lastSCLParameters, loadControlBufferState.lastSCLParameters) && jl40.l(this.lastSCLTimestamp, loadControlBufferState.lastSCLTimestamp) && jl40.l(this.lastSCLResult, loadControlBufferState.lastSCLResult) && jl40.l(this.lastSSPParameters, loadControlBufferState.lastSSPParameters) && jl40.l(this.lastSSPTimestamp, loadControlBufferState.lastSSPTimestamp) && jl40.l(this.lastSSPResult, loadControlBufferState.lastSSPResult);
    }

    public final Long getBufferForPlaybackAfterRebufferMs() {
        return this.bufferForPlaybackAfterRebufferMs;
    }

    public final Long getBufferForPlaybackMs() {
        return this.bufferForPlaybackMs;
    }

    public final long getLastEstimatedMaxTargetBuffer() {
        return this.lastEstimatedMaxTargetBuffer;
    }

    /* renamed from: getLastSCLParameters$video_player_internalRelease, reason: from getter */
    public final LoadControlParameters getLastSCLParameters() {
        return this.lastSCLParameters;
    }

    public final Boolean getLastSCLResult() {
        return this.lastSCLResult;
    }

    public final Long getLastSCLTimestamp() {
        return this.lastSCLTimestamp;
    }

    /* renamed from: getLastSSPParameters$video_player_internalRelease, reason: from getter */
    public final LoadControlParameters getLastSSPParameters() {
        return this.lastSSPParameters;
    }

    public final Boolean getLastSSPResult() {
        return this.lastSSPResult;
    }

    public final Long getLastSSPTimestamp() {
        return this.lastSSPTimestamp;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.lastEstimatedMaxTargetBuffer) * 31;
        Long l = this.bufferForPlaybackMs;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.bufferForPlaybackAfterRebufferMs;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        LoadControlParameters loadControlParameters = this.lastSCLParameters;
        int hashCode4 = (hashCode3 + (loadControlParameters != null ? loadControlParameters.hashCode() : 0)) * 31;
        Long l3 = this.lastSCLTimestamp;
        int hashCode5 = (hashCode4 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool = this.lastSCLResult;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        LoadControlParameters loadControlParameters2 = this.lastSSPParameters;
        int hashCode7 = (hashCode6 + (loadControlParameters2 != null ? loadControlParameters2.hashCode() : 0)) * 31;
        Long l4 = this.lastSSPTimestamp;
        int hashCode8 = (hashCode7 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Boolean bool2 = this.lastSSPResult;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadControlBufferState(lastEstimatedMaxTargetBuffer=");
        sb.append(this.lastEstimatedMaxTargetBuffer);
        sb.append(", bufferForPlaybackMs=");
        sb.append(this.bufferForPlaybackMs);
        sb.append(", bufferForPlaybackAfterRebufferMs=");
        sb.append(this.bufferForPlaybackAfterRebufferMs);
        sb.append(", lastSCLParameters=");
        sb.append(this.lastSCLParameters);
        sb.append(", lastSCLTimestamp=");
        sb.append(this.lastSCLTimestamp);
        sb.append(", lastSCLResult=");
        sb.append(this.lastSCLResult);
        sb.append(", lastSSPParameters=");
        sb.append(this.lastSSPParameters);
        sb.append(", lastSSPTimestamp=");
        sb.append(this.lastSSPTimestamp);
        sb.append(", lastSSPResult=");
        return oo31.i(sb, this.lastSSPResult, ')');
    }

    public /* synthetic */ LoadControlBufferState(long j, Long l, Long l2, LoadControlParameters loadControlParameters, Long l3, Boolean bool, LoadControlParameters loadControlParameters2, Long l4, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, l, l2, loadControlParameters, l3, bool, loadControlParameters2, l4, bool2);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010-\u001a\u00020\u0003H\u0000¢\u0006\u0002\b.R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001e\u0010'\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001e\u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\f¨\u0006/"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState$Builder;", "", "instance", "Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "(Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;)V", "lastEstimatedMaxTargetBuffer", "", "(J)V", "bufferForPlaybackAfterRebufferMs", "getBufferForPlaybackAfterRebufferMs", "()Ljava/lang/Long;", "setBufferForPlaybackAfterRebufferMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "bufferForPlaybackMs", "getBufferForPlaybackMs", "setBufferForPlaybackMs", "getLastEstimatedMaxTargetBuffer", "()J", "setLastEstimatedMaxTargetBuffer", "lastSCLParameters", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "getLastSCLParameters$video_player_internalRelease", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "setLastSCLParameters$video_player_internalRelease", "(Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;)V", "lastSCLResult", "", "getLastSCLResult", "()Ljava/lang/Boolean;", "setLastSCLResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lastSCLTimestamp", "getLastSCLTimestamp", "setLastSCLTimestamp", "lastSSPParameters", "getLastSSPParameters$video_player_internalRelease", "setLastSSPParameters$video_player_internalRelease", "lastSSPResult", "getLastSSPResult", "setLastSSPResult", "lastSSPTimestamp", "getLastSSPTimestamp", "setLastSSPTimestamp", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long bufferForPlaybackAfterRebufferMs;
        private Long bufferForPlaybackMs;
        private long lastEstimatedMaxTargetBuffer;
        private LoadControlParameters lastSCLParameters;
        private Boolean lastSCLResult;
        private Long lastSCLTimestamp;
        private LoadControlParameters lastSSPParameters;
        private Boolean lastSSPResult;
        private Long lastSSPTimestamp;

        public Builder(LoadControlBufferState loadControlBufferState) {
            this(loadControlBufferState.getLastEstimatedMaxTargetBuffer());
            this.bufferForPlaybackMs = loadControlBufferState.getBufferForPlaybackMs();
            this.bufferForPlaybackAfterRebufferMs = loadControlBufferState.getBufferForPlaybackAfterRebufferMs();
            this.lastSCLParameters = loadControlBufferState.getLastSCLParameters();
            this.lastSCLTimestamp = loadControlBufferState.getLastSCLTimestamp();
            this.lastSCLResult = loadControlBufferState.getLastSCLResult();
            this.lastSSPParameters = loadControlBufferState.getLastSSPParameters();
            this.lastSSPTimestamp = loadControlBufferState.getLastSSPTimestamp();
            this.lastSSPResult = loadControlBufferState.getLastSSPResult();
        }

        public final LoadControlBufferState build$video_player_internalRelease() {
            return new LoadControlBufferState(this.lastEstimatedMaxTargetBuffer, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.lastSCLParameters, this.lastSCLTimestamp, this.lastSCLResult, this.lastSSPParameters, this.lastSSPTimestamp, this.lastSSPResult, null);
        }

        public final Long getBufferForPlaybackAfterRebufferMs() {
            return this.bufferForPlaybackAfterRebufferMs;
        }

        public final Long getBufferForPlaybackMs() {
            return this.bufferForPlaybackMs;
        }

        public final long getLastEstimatedMaxTargetBuffer() {
            return this.lastEstimatedMaxTargetBuffer;
        }

        /* renamed from: getLastSCLParameters$video_player_internalRelease, reason: from getter */
        public final LoadControlParameters getLastSCLParameters() {
            return this.lastSCLParameters;
        }

        public final Boolean getLastSCLResult() {
            return this.lastSCLResult;
        }

        public final Long getLastSCLTimestamp() {
            return this.lastSCLTimestamp;
        }

        /* renamed from: getLastSSPParameters$video_player_internalRelease, reason: from getter */
        public final LoadControlParameters getLastSSPParameters() {
            return this.lastSSPParameters;
        }

        public final Boolean getLastSSPResult() {
            return this.lastSSPResult;
        }

        public final Long getLastSSPTimestamp() {
            return this.lastSSPTimestamp;
        }

        public final void setBufferForPlaybackAfterRebufferMs(Long l) {
            this.bufferForPlaybackAfterRebufferMs = l;
        }

        public final void setBufferForPlaybackMs(Long l) {
            this.bufferForPlaybackMs = l;
        }

        public final void setLastEstimatedMaxTargetBuffer(long j) {
            this.lastEstimatedMaxTargetBuffer = j;
        }

        public final void setLastSCLParameters$video_player_internalRelease(LoadControlParameters loadControlParameters) {
            this.lastSCLParameters = loadControlParameters;
        }

        public final void setLastSCLResult(Boolean bool) {
            this.lastSCLResult = bool;
        }

        public final void setLastSCLTimestamp(Long l) {
            this.lastSCLTimestamp = l;
        }

        public final void setLastSSPParameters$video_player_internalRelease(LoadControlParameters loadControlParameters) {
            this.lastSSPParameters = loadControlParameters;
        }

        public final void setLastSSPResult(Boolean bool) {
            this.lastSSPResult = bool;
        }

        public final void setLastSSPTimestamp(Long l) {
            this.lastSSPTimestamp = l;
        }

        public Builder(long j) {
            this.lastEstimatedMaxTargetBuffer = j;
        }
    }
}
