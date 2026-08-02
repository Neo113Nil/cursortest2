package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class ay0 extends AbstractCollection implements Queue, Cloneable, Serializable {
    private static final long serialVersionUID = 2340985798034038923L;
    public transient Object[] a = new Object[16];
    public transient int b;
    public transient int c;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        int i = 8;
        if (readInt >= 8) {
            int i2 = (readInt >>> 1) | readInt;
            int i3 = i2 | (i2 >>> 2);
            int i4 = i3 | (i3 >>> 4);
            int i5 = i4 | (i4 >>> 8);
            i = (i5 | (i5 >>> 16)) + 1;
            if (i < 0) {
                i >>>= 1;
            }
        }
        this.a = new Object[i];
        this.b = 0;
        this.c = readInt;
        for (int i6 = 0; i6 < readInt; i6++) {
            this.a[i6] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        int length = this.a.length - 1;
        for (int i = this.b; i != this.c; i = (i + 1) & length) {
            objectOutputStream.writeObject(this.a[i]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final void addFirst(Object obj) {
        if (obj == null) {
            jj4.j("e == null");
            return;
        }
        Object[] objArr = this.a;
        int length = (this.b - 1) & (objArr.length - 1);
        this.b = length;
        objArr[length] = obj;
        if (length == this.c) {
            q();
        }
    }

    public final void addLast(Object obj) {
        if (obj == null) {
            jj4.j("e == null");
            return;
        }
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        int length = (objArr.length - 1) & (i + 1);
        this.c = length;
        if (length == this.b) {
            q();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            this.c = 0;
            this.b = 0;
            int length = this.a.length - 1;
            do {
                this.a[i] = null;
                i = (i + 1) & length;
            } while (i != i2);
        }
    }

    public final Object clone() {
        try {
            ay0 ay0Var = (ay0) super.clone();
            Object[] objArr = this.a;
            System.arraycopy(objArr, 0, ay0Var.a, 0, objArr.length);
            return ay0Var;
        } catch (CloneNotSupportedException unused) {
            wvs.b();
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.a.length - 1;
        int i = this.b;
        while (true) {
            Object obj2 = this.a[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                return true;
            }
            i = (i + 1) & length;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        Object obj = this.a[this.b];
        if (obj != null) {
            return obj;
        }
        wvs.n();
        return null;
    }

    public final void g(Object[] objArr) {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            System.arraycopy(this.a, i, objArr, 0, size());
        } else if (i > i2) {
            Object[] objArr2 = this.a;
            int length = objArr2.length - i;
            System.arraycopy(objArr2, i, objArr, 0, length);
            System.arraycopy(this.a, 0, objArr, length, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.b == this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yx0(this);
    }

    public final boolean n(int i) {
        Object[] objArr = this.a;
        int length = objArr.length - 1;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = (i - i2) & length;
        int i5 = (i3 - i) & length;
        if (i4 >= ((i3 - i2) & length)) {
            xq0.i();
            return false;
        }
        if (i4 < i5) {
            if (i2 <= i) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i2, objArr, i2 + 1, length - i2);
            }
            objArr[i2] = null;
            this.b = (i2 + 1) & length;
            return false;
        }
        if (i < i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i5);
            this.c = i3 - 1;
        } else {
            System.arraycopy(objArr, i + 1, objArr, i, length - i);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i3);
            this.c = (i3 - 1) & length;
        }
        return true;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.a[this.b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (obj == null) {
            return null;
        }
        objArr[i] = null;
        this.b = (i + 1) & (objArr.length - 1);
        return obj;
    }

    public final void q() {
        int i = this.b;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            xq0.q("Sorry, deque too big");
            return;
        }
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, i, objArr2, 0, i2);
        System.arraycopy(this.a, 0, objArr2, i2, i);
        this.a = objArr2;
        this.b = 0;
        this.c = length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.a.length - 1;
        int i = this.b;
        while (true) {
            Object obj2 = this.a[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                n(i);
                return true;
            }
            i = (i + 1) & length;
        }
    }

    public final Object removeFirst() {
        int i = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (obj == null) {
            obj = null;
        } else {
            objArr[i] = null;
            this.b = (i + 1) & (objArr.length - 1);
        }
        if (obj != null) {
            return obj;
        }
        wvs.n();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return (this.c - this.b) & (this.a.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        g(objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        g(objArr);
        return objArr;
    }

    @Override // java.util.Queue
    public final Object remove() {
        return removeFirst();
    }
}
