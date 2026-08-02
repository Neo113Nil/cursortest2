package app.cash.redwood.lazylayout.widget;

import app.cash.redwood.lazylayout.view.ViewLazyList;
import app.cash.redwood.lazylayout.view.ViewLazyList$processor$1;
import app.cash.redwood.widget.Widget;
import kotlin.collections.RingBuffer$iterator$1;

/* loaded from: classes3.dex */
public final class LazyListUpdateProcessor$Binding {
    public Widget content;
    public boolean isPlaceholder;
    public final ViewLazyList$processor$1 processor;
    public ViewLazyList.ViewHolder view;

    public LazyListUpdateProcessor$Binding(ViewLazyList$processor$1 viewLazyList$processor$1, boolean z) {
        viewLazyList$processor$1.getClass();
        this.processor = viewLazyList$processor$1;
        this.isPlaceholder = z;
    }

    public final void setContent$redwood_lazylayout_widget(Widget widget) {
        widget.getClass();
        this.content = widget;
        ViewLazyList.ViewHolder viewHolder = this.view;
        if (viewHolder != null) {
            this.processor.getClass();
            ViewLazyList$processor$1.setContent(viewHolder, widget);
        }
    }

    public final void unbind() {
        ViewLazyList.ViewHolder viewHolder = this.view;
        if (viewHolder == null) {
            return;
        }
        ViewLazyList$processor$1 viewLazyList$processor$1 = this.processor;
        viewLazyList$processor$1.getClass();
        SparseList sparseList = viewLazyList$processor$1.itemsAfter;
        SparseList sparseList2 = viewLazyList$processor$1.itemsBefore;
        ViewLazyList$processor$1.setContent(viewHolder, null);
        this.view = null;
        if (this.isPlaceholder) {
            sparseList2.getClass();
            RingBuffer$iterator$1 ringBuffer$iterator$1 = new RingBuffer$iterator$1(sparseList2);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!ringBuffer$iterator$1.hasNext()) {
                    i2 = -1;
                    break;
                } else if (((LazyListUpdateProcessor$Binding) ringBuffer$iterator$1.next()) == this) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                sparseList2.removeAt(i2);
                sparseList2.add(i2, null);
            }
            sparseList.getClass();
            RingBuffer$iterator$1 ringBuffer$iterator$12 = new RingBuffer$iterator$1(sparseList);
            while (true) {
                if (!ringBuffer$iterator$12.hasNext()) {
                    i = -1;
                    break;
                } else if (((LazyListUpdateProcessor$Binding) ringBuffer$iterator$12.next()) == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                sparseList.removeAt(i);
                sparseList.add(i, null);
            }
            Widget widget = this.content;
            if (widget != null && !(widget instanceof LazyListUpdateProcessor$SizeOnlyPlaceholderWidget)) {
                viewLazyList$processor$1.placeholdersQueue.add(widget);
            }
            this.content = null;
        }
    }
}
