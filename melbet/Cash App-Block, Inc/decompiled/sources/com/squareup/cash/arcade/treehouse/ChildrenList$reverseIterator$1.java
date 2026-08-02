package com.squareup.cash.arcade.treehouse;

import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.contour.ContourLayout;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes5.dex */
public final class ChildrenList$reverseIterator$1 implements Iterator, KMappedMarker {
    public int lastIndex;
    public int nextIndex = -1;
    public final /* synthetic */ ChildrenList this$0;

    public ChildrenList$reverseIterator$1(ChildrenList childrenList) {
        this.this$0 = childrenList;
        this.lastIndex = childrenList.viewGroup.getChildCount();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextIndex != -1) {
            return true;
        }
        for (int i = this.lastIndex - 1; -1 < i; i--) {
            ChildrenList childrenList = this.this$0;
            View childAt = childrenList.viewGroup.getChildAt(i);
            childAt.getClass();
            if (Intrinsics.areEqual((String) childAt.getTag(R.id.treehouseSlotTag), childrenList.slotTag)) {
                this.nextIndex = i;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        View childAt = this.this$0.viewGroup.getChildAt(this.nextIndex);
        this.lastIndex = this.nextIndex;
        this.nextIndex = -1;
        childAt.getClass();
        return childAt;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.lastIndex;
        ContourLayout contourLayout = this.this$0.viewGroup;
        if (i >= contourLayout.getChildCount()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        View childAt = contourLayout.getChildAt(this.lastIndex);
        childAt.getClass();
        childAt.setTag(R.id.treehouseSlotTag, null);
        contourLayout.removeViewAt(this.lastIndex);
    }
}
