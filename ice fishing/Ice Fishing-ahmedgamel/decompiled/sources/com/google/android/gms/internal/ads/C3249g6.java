package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3249g6 {

    /* renamed from: a, reason: collision with root package name */
    public Object f31284a;

    /* renamed from: b, reason: collision with root package name */
    public long f31285b;

    /* renamed from: c, reason: collision with root package name */
    public double f31286c;

    /* renamed from: d, reason: collision with root package name */
    public M5 f31287d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f31288e;

    /* renamed from: f, reason: collision with root package name */
    public Z5 f31289f;

    /* renamed from: g, reason: collision with root package name */
    public int f31290g = 1;

    public static C3249g6 a(Object obj) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 1937477084);
        c3249g6.f31284a = obj;
        return c3249g6;
    }

    public static C3249g6 b(long j6) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 327254586);
        c3249g6.f31285b = j6;
        return c3249g6;
    }

    public static C3249g6 c(double d9) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 1605908235);
        c3249g6.f31286c = d9;
        return c3249g6;
    }

    public static C3249g6 d(M5 m52) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 1402586708);
        c3249g6.f31287d = m52;
        return c3249g6;
    }

    public static C3249g6 e(ArrayList arrayList) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 324763920);
        c3249g6.f31288e = arrayList;
        return c3249g6;
    }

    public static C3249g6 f(Z5 z52) {
        C3249g6 c3249g6 = new C3249g6();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        c3249g6.r();
        c3249g6.f31290g = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 474613996);
        c3249g6.f31289f = z52;
        return c3249g6;
    }

    public static C3249g6 g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof M5) {
            return d((M5) obj);
        }
        if (obj instanceof String) {
            return d(M5.e(((String) obj).getBytes(Charset.forName(L5.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g(arrayList2.get(i)));
        }
        return e(arrayList);
    }

    public static C3249g6 j(C3249g6 c3249g6) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        int f2 = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12);
        int i14 = i13 % 552812661;
        try {
            int i15 = c3249g6.f31290g;
            int i16 = (i14 ^ f2) + i15;
            if (i15 == 0) {
                throw null;
            }
            switch (i16) {
                case 0:
                    return new C3249g6();
                case 1:
                    return a(c3249g6.l());
                case 2:
                    return b(c3249g6.m());
                case 3:
                    return d(c3249g6.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c3249g6.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((C3249g6) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(c3249g6.p());
                case 6:
                    return c(c3249g6.q());
                default:
                    throw new AssertionError(L5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (C3088d6 e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }

    public final Object h() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        int f2 = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12);
        int i14 = this.f31290g;
        int i15 = ((i13 % 473891334) ^ f2) + i14;
        if (i14 == 0) {
            throw null;
        }
        switch (i15) {
            case 0:
            case 5:
                throw new C3088d6();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) o()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3249g6) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(L5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Class cls) {
        int i = this.f31290g;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i4) {
            case 0:
                break;
            case 1:
                return l();
            case 2:
                long m9 = m();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) m9) << 16) >> 16));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(m9));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(m9);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(m9);
                        }
                        if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                            if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                                break;
                            }
                        } else {
                            return Boolean.valueOf(m9 != 0);
                        }
                    }
                    return Long.valueOf(m9);
                }
                return Byte.valueOf((byte) ((((int) m9) << 24) >> 24));
            case 3:
                M5 n9 = n();
                if (cls.equals(M5.class)) {
                    return n9;
                }
                if (cls.equals(Object.class) || cls.equals(String.class)) {
                    return n9.c();
                }
                if (cls.equals(byte[].class)) {
                    return n9.a();
                }
                break;
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return h();
                }
                if (cls.isArray()) {
                    List o4 = o();
                    Class<?> componentType = cls.getComponentType();
                    ArrayList arrayList = (ArrayList) o4;
                    Object newInstance = Array.newInstance(componentType, arrayList.size());
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        Array.set(newInstance, i6, ((C3249g6) arrayList.get(i6)).i(componentType));
                    }
                    return newInstance;
                }
                break;
            case 5:
                return p();
            case 6:
                double q8 = q();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) q8);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) q8);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) q8);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) q8) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) q8) << 16) >> 16));
                }
                if (cls.equals(Double.class) || cls.equals(cls2) || cls.equals(Object.class)) {
                    return Double.valueOf(q8);
                }
                break;
            default:
                throw new AssertionError(L5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
        throw new C3088d6();
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j6 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        int i = 6;
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = (((((~j6) & j9) | j10) + ((j6 & j11) | j12)) - j13) + j14;
        long j17 = j15 % 297598514;
        int i4 = this.f31290g;
        int i6 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i6) {
            case 0:
            case 1:
            case 5:
                throw new C3088d6();
            case 2:
                V2.u(m(), new Qx(i, byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().f27037a;
                V2.u(bArr.length * (j17 ^ j16), new Qx(i, byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                V2.u(arrayList.size(), new Qx(i, byteArrayOutputStream), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3249g6) it.next()).k(byteArrayOutputStream);
                }
                return;
            case 6:
                long doubleToRawLongBits = Double.doubleToRawLongBits(q());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(doubleToRawLongBits);
                for (byte b9 : allocate.array()) {
                    byteArrayOutputStream.write(b9);
                }
                int length = allocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 235745791));
        return this.f31284a;
    }

    public final long m() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 733327814));
        return this.f31285b;
    }

    public final M5 n() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 1140384172));
        return this.f31287d;
    }

    public final List o() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 1250801052));
        return this.f31288e;
    }

    public final Z5 p() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 395191309));
        return this.f31289f;
    }

    public final double q() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        s(com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, iArr[5], iArr[6]) ^ (iArr[7] % 846930886));
        return this.f31286c;
    }

    public final void r() {
        this.f31290g = 1;
        this.f31285b = 0L;
        this.f31284a = null;
        this.f31287d = null;
        this.f31288e = null;
        this.f31289f = null;
    }

    public final void s(int i) {
        if (i != this.f31290g) {
            throw new C3088d6();
        }
    }
}
