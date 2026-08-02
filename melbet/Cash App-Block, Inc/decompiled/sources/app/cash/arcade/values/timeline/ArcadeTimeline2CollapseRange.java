package app.cash.arcade.values.timeline;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class ArcadeTimeline2CollapseRange {
    public static final Companion Companion = new Companion();
    public final IntRange collapsedIndices;
    public final String label;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/timeline/ArcadeTimeline2CollapseRange$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/timeline/ArcadeTimeline2CollapseRange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ArcadeTimeline2CollapseRange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeTimeline2CollapseRange(int i, IntRange intRange, String str) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, ArcadeTimeline2CollapseRange$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.collapsedIndices = intRange;
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcadeTimeline2CollapseRange)) {
            return false;
        }
        ArcadeTimeline2CollapseRange arcadeTimeline2CollapseRange = (ArcadeTimeline2CollapseRange) obj;
        return Intrinsics.areEqual(this.collapsedIndices, arcadeTimeline2CollapseRange.collapsedIndices) && Intrinsics.areEqual(this.label, arcadeTimeline2CollapseRange.label);
    }

    public final int hashCode() {
        int hashCode = this.collapsedIndices.hashCode() * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ArcadeTimeline2CollapseRange(collapsedIndices=" + this.collapsedIndices + ", label=" + this.label + ")";
    }
}
