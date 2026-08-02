package defpackage;

import androidx.core.app.q;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lnx {
    public static final l3l a;

    static {
        hnx hnxVar = hnx.c;
        a = new l3l();
    }

    public static void a(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof wmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    dmxVar.o(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += dmx.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                dmxVar.p((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        wmx wmxVar = (wmx) list;
        if (!z) {
            while (i2 < wmxVar.c) {
                long g = wmxVar.g(i2);
                dmxVar.o(i, (g >> 63) ^ (g + g));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wmxVar.c; i6++) {
            long g2 = wmxVar.g(i6);
            i5 += dmx.a((g2 >> 63) ^ (g2 + g2));
        }
        dmxVar.n(i5);
        while (i2 < wmxVar.c) {
            long g3 = wmxVar.g(i2);
            dmxVar.p((g3 >> 63) ^ (g3 + g3));
            i2++;
        }
    }

    public static void b(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += dmx.r(((Integer) list.get(i4)).intValue());
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                dmxVar.m(i, kmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            i5 += dmx.r(kmxVar.g(i6));
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            dmxVar.n(kmxVar.g(i2));
            i2++;
        }
    }

    public static void c(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof wmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += dmx.a(((Long) list.get(i4)).longValue());
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wmx wmxVar = (wmx) list;
        if (!z) {
            while (i2 < wmxVar.c) {
                dmxVar.o(i, wmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wmxVar.c; i6++) {
            i5 += dmx.a(wmxVar.g(i6));
        }
        dmxVar.n(i5);
        while (i2 < wmxVar.c) {
            dmxVar.p(wmxVar.g(i2));
            i2++;
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kmx)) {
            int i2 = 0;
            while (i < size) {
                i2 += dmx.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kmx kmxVar = (kmx) list;
        int i3 = 0;
        while (i < size) {
            i3 += dmx.a(kmxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int f(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (dmx.r(i << 3) + 4) * size;
    }

    public static int g(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (dmx.r(i << 3) + 8) * size;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kmx)) {
            int i2 = 0;
            while (i < size) {
                i2 += dmx.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kmx kmxVar = (kmx) list;
        int i3 = 0;
        while (i < size) {
            i3 += dmx.a(kmxVar.g(i));
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
        if (!(list instanceof wmx)) {
            int i2 = 0;
            while (i < size) {
                i2 += dmx.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        wmx wmxVar = (wmx) list;
        int i3 = 0;
        while (i < size) {
            i3 += dmx.a(wmxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kmx)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += dmx.r((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        kmx kmxVar = (kmx) list;
        int i3 = 0;
        while (i < size) {
            int g = kmxVar.g(i);
            i3 += dmx.r((g >> 31) ^ (g + g));
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wmx)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += dmx.a((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        wmx wmxVar = (wmx) list;
        int i3 = 0;
        while (i < size) {
            long g = wmxVar.g(i);
            i3 += dmx.a((g >> 63) ^ (g + g));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kmx)) {
            int i2 = 0;
            while (i < size) {
                i2 += dmx.r(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        kmx kmxVar = (kmx) list;
        int i3 = 0;
        while (i < size) {
            i3 += dmx.r(kmxVar.g(i));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wmx)) {
            int i2 = 0;
            while (i < size) {
                i2 += dmx.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        wmx wmxVar = (wmx) list;
        int i3 = 0;
        while (i < size) {
            i3 += dmx.a(wmxVar.g(i));
            i++;
        }
        return i3;
    }

    public static void n(Object obj, Object obj2) {
        jmx jmxVar = (jmx) obj;
        mnx mnxVar = jmxVar.zzc;
        mnx mnxVar2 = ((jmx) obj2).zzc;
        mnx mnxVar3 = mnx.e;
        if (!mnxVar3.equals(mnxVar2)) {
            if (mnxVar3.equals(mnxVar)) {
                mnxVar.getClass();
                mnxVar2.getClass();
                int[] copyOf = Arrays.copyOf(mnxVar.a, 0);
                System.arraycopy(mnxVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(mnxVar.b, 0);
                System.arraycopy(mnxVar2.b, 0, copyOf2, 0, 0);
                mnxVar = new mnx(copyOf, copyOf2, true);
            } else {
                mnxVar.getClass();
                if (!mnxVar2.equals(mnxVar3)) {
                    if (!mnxVar.d) {
                        q.i();
                        return;
                    } else {
                        System.arraycopy(mnxVar2.a, 0, mnxVar.a, 0, 0);
                        System.arraycopy(mnxVar2.b, 0, mnxVar.b, 0, 0);
                    }
                }
            }
        }
        jmxVar.zzc = mnxVar;
    }

    public static void o(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        if (list instanceof vlx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                dmxVar.n(i << 3);
                dmxVar.b(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        dmxVar.n(i3);
        while (i2 < list.size()) {
            dmxVar.b(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        if (list instanceof emx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dmxVar.g(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        dmxVar.n(i3);
        while (i2 < list.size()) {
            dmxVar.h(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void q(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += dmx.a(((Integer) list.get(i4)).intValue());
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                dmxVar.i(i, kmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            i5 += dmx.a(kmxVar.g(i6));
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            dmxVar.j(kmxVar.g(i2));
            i2++;
        }
    }

    public static void r(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.f(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                dmxVar.e(i, kmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            kmxVar.g(i6);
            i5 += 4;
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            dmxVar.f(kmxVar.g(i2));
            i2++;
        }
    }

    public static void s(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof wmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.h(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wmx wmxVar = (wmx) list;
        if (!z) {
            while (i2 < wmxVar.c) {
                dmxVar.g(i, wmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wmxVar.c; i6++) {
            wmxVar.g(i6);
            i5 += 8;
        }
        dmxVar.n(i5);
        while (i2 < wmxVar.c) {
            dmxVar.h(wmxVar.g(i2));
            i2++;
        }
    }

    public static void t(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        if (list instanceof hmx) {
            l1j.f();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dmxVar.e(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        dmxVar.n(i3);
        while (i2 < list.size()) {
            dmxVar.f(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void u(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += dmx.a(((Integer) list.get(i4)).intValue());
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                dmxVar.i(i, kmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            i5 += dmx.a(kmxVar.g(i6));
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            dmxVar.j(kmxVar.g(i2));
            i2++;
        }
    }

    public static void v(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof wmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += dmx.a(((Long) list.get(i4)).longValue());
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wmx wmxVar = (wmx) list;
        if (!z) {
            while (i2 < wmxVar.c) {
                dmxVar.o(i, wmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wmxVar.c; i6++) {
            i5 += dmx.a(wmxVar.g(i6));
        }
        dmxVar.n(i5);
        while (i2 < wmxVar.c) {
            dmxVar.p(wmxVar.g(i2));
            i2++;
        }
    }

    public static void w(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.f(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                dmxVar.e(i, kmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            kmxVar.g(i6);
            i5 += 4;
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            dmxVar.f(kmxVar.g(i2));
            i2++;
        }
    }

    public static void x(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof wmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    dmxVar.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                dmxVar.h(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wmx wmxVar = (wmx) list;
        if (!z) {
            while (i2 < wmxVar.c) {
                dmxVar.g(i, wmxVar.g(i2));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wmxVar.c; i6++) {
            wmxVar.g(i6);
            i5 += 8;
        }
        dmxVar.n(i5);
        while (i2 < wmxVar.c) {
            dmxVar.h(wmxVar.g(i2));
            i2++;
        }
    }

    public static void y(int i, List list, hjp hjpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dmx dmxVar = (dmx) hjpVar.b;
        int i2 = 0;
        if (!(list instanceof kmx)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    dmxVar.m(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            dmxVar.l(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += dmx.r((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            dmxVar.n(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                dmxVar.n((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        kmx kmxVar = (kmx) list;
        if (!z) {
            while (i2 < kmxVar.c) {
                int g = kmxVar.g(i2);
                dmxVar.m(i, (g >> 31) ^ (g + g));
                i2++;
            }
            return;
        }
        dmxVar.l(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < kmxVar.c; i6++) {
            int g2 = kmxVar.g(i6);
            i5 += dmx.r((g2 >> 31) ^ (g2 + g2));
        }
        dmxVar.n(i5);
        while (i2 < kmxVar.c) {
            int g3 = kmxVar.g(i2);
            dmxVar.n((g3 >> 31) ^ (g3 + g3));
            i2++;
        }
    }
}
