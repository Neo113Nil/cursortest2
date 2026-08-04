package com.gamericefishpro.space.v0;

import com.gamericefishpro.space.ph.x;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {
    public Object[] d;
    public b e;
    public int i = 0;

    public e(Object[] objArr) {
        this.d = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.i + 1;
        if (this.d.length < i2) {
            n(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.i;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.i++;
    }

    public final void b(Object obj) {
        int i = this.i + 1;
        if (this.d.length < i) {
            n(i);
        }
        Object[] objArr = this.d;
        int i2 = this.i;
        objArr[i2] = obj;
        this.i = i2 + 1;
    }

    public final void c(int i, e eVar) {
        int i2 = eVar.i;
        if (i2 == 0) {
            return;
        }
        int i3 = this.i + i2;
        if (this.d.length < i3) {
            n(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.i;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(eVar.d, 0, objArr, i, i2);
        this.i += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.i + size;
        if (this.d.length < i2) {
            n(i2);
        }
        Object[] objArr = this.d;
        int i3 = this.i;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.i += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.i + size;
        if (this.d.length < i3) {
            n(i3);
        }
        Object[] objArr = this.d;
        int i4 = this.i;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                x.i();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.i += size;
        return true;
    }

    public final List f() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.e = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.d;
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.i = 0;
    }

    public final boolean h(Object obj) {
        int i = this.i - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.a(this.d[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.d;
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.a(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        l(i);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        int i2 = this.i;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.i - 1;
        this.i = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.i;
            if (i2 < i3) {
                Object[] objArr = this.d;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.i;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.d[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.i = i5;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.d = objArr2;
    }
}
