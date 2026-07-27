package a;

import D.y;
import J7.c;
import M7.q;
import N1.f;
import N7.b;
import O2.w;
import U.e;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import com.bumptech.glide.d;
import g1.C4524d;
import h3.i;
import h3.k;
import h3.l;
import h3.n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import r7.AbstractC4974e;
import u2.j;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0415a {
    public static boolean A(Context context, int i, boolean z8) {
        TypedValue z9 = z(context, i);
        return (z9 == null || z9.type != 18) ? z8 : z9.data != 0;
    }

    public static TypedValue B(Context context, String str, int i) {
        TypedValue z8 = z(context, i);
        if (z8 != null) {
            return z8;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static J7.a C(c cVar, int i) {
        h.e(cVar, "<this>");
        boolean z8 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z8) {
            if (cVar.f1466v <= 0) {
                i = -i;
            }
            return new J7.a(cVar.f1464n, cVar.f1465u, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final long D(long j9, N7.c unit) {
        h.e(unit, "unit");
        N7.c cVar = N7.c.f2204u;
        long f6 = d.f(4611686018426999999L, cVar, unit);
        if ((-f6) <= j9 && j9 <= f6) {
            return p(d.f(j9, unit, cVar));
        }
        N7.c targetUnit = N7.c.f2205v;
        h.e(targetUnit, "targetUnit");
        return n(i(targetUnit.f2210n.convert(j9, unit.f2210n)));
    }

    public static c E(int i, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new c(i, i4 - 1, 1);
        }
        c cVar = c.f1471w;
        return c.f1471w;
    }

    public static int F(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int G(long j9) {
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (((-16384) & j9) == 0) {
            return 2;
        }
        if (((-2097152) & j9) == 0) {
            return 3;
        }
        if (((-268435456) & j9) == 0) {
            return 4;
        }
        if (((-34359738368L) & j9) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j9) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j9) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j9) == 0) {
            return 8;
        }
        return (j9 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static Object H(n nVar) {
        if (nVar.i()) {
            return nVar.g();
        }
        if (nVar.f38223d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(nVar.f());
    }

    public static W2.c I(Context context) {
        try {
            return W2.c.c(context, W2.c.f3426b);
        } catch (Exception e6) {
            throw new j(e6);
        }
    }

    public static final long b(String str) {
        N7.c cVar;
        long o9;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = N7.a.f2200w;
        char charAt2 = str.charAt(0);
        int i4 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z8 = (i4 > 0) && M7.j.d0('-', str);
        if (length <= i4) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i4) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i4 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        N7.c cVar2 = null;
        long j9 = 0;
        boolean z9 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (charAt = str.charAt(i10)) && charAt < ':') || M7.j.M("+-.", charAt))) {
                    i10++;
                }
                String substring = str.substring(i9, i10);
                h.d(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z9) {
                    if (charAt3 == 'H') {
                        cVar = N7.c.f2208y;
                    } else if (charAt3 == 'M') {
                        cVar = N7.c.f2207x;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = N7.c.f2206w;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = N7.c.f2209z;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int Q3 = M7.j.Q(substring, '.', 0, 6);
                if (cVar != N7.c.f2206w || Q3 <= 0) {
                    j9 = N7.a.e(j9, D(x(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, Q3);
                    h.d(substring2, "substring(...)");
                    long e6 = N7.a.e(j9, D(x(substring2), cVar));
                    String substring3 = substring.substring(Q3);
                    h.d(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double e9 = d.e(parseDouble, cVar, N7.c.f2204u);
                    if (Double.isNaN(e9)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(e9)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long round = Math.round(e9);
                    if (-4611686018426999999L > round || round >= 4611686018427000000L) {
                        double e10 = d.e(parseDouble, cVar, N7.c.f2205v);
                        if (Double.isNaN(e10)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        o9 = o(Math.round(e10));
                    } else {
                        o9 = p(round);
                    }
                    j9 = N7.a.e(e6, o9);
                }
                cVar2 = cVar;
                i9 = i11;
            } else {
                if (z9 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z9 = true;
            }
        }
        if (!z8) {
            return j9;
        }
        long j10 = ((-(j9 >> 1)) << 1) + (((int) j9) & 1);
        int i12 = b.f2202a;
        return j10;
    }

    public static final boolean c(Object[] objArr, int i, int i4, List list) {
        if (i4 == list.size()) {
            for (int i9 = 0; i9 < i4; i9++) {
                if (h.a(objArr[i + i9], list.get(i9))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String d(Object[] objArr, int i, int i4, AbstractC4974e abstractC4974e) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i4; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i9];
            if (obj == abstractC4974e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object e(n nVar) {
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(nVar, "Task must not be null");
        if (nVar.h()) {
            return H(nVar);
        }
        C4524d c4524d = new C4524d(22);
        f fVar = i.f38208b;
        nVar.c(fVar, c4524d);
        nVar.b(fVar, c4524d);
        nVar.f38221b.f(new k(fVar, (h3.b) c4524d));
        nVar.o();
        ((CountDownLatch) c4524d.f37858u).await();
        return H(nVar);
    }

    public static Object f(n nVar, long j9) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(nVar, "Task must not be null");
        w.i(timeUnit, "TimeUnit must not be null");
        if (nVar.h()) {
            return H(nVar);
        }
        C4524d c4524d = new C4524d(22);
        f fVar = i.f38208b;
        nVar.c(fVar, c4524d);
        nVar.b(fVar, c4524d);
        nVar.f38221b.f(new k(fVar, (h3.b) c4524d));
        nVar.o();
        if (((CountDownLatch) c4524d.f37858u).await(j9, timeUnit)) {
            return H(nVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static n g(Callable callable, Executor executor) {
        w.i(executor, "Executor must not be null");
        n nVar = new n();
        executor.execute(new l(nVar, callable, 1, false));
        return nVar;
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d.b(th, th2);
            }
        }
    }

    public static long i(long j9) {
        if (j9 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j9 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j9;
    }

    public static float[] j(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G.i[] k(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i10 < str.length()) {
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i10++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i9, i10).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i4) == 'z' || trim.charAt(i4) == 'Z') {
                            fArr = new float[i4];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i11 = i4;
                                int i12 = 1;
                                while (i12 < length) {
                                    int i13 = i4;
                                    int i14 = i13;
                                    int i15 = i14;
                                    int i16 = i15;
                                    for (int i17 = i12; i17 < trim.length(); i17++) {
                                        char charAt2 = trim.charAt(i17);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case com.anythink.basead.b.b.j.f5969S /* 44 */:
                                                        break;
                                                    case com.anythink.basead.b.b.j.f5970T /* 45 */:
                                                        if (i17 != i12 && i13 == 0) {
                                                            i13 = 0;
                                                            i15 = 1;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        break;
                                                    case '.':
                                                        if (i14 == 0) {
                                                            i13 = 0;
                                                            i14 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        i15 = 1;
                                                        i16 = 1;
                                                        break;
                                                    default:
                                                        i13 = 0;
                                                        break;
                                                }
                                            } else {
                                                i13 = 1;
                                            }
                                            if (i15 == 0) {
                                                if (i12 < i17) {
                                                    fArr2[i11] = Float.parseFloat(trim.substring(i12, i17));
                                                    i11++;
                                                }
                                                i12 = i16 == 0 ? i17 : i17 + 1;
                                                i4 = 0;
                                            }
                                        }
                                        i13 = 0;
                                        i15 = 1;
                                        if (i15 == 0) {
                                        }
                                    }
                                    if (i12 < i17) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    i4 = 0;
                                }
                                fArr = j(fArr2, i11);
                                i4 = 0;
                            } catch (NumberFormatException e6) {
                                throw new RuntimeException(y.k("error in parsing \"", trim, "\""), e6);
                            }
                        }
                        arrayList.add(new G.i(trim.charAt(i4), fArr));
                    }
                    i9 = i10;
                    i10++;
                    i4 = 0;
                }
                i10++;
            }
            trim = str.substring(i9, i10).trim();
            if (!trim.isEmpty()) {
            }
            i9 = i10;
            i10++;
            i4 = 0;
        }
        if (i10 - i9 != 1 || i9 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new G.i(str.charAt(i9), new float[0]));
        }
        return (G.i[]) arrayList.toArray(new G.i[i]);
    }

    public static int l(String str, int i, int i4, boolean z8) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z8)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static G.i[] m(G.i[] iVarArr) {
        G.i[] iVarArr2 = new G.i[iVarArr.length];
        for (int i = 0; i < iVarArr.length; i++) {
            iVarArr2[i] = new G.i(iVarArr[i]);
        }
        return iVarArr2;
    }

    public static final long n(long j9) {
        long j10 = (j9 << 1) + 1;
        int i = N7.a.f2200w;
        int i4 = b.f2202a;
        return j10;
    }

    public static final long o(long j9) {
        return (-4611686018426L > j9 || j9 >= 4611686018427L) ? n(i(j9)) : p(j9 * 1000000);
    }

    public static final long p(long j9) {
        long j10 = j9 << 1;
        int i = N7.a.f2200w;
        int i4 = b.f2202a;
        return j10;
    }

    public static n q(Exception exc) {
        n nVar = new n();
        nVar.k(exc);
        return nVar;
    }

    public static n r(Object obj) {
        n nVar = new n();
        nVar.l(obj);
        return nVar;
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float v(EdgeEffect edgeEffect, float f6, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f6, f9);
        }
        U.d.a(edgeEffect, f6, f9);
        return f6;
    }

    public static long w(int i, String str) {
        int l9 = l(str, 0, i, false);
        Matcher matcher = e8.j.f37412n.matcher(str);
        int i4 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (l9 < i) {
            int l10 = l(str, l9 + 1, i, true);
            matcher.region(l9, l10);
            if (i9 == -1 && matcher.usePattern(e8.j.f37412n).matches()) {
                String group = matcher.group(1);
                h.d(group, "group(...)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                h.d(group2, "group(...)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                h.d(group3, "group(...)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(e8.j.f37411m).matches()) {
                String group4 = matcher.group(1);
                h.d(group4, "group(...)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = e8.j.f37410l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        h.d(group5, "group(...)");
                        Locale US = Locale.US;
                        h.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        h.d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        h.d(pattern2, "pattern(...)");
                        i11 = M7.j.R(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(e8.j.f37409k).matches()) {
                    String group6 = matcher.group(1);
                    h.d(group6, "group(...)");
                    i4 = Integer.parseInt(group6);
                }
            }
            l9 = l(str, l10 + 1, i, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i10 || i10 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f8.d.f37815a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i10);
        gregorianCalendar.set(11, i9);
        gregorianCalendar.set(12, i12);
        gregorianCalendar.set(13, i13);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final long x(String str) {
        char charAt;
        int length = str.length();
        int i = (length <= 0 || !M7.j.M("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i4 = i;
            while (true) {
                if (i < length) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i4 == i) {
                        i4++;
                    }
                    i++;
                } else if (length - i4 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!q.I(str, "+") || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(M7.j.N(1, str));
    }

    public static final void y(Object[] objArr, int i, int i4) {
        h.e(objArr, "<this>");
        while (i < i4) {
            objArr[i] = null;
            i++;
        }
    }

    public static TypedValue z(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public abstract View t(int i);

    public abstract boolean u();
}
