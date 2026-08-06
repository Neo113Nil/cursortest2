package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2355a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f2356b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f2357c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t = T.f2345c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2355a = cls;
        try {
            T t2 = T.f2345c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2356b = e0Var;
        f2357c = new e0();
    }

    public static void A(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0122w abstractC0122w = (AbstractC0122w) obj;
        d0 d0Var = abstractC0122w.unknownFields;
        d0 d0Var2 = ((AbstractC0122w) obj2).unknownFields;
        d0 d0Var3 = d0.f2378f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i2 = d0Var.f2379a + d0Var2.f2379a;
                int[] copyOf = Arrays.copyOf(d0Var.f2380b, i2);
                System.arraycopy(d0Var2.f2380b, 0, copyOf, d0Var.f2379a, d0Var2.f2379a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f2381c, i2);
                System.arraycopy(d0Var2.f2381c, 0, copyOf2, d0Var.f2379a, d0Var2.f2379a);
                d0Var = new d0(i2, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f2383e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = d0Var.f2379a + d0Var2.f2379a;
                    d0Var.a(i3);
                    System.arraycopy(d0Var2.f2380b, 0, d0Var.f2380b, d0Var.f2379a, d0Var2.f2379a);
                    System.arraycopy(d0Var2.f2381c, 0, d0Var.f2381c, d0Var.f2379a, d0Var2.f2379a);
                    d0Var.f2379a = i3;
                }
            }
        }
        abstractC0122w.unknownFields = d0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.o0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4++;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.m0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void D(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0113m) f2.f2315a).p0(i2, (C0107g) list.get(i3));
        }
    }

    public static void E(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                double doubleValue = ((Double) list.get(i3)).doubleValue();
                c0113m.getClass();
                c0113m.t0(i2, Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 8;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.u0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void F(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.v0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0113m.j0(((Integer) list.get(i5)).intValue());
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.w0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void G(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.r0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 4;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.s0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void H(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.t0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 8;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.u0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void I(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                c0113m.getClass();
                c0113m.r0(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 4;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.s0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void J(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.h(i2, list.get(i3), w2);
        }
    }

    public static void K(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.v0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0113m.j0(((Integer) list.get(i5)).intValue());
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.w0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void L(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.C0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0113m.j0(((Long) list.get(i5)).longValue());
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.D0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void M(int i2, List list, F f2, W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.k(i2, list.get(i3), w2);
        }
    }

    public static void N(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.r0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 4;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.s0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void O(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.t0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = C0113m.f2421f;
            i4 += 8;
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.u0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void P(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                int intValue = ((Integer) list.get(i3)).intValue();
                c0113m.A0(i2, (intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += C0113m.h0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            int intValue3 = ((Integer) list.get(i3)).intValue();
            c0113m.B0((intValue3 >> 31) ^ (intValue3 << 1));
            i3++;
        }
    }

    public static void Q(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                long longValue = ((Long) list.get(i3)).longValue();
                c0113m.C0(i2, (longValue >> 63) ^ (longValue << 1));
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += C0113m.j0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            long longValue3 = ((Long) list.get(i3)).longValue();
            c0113m.D0((longValue3 >> 63) ^ (longValue3 << 1));
            i3++;
        }
    }

    public static void R(int i2, List list, F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0113m) f2.f2315a).x0(i2, (String) list.get(i3));
        }
    }

    public static void S(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.A0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0113m.h0(((Integer) list.get(i5)).intValue());
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.B0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void T(int i2, List list, F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0113m c0113m = (C0113m) f2.f2315a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0113m.C0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0113m.z0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += C0113m.j0(((Long) list.get(i5)).longValue());
        }
        c0113m.B0(i4);
        while (i3 < list.size()) {
            c0113m.D0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0113m.P(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f0 = C0113m.f0(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((C0107g) list.get(i3)).size();
            f0 += C0113m.h0(size2) + size2;
        }
        return f0;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0113m.j0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0113m.T(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0113m.U(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0113m.W(i2, (AbstractC0101a) list.get(i4), w2);
        }
        return i3;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0113m.j0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0113m.j0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int o(int i2, Object obj, W w2) {
        int f0 = C0113m.f0(i2);
        int a2 = ((AbstractC0101a) obj).a(w2);
        return C0113m.h0(a2) + a2 + f0;
    }

    public static int p(int i2, List list, W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f0 = C0113m.f0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int a2 = ((AbstractC0101a) list.get(i3)).a(w2);
            f0 += C0113m.h0(a2) + a2;
        }
        return f0;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) list.get(i3)).intValue();
            i2 += C0113m.h0((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) list.get(i3)).longValue();
            i2 += C0113m.j0((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f0 = C0113m.f0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C0107g) {
                int size2 = ((C0107g) obj).size();
                f0 = C0113m.h0(size2) + size2 + f0;
            } else {
                f0 = C0113m.e0((String) obj) + f0;
            }
        }
        return f0;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0113m.h0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0113m.f0(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0113m.j0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static Object z(Object obj, int i2, InterfaceC0123x interfaceC0123x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
