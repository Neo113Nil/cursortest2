package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: A, reason: collision with root package name */
    public static int f40401A;

    /* renamed from: B, reason: collision with root package name */
    public static Object[] f40402B;

    /* renamed from: C, reason: collision with root package name */
    public static int f40403C;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f40404x = new int[0];

    /* renamed from: y, reason: collision with root package name */
    public static final Object[] f40405y = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    public static Object[] f40406z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40407n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40408u;

    /* renamed from: v, reason: collision with root package name */
    public int f40409v;

    /* renamed from: w, reason: collision with root package name */
    public C4964a f40410w;

    public c(int i) {
        if (i == 0) {
            this.f40407n = f40404x;
            this.f40408u = f40405y;
        } else {
            a(i);
        }
        this.f40409v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f40403C < 10) {
                        objArr[0] = f40402B;
                        objArr[1] = iArr;
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f40402B = objArr;
                        f40403C++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f40401A < 10) {
                        objArr[0] = f40406z;
                        objArr[1] = iArr;
                        for (int i9 = i - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f40406z = objArr;
                        f40401A++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f40402B;
                    if (objArr != null) {
                        this.f40408u = objArr;
                        f40402B = (Object[]) objArr[0];
                        this.f40407n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40403C--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f40406z;
                    if (objArr2 != null) {
                        this.f40408u = objArr2;
                        f40406z = (Object[]) objArr2[0];
                        this.f40407n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40401A--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40407n = new int[i];
        this.f40408u = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int d2;
        if (obj == null) {
            d2 = e();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            return false;
        }
        int i6 = ~d2;
        int i9 = this.f40409v;
        int[] iArr = this.f40407n;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f40408u;
            a(i10);
            int[] iArr2 = this.f40407n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f40408u, 0, objArr.length);
            }
            c(iArr, objArr, this.f40409v);
        }
        int i11 = this.f40409v;
        if (i6 < i11) {
            int[] iArr3 = this.f40407n;
            int i12 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i12, i11 - i6);
            Object[] objArr2 = this.f40408u;
            System.arraycopy(objArr2, i6, objArr2, i12, this.f40409v - i6);
        }
        this.f40407n[i6] = i;
        this.f40408u[i6] = obj;
        this.f40409v++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f40409v;
        int[] iArr = this.f40407n;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f40408u;
            a(size);
            int i = this.f40409v;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f40407n, 0, i);
                System.arraycopy(objArr, 0, this.f40408u, 0, this.f40409v);
            }
            c(iArr, objArr, this.f40409v);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f40409v;
        if (i != 0) {
            c(this.f40407n, this.f40408u, i);
            this.f40407n = f40404x;
            this.f40408u = f40405y;
            this.f40409v = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? e() : d(obj.hashCode(), obj)) >= 0;
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

    public final int d(int i, Object obj) {
        int i6 = this.f40409v;
        if (i6 == 0) {
            return -1;
        }
        int a9 = d.a(i6, i, this.f40407n);
        if (a9 < 0 || obj.equals(this.f40408u[a9])) {
            return a9;
        }
        int i9 = a9 + 1;
        while (i9 < i6 && this.f40407n[i9] == i) {
            if (obj.equals(this.f40408u[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a9 - 1; i10 >= 0 && this.f40407n[i10] == i; i10--) {
            if (obj.equals(this.f40408u[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int e() {
        int i = this.f40409v;
        if (i == 0) {
            return -1;
        }
        int a9 = d.a(i, 0, this.f40407n);
        if (a9 < 0 || this.f40408u[a9] == null) {
            return a9;
        }
        int i6 = a9 + 1;
        while (i6 < i && this.f40407n[i6] == 0) {
            if (this.f40408u[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i9 = a9 - 1; i9 >= 0 && this.f40407n[i9] == 0; i9--) {
            if (this.f40408u[i9] == null) {
                return i9;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f40409v != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f40409v; i++) {
                try {
                    if (!set.contains(this.f40408u[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        Object[] objArr = this.f40408u;
        Object obj = objArr[i];
        int i6 = this.f40409v;
        if (i6 <= 1) {
            c(this.f40407n, objArr, i6);
            this.f40407n = f40404x;
            this.f40408u = f40405y;
            this.f40409v = 0;
            return;
        }
        int[] iArr = this.f40407n;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            int i9 = i6 - 1;
            this.f40409v = i9;
            if (i < i9) {
                int i10 = i + 1;
                System.arraycopy(iArr, i10, iArr, i, i9 - i);
                Object[] objArr2 = this.f40408u;
                System.arraycopy(objArr2, i10, objArr2, i, this.f40409v - i);
            }
            this.f40408u[this.f40409v] = null;
            return;
        }
        a(i6 > 8 ? i6 + (i6 >> 1) : 8);
        this.f40409v--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f40407n, 0, i);
            System.arraycopy(objArr, 0, this.f40408u, 0, i);
        }
        int i11 = this.f40409v;
        if (i < i11) {
            int i12 = i + 1;
            System.arraycopy(iArr, i12, this.f40407n, i, i11 - i);
            System.arraycopy(objArr, i12, this.f40408u, i, this.f40409v - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f40407n;
        int i = this.f40409v;
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i6 += iArr[i9];
        }
        return i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40409v <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f40410w == null) {
            this.f40410w = new C4964a(1, this);
        }
        C4964a c4964a = this.f40410w;
        if (((g) c4964a.f40432b) == null) {
            c4964a.f40432b = new g(c4964a, 1);
        }
        return ((g) c4964a.f40432b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int e9 = obj == null ? e() : d(obj.hashCode(), obj);
        if (e9 < 0) {
            return false;
        }
        f(e9);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i = this.f40409v - 1; i >= 0; i--) {
            if (!collection.contains(this.f40408u[i])) {
                f(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f40409v;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f40409v;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f40408u, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40409v * 14);
        sb.append('{');
        for (int i = 0; i < this.f40409v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f40408u[i];
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
        if (objArr.length < this.f40409v) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f40409v);
        }
        System.arraycopy(this.f40408u, 0, objArr, 0, this.f40409v);
        int length = objArr.length;
        int i = this.f40409v;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
