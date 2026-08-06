package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ir0 extends ay {
    private static final ir0 DEFAULT_INSTANCE;
    private static volatile ho0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private nc0 preferences_ = nc0.EljAMC1QTz;

    static {
        ir0 ir0Var = new ir0();
        DEFAULT_INSTANCE = ir0Var;
        ay.JFJ3QoxA(ir0.class, ir0Var);
    }

    public static nc0 E7jCp8Ls(ir0 ir0Var) {
        nc0 nc0Var = ir0Var.preferences_;
        if (!nc0Var.OOA6hdeuvCS) {
            ir0Var.preferences_ = nc0Var.Yi7zF1RB1();
        }
        return ir0Var.preferences_;
    }

    public static ir0 iwATDS1i01k(FileInputStream fileInputStream) {
        ir0 ir0Var = DEFAULT_INSTANCE;
        lb lbVar = new lb(fileInputStream);
        zq GWasM1elztuh = zq.GWasM1elztuh();
        ay mOu10nynGul = ir0Var.mOu10nynGul();
        try {
            ns0 ns0Var = ns0.X1lG3V04pd;
            ns0Var.getClass();
            nx0 GWasM1elztuh2 = ns0Var.GWasM1elztuh(mOu10nynGul.getClass());
            nb nbVar = (nb) lbVar.EljAMC1QTz;
            if (nbVar == null) {
                nbVar = new nb(lbVar);
            }
            GWasM1elztuh2.encWxUiV2(mOu10nynGul, nbVar, GWasM1elztuh);
            GWasM1elztuh2.X1lG3V04pd(mOu10nynGul);
            if (ay.EljAMC1QTz(mOu10nynGul, true)) {
                return (ir0) mOu10nynGul;
            }
            throw new w30(new ic1().getMessage());
        } catch (ic1 e) {
            throw new w30(e.getMessage());
        } catch (w30 e2) {
            if (e2.OOA6hdeuvCS) {
                throw new w30(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof w30) {
                throw ((w30) e3.getCause());
            }
            throw new w30(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof w30) {
                throw ((w30) e4.getCause());
            }
            throw e4;
        }
    }

    public static gr0 uFEq9NpZ() {
        return (gr0) ((yx) DEFAULT_INSTANCE.X1lG3V04pd(5));
    }

    @Override // defpackage.ay
    public final Object X1lG3V04pd(int i) {
        ho0 ho0Var;
        switch (mr0.YmKjaVtbfp5Z(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new us0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", hr0.GWasM1elztuh});
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new ir0();
            case 4:
                return new gr0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                ho0 ho0Var2 = PARSER;
                if (ho0Var2 != null) {
                    return ho0Var2;
                }
                synchronized (ir0.class) {
                    try {
                        ho0Var = PARSER;
                        if (ho0Var == null) {
                            ho0Var = new zx();
                            PARSER = ho0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ho0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map XnEVoBF0td1l() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
