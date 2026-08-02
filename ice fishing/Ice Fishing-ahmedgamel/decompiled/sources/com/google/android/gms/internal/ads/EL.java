package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class EL {

    /* renamed from: a, reason: collision with root package name */
    public static final V2 f25343a;

    static {
        int i = BK.f24648a;
        f25343a = new V2(6);
    }

    public static int A(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof WK)) {
            int i4 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i4 += OK.S((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i4;
        }
        WK wk = (WK) list;
        int i6 = 0;
        while (i < size) {
            int d9 = wk.d(i);
            i6 += OK.S((d9 >> 31) ^ (d9 + d9));
            i++;
        }
        return i6;
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
        LL ll3 = LL.f26906f;
        if (!ll3.equals(ll2)) {
            if (ll3.equals(ll)) {
                int i = ll.f26907a + ll2.f26907a;
                int[] copyOf = Arrays.copyOf(ll.f26908b, i);
                System.arraycopy(ll2.f26908b, 0, copyOf, ll.f26907a, ll2.f26907a);
                Object[] copyOf2 = Arrays.copyOf(ll.f26909c, i);
                System.arraycopy(ll2.f26909c, 0, copyOf2, ll.f26907a, ll2.f26907a);
                ll = new LL(i, copyOf, copyOf2, true);
            } else {
                ll.getClass();
                if (!ll2.equals(ll3)) {
                    if (!ll.f26911e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = ll.f26907a + ll2.f26907a;
                    ll.e(i4);
                    System.arraycopy(ll2.f26908b, 0, ll.f26908b, ll.f26907a, ll2.f26907a);
                    System.arraycopy(ll2.f26909c, 0, ll.f26909c, ll.f26907a, ll2.f26907a);
                    ll.f26907a = i4;
                }
            }
        }
        vk.zzt = ll;
    }

    public static Object e(Object obj, int i, InterfaceC3049cL interfaceC3049cL, YK yk, Object obj2) {
        if (yk == null) {
            return obj2;
        }
        if (interfaceC3049cL == null) {
            Iterator it = interfaceC3049cL.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!yk.a(intValue)) {
                    obj2 = f(i, intValue, obj, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC3049cL.size();
        int i4 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) interfaceC3049cL.get(i6);
            int intValue2 = num.intValue();
            if (yk.a(intValue2)) {
                if (i6 != i4) {
                    interfaceC3049cL.set(i4, num);
                }
                i4++;
            } else {
                obj2 = f(i, intValue2, obj, obj2);
            }
        }
        if (i4 != size) {
            interfaceC3049cL.subList(i4, size).clear();
        }
        return obj2;
    }

    public static Object f(int i, int i4, Object obj, Object obj2) {
        if (obj2 == null) {
            obj2 = V2.A(obj);
        }
        ((LL) obj2).d(i << 3, Long.valueOf(i4));
        return obj2;
    }

    public static void g(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                ok.t1(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            i6 += 8;
        }
        ok.J1(i6);
        while (i4 < list.size()) {
            ok.O1(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void h(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                ok.p1(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            i6 += 4;
        }
        ok.J1(i6);
        while (i4 < list.size()) {
            ok.L1(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void i(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof C3532lL;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.q1(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += OK.T(((Long) list.get(i9)).longValue());
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.N1(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C3532lL c3532lL = (C3532lL) list;
        if (!z6) {
            while (i4 < c3532lL.f32541v) {
                ok.q1(i, c3532lL.c(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c3532lL.f32541v; i11++) {
            i10 += OK.T(c3532lL.c(i11));
        }
        ok.J1(i10);
        while (i4 < c3532lL.f32541v) {
            ok.N1(c3532lL.c(i4));
            i4++;
        }
    }

    public static void j(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof C3532lL;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.q1(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += OK.T(((Long) list.get(i9)).longValue());
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.N1(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C3532lL c3532lL = (C3532lL) list;
        if (!z6) {
            while (i4 < c3532lL.f32541v) {
                ok.q1(i, c3532lL.c(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c3532lL.f32541v; i11++) {
            i10 += OK.T(c3532lL.c(i11));
        }
        ok.J1(i10);
        while (i4 < c3532lL.f32541v) {
            ok.N1(c3532lL.c(i4));
            i4++;
        }
    }

    public static void k(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof C3532lL;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    ok.q1(i, (longValue >> 63) ^ (longValue + longValue));
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long longValue2 = ((Long) list.get(i9)).longValue();
                i6 += OK.T((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                long longValue3 = ((Long) list.get(i4)).longValue();
                ok.N1((longValue3 >> 63) ^ (longValue3 + longValue3));
                i4++;
            }
            return;
        }
        C3532lL c3532lL = (C3532lL) list;
        if (!z6) {
            while (i4 < c3532lL.f32541v) {
                long c9 = c3532lL.c(i4);
                ok.q1(i, (c9 >> 63) ^ (c9 + c9));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c3532lL.f32541v; i11++) {
            long c10 = c3532lL.c(i11);
            i10 += OK.T((c10 >> 63) ^ (c10 + c10));
        }
        ok.J1(i10);
        while (i4 < c3532lL.f32541v) {
            long c11 = c3532lL.c(i4);
            ok.N1((c11 >> 63) ^ (c11 + c11));
            i4++;
        }
    }

    public static void l(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof C3532lL;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.t1(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i6 += 8;
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.O1(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C3532lL c3532lL = (C3532lL) list;
        if (!z6) {
            while (i4 < c3532lL.f32541v) {
                ok.t1(i, c3532lL.c(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c3532lL.f32541v; i11++) {
            c3532lL.c(i11);
            i10 += 8;
        }
        ok.J1(i10);
        while (i4 < c3532lL.f32541v) {
            ok.O1(c3532lL.c(i4));
            i4++;
        }
    }

    public static void m(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof C3532lL;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.t1(i, ((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i6 += 8;
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.O1(((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        C3532lL c3532lL = (C3532lL) list;
        if (!z6) {
            while (i4 < c3532lL.f32541v) {
                ok.t1(i, c3532lL.c(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c3532lL.f32541v; i11++) {
            c3532lL.c(i11);
            i10 += 8;
        }
        ok.J1(i10);
        while (i4 < c3532lL.f32541v) {
            ok.O1(c3532lL.c(i4));
            i4++;
        }
    }

    public static void n(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.b0(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += OK.T(((Integer) list.get(i9)).intValue());
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.H1(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                ok.b0(i, wk.d(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            i10 += OK.T(wk.d(i11));
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            ok.H1(wk.d(i4));
            i4++;
        }
    }

    public static void o(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.e0(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += OK.S(((Integer) list.get(i9)).intValue());
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.J1(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                ok.e0(i, wk.d(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            i10 += OK.S(wk.d(i11));
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            ok.J1(wk.d(i4));
            i4++;
        }
    }

    public static void p(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    ok.e0(i, (intValue >> 31) ^ (intValue + intValue));
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int intValue2 = ((Integer) list.get(i9)).intValue();
                i6 += OK.S((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                ok.J1((intValue3 >> 31) ^ (intValue3 + intValue3));
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                int d9 = wk.d(i4);
                ok.e0(i, (d9 >> 31) ^ (d9 + d9));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            int d10 = wk.d(i11);
            i10 += OK.S((d10 >> 31) ^ (d10 + d10));
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            int d11 = wk.d(i4);
            ok.J1((d11 >> 31) ^ (d11 + d11));
            i4++;
        }
    }

    public static void q(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.p1(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i6 += 4;
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.L1(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                ok.p1(i, wk.d(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            wk.d(i11);
            i10 += 4;
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            ok.L1(wk.d(i4));
            i4++;
        }
    }

    public static void r(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.p1(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i6 += 4;
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.L1(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                ok.p1(i, wk.d(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            wk.d(i11);
            i10 += 4;
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            ok.L1(wk.d(i4));
            i4++;
        }
    }

    public static void s(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4201xq.getClass();
        boolean z9 = list instanceof WK;
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z9) {
            if (!z6) {
                while (i4 < list.size()) {
                    ok.b0(i, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            ok.Y(i, 2);
            int i6 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i6 += OK.T(((Integer) list.get(i9)).intValue());
            }
            ok.J1(i6);
            while (i4 < list.size()) {
                ok.H1(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        WK wk = (WK) list;
        if (!z6) {
            while (i4 < wk.f29148v) {
                ok.b0(i, wk.d(i4));
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < wk.f29148v; i11++) {
            i10 += OK.T(wk.d(i11));
        }
        ok.J1(i10);
        while (i4 < wk.f29148v) {
            ok.H1(wk.d(i4));
            i4++;
        }
    }

    public static void t(int i, List list, C4201xq c4201xq, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        OK ok = (OK) c4201xq.f35841u;
        int i4 = 0;
        if (!z6) {
            while (i4 < list.size()) {
                ok.v1(i, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        ok.Y(i, 2);
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i6++;
        }
        ok.J1(i6);
        while (i4 < list.size()) {
            ok.E1(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3532lL)) {
            int i4 = 0;
            while (i < size) {
                i4 += OK.T(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        C3532lL c3532lL = (C3532lL) list;
        int i6 = 0;
        while (i < size) {
            i6 += OK.T(c3532lL.c(i));
            i++;
        }
        return i6;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3532lL)) {
            int i4 = 0;
            while (i < size) {
                i4 += OK.T(((Long) list.get(i)).longValue());
                i++;
            }
            return i4;
        }
        C3532lL c3532lL = (C3532lL) list;
        int i6 = 0;
        while (i < size) {
            i6 += OK.T(c3532lL.c(i));
            i++;
        }
        return i6;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3532lL)) {
            int i4 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i4 += OK.T((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i4;
        }
        C3532lL c3532lL = (C3532lL) list;
        int i6 = 0;
        while (i < size) {
            long c9 = c3532lL.c(i);
            i6 += OK.T((c9 >> 63) ^ (c9 + c9));
            i++;
        }
        return i6;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof WK)) {
            int i4 = 0;
            while (i < size) {
                i4 += OK.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        WK wk = (WK) list;
        int i6 = 0;
        while (i < size) {
            i6 += OK.T(wk.d(i));
            i++;
        }
        return i6;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof WK)) {
            int i4 = 0;
            while (i < size) {
                i4 += OK.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        WK wk = (WK) list;
        int i6 = 0;
        while (i < size) {
            i6 += OK.T(wk.d(i));
            i++;
        }
        return i6;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof WK)) {
            int i4 = 0;
            while (i < size) {
                i4 += OK.S(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        WK wk = (WK) list;
        int i6 = 0;
        while (i < size) {
            i6 += OK.S(wk.d(i));
            i++;
        }
        return i6;
    }
}
