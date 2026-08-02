package androidx.work.impl.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WorkGenerationalId {
    public final int generation;
    public final String workSpecId;

    public WorkGenerationalId(String str, int i) {
        str.getClass();
        this.workSpecId = str;
        this.generation = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return Intrinsics.areEqual(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    public final int hashCode() {
        return Integer.hashCode(this.generation) + (this.workSpecId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.workSpecId);
        sb.append(", generation=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.generation, ')');
    }
}
