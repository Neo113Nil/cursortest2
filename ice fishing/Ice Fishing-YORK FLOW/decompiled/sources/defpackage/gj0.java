package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gj0 implements java.lang.Cloneable {
    public /* synthetic */ int P05cfTpS5W5L;
    public /* synthetic */ java.lang.Object[] QiMR8OkAhezm;
    public /* synthetic */ boolean WDYagTQQm9ns;
    public /* synthetic */ long[] oh71FJcDz6S2;

    public gj0(int i) {
        if (i == 0) {
            this.oh71FJcDz6S2 = defpackage.vx1.e6mdH7fiFuta;
            this.QiMR8OkAhezm = defpackage.vx1.GE9mJIPrb8gP;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.oh71FJcDz6S2 = new long[i5];
        this.QiMR8OkAhezm = new java.lang.Object[i5];
    }

    public final int JhCgjQRTAOCT() {
        if (this.WDYagTQQm9ns) {
            int i = this.P05cfTpS5W5L;
            long[] jArr = this.oh71FJcDz6S2;
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != defpackage.vx1.gUjdnLbkVAaA) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.WDYagTQQm9ns = false;
            this.P05cfTpS5W5L = i2;
        }
        return this.P05cfTpS5W5L;
    }

    public final java.lang.Object WDYagTQQm9ns(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.P05cfTpS5W5L)) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.WDYagTQQm9ns) {
            long[] jArr = this.oh71FJcDz6S2;
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.vx1.gUjdnLbkVAaA) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.WDYagTQQm9ns = false;
            this.P05cfTpS5W5L = i3;
        }
        return this.QiMR8OkAhezm[i];
    }

    public final long ZpBGe2uQfcn8(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.P05cfTpS5W5L)) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.WDYagTQQm9ns) {
            long[] jArr = this.oh71FJcDz6S2;
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.vx1.gUjdnLbkVAaA) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.WDYagTQQm9ns = false;
            this.P05cfTpS5W5L = i3;
        }
        return this.oh71FJcDz6S2[i];
    }

    public final java.lang.Object clone() {
        java.lang.Object clone = super.clone();
        clone.getClass();
        defpackage.gj0 gj0Var = (defpackage.gj0) clone;
        gj0Var.oh71FJcDz6S2 = (long[]) this.oh71FJcDz6S2.clone();
        gj0Var.QiMR8OkAhezm = (java.lang.Object[]) this.QiMR8OkAhezm.clone();
        return gj0Var;
    }

    public final void fWTAfUmVKrZq(long j) {
        int Ns0WNyEWdPsk = defpackage.vx1.Ns0WNyEWdPsk(this.oh71FJcDz6S2, this.P05cfTpS5W5L, j);
        if (Ns0WNyEWdPsk >= 0) {
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            java.lang.Object obj = objArr[Ns0WNyEWdPsk];
            java.lang.Object obj2 = defpackage.vx1.gUjdnLbkVAaA;
            if (obj != obj2) {
                objArr[Ns0WNyEWdPsk] = obj2;
                this.WDYagTQQm9ns = true;
            }
        }
    }

    public final void giKS3J6vZuNy(long j, java.lang.Object obj) {
        java.lang.Object obj2 = defpackage.vx1.gUjdnLbkVAaA;
        int Ns0WNyEWdPsk = defpackage.vx1.Ns0WNyEWdPsk(this.oh71FJcDz6S2, this.P05cfTpS5W5L, j);
        if (Ns0WNyEWdPsk >= 0) {
            this.QiMR8OkAhezm[Ns0WNyEWdPsk] = obj;
            return;
        }
        int i = ~Ns0WNyEWdPsk;
        int i2 = this.P05cfTpS5W5L;
        if (i < i2) {
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            if (objArr[i] == obj2) {
                this.oh71FJcDz6S2[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.WDYagTQQm9ns) {
            long[] jArr = this.oh71FJcDz6S2;
            if (i2 >= jArr.length) {
                java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    java.lang.Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.WDYagTQQm9ns = false;
                this.P05cfTpS5W5L = i3;
                i = ~defpackage.vx1.Ns0WNyEWdPsk(this.oh71FJcDz6S2, i3, j);
            }
        }
        int i5 = this.P05cfTpS5W5L;
        if (i5 >= this.oh71FJcDz6S2.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.oh71FJcDz6S2 = java.util.Arrays.copyOf(this.oh71FJcDz6S2, i9);
            this.QiMR8OkAhezm = java.util.Arrays.copyOf(this.QiMR8OkAhezm, i9);
        }
        int i10 = this.P05cfTpS5W5L;
        if (i10 - i != 0) {
            long[] jArr2 = this.oh71FJcDz6S2;
            int i11 = i + 1;
            defpackage.y7.omM9cAlgeGXx(jArr2, jArr2, i11, i, i10);
            java.lang.Object[] objArr3 = this.QiMR8OkAhezm;
            defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, i11, i, this.P05cfTpS5W5L);
        }
        this.oh71FJcDz6S2[i] = j;
        this.QiMR8OkAhezm[i] = obj;
        this.P05cfTpS5W5L++;
    }

    public final java.lang.String toString() {
        if (JhCgjQRTAOCT() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.P05cfTpS5W5L * 28);
        sb.append('{');
        int i = this.P05cfTpS5W5L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(ZpBGe2uQfcn8(i2));
            sb.append('=');
            java.lang.Object WDYagTQQm9ns = WDYagTQQm9ns(i2);
            if (WDYagTQQm9ns != sb) {
                sb.append(WDYagTQQm9ns);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ gj0() {
        this(10);
    }
}
