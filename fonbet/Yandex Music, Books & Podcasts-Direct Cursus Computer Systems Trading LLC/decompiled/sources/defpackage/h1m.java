package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h1m extends sis {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final ueq f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final sis[] k;
    public final Object[] l;
    public final HashMap m;

    public h1m(sis[] sisVarArr, Object[] objArr, ueq ueqVar) {
        this.f = ueqVar;
        this.e = ueqVar.b.length;
        int length = sisVarArr.length;
        this.k = sisVarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = sisVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            sis sisVar = sisVarArr[i];
            this.k[i4] = sisVar;
            this.j[i4] = i2;
            this.i[i4] = i3;
            i2 += sisVar.o();
            i3 += this.k[i4].h();
            this.m.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.sis
    public final int a(boolean z) {
        if (this.e != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.f.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                sis[] sisVarArr = this.k;
                if (!sisVarArr[i].p()) {
                    return sisVarArr[i].a(z) + this.j[i];
                }
                i = q(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.m.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b = this.k[intValue].b(obj3)) != -1) {
                return this.i[intValue] + b;
            }
        }
        return -1;
    }

    @Override // defpackage.sis
    public final int c(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.f.b;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                sis[] sisVarArr = this.k;
                if (!sisVarArr[i].p()) {
                    return sisVarArr[i].c(z) + this.j[i];
                }
                i = r(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.sis
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int d = dvt.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        sis[] sisVarArr = this.k;
        int e = sisVarArr[d].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (e != -1) {
            return i3 + e;
        }
        int q = q(d, z);
        while (q != -1 && sisVarArr[q].p()) {
            q = q(q, z);
        }
        if (q != -1) {
            return sisVarArr[q].a(z) + iArr[q];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        int[] iArr = this.i;
        int d = dvt.d(iArr, i + 1, false, false);
        int i2 = this.j[d];
        this.k[d].f(i - iArr[d], oisVar, z);
        oisVar.c += i2;
        if (z) {
            Object obj = this.l[d];
            Object obj2 = oisVar.b;
            obj2.getClass();
            oisVar.b = Pair.create(obj, obj2);
        }
        return oisVar;
    }

    @Override // defpackage.sis
    public final ois g(Object obj, ois oisVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.j[intValue];
        this.k[intValue].g(obj3, oisVar);
        oisVar.c += i;
        oisVar.b = obj;
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return this.h;
    }

    @Override // defpackage.sis
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int d = dvt.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        sis[] sisVarArr = this.k;
        int k = sisVarArr[d].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (k != -1) {
            return i3 + k;
        }
        int r = r(d, z);
        while (r != -1 && sisVarArr[r].p()) {
            r = r(r, z);
        }
        if (r != -1) {
            return sisVarArr[r].c(z) + iArr[r];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        int[] iArr = this.i;
        int d = dvt.d(iArr, i + 1, false, false);
        return Pair.create(this.l[d], this.k[d].l(i - iArr[d]));
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        int[] iArr = this.j;
        int d = dvt.d(iArr, i + 1, false, false);
        int i2 = iArr[d];
        int i3 = this.i[d];
        this.k[d].m(i - i2, risVar, j);
        Object obj = this.l[d];
        if (!ris.q.equals(risVar.a)) {
            obj = Pair.create(obj, risVar.a);
        }
        risVar.a = obj;
        risVar.n += i3;
        risVar.o += i3;
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return this.g;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        ueq ueqVar = this.f;
        int i2 = ueqVar.c[i] + 1;
        int[] iArr = ueqVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        ueq ueqVar = this.f;
        int i2 = ueqVar.c[i] - 1;
        if (i2 >= 0) {
            return ueqVar.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1m(ArrayList arrayList, ueq ueqVar) {
        this(r0, r1, ueqVar);
        sis[] sisVarArr = new sis[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            sisVarArr[i2] = ((ewh) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((ewh) it2.next()).getUid();
            i++;
        }
    }
}
