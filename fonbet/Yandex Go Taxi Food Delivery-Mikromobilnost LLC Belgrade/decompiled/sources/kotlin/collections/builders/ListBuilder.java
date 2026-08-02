package kotlin.collections.builders;

import defpackage.bb1;
import defpackage.f73;
import defpackage.g8;
import defpackage.jl40;
import defpackage.k8;
import defpackage.ny61;
import defpackage.qqy;
import defpackage.v8;
import defpackage.w511;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002\u0014\u0015J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lv8;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "", "backing", "[Ljava/lang/Object;", "", "length", CA20Status.STATUS_USER_I, "", "isReadOnly", "Z", "qqy", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ListBuilder<E> extends v8 implements List<E>, RandomAccess, Serializable {
    public static final ListBuilder a;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        a = listBuilder;
    }

    public ListBuilder(int i) {
        if (i >= 0) {
            this.backing = (E[]) new Object[i];
        } else {
            ny61.g("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.c(i, i2);
        i(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k();
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.c(i, i2);
        int size = collection.size();
        h(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (jl40.l(eArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.b(i, i2);
        return this.backing[i];
    }

    @Override // defpackage.v8
    /* renamed from: getSize, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public final void h(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            E e = eArr[i3];
            i2 = (i2 * 31) + (e != null ? e.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        ((E[]) this.backing)[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (jl40.l(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final ListBuilder j() {
        k();
        this.isReadOnly = true;
        return this.length > 0 ? this : a;
    }

    public final void k() {
        if (this.isReadOnly) {
            w511.u();
        }
    }

    public final void l(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i3 > eArr.length) {
            g8 g8Var = k8.Companion;
            int length = eArr.length;
            g8Var.getClass();
            this.backing = (E[]) Arrays.copyOf(this.backing, g8.e(length, i3));
        }
        E[] eArr2 = this.backing;
        f73.g(eArr2, i + i2, eArr2, i, this.length);
        this.length += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (jl40.l(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.c(i, i2);
        return new qqy(this, i);
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e = eArr[i];
        f73.g(eArr, i, eArr, i + 1, this.length);
        E[] eArr2 = this.backing;
        int i2 = this.length;
        eArr2[i2 - 1] = null;
        this.length = i2 - 1;
        return e;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        f73.g(eArr, i, eArr, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        bb1.H(i3 - i2, i3, eArr2);
        this.length -= i2;
    }

    public final int p(int i, int i2, Collection collection, boolean z) {
        E[] eArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            eArr = this.backing;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(eArr[i5]) == z) {
                E[] eArr2 = this.backing;
                i3++;
                eArr2[i4 + i] = eArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        f73.g(eArr, i + i4, eArr, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        bb1.H(i7 - i6, i7, eArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k();
        return p(0, this.length, collection, false) > 0;
    }

    @Override // defpackage.v8
    public final Object removeAt(int i) {
        k();
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.b(i, i2);
        return m(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k();
        return p(0, this.length, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        g8 g8Var = k8.Companion;
        int i2 = this.length;
        g8Var.getClass();
        g8.b(i, i2);
        Object[] objArr = this.backing;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        g8 g8Var = k8.Companion;
        int i3 = this.length;
        g8Var.getClass();
        g8.d(i, i2, i3);
        return new BuilderSubList(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.length;
        E[] eArr = this.backing;
        if (length < i) {
            return Arrays.copyOfRange(eArr, 0, i, objArr.getClass());
        }
        f73.g(eArr, 0, objArr, 0, i);
        int i2 = this.length;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return bb1.a(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ ListBuilder(Object obj) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        i(this.length, obj);
        return true;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001\u001cJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lv8;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "backing", "[Ljava/lang/Object;", "", "offset", CA20Status.STATUS_USER_I, "length", "parent", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "root", "Lkotlin/collections/builders/ListBuilder;", "kotlin/collections/builders/a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BuilderSubList<E> extends v8 implements List<E>, RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderSubList(Object[] objArr, int i, int i2, BuilderSubList builderSubList, ListBuilder listBuilder) {
            this.backing = objArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void readObject(ObjectInputStream input) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            if (((ListBuilder) this.root).isReadOnly) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            l();
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.c(i, i2);
            j(this.offset + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            l();
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.c(i, i2);
            int size = collection.size();
            i(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            l();
            k();
            n(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            k();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.backing;
                int i = this.offset;
                int i2 = this.length;
                if (i2 == list.size()) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (jl40.l(eArr[i + i3], list.get(i3))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.b(i, i2);
            return this.backing[this.offset + i];
        }

        @Override // defpackage.v8
        /* renamed from: getSize */
        public final int getLength() {
            k();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            k();
            E[] eArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            int i3 = 1;
            for (int i4 = 0; i4 < i2; i4++) {
                E e = eArr[i + i4];
                i3 = (i3 * 31) + (e != null ? e.hashCode() : 0);
            }
            return i3;
        }

        public final void i(int i, Collection collection, int i2) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.i(i, collection, i2);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.a;
                listBuilder.h(i, collection, i2);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            k();
            for (int i = 0; i < this.length; i++) {
                if (jl40.l(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            k();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        public final void j(int i, Object obj) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.j(i, obj);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.a;
                listBuilder.i(i, obj);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        public final void k() {
            if (((AbstractList) this.root).modCount == ((AbstractList) this).modCount) {
                return;
            }
            ny61.y();
        }

        public final void l() {
            if (((ListBuilder) this.root).isReadOnly) {
                w511.u();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            k();
            for (int i = this.length - 1; i >= 0; i--) {
                if (jl40.l(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.c(i, i2);
            return new a(this, i);
        }

        public final Object m(int i) {
            Object m;
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                m = builderSubList.m(i);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.a;
                m = listBuilder.m(i);
            }
            this.length--;
            return m;
        }

        public final void n(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.n(i, i2);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.a;
                listBuilder.n(i, i2);
            }
            this.length -= i2;
        }

        public final int p(int i, int i2, Collection collection, boolean z) {
            int p;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                p = builderSubList.p(i, i2, collection, z);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.a;
                p = listBuilder.p(i, i2, collection, z);
            }
            if (p > 0) {
                ((AbstractList) this).modCount++;
            }
            this.length -= p;
            return p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            l();
            k();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                removeAt(indexOf);
            }
            return indexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection collection) {
            l();
            k();
            return p(this.offset, this.length, collection, false) > 0;
        }

        @Override // defpackage.v8
        public final Object removeAt(int i) {
            l();
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.b(i, i2);
            return m(this.offset + i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection collection) {
            l();
            k();
            return p(this.offset, this.length, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            l();
            k();
            g8 g8Var = k8.Companion;
            int i2 = this.length;
            g8Var.getClass();
            g8.b(i, i2);
            Object[] objArr = this.backing;
            int i3 = this.offset + i;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            g8 g8Var = k8.Companion;
            int i3 = this.length;
            g8Var.getClass();
            g8.d(i, i2, i3);
            return new BuilderSubList(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] objArr) {
            k();
            int length = objArr.length;
            int i = this.length;
            E[] eArr = this.backing;
            int i2 = this.offset;
            if (length < i) {
                return Arrays.copyOfRange(eArr, i2, i + i2, objArr.getClass());
            }
            f73.g(eArr, 0, objArr, i2, i + i2);
            int i3 = this.length;
            if (i3 < objArr.length) {
                objArr[i3] = null;
            }
            return objArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            k();
            return bb1.a(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            l();
            k();
            j(this.offset + this.length, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection collection) {
            l();
            k();
            int size = collection.size();
            i(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            k();
            E[] eArr = this.backing;
            int i = this.offset;
            return f73.n(i, this.length + i, eArr);
        }
    }

    public ListBuilder() {
        this((Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k();
        int size = collection.size();
        h(this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return f73.n(0, this.length, this.backing);
    }
}
