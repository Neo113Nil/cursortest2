package androidx.paging;

import androidx.paging.LoadState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LoadStates {
    public static final LoadStates IDLE;
    public final LoadState append;
    public final boolean hasError;
    public final boolean isIdle;
    public final LoadState prepend;
    public final LoadState refresh;

    static {
        LoadState.NotLoading notLoading = LoadState.NotLoading.Incomplete;
        IDLE = new LoadStates(notLoading, notLoading, notLoading);
    }

    public LoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
        this.hasError = (loadState instanceof LoadState.Error) || (loadState3 instanceof LoadState.Error) || (loadState2 instanceof LoadState.Error);
        this.isIdle = (loadState instanceof LoadState.NotLoading) && (loadState3 instanceof LoadState.NotLoading) && (loadState2 instanceof LoadState.NotLoading);
    }

    public static LoadStates copy$default(LoadStates loadStates, int i) {
        int i2 = i & 1;
        LoadState loadState = LoadState.NotLoading.Incomplete;
        LoadState loadState2 = i2 != 0 ? loadStates.refresh : loadState;
        LoadState loadState3 = (i & 2) != 0 ? loadStates.prepend : loadState;
        if ((i & 4) != 0) {
            loadState = loadStates.append;
        }
        return new LoadStates(loadState2, loadState3, loadState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return this.refresh.equals(loadStates.refresh) && this.prepend.equals(loadStates.prepend) && this.append.equals(loadStates.append);
    }

    public final int hashCode() {
        return this.append.hashCode() + ((this.prepend.hashCode() + (this.refresh.hashCode() * 31)) * 31);
    }

    public final LoadStates modifyState$paging_common(LoadType loadType) {
        loadType.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return copy$default(this, 6);
        }
        if (ordinal == 1) {
            return copy$default(this, 5);
        }
        if (ordinal == 2) {
            return copy$default(this, 3);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
