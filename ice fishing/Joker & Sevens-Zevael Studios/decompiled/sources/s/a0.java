package s;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f6219a;

    /* renamed from: b, reason: collision with root package name */
    public int f6220b;

    public a0(int i10) {
        this.f6219a = i10 == 0 ? l0.f6302a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f6220b + 1;
        Object[] objArr = this.f6219a;
        if (objArr.length < i10) {
            l(i10, objArr);
        }
        Object[] objArr2 = this.f6219a;
        int i11 = this.f6220b;
        objArr2[i11] = obj;
        this.f6220b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f6220b;
        int size = list.size() + i10;
        Object[] objArr = this.f6219a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f6219a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f6220b = list.size() + this.f6220b;
    }

    public final void c() {
        bc.l.V(0, this.f6220b, null, this.f6219a);
        this.f6220b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f6219a[0];
        }
        t.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i10) {
        if (i10 >= 0 && i10 < this.f6220b) {
            return this.f6219a[i10];
        }
        m(i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            int i10 = a0Var.f6220b;
            int i11 = this.f6220b;
            if (i10 == i11) {
                Object[] objArr = this.f6219a;
                Object[] objArr2 = a0Var.f6219a;
                uc.d q10 = uc.e.q(0, i11);
                int i12 = q10.f6735g;
                int i13 = q10.f6736h;
                if (i12 > i13) {
                    return true;
                }
                while (pc.j.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f6219a;
            int i11 = this.f6220b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f6219a;
        int i12 = this.f6220b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f6220b == 0;
    }

    public final boolean h() {
        return this.f6220b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f6219a;
        int i10 = this.f6220b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            i11 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i11;
    }

    public final boolean i(Object obj) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        j(f10);
        return true;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f6220b)) {
            m(i10);
            throw null;
        }
        Object[] objArr = this.f6219a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            bc.l.R(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f6220b - 1;
        this.f6220b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f6220b) || i11 < 0 || i11 > i12) {
            t.a.d("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f6220b);
            throw null;
        }
        if (i11 < i10) {
            t.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f6219a;
                bc.l.R(objArr, objArr, i10, i11, i12);
            }
            int i13 = this.f6220b;
            int i14 = i13 - (i11 - i10);
            bc.l.V(i14, i13, null, this.f6219a);
            this.f6220b = i14;
        }
    }

    public final void l(int i10, Object[] objArr) {
        pc.j.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        bc.l.R(objArr, objArr2, 0, 0, length);
        this.f6219a = objArr2;
    }

    public final void m(int i10) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i10);
        sb.append(" must be in 0..");
        sb.append(this.f6220b - 1);
        t.a.d(sb.toString());
        throw null;
    }

    public final String toString() {
        a0.a0 a0Var = new a0.a0(20, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f6219a;
        int i10 = this.f6220b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) a0Var.invoke(obj));
            i11++;
        }
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ a0() {
        this(16);
    }
}
