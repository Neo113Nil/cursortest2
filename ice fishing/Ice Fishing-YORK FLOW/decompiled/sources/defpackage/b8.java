package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b8 extends defpackage.ul0 implements defpackage.ad0 {
    public float BHfvd2J71qpO;

    public final long I9id0xDxCgYV(long j, boolean z) {
        int e6mdH7fiFuta = defpackage.mk.e6mdH7fiFuta(j);
        int round = java.lang.Math.round(e6mdH7fiFuta * this.BHfvd2J71qpO);
        if (round <= 0) {
            return 0L;
        }
        if (!z || defpackage.h0.hH0RRJrNssvh(round, e6mdH7fiFuta, j)) {
            return (round << 32) | (e6mdH7fiFuta & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.ad0
    public final int Jkfc0NcwyPL8(defpackage.kj0 kj0Var, defpackage.qk0 qk0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i * this.BHfvd2J71qpO) : qk0Var.Jkfc0NcwyPL8(i);
    }

    @Override // defpackage.ad0
    public final int QiMR8OkAhezm(defpackage.kj0 kj0Var, defpackage.qk0 qk0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i * this.BHfvd2J71qpO) : qk0Var.GoIRkIe1iwj6(i);
    }

    @Override // defpackage.ad0
    public final int T1fB7bDYiVJQ(defpackage.kj0 kj0Var, defpackage.qk0 qk0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i / this.BHfvd2J71qpO) : qk0Var.oh71FJcDz6S2(i);
    }

    @Override // defpackage.ad0
    public final int UmgHb6n58gfG(defpackage.kj0 kj0Var, defpackage.qk0 qk0Var, int i) {
        return i != Integer.MAX_VALUE ? java.lang.Math.round(i / this.BHfvd2J71qpO) : qk0Var.FhgBoOud6zyW(i);
    }

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        long xbkEJUK1coRZ = xbkEJUK1coRZ(j, true);
        if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
            xbkEJUK1coRZ = YZh1E3mnTFwf(j, true);
            if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                xbkEJUK1coRZ = jVUAPb5NnIYW(j, true);
                if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                    xbkEJUK1coRZ = I9id0xDxCgYV(j, true);
                    if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                        xbkEJUK1coRZ = xbkEJUK1coRZ(j, false);
                        if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                            xbkEJUK1coRZ = YZh1E3mnTFwf(j, false);
                            if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                                xbkEJUK1coRZ = jVUAPb5NnIYW(j, false);
                                if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                                    xbkEJUK1coRZ = I9id0xDxCgYV(j, false);
                                    if (defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
                                        xbkEJUK1coRZ = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!defpackage.u90.ZpBGe2uQfcn8(xbkEJUK1coRZ, 0L)) {
            int i = (int) (xbkEJUK1coRZ >> 32);
            int i2 = (int) (4294967295L & xbkEJUK1coRZ);
            if (!((i >= 0) & (i2 >= 0))) {
                defpackage.g80.ZpBGe2uQfcn8("width and height must be >= 0");
            }
            j = defpackage.nk.P05cfTpS5W5L(i, i, i2, i2);
        }
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        return xk0Var.hwoZxnIesQBZ(WDYagTQQm9ns.WDYagTQQm9ns, WDYagTQQm9ns.oh71FJcDz6S2, defpackage.bv.WDYagTQQm9ns, new defpackage.a8(WDYagTQQm9ns, 0));
    }

    public final long YZh1E3mnTFwf(long j, boolean z) {
        int round;
        int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
        if (QiMR8OkAhezm == Integer.MAX_VALUE || (round = java.lang.Math.round(QiMR8OkAhezm * this.BHfvd2J71qpO)) <= 0) {
            return 0L;
        }
        if (!z || defpackage.h0.hH0RRJrNssvh(round, QiMR8OkAhezm, j)) {
            return (round << 32) | (QiMR8OkAhezm & 4294967295L);
        }
        return 0L;
    }

    public final long jVUAPb5NnIYW(long j, boolean z) {
        int GE9mJIPrb8gP = defpackage.mk.GE9mJIPrb8gP(j);
        int round = java.lang.Math.round(GE9mJIPrb8gP / this.BHfvd2J71qpO);
        if (round <= 0) {
            return 0L;
        }
        if (!z || defpackage.h0.hH0RRJrNssvh(GE9mJIPrb8gP, round, j)) {
            return (GE9mJIPrb8gP << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long xbkEJUK1coRZ(long j, boolean z) {
        int round;
        int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
        if (P05cfTpS5W5L == Integer.MAX_VALUE || (round = java.lang.Math.round(P05cfTpS5W5L / this.BHfvd2J71qpO)) <= 0) {
            return 0L;
        }
        if (!z || defpackage.h0.hH0RRJrNssvh(P05cfTpS5W5L, round, j)) {
            return (P05cfTpS5W5L << 32) | (round & 4294967295L);
        }
        return 0L;
    }
}
