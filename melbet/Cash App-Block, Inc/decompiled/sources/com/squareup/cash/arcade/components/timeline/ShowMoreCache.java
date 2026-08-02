package com.squareup.cash.arcade.components.timeline;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.arcade.components.timeline.RowDrawCache;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ShowMoreCache implements RowDrawCache {
    public final long dot1;
    public final long dot2;
    public final long dot3;
    public final RowDrawCache.Line line;

    public ShowMoreCache(RowDrawCache.Line line, long j, long j2, long j3) {
        this.line = line;
        this.dot1 = j;
        this.dot2 = j2;
        this.dot3 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowMoreCache)) {
            return false;
        }
        ShowMoreCache showMoreCache = (ShowMoreCache) obj;
        return Intrinsics.areEqual(this.line, showMoreCache.line) && Offset.m622equalsimpl0(this.dot1, showMoreCache.dot1) && Offset.m622equalsimpl0(this.dot2, showMoreCache.dot2) && Offset.m622equalsimpl0(this.dot3, showMoreCache.dot3);
    }

    public final int hashCode() {
        RowDrawCache.Line line = this.line;
        return Long.hashCode(this.dot3) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((line == null ? 0 : line.hashCode()) * 31, 31, this.dot1), 31, this.dot2);
    }

    public final String toString() {
        String m628toStringimpl = Offset.m628toStringimpl(this.dot1);
        String m628toStringimpl2 = Offset.m628toStringimpl(this.dot2);
        String m628toStringimpl3 = Offset.m628toStringimpl(this.dot3);
        StringBuilder sb = new StringBuilder("ShowMoreCache(line=");
        sb.append(this.line);
        sb.append(", dot1=");
        sb.append(m628toStringimpl);
        sb.append(", dot2=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m628toStringimpl2, ", dot3=", m628toStringimpl3, ")");
    }
}
