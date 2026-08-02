package ru.yandex.video.m3.data.loadcontrol;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "", "bufferState", "Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "(Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;)V", "getBufferState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LoadControlState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LoadControlState EMPTY = new LoadControlState(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    private final LoadControlBufferState bufferState;

    public /* synthetic */ LoadControlState(LoadControlBufferState loadControlBufferState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LoadControlBufferStateKt.LoadControlBufferState$default(0L, null, 2, null) : loadControlBufferState);
    }

    public static /* synthetic */ LoadControlState copy$default(LoadControlState loadControlState, LoadControlBufferState loadControlBufferState, int i, Object obj) {
        if ((i & 1) != 0) {
            loadControlBufferState = loadControlState.bufferState;
        }
        return loadControlState.copy(loadControlBufferState);
    }

    /* renamed from: component1, reason: from getter */
    public final LoadControlBufferState getBufferState() {
        return this.bufferState;
    }

    public final LoadControlState copy(LoadControlBufferState bufferState) {
        return new LoadControlState(bufferState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadControlState) && jl40.l(this.bufferState, ((LoadControlState) other).bufferState);
    }

    public final LoadControlBufferState getBufferState() {
        return this.bufferState;
    }

    public int hashCode() {
        return this.bufferState.hashCode();
    }

    public String toString() {
        return "LoadControlState(bufferState=" + this.bufferState + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlState$Companion;", "", "()V", "EMPTY", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "getEMPTY", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoadControlState getEMPTY() {
            return LoadControlState.EMPTY;
        }

        private Companion() {
        }
    }

    public LoadControlState(LoadControlBufferState loadControlBufferState) {
        this.bufferState = loadControlBufferState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadControlState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
