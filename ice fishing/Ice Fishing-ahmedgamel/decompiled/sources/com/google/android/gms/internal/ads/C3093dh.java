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
public final class C3093dh extends AbstractC3557mF implements InterfaceC4157xM {

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f29805M = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicReference f29806N = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final String f29807A;

    /* renamed from: B, reason: collision with root package name */
    public final S0.l f29808B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f29809C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f29810D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f29811E;

    /* renamed from: F, reason: collision with root package name */
    public int f29812F;

    /* renamed from: G, reason: collision with root package name */
    public long f29813G;

    /* renamed from: H, reason: collision with root package name */
    public long f29814H;

    /* renamed from: I, reason: collision with root package name */
    public long f29815I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public int f29816K;

    /* renamed from: L, reason: collision with root package name */
    public final HashSet f29817L;

    /* renamed from: x, reason: collision with root package name */
    public final C3039ch f29818x;

    /* renamed from: y, reason: collision with root package name */
    public final int f29819y;

    /* renamed from: z, reason: collision with root package name */
    public final int f29820z;

    public C3093dh(String str, C3414jh c3414jh, int i, int i6, int i9) {
        super(true);
        this.f29818x = new C3039ch(this);
        this.f29817L = new HashSet();
        AbstractC2772Sd.i(true ^ TextUtils.isEmpty(str));
        this.f29807A = str;
        this.f29808B = new S0.l(21);
        this.f29819y = i;
        this.f29820z = i6;
        this.f29816K = i9;
        if (c3414jh != null) {
            k(c3414jh);
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.f29809C;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                int i = u2.z.f41322b;
                v2.i.d("Unexpected error while disconnecting", e9);
            }
            this.f29809C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265 A[Catch: IOException -> 0x0038, TryCatch #1 {IOException -> 0x0038, blocks: (B:3:0x000d, B:4:0x001b, B:6:0x0021, B:8:0x002f, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:20:0x008f, B:22:0x00b3, B:23:0x00d4, B:24:0x00d9, B:38:0x010f, B:95:0x0258, B:97:0x0265, B:99:0x0278, B:105:0x0281, B:106:0x028e, B:109:0x0295, B:110:0x029c, B:114:0x029d, B:115:0x02ba), top: B:2:0x000d }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(C2971bJ c2971bJ) {
        long j6;
        long j9;
        int responseCode;
        String headerField;
        int responseCode2;
        long parseLong;
        String headerField2;
        long j10 = 0;
        this.J = 0L;
        this.f29815I = 0L;
        try {
            URL url = new URL(c2971bJ.f29279a.toString());
            int i = 0;
            while (true) {
                int i6 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i6);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f29818x);
                }
                httpURLConnection.setConnectTimeout(this.f29819y);
                httpURLConnection.setReadTimeout(this.f29820z);
                for (Map.Entry entry : this.f29808B.K().entrySet()) {
                    long j11 = j10;
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j10 = j11;
                }
                long j12 = j10;
                long j13 = c2971bJ.f29281c;
                URL url2 = url;
                long j14 = c2971bJ.f29282d;
                if (j13 != j12) {
                    j6 = j13;
                } else if (j14 != -1) {
                    j6 = j12;
                } else {
                    j9 = -1;
                    httpURLConnection.setRequestProperty("User-Agent", this.f29807A);
                    httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f29809C = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f29812F = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f29809C.getHeaderFields();
                                e();
                                int i9 = this.f29812F;
                                String str = AbstractC3159eu.f29993a;
                                VL vl = new VL(i9, null);
                                if (this.f29812F == 416) {
                                    throw vl;
                                }
                                vl.initCause(new NH());
                                throw vl;
                            }
                            if (responseCode2 != 200 || j13 == j12) {
                                j13 = j12;
                            }
                            this.f29813G = j13;
                            if (j14 != j9) {
                                this.f29814H = j14;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f29809C;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        String s9 = D.y.s(new StringBuilder(String.valueOf(headerField3).length() + 28), "Unexpected Content-Length [", headerField3, "]");
                                        int i10 = u2.z.f41322b;
                                        v2.i.c(s9);
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f29805M.matcher(headerField2);
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
                                                    int i11 = u2.z.f41322b;
                                                    v2.i.f(sb3);
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String s10 = D.y.s(new StringBuilder(String.valueOf(headerField2).length() + 27), "Unexpected Content-Range [", headerField2, "]");
                                                int i12 = u2.z.f41322b;
                                                v2.i.c(s10);
                                            }
                                        }
                                    }
                                    this.f29814H = parseLong == j9 ? parseLong - this.f29813G : j9;
                                }
                                parseLong = j9;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f29814H = parseLong == j9 ? parseLong - this.f29813G : j9;
                            }
                            try {
                                this.f29810D = this.f29809C.getInputStream();
                                this.f29811E = true;
                                b(c2971bJ);
                                return this.f29814H;
                            } catch (IOException e9) {
                                e();
                                throw new C3886sL(e9, 2000, 1);
                            }
                        } catch (IOException e10) {
                            e();
                            throw new C3886sL("Unable to connect to ".concat(String.valueOf(c2971bJ.f29279a.toString())), e10, 2000, 1);
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
                    i = i6;
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
                httpURLConnection.setRequestProperty("User-Agent", this.f29807A);
                httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f29809C = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f29812F = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f29809C.getHeaderFields();
                    e();
                    int i92 = this.f29812F;
                    String str2 = AbstractC3159eu.f29993a;
                    VL vl2 = new VL(i92, null);
                    if (this.f29812F == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e11) {
            throw new C3886sL("Unable to connect to ".concat(String.valueOf(c2971bJ.f29279a.toString())), e11, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f29809C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f29809C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        try {
            if (this.f29815I != this.f29813G) {
                AtomicReference atomicReference = f29806N;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j6 = this.f29815I;
                    long j9 = this.f29813G;
                    if (j6 == j9) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.f29810D.read(bArr2, 0, (int) Math.min(j9 - j6, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f29815I += read;
                    c(read);
                }
            }
            if (i6 == 0) {
                return 0;
            }
            long j10 = this.f29814H;
            if (j10 != -1) {
                long j11 = j10 - this.J;
                if (j11 == 0) {
                    return -1;
                }
                i6 = (int) Math.min(i6, j11);
            }
            int read2 = this.f29810D.read(bArr, i, i6);
            if (read2 == -1) {
                if (this.f29814H != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.J += read2;
            c(read2);
            return read2;
        } catch (IOException e9) {
            throw new C3886sL(e9, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        HashSet hashSet = this.f29817L;
        try {
            InputStream inputStream = this.f29810D;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    throw new C3886sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f29810D = null;
            e();
            if (this.f29811E) {
                this.f29811E = false;
                d();
            }
            hashSet.clear();
        }
    }
}
