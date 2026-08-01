package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class EL {

    /* renamed from: a, reason: collision with root package name */
    public static final V2 f24582a;

    static {
        int i = BK.f23877a;
        f24582a = new V2(6);
    }

    public static int A(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof WK)) {
            int i6 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i6 += OK.S((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i6;
        }
        WK wk = (WK) list;
        int i9 = 0;
        while (i < size) {
            int d2 = wk.d(i);
            i9 += OK.S((d2 >> 31) ^ (d2 + d2));
            i++;
        }
        return i9;
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OK.S(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OK.S(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        VK vk = (VK) obj;
        LL ll = vk.zzt;
        LL ll2 = ((VK) obj2).zzt;
        LL ll3 = LL.f26106f;
        if (!ll3.equals(ll2)) {
            if (ll3.equals(ll)) {
                int i = ll.f26107a + ll2.f26107a;
                int[] copyOf = Arrays.copyOf(ll.f26108b, i);
                System.arraycopy(ll2.f26108b, 0, copyOf, ll.f26107a, ll2.f26107a);
                Object[] copyOf2 = Arrays.copyOf(ll.f26109c, i);
                System.arraycopy(ll2.f26109c, 0, copyOf2, ll.f26107a, ll2.f26107a);
                ll = new LL(i, copyOf, copyOf2, true);
            } else {
                ll.getClass();
                if (!ll2.equals(ll3)) {
                    if (!ll.f26111e) {
                        throw new UnsupportedOperationException();
                    }
                    int i6 = ll.f26107a + ll2.f26107a;
                    ll.e(i6);
                    System.arraycopy(ll2.f26108b, 0, ll.f26108b, ll.f26107a, ll2.f26107a);
                    System.arraycopy(ll2.f26109c, 0, ll.f26109c, ll.f26107a, ll2.f26107a);
                    ll.f26107a = i6;
                }
            }
        }
        vk.zzt = ll;
    }

    public static Object e(Object obj, int i, InterfaceC3026cL interfaceC3026cL, YK yk, Object obj2) {
        if (yk == null) {
            return obj2;
        }
        if (interfaceC3026cL == null) {
            Iterator it = interfaceC3026cL.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!yk.a(intValue)) {
                    obj2 = f(i, intValue, obj, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC3026cL.size();
        int i6 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) interfaceC3026cL.get(i9);
            int intValue2 = num.intValue();
            if (yk.a(intValue2)) {
                if (i9 != i6) {
                    interfaceC3026cL.set(i6, num);
                }
                i6++;
            } else {
                obj2 = f(i, intValue2, obj, obj2);
            }
        }
        if (i6 != size) {
            interfaceC3026cL.subList(i6, size).clear();
        }
        return obj2;
    }

    public static Object f(int i, int i6, Object obj, Object obj2) {
        if (obj2 == null) {
            obj2 = V2.A(obj);
        }
        ((LL) obj2).d(i << 3, Long.valueOf(i6));
        return obj2;
    }

    public static void g(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z3) {
            while (i6 < list.size()) {
                ok.s1(i, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        ok.I1(i9);
        while (i6 < list.size()) {
            ok.O1(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
            i6++;
        }
    }

    public static void h(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z3) {
            while (i6 < list.size()) {
                ok.p1(i, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        ok.I1(i9);
        while (i6 < list.size()) {
            ok.K1(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
            i6++;
        }
    }

    public static void i(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof C3509lL;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.q1(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += OK.T(((Long) list.get(i10)).longValue());
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.N1(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        C3509lL c3509lL = (C3509lL) list;
        if (!z3) {
            while (i6 < c3509lL.f31761v) {
                ok.q1(i, c3509lL.c(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3509lL.f31761v; i12++) {
            i11 += OK.T(c3509lL.c(i12));
        }
        ok.I1(i11);
        while (i6 < c3509lL.f31761v) {
            ok.N1(c3509lL.c(i6));
            i6++;
        }
    }

    public static void j(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof C3509lL;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.q1(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += OK.T(((Long) list.get(i10)).longValue());
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.N1(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        C3509lL c3509lL = (C3509lL) list;
        if (!z3) {
            while (i6 < c3509lL.f31761v) {
                ok.q1(i, c3509lL.c(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3509lL.f31761v; i12++) {
            i11 += OK.T(c3509lL.c(i12));
        }
        ok.I1(i11);
        while (i6 < c3509lL.f31761v) {
            ok.N1(c3509lL.c(i6));
            i6++;
        }
    }

    public static void k(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof C3509lL;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    ok.q1(i, (longValue >> 63) ^ (longValue + longValue));
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += OK.T((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                long longValue3 = ((Long) list.get(i6)).longValue();
                ok.N1((longValue3 >> 63) ^ (longValue3 + longValue3));
                i6++;
            }
            return;
        }
        C3509lL c3509lL = (C3509lL) list;
        if (!z3) {
            while (i6 < c3509lL.f31761v) {
                long c9 = c3509lL.c(i6);
                ok.q1(i, (c9 >> 63) ^ (c9 + c9));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3509lL.f31761v; i12++) {
            long c10 = c3509lL.c(i12);
            i11 += OK.T((c10 >> 63) ^ (c10 + c10));
        }
        ok.I1(i11);
        while (i6 < c3509lL.f31761v) {
            long c11 = c3509lL.c(i6);
            ok.N1((c11 >> 63) ^ (c11 + c11));
            i6++;
        }
    }

    public static void l(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof C3509lL;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.s1(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.O1(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        C3509lL c3509lL = (C3509lL) list;
        if (!z3) {
            while (i6 < c3509lL.f31761v) {
                ok.s1(i, c3509lL.c(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3509lL.f31761v; i12++) {
            c3509lL.c(i12);
            i11 += 8;
        }
        ok.I1(i11);
        while (i6 < c3509lL.f31761v) {
            ok.O1(c3509lL.c(i6));
            i6++;
        }
    }

    public static void m(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof C3509lL;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.s1(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.O1(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        C3509lL c3509lL = (C3509lL) list;
        if (!z3) {
            while (i6 < c3509lL.f31761v) {
                ok.s1(i, c3509lL.c(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c3509lL.f31761v; i12++) {
            c3509lL.c(i12);
            i11 += 8;
        }
        ok.I1(i11);
        while (i6 < c3509lL.f31761v) {
            ok.O1(c3509lL.c(i6));
            i6++;
        }
    }

    public static void n(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.b0(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += OK.T(((Integer) list.get(i10)).intValue());
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.G1(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                ok.b0(i, wk.d(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            i11 += OK.T(wk.d(i12));
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            ok.G1(wk.d(i6));
            i6++;
        }
    }

    public static void o(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.e0(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += OK.S(((Integer) list.get(i10)).intValue());
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.I1(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                ok.e0(i, wk.d(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            i11 += OK.S(wk.d(i12));
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            ok.I1(wk.d(i6));
            i6++;
        }
    }

    public static void p(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    ok.e0(i, (intValue >> 31) ^ (intValue + intValue));
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                int intValue3 = ((Integer) list.get(i6)).intValue();
                ok.I1((intValue3 >> 31) ^ (intValue3 + intValue3));
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                int d2 = wk.d(i6);
                ok.e0(i, (d2 >> 31) ^ (d2 + d2));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            int d9 = wk.d(i12);
            i11 += OK.S((d9 >> 31) ^ (d9 + d9));
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            int d10 = wk.d(i6);
            ok.I1((d10 >> 31) ^ (d10 + d10));
            i6++;
        }
    }

    public static void q(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.p1(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.K1(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                ok.p1(i, wk.d(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            wk.d(i12);
            i11 += 4;
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            ok.K1(wk.d(i6));
            i6++;
        }
    }

    public static void r(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.p1(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.K1(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                ok.p1(i, wk.d(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            wk.d(i12);
            i11 += 4;
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            ok.K1(wk.d(i6));
            i6++;
        }
    }

    public static void s(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4178xq.getClass();
        boolean z6 = list instanceof WK;
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z6) {
            if (!z3) {
                while (i6 < list.size()) {
                    ok.b0(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            ok.Y(i, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += OK.T(((Integer) list.get(i10)).intValue());
            }
            ok.I1(i9);
            while (i6 < list.size()) {
                ok.G1(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z3) {
            while (i6 < wk.f28350v) {
                ok.b0(i, wk.d(i6));
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < wk.f28350v; i12++) {
            i11 += OK.T(wk.d(i12));
        }
        ok.I1(i11);
        while (i6 < wk.f28350v) {
            ok.G1(wk.d(i6));
            i6++;
        }
    }

    public static void t(int i, List list, C4178xq c4178xq, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4178xq.f35055u;
        int i6 = 0;
        if (!z3) {
            while (i6 < list.size()) {
                ok.v1(i, ((Boolean) list.get(i6)).booleanValue());
                i6++;
            }
            return;
        }
        ok.Y(i, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        ok.I1(i9);
        while (i6 < list.size()) {
            ok.E1(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3509lL)) {
            int i6 = 0;
            while (i < size) {
                i6 += OK.T(((Long) list.get(i)).longValue());
                i++;
            }
            return i6;
        }
        C3509lL c3509lL = (C3509lL) list;
        int i9 = 0;
        while (i < size) {
            i9 += OK.T(c3509lL.c(i));
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
        if (!(list instanceof C3509lL)) {
            int i6 = 0;
            while (i < size) {
                i6 += OK.T(((Long) list.get(i)).longValue());
                i++;
            }
            return i6;
        }
        C3509lL c3509lL = (C3509lL) list;
        int i9 = 0;
        while (i < size) {
            i9 += OK.T(c3509lL.c(i));
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
        if (!(list instanceof C3509lL)) {
            int i6 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i6 += OK.T((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i6;
        }
        C3509lL c3509lL = (C3509lL) list;
        int i9 = 0;
        while (i < size) {
            long c9 = c3509lL.c(i);
            i9 += OK.T((c9 >> 63) ^ (c9 + c9));
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
        if (!(list instanceof WK)) {
            int i6 = 0;
            while (i < size) {
                i6 += OK.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return i6;
        }
        WK wk = (WK) list;
        int i9 = 0;
        while (i < size) {
            i9 += OK.T(wk.d(i));
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
        if (!(list instanceof WK)) {
            int i6 = 0;
            while (i < size) {
                i6 += OK.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return i6;
        }
        WK wk = (WK) list;
        int i9 = 0;
        while (i < size) {
            i9 += OK.T(wk.d(i));
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
        if (!(list instanceof WK)) {
            int i6 = 0;
            while (i < size) {
                i6 += OK.S(((Integer) list.get(i)).intValue());
                i++;
            }
            return i6;
        }
        WK wk = (WK) list;
        int i9 = 0;
        while (i < size) {
            i9 += OK.S(wk.d(i));
            i++;
        }
        return i9;
    }
}
