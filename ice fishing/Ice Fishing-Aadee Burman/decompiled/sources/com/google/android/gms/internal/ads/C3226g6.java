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
public final class C3226g6 {

    /* renamed from: a, reason: collision with root package name */
    public Object f30518a;

    /* renamed from: b, reason: collision with root package name */
    public long f30519b;

    /* renamed from: c, reason: collision with root package name */
    public double f30520c;

    /* renamed from: d, reason: collision with root package name */
    public M5 f30521d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f30522e;

    /* renamed from: f, reason: collision with root package name */
    public Z5 f30523f;

    /* renamed from: g, reason: collision with root package name */
    public int f30524g = 1;

    public static C3226g6 a(Object obj) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 1937477084);
        c3226g6.f30518a = obj;
        return c3226g6;
    }

    public static C3226g6 b(long j6) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 327254586);
        c3226g6.f30519b = j6;
        return c3226g6;
    }

    public static C3226g6 c(double d2) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 1605908235);
        c3226g6.f30520c = d2;
        return c3226g6;
    }

    public static C3226g6 d(M5 m52) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 1402586708);
        c3226g6.f30521d = m52;
        return c3226g6;
    }

    public static C3226g6 e(ArrayList arrayList) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 324763920);
        c3226g6.f30522e = arrayList;
        return c3226g6;
    }

    public static C3226g6 f(Z5 z52) {
        C3226g6 c3226g6 = new C3226g6();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        c3226g6.r();
        c3226g6.f30524g = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 474613996);
        c3226g6.f30523f = z52;
        return c3226g6;
    }

    public static C3226g6 g(Object obj) {
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

    public static C3226g6 j(C3226g6 c3226g6) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = i14 % 552812661;
        try {
            int i16 = c3226g6.f30524g;
            int i17 = (i15 ^ g4) + i16;
            if (i16 == 0) {
                throw null;
            }
            switch (i17) {
                case 0:
                    return new C3226g6();
                case 1:
                    return a(c3226g6.l());
                case 2:
                    return b(c3226g6.m());
                case 3:
                    return d(c3226g6.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c3226g6.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((C3226g6) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(c3226g6.p());
                case 6:
                    return c(c3226g6.q());
                default:
                    throw new AssertionError(L5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (C3065d6 e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }

    public final Object h() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = this.f30524g;
        int i16 = ((i14 % 473891334) ^ g4) + i15;
        if (i15 == 0) {
            throw null;
        }
        switch (i16) {
            case 0:
            case 5:
                throw new C3065d6();
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
                    arrayList.add(((C3226g6) it.next()).h());
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
        int i = this.f30524g;
        int i6 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i6) {
            case 0:
                break;
            case 1:
                return l();
            case 2:
                long m4 = m();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) m4) << 16) >> 16));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(m4));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(m4);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(m4);
                        }
                        if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                            if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                                break;
                            }
                        } else {
                            return Boolean.valueOf(m4 != 0);
                        }
                    }
                    return Long.valueOf(m4);
                }
                return Byte.valueOf((byte) ((((int) m4) << 24) >> 24));
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
                    List o6 = o();
                    Class<?> componentType = cls.getComponentType();
                    ArrayList arrayList = (ArrayList) o6;
                    Object newInstance = Array.newInstance(componentType, arrayList.size());
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        Array.set(newInstance, i9, ((C3226g6) arrayList.get(i9)).i(componentType));
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
        throw new C3065d6();
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
        int i6 = this.f30524g;
        int i9 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        switch (i9) {
            case 0:
            case 1:
            case 5:
                throw new C3065d6();
            case 2:
                V2.u(m(), new Qx(i, byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().f26246a;
                V2.u(bArr.length * (j17 ^ j16), new Qx(i, byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                V2.u(arrayList.size(), new Qx(i, byteArrayOutputStream), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3226g6) it.next()).k(byteArrayOutputStream);
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
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 235745791));
        return this.f30518a;
    }

    public final long m() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 733327814));
        return this.f30519b;
    }

    public final M5 n() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 1140384172));
        return this.f30521d;
    }

    public final List o() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 1250801052));
        return this.f30522e;
    }

    public final Z5 p() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 395191309));
        return this.f30523f;
    }

    public final double q() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        s(com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 846930886));
        return this.f30520c;
    }

    public final void r() {
        this.f30524g = 1;
        this.f30519b = 0L;
        this.f30518a = null;
        this.f30521d = null;
        this.f30522e = null;
        this.f30523f = null;
    }

    public final void s(int i) {
        if (i != this.f30524g) {
            throw new C3065d6();
        }
    }
}
