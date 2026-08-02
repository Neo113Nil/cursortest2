package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class TreeIterator implements Iterator, KMappedMarker {
    public Iterator iterator;
    public final ArrayList stack = new ArrayList();

    public TreeIterator(ViewGroupKt$iterator$1 viewGroupKt$iterator$1) {
        this.iterator = viewGroupKt$iterator$1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.iterator.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = viewGroup != null ? new ViewGroupKt$iterator$1(viewGroup) : null;
        ArrayList arrayList = this.stack;
        if (viewGroupKt$iterator$1 != null && viewGroupKt$iterator$1.hasNext()) {
            arrayList.add(this.iterator);
            this.iterator = viewGroupKt$iterator$1;
            return next;
        }
        while (!this.iterator.hasNext() && !arrayList.isEmpty()) {
            this.iterator = (Iterator) CollectionsKt.last((List) arrayList);
            CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
