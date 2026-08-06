package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rf1 implements java.lang.Cloneable {
    public /* synthetic */ int P05cfTpS5W5L;
    public /* synthetic */ java.lang.Object[] QiMR8OkAhezm;
    public /* synthetic */ boolean WDYagTQQm9ns;
    public /* synthetic */ int[] oh71FJcDz6S2;

    public rf1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.oh71FJcDz6S2 = new int[i4];
        this.QiMR8OkAhezm = new java.lang.Object[i4];
    }

    public final void JhCgjQRTAOCT(int i, java.lang.Object obj) {
        int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(this.oh71FJcDz6S2, this.P05cfTpS5W5L, i);
        if (GE9mJIPrb8gP >= 0) {
            this.QiMR8OkAhezm[GE9mJIPrb8gP] = obj;
            return;
        }
        int i2 = ~GE9mJIPrb8gP;
        int i3 = this.P05cfTpS5W5L;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.QiMR8OkAhezm;
            if (objArr[i2] == defpackage.i61.Ns0WNyEWdPsk) {
                this.oh71FJcDz6S2[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.WDYagTQQm9ns && i3 >= this.oh71FJcDz6S2.length) {
            defpackage.i61.WDYagTQQm9ns(this);
            i2 = ~defpackage.vx1.GE9mJIPrb8gP(this.oh71FJcDz6S2, this.P05cfTpS5W5L, i);
        }
        int i4 = this.P05cfTpS5W5L;
        if (i4 >= this.oh71FJcDz6S2.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.oh71FJcDz6S2 = java.util.Arrays.copyOf(this.oh71FJcDz6S2, i8);
            this.QiMR8OkAhezm = java.util.Arrays.copyOf(this.QiMR8OkAhezm, i8);
        }
        int i9 = this.P05cfTpS5W5L;
        if (i9 - i2 != 0) {
            int[] iArr = this.oh71FJcDz6S2;
            int i10 = i2 + 1;
            defpackage.y7.cCeDCHgnx5OL(iArr, iArr, i10, i2, i9);
            java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
            defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i10, i2, this.P05cfTpS5W5L);
        }
        this.oh71FJcDz6S2[i2] = i;
        this.QiMR8OkAhezm[i2] = obj;
        this.P05cfTpS5W5L++;
    }

    public final int WDYagTQQm9ns() {
        if (this.WDYagTQQm9ns) {
            defpackage.i61.WDYagTQQm9ns(this);
        }
        return this.P05cfTpS5W5L;
    }

    /* renamed from: ZpBGe2uQfcn8, reason: merged with bridge method [inline-methods] */
    public final defpackage.rf1 clone() {
        java.lang.Object clone = super.clone();
        clone.getClass();
        defpackage.rf1 rf1Var = (defpackage.rf1) clone;
        rf1Var.oh71FJcDz6S2 = (int[]) this.oh71FJcDz6S2.clone();
        rf1Var.QiMR8OkAhezm = (java.lang.Object[]) this.QiMR8OkAhezm.clone();
        return rf1Var;
    }

    public final int fWTAfUmVKrZq(int i) {
        if (this.WDYagTQQm9ns) {
            defpackage.i61.WDYagTQQm9ns(this);
        }
        return this.oh71FJcDz6S2[i];
    }

    public final java.lang.Object giKS3J6vZuNy(int i) {
        java.lang.Object obj;
        int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(this.oh71FJcDz6S2, this.P05cfTpS5W5L, i);
        if (GE9mJIPrb8gP < 0 || (obj = this.QiMR8OkAhezm[GE9mJIPrb8gP]) == defpackage.i61.Ns0WNyEWdPsk) {
            return null;
        }
        return obj;
    }

    public final java.lang.Object oh71FJcDz6S2(int i) {
        if (this.WDYagTQQm9ns) {
            defpackage.i61.WDYagTQQm9ns(this);
        }
        java.lang.Object[] objArr = this.QiMR8OkAhezm;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public final java.lang.String toString() {
        if (WDYagTQQm9ns() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.P05cfTpS5W5L * 28);
        sb.append('{');
        int i = this.P05cfTpS5W5L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(fWTAfUmVKrZq(i2));
            sb.append('=');
            java.lang.Object oh71FJcDz6S2 = oh71FJcDz6S2(i2);
            if (oh71FJcDz6S2 != this) {
                sb.append(oh71FJcDz6S2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
