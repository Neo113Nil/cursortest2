package ru.yandex.video.m3.data.loadcontrol;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.jeg;
import defpackage.oeg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "", "Ljeg;", "bufferState", "<init>", "(Ljeg;)V", "component1", "()Ljeg;", "copy", "(Ljeg;)Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljeg;", "getBufferState", "Companion", "oeg", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class LoadControlState {
    public static final int $stable = 0;

    @NotNull
    public static final oeg Companion = new oeg();

    @NotNull
    private static final LoadControlState EMPTY = new LoadControlState(null, 1, null);

    @NotNull
    private final jeg bufferState;

    public LoadControlState(jeg jegVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new jeg(0L, null, null, null, null, null, null, null, null) : jegVar);
    }

    public static /* synthetic */ LoadControlState copy$default(LoadControlState loadControlState, jeg jegVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jegVar = loadControlState.bufferState;
        }
        return loadControlState.copy(jegVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final jeg getBufferState() {
        return this.bufferState;
    }

    @NotNull
    public final LoadControlState copy(@NotNull jeg bufferState) {
        bufferState.getClass();
        return new LoadControlState(bufferState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadControlState) && Intrinsics.d(this.bufferState, ((LoadControlState) other).bufferState);
    }

    @NotNull
    public final jeg getBufferState() {
        return this.bufferState;
    }

    public int hashCode() {
        return this.bufferState.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadControlState(bufferState=" + this.bufferState + ')';
    }

    public LoadControlState(@NotNull jeg jegVar) {
        jegVar.getClass();
        this.bufferState = jegVar;
    }

    public LoadControlState() {
        this(null, 1, null);
    }
}
