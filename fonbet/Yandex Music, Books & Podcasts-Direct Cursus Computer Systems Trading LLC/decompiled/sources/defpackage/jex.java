package defpackage;

import androidx.core.app.q;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jex {
    public static final itk a;

    static {
        fex fexVar = fex.c;
        a = new itk();
    }

    public static void a(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    kbxVar.l(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += kbx.q((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                kbxVar.m((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                int g = ncxVar.g(i2);
                kbxVar.l(i, (g >> 31) ^ (g + g));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            int g2 = ncxVar.g(i6);
            i5 += kbx.q((g2 >> 31) ^ (g2 + g2));
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            int g3 = ncxVar.g(i2);
            kbxVar.m((g3 >> 31) ^ (g3 + g3));
            i2++;
        }
    }

    public static void b(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof sdx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                kbxVar.n(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += kbx.a((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            kbxVar.o((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void c(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    kbxVar.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += kbx.q(((Integer) list.get(i4)).intValue());
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                kbxVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                kbxVar.l(i, ncxVar.g(i2));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            i5 += kbx.q(ncxVar.g(i6));
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            kbxVar.m(ncxVar.g(i2));
            i2++;
        }
    }

    public static void d(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof sdx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kbx.a(((Long) list.get(i4)).longValue());
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.o(((Long) list.get(i2)).longValue());
            i2++;
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
        if (!(list instanceof ncx)) {
            int i2 = 0;
            while (i < size) {
                i2 += kbx.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ncx ncxVar = (ncx) list;
        int i3 = 0;
        while (i < size) {
            i3 += kbx.a(ncxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int g(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (kbx.q(i << 3) + 4) * size;
    }

    public static int h(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (kbx.q(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ncx)) {
            int i2 = 0;
            while (i < size) {
                i2 += kbx.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ncx ncxVar = (ncx) list;
        int i3 = 0;
        while (i < size) {
            i3 += kbx.a(ncxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof sdx) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kbx.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ncx)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += kbx.q((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        ncx ncxVar = (ncx) list;
        int i3 = 0;
        while (i < size) {
            int g = ncxVar.g(i);
            i3 += kbx.q((g >> 31) ^ (g + g));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof sdx) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += kbx.a((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ncx)) {
            int i2 = 0;
            while (i < size) {
                i2 += kbx.q(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ncx ncxVar = (ncx) list;
        int i3 = 0;
        while (i < size) {
            i3 += kbx.q(ncxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof sdx) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kbx.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object o(int i, Object obj, Object obj2, int i2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            mcx mcxVar = (mcx) obj;
            sex sexVar = mcxVar.zzc;
            obj3 = sexVar;
            if (sexVar == sex.f) {
                sex b = sex.b();
                mcxVar.zzc = b;
                obj3 = b;
            }
        }
        ((sex) obj3).c(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        mcx mcxVar = (mcx) obj;
        sex sexVar = mcxVar.zzc;
        sex sexVar2 = ((mcx) obj2).zzc;
        sex sexVar3 = sex.f;
        if (!sexVar3.equals(sexVar2)) {
            if (sexVar3.equals(sexVar)) {
                int i = sexVar.a + sexVar2.a;
                int[] copyOf = Arrays.copyOf(sexVar.b, i);
                System.arraycopy(sexVar2.b, 0, copyOf, sexVar.a, sexVar2.a);
                Object[] copyOf2 = Arrays.copyOf(sexVar.c, i);
                System.arraycopy(sexVar2.c, 0, copyOf2, sexVar.a, sexVar2.a);
                sexVar = new sex(i, copyOf, copyOf2, true);
            } else {
                sexVar.getClass();
                if (!sexVar2.equals(sexVar3)) {
                    if (!sexVar.e) {
                        q.i();
                        return;
                    }
                    int i2 = sexVar.a + sexVar2.a;
                    sexVar.e(i2);
                    System.arraycopy(sexVar2.b, 0, sexVar.b, sexVar.a, sexVar2.a);
                    System.arraycopy(sexVar2.c, 0, sexVar.c, sexVar.a, sexVar2.a);
                    sexVar.a = i2;
                }
            }
        }
        mcxVar.zzc = sexVar;
    }

    public static void q(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof zax) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i2)).booleanValue();
                kbxVar.m(i << 3);
                int i3 = kbxVar.d;
                try {
                    int i4 = i3 + 1;
                    try {
                        kbxVar.b[i3] = booleanValue;
                        kbxVar.d = i4;
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i4;
                        throw new pg5(i3, kbxVar.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        kbxVar.m(i5);
        while (i2 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            int i7 = kbxVar.d;
            try {
                int i8 = i7 + 1;
                try {
                    kbxVar.b[i7] = booleanValue2;
                    kbxVar.d = i8;
                    i2++;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i7 = i8;
                    throw new pg5(i7, kbxVar.c, 1, e);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }
    }

    public static void r(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof nbx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    kbxVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += kbx.a(((Integer) list.get(i4)).intValue());
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                kbxVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                kbxVar.h(i, ncxVar.g(i2));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            i5 += kbx.a(ncxVar.g(i6));
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            kbxVar.i(ncxVar.g(i2));
            i2++;
        }
    }

    public static void t(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    kbxVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                kbxVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                kbxVar.d(i, ncxVar.g(i2));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            ncxVar.g(i6);
            i5 += 4;
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            kbxVar.e(ncxVar.g(i2));
            i2++;
        }
    }

    public static void u(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof sdx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof acx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    kbxVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += kbx.a(((Integer) list.get(i4)).intValue());
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                kbxVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                kbxVar.h(i, ncxVar.g(i2));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            i5 += kbx.a(ncxVar.g(i6));
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            kbxVar.i(ncxVar.g(i2));
            i2++;
        }
    }

    public static void x(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof sdx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += kbx.a(((Long) list.get(i4)).longValue());
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        int i2 = 0;
        if (!(list instanceof ncx)) {
            if (!z) {
                while (i2 < list.size()) {
                    kbxVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kbxVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            kbxVar.m(i3);
            while (i2 < list.size()) {
                kbxVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ncx ncxVar = (ncx) list;
        if (!z) {
            while (i2 < ncxVar.c) {
                kbxVar.d(i, ncxVar.g(i2));
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ncxVar.c; i6++) {
            ncxVar.g(i6);
            i5 += 4;
        }
        kbxVar.m(i5);
        while (i2 < ncxVar.c) {
            kbxVar.e(ncxVar.g(i2));
            i2++;
        }
    }

    public static void z(int i, List list, gao gaoVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        kbx kbxVar = (kbx) gaoVar.a;
        if (list instanceof sdx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                kbxVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        kbxVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        kbxVar.m(i3);
        while (i2 < list.size()) {
            kbxVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
