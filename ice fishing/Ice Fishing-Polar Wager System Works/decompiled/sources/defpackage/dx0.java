package defpackage;

/* loaded from: classes.dex */
public final class dx0 extends defpackage.e20 {
    private static final defpackage.dx0 DEFAULT_INSTANCE;
    private static volatile defpackage.st0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private defpackage.p70 strings_ = defpackage.ky0.EXtogiMhuM;

    static {
        defpackage.dx0 dx0Var = new defpackage.dx0();
        DEFAULT_INSTANCE = dx0Var;
        defpackage.e20.SH1y5HwkJhh(defpackage.dx0.class, dx0Var);
    }

    public static defpackage.dx0 DFo87pBq1E5() {
        return DEFAULT_INSTANCE;
    }

    public static void JlrlGoKF(defpackage.dx0 dx0Var, java.lang.Iterable iterable) {
        defpackage.p70 p70Var = dx0Var.strings_;
        if (!((defpackage.ky0) p70Var).adDC3e2L) {
            defpackage.ky0 ky0Var = (defpackage.ky0) p70Var;
            int i = ky0Var.AARZUJiTa;
            dx0Var.strings_ = ky0Var.r1MBDhnF(i == 0 ? 10 : i * 2);
        }
        java.util.RandomAccess randomAccess = dx0Var.strings_;
        java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
        if (iterable instanceof defpackage.dd0) {
            java.util.List F7NU4MC0GW = ((defpackage.dd0) iterable).F7NU4MC0GW();
            if (randomAccess != null) {
                defpackage.db.kd6TUFXn();
                return;
            }
            ((defpackage.ky0) randomAccess).getClass();
            java.util.Iterator it = F7NU4MC0GW.iterator();
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                next.getClass();
                if (next instanceof defpackage.ra) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                defpackage.ra.r1MBDhnF(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof defpackage.sx0) {
            ((defpackage.ky0) randomAccess).addAll((java.util.Collection) iterable);
            return;
        }
        if ((randomAccess instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) randomAccess).ensureCapacity(((java.util.Collection) iterable).size() + ((defpackage.ky0) randomAccess).AARZUJiTa);
        }
        defpackage.ky0 ky0Var2 = (defpackage.ky0) randomAccess;
        int i2 = ky0Var2.AARZUJiTa;
        for (java.lang.Object obj : iterable) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (ky0Var2.AARZUJiTa - i2) + " is null.";
                for (int i3 = ky0Var2.AARZUJiTa - 1; i3 >= i2; i3--) {
                    ky0Var2.remove(i3);
                }
                throw new java.lang.NullPointerException(str);
            }
            ky0Var2.add(obj);
        }
    }

    public static defpackage.cx0 cnag84Bm() {
        return (defpackage.cx0) ((defpackage.c20) DEFAULT_INSTANCE.r1MBDhnF(5));
    }

    public final defpackage.p70 SyNS6RMn() {
        return this.strings_;
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
                return new defpackage.ty0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.dx0();
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.cx0(DEFAULT_INSTANCE);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.st0 st0Var2 = PARSER;
                if (st0Var2 != null) {
                    return st0Var2;
                }
                synchronized (defpackage.dx0.class) {
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
