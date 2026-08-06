package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class wc1 {
    public static final boolean AvO7iQsrTN;
    public static final long EljAMC1QTz;
    public static final Unsafe GWasM1elztuh;
    public static final boolean OOA6hdeuvCS;
    public static final vc1 X1lG3V04pd;
    public static final Class Yi7zF1RB1;
    public static final boolean xqGvceK5x;

    static {
        Unsafe mOu10nynGul = mOu10nynGul();
        GWasM1elztuh = mOu10nynGul;
        Yi7zF1RB1 = r8u5JxottJCl.GWasM1elztuh;
        boolean encWxUiV2 = encWxUiV2(Long.TYPE);
        boolean encWxUiV22 = encWxUiV2(Integer.TYPE);
        char c = 1;
        int i = 0;
        vc1 vc1Var = null;
        if (mOu10nynGul != null) {
            if (!r8u5JxottJCl.GWasM1elztuh()) {
                vc1Var = new uc1(mOu10nynGul);
            } else if (encWxUiV2) {
                vc1Var = new tc1(mOu10nynGul, c == true ? 1 : 0);
            } else if (encWxUiV22) {
                vc1Var = new tc1(mOu10nynGul, i);
            }
        }
        X1lG3V04pd = vc1Var;
        xqGvceK5x = vc1Var == null ? false : vc1Var.Mjvvu5DE();
        OOA6hdeuvCS = vc1Var == null ? false : vc1Var.YmKjaVtbfp5Z();
        EljAMC1QTz = OOA6hdeuvCS(byte[].class);
        OOA6hdeuvCS(boolean[].class);
        EljAMC1QTz(boolean[].class);
        OOA6hdeuvCS(int[].class);
        EljAMC1QTz(int[].class);
        OOA6hdeuvCS(long[].class);
        EljAMC1QTz(long[].class);
        OOA6hdeuvCS(float[].class);
        EljAMC1QTz(float[].class);
        OOA6hdeuvCS(double[].class);
        EljAMC1QTz(double[].class);
        OOA6hdeuvCS(Object[].class);
        EljAMC1QTz(Object[].class);
        Field AvO7iQsrTN2 = AvO7iQsrTN();
        if (AvO7iQsrTN2 != null && vc1Var != null) {
            vc1Var.mOu10nynGul(AvO7iQsrTN2);
        }
        AvO7iQsrTN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field AvO7iQsrTN() {
        Field field;
        Field field2;
        if (r8u5JxottJCl.GWasM1elztuh()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void E7jCp8Ls(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        XnEVoBF0td1l(obj, j2, ((255 & b) << i) | (X1lG3V04pd.EljAMC1QTz(j2, obj) & (~(255 << i))));
    }

    public static void EljAMC1QTz(Class cls) {
        if (OOA6hdeuvCS) {
            X1lG3V04pd.Yi7zF1RB1(cls);
        }
    }

    public static void GWasM1elztuh(Throwable th) {
        Logger.getLogger(wc1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void JFJ3QoxA(byte[] bArr, long j, byte b) {
        X1lG3V04pd.rQPn8YBR(bArr, EljAMC1QTz + j, b);
    }

    public static int OOA6hdeuvCS(Class cls) {
        if (OOA6hdeuvCS) {
            return X1lG3V04pd.GWasM1elztuh(cls);
        }
        return -1;
    }

    public static boolean X1lG3V04pd(long j, Object obj) {
        return ((byte) ((X1lG3V04pd.EljAMC1QTz((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void XnEVoBF0td1l(Object obj, long j, int i) {
        X1lG3V04pd.uFEq9NpZ(obj, j, i);
    }

    public static boolean Yi7zF1RB1(long j, Object obj) {
        return ((byte) ((X1lG3V04pd.EljAMC1QTz((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean encWxUiV2(Class cls) {
        if (!r8u5JxottJCl.GWasM1elztuh()) {
            return false;
        }
        try {
            Class cls2 = Yi7zF1RB1;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void iwATDS1i01k(Object obj, long j, Object obj2) {
        X1lG3V04pd.WIEu4Ya2g8(obj, j, obj2);
    }

    public static Unsafe mOu10nynGul() {
        try {
            return (Unsafe) AccessController.doPrivileged(new sc1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rQPn8YBR(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int EljAMC1QTz2 = X1lG3V04pd.EljAMC1QTz(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        XnEVoBF0td1l(obj, j2, ((255 & b) << i) | (EljAMC1QTz2 & (~(255 << i))));
    }

    public static void uFEq9NpZ(Object obj, long j, long j2) {
        X1lG3V04pd.iwATDS1i01k(obj, j, j2);
    }

    public static Object xqGvceK5x(Class cls) {
        try {
            return GWasM1elztuh.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }
}
