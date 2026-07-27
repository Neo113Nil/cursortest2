package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: A, reason: collision with root package name */
    public static int f40398A;

    /* renamed from: B, reason: collision with root package name */
    public static Object[] f40399B;

    /* renamed from: C, reason: collision with root package name */
    public static int f40400C;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f40401x = new int[0];

    /* renamed from: y, reason: collision with root package name */
    public static final Object[] f40402y = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    public static Object[] f40403z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40404n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40405u;

    /* renamed from: v, reason: collision with root package name */
    public int f40406v;

    /* renamed from: w, reason: collision with root package name */
    public C4964a f40407w;

    public c(int i) {
        if (i == 0) {
            this.f40404n = f40401x;
            this.f40405u = f40402y;
        } else {
            a(i);
        }
        this.f40406v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f40400C < 10) {
                        objArr[0] = f40399B;
                        objArr[1] = iArr;
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f40399B = objArr;
                        f40400C++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f40398A < 10) {
                        objArr[0] = f40403z;
                        objArr[1] = iArr;
                        for (int i9 = i - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f40403z = objArr;
                        f40398A++;
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
                    Object[] objArr = f40399B;
                    if (objArr != null) {
                        this.f40405u = objArr;
                        f40399B = (Object[]) objArr[0];
                        this.f40404n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40400C--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f40403z;
                    if (objArr2 != null) {
                        this.f40405u = objArr2;
                        f40403z = (Object[]) objArr2[0];
                        this.f40404n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40398A--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40404n = new int[i];
        this.f40405u = new Object[i];
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
        int i9 = this.f40406v;
        int[] iArr = this.f40404n;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f40405u;
            a(i10);
            int[] iArr2 = this.f40404n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f40405u, 0, objArr.length);
            }
            c(iArr, objArr, this.f40406v);
        }
        int i11 = this.f40406v;
        if (i6 < i11) {
            int[] iArr3 = this.f40404n;
            int i12 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i12, i11 - i6);
            Object[] objArr2 = this.f40405u;
            System.arraycopy(objArr2, i6, objArr2, i12, this.f40406v - i6);
        }
        this.f40404n[i6] = i;
        this.f40405u[i6] = obj;
        this.f40406v++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f40406v;
        int[] iArr = this.f40404n;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f40405u;
            a(size);
            int i = this.f40406v;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f40404n, 0, i);
                System.arraycopy(objArr, 0, this.f40405u, 0, this.f40406v);
            }
            c(iArr, objArr, this.f40406v);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f40406v;
        if (i != 0) {
            c(this.f40404n, this.f40405u, i);
            this.f40404n = f40401x;
            this.f40405u = f40402y;
            this.f40406v = 0;
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
        int i6 = this.f40406v;
        if (i6 == 0) {
            return -1;
        }
        int a9 = d.a(i6, i, this.f40404n);
        if (a9 < 0 || obj.equals(this.f40405u[a9])) {
            return a9;
        }
        int i9 = a9 + 1;
        while (i9 < i6 && this.f40404n[i9] == i) {
            if (obj.equals(this.f40405u[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a9 - 1; i10 >= 0 && this.f40404n[i10] == i; i10--) {
            if (obj.equals(this.f40405u[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int e() {
        int i = this.f40406v;
        if (i == 0) {
            return -1;
        }
        int a9 = d.a(i, 0, this.f40404n);
        if (a9 < 0 || this.f40405u[a9] == null) {
            return a9;
        }
        int i6 = a9 + 1;
        while (i6 < i && this.f40404n[i6] == 0) {
            if (this.f40405u[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i9 = a9 - 1; i9 >= 0 && this.f40404n[i9] == 0; i9--) {
            if (this.f40405u[i9] == null) {
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
            if (this.f40406v != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f40406v; i++) {
                try {
                    if (!set.contains(this.f40405u[i])) {
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
        Object[] objArr = this.f40405u;
        Object obj = objArr[i];
        int i6 = this.f40406v;
        if (i6 <= 1) {
            c(this.f40404n, objArr, i6);
            this.f40404n = f40401x;
            this.f40405u = f40402y;
            this.f40406v = 0;
            return;
        }
        int[] iArr = this.f40404n;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            int i9 = i6 - 1;
            this.f40406v = i9;
            if (i < i9) {
                int i10 = i + 1;
                System.arraycopy(iArr, i10, iArr, i, i9 - i);
                Object[] objArr2 = this.f40405u;
                System.arraycopy(objArr2, i10, objArr2, i, this.f40406v - i);
            }
            this.f40405u[this.f40406v] = null;
            return;
        }
        a(i6 > 8 ? i6 + (i6 >> 1) : 8);
        this.f40406v--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f40404n, 0, i);
            System.arraycopy(objArr, 0, this.f40405u, 0, i);
        }
        int i11 = this.f40406v;
        if (i < i11) {
            int i12 = i + 1;
            System.arraycopy(iArr, i12, this.f40404n, i, i11 - i);
            System.arraycopy(objArr, i12, this.f40405u, i, this.f40406v - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f40404n;
        int i = this.f40406v;
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i6 += iArr[i9];
        }
        return i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40406v <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f40407w == null) {
            this.f40407w = new C4964a(1, this);
        }
        C4964a c4964a = this.f40407w;
        if (((g) c4964a.f40429b) == null) {
            c4964a.f40429b = new g(c4964a, 1);
        }
        return ((g) c4964a.f40429b).iterator();
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
        for (int i = this.f40406v - 1; i >= 0; i--) {
            if (!collection.contains(this.f40405u[i])) {
                f(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f40406v;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f40406v;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f40405u, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40406v * 14);
        sb.append('{');
        for (int i = 0; i < this.f40406v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f40405u[i];
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
        if (objArr.length < this.f40406v) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f40406v);
        }
        System.arraycopy(this.f40405u, 0, objArr, 0, this.f40406v);
        int length = objArr.length;
        int i = this.f40406v;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
