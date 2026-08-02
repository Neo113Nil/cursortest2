package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xy40 extends mp60 {
    public uy40 c;

    public xy40(int i) {
        this.a = i == 0 ? np60.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            o(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            o(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final uy40 i() {
        uy40 uy40Var = this.c;
        if (uy40Var != null) {
            return uy40Var;
        }
        uy40 uy40Var2 = new uy40(this);
        this.c = uy40Var2;
        return uy40Var2;
    }

    public final void j() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final void k(mp60 mp60Var) {
        if (mp60Var.d()) {
            return;
        }
        int i = this.b + mp60Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            o(i, objArr);
        }
        f73.g(mp60Var.a, this.b, this.a, 0, mp60Var.b);
        this.b += mp60Var.b;
    }

    public final boolean l(Object obj) {
        int c = c(obj);
        if (c < 0) {
            return false;
        }
        m(c);
        return true;
    }

    public final Object m(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            f73.g(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void n(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder s = b64.s(i, i2, "Start (", ") and end (", ") must be in 0..");
            s.append(this.b);
            xva1.d(s.toString());
            throw null;
        }
        if (i2 < i) {
            xva1.b("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                f73.g(objArr, i, objArr, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.a, i5, i4, (Object) null);
            this.b = i5;
        }
    }

    public final void o(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final Object p(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public xy40() {
        this((Object) null);
    }

    public /* synthetic */ xy40(Object obj) {
        this(16);
    }
}
