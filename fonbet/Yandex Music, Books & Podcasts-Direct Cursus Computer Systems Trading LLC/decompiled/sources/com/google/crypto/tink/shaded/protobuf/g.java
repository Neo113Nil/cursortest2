package com.google.crypto.tink.shaded.protobuf;

import defpackage.d8;
import defpackage.hpe;
import defpackage.jn3;
import defpackage.jut;
import defpackage.kkt;
import defpackage.mn3;
import defpackage.mut;
import defpackage.okt;
import defpackage.pug;
import defpackage.tr4;
import defpackage.tse;
import defpackage.vto;
import defpackage.yvf;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class g {
    public static final Class a;
    public static final okt b;
    public static final okt c;
    public static final okt d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = w(false);
        c = w(true);
        d = new okt();
    }

    public static void A(int i, List list, b bVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar = bVar.a;
            mn3 mn3Var = (mn3) list.get(i2);
            aVar.r(i, 2);
            aVar.s(mn3Var.size());
            jn3 jn3Var = (jn3) mn3Var;
            aVar.l(jn3Var.d, jn3Var.s(), jn3Var.size());
        }
    }

    public static void B(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                aVar.getClass();
                aVar.o(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 8;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void C(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                aVar.r(i, 0);
                aVar.q(intValue);
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += a.f(((Integer) list.get(i4)).intValue());
        }
        aVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            aVar.q(((Integer) list.get(i5)).intValue());
        }
    }

    public static void D(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 4;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void E(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 8;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void F(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                aVar.getClass();
                aVar.m(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 4;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void G(int i, List list, b bVar, vto vtoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            bVar.b(i, list.get(i2), vtoVar);
        }
    }

    public static void H(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                aVar.r(i, 0);
                aVar.q(intValue);
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += a.f(((Integer) list.get(i4)).intValue());
        }
        aVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            aVar.q(((Integer) list.get(i5)).intValue());
        }
    }

    public static void I(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += a.j(((Long) list.get(i4)).longValue());
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void J(int i, List list, b bVar, vto vtoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            bVar.c(i, list.get(i2), vtoVar);
        }
    }

    public static void K(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 4;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = a.e;
            i3 += 8;
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void M(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                aVar.r(i, 0);
                aVar.s((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += a.i((intValue2 >> 31) ^ (intValue2 << 1));
        }
        aVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            aVar.s((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void N(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                aVar.t(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += a.j((longValue2 >> 63) ^ (longValue2 << 1));
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            aVar.u((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void O(int i, List list, b bVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!(list instanceof yvf)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                aVar.r(i, 2);
                int i3 = aVar.c;
                byte[] bArr = aVar.b;
                int i4 = aVar.d;
                try {
                    int i5 = a.i(str.length() * 3);
                    int i6 = a.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        aVar.d = i7;
                        int C = mut.a.C(str, bArr, i7, i3 - i7);
                        aVar.d = i4;
                        aVar.s((C - i4) - i6);
                        aVar.d = C;
                    } else {
                        aVar.s(mut.b(str));
                        int i8 = aVar.d;
                        aVar.d = mut.a.C(str, bArr, i8, i3 - i8);
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new tr4(e);
                } catch (jut e2) {
                    aVar.d = i4;
                    a.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(tse.a);
                    try {
                        aVar.s(bytes.length);
                        aVar.l(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new tr4(e3);
                    } catch (tr4 e4) {
                        throw e4;
                    }
                }
            }
            return;
        }
        yvf yvfVar = (yvf) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object k = yvfVar.k(i9);
            if (k instanceof String) {
                String str2 = (String) k;
                aVar.r(i, 2);
                int i10 = aVar.c;
                byte[] bArr2 = aVar.b;
                int i11 = aVar.d;
                try {
                    int i12 = a.i(str2.length() * 3);
                    int i13 = a.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        aVar.d = i14;
                        int C2 = mut.a.C(str2, bArr2, i14, i10 - i14);
                        aVar.d = i11;
                        aVar.s((C2 - i11) - i13);
                        aVar.d = C2;
                    } else {
                        aVar.s(mut.b(str2));
                        int i15 = aVar.d;
                        aVar.d = mut.a.C(str2, bArr2, i15, i10 - i15);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new tr4(e5);
                } catch (jut e6) {
                    aVar.d = i11;
                    a.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(tse.a);
                    try {
                        aVar.s(bytes2.length);
                        aVar.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e7) {
                        throw new tr4(e7);
                    } catch (tr4 e8) {
                        throw e8;
                    }
                }
            } else {
                mn3 mn3Var = (mn3) k;
                aVar.r(i, 2);
                aVar.s(mn3Var.size());
                jn3 jn3Var = (jn3) mn3Var;
                aVar.l(jn3Var.d, jn3Var.s(), jn3Var.size());
            }
        }
    }

    public static void P(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                aVar.r(i, 0);
                aVar.s(intValue);
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += a.i(((Integer) list.get(i4)).intValue());
        }
        aVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            aVar.s(((Integer) list.get(i5)).intValue());
        }
    }

    public static void Q(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += a.j(((Long) list.get(i4)).longValue());
        }
        aVar.s(i3);
        while (i2 < list.size()) {
            aVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = a.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h += a.b((mn3) list.get(i2));
        }
        return h;
    }

    public static int b(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof hpe) {
            hpe hpeVar = (hpe) list;
            if (size <= 0) {
                return 0;
            }
            hpeVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += a.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof hpe) {
            hpe hpeVar = (hpe) list;
            if (size <= 0) {
                return 0;
            }
            hpeVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += a.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(List list, int i) {
        if (list.size() == 0) {
            return 0;
        }
        return (a.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pug) {
            pug pugVar = (pug) list;
            if (size <= 0) {
                return 0;
            }
            pugVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += a.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, vto vtoVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = a.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            d8 d8Var = (d8) list.get(i2);
            d8Var.getClass();
            c cVar = (c) d8Var;
            int i3 = cVar.memoizedSerializedSize;
            if (i3 == -1) {
                i3 = vtoVar.f(d8Var);
                cVar.memoizedSerializedSize = i3;
            }
            h += a.i(i3) + i3;
        }
        return h;
    }

    public static int m(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof hpe) {
            hpe hpeVar = (hpe) list;
            if (size <= 0) {
                return 0;
            }
            hpeVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += a.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int o(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pug) {
            pug pugVar = (pug) list;
            if (size <= 0) {
                return 0;
            }
            pugVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += a.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int q(List list, int i) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h = a.h(i) * size;
        if (!(list instanceof yvf)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof mn3) {
                    int size2 = ((mn3) obj).size();
                    h = a.i(size2) + size2 + h;
                } else {
                    h = a.g((String) obj) + h;
                }
                i2++;
            }
            return h;
        }
        yvf yvfVar = (yvf) list;
        while (i2 < size) {
            Object k = yvfVar.k(i2);
            if (k instanceof mn3) {
                int size3 = ((mn3) k).size();
                h = a.i(size3) + size3 + h;
            } else {
                h = a.g((String) k) + h;
            }
            i2++;
        }
        return h;
    }

    public static int r(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof hpe) {
            hpe hpeVar = (hpe) list;
            if (size <= 0) {
                return 0;
            }
            hpeVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += a.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pug) {
            pug pugVar = (pug) list;
            if (size <= 0) {
                return 0;
            }
            pugVar.m(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += a.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static okt w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (okt) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(okt oktVar, Object obj, Object obj2) {
        oktVar.getClass();
        c cVar = (c) obj;
        kkt kktVar = cVar.unknownFields;
        kkt kktVar2 = ((c) obj2).unknownFields;
        if (!kktVar2.equals(kkt.f)) {
            int i = kktVar.a + kktVar2.a;
            int[] copyOf = Arrays.copyOf(kktVar.b, i);
            System.arraycopy(kktVar2.b, 0, copyOf, kktVar.a, kktVar2.a);
            Object[] copyOf2 = Arrays.copyOf(kktVar.c, i);
            System.arraycopy(kktVar2.c, 0, copyOf2, kktVar.a, kktVar2.a);
            kktVar = new kkt(i, copyOf, copyOf2, true);
        }
        cVar.unknownFields = kktVar;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i, List list, b bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a aVar = bVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                aVar.r(i, 0);
                aVar.k(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        aVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = a.e;
            i3++;
        }
        aVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            aVar.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static Object v(int i, List list, Object obj, okt oktVar) {
        return obj;
    }
}
