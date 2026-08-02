package androidx.compose.foundation.text.input.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ChangeTracker$Change {
    public int originalEnd;
    public int originalStart;
    public int preEnd;
    public int preStart;

    public ChangeTracker$Change(int i, int i2, int i3, int i4) {
        this.preStart = i;
        this.preEnd = i2;
        this.originalStart = i3;
        this.originalEnd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeTracker$Change)) {
            return false;
        }
        ChangeTracker$Change changeTracker$Change = (ChangeTracker$Change) obj;
        return this.preStart == changeTracker$Change.preStart && this.preEnd == changeTracker$Change.preEnd && this.originalStart == changeTracker$Change.originalStart && this.originalEnd == changeTracker$Change.originalEnd;
    }

    public final int hashCode() {
        return Integer.hashCode(this.originalEnd) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.originalStart, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.preEnd, Integer.hashCode(this.preStart) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.preStart);
        sb.append(", preEnd=");
        sb.append(this.preEnd);
        sb.append(", originalStart=");
        sb.append(this.originalStart);
        sb.append(", originalEnd=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.originalEnd, ')');
    }
}
