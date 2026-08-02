package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3116dh extends AbstractC3580mF implements InterfaceC4180xM {

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f30578M = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicReference f30579N = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final String f30580A;

    /* renamed from: B, reason: collision with root package name */
    public final S0.l f30581B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f30582C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f30583D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f30584E;

    /* renamed from: F, reason: collision with root package name */
    public int f30585F;

    /* renamed from: G, reason: collision with root package name */
    public long f30586G;

    /* renamed from: H, reason: collision with root package name */
    public long f30587H;

    /* renamed from: I, reason: collision with root package name */
    public long f30588I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public int f30589K;

    /* renamed from: L, reason: collision with root package name */
    public final HashSet f30590L;

    /* renamed from: x, reason: collision with root package name */
    public final C3062ch f30591x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30592y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30593z;

    public C3116dh(String str, C3437jh c3437jh, int i, int i4, int i6) {
        super(true);
        this.f30591x = new C3062ch(this);
        this.f30590L = new HashSet();
        AbstractC2792Sd.i(true ^ TextUtils.isEmpty(str));
        this.f30580A = str;
        this.f30581B = new S0.l(24);
        this.f30592y = i;
        this.f30593z = i4;
        this.f30589K = i6;
        if (c3437jh != null) {
            m(c3437jh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265 A[Catch: IOException -> 0x0038, TryCatch #1 {IOException -> 0x0038, blocks: (B:3:0x000d, B:4:0x001b, B:6:0x0021, B:8:0x002f, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:20:0x008f, B:22:0x00b3, B:23:0x00d4, B:24:0x00d9, B:38:0x010f, B:95:0x0258, B:97:0x0265, B:99:0x0278, B:105:0x0281, B:106:0x028e, B:109:0x0295, B:110:0x029c, B:114:0x029d, B:115:0x02ba), top: B:2:0x000d }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(C2994bJ c2994bJ) {
        long j6;
        long j9;
        int responseCode;
        String headerField;
        int responseCode2;
        long parseLong;
        String headerField2;
        long j10 = 0;
        this.J = 0L;
        this.f30588I = 0L;
        try {
            URL url = new URL(c2994bJ.f30067a.toString());
            int i = 0;
            while (true) {
                int i4 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i4);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f30591x);
                }
                httpURLConnection.setConnectTimeout(this.f30592y);
                httpURLConnection.setReadTimeout(this.f30593z);
                for (Map.Entry entry : this.f30581B.K().entrySet()) {
                    long j11 = j10;
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j10 = j11;
                }
                long j12 = j10;
                long j13 = c2994bJ.f30069c;
                URL url2 = url;
                long j14 = c2994bJ.f30070d;
                if (j13 != j12) {
                    j6 = j13;
                } else if (j14 != -1) {
                    j6 = j12;
                } else {
                    j9 = -1;
                    httpURLConnection.setRequestProperty("User-Agent", this.f30580A);
                    httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f30582C = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f30585F = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f30582C.getHeaderFields();
                                f();
                                int i6 = this.f30585F;
                                String str = AbstractC3182eu.f30782a;
                                VL vl = new VL(i6, null);
                                if (this.f30585F == 416) {
                                    throw vl;
                                }
                                vl.initCause(new NH());
                                throw vl;
                            }
                            if (responseCode2 != 200 || j13 == j12) {
                                j13 = j12;
                            }
                            this.f30586G = j13;
                            if (j14 != j9) {
                                this.f30587H = j14;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f30582C;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        String p9 = D.x.p(new StringBuilder(String.valueOf(headerField3).length() + 28), "Unexpected Content-Length [", headerField3, "]");
                                        int i9 = w2.z.f41712b;
                                        x2.i.c(p9);
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f30578M.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < j12) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                    sb2.append("Inconsistent headers [");
                                                    sb2.append(headerField3);
                                                    sb2.append("] [");
                                                    sb2.append(headerField2);
                                                    sb2.append("]");
                                                    String sb3 = sb2.toString();
                                                    int i10 = w2.z.f41712b;
                                                    x2.i.f(sb3);
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String p10 = D.x.p(new StringBuilder(String.valueOf(headerField2).length() + 27), "Unexpected Content-Range [", headerField2, "]");
                                                int i11 = w2.z.f41712b;
                                                x2.i.c(p10);
                                            }
                                        }
                                    }
                                    this.f30587H = parseLong == j9 ? parseLong - this.f30586G : j9;
                                }
                                parseLong = j9;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f30587H = parseLong == j9 ? parseLong - this.f30586G : j9;
                            }
                            try {
                                this.f30583D = this.f30582C.getInputStream();
                                this.f30584E = true;
                                c(c2994bJ);
                                return this.f30587H;
                            } catch (IOException e9) {
                                f();
                                throw new C3909sL(e9, 2000, 1);
                            }
                        } catch (IOException e10) {
                            f();
                            throw new C3909sL("Unable to connect to ".concat(String.valueOf(c2994bJ.f30067a.toString())), e10, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    url = new URL(url2, headerField);
                    String protocol = url.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    i = i4;
                    j10 = j12;
                }
                j9 = -1;
                StringBuilder sb4 = new StringBuilder(String.valueOf(j6).length() + 7);
                sb4.append("bytes=");
                long j15 = j6;
                sb4.append(j15);
                sb4.append("-");
                String sb5 = sb4.toString();
                if (j14 != -1) {
                    long j16 = (j15 + j14) - 1;
                    StringBuilder sb6 = new StringBuilder(sb5.length() + String.valueOf(j16).length());
                    sb6.append(sb5);
                    sb6.append(j16);
                    sb5 = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", sb5);
                httpURLConnection.setRequestProperty("User-Agent", this.f30580A);
                httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f30582C = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f30585F = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f30582C.getHeaderFields();
                    f();
                    int i62 = this.f30585F;
                    String str2 = AbstractC3182eu.f30782a;
                    VL vl2 = new VL(i62, null);
                    if (this.f30585F == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e11) {
            throw new C3909sL("Unable to connect to ".concat(String.valueOf(c2994bJ.f30067a.toString())), e11, 2000, 1);
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f30582C;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                int i = w2.z.f41712b;
                x2.i.d("Unexpected error while disconnecting", e9);
            }
            this.f30582C = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f30582C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f30582C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        HashSet hashSet = this.f30590L;
        try {
            InputStream inputStream = this.f30583D;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    throw new C3909sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f30583D = null;
            f();
            if (this.f30584E) {
                this.f30584E = false;
                e();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        try {
            if (this.f30588I != this.f30586G) {
                AtomicReference atomicReference = f30579N;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j6 = this.f30588I;
                    long j9 = this.f30586G;
                    if (j6 == j9) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.f30583D.read(bArr2, 0, (int) Math.min(j9 - j6, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f30588I += read;
                    d(read);
                }
            }
            if (i4 == 0) {
                return 0;
            }
            long j10 = this.f30587H;
            if (j10 != -1) {
                long j11 = j10 - this.J;
                if (j11 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j11);
            }
            int read2 = this.f30583D.read(bArr, i, i4);
            if (read2 == -1) {
                if (this.f30587H != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.J += read2;
            d(read2);
            return read2;
        } catch (IOException e9) {
            throw new C3909sL(e9, 2000, 2);
        }
    }
}
