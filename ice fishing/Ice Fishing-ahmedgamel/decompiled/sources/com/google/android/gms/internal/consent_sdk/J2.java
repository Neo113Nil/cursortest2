package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class J2 {

    /* renamed from: a, reason: collision with root package name */
    public static final O2 f36323a;

    static {
        int i = AbstractC4338e2.f36436a;
        f36323a = new O2();
    }

    public static void a(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    c4354i2.z(i, (intValue >> 31) ^ (intValue + intValue));
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int intValue2 = ((Integer) list.get(i9)).intValue();
                i6 += C4354i2.i((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                c4354i2.A((intValue3 >> 31) ^ (intValue3 + intValue3));
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                int c9 = c4382p2.c(i4);
                c4354i2.z(i, (c9 >> 31) ^ (c9 + c9));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            int c10 = c4382p2.c(i11);
            i10 += C4354i2.i((c10 >> 31) ^ (c10 + c10));
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            int c11 = c4382p2.c(i4);
            c4354i2.A((c11 >> 31) ^ (c11 + c11));
            i4++;
        }
    }

    public static void b(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c4354i2.B(i, (longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long longValue2 = ((Long) list.get(i9)).longValue();
            i6 += C4354i2.j((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c4354i2.C((longValue3 >> 63) ^ (longValue3 + longValue3));
            i4++;
        }
    }

    public static void c(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    c4354i2.z(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += C4354i2.i(((Integer) list.get(i9)).intValue());
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                c4354i2.A(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                c4354i2.z(i, c4382p2.c(i4));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            i10 += C4354i2.i(c4382p2.c(i11));
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            c4354i2.A(c4382p2.c(i4));
            i4++;
        }
    }

    public static void d(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.B(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i6 += C4354i2.j(((Long) list.get(i9)).longValue());
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.C(((Long) list.get(i4)).longValue());
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
        if (!(list instanceof C4382p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4354i2.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        int i6 = 0;
        while (i < size) {
            i6 += C4354i2.j(c4382p2.c(i));
            i++;
        }
        return i6;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C4354i2.i(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C4354i2.i(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4382p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4354i2.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        int i6 = 0;
        while (i < size) {
            i6 += C4354i2.j(c4382p2.c(i));
            i++;
        }
        return i6;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C4354i2.j(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4382p2)) {
            int i4 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i4 += C4354i2.i((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i4;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        int i6 = 0;
        while (i < size) {
            int c9 = c4382p2.c(i);
            i6 += C4354i2.i((c9 >> 31) ^ (c9 + c9));
            i++;
        }
        return i6;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i += C4354i2.j((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4382p2)) {
            int i4 = 0;
            while (i < size) {
                i4 += C4354i2.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        int i6 = 0;
        while (i < size) {
            i6 += C4354i2.i(c4382p2.c(i));
            i++;
        }
        return i6;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += C4354i2.j(((Long) list.get(i4)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        AbstractC4378o2 abstractC4378o2 = (AbstractC4378o2) obj;
        N2 n22 = abstractC4378o2.zzc;
        N2 n23 = ((AbstractC4378o2) obj2).zzc;
        N2 n24 = N2.f36347e;
        if (!n24.equals(n23)) {
            if (n24.equals(n22)) {
                n22.getClass();
                n23.getClass();
                int[] copyOf = Arrays.copyOf(n22.f36348a, 0);
                System.arraycopy(n23.f36348a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(n22.f36349b, 0);
                System.arraycopy(n23.f36349b, 0, copyOf2, 0, 0);
                n22 = new N2(copyOf, copyOf2, true);
            } else {
                n22.getClass();
                if (!n23.equals(n24)) {
                    if (!n22.f36351d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = n22.f36348a;
                    int length = iArr.length;
                    System.arraycopy(n23.f36348a, 0, iArr, 0, 0);
                    System.arraycopy(n23.f36349b, 0, n22.f36349b, 0, 0);
                }
            }
        }
        abstractC4378o2.zzc = n22;
    }

    public static void p(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i4)).booleanValue();
                c4354i2.l(11);
                c4354i2.o(i << 3);
                int i6 = c4354i2.f36460e;
                c4354i2.f36458c[i6] = booleanValue;
                c4354i2.f36460e = i6 + 1;
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        c4354i2.A(i9);
        while (i4 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i4)).booleanValue();
            if (c4354i2.f36460e == c4354i2.f36459d) {
                c4354i2.k();
            }
            int i11 = c4354i2.f36460e;
            c4354i2.f36458c[i11] = booleanValue2;
            c4354i2.f36460e = i11 + 1;
            i4++;
        }
    }

    public static void q(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.t(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            i6 += 8;
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.u(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void r(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    c4354i2.v(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += C4354i2.j(((Integer) list.get(i9)).intValue());
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                c4354i2.w(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                c4354i2.v(i, c4382p2.c(i4));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            i10 += C4354i2.j(c4382p2.c(i11));
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            c4354i2.w(c4382p2.c(i4));
            i4++;
        }
    }

    public static void s(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    c4354i2.r(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i6 += 4;
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                c4354i2.s(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                c4354i2.r(i, c4382p2.c(i4));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            c4382p2.c(i11);
            i10 += 4;
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            c4354i2.s(c4382p2.c(i4));
            i4++;
        }
    }

    public static void t(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.t(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            i6 += 8;
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.u(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.r(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            i6 += 4;
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.s(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void v(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    c4354i2.v(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += C4354i2.j(((Integer) list.get(i9)).intValue());
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                c4354i2.w(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                c4354i2.v(i, c4382p2.c(i4));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            i10 += C4354i2.j(c4382p2.c(i11));
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            c4354i2.w(c4382p2.c(i4));
            i4++;
        }
    }

    public static void w(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.B(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i6 += C4354i2.j(((Long) list.get(i9)).longValue());
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.C(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void x(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4409w2.getClass();
        boolean z9 = list instanceof C4382p2;
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    c4354i2.r(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            c4354i2.y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i6 += 4;
            }
            c4354i2.A(i6);
            while (i4 < list.size()) {
                c4354i2.s(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C4382p2 c4382p2 = (C4382p2) list;
        if (!z6) {
            while (i4 < c4382p2.f36504v) {
                c4354i2.r(i, c4382p2.c(i4));
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c4382p2.f36504v; i11++) {
            c4382p2.c(i11);
            i10 += 4;
        }
        c4354i2.A(i10);
        while (i4 < c4382p2.f36504v) {
            c4354i2.s(c4382p2.c(i4));
            i4++;
        }
    }

    public static void y(int i, List list, C4409w2 c4409w2, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4354i2 c4354i2 = (C4354i2) c4409w2.f36550u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                c4354i2.t(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c4354i2.y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            i6 += 8;
        }
        c4354i2.A(i6);
        while (i4 < list.size()) {
            c4354i2.u(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}
