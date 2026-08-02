package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComposeStackTraceFrame {
    public final int groupKey;
    public final Integer groupOffset;
    public final SourceInformation sourceInfo;

    public ComposeStackTraceFrame(int i, SourceInformation sourceInformation, Integer num) {
        this.groupKey = i;
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) obj;
        return this.groupKey == composeStackTraceFrame.groupKey && Intrinsics.areEqual(this.sourceInfo, composeStackTraceFrame.sourceInfo) && Intrinsics.areEqual(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.groupKey) * 31;
        SourceInformation sourceInformation = this.sourceInfo;
        int hashCode2 = (hashCode + (sourceInformation == null ? 0 : sourceInformation.hashCode())) * 31;
        Integer num = this.groupOffset;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.groupKey + ", sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }
}
