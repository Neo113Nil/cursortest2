package f8;

import M7.j;
import M7.q;
import e8.m;
import e8.o;
import e8.s;
import e8.w;
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
import l8.C4712d;
import r7.AbstractC4978i;
import r7.C4985p;
import t0.AbstractC5051n;
import u8.e;
import u8.x;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f37815a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f37816b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        h.b(timeZone);
        f37815a = timeZone;
        String Y = j.Y(s.class.getName(), "okhttp3.");
        if (q.B(Y, "Client")) {
            Y = Y.substring(0, Y.length() - 6);
            h.d(Y, "substring(...)");
        }
        f37816b = Y;
    }

    public static final boolean a(o oVar, o other) {
        h.e(oVar, "<this>");
        h.e(other, "other");
        return h.a(oVar.f37440d, other.f37440d) && oVar.f37441e == other.f37441e && h.a(oVar.f37437a, other.f37437a);
    }

    public static final int b(long j9) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        h.e(unit, "unit");
        if (j9 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j9);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j9 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        h.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e9) {
            if (!h.a(e9.getMessage(), "bio == null")) {
                throw e9;
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

    public static final long f(w wVar) {
        String a9 = wVar.f37535y.a("Content-Length");
        if (a9 == null) {
            return -1L;
        }
        byte[] bArr = c.f37814a;
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
        long c4 = xVar.L().e() ? xVar.L().c() - nanoTime : Long.MAX_VALUE;
        xVar.L().d(Math.min(c4, timeUnit.toNanos(i)) + nanoTime);
        try {
            e eVar = new e();
            while (xVar.f(8192L, eVar) != -1) {
                eVar.H(eVar.f41277u);
            }
            if (c4 == Long.MAX_VALUE) {
                xVar.L().a();
                return true;
            }
            xVar.L().d(nanoTime + c4);
            return true;
        } catch (InterruptedIOException unused) {
            if (c4 == Long.MAX_VALUE) {
                xVar.L().a();
                return false;
            }
            xVar.L().d(nanoTime + c4);
            return false;
        } catch (Throwable th) {
            if (c4 == Long.MAX_VALUE) {
                xVar.L().a();
            } else {
                xVar.L().d(nanoTime + c4);
            }
            throw th;
        }
    }

    public static final m h(List list) {
        I1.b bVar = new I1.b(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4712d c4712d = (C4712d) it.next();
            K3.b.b(bVar, c4712d.f39111a.l(), c4712d.f39112b.l());
        }
        return bVar.f();
    }

    public static final String i(o oVar, boolean z8) {
        h.e(oVar, "<this>");
        String str = oVar.f37440d;
        if (j.L(str, ":", false)) {
            str = AbstractC5051n.b(']', "[", str);
        }
        int i = oVar.f37441e;
        if (!z8) {
            String scheme = oVar.f37437a;
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
            return C4985p.f40358n;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            h.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        h.d(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(AbstractC4978i.H(array));
        h.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C4985p.f40358n;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            h.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(AbstractC4978i.H((Object[]) objArr.clone()));
        h.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
