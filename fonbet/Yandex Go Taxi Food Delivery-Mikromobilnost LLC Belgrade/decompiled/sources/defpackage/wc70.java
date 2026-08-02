package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wc70 extends xc70 {
    public int b;
    public int d;
    public int f;
    public gc70[] a = new gc70[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void a() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }

    public final void b(o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        if (this.b != 0) {
            vc70 vc70Var = new vc70(this);
            while (true) {
                wc70 wc70Var = vc70Var.d;
                gc70 gc70Var = wc70Var.a[vc70Var.a];
                yss b = gc70Var.b(vc70Var);
                o13 o13Var2 = o13Var;
                ows0 ows0Var2 = ows0Var;
                zti0 zti0Var2 = zti0Var;
                jc70 jc70Var2 = jc70Var;
                try {
                    gc70Var.a(vc70Var, o13Var2, ows0Var2, zti0Var2, jc70Var2);
                    int i = vc70Var.a;
                    int i2 = wc70Var.b;
                    if (i < i2) {
                        gc70 gc70Var2 = wc70Var.a[i];
                        vc70Var.b += gc70Var2.a;
                        vc70Var.c += gc70Var2.b;
                        int i3 = i + 1;
                        vc70Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        o13Var = o13Var2;
                        ows0Var = ows0Var2;
                        zti0Var = zti0Var2;
                        jc70Var = jc70Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    wub1.c(th, jc70Var2, ows0Var2, b);
                    throw th;
                }
            }
        }
        a();
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final void d(gc70 gc70Var) {
        int i = this.b;
        gc70[] gc70VarArr = this.a;
        if (i == gc70VarArr.length) {
            gc70[] gc70VarArr2 = new gc70[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(gc70VarArr, 0, gc70VarArr2, 0, i);
            this.a = gc70VarArr2;
        }
        int i2 = this.d;
        int i3 = gc70Var.a;
        int i4 = gc70Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            f73.d(0, 0, length, iArr, iArr2);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        gc70[] gc70VarArr3 = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        gc70VarArr3[i9] = gc70Var;
        this.d += gc70Var.a;
        this.f += i4;
    }
}
