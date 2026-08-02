package com.anythink.core.common.n.b.a;

import D.y;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.x;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.o;
import com.anythink.core.common.n.c.w;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15036a;

    /* renamed from: d, reason: collision with root package name */
    public static final ag f15039d;

    /* renamed from: e, reason: collision with root package name */
    public static final ae f15040e;

    /* renamed from: k, reason: collision with root package name */
    private static final Method f15045k;

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f15046l;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15037b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final u f15038c = u.a(new String[0]);

    /* renamed from: h, reason: collision with root package name */
    private static final o f15043h = o.a(f.c("efbbbf"), f.c("feff"), f.c("fffe"), f.c("0000ffff"), f.c("ffff0000"));
    private static final Charset i = Charset.forName("UTF-32BE");

    /* renamed from: j, reason: collision with root package name */
    private static final Charset f15044j = Charset.forName("UTF-32LE");

    /* renamed from: f, reason: collision with root package name */
    public static final TimeZone f15041f = TimeZone.getTimeZone("GMT");

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<String> f15042g = new L.b(1);

    static {
        byte[] bArr = new byte[0];
        f15036a = bArr;
        Method method = null;
        f15039d = ag.a((x) null, bArr);
        f15040e = ae.a((x) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f15045k = method;
        f15046l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private c() {
    }

    public static int a(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 < 'A' || c9 > 'F') {
            return -1;
        }
        return c9 - '7';
    }

    public static String c(String str, int i6, int i9) {
        int a9 = a(str, i6, i9);
        return str.substring(a9, b(str, a9, i9));
    }

    private static boolean d(String str) {
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = f15045k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void a(long j6, long j9) {
        if (j9 < 0 || 0 > j6 || j6 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean c(String str) {
        return f15046l.matcher(str).matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if ((r13 - r9) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0091, code lost:
    
        r3[r11] = (byte) r14;
        r10 = r18;
        r11 = r11 + 1;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InetAddress d(String str, int i6, int i9) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        int i10;
        byte[] bArr = new byte[16];
        int i11 = i6;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i11 >= i9) {
                inetAddress = null;
                break;
            }
            if (i12 != 16) {
                int i15 = i11 + 2;
                if (i15 <= i9 && str.regionMatches(i11, "::", 0, 2)) {
                    if (i13 == -1) {
                        i12 += 2;
                        i13 = i12;
                        inetAddress = null;
                        if (i15 != i9) {
                            i14 = i15;
                            int i16 = 0;
                            i11 = i14;
                            while (i11 < i9) {
                            }
                            i10 = i11 - i14;
                            if (i10 == 0) {
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    return null;
                }
                if (i12 == 0) {
                    inetAddress = null;
                    i14 = i11;
                } else if (str.regionMatches(i11, ":", 0, 1)) {
                    i14 = i11 + 1;
                    inetAddress = null;
                } else {
                    if (!str.regionMatches(i11, j.f12378z, 0, 1)) {
                        return null;
                    }
                    int i17 = i12 - 2;
                    int i18 = i17;
                    while (i14 < i9) {
                        if (i18 != 16) {
                            if (i18 != i17) {
                                if (str.charAt(i14) == '.') {
                                    i14++;
                                }
                            }
                            int i19 = 0;
                            int i20 = i14;
                            while (true) {
                                if (i20 >= i9) {
                                    inetAddress2 = inetAddress3;
                                    break;
                                }
                                char charAt = str.charAt(i20);
                                inetAddress2 = inetAddress3;
                                if (charAt < '0' || charAt > '9') {
                                    break;
                                }
                                if ((i19 == 0 && i14 != i20) || ((i19 * 10) + charAt) - 48 > 255) {
                                    return inetAddress2;
                                }
                                i20++;
                                inetAddress3 = inetAddress2;
                            }
                        }
                        return inetAddress3;
                    }
                    inetAddress = inetAddress3;
                    if (i18 != i12 + 2) {
                        return inetAddress;
                    }
                    i12 += 2;
                }
                int i162 = 0;
                i11 = i14;
                while (i11 < i9) {
                    int a9 = a(str.charAt(i11));
                    if (a9 == -1) {
                        break;
                    }
                    i162 = (i162 << 4) + a9;
                    i11++;
                }
                i10 = i11 - i14;
                if (i10 == 0 || i10 > 4) {
                    break;
                }
                int i21 = i12 + 1;
                bArr[i12] = (byte) (255 & (i162 >>> 8));
                i12 += 2;
                bArr[i21] = (byte) (i162 & p.f8473b);
            } else {
                return null;
            }
        }
        if (i12 != 16) {
            if (i13 == -1) {
                return inetAddress;
            }
            int i22 = i12 - i13;
            System.arraycopy(bArr, i13, bArr, 16 - i22, i22);
            Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    public static int b(String str, int i6, int i9) {
        for (int i10 = i9 - 1; i10 >= i6; i10--) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10 + 1;
            }
        }
        return i6;
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e9) {
                if (!a(e9)) {
                    throw e9;
                }
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static int b(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt <= 31 || charAt >= 127) {
                return i6;
            }
        }
        return -1;
    }

    public static u b(List<com.anythink.core.common.n.b.a.e.c> list) {
        u.a aVar = new u.a();
        for (com.anythink.core.common.n.b.a.e.c cVar : list) {
            a.f14869a.a(aVar, cVar.f15133l.a(), cVar.f15134m.a());
        }
        return aVar.a();
    }

    private static void a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(w wVar, TimeUnit timeUnit) {
        try {
            return a(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(w wVar, int i6, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long g_ = wVar.a().f_() ? wVar.a().g_() - nanoTime : Long.MAX_VALUE;
        wVar.a().a(Math.min(g_, timeUnit.toNanos(i6)) + nanoTime);
        try {
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            while (wVar.a_(cVar, 8192L) != -1) {
                cVar.z();
            }
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
                return true;
            }
            wVar.a().a(nanoTime + g_);
            return true;
        } catch (InterruptedIOException unused) {
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
                return false;
            }
            wVar.a().a(nanoTime + g_);
            return false;
        } catch (Throwable th) {
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
            } else {
                wVar.a().a(nanoTime + g_);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(String str, boolean z3) {
        return new e(0, str, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, boolean z3, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z3);
        return thread;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i6++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String a(v vVar, boolean z3) {
        String f3;
        if (vVar.f().contains(":")) {
            f3 = "[" + vVar.f() + "]";
        } else {
            f3 = vVar.f();
        }
        if (!z3 && vVar.g() == v.a(vVar.b())) {
            return f3;
        }
        StringBuilder c9 = AbstractC5049e.c(f3, ":");
        c9.append(vVar.g());
        return c9.toString();
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (comparator.compare(strArr[i6], str) == 0) {
                return i6;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static int a(String str, int i6, int i9) {
        while (i6 < i9) {
            char charAt = str.charAt(i6);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i9;
    }

    public static int a(String str, int i6, int i9, String str2) {
        while (i6 < i9) {
            if (str2.indexOf(str.charAt(i6)) != -1) {
                return i6;
            }
            i6++;
        }
        return i9;
    }

    public static int a(String str, int i6, int i9, char c9) {
        while (i6 < i9) {
            if (str.charAt(i6) == c9) {
                return i6;
            }
            i6++;
        }
        return i9;
    }

    public static String a(String str) {
        InetAddress d2;
        if (str.contains(":")) {
            int i6 = 0;
            if (str.startsWith("[") && str.endsWith("]")) {
                d2 = d(str, 1, str.length() - 1);
            } else {
                d2 = d(str, 0, str.length());
            }
            if (d2 == null) {
                return null;
            }
            byte[] address = d2.getAddress();
            if (address.length == 16) {
                int i9 = -1;
                int i10 = 0;
                int i11 = 0;
                while (i10 < address.length) {
                    int i12 = i10;
                    while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                        i12 += 2;
                    }
                    int i13 = i12 - i10;
                    if (i13 > i11 && i13 >= 4) {
                        i9 = i10;
                        i11 = i13;
                    }
                    i10 = i12 + 2;
                }
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                while (i6 < address.length) {
                    if (i6 == i9) {
                        cVar.l(58);
                        i6 += i11;
                        if (i6 == 16) {
                            cVar.l(58);
                        }
                    } else {
                        if (i6 > 0) {
                            cVar.l(58);
                        }
                        cVar.n(((address[i6] & 255) << 8) | (address[i6 + 1] & 255));
                        i6 += 2;
                    }
                }
                return cVar.u();
            }
            if (address.length == 4) {
                return d2.getHostAddress();
            }
            throw new AssertionError(y.o("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (d(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(com.anythink.core.common.n.c.e eVar, Charset charset) {
        int a9 = eVar.a(f15043h);
        if (a9 == -1) {
            return charset;
        }
        if (a9 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (a9 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (a9 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (a9 == 3) {
            return i;
        }
        if (a9 == 4) {
            return f15044j;
        }
        throw new AssertionError();
    }

    public static int a(String str, long j6, TimeUnit timeUnit) {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC4404f.f(str, " < 0"));
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j6);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(AbstractC4404f.f(str, " too large."));
            }
            if (millis != 0 || j6 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(AbstractC4404f.f(str, " too small."));
        }
        throw new NullPointerException("unit == null");
    }

    private static boolean a(String str, int i6, int i9, byte[] bArr, int i10) {
        int i11 = i10;
        while (i6 < i9) {
            if (i11 == 16) {
                return false;
            }
            if (i11 != i10) {
                if (str.charAt(i6) != '.') {
                    return false;
                }
                i6++;
            }
            int i12 = i6;
            int i13 = 0;
            while (i12 < i9) {
                char charAt = str.charAt(i12);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i13 == 0 && i6 != i12) || (i13 = ((i13 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i6 == 0) {
                return false;
            }
            bArr[i11] = (byte) i13;
            i11++;
            i6 = i12;
        }
        return i11 == i10 + 4;
    }

    private static String a(byte[] bArr) {
        int i6 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10;
            while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i6 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        while (i9 < bArr.length) {
            if (i9 == i6) {
                cVar.l(58);
                i9 += i11;
                if (i9 == 16) {
                    cVar.l(58);
                }
            } else {
                if (i9 > 0) {
                    cVar.l(58);
                }
                cVar.n(((bArr[i9] & 255) << 8) | (bArr[i9 + 1] & 255));
                i9 += 2;
            }
        }
        return cVar.u();
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e9) {
            throw new AssertionError("No System TLS", e9);
        }
    }

    public static List<com.anythink.core.common.n.b.a.e.c> a(u uVar) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < uVar.a(); i6++) {
            arrayList.add(new com.anythink.core.common.n.b.a.e.c(uVar.a(i6), uVar.b(i6)));
        }
        return arrayList;
    }

    public static String a(String str, String str2) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (AccessControlException unused) {
        }
        return property != null ? property : str2;
    }

    public static boolean a(v vVar, v vVar2) {
        return vVar.f().equals(vVar2.f()) && vVar.g() == vVar2.g() && vVar.b().equals(vVar2.b());
    }
}
