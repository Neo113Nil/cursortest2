package j8;

import Q7.j;
import Q7.q;
import i8.l;
import i8.n;
import i8.r;
import i8.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import p8.C4858d;
import v7.AbstractC5118i;
import v7.C5125p;
import w.AbstractC5128c;
import y8.e;
import y8.x;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f38495a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f38496b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        h.b(timeZone);
        f38495a = timeZone;
        String x02 = j.x0(r.class.getName(), "okhttp3.");
        if (q.a0(x02, "Client")) {
            x02 = x02.substring(0, x02.length() - 6);
            h.d(x02, "substring(...)");
        }
        f38496b = x02;
    }

    public static final boolean a(n nVar, n other) {
        h.e(nVar, "<this>");
        h.e(other, "other");
        return h.a(nVar.f38281d, other.f38281d) && nVar.f38282e == other.f38282e && h.a(nVar.f38278a, other.f38278a);
    }

    public static final int b(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        h.e(unit, "unit");
        if (j6 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j6);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        h.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e9) {
            throw e9;
        } catch (RuntimeException e10) {
            if (!h.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean d(x xVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h.e(timeUnit, "timeUnit");
        try {
            return g(xVar, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String e(String format, Object... objArr) {
        h.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long f(v vVar) {
        String a9 = vVar.f38376y.a("Content-Length");
        if (a9 == null) {
            return -1L;
        }
        byte[] bArr = c.f38494a;
        try {
            return Long.parseLong(a9);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean g(x xVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c9 = xVar.L().e() ? xVar.L().c() - nanoTime : Long.MAX_VALUE;
        xVar.L().d(Math.min(c9, timeUnit.toNanos(i)) + nanoTime);
        try {
            e eVar = new e();
            while (xVar.d(8192L, eVar) != -1) {
                eVar.H(eVar.f41924u);
            }
            if (c9 == Long.MAX_VALUE) {
                xVar.L().a();
                return true;
            }
            xVar.L().d(nanoTime + c9);
            return true;
        } catch (InterruptedIOException unused) {
            if (c9 == Long.MAX_VALUE) {
                xVar.L().a();
                return false;
            }
            xVar.L().d(nanoTime + c9);
            return false;
        } catch (Throwable th) {
            if (c9 == Long.MAX_VALUE) {
                xVar.L().a();
            } else {
                xVar.L().d(nanoTime + c9);
            }
            throw th;
        }
    }

    public static final l h(List list) {
        I1.d dVar = new I1.d(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4858d c4858d = (C4858d) it.next();
            X2.a.b(dVar, c4858d.f39878a.l(), c4858d.f39879b.l());
        }
        return dVar.e();
    }

    public static final String i(n nVar, boolean z6) {
        h.e(nVar, "<this>");
        String str = nVar.f38281d;
        if (j.k0(str, ":", false)) {
            str = AbstractC5128c.b(']', "[", str);
        }
        int i = nVar.f38282e;
        if (!z6) {
            String scheme = nVar.f38278a;
            h.e(scheme, "scheme");
            if (i == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List j(List list) {
        h.e(list, "<this>");
        if (list.isEmpty()) {
            return C5125p.f41221n;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            h.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        h.d(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(AbstractC5118i.t(array));
        h.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C5125p.f41221n;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            h.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(AbstractC5118i.t((Object[]) objArr.clone()));
        h.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
