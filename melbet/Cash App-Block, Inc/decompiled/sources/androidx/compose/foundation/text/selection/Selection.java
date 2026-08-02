package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import coil3.size.SizeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Selection {
    public final AnchorInfo end;
    public final boolean handlesCrossed;
    public final AnchorInfo start;

    public final class AnchorInfo {
        public final ResolvedTextDirection direction;
        public final int offset;
        public final long selectableId;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.direction = resolvedTextDirection;
            this.offset = i;
            this.selectableId = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int hashCode() {
            return Long.hashCode(this.selectableId) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.offset, this.direction.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.direction);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(", selectableId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selectableId, ')');
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z;
    }

    public static Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i) {
        if ((i & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i & 4) != 0) {
            z = selection.handlesCrossed;
        }
        selection.getClass();
        return new Selection(anchorInfo, anchorInfo2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return Intrinsics.areEqual(this.start, selection.start) && Intrinsics.areEqual(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final AnchorInfo getStart() {
        return this.start;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.handlesCrossed) + ((this.end.hashCode() + (this.start.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", handlesCrossed=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.handlesCrossed, ')');
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m441toTextRanged9O1mEE() {
        return SizeKt.TextRange(this.start.offset, this.end.offset);
    }
}
