package S0;

import D.x;
import S7.AbstractC0387a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import androidx.fragment.app.C0465d;
import com.google.android.gms.internal.ads.Wv;
import f6.C4522a;
import i8.u;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n4.C4773a;
import u7.v;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f2910a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2911b;

    public static String A(int i, int i4, String str) {
        if (i < 0) {
            return X2.a.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return X2.a.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(x.k(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
    }

    public static final long a(String str) {
        R7.c cVar;
        long k9;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = R7.a.f2887w;
        char charAt2 = str.charAt(0);
        int i4 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z6 = (i4 > 0) && Q7.j.C0('-', str);
        if (length <= i4) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i4) != 'P') {
            throw new IllegalArgumentException();
        }
        int i6 = i4 + 1;
        if (i6 == length) {
            throw new IllegalArgumentException();
        }
        R7.c cVar2 = null;
        long j6 = 0;
        boolean z9 = false;
        while (i6 < length) {
            if (str.charAt(i6) != 'T') {
                int i9 = i6;
                while (i9 < str.length() && (('0' <= (charAt = str.charAt(i9)) && charAt < ':') || Q7.j.l0("+-.", charAt))) {
                    i9++;
                }
                String substring = str.substring(i6, i9);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i6;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i10 = length2 + 1;
                if (z9) {
                    if (charAt3 == 'H') {
                        cVar = R7.c.f2895y;
                    } else if (charAt3 == 'M') {
                        cVar = R7.c.f2894x;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = R7.c.f2893w;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = R7.c.f2896z;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int p02 = Q7.j.p0(substring, '.', 0, 6);
                if (cVar != R7.c.f2893w || p02 <= 0) {
                    j6 = R7.a.e(j6, w(q(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, p02);
                    kotlin.jvm.internal.h.d(substring2, "substring(...)");
                    long e9 = R7.a.e(j6, w(q(substring2), cVar));
                    String substring3 = substring.substring(p02);
                    kotlin.jvm.internal.h.d(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double c9 = X2.a.c(parseDouble, cVar, R7.c.f2891u);
                    if (Double.isNaN(c9)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(c9)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long round = Math.round(c9);
                    if (-4611686018426999999L > round || round >= 4611686018427000000L) {
                        double c10 = X2.a.c(parseDouble, cVar, R7.c.f2892v);
                        if (Double.isNaN(c10)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        k9 = k(Math.round(c10));
                    } else {
                        k9 = l(round);
                    }
                    j6 = R7.a.e(e9, k9);
                }
                cVar2 = cVar;
                i6 = i10;
            } else {
                if (z9 || (i6 = i6 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z9 = true;
            }
        }
        if (!z6) {
            return j6;
        }
        long j9 = ((-(j6 >> 1)) << 1) + (((int) j6) & 1);
        int i11 = R7.b.f2889a;
        return j9;
    }

    public static void b(int i, int i4, int i6) {
        if (i < 0 || i4 > i6) {
            StringBuilder j6 = Wv.j(i, i4, "startIndex: ", ", endIndex: ", ", size: ");
            j6.append(i6);
            throw new IndexOutOfBoundsException(j6.toString());
        }
        if (i > i4) {
            throw new IllegalArgumentException(AbstractC5128c.c(i, i4, "startIndex: ", " > endIndex: "));
        }
    }

    public static void c(int i, int i4, int i6) {
        if (i < 0 || i4 > i6) {
            StringBuilder j6 = Wv.j(i, i4, "fromIndex: ", ", toIndex: ", ", size: ");
            j6.append(i6);
            throw new IndexOutOfBoundsException(j6.toString());
        }
        if (i > i4) {
            throw new IllegalArgumentException(AbstractC5128c.c(i, i4, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int d(int i, int i4, int i6) {
        return i < i4 ? i4 : i > i6 ? i6 : i;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long f(long j6) {
        if (j6 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j6 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j6;
    }

    public static boolean g(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean h3 = h(file, inputStream);
                e(inputStream);
                return h3;
            } catch (Throwable th) {
                th = th;
                e(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static T3.b i(String str, String str2) {
        C4773a c4773a = new C4773a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(T3.r.a(C4773a.class));
        return new T3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new J3.l(2, c4773a), hashSet3);
    }

    public static final long j(long j6) {
        long j9 = (j6 << 1) + 1;
        int i = R7.a.f2887w;
        int i4 = R7.b.f2889a;
        return j9;
    }

    public static final long k(long j6) {
        return (-4611686018426L > j6 || j6 >= 4611686018427L) ? j(f(j6)) : l(j6 * 1000000);
    }

    public static final long l(long j6) {
        long j9 = j6 << 1;
        int i = R7.a.f2887w;
        int i4 = R7.b.f2889a;
        return j9;
    }

    public static T3.b m(String str, D0.n nVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(T3.r.a(C4773a.class));
        for (Class cls : new Class[0]) {
            com.bumptech.glide.g.g(cls, "Null interface");
            hashSet.add(T3.r.a(cls));
        }
        T3.j a9 = T3.j.a(Context.class);
        if (hashSet.contains(a9.f3192a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        return new T3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0465d(6, str, nVar), hashSet3);
    }

    public static File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean o() {
        boolean isEnabled;
        try {
            if (f2911b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2911b == null) {
                f2910a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2911b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2911b.invoke(null, Long.valueOf(f2910a))).booleanValue();
        } catch (Exception e9) {
            if (!(e9 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e9);
                return false;
            }
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static MappedByteBuffer p(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv, null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long q(String str) {
        char charAt;
        int length = str.length();
        int i = (length <= 0 || !Q7.j.l0("+-", str.charAt(0))) ? 0 : 1;
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
        return (!Q7.q.h0(str, "+") || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(Q7.j.m0(1, str));
    }

    public static C4522a r(List list) {
        K1.c cVar = new K1.c(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H6.j jVar = (H6.j) it.next();
            String str = jVar.f1272v;
            H6.b bVar = jVar.f1273w;
            String str2 = bVar.f1254v;
            f6.b bVar2 = f6.b.f37478n;
            if (str2 != null) {
                cVar.c(k6.e.a(bVar2, str), bVar.f1254v);
            } else {
                Boolean bool = bVar.f1255w;
                if (bool != null) {
                    cVar.c(k6.e.a(f6.b.f37479u, str), bool);
                } else {
                    Long l9 = bVar.f1256x;
                    if (l9 != null) {
                        cVar.c(k6.e.a(f6.b.f37480v, str), l9);
                    } else {
                        Double d9 = bVar.f1257y;
                        if (d9 != null) {
                            cVar.c(k6.e.a(f6.b.f37481w, str), d9);
                        } else {
                            H6.d dVar = bVar.f1258z;
                            if (dVar != null) {
                                List list2 = dVar.f1260v;
                                H6.b bVar3 = (H6.b) list2.get(0);
                                if (bVar3.f1254v != null) {
                                    k6.e a9 = k6.e.a(f6.b.f37482x, str);
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((H6.b) it2.next()).f1254v);
                                    }
                                    cVar.c(a9, arrayList);
                                } else if (bVar3.f1255w != null) {
                                    k6.e a10 = k6.e.a(f6.b.f37483y, str);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(((H6.b) it3.next()).f1255w);
                                    }
                                    cVar.c(a10, arrayList2);
                                } else if (bVar3.f1256x != null) {
                                    k6.e a11 = k6.e.a(f6.b.f37484z, str);
                                    ArrayList arrayList3 = new ArrayList(list2.size());
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList3.add(((H6.b) it4.next()).f1256x);
                                    }
                                    cVar.c(a11, arrayList3);
                                } else {
                                    if (bVar3.f1257y == null) {
                                        throw new UnsupportedOperationException();
                                    }
                                    k6.e a12 = k6.e.a(f6.b.f37476A, str);
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(((H6.b) it5.next()).f1257y);
                                    }
                                    cVar.c(a12, arrayList4);
                                }
                            } else {
                                cVar.c(k6.e.a(bVar2, str), "");
                            }
                        }
                    }
                }
            }
        }
        return cVar.a();
    }

    public static void s(I7.p pVar, AbstractC0387a abstractC0387a, AbstractC0387a abstractC0387a2) {
        try {
            X7.a.h(v.f41073a, A8.b.n(A8.b.g(pVar, abstractC0387a, abstractC0387a2)));
        } catch (Throwable th) {
            abstractC0387a2.resumeWith(Q3.b.b(th));
            throw th;
        }
    }

    public static N7.a t(N7.c cVar, int i) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        boolean z6 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z6) {
            if (cVar.f2107v <= 0) {
                i = -i;
            }
            return new N7.a(cVar.f2105n, cVar.f2106u, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final i8.v u(i8.v vVar) {
        kotlin.jvm.internal.h.e(vVar, "<this>");
        u b9 = vVar.b();
        i8.x xVar = vVar.f38377z;
        b9.f38355g = new j8.a(xVar.j(), xVar.b());
        return b9.a();
    }

    public static int v(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final long w(long j6, R7.c unit) {
        kotlin.jvm.internal.h.e(unit, "unit");
        R7.c cVar = R7.c.f2891u;
        long d9 = X2.a.d(4611686018426999999L, cVar, unit);
        if ((-d9) <= j6 && j6 <= d9) {
            return l(X2.a.d(j6, unit, cVar));
        }
        R7.c targetUnit = R7.c.f2892v;
        kotlin.jvm.internal.h.e(targetUnit, "targetUnit");
        return j(f(targetUnit.f2897n.convert(j6, unit.f2897n)));
    }

    public static N7.c x(int i, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new N7.c(i, i4 - 1, 1);
        }
        N7.c cVar = N7.c.f2112w;
        return N7.c.f2112w;
    }

    public static void y(int i, int i4) {
        String r9;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                r9 = X2.a.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(x.k(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
                }
                r9 = X2.a.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(r9);
        }
    }

    public static void z(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? A(i, i6, "start index") : (i4 < 0 || i4 > i6) ? A(i4, i6, "end index") : X2.a.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }
}
