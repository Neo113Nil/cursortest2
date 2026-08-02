package com.squareup.cash.arcade.components.timeline;

import com.squareup.cash.arcade.components.timeline.TimelineState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface RenderedRow {

    public final class Collapsed implements RenderedRow {
        public final int count;
        public final int originalIndex;
        public final TimelineState.CollapseRange range;

        public Collapsed(int i, TimelineState.CollapseRange collapseRange, int i2) {
            this.originalIndex = i;
            this.range = collapseRange;
            this.count = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) obj;
            return this.originalIndex == collapsed.originalIndex && this.range.equals(collapsed.range) && this.count == collapsed.count;
        }

        @Override // com.squareup.cash.arcade.components.timeline.RenderedRow
        public final int getOriginalIndex() {
            return this.originalIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.count) + ((this.range.hashCode() + (Integer.hashCode(this.originalIndex) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Collapsed(originalIndex=");
            sb.append(this.originalIndex);
            sb.append(", range=");
            sb.append(this.range);
            sb.append(", count=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.count, ")", sb);
        }
    }

    public final class VisibleItem implements RenderedRow {
        public final TimelineItem item;
        public final int originalIndex;

        public VisibleItem(int i, TimelineItem timelineItem) {
            timelineItem.getClass();
            this.originalIndex = i;
            this.item = timelineItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VisibleItem)) {
                return false;
            }
            VisibleItem visibleItem = (VisibleItem) obj;
            return this.originalIndex == visibleItem.originalIndex && Intrinsics.areEqual(this.item, visibleItem.item);
        }

        @Override // com.squareup.cash.arcade.components.timeline.RenderedRow
        public final int getOriginalIndex() {
            return this.originalIndex;
        }

        public final int hashCode() {
            return this.item.hashCode() + (Integer.hashCode(this.originalIndex) * 31);
        }

        public final String toString() {
            return "VisibleItem(originalIndex=" + this.originalIndex + ", item=" + this.item + ")";
        }
    }

    int getOriginalIndex();
}
