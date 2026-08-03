package o0;

import bc.n;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5134g;

    /* renamed from: h, reason: collision with root package name */
    public b f5135h;

    /* renamed from: i, reason: collision with root package name */
    public int f5136i = 0;

    public e(Object[] objArr) {
        this.f5134g = objArr;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f5136i + 1;
        if (this.f5134g.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f5134g;
        int i12 = this.f5136i;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f5136i++;
    }

    public final void b(Object obj) {
        int i10 = this.f5136i + 1;
        if (this.f5134g.length < i10) {
            m(i10);
        }
        Object[] objArr = this.f5134g;
        int i11 = this.f5136i;
        objArr[i11] = obj;
        this.f5136i = i11 + 1;
    }

    public final void c(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f5136i + size;
        if (this.f5134g.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f5134g;
        int i12 = this.f5136i;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f5136i += size;
    }

    public final void d(int i10, e eVar) {
        int i11 = eVar.f5136i;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f5136i + i11;
        if (this.f5134g.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f5134g;
        int i13 = this.f5136i;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.f5134g, 0, objArr, i10, i11);
        this.f5136i += i11;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f5136i + size;
        if (this.f5134g.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f5134g;
        int i13 = this.f5136i;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                n.N();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f5136i += size;
        return true;
    }

    public final List f() {
        b bVar = this.f5135h;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f5135h = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f5134g;
        int i10 = this.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f5136i = 0;
    }

    public final boolean h(Object obj) {
        int i10 = this.f5136i - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !j.a(this.f5134g[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f5134g;
        int i10 = this.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i10 = i(obj);
        if (i10 < 0) {
            return false;
        }
        k(i10);
        return true;
    }

    public final Object k(int i10) {
        Object[] objArr = this.f5134g;
        Object obj = objArr[i10];
        int i11 = this.f5136i;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f5136i - 1;
        this.f5136i = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f5136i;
            if (i11 < i12) {
                Object[] objArr = this.f5134g;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f5136i;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f5134g[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f5136i = i14;
        }
    }

    public final void m(int i10) {
        Object[] objArr = this.f5134g;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5134g = objArr2;
    }
}
