package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8084e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f8085f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f8086g;

    /* renamed from: h, reason: collision with root package name */
    public static int f8087h;

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f8088i;

    /* renamed from: j, reason: collision with root package name */
    public static int f8089j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f8090a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8091b;

    /* renamed from: c, reason: collision with root package name */
    public int f8092c;

    /* renamed from: d, reason: collision with root package name */
    public C0977a f8093d;

    public C0979c(int i2) {
        if (i2 == 0) {
            this.f8090a = f8084e;
            this.f8091b = f8085f;
        } else {
            a(i2);
        }
        this.f8092c = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0979c.class) {
                try {
                    if (f8089j < 10) {
                        objArr[0] = f8088i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f8088i = objArr;
                        f8089j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0979c.class) {
                try {
                    if (f8087h < 10) {
                        objArr[0] = f8086g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8086g = objArr;
                        f8087h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0979c.class) {
                try {
                    Object[] objArr = f8088i;
                    if (objArr != null) {
                        this.f8091b = objArr;
                        f8088i = (Object[]) objArr[0];
                        this.f8090a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8089j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0979c.class) {
                try {
                    Object[] objArr2 = f8086g;
                    if (objArr2 != null) {
                        this.f8091b = objArr2;
                        f8086g = (Object[]) objArr2[0];
                        this.f8090a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8087h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8090a = new int[i2];
        this.f8091b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int c2;
        if (obj == null) {
            c2 = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c2 = c(hashCode, obj);
        }
        if (c2 >= 0) {
            return false;
        }
        int i3 = ~c2;
        int i4 = this.f8092c;
        int[] iArr = this.f8090a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f8091b;
            a(i5);
            int[] iArr2 = this.f8090a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8091b, 0, objArr.length);
            }
            b(iArr, objArr, this.f8092c);
        }
        int i6 = this.f8092c;
        if (i3 < i6) {
            int[] iArr3 = this.f8090a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f8091b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f8092c - i3);
        }
        this.f8090a[i3] = i2;
        this.f8091b[i3] = obj;
        this.f8092c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f8092c;
        int[] iArr = this.f8090a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8091b;
            a(size);
            int i2 = this.f8092c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f8090a, 0, i2);
                System.arraycopy(objArr, 0, this.f8091b, 0, this.f8092c);
            }
            b(iArr, objArr, this.f8092c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f8092c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(i3, i2, this.f8090a);
        if (a2 < 0) {
            return a2;
        }
        if (obj.equals(this.f8091b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f8090a[i4] == i2) {
            if (obj.equals(this.f8091b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f8090a[i5] == i2; i5--) {
            if (obj.equals(this.f8091b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f8092c;
        if (i2 != 0) {
            b(this.f8090a, this.f8091b, i2);
            this.f8090a = f8084e;
            this.f8091b = f8085f;
            this.f8092c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f8092c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(i2, 0, this.f8090a);
        if (a2 < 0) {
            return a2;
        }
        if (this.f8091b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f8090a[i3] == 0) {
            if (this.f8091b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f8090a[i4] == 0; i4--) {
            if (this.f8091b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void e(int i2) {
        Object[] objArr = this.f8091b;
        Object obj = objArr[i2];
        int i3 = this.f8092c;
        if (i3 <= 1) {
            b(this.f8090a, objArr, i3);
            this.f8090a = f8084e;
            this.f8091b = f8085f;
            this.f8092c = 0;
            return;
        }
        int[] iArr = this.f8090a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f8092c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f8091b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f8092c - i2);
            }
            this.f8091b[this.f8092c] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f8092c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f8090a, 0, i2);
            System.arraycopy(objArr, 0, this.f8091b, 0, i2);
        }
        int i6 = this.f8092c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f8090a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f8091b, i2, this.f8092c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f8092c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f8092c; i2++) {
                try {
                    if (!set.contains(this.f8091b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8090a;
        int i2 = this.f8092c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8092c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f8093d == null) {
            this.f8093d = new C0977a(1, this);
        }
        C0977a c0977a = this.f8093d;
        if (c0977a.f8079b == null) {
            c0977a.f8079b = new h(c0977a, 1);
        }
        return c0977a.f8079b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f8092c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f8091b[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8092c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f8092c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f8091b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8092c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8092c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8091b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f8092c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f8092c);
        }
        System.arraycopy(this.f8091b, 0, objArr, 0, this.f8092c);
        int length = objArr.length;
        int i2 = this.f8092c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
