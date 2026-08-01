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
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8190a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8191b = 8000;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8192d = "DefaultHttpDataSource";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8193e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final long f8194f = 2048;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8195g = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference<byte[]> f8196h = new AtomicReference<>();
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8197j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8198k;

    /* renamed from: l, reason: collision with root package name */
    private final String f8199l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.u<String> f8200m;

    /* renamed from: n, reason: collision with root package name */
    private final s.f f8201n;

    /* renamed from: o, reason: collision with root package name */
    private final s.f f8202o;

    /* renamed from: p, reason: collision with root package name */
    private final aa<? super p> f8203p;

    /* renamed from: q, reason: collision with root package name */
    private k f8204q;

    /* renamed from: r, reason: collision with root package name */
    private HttpURLConnection f8205r;

    /* renamed from: s, reason: collision with root package name */
    private InputStream f8206s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8207t;

    /* renamed from: u, reason: collision with root package name */
    private long f8208u;

    /* renamed from: v, reason: collision with root package name */
    private long f8209v;

    /* renamed from: w, reason: collision with root package name */
    private long f8210w;

    /* renamed from: x, reason: collision with root package name */
    private long f8211x;

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar) {
        this(str, uVar, null);
    }

    private HttpURLConnection e() {
        return this.f8205r;
    }

    private long f() {
        return this.f8210w;
    }

    private long g() {
        return this.f8211x;
    }

    private long h() {
        long j6 = this.f8209v;
        return j6 == -1 ? j6 : j6 - this.f8211x;
    }

    private void i() {
        if (this.f8210w == this.f8208u) {
            return;
        }
        byte[] andSet = f8196h.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j6 = this.f8210w;
            long j9 = this.f8208u;
            if (j6 == j9) {
                f8196h.set(andSet);
                return;
            }
            int read = this.f8206s.read(andSet, 0, (int) Math.min(j9 - j6, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.f8210w += read;
            aa<? super p> aaVar = this.f8203p;
            if (aaVar != null) {
                aaVar.a(read);
            }
        }
    }

    private void j() {
        HttpURLConnection httpURLConnection = this.f8205r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                Log.e(f8192d, "Unexpected error while disconnecting", e9);
            }
            this.f8205r = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f8205r;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0034, code lost:
    
        if (r3 > com.anythink.basead.exoplayer.j.p.f8194f) goto L23;
     */
    @Override // com.anythink.basead.exoplayer.j.s, com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        try {
            if (this.f8206s != null) {
                HttpURLConnection httpURLConnection = this.f8205r;
                long j6 = this.f8209v;
                if (j6 != -1) {
                    j6 -= this.f8211x;
                }
                int i = af.f8346a;
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
                    this.f8206s.close();
                } catch (IOException e9) {
                    throw new s.c(e9, this.f8204q, 3);
                }
            }
            this.f8206s = null;
            j();
            if (this.f8207t) {
                this.f8207t = false;
                aa<? super p> aaVar = this.f8203p;
                if (aaVar != null) {
                    aaVar.c();
                }
            }
        } catch (Throwable th) {
            this.f8206s = null;
            j();
            if (this.f8207t) {
                this.f8207t = false;
                aa<? super p> aaVar2 = this.f8203p;
                if (aaVar2 != null) {
                    aaVar2.c();
                }
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f8205r;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void d() {
        this.f8202o.a();
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar) {
        this(str, uVar, aaVar, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str, String str2) {
        com.anythink.basead.exoplayer.k.a.a(str);
        com.anythink.basead.exoplayer.k.a.a(str2);
        this.f8202o.a(str, str2);
    }

    private p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, byte b9) {
        this(str, uVar, aaVar, 8000, 8000, false, null);
    }

    public p(String str, com.anythink.basead.exoplayer.k.u<String> uVar, aa<? super p> aaVar, int i, int i6, boolean z3, s.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8199l = str;
            this.f8200m = uVar;
            this.f8203p = aaVar;
            this.f8202o = new s.f();
            this.f8197j = i;
            this.f8198k = i6;
            this.i = z3;
            this.f8201n = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.basead.exoplayer.j.s
    public final void a(String str) {
        com.anythink.basead.exoplayer.k.a.a(str);
        this.f8202o.a(str);
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
        this.f8204q = kVar;
        long j10 = 0;
        this.f8211x = 0L;
        this.f8210w = 0L;
        try {
            URL url = new URL(kVar.f8137c.toString());
            byte[] bArr = kVar.f8138d;
            long j11 = kVar.f8140f;
            long j12 = kVar.f8141g;
            boolean a10 = kVar.a(1);
            if (this.i) {
                int i = 0;
                while (true) {
                    int i6 = i + 1;
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
                            i = i6;
                            j10 = j6;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i6)));
                    }
                }
            } else {
                try {
                    a9 = a(url, bArr, j11, j12, a10, true);
                    pVar = this;
                    j6 = 0;
                } catch (IOException e9) {
                    e = e9;
                    throw new s.c("Unable to connect to " + kVar.f8137c.toString(), e, kVar);
                }
            }
            pVar.f8205r = a9;
            try {
                int responseCode2 = a9.getResponseCode();
                if (responseCode2 >= 200 && responseCode2 <= 299) {
                    String contentType = pVar.f8205r.getContentType();
                    com.anythink.basead.exoplayer.k.u<String> uVar = pVar.f8200m;
                    if (uVar != null && !uVar.a(contentType)) {
                        pVar.j();
                        throw new s.d(contentType, kVar);
                    }
                    try {
                        if (responseCode2 == 200) {
                            long j13 = kVar.f8140f;
                            if (j13 != j6) {
                                j9 = j13;
                                pVar.f8208u = j9;
                                if (kVar.a(1)) {
                                    long j14 = kVar.f8141g;
                                    if (j14 != -1) {
                                        pVar.f8209v = j14;
                                    } else {
                                        long a11 = a(pVar.f8205r);
                                        pVar.f8209v = a11 != -1 ? a11 - pVar.f8208u : -1L;
                                    }
                                } else {
                                    pVar.f8209v = kVar.f8141g;
                                }
                                pVar.f8206s = pVar.f8205r.getInputStream();
                                pVar.f8207t = true;
                                aaVar = pVar.f8203p;
                                if (aaVar != null) {
                                    aaVar.b();
                                }
                                return pVar.f8209v;
                            }
                        }
                        pVar.f8206s = pVar.f8205r.getInputStream();
                        pVar.f8207t = true;
                        aaVar = pVar.f8203p;
                        if (aaVar != null) {
                        }
                        return pVar.f8209v;
                    } catch (IOException e10) {
                        pVar.j();
                        throw new s.c(e10, kVar, 1);
                    }
                    j9 = j6;
                    pVar.f8208u = j9;
                    if (kVar.a(1)) {
                    }
                } else {
                    Map<String, List<String>> headerFields = pVar.f8205r.getHeaderFields();
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
                throw new s.c("Unable to connect to " + kVar.f8137c.toString(), e11, kVar);
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
        URL url = new URL(kVar.f8137c.toString());
        byte[] bArr = kVar.f8138d;
        long j6 = kVar.f8140f;
        long j9 = kVar.f8141g;
        boolean a9 = kVar.a(1);
        if (!this.i) {
            return a(url, bArr, j6, j9, a9, true);
        }
        int i = 0;
        while (true) {
            int i6 = i + 1;
            if (i <= 20) {
                long j10 = j9;
                boolean z3 = a9;
                long j11 = j6;
                HttpURLConnection a10 = a(url, bArr, j11, j10, z3, false);
                j6 = j11;
                j9 = j10;
                a9 = z3;
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
                        i = i6;
                    } else {
                        throw new ProtocolException("Null location redirect");
                    }
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: ".concat(String.valueOf(i6)));
            }
        }
    }

    private int b(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j6 = this.f8209v;
        if (j6 != -1) {
            long j9 = j6 - this.f8211x;
            if (j9 == 0) {
                return -1;
            }
            i6 = (int) Math.min(i6, j9);
        }
        int read = this.f8206s.read(bArr, i, i6);
        if (read == -1) {
            if (this.f8209v == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f8211x += read;
        aa<? super p> aaVar = this.f8203p;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j6, long j9, boolean z3, boolean z6) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f8197j);
        httpURLConnection.setReadTimeout(this.f8198k);
        s.f fVar = this.f8201n;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f8202o.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j6 != 0 || j9 != -1) {
            String str = "bytes=" + j6 + "-";
            if (j9 != -1) {
                StringBuilder b9 = AbstractC5049e.b(str);
                b9.append((j6 + j9) - 1);
                str = b9.toString();
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f8199l);
        if (!z3) {
            httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
        }
        httpURLConnection.setInstanceFollowRedirects(z6);
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
                Log.e(f8192d, "Unexpected Content-Length [" + headerField2 + "]");
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                return parseLong;
            }
            Matcher matcher = f8195g.matcher(headerField);
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
                Log.w(f8192d, "Inconsistent headers [" + headerField2 + "] [" + headerField + "]");
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                Log.e(f8192d, "Unexpected Content-Range [" + headerField + "]");
                return parseLong;
            }
        }
        parseLong = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j6) {
        int i = af.f8346a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j6 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j6 <= f8194f) {
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
    public final int a(byte[] bArr, int i, int i6) {
        try {
            if (this.f8210w != this.f8208u) {
                byte[] andSet = f8196h.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j6 = this.f8210w;
                    long j9 = this.f8208u;
                    if (j6 != j9) {
                        int read = this.f8206s.read(andSet, 0, (int) Math.min(j9 - j6, andSet.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.f8210w += read;
                            aa<? super p> aaVar = this.f8203p;
                            if (aaVar != null) {
                                aaVar.a(read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f8196h.set(andSet);
                        break;
                    }
                }
            }
            if (i6 == 0) {
                return 0;
            }
            long j10 = this.f8209v;
            if (j10 != -1) {
                long j11 = j10 - this.f8211x;
                if (j11 == 0) {
                    return -1;
                }
                i6 = (int) Math.min(i6, j11);
            }
            int read2 = this.f8206s.read(bArr, i, i6);
            if (read2 == -1) {
                if (this.f8209v == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f8211x += read2;
            aa<? super p> aaVar2 = this.f8203p;
            if (aaVar2 != null) {
                aaVar2.a(read2);
            }
            return read2;
        } catch (IOException e9) {
            throw new s.c(e9, this.f8204q, 2);
        }
    }
}
