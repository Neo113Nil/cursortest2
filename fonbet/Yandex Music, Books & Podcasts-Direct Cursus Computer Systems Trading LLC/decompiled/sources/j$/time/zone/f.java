package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.l;
import j$.time.temporal.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.u()) {
            if (localDateTime.J(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.J(bVar.b.d0(bVar.d.b - bVar.c.b))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.J(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.J(bVar.b.d0(bVar.d.b - bVar.c.b))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                boolean u = bVar.u();
                LocalDateTime localDateTime = bVar.b;
                if (u) {
                    arrayList.add(localDateTime);
                    arrayList.add(bVar.b.d0(bVar.d.b - bVar.c.b));
                } else {
                    arrayList.add(localDateTime.d0(bVar.d.b - bVar.c.b));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset i(int i2) {
        return ZoneOffset.g0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.j0(Math.floorDiv(j2 + zoneOffset.b, 86400)).getYear();
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.g.getDSTSavings() != 0) {
                return false;
            }
            Instant now = Instant.now();
            b bVar2 = null;
            if (this.g != null) {
                long j2 = now.a;
                if (now.b > 0 && j2 < Long.MAX_VALUE) {
                    j2++;
                }
                int c = c(j2, d(now));
                b[] b = b(c);
                int length = b.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = b[length];
                        if (j2 > bVar.a) {
                            break;
                        }
                        length--;
                    } else if (c > 1800) {
                        b[] b2 = b(c - 1);
                        for (int length2 = b2.length - 1; length2 >= 0; length2--) {
                            bVar = b2[length2];
                            if (j2 <= bVar.a) {
                            }
                        }
                        j$.time.a.b.getClass();
                        long min = Math.min(j2 - 31104000, (System.currentTimeMillis() / 1000) + 31968000);
                        int offset = this.g.getOffset((j2 - 1) * 1000);
                        long N = LocalDate.i0(1800, 1, 1).N() * 86400;
                        while (true) {
                            if (N > min) {
                                break;
                            }
                            int offset2 = this.g.getOffset(min * 1000);
                            if (offset != offset2) {
                                int c2 = c(min, i(offset2));
                                b[] b3 = b(c2 + 1);
                                int length3 = b3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        b[] b4 = b(c2);
                                        bVar2 = b4[b4.length - 1];
                                        break;
                                    }
                                    bVar2 = b3[length3];
                                    if (j2 > bVar2.a) {
                                        break;
                                    }
                                    length3--;
                                }
                            } else {
                                min -= 7776000;
                            }
                        }
                    }
                }
                bVar2 = bVar;
            } else {
                long[] jArr = this.c;
                if (jArr.length != 0) {
                    long j3 = now.a;
                    if (now.b > 0 && j3 < Long.MAX_VALUE) {
                        j3++;
                    }
                    long j4 = jArr[jArr.length - 1];
                    if (this.f.length > 0 && j3 > j4) {
                        ZoneOffset[] zoneOffsetArr = this.e;
                        ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                        int c3 = c(j3, zoneOffset);
                        b[] b5 = b(c3);
                        int length4 = b5.length - 1;
                        while (true) {
                            if (length4 < 0) {
                                int i2 = c3 - 1;
                                if (i2 > c(j4, zoneOffset)) {
                                    b[] b6 = b(i2);
                                    bVar2 = b6[b6.length - 1];
                                }
                            } else {
                                b bVar3 = b5[length4];
                                if (j3 > bVar3.a) {
                                    bVar2 = bVar3;
                                    break;
                                }
                                length4--;
                            }
                        }
                    }
                    int binarySearch = Arrays.binarySearch(this.c, j3);
                    if (binarySearch < 0) {
                        binarySearch = (-binarySearch) - 1;
                    }
                    if (binarySearch > 0) {
                        int i3 = binarySearch - 1;
                        long j5 = this.c[i3];
                        ZoneOffset[] zoneOffsetArr2 = this.e;
                        bVar2 = new b(j5, zoneOffsetArr2[i3], zoneOffsetArr2[binarySearch]);
                    }
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long j2 = instant.a;
        if (this.f.length > 0 && j2 > jArr[jArr.length - 1]) {
            b[] b = b(c(j2, this.e[r8.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                bVar = b[i2];
                if (j2 < bVar.a) {
                    return bVar.c;
                }
            }
            return bVar.d;
        }
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((ZoneOffset) e);
        }
        b bVar = (b) e;
        return bVar.u() ? Collections.EMPTY_LIST : j$.time.e.c(new Object[]{bVar.c, bVar.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r8.u(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r8.b.j0() <= r0.b.j0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] b = b(localDateTime.a.getYear());
            if (b.length == 0) {
                return i(this.g.getOffset(localDateTime.z(this.b[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if ((a instanceof b) || a.equals(bVar.c)) {
                    return a;
                }
                i2++;
                obj = a;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime localDateTime2 = this.d[r0.length - 1];
            if (localDateTime2 == null) {
                long N = localDateTime.a.N();
                long N2 = localDateTime2.a.N();
                if (N <= N2) {
                    if (N == N2) {
                    }
                }
                b[] b2 = b(localDateTime.a.getYear());
                int length2 = b2.length;
                while (i2 < length2) {
                    b bVar2 = b2[i2];
                    Object a2 = a(localDateTime, bVar2);
                    if ((a2 instanceof b) || a2.equals(bVar2.c)) {
                        return a2;
                    }
                    i2++;
                    obj = a2;
                }
                return obj;
            }
            localDateTime.getClass();
        }
        int binarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (binarySearch < objArr.length - 1) {
                int i3 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime3 = localDateTimeArr[binarySearch];
            LocalDateTime localDateTime4 = localDateTimeArr[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.e;
            int i4 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
            if (zoneOffset2.b > zoneOffset.b) {
                return new b(localDateTime3, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime4, zoneOffset, zoneOffset2);
        }
        return this.e[(binarySearch / 2) + 1];
    }

    public final b[] b(int i2) {
        LocalDate E;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate i0 = LocalDate.i0(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.d0(0);
            long z = new LocalDateTime(i0, l.h[0]).z(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(z * 1000);
            long j4 = 31968000 + z;
            while (z < j4) {
                long j5 = z + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - z > j2) {
                        long floorDiv = Math.floorDiv(j5 + z, 2L);
                        if (this.g.getOffset(floorDiv * j6) == offset) {
                            z = floorDiv;
                        } else {
                            j5 = floorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(z * j6) == offset) {
                        z = j5;
                    }
                    ZoneOffset i5 = i(offset);
                    int offset2 = this.g.getOffset(z * j6);
                    ZoneOffset i6 = i(offset2);
                    if (c(z, i6) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(z, i5, i6);
                    }
                    offset = offset2;
                } else {
                    z = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i7 = 0;
        while (i7 < eVarArr.length) {
            e eVar = eVarArr[i7];
            byte b = eVar.b;
            Month month = eVar.a;
            if (b < 0) {
                long j7 = i2;
                int E2 = month.E(t.c.b0(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.d0(j7);
                j$.time.temporal.a.DAY_OF_MONTH.d0(E2);
                E = LocalDate.E(i2, month.getValue(), E2);
                j$.time.d dVar = eVar.c;
                if (dVar != null) {
                    E = E.m(new m(dVar.getValue(), i4));
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.d0(i2);
                j$.time.temporal.a.DAY_OF_MONTH.d0(b);
                E = LocalDate.E(i2, month.getValue(), b);
                j$.time.d dVar2 = eVar.c;
                if (dVar2 != null) {
                    E = E.m(new m(dVar2.getValue(), i3));
                }
            }
            if (eVar.e) {
                E = E.m0(1L);
            }
            LocalDateTime L = LocalDateTime.L(E, eVar.d);
            d dVar3 = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i8 = c.a[dVar3.ordinal()];
            if (i8 == 1) {
                L = L.d0(zoneOffset2.b - ZoneOffset.UTC.b);
            } else if (i8 == 2) {
                L = L.d0(zoneOffset2.b - zoneOffset.b);
            }
            bVarArr3[i7] = new b(L, eVar.h, eVar.i);
            i7++;
            i3 = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = i(timeZone.getRawOffset());
        } else if (this.c.length != 0) {
            int binarySearch = Arrays.binarySearch(this.a, instant.a);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.b[binarySearch + 1];
        } else {
            zoneOffset = this.b[0];
        }
        return !zoneOffset.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
