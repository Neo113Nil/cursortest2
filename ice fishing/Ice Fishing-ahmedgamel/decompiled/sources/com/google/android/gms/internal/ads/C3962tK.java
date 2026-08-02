package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.tK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3962tK extends AbstractC3580mF implements InterfaceC4180xM {

    /* renamed from: A, reason: collision with root package name */
    public final String f35049A;

    /* renamed from: B, reason: collision with root package name */
    public final S0.l f35050B;

    /* renamed from: C, reason: collision with root package name */
    public final S0.l f35051C;

    /* renamed from: D, reason: collision with root package name */
    public C2994bJ f35052D;

    /* renamed from: E, reason: collision with root package name */
    public HttpURLConnection f35053E;

    /* renamed from: F, reason: collision with root package name */
    public InputStream f35054F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f35055G;

    /* renamed from: H, reason: collision with root package name */
    public int f35056H;

    /* renamed from: I, reason: collision with root package name */
    public long f35057I;
    public long J;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f35058x;

    /* renamed from: y, reason: collision with root package name */
    public final int f35059y;

    /* renamed from: z, reason: collision with root package name */
    public final int f35060z;

    public /* synthetic */ C3962tK(String str, int i, int i4, boolean z6, S0.l lVar) {
        super(true);
        this.f35049A = str;
        this.f35059y = i;
        this.f35060z = i4;
        this.f35058x = z6;
        this.f35050B = lVar;
        this.f35051C = new S0.l(24);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01df A[Catch: IOException -> 0x01ea, TRY_LEAVE, TryCatch #0 {IOException -> 0x01ea, blocks: (B:27:0x01d7, B:29:0x01df), top: B:26:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(C2994bJ c2994bJ) {
        URL url;
        long j6;
        long j9;
        boolean z6;
        C3962tK c3962tK;
        long j10;
        HttpURLConnection httpURLConnection;
        boolean z9;
        long parseLong;
        boolean z10;
        long j11;
        long parseLong2;
        String group;
        C3962tK c3962tK2 = this;
        C2994bJ c2994bJ2 = c2994bJ;
        c3962tK2.f35052D = c2994bJ2;
        long j12 = 0;
        c3962tK2.J = 0L;
        c3962tK2.f35057I = 0L;
        a(c2994bJ);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            url = new URL(c2994bJ2.f30067a.toString());
            j6 = c2994bJ2.f30069c;
            j9 = c2994bJ2.f30070d;
            z6 = false;
        } catch (IOException e9) {
            e = e9;
        }
        try {
            if (c3962tK2.f35058x) {
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    if (i > 20) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                        sb.append("Too many redirects: ");
                        sb.append(i4);
                        throw new C3909sL(new NoRouteToHostException(sb.toString()), AdError.INTERNAL_ERROR_CODE, 1);
                    }
                    c3962tK = this;
                    HttpURLConnection f2 = c3962tK.f(url, j6, j9, z6, false, c2994bJ2.f30068b);
                    int responseCode = f2.getResponseCode();
                    String headerField = f2.getHeaderField("Location");
                    j10 = j12;
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnection = f2;
                        break;
                    }
                    f2.disconnect();
                    url = c3962tK.g(url, headerField);
                    c2994bJ2 = c2994bJ;
                    i = i4;
                    j12 = j10;
                    z6 = false;
                }
            } else {
                httpURLConnection = c3962tK2.f(url, j6, j9, false, true, c2994bJ2.f30068b);
                c3962tK = this;
                j10 = 0;
            }
            c3962tK.f35053E = httpURLConnection;
            c3962tK.f35056H = httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            int i6 = c3962tK.f35056H;
            long j13 = c2994bJ2.f30069c;
            long j14 = c2994bJ2.f30070d;
            if (i6 < 200 || i6 > 299) {
                httpURLConnection.getHeaderFields();
                if (c3962tK.f35056H == 416) {
                    String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = KM.f26663a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        Matcher matcher = KM.f26664b.matcher(headerField2);
                        if (matcher.matches()) {
                            z9 = true;
                            String group2 = matcher.group(1);
                            group2.getClass();
                            parseLong = Long.parseLong(group2);
                            if (j13 == parseLong) {
                                c3962tK.f35055G = z9;
                                c(c2994bJ);
                                return j14 != -1 ? j14 : j10;
                            }
                        }
                    }
                    z9 = true;
                    parseLong = -1;
                    if (j13 == parseLong) {
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        GC.a(errorStream);
                    } else {
                        String str = AbstractC3182eu.f30782a;
                    }
                } catch (IOException unused) {
                    String str2 = AbstractC3182eu.f30782a;
                }
                c3962tK.h();
                throw new VL(c3962tK.f35056H, c3962tK.f35056H == 416 ? new NH() : null);
            }
            httpURLConnection.getContentType();
            if (c3962tK.f35056H != 200 || j13 == j10) {
                j13 = j10;
            }
            boolean equalsIgnoreCase = com.anythink.expressad.foundation.g.f.g.b.f20128d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                z10 = equalsIgnoreCase;
                c3962tK.f35057I = j14;
            } else if (j14 != -1) {
                c3962tK.f35057I = j14;
                z10 = equalsIgnoreCase;
            } else {
                String headerField3 = httpURLConnection.getHeaderField("Content-Length");
                String headerField4 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = KM.f26663a;
                if (TextUtils.isEmpty(headerField3)) {
                    j11 = -1;
                } else {
                    try {
                        j11 = -1;
                        parseLong2 = Long.parseLong(headerField3);
                    } catch (NumberFormatException unused2) {
                        j11 = -1;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                        sb2.append("Unexpected Content-Length [");
                        sb2.append(headerField3);
                        sb2.append("]");
                        AbstractC2991bG.H("HttpUtil", sb2.toString());
                    }
                    if (!TextUtils.isEmpty(headerField4)) {
                        Matcher matcher2 = KM.f26663a.matcher(headerField4);
                        if (matcher2.matches()) {
                            try {
                                group = matcher2.group(2);
                            } catch (NumberFormatException unused3) {
                                z10 = equalsIgnoreCase;
                            }
                            try {
                            } catch (NumberFormatException unused4) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                sb3.append("Unexpected Content-Range [");
                                sb3.append(headerField4);
                                sb3.append("]");
                                AbstractC2991bG.H("HttpUtil", sb3.toString());
                                c3962tK.f35057I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                                c3962tK.f35054F = httpURLConnection.getInputStream();
                                if (z10) {
                                }
                                c3962tK.f35055G = true;
                                c(c2994bJ);
                                if (j13 != j10) {
                                }
                                return c3962tK.f35057I;
                            }
                            if (group == null) {
                                throw null;
                            }
                            long parseLong3 = Long.parseLong(group);
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                            }
                            long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                            if (parseLong2 < j10) {
                                z10 = equalsIgnoreCase;
                                parseLong2 = parseLong4;
                            } else if (parseLong2 != parseLong4) {
                                z10 = equalsIgnoreCase;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                sb4.append("Inconsistent headers [");
                                sb4.append(headerField3);
                                sb4.append("] [");
                                sb4.append(headerField4);
                                sb4.append("]");
                                AbstractC2991bG.y("HttpUtil", sb4.toString());
                                parseLong2 = Math.max(parseLong2, parseLong4);
                            }
                            c3962tK.f35057I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                        }
                    }
                    z10 = equalsIgnoreCase;
                    c3962tK.f35057I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                }
                parseLong2 = j11;
                if (!TextUtils.isEmpty(headerField4)) {
                }
                z10 = equalsIgnoreCase;
                c3962tK.f35057I = parseLong2 == j11 ? parseLong2 - j13 : j11;
            }
            try {
                c3962tK.f35054F = httpURLConnection.getInputStream();
                if (z10) {
                    c3962tK.f35054F = new GZIPInputStream(c3962tK.f35054F);
                }
                c3962tK.f35055G = true;
                c(c2994bJ);
                if (j13 != j10) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (j13 > j10) {
                            int min = (int) Math.min(j13, 4096L);
                            InputStream inputStream = c3962tK.f35054F;
                            String str3 = AbstractC3182eu.f30782a;
                            int read = inputStream.read(bArr, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new C3909sL(new InterruptedIOException(), 2000, 1);
                            }
                            if (read == -1) {
                                throw new C3909sL();
                            }
                            j13 -= read;
                            c3962tK.d(read);
                        }
                    } catch (IOException e10) {
                        c3962tK.h();
                        if (e10 instanceof C3909sL) {
                            throw ((C3909sL) e10);
                        }
                        throw new C3909sL(e10, 2000, 1);
                    }
                }
                return c3962tK.f35057I;
            } catch (IOException e11) {
                c3962tK.h();
                throw new C3909sL(e11, 2000, 1);
            }
        } catch (IOException e12) {
            e = e12;
            c3962tK2 = this;
            c3962tK2.h();
            throw C3909sL.a(e, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection f(URL url, long j6, long j9, boolean z6, boolean z9, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f35059y);
        httpURLConnection.setReadTimeout(this.f35060z);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f35050B.K());
        hashMap.putAll(this.f35051C.K());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j6 == 0) {
            if (j9 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.f35049A;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z6 ? U5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f20128d);
                httpURLConnection.setInstanceFollowRedirects(z9);
                httpURLConnection.setDoOutput(false);
                int i = C2994bJ.f30066f;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j6 = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j6);
        sb2.append("-");
        if (j9 != -1) {
            sb2.append((j6 + j9) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.f35049A;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z6 ? U5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f20128d);
        httpURLConnection.setInstanceFollowRedirects(z9);
        httpURLConnection.setDoOutput(false);
        int i4 = C2994bJ.f30066f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL g(URL url, String str) {
        if (str == null) {
            throw new C3909sL("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C3909sL("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f35058x || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(AbstractC5128c.j(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new C3909sL(sb.toString(), AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e9) {
            throw new C3909sL(e9, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f35053E;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                AbstractC2991bG.J("DefaultHttpDataSource", "Unexpected error while disconnecting", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f35053E;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C2994bJ c2994bJ = this.f35052D;
        if (c2994bJ != null) {
            return c2994bJ.f30067a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f35053E;
        return httpURLConnection == null ? C3793qC.f33993z : new C3102dK(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        try {
            InputStream inputStream = this.f35054F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    String str = AbstractC3182eu.f30782a;
                    throw new C3909sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f35054F = null;
            h();
            if (this.f35055G) {
                this.f35055G = false;
                e();
            }
            this.f35053E = null;
            this.f35052D = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j6 = this.f35057I;
            if (j6 != -1) {
                long j9 = j6 - this.J;
                if (j9 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j9);
            }
            InputStream inputStream = this.f35054F;
            String str = AbstractC3182eu.f30782a;
            int read = inputStream.read(bArr, i, i4);
            if (read != -1) {
                this.J += read;
                d(read);
                return read;
            }
            return -1;
        } catch (IOException e9) {
            String str2 = AbstractC3182eu.f30782a;
            throw C3909sL.a(e9, 2);
        }
    }
}
