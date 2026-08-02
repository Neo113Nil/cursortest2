package androidx.datastore.preferences.protobuf;

import defpackage.awf;
import defpackage.wzh;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class s0 {
    public static final Class a;
    public static final x0 b;
    public static final x0 c;
    public static final z0 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new z0();
    }

    public static void A(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                jVar.getClass();
                jVar.s(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 8;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.t(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.g(((Integer) list.get(i4)).intValue());
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void C(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 4;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 8;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                jVar.getClass();
                jVar.q(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 4;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.r(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, d1 d1Var, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) d1Var;
        kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            kVar.b(i, list.get(i2), r0Var);
        }
    }

    public static void G(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.g(((Integer) list.get(i4)).intValue());
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.k(((Long) list.get(i4)).longValue());
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, d1 d1Var, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) d1Var;
        kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            kVar.a.w(i, (wzh) list.get(i2), r0Var);
        }
    }

    public static void J(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 4;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.b;
            i3 += 8;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                jVar.B(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += j.j((intValue2 >> 31) ^ (intValue2 << 1));
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            jVar.C((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void M(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                jVar.D(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += j.k((longValue2 >> 63) ^ (longValue2 << 1));
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            jVar.E((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!(list instanceof awf)) {
            while (i2 < list.size()) {
                jVar.y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        awf awfVar = (awf) list;
        while (i2 < list.size()) {
            Object k = awfVar.k(i2);
            if (k instanceof String) {
                jVar.y(i, (String) k);
            } else {
                jVar.o(i, (g) k);
            }
            i2++;
        }
    }

    public static void O(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.j(((Integer) list.get(i4)).intValue());
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.k(((Long) list.get(i4)).longValue());
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = j.i(i) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            i2 += j.c((g) list.get(i3));
        }
        return i2;
    }

    public static int b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.g(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.d(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.e(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.g(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(List list, int i) {
        if (list.size() == 0) {
            return 0;
        }
        return (j.i(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.k(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, r0 r0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = j.i(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int b2 = ((a) ((wzh) list.get(i3))).b(r0Var);
            i2 += j.j(b2) + b2;
        }
        return i2;
    }

    public static int m(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof t)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += j.j((intValue >> 31) ^ (intValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof y)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += j.k((longValue >> 63) ^ (longValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(List list, int i) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = j.i(i) * size;
        if (!(list instanceof awf)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof g) {
                    int size2 = ((g) obj).size();
                    i3 = j.j(size2) + size2 + i3;
                } else {
                    i3 = j.h((String) obj) + i3;
                }
                i2++;
            }
            return i3;
        }
        awf awfVar = (awf) list;
        while (i2 < size) {
            Object k = awfVar.k(i2);
            if (k instanceof g) {
                int size3 = ((g) k).size();
                i3 = j.j(size3) + size3 + i3;
            } else {
                i3 = j.h((String) k) + i3;
            }
            i2++;
        }
        return i3;
    }

    public static int r(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.i(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.k(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static x0 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (x0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(x0 x0Var, Object obj, Object obj2) {
        ((z0) x0Var).getClass();
        s sVar = (s) obj;
        y0 y0Var = sVar.unknownFields;
        y0 y0Var2 = ((s) obj2).unknownFields;
        if (!y0Var2.equals(y0.f)) {
            int i = y0Var.a + y0Var2.a;
            int[] copyOf = Arrays.copyOf(y0Var.b, i);
            System.arraycopy(y0Var2.b, 0, copyOf, y0Var.a, y0Var2.a);
            Object[] copyOf2 = Arrays.copyOf(y0Var.c, i);
            System.arraycopy(y0Var2.c, 0, copyOf2, y0Var.a, y0Var2.a);
            y0Var = new y0(i, copyOf, copyOf2, true);
        }
        sVar.unknownFields = y0Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, d1 d1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = ((k) d1Var).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.m(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        jVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = j.b;
            i3++;
        }
        jVar.C(i3);
        while (i2 < list.size()) {
            jVar.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void z(int i, List list, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) d1Var;
        kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            kVar.a.o(i, (g) list.get(i2));
        }
    }
}
