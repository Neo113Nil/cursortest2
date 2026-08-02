package ru.yandex.video.m3.player.impl.tracking;

import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/State;", "", "willPlayWhenReady", "", "isLoading", "(ZZ)V", "()Z", "getWillPlayWhenReady", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class State {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final boolean willPlayWhenReady;

    public State(boolean z, boolean z2) {
        this.willPlayWhenReady = z;
        this.isLoading = z2;
    }

    public static /* synthetic */ State copy$default(State state, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = state.willPlayWhenReady;
        }
        if ((i & 2) != 0) {
            z2 = state.isLoading;
        }
        return state.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWillPlayWhenReady() {
        return this.willPlayWhenReady;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final State copy(boolean willPlayWhenReady, boolean isLoading) {
        return new State(willPlayWhenReady, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.willPlayWhenReady == state.willPlayWhenReady && this.isLoading == state.isLoading;
    }

    public final boolean getWillPlayWhenReady() {
        return this.willPlayWhenReady;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + (Boolean.hashCode(this.willPlayWhenReady) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("State(willPlayWhenReady=");
        sb.append(this.willPlayWhenReady);
        sb.append(", isLoading=");
        return unr0.u(sb, this.isLoading, ')');
    }
}
