package com.gamericefishpro.space.i9;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j6 {
    public static final e5 a;

    static {
        f6 f6Var = f6.c;
        a = new e5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        g5 g5Var = (g5) obj;
        o6 o6Var = g5Var.zzc;
        o6 o6Var2 = ((g5) obj2).zzc;
        o6 o6Var3 = o6.f;
        if (!o6Var3.equals(o6Var2)) {
            if (o6Var3.equals(o6Var)) {
                int i = o6Var.a + o6Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(o6Var.b, i);
                System.arraycopy(o6Var2.b, 0, iArrCopyOf, o6Var.a, o6Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(o6Var.c, i);
                System.arraycopy(o6Var2.c, 0, objArrCopyOf, o6Var.a, o6Var2.a);
                o6Var = new o6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                o6Var.getClass();
                if (!o6Var2.equals(o6Var3)) {
                    if (!o6Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = o6Var.a + o6Var2.a;
                    o6Var.e(i2);
                    System.arraycopy(o6Var2.b, 0, o6Var.b, o6Var.a, o6Var2.a);
                    System.arraycopy(o6Var2.c, 0, o6Var.c, o6Var.a, o6Var2.a);
                    o6Var.a = i2;
                }
            }
        }
        g5Var.zzc = o6Var;
    }

    public static void c(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x4Var.W(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        x4Var.a0(i3);
        while (i2 < list.size()) {
            x4Var.d0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                x4Var.U(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        x4Var.a0(i3);
        while (i2 < list.size()) {
            x4Var.b0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void e(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof u5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.V(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x4.P(((Long) list.get(i3)).longValue());
            }
            x4Var.a0(iP);
            while (i2 < list.size()) {
                x4Var.c0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z) {
            while (i2 < u5Var.i) {
                x4Var.V(i, u5Var.c(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < u5Var.i; i4++) {
            iP2 += x4.P(u5Var.c(i4));
        }
        x4Var.a0(iP2);
        while (i2 < u5Var.i) {
            x4Var.c0(u5Var.c(i2));
            i2++;
        }
    }

    public static void f(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof u5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.V(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x4.P(((Long) list.get(i3)).longValue());
            }
            x4Var.a0(iP);
            while (i2 < list.size()) {
                x4Var.c0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z) {
            while (i2 < u5Var.i) {
                x4Var.V(i, u5Var.c(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < u5Var.i; i4++) {
            iP2 += x4.P(u5Var.c(i4));
        }
        x4Var.a0(iP2);
        while (i2 < u5Var.i) {
            x4Var.c0(u5Var.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof u5)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    x4Var.V(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iP += x4.P((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            x4Var.a0(iP);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                x4Var.c0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z) {
            while (i2 < u5Var.i) {
                long jC = u5Var.c(i2);
                x4Var.V(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < u5Var.i; i4++) {
            long jC2 = u5Var.c(i4);
            iP2 += x4.P((jC2 >> 63) ^ (jC2 + jC2));
        }
        x4Var.a0(iP2);
        while (i2 < u5Var.i) {
            long jC3 = u5Var.c(i2);
            x4Var.c0((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void h(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof u5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.W(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            x4Var.a0(i3);
            while (i2 < list.size()) {
                x4Var.d0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z) {
            while (i2 < u5Var.i) {
                x4Var.W(i, u5Var.c(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u5Var.i; i6++) {
            u5Var.c(i6);
            i5 += 8;
        }
        x4Var.a0(i5);
        while (i2 < u5Var.i) {
            x4Var.d0(u5Var.c(i2));
            i2++;
        }
    }

    public static void i(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof u5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.W(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            x4Var.a0(i3);
            while (i2 < list.size()) {
                x4Var.d0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z) {
            while (i2 < u5Var.i) {
                x4Var.W(i, u5Var.c(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < u5Var.i; i6++) {
            u5Var.c(i6);
            i5 += 8;
        }
        x4Var.a0(i5);
        while (i2 < u5Var.i) {
            x4Var.d0(u5Var.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.S(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x4.P(((Integer) list.get(i3)).intValue());
            }
            x4Var.a0(iP);
            while (i2 < list.size()) {
                x4Var.Z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                x4Var.S(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < h5Var.i; i4++) {
            iP2 += x4.P(h5Var.d(i4));
        }
        x4Var.a0(iP2);
        while (i2 < h5Var.i) {
            x4Var.Z(h5Var.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.T(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iG0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG0 += x4.g0(((Integer) list.get(i3)).intValue());
            }
            x4Var.a0(iG0);
            while (i2 < list.size()) {
                x4Var.a0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                x4Var.T(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iG1 = 0;
        for (int i4 = 0; i4 < h5Var.i; i4++) {
            iG1 += x4.g0(h5Var.d(i4));
        }
        x4Var.a0(iG1);
        while (i2 < h5Var.i) {
            x4Var.a0(h5Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    x4Var.T(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iG0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iG0 += x4.g0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            x4Var.a0(iG0);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                x4Var.a0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                int iD = h5Var.d(i2);
                x4Var.T(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iG1 = 0;
        for (int i4 = 0; i4 < h5Var.i; i4++) {
            int iD2 = h5Var.d(i4);
            iG1 += x4.g0((iD2 >> 31) ^ (iD2 + iD2));
        }
        x4Var.a0(iG1);
        while (i2 < h5Var.i) {
            int iD3 = h5Var.d(i2);
            x4Var.a0((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void m(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.U(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            x4Var.a0(i3);
            while (i2 < list.size()) {
                x4Var.b0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                x4Var.U(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.i; i6++) {
            h5Var.d(i6);
            i5 += 4;
        }
        x4Var.a0(i5);
        while (i2 < h5Var.i) {
            x4Var.b0(h5Var.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.U(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            x4Var.a0(i3);
            while (i2 < list.size()) {
                x4Var.b0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                x4Var.U(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < h5Var.i; i6++) {
            h5Var.d(i6);
            i5 += 4;
        }
        x4Var.a0(i5);
        while (i2 < h5Var.i) {
            x4Var.b0(h5Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!(list instanceof h5)) {
            if (!z) {
                while (i2 < list.size()) {
                    x4Var.S(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            x4Var.R(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += x4.P(((Integer) list.get(i3)).intValue());
            }
            x4Var.a0(iP);
            while (i2 < list.size()) {
                x4Var.Z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z) {
            while (i2 < h5Var.i) {
                x4Var.S(i, h5Var.d(i2));
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < h5Var.i; i4++) {
            iP2 += x4.P(h5Var.d(i4));
        }
        x4Var.a0(iP2);
        while (i2 < h5Var.i) {
            x4Var.Z(h5Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, v5 v5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) v5Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                x4Var.a0(i << 3);
                x4Var.Y(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        x4Var.R(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        x4Var.a0(i3);
        while (i2 < list.size()) {
            x4Var.Y(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iP = 0;
            while (i < size) {
                iP += x4.P(((Long) list.get(i)).longValue());
                i++;
            }
            return iP;
        }
        u5 u5Var = (u5) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x4.P(u5Var.c(i));
            i++;
        }
        return iP2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iP = 0;
            while (i < size) {
                iP += x4.P(((Long) list.get(i)).longValue());
                i++;
            }
            return iP;
        }
        u5 u5Var = (u5) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x4.P(u5Var.c(i));
            i++;
        }
        return iP2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iP = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iP += x4.P((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iP;
        }
        u5 u5Var = (u5) list;
        int iP2 = 0;
        while (i < size) {
            long jC = u5Var.c(i);
            iP2 += x4.P((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iP2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iP = 0;
            while (i < size) {
                iP += x4.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        h5 h5Var = (h5) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x4.P(h5Var.d(i));
            i++;
        }
        return iP2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iP = 0;
            while (i < size) {
                iP += x4.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        h5 h5Var = (h5) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += x4.P(h5Var.d(i));
            i++;
        }
        return iP2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iG0 = 0;
            while (i < size) {
                iG0 += x4.g0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG0;
        }
        h5 h5Var = (h5) list;
        int iG1 = 0;
        while (i < size) {
            iG1 += x4.g0(h5Var.d(i));
            i++;
        }
        return iG1;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iG0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iG0 += x4.g0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iG0;
        }
        h5 h5Var = (h5) list;
        int iG1 = 0;
        while (i < size) {
            int iD = h5Var.d(i);
            iG1 += x4.g0((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iG1;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.g0(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.g0(i << 3) + 8) * size;
    }
}
