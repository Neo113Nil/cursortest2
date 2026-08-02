package androidx.compose.runtime.composer.gapbuffer;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SourceInformationSlotTableGroupIdentity {
    public final int index;
    public final Object parentIdentity;

    public SourceInformationSlotTableGroupIdentity(Object obj, int i) {
        this.parentIdentity = obj;
        this.index = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return Intrinsics.areEqual(this.parentIdentity, sourceInformationSlotTableGroupIdentity.parentIdentity) && this.index == sourceInformationSlotTableGroupIdentity.index;
    }

    public final int hashCode() {
        return Integer.hashCode(this.index) + (this.parentIdentity.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb.append(this.parentIdentity);
        sb.append(", index=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.index, ')');
    }
}
