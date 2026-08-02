package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public abstract class cvt {
    public static final byte[] a;
    public static final zvd b = qwp.g0(new String[0]);
    public static final wkn c;
    public static final qwj d;
    public static final TimeZone e;
    public static final Regex f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        hi3 hi3Var = new hi3();
        hi3Var.write(bArr, 0, 0);
        long j = 0;
        c = new wkn(null, j, hi3Var, 1);
        c(j, j, j);
        int i = qwj.d;
        pn3 pn3Var = pn3.d;
        d = s7g.y(ovn.A("efbbbf"), ovn.A("feff"), ovn.A("fffe"), ovn.A("0000ffff"), ovn.A("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = StringsKt.a0(StringsKt.Y(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(u7e u7eVar, u7e u7eVar2) {
        u7eVar.getClass();
        u7eVar2.getClass();
        return Intrinsics.d(u7eVar.d, u7eVar2.d) && u7eVar.e == u7eVar2.e && Intrinsics.d(u7eVar.a, u7eVar2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            wb8.h(str.concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            xq0.q("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            xq0.o(str.concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        xq0.o(str.concat(" too small."));
        return 0;
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.d(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (StringsKt.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, char c2, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int h(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return g(str, c2, i, i2);
    }

    public static final String i(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                c7 c7Var = new c7(strArr2);
                while (c7Var.hasNext()) {
                    if (comparator.compare(str, (String) c7Var.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(l3o l3oVar) {
        String a2 = l3oVar.f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(u75.h(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.e(charAt, 31) <= 0 || Intrinsics.e(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        str.getClass();
        return c.o(str, "Authorization", true) || c.o(str, "Cookie", true) || c.o(str, "Proxy-Authorization", true) || c.o(str, "Set-Cookie", true);
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

    public static final Charset s(ij3 ij3Var, Charset charset) {
        ij3Var.getClass();
        charset.getClass();
        int h0 = ij3Var.h0(d);
        if (h0 == -1) {
            return charset;
        }
        if (h0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (h0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (h0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (h0 == 3) {
            Charsets.a.getClass();
            Charset charset5 = Charsets.c;
            if (charset5 != null) {
                return charset5;
            }
            Charset forName = Charset.forName("UTF-32BE");
            forName.getClass();
            Charsets.c = forName;
            return forName;
        }
        if (h0 != 4) {
            wvs.b();
            return null;
        }
        Charsets.a.getClass();
        Charset charset6 = Charsets.b;
        if (charset6 != null) {
            return charset6;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        forName2.getClass();
        Charsets.b = forName2;
        return forName2;
    }

    public static final int t(ij3 ij3Var) {
        ij3Var.getClass();
        return (ij3Var.readByte() & 255) | ((ij3Var.readByte() & 255) << 16) | ((ij3Var.readByte() & 255) << 8);
    }

    public static final boolean u(n3r n3rVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c2 = n3rVar.i().e() ? n3rVar.i().c() - nanoTime : Long.MAX_VALUE;
        n3rVar.i().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            hi3 hi3Var = new hi3();
            while (n3rVar.e0(hi3Var, 8192L) != -1) {
                hi3Var.b();
            }
            if (c2 == Long.MAX_VALUE) {
                n3rVar.i().a();
                return true;
            }
            n3rVar.i().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                n3rVar.i().a();
                return false;
            }
            n3rVar.i().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                n3rVar.i().a();
            } else {
                n3rVar.i().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final zvd v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wtd wtdVar = (wtd) it.next();
            pn3 pn3Var = wtdVar.a;
            pn3 pn3Var2 = wtdVar.b;
            String u = pn3Var.u();
            String u2 = pn3Var2.u();
            arrayList.add(u);
            arrayList.add(StringsKt.t0(u2).toString());
        }
        return new zvd((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(u7e u7eVar, boolean z) {
        u7eVar.getClass();
        String str = u7eVar.d;
        int i = u7eVar.e;
        if (StringsKt.M(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = ouj.k(']', "[", str);
        }
        if (!z) {
            String str2 = u7eVar.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List x(List list) {
        list.getClass();
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
