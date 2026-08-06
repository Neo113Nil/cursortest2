package defpackage;

/* loaded from: classes.dex */
public final class bx0 extends defpackage.e20 {
    private static final defpackage.bx0 DEFAULT_INSTANCE;
    private static volatile defpackage.st0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private defpackage.hh0 preferences_ = defpackage.hh0.xiZrDbcSW0;

    static {
        defpackage.bx0 bx0Var = new defpackage.bx0();
        DEFAULT_INSTANCE = bx0Var;
        defpackage.e20.SH1y5HwkJhh(defpackage.bx0.class, bx0Var);
    }

    public static defpackage.hh0 JlrlGoKF(defpackage.bx0 bx0Var) {
        defpackage.hh0 hh0Var = bx0Var.preferences_;
        if (!hh0Var.adDC3e2L) {
            bx0Var.preferences_ = hh0Var.oh6vYeIP();
        }
        return bx0Var.preferences_;
    }

    public static defpackage.zw0 SyNS6RMn() {
        return (defpackage.zw0) ((defpackage.c20) DEFAULT_INSTANCE.r1MBDhnF(5));
    }

    public static defpackage.bx0 cnag84Bm(java.io.FileInputStream fileInputStream) {
        defpackage.bx0 bx0Var = DEFAULT_INSTANCE;
        defpackage.nd ndVar = new defpackage.nd(fileInputStream);
        defpackage.uu IHQe1A4L2xu = defpackage.uu.IHQe1A4L2xu();
        defpackage.e20 riuEU0zW4 = bx0Var.riuEU0zW4();
        try {
            defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
            jy0Var.getClass();
            defpackage.c51 IHQe1A4L2xu2 = jy0Var.IHQe1A4L2xu(riuEU0zW4.getClass());
            defpackage.pd pdVar = (defpackage.pd) ndVar.xiZrDbcSW0;
            if (pdVar == null) {
                pdVar = new defpackage.pd(ndVar);
            }
            IHQe1A4L2xu2.EXtogiMhuM(riuEU0zW4, pdVar, IHQe1A4L2xu);
            IHQe1A4L2xu2.r1MBDhnF(riuEU0zW4);
            if (defpackage.e20.xiZrDbcSW0(riuEU0zW4, true)) {
                return (defpackage.bx0) riuEU0zW4;
            }
            throw new defpackage.g80(new defpackage.mk1().getMessage());
        } catch (defpackage.g80 e) {
            if (e.adDC3e2L) {
                throw new defpackage.g80(e.getMessage(), e);
            }
            throw e;
        } catch (java.io.IOException e2) {
            if (e2.getCause() instanceof defpackage.g80) {
                throw ((defpackage.g80) e2.getCause());
            }
            throw new defpackage.g80(e2.getMessage(), e2);
        } catch (defpackage.mk1 e3) {
            throw new defpackage.g80(e3.getMessage());
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof defpackage.g80) {
                throw ((defpackage.g80) e4.getCause());
            }
            throw e4;
        }
    }

    public final java.util.Map DFo87pBq1E5() {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }

    @Override // defpackage.e20
    public final java.lang.Object r1MBDhnF(int i) {
        defpackage.st0 st0Var;
        switch (defpackage.fx0.fnWB2E7cs(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.ty0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", defpackage.ax0.IHQe1A4L2xu});
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.bx0();
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.zw0(DEFAULT_INSTANCE);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.st0 st0Var2 = PARSER;
                if (st0Var2 != null) {
                    return st0Var2;
                }
                synchronized (defpackage.bx0.class) {
                    try {
                        st0Var = PARSER;
                        if (st0Var == null) {
                            st0Var = new defpackage.d20();
                            PARSER = st0Var;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return st0Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
