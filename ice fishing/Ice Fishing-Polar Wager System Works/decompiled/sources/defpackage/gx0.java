package defpackage;

/* loaded from: classes.dex */
public final class gx0 extends defpackage.e20 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final defpackage.gx0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile defpackage.st0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        defpackage.gx0 gx0Var = new defpackage.gx0();
        DEFAULT_INSTANCE = gx0Var;
        defpackage.e20.SH1y5HwkJhh(defpackage.gx0.class, gx0Var);
    }

    public static void DFo87pBq1E5(defpackage.gx0 gx0Var, java.lang.String str) {
        gx0Var.getClass();
        gx0Var.valueCase_ = 5;
        gx0Var.value_ = str;
    }

    public static void EgCjBq0SZwJ(defpackage.gx0 gx0Var, int i) {
        gx0Var.valueCase_ = 3;
        gx0Var.value_ = java.lang.Integer.valueOf(i);
    }

    public static void G3OKOH3wZRC(defpackage.gx0 gx0Var, boolean z) {
        gx0Var.valueCase_ = 1;
        gx0Var.value_ = java.lang.Boolean.valueOf(z);
    }

    public static void JlrlGoKF(defpackage.gx0 gx0Var, long j) {
        gx0Var.valueCase_ = 4;
        gx0Var.value_ = java.lang.Long.valueOf(j);
    }

    public static void QoRHpC4k(defpackage.gx0 gx0Var, defpackage.ra raVar) {
        gx0Var.getClass();
        gx0Var.valueCase_ = 8;
        gx0Var.value_ = raVar;
    }

    public static void SyNS6RMn(defpackage.gx0 gx0Var, defpackage.dx0 dx0Var) {
        gx0Var.getClass();
        gx0Var.value_ = dx0Var;
        gx0Var.valueCase_ = 6;
    }

    public static defpackage.gx0 V7bD7b8KA() {
        return DEFAULT_INSTANCE;
    }

    public static void cnag84Bm(defpackage.gx0 gx0Var, double d) {
        gx0Var.valueCase_ = 7;
        gx0Var.value_ = java.lang.Double.valueOf(d);
    }

    public static void kd6TUFXn(defpackage.gx0 gx0Var, float f) {
        gx0Var.valueCase_ = 2;
        gx0Var.value_ = java.lang.Float.valueOf(f);
    }

    public static defpackage.ex0 v5iciZok() {
        return (defpackage.ex0) ((defpackage.c20) DEFAULT_INSTANCE.r1MBDhnF(5));
    }

    public final java.lang.String C0U8sNJm() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    public final int NHJTzaLwkd() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    public final double PAEGRtP0bX() {
        if (this.valueCase_ == 7) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long QQUzIjv3iOC5() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    public final defpackage.dx0 UsuH8pd5P() {
        return this.valueCase_ == 6 ? (defpackage.dx0) this.value_ : defpackage.dx0.DFo87pBq1E5();
    }

    public final float abhbClRa() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final boolean fnWB2E7cs() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final defpackage.ra kNAkVymC() {
        return this.valueCase_ == 8 ? (defpackage.ra) this.value_ : defpackage.ra.AARZUJiTa;
    }

    public final int nBH8hAHy() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.e20
    public final java.lang.Object r1MBDhnF(int i) {
        defpackage.st0 st0Var;
        switch (defpackage.fx0.fnWB2E7cs(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.ty0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", defpackage.dx0.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.gx0();
            case LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.ex0(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.st0 st0Var2 = PARSER;
                if (st0Var2 != null) {
                    return st0Var2;
                }
                synchronized (defpackage.gx0.class) {
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
