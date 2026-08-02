package androidx.paging;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CombinedLoadStates {
    public final LoadState append;
    public final boolean hasError;
    public final LoadStates mediator;
    public final LoadState prepend;
    public final LoadState refresh;
    public final LoadStates source;

    public CombinedLoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadStates loadStates, LoadStates loadStates2) {
        loadState.getClass();
        loadState2.getClass();
        loadState3.getClass();
        loadStates.getClass();
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
        this.source = loadStates;
        this.mediator = loadStates2;
        boolean z = true;
        if (loadStates.isIdle && loadStates2 != null) {
            boolean z2 = loadStates2.isIdle;
        }
        if (!loadStates.hasError) {
            if (!(loadStates2 != null ? loadStates2.hasError : false)) {
                z = false;
            }
        }
        this.hasError = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedLoadStates.class != obj.getClass()) {
            return false;
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        return Intrinsics.areEqual(this.refresh, combinedLoadStates.refresh) && Intrinsics.areEqual(this.prepend, combinedLoadStates.prepend) && Intrinsics.areEqual(this.append, combinedLoadStates.append) && Intrinsics.areEqual(this.source, combinedLoadStates.source) && Intrinsics.areEqual(this.mediator, combinedLoadStates.mediator);
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + ((this.append.hashCode() + ((this.prepend.hashCode() + (this.refresh.hashCode() * 31)) * 31)) * 31)) * 31;
        LoadStates loadStates = this.mediator;
        return hashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }
}
