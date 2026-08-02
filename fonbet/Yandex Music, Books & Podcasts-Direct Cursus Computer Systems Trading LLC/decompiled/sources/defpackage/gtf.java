package defpackage;

/* loaded from: classes.dex */
public final class gtf extends xci implements bdi, epf {
    public static final etf s = new etf();
    public htf o;
    public oxa p;
    public boolean q;
    public bxj r;

    @Override // defpackage.bdi
    public final tyf D() {
        mkq mkqVar = new mkq(ez2.a);
        mkqVar.b.setValue(this);
        return mkqVar;
    }

    public final boolean S0(dtf dtfVar, int i) {
        if (i == 5 || i == 6) {
            if (this.r == bxj.b) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.r == bxj.a) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            xq0.q("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (T0(i)) {
            if (dtfVar.b >= this.o.a() - 1) {
                return false;
            }
        } else if (dtfVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean T0(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.q;
            }
            if (i == 6) {
                if (this.q) {
                    return false;
                }
            } else if (i == 3) {
                int ordinal = bcx.F(this).z.ordinal();
                if (ordinal == 0) {
                    return this.q;
                }
                if (ordinal != 1) {
                    b6e.s();
                    return false;
                }
                if (this.q) {
                    return false;
                }
            } else {
                if (i != 4) {
                    xq0.q("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int ordinal2 = bcx.F(this).z.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        return this.q;
                    }
                    b6e.s();
                    return false;
                }
                if (this.q) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(j);
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 10));
    }
}
