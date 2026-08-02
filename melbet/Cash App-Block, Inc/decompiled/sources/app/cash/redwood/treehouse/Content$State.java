package app.cash.redwood.treehouse;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Content$State {
    public final boolean attached;
    public final int deliveredChangeCount;
    public final int loadCount;
    public final Throwable uncaughtException;

    public Content$State(int i, int i2, Throwable th, boolean z) {
        this.loadCount = i;
        this.attached = z;
        this.deliveredChangeCount = i2;
        this.uncaughtException = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content$State)) {
            return false;
        }
        Content$State content$State = (Content$State) obj;
        return this.loadCount == content$State.loadCount && this.attached == content$State.attached && this.deliveredChangeCount == content$State.deliveredChangeCount && Intrinsics.areEqual(this.uncaughtException, content$State.uncaughtException);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.deliveredChangeCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.loadCount) * 31, 31, this.attached), 31);
        Throwable th = this.uncaughtException;
        return m + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "State(loadCount=" + this.loadCount + ", attached=" + this.attached + ", deliveredChangeCount=" + this.deliveredChangeCount + ", uncaughtException=" + this.uncaughtException + ")";
    }
}
