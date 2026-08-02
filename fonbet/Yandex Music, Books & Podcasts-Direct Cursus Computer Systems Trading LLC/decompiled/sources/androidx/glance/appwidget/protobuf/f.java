package androidx.glance.appwidget.protobuf;

import androidx.core.app.q;
import defpackage.gc3;
import defpackage.jpe;
import defpackage.jzi;
import defpackage.l1j;
import defpackage.mkt;
import defpackage.p8a;
import defpackage.rug;
import defpackage.sse;
import defpackage.uic;
import defpackage.xr4;
import defpackage.zym;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f {
    public static final Class a;
    public static final g b;
    public static final g c;

    static {
        Class<?> cls;
        Class<?> cls2;
        zym zymVar = zym.c;
        g gVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            zym zymVar2 = zym.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                gVar = (g) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = gVar;
        c = new g();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof jpe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xr4.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xr4.h(i) + 4) * size;
    }

    public static int c(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xr4.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof jpe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xr4.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rug) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xr4.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof jpe)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += xr4.i((intValue >> 31) ^ (intValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof rug)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += xr4.j((longValue >> 63) ^ (longValue << 1));
                }
                return i;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof jpe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xr4.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rug) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xr4.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(g gVar, Object obj, Object obj2) {
        gVar.getClass();
        b bVar = (b) obj;
        mkt mktVar = bVar.unknownFields;
        mkt mktVar2 = ((b) obj2).unknownFields;
        mkt mktVar3 = mkt.f;
        if (!mktVar3.equals(mktVar2)) {
            if (mktVar3.equals(mktVar)) {
                int i = mktVar.a + mktVar2.a;
                int[] copyOf = Arrays.copyOf(mktVar.b, i);
                System.arraycopy(mktVar2.b, 0, copyOf, mktVar.a, mktVar2.a);
                Object[] copyOf2 = Arrays.copyOf(mktVar.c, i);
                System.arraycopy(mktVar2.c, 0, copyOf2, mktVar.a, mktVar2.a);
                mktVar = new mkt(i, copyOf, copyOf2, true);
            } else {
                mktVar.getClass();
                if (!mktVar2.equals(mktVar3)) {
                    if (!mktVar.e) {
                        q.i();
                        return;
                    }
                    int i2 = mktVar.a + mktVar2.a;
                    mktVar.a(i2);
                    System.arraycopy(mktVar2.b, 0, mktVar.b, mktVar.a, mktVar2.a);
                    System.arraycopy(mktVar2.c, 0, mktVar.c, mktVar.a, mktVar2.a);
                    mktVar.a = i2;
                }
            }
        }
        bVar.unknownFields = mktVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof gc3) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3++;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            byte b2 = ((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0;
            if (xr4Var.d == xr4Var.c) {
                xr4Var.k();
            }
            byte[] bArr = xr4Var.b;
            int i5 = xr4Var.d;
            xr4Var.d = i5 + 1;
            bArr[i5] = b2;
            i2++;
        }
    }

    public static void n(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof p8a) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                xr4Var.getClass();
                xr4Var.r(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 8;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xr4.j(((Integer) list.get(i4)).intValue());
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 4;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof rug) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 8;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof uic) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                xr4Var.getClass();
                xr4Var.p(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 4;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xr4.j(((Integer) list.get(i4)).intValue());
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof rug) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xr4.j(((Long) list.get(i4)).longValue());
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 4;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof rug) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = xr4.f;
            i3 += 8;
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xr4Var.z(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += xr4.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            xr4Var.A((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof rug) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                xr4Var.B(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += xr4.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            xr4Var.C((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof jpe) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xr4.i(((Integer) list.get(i4)).intValue());
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, jzi jziVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xr4 xr4Var = (xr4) jziVar.a;
        if (list instanceof rug) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xr4Var.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xr4Var.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xr4.j(((Long) list.get(i4)).longValue());
        }
        xr4Var.A(i3);
        while (i2 < list.size()) {
            xr4Var.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, sse sseVar, Object obj2, g gVar) {
        return obj2;
    }
}
