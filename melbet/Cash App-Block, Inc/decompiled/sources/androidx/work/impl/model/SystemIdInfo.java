package androidx.work.impl.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SystemIdInfo {
    public final int generation;
    public final int systemId;
    public final String workSpecId;

    public SystemIdInfo(String str, int i, int i2) {
        str.getClass();
        this.workSpecId = str;
        this.generation = i;
        this.systemId = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return Intrinsics.areEqual(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.systemId) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.generation, this.workSpecId.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.workSpecId);
        sb.append(", generation=");
        sb.append(this.generation);
        sb.append(", systemId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.systemId, ')');
    }
}
