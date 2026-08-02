package com.squareup.cash.arcade.treehouse;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import app.cash.redwood.widget.MutableListChildren;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.R;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.contour.ContourLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes5.dex */
public final class ChildrenList implements Widget.Children, Sequence {
    public final MutableListChildren delegate;
    public final LinesSequence reversed;
    public final String slotTag;
    public final ContourLayout viewGroup;
    public final List widgets;

    public ChildrenList(ContourLayout contourLayout, String str) {
        this.viewGroup = contourLayout;
        this.slotTag = str;
        MutableListChildren mutableListChildren = new MutableListChildren(null, 3);
        this.delegate = mutableListChildren;
        this.widgets = mutableListChildren.container;
        this.reversed = new LinesSequence(this, 2);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void detach() {
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void insert(int i, Widget widget) {
        widget.getClass();
        MutableListChildren mutableListChildren = this.delegate;
        mutableListChildren.getClass();
        mutableListChildren.container.add(i, widget);
        int viewGroupIndex = toViewGroupIndex(i);
        ContourLayout contourLayout = this.viewGroup;
        if (viewGroupIndex == -1) {
            viewGroupIndex = contourLayout.getChildCount();
        }
        View view = (View) widget.getValue();
        view.getClass();
        view.setTag(R.id.treehouseSlotTag, this.slotTag);
        contourLayout.addView((View) widget.getValue(), viewGroupIndex, new ContourLayout.LayoutSpec(ContourLayout.leftTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 0)), ContourLayout.topTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 6))));
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new ViewGroupKt$children$1(this.viewGroup), new ContextKt$$ExternalSyntheticLambda1(this, 29)));
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void move(int i, int i2, int i3) {
        throw new IllegalStateException("not implemented");
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void onModifierUpdated(int i, Widget widget) {
        widget.getClass();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void remove(int i, int i2) {
        this.delegate.remove(i, i2);
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            }
            int viewGroupIndex = toViewGroupIndex(i);
            ContourLayout contourLayout = this.viewGroup;
            ViewGroupKt.get(contourLayout, viewGroupIndex).setTag(R.id.treehouseSlotTag, null);
            contourLayout.removeViewAt(viewGroupIndex);
        }
    }

    public final int toViewGroupIndex(int i) {
        ContourLayout contourLayout = this.viewGroup;
        int childCount = contourLayout.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = contourLayout.getChildAt(i3);
            childAt.getClass();
            if (Intrinsics.areEqual((String) childAt.getTag(R.id.treehouseSlotTag), this.slotTag)) {
                if (i2 == i) {
                    return i3;
                }
                i2++;
            }
        }
        return -1;
    }
}
