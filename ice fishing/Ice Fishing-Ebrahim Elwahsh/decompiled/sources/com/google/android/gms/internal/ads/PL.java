package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class PL {

    /* renamed from: a, reason: collision with root package name */
    public static final T2 f26905a;

    static {
        int i = KK.f25952a;
        f26905a = new T2(6);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (XK.j(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (XK.j(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        AbstractC3199fL abstractC3199fL = (AbstractC3199fL) obj;
        XL xl = abstractC3199fL.zzt;
        XL xl2 = ((AbstractC3199fL) obj2).zzt;
        XL xl3 = XL.f28633f;
        if (!xl3.equals(xl2)) {
            if (xl3.equals(xl)) {
                int i = xl.f28634a + xl2.f28634a;
                int[] copyOf = Arrays.copyOf(xl.f28635b, i);
                System.arraycopy(xl2.f28635b, 0, copyOf, xl.f28634a, xl2.f28634a);
                Object[] copyOf2 = Arrays.copyOf(xl.f28636c, i);
                System.arraycopy(xl2.f28636c, 0, copyOf2, xl.f28634a, xl2.f28634a);
                xl = new XL(i, copyOf, copyOf2, true);
            } else {
                xl.getClass();
                if (!xl2.equals(xl3)) {
                    if (!xl.f28638e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = xl.f28634a + xl2.f28634a;
                    xl.e(i4);
                    System.arraycopy(xl2.f28635b, 0, xl.f28635b, xl.f28634a, xl2.f28634a);
                    System.arraycopy(xl2.f28636c, 0, xl.f28636c, xl.f28634a, xl2.f28634a);
                    xl.f28634a = i4;
                }
            }
        }
        abstractC3199fL.zzt = xl;
    }

    public static Object e(Object obj, int i, InterfaceC3630nL interfaceC3630nL, InterfaceC3362iL interfaceC3362iL, Object obj2, T2 t22) {
        if (interfaceC3362iL == null) {
            return obj2;
        }
        if (interfaceC3630nL == null) {
            Iterator it = interfaceC3630nL.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!interfaceC3362iL.a(intValue)) {
                    if (obj2 == null) {
                        t22.getClass();
                        obj2 = T2.B(obj);
                    }
                    t22.getClass();
                    ((XL) obj2).d(i << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC3630nL.size();
        int i4 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) interfaceC3630nL.get(i9);
            int intValue2 = num.intValue();
            if (interfaceC3362iL.a(intValue2)) {
                if (i9 != i4) {
                    interfaceC3630nL.set(i4, num);
                }
                i4++;
            } else {
                if (obj2 == null) {
                    t22.getClass();
                    obj2 = T2.B(obj);
                }
                t22.getClass();
                ((XL) obj2).d(i << 3, Long.valueOf(intValue2));
            }
        }
        if (i4 != size) {
            interfaceC3630nL.subList(i4, size).clear();
        }
        return obj2;
    }

    public static void f(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                xk.r(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        xk.A(i9);
        while (i4 < list.size()) {
            xk.D(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void g(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                xk.p(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        xk.A(i9);
        while (i4 < list.size()) {
            xk.B(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void h(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C4061vL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.q(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += XK.k(((Long) list.get(i10)).longValue());
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.C(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C4061vL c4061vL = (C4061vL) list;
        if (!z8) {
            while (i4 < c4061vL.f34757v) {
                xk.q(i, c4061vL.c(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4061vL.f34757v; i12++) {
            i11 += XK.k(c4061vL.c(i12));
        }
        xk.A(i11);
        while (i4 < c4061vL.f34757v) {
            xk.C(c4061vL.c(i4));
            i4++;
        }
    }

    public static void i(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C4061vL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.q(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += XK.k(((Long) list.get(i10)).longValue());
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.C(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C4061vL c4061vL = (C4061vL) list;
        if (!z8) {
            while (i4 < c4061vL.f34757v) {
                xk.q(i, c4061vL.c(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4061vL.f34757v; i12++) {
            i11 += XK.k(c4061vL.c(i12));
        }
        xk.A(i11);
        while (i4 < c4061vL.f34757v) {
            xk.C(c4061vL.c(i4));
            i4++;
        }
    }

    public static void j(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C4061vL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    xk.q(i, (longValue >> 63) ^ (longValue + longValue));
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += XK.k((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            xk.A(i9);
            while (i4 < list.size()) {
                long longValue3 = ((Long) list.get(i4)).longValue();
                xk.C((longValue3 >> 63) ^ (longValue3 + longValue3));
                i4++;
            }
            return;
        }
        C4061vL c4061vL = (C4061vL) list;
        if (!z8) {
            while (i4 < c4061vL.f34757v) {
                long c4 = c4061vL.c(i4);
                xk.q(i, (c4 >> 63) ^ (c4 + c4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4061vL.f34757v; i12++) {
            long c9 = c4061vL.c(i12);
            i11 += XK.k((c9 >> 63) ^ (c9 + c9));
        }
        xk.A(i11);
        while (i4 < c4061vL.f34757v) {
            long c10 = c4061vL.c(i4);
            xk.C((c10 >> 63) ^ (c10 + c10));
            i4++;
        }
    }

    public static void k(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C4061vL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.r(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.D(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C4061vL c4061vL = (C4061vL) list;
        if (!z8) {
            while (i4 < c4061vL.f34757v) {
                xk.r(i, c4061vL.c(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4061vL.f34757v; i12++) {
            c4061vL.c(i12);
            i11 += 8;
        }
        xk.A(i11);
        while (i4 < c4061vL.f34757v) {
            xk.D(c4061vL.c(i4));
            i4++;
        }
    }

    public static void l(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C4061vL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.r(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.D(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C4061vL c4061vL = (C4061vL) list;
        if (!z8) {
            while (i4 < c4061vL.f34757v) {
                xk.r(i, c4061vL.c(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c4061vL.f34757v; i12++) {
            c4061vL.c(i12);
            i11 += 8;
        }
        xk.A(i11);
        while (i4 < c4061vL.f34757v) {
            xk.D(c4061vL.c(i4));
            i4++;
        }
    }

    public static void m(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.n(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += XK.k(((Integer) list.get(i10)).intValue());
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.z(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                xk.n(i, c3254gL.d(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            i11 += XK.k(c3254gL.d(i12));
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            xk.z(c3254gL.d(i4));
            i4++;
        }
    }

    public static void n(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.o(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += XK.j(((Integer) list.get(i10)).intValue());
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.A(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                xk.o(i, c3254gL.d(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            i11 += XK.j(c3254gL.d(i12));
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            xk.A(c3254gL.d(i4));
            i4++;
        }
    }

    public static void o(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    xk.o(i, (intValue >> 31) ^ (intValue + intValue));
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += XK.j((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            xk.A(i9);
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                xk.A((intValue3 >> 31) ^ (intValue3 + intValue3));
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                int d2 = c3254gL.d(i4);
                xk.o(i, (d2 >> 31) ^ (d2 + d2));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            int d3 = c3254gL.d(i12);
            i11 += XK.j((d3 >> 31) ^ (d3 + d3));
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            int d9 = c3254gL.d(i4);
            xk.A((d9 >> 31) ^ (d9 + d9));
            i4++;
        }
    }

    public static void p(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.p(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.B(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                xk.p(i, c3254gL.d(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            c3254gL.d(i12);
            i11 += 4;
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            xk.B(c3254gL.d(i4));
            i4++;
        }
    }

    public static void q(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.p(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.B(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                xk.p(i, c3254gL.d(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            c3254gL.d(i12);
            i11 += 4;
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            xk.B(c3254gL.d(i4));
            i4++;
        }
    }

    public static void r(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2478Aq.getClass();
        boolean z9 = list instanceof C3254gL;
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z9) {
            if (!z8) {
                while (i4 < list.size()) {
                    xk.n(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            xk.m(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += XK.k(((Integer) list.get(i10)).intValue());
            }
            xk.A(i9);
            while (i4 < list.size()) {
                xk.z(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C3254gL c3254gL = (C3254gL) list;
        if (!z8) {
            while (i4 < c3254gL.f30991v) {
                xk.n(i, c3254gL.d(i4));
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3254gL.f30991v; i12++) {
            i11 += XK.k(c3254gL.d(i12));
        }
        xk.A(i11);
        while (i4 < c3254gL.f30991v) {
            xk.z(c3254gL.d(i4));
            i4++;
        }
    }

    public static void s(int i, List list, C2478Aq c2478Aq, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        XK xk = (XK) c2478Aq.f23905u;
        int i4 = 0;
        if (!z8) {
            while (i4 < list.size()) {
                xk.s(i, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        xk.m(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        xk.A(i9);
        while (i4 < list.size()) {
            xk.y(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4061vL)) {
            int i4 = 0;
            while (i < size) {
                i4 += XK.k(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        C4061vL c4061vL = (C4061vL) list;
        int i9 = 0;
        while (i < size) {
            i9 += XK.k(c4061vL.c(i));
            i++;
        }
        return i9;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4061vL)) {
            int i4 = 0;
            while (i < size) {
                i4 += XK.k(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        C4061vL c4061vL = (C4061vL) list;
        int i9 = 0;
        while (i < size) {
            i9 += XK.k(c4061vL.c(i));
            i++;
        }
        return i9;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4061vL)) {
            int i4 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i4 += XK.k((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i4;
        }
        C4061vL c4061vL = (C4061vL) list;
        int i9 = 0;
        while (i < size) {
            long c4 = c4061vL.c(i);
            i9 += XK.k((c4 >> 63) ^ (c4 + c4));
            i++;
        }
        return i9;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3254gL)) {
            int i4 = 0;
            while (i < size) {
                i4 += XK.k(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C3254gL c3254gL = (C3254gL) list;
        int i9 = 0;
        while (i < size) {
            i9 += XK.k(c3254gL.d(i));
            i++;
        }
        return i9;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3254gL)) {
            int i4 = 0;
            while (i < size) {
                i4 += XK.k(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C3254gL c3254gL = (C3254gL) list;
        int i9 = 0;
        while (i < size) {
            i9 += XK.k(c3254gL.d(i));
            i++;
        }
        return i9;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3254gL)) {
            int i4 = 0;
            while (i < size) {
                i4 += XK.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        C3254gL c3254gL = (C3254gL) list;
        int i9 = 0;
        while (i < size) {
            i9 += XK.j(c3254gL.d(i));
            i++;
        }
        return i9;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3254gL)) {
            int i4 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i4 += XK.j((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i4;
        }
        C3254gL c3254gL = (C3254gL) list;
        int i9 = 0;
        while (i < size) {
            int d2 = c3254gL.d(i);
            i9 += XK.j((d2 >> 31) ^ (d2 + d2));
            i++;
        }
        return i9;
    }
}
