package app.cash.redwood.lazylayout.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import app.cash.redwood.Modifier;
import app.cash.redwood.lazylayout.view.SizeOnlyPlaceholder;
import app.cash.redwood.lazylayout.view.ViewLazyList;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$Binding;
import app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$SizeOnlyPlaceholderWidget;
import app.cash.redwood.lazylayout.widget.SparseList;
import app.cash.redwood.widget.Widget;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import java.util.ArrayList;
import kotlin.collections.ArrayDeque;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ViewLazyList$processor$1 {
    public Widget firstPlaceholder;
    public final AndroidSvg items;
    public int newItemsAfter;
    public int newItemsBefore;
    public final CallResult placeholder;
    public final /* synthetic */ ViewLazyList this$0;
    public final ArrayDeque placeholdersQueue = new ArrayDeque();
    public final ArrayList loadedItems = new ArrayList();
    public final SparseList itemsBefore = new SparseList();
    public final SparseList itemsAfter = new SparseList();
    public final ArrayList edits = new ArrayList();

    public ViewLazyList$processor$1(ViewLazyList viewLazyList) {
        this.this$0 = viewLazyList;
        CallResult callResult = new CallResult();
        callResult.serviceNames = this;
        callResult.result = new ArrayList();
        this.placeholder = callResult;
        this.items = new AndroidSvg(this);
    }

    public static LazyListUpdateProcessor$Binding loadedToPlaceholder(LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding) {
        if (lazyListUpdateProcessor$Binding.isPlaceholder) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        if (lazyListUpdateProcessor$Binding.view == null) {
            return null;
        }
        Widget takePlaceholder = lazyListUpdateProcessor$Binding.processor.takePlaceholder();
        if (takePlaceholder != null) {
            lazyListUpdateProcessor$Binding.setContent$redwood_lazylayout_widget(takePlaceholder);
        }
        lazyListUpdateProcessor$Binding.isPlaceholder = true;
        return lazyListUpdateProcessor$Binding;
    }

    public static void setContent(ViewLazyList.ViewHolder viewHolder, Widget widget) {
        viewHolder.getClass();
        View view = widget != null ? (View) widget.getValue() : null;
        viewHolder.content = view;
        FrameLayout frameLayout = viewHolder.container;
        frameLayout.removeAllViews();
        if (view != null) {
            if (view.getParent() != null) {
                Path$$ExternalSyntheticBUOutline0.m$1("Received ", view, " with unexpected parent ", view.getParent());
            } else {
                view.setLayoutParams(ViewLazyList.this.createLayoutParams());
                frameLayout.addView(view);
            }
        }
    }

    public final void maybeShiftLoadedWindow(int i) {
        if (this.loadedItems.size() != 0) {
            return;
        }
        SparseList sparseList = this.itemsBefore;
        int size = sparseList.getSize();
        SparseList sparseList2 = this.itemsAfter;
        if (i < size) {
            int size2 = sparseList.getSize() - i;
            sparseList2.addRange(0, sparseList, i, size2);
            sparseList.removeRange(i, size2 + i);
        } else if (i > sparseList.getSize()) {
            int min = Math.min(i - sparseList.getSize(), sparseList2.getSize());
            sparseList.addRange(sparseList.getSize(), sparseList2, 0, min);
            sparseList2.removeRange(0, min);
        }
    }

    public final LazyListUpdateProcessor$Binding placeholderToLoaded(LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding, Widget widget) {
        Widget widget2;
        if (lazyListUpdateProcessor$Binding == null) {
            LazyListUpdateProcessor$Binding lazyListUpdateProcessor$Binding2 = new LazyListUpdateProcessor$Binding(this, false);
            lazyListUpdateProcessor$Binding2.setContent$redwood_lazylayout_widget(widget);
            return lazyListUpdateProcessor$Binding2;
        }
        if (!lazyListUpdateProcessor$Binding.isPlaceholder) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        if (lazyListUpdateProcessor$Binding.view != null && (widget2 = lazyListUpdateProcessor$Binding.content) != null && !(widget2 instanceof LazyListUpdateProcessor$SizeOnlyPlaceholderWidget)) {
            this.placeholdersQueue.add(widget2);
        }
        lazyListUpdateProcessor$Binding.isPlaceholder = false;
        lazyListUpdateProcessor$Binding.setContent$redwood_lazylayout_widget(widget);
        return lazyListUpdateProcessor$Binding;
    }

    public final Widget takePlaceholder() {
        Widget widget = (Widget) this.placeholdersQueue.removeFirstOrNull();
        if (widget != null) {
            return widget;
        }
        Widget widget2 = this.firstPlaceholder;
        if (widget2 == null) {
            return null;
        }
        View view = (View) widget2.getValue();
        view.getClass();
        Context context = this.this$0.recyclerView.getContext();
        context.getClass();
        final SizeOnlyPlaceholder sizeOnlyPlaceholder = new SizeOnlyPlaceholder(view, context);
        final Modifier modifier = widget2.getModifier();
        return new Widget(sizeOnlyPlaceholder, modifier) { // from class: app.cash.redwood.lazylayout.widget.LazyListUpdateProcessor$SizeOnlyPlaceholderWidget
            public Modifier modifier;
            public final SizeOnlyPlaceholder value;

            {
                modifier.getClass();
                this.value = sizeOnlyPlaceholder;
                this.modifier = modifier;
            }

            @Override // app.cash.redwood.widget.Widget
            public final Modifier getModifier() {
                return this.modifier;
            }

            @Override // app.cash.redwood.widget.Widget
            public final Object getValue() {
                return this.value;
            }

            @Override // app.cash.redwood.widget.Widget
            public final void setModifier(Modifier modifier2) {
                modifier2.getClass();
                this.modifier = modifier2;
            }
        };
    }
}
