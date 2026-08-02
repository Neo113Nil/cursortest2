package com.squareup.cash.arcade.components.timeline;

import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes5.dex */
public interface RowDrawCache {

    public final class Line {
        public final long end;
        public final long start;

        public Line(long j, long j2) {
            this.start = j;
            this.end = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return Offset.m622equalsimpl0(this.start, line.start) && Offset.m622equalsimpl0(this.end, line.end);
        }

        public final int hashCode() {
            return Long.hashCode(this.end) + (Long.hashCode(this.start) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Line(start=", Offset.m628toStringimpl(this.start), ", end=", Offset.m628toStringimpl(this.end), ")");
        }
    }
}
