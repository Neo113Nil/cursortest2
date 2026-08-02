package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.exoplayer.j.s;
import com.anythink.basead.exoplayer.k.af;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8976a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8977b = 8000;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8978d = "DefaultHttpDataSource";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8979e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final long f8980f = 2048;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8981g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference<byte[]> f8982h = new AtomicReference<>();
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8983j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8984k;

    /* renamed from: l, reason: collision with root package name */
    private final String f8985l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.u<String> f8986m;

    /* renamed from: n, reason: collision with root package name */
    private final s.f f8987n;

    /* renamed from: o, reason: collision with root package name */
    private final s.f f8988o;

    /* renamed from: p, reason: collision with root package name */
    private final aa<? super p> f8989p;

    /* renamed from: q, reason: collision with root package name */
    private k f8990q;

    /* renamed from: r, reason: collision with root package name */
    private HttpURLConnection f8991r;

    /* renamed from: s, reason: collision with root package name */
    private InputStream f8992s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8993t;

    /* renamed from: u, reason: collision with root package name */
    private long f8994u;

    /* renamed from: v, reason: collision with root package name */
    private long f8995v;

    /* renamed from: w, reason: collision with root package name */
    private long f8996w;

    /* renamed from: x, reason: collision with root package name */
    private long f8997x;

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar) {
        this(str, uVar, null);
    }

    private HttpURLConnection e() {
        return this.f8991r;
    }

    private long f() {
        return this.f8996w;
    }

    private long g() {
        return this.f8997x;
    }

    private long h() {
        long j6 = this.f8995v;
        return j6 == -1 ? j6 : j6 - this.f8997x;
    }

    private void i() {
        if (this.f8996w == this.f8994u) {
            return;
        }
        byte[] andSet = f8982h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j6 = this.f8996w;
            long j9 = this.f8994u;
            if (j6 == j9) {
                f8982h.set(andSet);
                return;
            }
            int read = this.f8992s.read(andSet, 0, (int) Math.min(j9 - j6, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.f8996w += read;
            aa<? super p> aaVar = this.f8989p;
            if (aaVar != null) {
                aaVar.a(read);
            }
        }
    }

    private void j() {
        HttpURLConnection httpURLConnection = this.f8991r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                Log.e(f8978d, "Unexpected error while disconnecting", e9);
            }
            this.f8991r = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f8991r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        if (r3 > com.anythink.basead.exoplayer.j.p.f8980f) goto L23;
     */
    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        try {
            if (this.f8992s != null) {
                HttpURLConnection httpURLConnection = this.f8991r;
                long j6 = this.f8995v;
                if (j6 != -1) {
                    j6 -= this.f8997x;
                }
                int i = af.f9132a;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j6 == -1) {
                            if (inputStream.read() == -1) {
                            }
                        }
                        String name = inputStream.getClass().getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f8992s.close();
                } catch (IOException e9) {
                    throw new s.c(e9, this.f8990q, 3);
                }
            }
            this.f8992s = null;
            j();
            if (this.f8993t) {
                this.f8993t = false;
                aa<? super p> aaVar = this.f8989p;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        } catch (Throwable th) {
            this.f8992s = null;
            j();
            if (this.f8993t) {
                this.f8993t = false;
                aa<? super p> aaVar2 = this.f8989p;
                if (aaVar2 != null) {
                    aaVar2.c();
                }
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f8991r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void d() {
        this.f8988o.a();
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar) {
        this(str, uVar, aaVar, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str, String str2) {
        com.anythink.basead.exoplayer.k.a.a(str);
        com.anythink.basead.exoplayer.k.a.a(str2);
        this.f8988o.a(str, str2);
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, byte b9) {
        this(str, uVar, aaVar, 8000, 8000, false, null);
    }

    public p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, int i, int i4, boolean z6, s.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8985l = str;
            this.f8986m = uVar;
            this.f8989p = aaVar;
            this.f8988o = new s.f();
            this.f8983j = i;
            this.f8984k = i4;
            this.i = z6;
            this.f8987n = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str) {
        com.anythink.basead.exoplayer.k.a.a(str);
        this.f8988o.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(k kVar) {
        p pVar;
        HttpURLConnection a9;
        long j6;
        long j9;
        aa<? super p> aaVar;
        this.f8990q = kVar;
        long j10 = 0;
        this.f8997x = 0L;
        this.f8996w = 0L;
        try {
            URL url = new URL(kVar.f8923c.toString());
            byte[] bArr = kVar.f8924d;
            long j11 = kVar.f8926f;
            long j12 = kVar.f8927g;
            boolean a10 = kVar.a(1);
            if (this.i) {
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    if (i <= 20) {
                        pVar = this;
                        a9 = pVar.a(url, bArr, j11, j12, a10, false);
                        int responseCode = a9.getResponseCode();
                        j6 = j10;
                        if (responseCode != 300) {
                            if (responseCode != 301) {
                                if (responseCode != 302) {
                                    if (responseCode != 303) {
                                        if (bArr != null) {
                                            break;
                                        }
                                        if (responseCode != 307 && responseCode != 308) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String headerField = a9.getHeaderField("Location");
                        a9.disconnect();
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                            }
                            bArr = null;
                            url = url2;
                            i = i4;
                            j10 = j6;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i4)));
                    }
                }
            } else {
                try {
                    a9 = a(url, bArr, j11, j12, a10, true);
                    pVar = this;
                    j6 = 0;
                } catch (IOException e9) {
                    e = e9;
                    throw new s.c("Unable to connect to " + kVar.f8923c.toString(), e, kVar);
                }
            }
            pVar.f8991r = a9;
            try {
                int responseCode2 = a9.getResponseCode();
                if (responseCode2 >= 200 && responseCode2 <= 299) {
                    String contentType = pVar.f8991r.getContentType();
                    com.anythink.basead.exoplayer.k.u<String> uVar = pVar.f8986m;
                    if (uVar != null && !uVar.a(contentType)) {
                        pVar.j();
                        throw new s.d(contentType, kVar);
                    }
                    try {
                        if (responseCode2 == 200) {
                            long j13 = kVar.f8926f;
                            if (j13 != j6) {
                                j9 = j13;
                                pVar.f8994u = j9;
                                if (kVar.a(1)) {
                                    long j14 = kVar.f8927g;
                                    if (j14 != -1) {
                                        pVar.f8995v = j14;
                                    } else {
                                        long a11 = a(pVar.f8991r);
                                        pVar.f8995v = a11 != -1 ? a11 - pVar.f8994u : -1L;
                                    }
                                } else {
                                    pVar.f8995v = kVar.f8927g;
                                }
                                pVar.f8992s = pVar.f8991r.getInputStream();
                                pVar.f8993t = true;
                                aaVar = pVar.f8989p;
                                if (aaVar != null) {
                                    aaVar.b();
                                }
                                return pVar.f8995v;
                            }
                        }
                        pVar.f8992s = pVar.f8991r.getInputStream();
                        pVar.f8993t = true;
                        aaVar = pVar.f8989p;
                        if (aaVar != null) {
                        }
                        return pVar.f8995v;
                    } catch (IOException e10) {
                        pVar.j();
                        throw new s.c(e10, kVar, 1);
                    }
                    j9 = j6;
                    pVar.f8994u = j9;
                    if (kVar.a(1)) {
                    }
                } else {
                    Map<String, List<String>> headerFields = pVar.f8991r.getHeaderFields();
                    pVar.j();
                    s.e eVar = new s.e(responseCode2, headerFields, kVar);
                    if (responseCode2 == 416) {
                        eVar.initCause(new i());
                        throw eVar;
                    }
                    throw eVar;
                }
            } catch (IOException e11) {
                pVar.j();
                throw new s.c("Unable to connect to " + kVar.f8923c.toString(), e11, kVar);
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection b(k kVar) {
        URL url = new URL(kVar.f8923c.toString());
        byte[] bArr = kVar.f8924d;
        long j6 = kVar.f8926f;
        long j9 = kVar.f8927g;
        boolean a9 = kVar.a(1);
        if (!this.i) {
            return a(url, bArr, j6, j9, a9, true);
        }
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (i <= 20) {
                long j10 = j9;
                boolean z6 = a9;
                long j11 = j6;
                HttpURLConnection a10 = a(url, bArr, j11, j10, z6, false);
                j6 = j11;
                j9 = j10;
                a9 = z6;
                int responseCode = a10.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    String headerField = a10.getHeaderField("Location");
                    a10.disconnect();
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (!"https".equals(protocol) && !"http".equals(protocol)) {
                            throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                        }
                        bArr = null;
                        url = url2;
                        i = i4;
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i4)));
            }
        }
    }

    private int b(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j6 = this.f8995v;
        if (j6 != -1) {
            long j9 = j6 - this.f8997x;
            if (j9 == 0) {
                return -1;
            }
            i4 = (int) Math.min(i4, j9);
        }
        int read = this.f8992s.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8995v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8997x += read;
        aa<? super p> aaVar = this.f8989p;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j6, long j9, boolean z6, boolean z9) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8983j);
        httpURLConnection.setReadTimeout(this.f8984k);
        s.f fVar = this.f8987n;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f8988o.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j6 != 0 || j9 != -1) {
            String str = "bytes=" + j6 + "-";
            if (j9 != -1) {
                StringBuilder b9 = AbstractC5050e.b(str);
                b9.append((j6 + j9) - 1);
                str = b9.toString();
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f8985l);
        if (!z6) {
            httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
        }
        httpURLConnection.setInstanceFollowRedirects(z9);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private static URL a(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
        }
        throw new ProtocolException("Null location redirect");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long a(HttpURLConnection httpURLConnection) {
        long parseLong;
        String headerField;
        String headerField2 = httpURLConnection.getHeaderField("Content-Length");
        if (!TextUtils.isEmpty(headerField2)) {
            try {
                parseLong = Long.parseLong(headerField2);
            } catch (NumberFormatException unused) {
                Log.e(f8978d, "Unexpected Content-Length [" + headerField2 + "]");
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                return parseLong;
            }
            Matcher matcher = f8981g.matcher(headerField);
            if (!matcher.find()) {
                return parseLong;
            }
            try {
                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                if (parseLong < 0) {
                    return parseLong2;
                }
                if (parseLong == parseLong2) {
                    return parseLong;
                }
                Log.w(f8978d, "Inconsistent headers [" + headerField2 + "] [" + headerField + "]");
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                Log.e(f8978d, "Unexpected Content-Range [" + headerField + "]");
                return parseLong;
            }
        }
        parseLong = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j6) {
        int i = af.f9132a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j6 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j6 <= f8980f) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        try {
            if (this.f8996w != this.f8994u) {
                byte[] andSet = f8982h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j6 = this.f8996w;
                    long j9 = this.f8994u;
                    if (j6 != j9) {
                        int read = this.f8992s.read(andSet, 0, (int) Math.min(j9 - j6, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f8996w += read;
                            aa<? super p> aaVar = this.f8989p;
                            if (aaVar != null) {
                                aaVar.a(read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f8982h.set(andSet);
                        break;
                    }
                }
            }
            if (i4 == 0) {
                return 0;
            }
            long j10 = this.f8995v;
            if (j10 != -1) {
                long j11 = j10 - this.f8997x;
                if (j11 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j11);
            }
            int read2 = this.f8992s.read(bArr, i, i4);
            if (read2 == -1) {
                if (this.f8995v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f8997x += read2;
            aa<? super p> aaVar2 = this.f8989p;
            if (aaVar2 != null) {
                aaVar2.a(read2);
            }
            return read2;
        } catch (IOException e9) {
            throw new s.c(e9, this.f8990q, 2);
        }
    }
}
