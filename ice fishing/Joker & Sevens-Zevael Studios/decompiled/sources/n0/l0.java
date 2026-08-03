package n0;

import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends i7.b {

    /* renamed from: e, reason: collision with root package name */
    public int f5017e;

    /* renamed from: g, reason: collision with root package name */
    public int f5019g;

    /* renamed from: i, reason: collision with root package name */
    public int f5021i;

    /* renamed from: d, reason: collision with root package name */
    public i0[] f5016d = new i0[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f5018f = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5020h = new Object[16];

    public final void J() {
        this.f5017e = 0;
        this.f5019g = 0;
        bc.l.V(0, this.f5021i, null, this.f5020h);
        this.f5021i = 0;
    }

    public final void K(m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        if (M()) {
            k0 k0Var = new k0(this);
            while (true) {
                l0 l0Var = k0Var.f5014d;
                i0 i0Var = l0Var.f5016d[k0Var.f5011a];
                m0.a b2 = i0Var.b(k0Var);
                m0.c cVar2 = cVar;
                m2 m2Var2 = m2Var;
                x4.q qVar2 = qVar;
                j0 j0Var2 = j0Var;
                try {
                    i0Var.a(k0Var, cVar2, m2Var2, qVar2, j0Var2);
                    int i10 = k0Var.f5011a;
                    int i11 = l0Var.f5017e;
                    if (i10 < i11) {
                        i0 i0Var2 = l0Var.f5016d[i10];
                        k0Var.f5012b += i0Var2.f5007a;
                        k0Var.f5013c += i0Var2.f5008b;
                        int i12 = i10 + 1;
                        k0Var.f5011a = i12;
                        if (i12 >= i11) {
                            break;
                        }
                        cVar = cVar2;
                        m2Var = m2Var2;
                        qVar = qVar2;
                        j0Var = j0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        J();
    }

    public final boolean L() {
        return this.f5017e == 0;
    }

    public final boolean M() {
        return this.f5017e != 0;
    }

    public final void N(i0 i0Var) {
        int i10 = this.f5017e;
        i0[] i0VarArr = this.f5016d;
        if (i10 == i0VarArr.length) {
            i0[] i0VarArr2 = new i0[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(i0VarArr, 0, i0VarArr2, 0, i10);
            this.f5016d = i0VarArr2;
        }
        int i11 = this.f5019g;
        int i12 = i0Var.f5007a;
        int i13 = i0Var.f5008b;
        int i14 = i11 + i12;
        int[] iArr = this.f5018f;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            bc.l.P(0, 0, length, iArr, iArr2);
            this.f5018f = iArr2;
        }
        int i16 = this.f5021i + i13;
        Object[] objArr = this.f5020h;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f5020h = objArr2;
        }
        i0[] i0VarArr3 = this.f5016d;
        int i18 = this.f5017e;
        this.f5017e = i18 + 1;
        i0VarArr3[i18] = i0Var;
        this.f5019g += i0Var.f5007a;
        this.f5021i += i13;
    }
}
