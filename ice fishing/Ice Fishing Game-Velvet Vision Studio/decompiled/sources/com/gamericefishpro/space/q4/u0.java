package com.gamericefishpro.space.q4;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public static final Class a;
    public static final z0 b;
    public static final z0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        q0 q0Var = q0.c;
        z0 z0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            q0 q0Var2 = q0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                z0Var = (z0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = z0Var;
        c = new z0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            iB0 += i.B0(((Integer) list.get(i)).intValue());
        }
        return iB0;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.z0(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.z0(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            iB0 += i.B0(((Integer) list.get(i)).intValue());
        }
        return iB0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            iB0 += i.B0(((Long) list.get(i)).longValue());
        }
        return iB0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iA0 += i.A0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iA0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iB0 += i.B0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iB0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            iA0 += i.A0(((Integer) list.get(i)).intValue());
        }
        return iA0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i = 0; i < size; i++) {
            iB0 += i.B0(((Long) list.get(i)).longValue());
        }
        return iB0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(z0 z0Var, Object obj, Object obj2) {
        z0Var.getClass();
        s sVar = (s) obj;
        y0 y0Var = sVar.unknownFields;
        y0 y0Var2 = ((s) obj2).unknownFields;
        y0 y0Var3 = y0.f;
        if (!y0Var3.equals(y0Var2)) {
            if (y0Var3.equals(y0Var)) {
                int i = y0Var.a + y0Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(y0Var.b, i);
                System.arraycopy(y0Var2.b, 0, iArrCopyOf, y0Var.a, y0Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(y0Var.c, i);
                System.arraycopy(y0Var2.c, 0, objArrCopyOf, y0Var.a, y0Var2.a);
                y0Var = new y0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                y0Var.getClass();
                if (!y0Var2.equals(y0Var3)) {
                    if (!y0Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = y0Var.a + y0Var2.a;
                    y0Var.a(i2);
                    System.arraycopy(y0Var2.b, 0, y0Var.b, y0Var.a, y0Var2.a);
                    System.arraycopy(y0Var2.c, 0, y0Var.c, y0Var.a, y0Var2.a);
                    y0Var.a = i2;
                }
            }
        }
        sVar.unknownFields = y0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.G0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = i.h;
            i3++;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.E0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                iVar.getClass();
                iVar.L0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 8;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.M0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.N0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += i.B0(((Integer) list.get(i3)).intValue());
        }
        iVar.U0(iB0);
        while (i2 < list.size()) {
            iVar.O0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.J0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 4;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.K0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.L0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 8;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.M0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                iVar.getClass();
                iVar.J0(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 4;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.K0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.N0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += i.B0(((Integer) list.get(i3)).intValue());
        }
        iVar.U0(iB0);
        while (i2 < list.size()) {
            iVar.O0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.V0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += i.B0(((Long) list.get(i3)).longValue());
        }
        iVar.U0(iB0);
        while (i2 < list.size()) {
            iVar.W0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.J0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 4;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.K0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.L0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = i.h;
            i3 += 8;
        }
        iVar.U0(i3);
        while (i2 < list.size()) {
            iVar.M0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iVar.T0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iA0 += i.A0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        iVar.U0(iA0);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            iVar.U0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iVar.V0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iB0 += i.B0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        iVar.U0(iB0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            iVar.W0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.T0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += i.A0(((Integer) list.get(i3)).intValue());
        }
        iVar.U0(iA0);
        while (i2 < list.size()) {
            iVar.U0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) c0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.V0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.S0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += i.B0(((Long) list.get(i3)).longValue());
        }
        iVar.U0(iB0);
        while (i2 < list.size()) {
            iVar.W0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, t tVar, Object obj2, z0 z0Var) {
        return obj2;
    }
}
