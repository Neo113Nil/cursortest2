package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class db implements defpackage.vk0 {
    public final defpackage.ea ZpBGe2uQfcn8;
    public final boolean giKS3J6vZuNy;

    public db(defpackage.ea eaVar, boolean z) {
        this.ZpBGe2uQfcn8 = eaVar;
        this.giKS3J6vZuNy = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.db)) {
            return false;
        }
        defpackage.db dbVar = (defpackage.db) obj;
        return this.ZpBGe2uQfcn8.equals(dbVar.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == dbVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(final defpackage.xk0 xk0Var, final java.util.List list, long j) {
        boolean isEmpty = list.isEmpty();
        defpackage.bv bvVar = defpackage.bv.WDYagTQQm9ns;
        if (isEmpty) {
            return xk0Var.hwoZxnIesQBZ(defpackage.mk.GE9mJIPrb8gP(j), defpackage.mk.e6mdH7fiFuta(j), bvVar, new defpackage.awuGf4qH8HFd(6));
        }
        long j2 = this.giKS3J6vZuNy ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final defpackage.qk0 qk0Var = (defpackage.qk0) list.get(0);
            qk0Var.GE9mJIPrb8gP();
            final defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j2);
            final int max = java.lang.Math.max(defpackage.mk.GE9mJIPrb8gP(j), WDYagTQQm9ns.WDYagTQQm9ns);
            final int max2 = java.lang.Math.max(defpackage.mk.e6mdH7fiFuta(j), WDYagTQQm9ns.oh71FJcDz6S2);
            return xk0Var.hwoZxnIesQBZ(max, max2, bvVar, new defpackage.y10() { // from class: bb
                @Override // defpackage.y10
                public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                    defpackage.ab.giKS3J6vZuNy((defpackage.qy0) obj, defpackage.ry0.this, qk0Var, xk0Var.getLayoutDirection(), max, max2, this.ZpBGe2uQfcn8);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            });
        }
        final defpackage.ry0[] ry0VarArr = new defpackage.ry0[list.size()];
        final defpackage.x31 x31Var = new defpackage.x31();
        x31Var.WDYagTQQm9ns = defpackage.mk.GE9mJIPrb8gP(j);
        final defpackage.x31 x31Var2 = new defpackage.x31();
        x31Var2.WDYagTQQm9ns = defpackage.mk.e6mdH7fiFuta(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.qk0 qk0Var2 = (defpackage.qk0) list.get(i);
            qk0Var2.GE9mJIPrb8gP();
            defpackage.ry0 WDYagTQQm9ns2 = qk0Var2.WDYagTQQm9ns(j2);
            ry0VarArr[i] = WDYagTQQm9ns2;
            x31Var.WDYagTQQm9ns = java.lang.Math.max(x31Var.WDYagTQQm9ns, WDYagTQQm9ns2.WDYagTQQm9ns);
            x31Var2.WDYagTQQm9ns = java.lang.Math.max(x31Var2.WDYagTQQm9ns, WDYagTQQm9ns2.oh71FJcDz6S2);
        }
        return xk0Var.hwoZxnIesQBZ(x31Var.WDYagTQQm9ns, x31Var2.WDYagTQQm9ns, bvVar, new defpackage.y10() { // from class: cb
            @Override // defpackage.y10
            public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                defpackage.ry0[] ry0VarArr2 = ry0VarArr;
                int length = ry0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    defpackage.ry0 ry0Var = ry0VarArr2[i3];
                    ry0Var.getClass();
                    defpackage.ab.giKS3J6vZuNy(qy0Var, ry0Var, (defpackage.qk0) list.get(i4), xk0Var.getLayoutDirection(), x31Var.WDYagTQQm9ns, x31Var2.WDYagTQQm9ns, this.ZpBGe2uQfcn8);
                    i3++;
                    i2 = i4 + 1;
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        });
    }

    public final java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.ZpBGe2uQfcn8 + ", propagateMinConstraints=" + this.giKS3J6vZuNy + ')';
    }
}
