package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nr0 extends ay {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final nr0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile ho0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        nr0 nr0Var = new nr0();
        DEFAULT_INSTANCE = nr0Var;
        ay.JFJ3QoxA(nr0.class, nr0Var);
    }

    public static void E7jCp8Ls(nr0 nr0Var, long j) {
        nr0Var.valueCase_ = 4;
        nr0Var.value_ = Long.valueOf(j);
    }

    public static lr0 EXrPz3p7hFb() {
        return (lr0) ((yx) DEFAULT_INSTANCE.X1lG3V04pd(5));
    }

    public static void Mjvvu5DE(nr0 nr0Var, float f) {
        nr0Var.valueCase_ = 2;
        nr0Var.value_ = Float.valueOf(f);
    }

    public static void WIEu4Ya2g8(nr0 nr0Var, c9 c9Var) {
        nr0Var.getClass();
        nr0Var.valueCase_ = 8;
        nr0Var.value_ = c9Var;
    }

    public static void XnEVoBF0td1l(nr0 nr0Var, String str) {
        nr0Var.getClass();
        nr0Var.valueCase_ = 5;
        nr0Var.value_ = str;
    }

    public static void YmKjaVtbfp5Z(nr0 nr0Var, boolean z) {
        nr0Var.valueCase_ = 1;
        nr0Var.value_ = Boolean.valueOf(z);
    }

    public static nr0 cilMamHF() {
        return DEFAULT_INSTANCE;
    }

    public static void iwATDS1i01k(nr0 nr0Var, double d) {
        nr0Var.valueCase_ = 7;
        nr0Var.value_ = Double.valueOf(d);
    }

    public static void mE4lRynR(nr0 nr0Var, int i) {
        nr0Var.valueCase_ = 3;
        nr0Var.value_ = Integer.valueOf(i);
    }

    public static void uFEq9NpZ(nr0 nr0Var, kr0 kr0Var) {
        nr0Var.getClass();
        nr0Var.value_ = kr0Var;
        nr0Var.valueCase_ = 6;
    }

    public final kr0 M3K9sHhK() {
        return this.valueCase_ == 6 ? (kr0) this.value_ : kr0.XnEVoBF0td1l();
    }

    public final int WRKkgoJXwDn() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final float WdrkLMV3xh() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
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
                return new us0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", kr0.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new nr0();
            case 4:
                return new lr0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                ho0 ho0Var2 = PARSER;
                if (ho0Var2 != null) {
                    return ho0Var2;
                }
                synchronized (nr0.class) {
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

    public final c9 Y6hRI1cF8() {
        return this.valueCase_ == 8 ? (c9) this.value_ : c9.AvO7iQsrTN;
    }

    public final long arNh8D4Z5gB() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final boolean jivtDDk9H() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final int k8h8IjolWQ() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final double lv06NcmrQ() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final String pog2g9KITJA() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }
}
