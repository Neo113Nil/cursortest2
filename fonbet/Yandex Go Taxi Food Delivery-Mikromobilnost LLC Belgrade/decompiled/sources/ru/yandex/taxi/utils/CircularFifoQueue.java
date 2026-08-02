package ru.yandex.taxi.utils;

import defpackage.bvb;
import defpackage.ny61;
import defpackage.w511;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes7.dex */
public class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    public transient Object[] a;
    public transient int b;
    public transient int c;
    private final int maxElements;
    public transient boolean w;

    public CircularFifoQueue(int i) {
        this.b = 0;
        this.c = 0;
        this.w = false;
        if (i <= 0) {
            ny61.g("The size must be greater than 0");
            throw null;
        }
        this.a = new Object[i];
        this.maxElements = i;
    }

    public static int b(CircularFifoQueue circularFifoQueue, int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return circularFifoQueue.maxElements - 1;
        }
        circularFifoQueue.getClass();
        return i2;
    }

    public static int f(CircularFifoQueue circularFifoQueue, int i) {
        int i2 = i + 1;
        if (i2 >= circularFifoQueue.maxElements) {
            return 0;
        }
        return i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = new Object[this.maxElements];
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a[i] = objectInputStream.readObject();
        }
        this.b = 0;
        boolean z = readInt == this.maxElements;
        this.w = z;
        if (z) {
            this.c = 0;
        } else {
            this.c = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        bvb bvbVar = new bvb(this);
        while (bvbVar.hasNext()) {
            objectOutputStream.writeObject(bvbVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            ny61.t("Attempted to add null object to queue");
            return false;
        }
        if (size() == this.maxElements) {
            remove();
        }
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        objArr[i] = obj;
        if (i2 >= this.maxElements) {
            this.c = 0;
        }
        if (this.c == this.b) {
            this.w = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.w = false;
        this.b = 0;
        this.c = 0;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        w511.i("queue is empty");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bvb(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.a[this.b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            w511.i("queue is empty");
            return null;
        }
        Object[] objArr = this.a;
        int i = this.b;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.b = i2;
            objArr[i] = null;
            if (i2 >= this.maxElements) {
                this.b = 0;
            }
            this.w = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.c;
        int i2 = this.b;
        if (i < i2) {
            return (this.maxElements - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.w) {
            return this.maxElements;
        }
        return 0;
    }

    public CircularFifoQueue() {
        this(32);
    }
}
