package app.cash.local.views.wallet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SegmentedTab {
    public final SegmentedTabKind kind;
    public final int titleRes;
    public final ArrayList widgets;

    public SegmentedTab(SegmentedTabKind segmentedTabKind, int i, ArrayList arrayList) {
        this.kind = segmentedTabKind;
        this.titleRes = i;
        this.widgets = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentedTab)) {
            return false;
        }
        SegmentedTab segmentedTab = (SegmentedTab) obj;
        return this.kind == segmentedTab.kind && this.titleRes == segmentedTab.titleRes && this.widgets.equals(segmentedTab.widgets);
    }

    public final int hashCode() {
        return this.widgets.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.titleRes, this.kind.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentedTab(kind=");
        sb.append(this.kind);
        sb.append(", titleRes=");
        sb.append(this.titleRes);
        sb.append(", widgets=");
        return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.widgets);
    }
}
