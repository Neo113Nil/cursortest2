package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class auo {
    public static final Class a;
    public static final nkt b;
    public static final nkt c;

    static {
        Class<?> cls;
        Class<?> cls2;
        yym yymVar = yym.c;
        nkt nktVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            yym yymVar2 = yym.c;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                nktVar = (nkt) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = nktVar;
        c = new nkt();
    }

    public static void A(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qug;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.B(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.g(((Long) list.get(i4)).longValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.C(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qug qugVar = (qug) list;
        if (!z) {
            while (i2 < qugVar.c) {
                yr4Var.B(i, qugVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qugVar.c; i6++) {
            i5 += yr4.g(qugVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < qugVar.c) {
            yr4Var.C(qugVar.n(i2));
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ipe)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ipe ipeVar = (ipe) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.g(ipeVar.n(i));
            i++;
        }
        return i3;
    }

    public static int b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yr4.e(i) + 4) * size;
    }

    public static int c(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yr4.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ipe)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ipe ipeVar = (ipe) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.g(ipeVar.n(i));
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qug)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.g(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qug qugVar = (qug) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.g(qugVar.n(i));
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ipe)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ipe ipeVar = (ipe) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.b(ipeVar.n(i));
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qug)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.c(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qug qugVar = (qug) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.c(qugVar.n(i));
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ipe)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ipe ipeVar = (ipe) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.f(ipeVar.n(i));
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qug)) {
            int i2 = 0;
            while (i < size) {
                i2 += yr4.g(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qug qugVar = (qug) list;
        int i3 = 0;
        while (i < size) {
            i3 += yr4.g(qugVar.n(i));
            i++;
        }
        return i3;
    }

    public static Object j(Object obj, int i, rse rseVar, kse kseVar, Object obj2, nkt nktVar) {
        if (kseVar == null) {
            return obj2;
        }
        if (rseVar == null) {
            Iterator it = rseVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!kseVar.a(intValue)) {
                    obj2 = m(obj, i, intValue, obj2, nktVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = rseVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) rseVar.get(i3);
            int intValue2 = num.intValue();
            if (kseVar.a(intValue2)) {
                if (i3 != i2) {
                    rseVar.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, intValue2, obj2, nktVar);
            }
        }
        if (i2 != size) {
            rseVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void k(nkt nktVar, Object obj, Object obj2) {
        nktVar.getClass();
        o3d o3dVar = (o3d) obj;
        lkt lktVar = o3dVar.unknownFields;
        lkt lktVar2 = ((o3d) obj2).unknownFields;
        lkt lktVar3 = lkt.f;
        if (!lktVar3.equals(lktVar2)) {
            if (lktVar3.equals(lktVar)) {
                lktVar = lkt.e(lktVar, lktVar2);
            } else {
                lktVar.getClass();
                if (!lktVar2.equals(lktVar3)) {
                    lktVar.a();
                    int i = lktVar.a + lktVar2.a;
                    lktVar.b(i);
                    System.arraycopy(lktVar2.b, 0, lktVar.b, lktVar.a, lktVar2.a);
                    System.arraycopy(lktVar2.c, 0, lktVar.c, lktVar.a, lktVar2.a);
                    lktVar.a = i;
                }
            }
        }
        o3dVar.unknownFields = lktVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object m(Object obj, int i, int i2, Object obj2, nkt nktVar) {
        if (obj2 == null) {
            nktVar.getClass();
            obj2 = nkt.a(obj);
        }
        nktVar.getClass();
        ((lkt) obj2).f(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void n(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof fc3;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3++;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        fc3 fc3Var = (fc3) list;
        if (!z) {
            while (i2 < fc3Var.c) {
                fc3Var.m(i2);
                yr4Var.j(i, fc3Var.b[i2]);
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < fc3Var.c; i6++) {
            fc3Var.m(i6);
            boolean z3 = fc3Var.b[i6];
            Logger logger2 = yr4.b;
            i5++;
        }
        yr4Var.A(i5);
        while (i2 < fc3Var.c) {
            fc3Var.m(i2);
            yr4Var.i(fc3Var.b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o8a;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    yr4Var.getClass();
                    yr4Var.p(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 8;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        o8a o8aVar = (o8a) list;
        if (!z) {
            while (i2 < o8aVar.c) {
                o8aVar.m(i2);
                double d = o8aVar.b[i2];
                yr4Var.getClass();
                yr4Var.p(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o8aVar.c; i6++) {
            o8aVar.m(i6);
            double d2 = o8aVar.b[i6];
            Logger logger2 = yr4.b;
            i5 += 8;
        }
        yr4Var.A(i5);
        while (i2 < o8aVar.c) {
            o8aVar.m(i2);
            yr4Var.q(Double.doubleToRawLongBits(o8aVar.b[i2]));
            i2++;
        }
    }

    public static void p(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.g(((Integer) list.get(i4)).intValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                yr4Var.s(i, ipeVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            i5 += yr4.g(ipeVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            yr4Var.t(ipeVar.n(i2));
            i2++;
        }
    }

    public static void q(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 4;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                yr4Var.n(i, ipeVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            ipeVar.n(i6);
            Logger logger2 = yr4.b;
            i5 += 4;
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            yr4Var.o(ipeVar.n(i2));
            i2++;
        }
    }

    public static void r(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qug;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 8;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qug qugVar = (qug) list;
        if (!z) {
            while (i2 < qugVar.c) {
                yr4Var.p(i, qugVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qugVar.c; i6++) {
            qugVar.n(i6);
            Logger logger2 = yr4.b;
            i5 += 8;
        }
        yr4Var.A(i5);
        while (i2 < qugVar.c) {
            yr4Var.q(qugVar.n(i2));
            i2++;
        }
    }

    public static void s(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof tic;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    yr4Var.getClass();
                    yr4Var.n(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 4;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        tic ticVar = (tic) list;
        if (!z) {
            while (i2 < ticVar.c) {
                ticVar.m(i2);
                float f = ticVar.b[i2];
                yr4Var.getClass();
                yr4Var.n(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ticVar.c; i6++) {
            ticVar.m(i6);
            float f2 = ticVar.b[i6];
            Logger logger2 = yr4.b;
            i5 += 4;
        }
        yr4Var.A(i5);
        while (i2 < ticVar.c) {
            ticVar.m(i2);
            yr4Var.o(Float.floatToRawIntBits(ticVar.b[i2]));
            i2++;
        }
    }

    public static void t(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.g(((Integer) list.get(i4)).intValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                yr4Var.s(i, ipeVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            i5 += yr4.g(ipeVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            yr4Var.t(ipeVar.n(i2));
            i2++;
        }
    }

    public static void u(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qug;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.B(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.g(((Long) list.get(i4)).longValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.C(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qug qugVar = (qug) list;
        if (!z) {
            while (i2 < qugVar.c) {
                yr4Var.B(i, qugVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qugVar.c; i6++) {
            i5 += yr4.g(qugVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < qugVar.c) {
            yr4Var.C(qugVar.n(i2));
            i2++;
        }
    }

    public static void v(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 4;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                yr4Var.n(i, ipeVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            ipeVar.n(i6);
            Logger logger2 = yr4.b;
            i5 += 4;
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            yr4Var.o(ipeVar.n(i2));
            i2++;
        }
    }

    public static void w(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qug;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = yr4.b;
                i3 += 8;
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qug qugVar = (qug) list;
        if (!z) {
            while (i2 < qugVar.c) {
                yr4Var.p(i, qugVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qugVar.c; i6++) {
            qugVar.n(i6);
            Logger logger2 = yr4.b;
            i5 += 8;
        }
        yr4Var.A(i5);
        while (i2 < qugVar.c) {
            yr4Var.q(qugVar.n(i2));
            i2++;
        }
    }

    public static void x(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    yr4Var.z(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.b(((Integer) list.get(i4)).intValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                yr4Var.A((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                int n = ipeVar.n(i2);
                yr4Var.z(i, (n >> 31) ^ (n << 1));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            i5 += yr4.b(ipeVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            int n2 = ipeVar.n(i2);
            yr4Var.A((n2 >> 31) ^ (n2 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qug;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    yr4Var.B(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.c(((Long) list.get(i4)).longValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                yr4Var.C((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        qug qugVar = (qug) list;
        if (!z) {
            while (i2 < qugVar.c) {
                long n = qugVar.n(i2);
                yr4Var.B(i, (n >> 63) ^ (n << 1));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qugVar.c; i6++) {
            i5 += yr4.c(qugVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < qugVar.c) {
            long n2 = qugVar.n(i2);
            yr4Var.C((n2 >> 63) ^ (n2 << 1));
            i2++;
        }
    }

    public static void z(int i, List list, rp7 rp7Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ipe;
        yr4 yr4Var = (yr4) rp7Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yr4Var.z(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yr4Var.y(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yr4.f(((Integer) list.get(i4)).intValue());
            }
            yr4Var.A(i3);
            while (i2 < list.size()) {
                yr4Var.A(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ipe ipeVar = (ipe) list;
        if (!z) {
            while (i2 < ipeVar.c) {
                yr4Var.z(i, ipeVar.n(i2));
                i2++;
            }
            return;
        }
        yr4Var.y(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ipeVar.c; i6++) {
            i5 += yr4.f(ipeVar.n(i6));
        }
        yr4Var.A(i5);
        while (i2 < ipeVar.c) {
            yr4Var.A(ipeVar.n(i2));
            i2++;
        }
    }
}
