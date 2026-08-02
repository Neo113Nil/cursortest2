package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator implements Iterator, KMappedMarker {
    public boolean canRemove;
    public int index;
    public int size;

    public IndexBasedArrayIterator(int i) {
        this.size = i;
    }

    public abstract Object elementAt(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object elementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.canRemove) {
            RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
            throw null;
        }
        int i = this.index - 1;
        this.index = i;
        removeAt(i);
        this.size--;
        this.canRemove = false;
    }

    public abstract void removeAt(int i);
}
