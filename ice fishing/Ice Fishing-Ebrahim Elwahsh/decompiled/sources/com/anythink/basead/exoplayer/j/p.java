package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.exoplayer.j.s;
import com.anythink.basead.exoplayer.k.C0544a;
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
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8347a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8348b = 8000;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8349d = "DefaultHttpDataSource";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8350e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final long f8351f = 2048;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8352g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference<byte[]> f8353h = new AtomicReference<>();
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8354j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8355k;

    /* renamed from: l, reason: collision with root package name */
    private final String f8356l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.u<String> f8357m;

    /* renamed from: n, reason: collision with root package name */
    private final s.f f8358n;

    /* renamed from: o, reason: collision with root package name */
    private final s.f f8359o;

    /* renamed from: p, reason: collision with root package name */
    private final aa<? super p> f8360p;

    /* renamed from: q, reason: collision with root package name */
    private k f8361q;

    /* renamed from: r, reason: collision with root package name */
    private HttpURLConnection f8362r;

    /* renamed from: s, reason: collision with root package name */
    private InputStream f8363s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8364t;

    /* renamed from: u, reason: collision with root package name */
    private long f8365u;

    /* renamed from: v, reason: collision with root package name */
    private long f8366v;

    /* renamed from: w, reason: collision with root package name */
    private long f8367w;

    /* renamed from: x, reason: collision with root package name */
    private long f8368x;

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar) {
        this(str, uVar, null);
    }

    private HttpURLConnection e() {
        return this.f8362r;
    }

    private long f() {
        return this.f8367w;
    }

    private long g() {
        return this.f8368x;
    }

    private long h() {
        long j9 = this.f8366v;
        return j9 == -1 ? j9 : j9 - this.f8368x;
    }

    private void i() {
        if (this.f8367w == this.f8365u) {
            return;
        }
        byte[] andSet = f8353h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j9 = this.f8367w;
            long j10 = this.f8365u;
            if (j9 == j10) {
                f8353h.set(andSet);
                return;
            }
            int read = this.f8363s.read(andSet, 0, (int) Math.min(j10 - j9, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.f8367w += read;
            aa<? super p> aaVar = this.f8360p;
            if (aaVar != null) {
                aaVar.a(read);
            }
        }
    }

    private void j() {
        HttpURLConnection httpURLConnection = this.f8362r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                Log.e(f8349d, "Unexpected error while disconnecting", e6);
            }
            this.f8362r = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f8362r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        if (r3 > com.anythink.basead.exoplayer.j.p.f8351f) goto L23;
     */
    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        try {
            if (this.f8363s != null) {
                HttpURLConnection httpURLConnection = this.f8362r;
                long j9 = this.f8366v;
                if (j9 != -1) {
                    j9 -= this.f8368x;
                }
                int i = af.f8503a;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j9 == -1) {
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
                    this.f8363s.close();
                } catch (IOException e6) {
                    throw new s.c(e6, this.f8361q, 3);
                }
            }
            this.f8363s = null;
            j();
            if (this.f8364t) {
                this.f8364t = false;
                aa<? super p> aaVar = this.f8360p;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        } catch (Throwable th) {
            this.f8363s = null;
            j();
            if (this.f8364t) {
                this.f8364t = false;
                aa<? super p> aaVar2 = this.f8360p;
                if (aaVar2 != null) {
                    aaVar2.c();
                }
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f8362r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void d() {
        this.f8359o.a();
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar) {
        this(str, uVar, aaVar, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str, String str2) {
        C0544a.a(str);
        C0544a.a(str2);
        this.f8359o.a(str, str2);
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, byte b9) {
        this(str, uVar, aaVar, 8000, 8000, false, null);
    }

    public p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, int i, int i4, boolean z8, s.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8356l = str;
            this.f8357m = uVar;
            this.f8360p = aaVar;
            this.f8359o = new s.f();
            this.f8354j = i;
            this.f8355k = i4;
            this.i = z8;
            this.f8358n = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str) {
        C0544a.a(str);
        this.f8359o.a(str);
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
        long j9;
        long j10;
        aa<? super p> aaVar;
        this.f8361q = kVar;
        long j11 = 0;
        this.f8368x = 0L;
        this.f8367w = 0L;
        try {
            URL url = new URL(kVar.f8294c.toString());
            byte[] bArr = kVar.f8295d;
            long j12 = kVar.f8297f;
            long j13 = kVar.f8298g;
            boolean a10 = kVar.a(1);
            if (this.i) {
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    if (i <= 20) {
                        pVar = this;
                        a9 = pVar.a(url, bArr, j12, j13, a10, false);
                        int responseCode = a9.getResponseCode();
                        j9 = j11;
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
                            j11 = j9;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i4)));
                    }
                }
            } else {
                try {
                    a9 = a(url, bArr, j12, j13, a10, true);
                    pVar = this;
                    j9 = 0;
                } catch (IOException e6) {
                    e = e6;
                    throw new s.c("Unable to connect to " + kVar.f8294c.toString(), e, kVar);
                }
            }
            pVar.f8362r = a9;
            try {
                int responseCode2 = a9.getResponseCode();
                if (responseCode2 >= 200 && responseCode2 <= 299) {
                    String contentType = pVar.f8362r.getContentType();
                    com.anythink.basead.exoplayer.k.u<String> uVar = pVar.f8357m;
                    if (uVar != null && !uVar.a(contentType)) {
                        pVar.j();
                        throw new s.d(contentType, kVar);
                    }
                    try {
                        if (responseCode2 == 200) {
                            long j14 = kVar.f8297f;
                            if (j14 != j9) {
                                j10 = j14;
                                pVar.f8365u = j10;
                                if (kVar.a(1)) {
                                    long j15 = kVar.f8298g;
                                    if (j15 != -1) {
                                        pVar.f8366v = j15;
                                    } else {
                                        long a11 = a(pVar.f8362r);
                                        pVar.f8366v = a11 != -1 ? a11 - pVar.f8365u : -1L;
                                    }
                                } else {
                                    pVar.f8366v = kVar.f8298g;
                                }
                                pVar.f8363s = pVar.f8362r.getInputStream();
                                pVar.f8364t = true;
                                aaVar = pVar.f8360p;
                                if (aaVar != null) {
                                    aaVar.b();
                                }
                                return pVar.f8366v;
                            }
                        }
                        pVar.f8363s = pVar.f8362r.getInputStream();
                        pVar.f8364t = true;
                        aaVar = pVar.f8360p;
                        if (aaVar != null) {
                        }
                        return pVar.f8366v;
                    } catch (IOException e9) {
                        pVar.j();
                        throw new s.c(e9, kVar, 1);
                    }
                    j10 = j9;
                    pVar.f8365u = j10;
                    if (kVar.a(1)) {
                    }
                } else {
                    Map<String, List<String>> headerFields = pVar.f8362r.getHeaderFields();
                    pVar.j();
                    s.e eVar = new s.e(responseCode2, headerFields, kVar);
                    if (responseCode2 == 416) {
                        eVar.initCause(new i());
                        throw eVar;
                    }
                    throw eVar;
                }
            } catch (IOException e10) {
                pVar.j();
                throw new s.c("Unable to connect to " + kVar.f8294c.toString(), e10, kVar);
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection b(k kVar) {
        URL url = new URL(kVar.f8294c.toString());
        byte[] bArr = kVar.f8295d;
        long j9 = kVar.f8297f;
        long j10 = kVar.f8298g;
        boolean a9 = kVar.a(1);
        if (!this.i) {
            return a(url, bArr, j9, j10, a9, true);
        }
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (i <= 20) {
                long j11 = j10;
                boolean z8 = a9;
                long j12 = j9;
                HttpURLConnection a10 = a(url, bArr, j12, j11, z8, false);
                j9 = j12;
                j10 = j11;
                a9 = z8;
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
        long j9 = this.f8366v;
        if (j9 != -1) {
            long j10 = j9 - this.f8368x;
            if (j10 == 0) {
                return -1;
            }
            i4 = (int) Math.min(i4, j10);
        }
        int read = this.f8363s.read(bArr, i, i4);
        if (read == -1) {
            if (this.f8366v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8368x += read;
        aa<? super p> aaVar = this.f8360p;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j9, long j10, boolean z8, boolean z9) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8354j);
        httpURLConnection.setReadTimeout(this.f8355k);
        s.f fVar = this.f8358n;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f8359o.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j9 != 0 || j10 != -1) {
            String str = "bytes=" + j9 + "-";
            if (j10 != -1) {
                StringBuilder b9 = AbstractC5088e.b(str);
                b9.append((j9 + j10) - 1);
                str = b9.toString();
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f8356l);
        if (!z8) {
            httpURLConnection.setRequestProperty("Accept-Encoding", Q5.c.IDENTITY_NAME_SPACE);
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
                Log.e(f8349d, "Unexpected Content-Length [" + headerField2 + "]");
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                return parseLong;
            }
            Matcher matcher = f8352g.matcher(headerField);
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
                Log.w(f8349d, "Inconsistent headers [" + headerField2 + "] [" + headerField + "]");
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                Log.e(f8349d, "Unexpected Content-Range [" + headerField + "]");
                return parseLong;
            }
        }
        parseLong = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j9) {
        int i = af.f8503a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j9 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j9 <= f8351f) {
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
            if (this.f8367w != this.f8365u) {
                byte[] andSet = f8353h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j9 = this.f8367w;
                    long j10 = this.f8365u;
                    if (j9 != j10) {
                        int read = this.f8363s.read(andSet, 0, (int) Math.min(j10 - j9, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f8367w += read;
                            aa<? super p> aaVar = this.f8360p;
                            if (aaVar != null) {
                                aaVar.a(read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f8353h.set(andSet);
                        break;
                    }
                }
            }
            if (i4 == 0) {
                return 0;
            }
            long j11 = this.f8366v;
            if (j11 != -1) {
                long j12 = j11 - this.f8368x;
                if (j12 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j12);
            }
            int read2 = this.f8363s.read(bArr, i, i4);
            if (read2 == -1) {
                if (this.f8366v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f8368x += read2;
            aa<? super p> aaVar2 = this.f8360p;
            if (aaVar2 != null) {
                aaVar2.a(read2);
            }
            return read2;
        } catch (IOException e6) {
            throw new s.c(e6, this.f8361q, 2);
        }
    }
}
