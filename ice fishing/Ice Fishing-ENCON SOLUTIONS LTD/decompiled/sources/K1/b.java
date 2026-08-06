package K1;

import J1.m;
import J1.s;
import J1.y;
import J1.z;
import Q1.C0080c;
import R1.l;
import W1.g;
import W1.j;
import W1.o;
import W1.q;
import W1.w;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import i1.C0249f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import u0.AbstractC1050a;
import z1.f;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1051a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f1052b = AbstractC1050a.t(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z f1053c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f1054d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f1055e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f1056f;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
    
        continue;
     */
    static {
        int i2;
        byte[] bArr = new byte[0];
        f1051a = bArr;
        g gVar = new g();
        gVar.s(bArr, 0, 0);
        long j2 = 0;
        f1053c = new z(j2, gVar, 0);
        c(j2, j2, j2);
        j jVar = j.f1876d;
        j[] jVarArr = {m0.j.g("efbbbf"), m0.j.g("feff"), m0.j.g("fffe"), m0.j.g("0000ffff"), m0.j.g("ffff0000")};
        ArrayList arrayList = new ArrayList(new C0249f(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            j jVar2 = jVarArr[i3];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] elements = Arrays.copyOf(numArr, numArr.length);
        i.e(elements, "elements");
        ArrayList arrayList3 = elements.length == 0 ? new ArrayList() : new ArrayList(new C0249f(elements, true));
        int i4 = 0;
        int i5 = 0;
        while (i4 < 5) {
            j jVar3 = jVarArr[i4];
            int i6 = i5 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(C1.a.g(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 > i7) {
                    i2 = -(i8 + 1);
                    break;
                }
                i2 = (i8 + i7) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i2);
                int compareTo = comparable == jVar3 ? 0 : comparable == null ? -1 : jVar3 == null ? 1 : comparable.compareTo(jVar3);
                if (compareTo < 0) {
                    i8 = i2 + 1;
                } else if (compareTo > 0) {
                    i7 = i2 - 1;
                }
            }
            arrayList3.set(i2, Integer.valueOf(i5));
            i4++;
            i5 = i6;
        }
        if (((j) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            j prefix = (j) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                j jVar4 = (j) arrayList.get(i11);
                jVar4.getClass();
                i.e(prefix, "prefix");
                if (jVar4.f(prefix, prefix.a())) {
                    if (jVar4.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + jVar4).toString());
                    }
                    if (((Number) arrayList3.get(i11)).intValue() > ((Number) arrayList3.get(i9)).intValue()) {
                        arrayList.remove(i11);
                        arrayList3.remove(i11);
                    } else {
                        i11++;
                    }
                }
            }
            i9 = i10;
        }
        g gVar2 = new g();
        l.d(0L, gVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (gVar2.f1875b / 4)];
        int i12 = 0;
        while (!gVar2.a()) {
            iArr[i12] = gVar2.l();
            i12++;
        }
        Object[] copyOf = Arrays.copyOf(jVarArr, 5);
        i.d(copyOf, "copyOf(this, size)");
        new o((j[]) copyOf);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.b(timeZone);
        f1054d = timeZone;
        f1055e = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String d02 = z1.g.d0(s.class.getName(), "okhttp3.");
        if (z1.o.M(d02, "Client")) {
            d02 = d02.substring(0, d02.length() - 6);
            i.d(d02, "substring(...)");
        }
        f1056f = d02;
    }

    public static final boolean a(J1.o oVar, J1.o other) {
        i.e(oVar, "<this>");
        i.e(other, "other");
        return i.a(oVar.f907d, other.f907d) && oVar.f908e == other.f908e && i.a(oVar.f904a, other.f904a);
    }

    public static final int b(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalStateException(i.h(" < 0", "timeout").toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(i.h(" too large.", "timeout").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(i.h(" too small.", "timeout").toString());
    }

    public static final void c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!i.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c2, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int g(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (z1.g.S(str2, str.charAt(i2))) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final boolean h(w wVar, TimeUnit timeUnit) {
        i.e(timeUnit, "timeUnit");
        try {
            return t(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... objArr) {
        i.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                int i3 = 0;
                while (true) {
                    if (i3 < strArr2.length) {
                        int i4 = i3 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i3]) == 0) {
                                return true;
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(y yVar) {
        String a2 = yVar.f1005f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... elements) {
        i.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC0253j.B(Arrays.copyOf(objArr, objArr.length)));
        i.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (i.f(charAt, 31) <= 0 || i.f(charAt, 127) >= 0) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int n(String str, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int o(String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                int i5 = i4 - 1;
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return i2;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        i.e(other, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            int length2 = other.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    String str2 = other[i3];
                    i3++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String name) {
        i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int s(q qVar) {
        i.e(qVar, "<this>");
        return (qVar.c() & 255) | ((qVar.c() & 255) << 16) | ((qVar.c() & 255) << 8);
    }

    public static final boolean t(w wVar, int i2, TimeUnit timeUnit) {
        i.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = wVar.d().e() ? wVar.d().c() - nanoTime : Long.MAX_VALUE;
        wVar.d().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            g gVar = new g();
            while (wVar.e(gVar, 8192L) != -1) {
                gVar.o(gVar.f1875b);
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final m u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0080c c0080c = (C0080c) it.next();
            String h2 = c0080c.f1578a.h();
            String h3 = c0080c.f1579b.h();
            arrayList.add(h2);
            arrayList.add(z1.g.k0(h3).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new m((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String v(J1.o oVar, boolean z2) {
        i.e(oVar, "<this>");
        String str = oVar.f907d;
        if (z1.g.T(str, StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            str = "[" + str + ']';
        }
        int i2 = oVar.f908e;
        if (!z2) {
            String scheme = oVar.f904a;
            i.e(scheme, "scheme");
            if (i2 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        i.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(AbstractC0252i.T(list));
        i.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i2, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        if (valueOf == null) {
            return i2;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String y(String str, int i2, int i3) {
        int n2 = n(str, i2, i3);
        String substring = str.substring(n2, o(str, n2, i3));
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(IOException iOException, List list) {
        i.e(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1050a.a(iOException, (Exception) it.next());
        }
    }
}
