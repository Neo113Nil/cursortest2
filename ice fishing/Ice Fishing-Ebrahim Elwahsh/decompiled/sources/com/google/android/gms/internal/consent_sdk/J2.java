package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    public static final O2 f35717a;

    static {
        int i = AbstractC4328e2.f35830a;
        f35717a = new O2();
    }

    public static void a(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    c4344i2.z(i, (intValue >> 31) ^ (intValue + intValue));
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += C4344i2.i((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                c4344i2.A((intValue3 >> 31) ^ (intValue3 + intValue3));
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                int c4 = c4372p2.c(i4);
                c4344i2.z(i, (c4 >> 31) ^ (c4 + c4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            int c9 = c4372p2.c(i12);
            i11 += C4344i2.i((c9 >> 31) ^ (c9 + c9));
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            int c10 = c4372p2.c(i4);
            c4344i2.A((c10 >> 31) ^ (c10 + c10));
            i4++;
        }
    }

    public static void b(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c4344i2.B(i, (longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += C4344i2.j((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c4344i2.C((longValue3 >> 63) ^ (longValue3 + longValue3));
            i4++;
        }
    }

    public static void c(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    c4344i2.z(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += C4344i2.i(((Integer) list.get(i10)).intValue());
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                c4344i2.A(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                c4344i2.z(i, c4372p2.c(i4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            i11 += C4344i2.i(c4372p2.c(i12));
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            c4344i2.A(c4372p2.c(i4));
            i4++;
        }
    }

    public static void d(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.B(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C4344i2.j(((Long) list.get(i10)).longValue());
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.C(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4372p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4344i2.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        int i9 = 0;
        while (i < size) {
            i9 += C4344i2.j(c4372p2.c(i));
            i++;
        }
        return i9;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C4344i2.i(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C4344i2.i(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4372p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4344i2.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        int i9 = 0;
        while (i < size) {
            i9 += C4344i2.j(c4372p2.c(i));
            i++;
        }
        return i9;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C4344i2.j(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4372p2)) {
            int i4 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i4 += C4344i2.i((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i4;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        int i9 = 0;
        while (i < size) {
            int c4 = c4372p2.c(i);
            i9 += C4344i2.i((c4 >> 31) ^ (c4 + c4));
            i++;
        }
        return i9;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i += C4344i2.j((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4372p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4344i2.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        int i9 = 0;
        while (i < size) {
            i9 += C4344i2.i(c4372p2.c(i));
            i++;
        }
        return i9;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C4344i2.j(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        AbstractC4368o2 abstractC4368o2 = (AbstractC4368o2) obj;
        N2 n22 = abstractC4368o2.zzc;
        N2 n23 = ((AbstractC4368o2) obj2).zzc;
        N2 n24 = N2.f35741e;
        if (!n24.equals(n23)) {
            if (n24.equals(n22)) {
                n22.getClass();
                n23.getClass();
                int[] copyOf = Arrays.copyOf(n22.f35742a, 0);
                System.arraycopy(n23.f35742a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(n22.f35743b, 0);
                System.arraycopy(n23.f35743b, 0, copyOf2, 0, 0);
                n22 = new N2(copyOf, copyOf2, true);
            } else {
                n22.getClass();
                if (!n23.equals(n24)) {
                    if (!n22.f35745d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = n22.f35742a;
                    int length = iArr.length;
                    System.arraycopy(n23.f35742a, 0, iArr, 0, 0);
                    System.arraycopy(n23.f35743b, 0, n22.f35743b, 0, 0);
                }
            }
        }
        abstractC4368o2.zzc = n22;
    }

    public static void p(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i4)).booleanValue();
                c4344i2.l(11);
                c4344i2.o(i << 3);
                int i9 = c4344i2.f35854e;
                c4344i2.f35852c[i9] = booleanValue;
                c4344i2.f35854e = i9 + 1;
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            i10++;
        }
        c4344i2.A(i10);
        while (i4 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i4)).booleanValue();
            if (c4344i2.f35854e == c4344i2.f35853d) {
                c4344i2.k();
            }
            int i12 = c4344i2.f35854e;
            c4344i2.f35852c[i12] = booleanValue2;
            c4344i2.f35854e = i12 + 1;
            i4++;
        }
    }

    public static void q(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.t(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.u(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void r(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    c4344i2.v(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += C4344i2.j(((Integer) list.get(i10)).intValue());
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                c4344i2.w(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                c4344i2.v(i, c4372p2.c(i4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            i11 += C4344i2.j(c4372p2.c(i12));
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            c4344i2.w(c4372p2.c(i4));
            i4++;
        }
    }

    public static void s(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    c4344i2.r(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                c4344i2.s(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                c4344i2.r(i, c4372p2.c(i4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            c4372p2.c(i12);
            i11 += 4;
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            c4344i2.s(c4372p2.c(i4));
            i4++;
        }
    }

    public static void t(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.t(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.u(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.r(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.s(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void v(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    c4344i2.v(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += C4344i2.j(((Integer) list.get(i10)).intValue());
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                c4344i2.w(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                c4344i2.v(i, c4372p2.c(i4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            i11 += C4344i2.j(c4372p2.c(i12));
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            c4344i2.w(c4372p2.c(i4));
            i4++;
        }
    }

    public static void w(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.B(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C4344i2.j(((Long) list.get(i10)).longValue());
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.C(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void x(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4399w2.getClass();
        boolean z9 = list instanceof C4372p2;
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    c4344i2.r(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4344i2.y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            c4344i2.A(i9);
            while (i4 < list.size()) {
                c4344i2.s(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4372p2 c4372p2 = (C4372p2) list;
        if (!z8) {
            while (i4 < c4372p2.f35898v) {
                c4344i2.r(i, c4372p2.c(i4));
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4372p2.f35898v; i12++) {
            c4372p2.c(i12);
            i11 += 4;
        }
        c4344i2.A(i11);
        while (i4 < c4372p2.f35898v) {
            c4344i2.s(c4372p2.c(i4));
            i4++;
        }
    }

    public static void y(int i, List list, C4399w2 c4399w2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4344i2 c4344i2 = (C4344i2) c4399w2.f35944u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                c4344i2.t(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4344i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        c4344i2.A(i9);
        while (i4 < list.size()) {
            c4344i2.u(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}
