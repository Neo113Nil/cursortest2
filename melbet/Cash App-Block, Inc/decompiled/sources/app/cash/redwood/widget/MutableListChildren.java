package app.cash.redwood.widget;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import app.cash.redwood.widget.Widget;
import bo.app.b$$ExternalSyntheticLambda3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMutableList;

/* loaded from: classes3.dex */
public final class MutableListChildren implements Widget.Children, List, KMutableList {
    public final List container;
    public final Function0 modifierUpdated;

    public MutableListChildren(SnapshotStateList snapshotStateList, int i) {
        List arrayList = (i & 1) != 0 ? new ArrayList() : snapshotStateList;
        b$$ExternalSyntheticLambda3 b__externalsyntheticlambda3 = new b$$ExternalSyntheticLambda3(11);
        this.container = arrayList;
        this.modifierUpdated = b__externalsyntheticlambda3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        return this.container.add(widget);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        return this.container.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.container.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Widget)) {
            return false;
        }
        return this.container.contains((Widget) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.container.containsAll(collection);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void detach() {
        this.container.clear();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (Widget) this.container.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Widget)) {
            return -1;
        }
        return this.container.indexOf((Widget) obj);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void insert(int i, Widget widget) {
        widget.getClass();
        this.container.add(i, widget);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.container.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Widget)) {
            return -1;
        }
        return this.container.lastIndexOf((Widget) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.container.listIterator();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void move(int i, int i2, int i3) {
        ComposeHelpersKt.move(i, i2, i3, this.container);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void onModifierUpdated(int i, Widget widget) {
        widget.getClass();
        this.modifierUpdated.invoke();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public final void remove(int i, int i2) {
        List list = this.container;
        list.getClass();
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.container.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.container.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        return (Widget) this.container.set(i, widget);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.container.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.container.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.container.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.container.addAll(collection);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        Widget widget = (Widget) obj;
        widget.getClass();
        this.container.add(i, widget);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return (Widget) this.container.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Widget)) {
            return false;
        }
        return this.container.remove((Widget) obj);
    }
}
