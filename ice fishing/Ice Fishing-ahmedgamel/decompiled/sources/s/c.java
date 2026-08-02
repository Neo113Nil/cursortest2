package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: A, reason: collision with root package name */
    public static int f40237A;

    /* renamed from: B, reason: collision with root package name */
    public static Object[] f40238B;

    /* renamed from: C, reason: collision with root package name */
    public static int f40239C;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f40240x = new int[0];

    /* renamed from: y, reason: collision with root package name */
    public static final Object[] f40241y = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    public static Object[] f40242z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40243n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40244u;

    /* renamed from: v, reason: collision with root package name */
    public int f40245v;

    /* renamed from: w, reason: collision with root package name */
    public C4914a f40246w;

    public c(int i) {
        if (i == 0) {
            this.f40243n = f40240x;
            this.f40244u = f40241y;
        } else {
            a(i);
        }
        this.f40245v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f40239C < 10) {
                        objArr[0] = f40238B;
                        objArr[1] = iArr;
                        for (int i4 = i - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f40238B = objArr;
                        f40239C++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f40237A < 10) {
                        objArr[0] = f40242z;
                        objArr[1] = iArr;
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f40242z = objArr;
                        f40237A++;
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
                    Object[] objArr = f40238B;
                    if (objArr != null) {
                        this.f40244u = objArr;
                        f40238B = (Object[]) objArr[0];
                        this.f40243n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40239C--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f40242z;
                    if (objArr2 != null) {
                        this.f40244u = objArr2;
                        f40242z = (Object[]) objArr2[0];
                        this.f40243n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40237A--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40243n = new int[i];
        this.f40244u = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int d9;
        if (obj == null) {
            d9 = e();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d9 = d(hashCode, obj);
        }
        if (d9 >= 0) {
            return false;
        }
        int i4 = ~d9;
        int i6 = this.f40245v;
        int[] iArr = this.f40243n;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f40244u;
            a(i9);
            int[] iArr2 = this.f40243n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f40244u, 0, objArr.length);
            }
            c(iArr, objArr, this.f40245v);
        }
        int i10 = this.f40245v;
        if (i4 < i10) {
            int[] iArr3 = this.f40243n;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10 - i4);
            Object[] objArr2 = this.f40244u;
            System.arraycopy(objArr2, i4, objArr2, i11, this.f40245v - i4);
        }
        this.f40243n[i4] = i;
        this.f40244u[i4] = obj;
        this.f40245v++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f40245v;
        int[] iArr = this.f40243n;
        boolean z6 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f40244u;
            a(size);
            int i = this.f40245v;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f40243n, 0, i);
                System.arraycopy(objArr, 0, this.f40244u, 0, this.f40245v);
            }
            c(iArr, objArr, this.f40245v);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f40245v;
        if (i != 0) {
            c(this.f40243n, this.f40244u, i);
            this.f40243n = f40240x;
            this.f40244u = f40241y;
            this.f40245v = 0;
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
        int i4 = this.f40245v;
        if (i4 == 0) {
            return -1;
        }
        int a9 = d.a(i4, i, this.f40243n);
        if (a9 < 0 || obj.equals(this.f40244u[a9])) {
            return a9;
        }
        int i6 = a9 + 1;
        while (i6 < i4 && this.f40243n[i6] == i) {
            if (obj.equals(this.f40244u[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i9 = a9 - 1; i9 >= 0 && this.f40243n[i9] == i; i9--) {
            if (obj.equals(this.f40244u[i9])) {
                return i9;
            }
        }
        return ~i6;
    }

    public final int e() {
        int i = this.f40245v;
        if (i == 0) {
            return -1;
        }
        int a9 = d.a(i, 0, this.f40243n);
        if (a9 < 0 || this.f40244u[a9] == null) {
            return a9;
        }
        int i4 = a9 + 1;
        while (i4 < i && this.f40243n[i4] == 0) {
            if (this.f40244u[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i6 = a9 - 1; i6 >= 0 && this.f40243n[i6] == 0; i6--) {
            if (this.f40244u[i6] == null) {
                return i6;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f40245v != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f40245v; i++) {
                try {
                    if (!set.contains(this.f40244u[i])) {
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
        Object[] objArr = this.f40244u;
        Object obj = objArr[i];
        int i4 = this.f40245v;
        if (i4 <= 1) {
            c(this.f40243n, objArr, i4);
            this.f40243n = f40240x;
            this.f40244u = f40241y;
            this.f40245v = 0;
            return;
        }
        int[] iArr = this.f40243n;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i6 = i4 - 1;
            this.f40245v = i6;
            if (i < i6) {
                int i9 = i + 1;
                System.arraycopy(iArr, i9, iArr, i, i6 - i);
                Object[] objArr2 = this.f40244u;
                System.arraycopy(objArr2, i9, objArr2, i, this.f40245v - i);
            }
            this.f40244u[this.f40245v] = null;
            return;
        }
        a(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f40245v--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f40243n, 0, i);
            System.arraycopy(objArr, 0, this.f40244u, 0, i);
        }
        int i10 = this.f40245v;
        if (i < i10) {
            int i11 = i + 1;
            System.arraycopy(iArr, i11, this.f40243n, i, i10 - i);
            System.arraycopy(objArr, i11, this.f40244u, i, this.f40245v - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f40243n;
        int i = this.f40245v;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i4 += iArr[i6];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40245v <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f40246w == null) {
            this.f40246w = new C4914a(1, this);
        }
        C4914a c4914a = this.f40246w;
        if (((g) c4914a.f40268b) == null) {
            c4914a.f40268b = new g(c4914a, 1);
        }
        return ((g) c4914a.f40268b).iterator();
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
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z6 = false;
        for (int i = this.f40245v - 1; i >= 0; i--) {
            if (!collection.contains(this.f40244u[i])) {
                f(i);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f40245v;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f40245v;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f40244u, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40245v * 14);
        sb.append('{');
        for (int i = 0; i < this.f40245v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f40244u[i];
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
        if (objArr.length < this.f40245v) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f40245v);
        }
        System.arraycopy(this.f40244u, 0, objArr, 0, this.f40245v);
        int length = objArr.length;
        int i = this.f40245v;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
