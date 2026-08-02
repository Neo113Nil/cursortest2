package com.squareup.cash.arcade.components.timeline;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.arcade.components.timeline.RowDrawCache;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class VisibleItemDrawCache implements RowDrawCache {
    public final long fillTopLeft;
    public final RowDrawCache.Line line;
    public final TimelineItem.State state;
    public final long strokeTopLeft;

    public VisibleItemDrawCache(TimelineItem.State state, long j, long j2, RowDrawCache.Line line) {
        state.getClass();
        this.state = state;
        this.fillTopLeft = j;
        this.strokeTopLeft = j2;
        this.line = line;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleItemDrawCache)) {
            return false;
        }
        VisibleItemDrawCache visibleItemDrawCache = (VisibleItemDrawCache) obj;
        return this.state == visibleItemDrawCache.state && Offset.m622equalsimpl0(this.fillTopLeft, visibleItemDrawCache.fillTopLeft) && Offset.m622equalsimpl0(this.strokeTopLeft, visibleItemDrawCache.strokeTopLeft) && Intrinsics.areEqual(this.line, visibleItemDrawCache.line);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.state.hashCode() * 31, 31, this.fillTopLeft), 31, this.strokeTopLeft);
        RowDrawCache.Line line = this.line;
        return m + (line == null ? 0 : line.hashCode());
    }

    public final String toString() {
        return "VisibleItemDrawCache(state=" + this.state + ", fillTopLeft=" + Offset.m628toStringimpl(this.fillTopLeft) + ", strokeTopLeft=" + Offset.m628toStringimpl(this.strokeTopLeft) + ", line=" + this.line + ")";
    }
}
