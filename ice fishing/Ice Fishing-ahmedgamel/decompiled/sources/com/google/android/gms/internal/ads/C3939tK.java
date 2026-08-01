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

/* renamed from: com.google.android.gms.internal.ads.tK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3939tK extends AbstractC3557mF implements InterfaceC4157xM {

    /* renamed from: A, reason: collision with root package name */
    public final String f34263A;

    /* renamed from: B, reason: collision with root package name */
    public final S0.l f34264B;

    /* renamed from: C, reason: collision with root package name */
    public final S0.l f34265C;

    /* renamed from: D, reason: collision with root package name */
    public C2971bJ f34266D;

    /* renamed from: E, reason: collision with root package name */
    public HttpURLConnection f34267E;

    /* renamed from: F, reason: collision with root package name */
    public InputStream f34268F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f34269G;

    /* renamed from: H, reason: collision with root package name */
    public int f34270H;

    /* renamed from: I, reason: collision with root package name */
    public long f34271I;
    public long J;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f34272x;

    /* renamed from: y, reason: collision with root package name */
    public final int f34273y;

    /* renamed from: z, reason: collision with root package name */
    public final int f34274z;

    public /* synthetic */ C3939tK(String str, int i, int i6, boolean z3, S0.l lVar) {
        super(true);
        this.f34263A = str;
        this.f34273y = i;
        this.f34274z = i6;
        this.f34272x = z3;
        this.f34264B = lVar;
        this.f34265C = new S0.l(21);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection e(URL url, long j6, long j9, boolean z3, boolean z6, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f34273y);
        httpURLConnection.setReadTimeout(this.f34274z);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f34264B.K());
        hashMap.putAll(this.f34265C.K());
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
                str = this.f34263A;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z3 ? U5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f19341d);
                httpURLConnection.setInstanceFollowRedirects(z6);
                httpURLConnection.setDoOutput(false);
                int i = C2971bJ.f29278f;
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
        str = this.f34263A;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z3 ? U5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f19341d);
        httpURLConnection.setInstanceFollowRedirects(z6);
        httpURLConnection.setDoOutput(false);
        int i6 = C2971bJ.f29278f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL f(URL url, String str) {
        if (str == null) {
            throw new C3886sL("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C3886sL("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f34272x || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(u1.h.a(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new C3886sL(sb.toString(), AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e9) {
            throw new C3886sL(e9, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01df A[Catch: IOException -> 0x01ea, TRY_LEAVE, TryCatch #0 {IOException -> 0x01ea, blocks: (B:27:0x01d7, B:29:0x01df), top: B:26:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(C2971bJ c2971bJ) {
        URL url;
        long j6;
        long j9;
        boolean z3;
        C3939tK c3939tK;
        long j10;
        HttpURLConnection httpURLConnection;
        boolean z6;
        long parseLong;
        boolean z9;
        long j11;
        long parseLong2;
        String group;
        C3939tK c3939tK2 = this;
        C2971bJ c2971bJ2 = c2971bJ;
        c3939tK2.f34266D = c2971bJ2;
        long j12 = 0;
        c3939tK2.J = 0L;
        c3939tK2.f34271I = 0L;
        a(c2971bJ);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            url = new URL(c2971bJ2.f29279a.toString());
            j6 = c2971bJ2.f29281c;
            j9 = c2971bJ2.f29282d;
            z3 = false;
        } catch (IOException e9) {
            e = e9;
        }
        try {
            if (c3939tK2.f34272x) {
                int i = 0;
                while (true) {
                    int i6 = i + 1;
                    if (i > 20) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                        sb.append("Too many redirects: ");
                        sb.append(i6);
                        throw new C3886sL(new NoRouteToHostException(sb.toString()), AdError.INTERNAL_ERROR_CODE, 1);
                    }
                    c3939tK = this;
                    HttpURLConnection e10 = c3939tK.e(url, j6, j9, z3, false, c2971bJ2.f29280b);
                    int responseCode = e10.getResponseCode();
                    String headerField = e10.getHeaderField("Location");
                    j10 = j12;
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnection = e10;
                        break;
                    }
                    e10.disconnect();
                    url = c3939tK.f(url, headerField);
                    c2971bJ2 = c2971bJ;
                    i = i6;
                    j12 = j10;
                    z3 = false;
                }
            } else {
                httpURLConnection = c3939tK2.e(url, j6, j9, false, true, c2971bJ2.f29280b);
                c3939tK = this;
                j10 = 0;
            }
            c3939tK.f34267E = httpURLConnection;
            c3939tK.f34270H = httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            int i9 = c3939tK.f34270H;
            long j13 = c2971bJ2.f29281c;
            long j14 = c2971bJ2.f29282d;
            if (i9 < 200 || i9 > 299) {
                httpURLConnection.getHeaderFields();
                if (c3939tK.f34270H == 416) {
                    String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = KM.f25911a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        Matcher matcher = KM.f25912b.matcher(headerField2);
                        if (matcher.matches()) {
                            z6 = true;
                            String group2 = matcher.group(1);
                            group2.getClass();
                            parseLong = Long.parseLong(group2);
                            if (j13 == parseLong) {
                                c3939tK.f34269G = z6;
                                b(c2971bJ);
                                return j14 != -1 ? j14 : j10;
                            }
                        }
                    }
                    z6 = true;
                    parseLong = -1;
                    if (j13 == parseLong) {
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        GC.a(errorStream);
                    } else {
                        String str = AbstractC3159eu.f29993a;
                    }
                } catch (IOException unused) {
                    String str2 = AbstractC3159eu.f29993a;
                }
                c3939tK.h();
                throw new VL(c3939tK.f34270H, c3939tK.f34270H == 416 ? new NH() : null);
            }
            httpURLConnection.getContentType();
            if (c3939tK.f34270H != 200 || j13 == j10) {
                j13 = j10;
            }
            boolean equalsIgnoreCase = com.anythink.expressad.foundation.g.f.g.b.f19341d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                z9 = equalsIgnoreCase;
                c3939tK.f34271I = j14;
            } else if (j14 != -1) {
                c3939tK.f34271I = j14;
                z9 = equalsIgnoreCase;
            } else {
                String headerField3 = httpURLConnection.getHeaderField("Content-Length");
                String headerField4 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = KM.f25911a;
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
                        AbstractC2968bG.H("HttpUtil", sb2.toString());
                    }
                    if (!TextUtils.isEmpty(headerField4)) {
                        Matcher matcher2 = KM.f25911a.matcher(headerField4);
                        if (matcher2.matches()) {
                            try {
                                group = matcher2.group(2);
                            } catch (NumberFormatException unused3) {
                                z9 = equalsIgnoreCase;
                            }
                            try {
                            } catch (NumberFormatException unused4) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                sb3.append("Unexpected Content-Range [");
                                sb3.append(headerField4);
                                sb3.append("]");
                                AbstractC2968bG.H("HttpUtil", sb3.toString());
                                c3939tK.f34271I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                                c3939tK.f34268F = httpURLConnection.getInputStream();
                                if (z9) {
                                }
                                c3939tK.f34269G = true;
                                b(c2971bJ);
                                if (j13 != j10) {
                                }
                                return c3939tK.f34271I;
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
                                z9 = equalsIgnoreCase;
                                parseLong2 = parseLong4;
                            } else if (parseLong2 != parseLong4) {
                                z9 = equalsIgnoreCase;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                sb4.append("Inconsistent headers [");
                                sb4.append(headerField3);
                                sb4.append("] [");
                                sb4.append(headerField4);
                                sb4.append("]");
                                AbstractC2968bG.y("HttpUtil", sb4.toString());
                                parseLong2 = Math.max(parseLong2, parseLong4);
                            }
                            c3939tK.f34271I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                        }
                    }
                    z9 = equalsIgnoreCase;
                    c3939tK.f34271I = parseLong2 == j11 ? parseLong2 - j13 : j11;
                }
                parseLong2 = j11;
                if (!TextUtils.isEmpty(headerField4)) {
                }
                z9 = equalsIgnoreCase;
                c3939tK.f34271I = parseLong2 == j11 ? parseLong2 - j13 : j11;
            }
            try {
                c3939tK.f34268F = httpURLConnection.getInputStream();
                if (z9) {
                    c3939tK.f34268F = new GZIPInputStream(c3939tK.f34268F);
                }
                c3939tK.f34269G = true;
                b(c2971bJ);
                if (j13 != j10) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (j13 > j10) {
                            int min = (int) Math.min(j13, 4096L);
                            InputStream inputStream = c3939tK.f34268F;
                            String str3 = AbstractC3159eu.f29993a;
                            int read = inputStream.read(bArr, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new C3886sL(new InterruptedIOException(), 2000, 1);
                            }
                            if (read == -1) {
                                throw new C3886sL();
                            }
                            j13 -= read;
                            c3939tK.c(read);
                        }
                    } catch (IOException e11) {
                        c3939tK.h();
                        if (e11 instanceof C3886sL) {
                            throw ((C3886sL) e11);
                        }
                        throw new C3886sL(e11, 2000, 1);
                    }
                }
                return c3939tK.f34271I;
            } catch (IOException e12) {
                c3939tK.h();
                throw new C3886sL(e12, 2000, 1);
            }
        } catch (IOException e13) {
            e = e13;
            c3939tK2 = this;
            c3939tK2.h();
            throw C3886sL.a(e, 1);
        }
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f34267E;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                AbstractC2968bG.J("DefaultHttpDataSource", "Unexpected error while disconnecting", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f34267E;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C2971bJ c2971bJ = this.f34266D;
        if (c2971bJ != null) {
            return c2971bJ.f29279a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f34267E;
        return httpURLConnection == null ? C3770qC.f33209z : new C3079dK(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        try {
            long j6 = this.f34271I;
            if (j6 != -1) {
                long j9 = j6 - this.J;
                if (j9 == 0) {
                    return -1;
                }
                i6 = (int) Math.min(i6, j9);
            }
            InputStream inputStream = this.f34268F;
            String str = AbstractC3159eu.f29993a;
            int read = inputStream.read(bArr, i, i6);
            if (read != -1) {
                this.J += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e9) {
            String str2 = AbstractC3159eu.f29993a;
            throw C3886sL.a(e9, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        try {
            InputStream inputStream = this.f34268F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    String str = AbstractC3159eu.f29993a;
                    throw new C3886sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f34268F = null;
            h();
            if (this.f34269G) {
                this.f34269G = false;
                d();
            }
            this.f34267E = null;
            this.f34266D = null;
            TrafficStats.clearThreadStatsTag();
        }
    }
}
