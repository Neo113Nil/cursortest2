package androidx.collection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.MutableVectorKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.intellij.markdown.lexer.Stack;

/* loaded from: classes.dex */
public final class MutableObjectList {
    public int _size;
    public Object[] content;
    public Stack list;

    /* loaded from: classes3.dex */
    public final class MutableObjectListIterator implements ListIterator, KMappedMarker {
        public final List list;
        public int prevIndex;

        public MutableObjectListIterator(List list, int i) {
            this.list = list;
            this.prevIndex = i - 1;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            this.list.add(i, obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.list.set(this.prevIndex, obj);
        }
    }

    public MutableObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public final void add(Object obj) {
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        Object[] objArr2 = this.content;
        int i2 = this._size;
        objArr2[i2] = obj;
        this._size = i2 + 1;
    }

    public final void addAll(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this._size;
        int size = list.size() + i;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this._size = list.size() + this._size;
    }

    public final void clear() {
        ArraysKt___ArraysJvmKt.fill(this.content, 0, this._size, null);
        this._size = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            int i = mutableObjectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = mutableObjectList.content;
                IntRange until = RangesKt___RangesKt.until(0, i2);
                int i3 = until.first;
                int i4 = until.last;
                if (i3 > i4) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        throw null;
    }

    public final Object get(int i) {
        if (i >= 0 && i < this._size) {
            return this.content[i];
        }
        throwIndexOutOfBoundsExclusiveException$collection(i);
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        Object[] objArr = this.content;
        int i = 0;
        if (obj == null) {
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this._size;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final Object removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
            throw null;
        }
        Object[] objArr = this.content;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ArraysKt___ArraysJvmKt.copyInto(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this._size - 1;
        this._size = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Start (", ") and end (", ") must be in 0..");
            m107m.append(this._size);
            RuntimeHelpersKt.throwIndexOutOfBoundsException(m107m.toString());
            throw null;
        }
        if (i2 < i) {
            RuntimeHelpersKt.throwIllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.content;
                ArraysKt___ArraysJvmKt.copyInto(i, i2, i3, objArr, objArr);
            }
            int i4 = this._size;
            int i5 = i4 - (i2 - i);
            ArraysKt___ArraysJvmKt.fill(this.content, i5, i4, null);
            this._size = i5;
        }
    }

    public final void resizeStorage(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ArraysKt___ArraysJvmKt.copyInto(0, 0, length, objArr, objArr2);
        this.content = objArr2;
    }

    public final Object set(int i, Object obj) {
        if (i < 0 || i >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
            throw null;
        }
        Object[] objArr = this.content;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i) {
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", " must be in 0..");
        m2m.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(m2m.toString());
        throw null;
    }

    public final String toString() {
        int i = 0;
        ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = new ObjectList$$ExternalSyntheticLambda0(this, i);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            if (i >= i2) {
                break;
            }
            Object obj = objArr[i];
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) objectList$$ExternalSyntheticLambda0.invoke(obj));
            i++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ MutableObjectList() {
        this(16);
    }

    /* loaded from: classes3.dex */
    public final class SubList implements List, KMutableList {
        public final /* synthetic */ int $r8$classId;
        public int end;
        public final List list;
        public final int start;

        public /* synthetic */ SubList(int i, int i2, int i3, List list) {
            this.$r8$classId = i3;
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            int i2 = this.$r8$classId;
            int i3 = this.start;
            List list = this.list;
            switch (i2) {
                case 0:
                    list.add(i + i3, obj);
                    this.end++;
                    break;
                default:
                    list.add(i + i3, obj);
                    this.end++;
                    break;
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            int i2 = this.$r8$classId;
            int i3 = this.start;
            List list = this.list;
            switch (i2) {
                case 0:
                    collection.getClass();
                    list.addAll(i + i3, collection);
                    this.end = collection.size() + this.end;
                    if (collection.size() > 0) {
                        break;
                    }
                    break;
                default:
                    list.addAll(i + i3, collection);
                    int size = collection.size();
                    this.end += size;
                    if (size > 0) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.$r8$classId;
            List list = this.list;
            int i2 = this.start;
            switch (i) {
                case 0:
                    int i3 = this.end - 1;
                    if (i2 <= i3) {
                        while (true) {
                            list.remove(i3);
                            if (i3 != i2) {
                                i3--;
                            }
                        }
                    }
                    this.end = i2;
                    break;
                default:
                    int i4 = this.end - 1;
                    if (i2 <= i4) {
                        while (true) {
                            list.remove(i4);
                            if (i4 != i2) {
                                i4--;
                            }
                        }
                    }
                    this.end = i2;
                    break;
            }
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.$r8$classId;
            List list = this.list;
            int i2 = this.start;
            switch (i) {
                case 0:
                    int i3 = this.end;
                    while (i2 < i3) {
                        if (Intrinsics.areEqual(list.get(i2), obj)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                default:
                    int i4 = this.end;
                    while (i2 < i4) {
                        if (Intrinsics.areEqual(list.get(i2), obj)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            switch (this.$r8$classId) {
                case 0:
                    collection.getClass();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            break;
                        }
                    }
                    break;
                default:
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        if (!contains(it2.next())) {
                            break;
                        }
                    }
                    break;
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            int i2 = this.$r8$classId;
            int i3 = this.start;
            List list = this.list;
            switch (i2) {
                case 0:
                    ObjectListKt.access$checkIndex(i, this);
                    break;
                default:
                    MutableVectorKt.checkIndex(i, this);
                    break;
            }
            return list.get(i + i3);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.$r8$classId;
            List list = this.list;
            int i2 = this.start;
            switch (i) {
                case 0:
                    int i3 = this.end;
                    for (int i4 = i2; i4 < i3; i4++) {
                        if (Intrinsics.areEqual(list.get(i4), obj)) {
                            return i4 - i2;
                        }
                    }
                    return -1;
                default:
                    int i5 = this.end;
                    for (int i6 = i2; i6 < i5; i6++) {
                        if (Intrinsics.areEqual(list.get(i6), obj)) {
                            return i6 - i2;
                        }
                    }
                    return -1;
            }
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            switch (this.$r8$classId) {
                case 0:
                    if (this.end == this.start) {
                    }
                    break;
                default:
                    if (this.end == this.start) {
                    }
                    break;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            switch (this.$r8$classId) {
                case 0:
                    return new MutableObjectListIterator(this, 0);
                default:
                    return new MutableVector.VectorListIterator(this, 0);
            }
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.$r8$classId;
            List list = this.list;
            int i2 = this.start;
            switch (i) {
                case 0:
                    int i3 = this.end - 1;
                    if (i2 <= i3) {
                        while (!Intrinsics.areEqual(list.get(i3), obj)) {
                            if (i3 == i2) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        break;
                    }
                    break;
                default:
                    int i4 = this.end - 1;
                    if (i2 <= i4) {
                        while (!Intrinsics.areEqual(list.get(i4), obj)) {
                            if (i4 == i2) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        break;
                    }
                    break;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            switch (this.$r8$classId) {
                case 0:
                    return new MutableObjectListIterator(this, 0);
                default:
                    return new MutableVector.VectorListIterator(this, 0);
            }
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.$r8$classId;
            int i2 = this.start;
            List list = this.list;
            switch (i) {
                case 0:
                    int i3 = this.end;
                    while (i2 < i3) {
                        if (Intrinsics.areEqual(list.get(i2), obj)) {
                            list.remove(i2);
                            this.end--;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                default:
                    int i4 = this.end;
                    while (i2 < i4) {
                        if (Intrinsics.areEqual(list.get(i2), obj)) {
                            list.remove(i2);
                            this.end--;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            switch (this.$r8$classId) {
                case 0:
                    collection.getClass();
                    int i = this.end;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        remove(it.next());
                    }
                    if (i != this.end) {
                        break;
                    }
                    break;
                default:
                    int i2 = this.end;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        remove(it2.next());
                    }
                    if (i2 != this.end) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            int i = this.$r8$classId;
            int i2 = this.start;
            List list = this.list;
            switch (i) {
                case 0:
                    collection.getClass();
                    int i3 = this.end;
                    int i4 = i3 - 1;
                    if (i2 <= i4) {
                        while (true) {
                            if (!collection.contains(list.get(i4))) {
                                list.remove(i4);
                                this.end--;
                            }
                            if (i4 != i2) {
                                i4--;
                            }
                        }
                    }
                    if (i3 != this.end) {
                        break;
                    }
                    break;
                default:
                    int i5 = this.end;
                    int i6 = i5 - 1;
                    if (i2 <= i6) {
                        while (true) {
                            if (!collection.contains(list.get(i6))) {
                                list.remove(i6);
                                this.end--;
                            }
                            if (i6 != i2) {
                                i6--;
                            }
                        }
                    }
                    if (i5 != this.end) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            int i2 = this.$r8$classId;
            int i3 = this.start;
            List list = this.list;
            switch (i2) {
                case 0:
                    ObjectListKt.access$checkIndex(i, this);
                    break;
                default:
                    MutableVectorKt.checkIndex(i, this);
                    break;
            }
            return list.set(i + i3, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            int i;
            int i2;
            switch (this.$r8$classId) {
                case 0:
                    i = this.end;
                    i2 = this.start;
                    break;
                default:
                    i = this.end;
                    i2 = this.start;
                    break;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ObjectListKt.access$checkSubIndex(i, i2, this);
                    return new SubList(i, i2, 0, this);
                default:
                    MutableVectorKt.checkSubIndex(i, i2, this);
                    return new SubList(i, i2, 1, this);
            }
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            switch (this.$r8$classId) {
                case 0:
                    objArr.getClass();
                    break;
            }
            return ArrayIteratorKt.toArray(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            switch (this.$r8$classId) {
            }
            return ArrayIteratorKt.toArray(this);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new MutableObjectListIterator(this, i);
                default:
                    return new MutableVector.VectorListIterator(this, i);
            }
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.$r8$classId;
            List list = this.list;
            switch (i) {
                case 0:
                    int i2 = this.end;
                    this.end = i2 + 1;
                    list.add(i2, obj);
                    break;
                default:
                    int i3 = this.end;
                    this.end = i3 + 1;
                    list.add(i3, obj);
                    break;
            }
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            int i = this.$r8$classId;
            List list = this.list;
            switch (i) {
                case 0:
                    collection.getClass();
                    list.addAll(this.end, collection);
                    this.end = collection.size() + this.end;
                    if (collection.size() > 0) {
                        break;
                    }
                    break;
                default:
                    list.addAll(this.end, collection);
                    int size = collection.size();
                    this.end += size;
                    if (size > 0) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.List
        public final Object remove(int i) {
            int i2 = this.$r8$classId;
            int i3 = this.start;
            List list = this.list;
            switch (i2) {
                case 0:
                    ObjectListKt.access$checkIndex(i, this);
                    this.end--;
                    return list.remove(i + i3);
                default:
                    MutableVectorKt.checkIndex(i, this);
                    this.end--;
                    return list.remove(i + i3);
            }
        }
    }

    public final void addAll(MutableObjectList mutableObjectList) {
        mutableObjectList.getClass();
        if (mutableObjectList.isEmpty()) {
            return;
        }
        int i = this._size + mutableObjectList._size;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        ArraysKt___ArraysJvmKt.copyInto(this._size, 0, mutableObjectList._size, mutableObjectList.content, this.content);
        this._size += mutableObjectList._size;
    }
}
