package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ih, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3374ih extends AbstractC3624nF implements KM {

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f31861O = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: A, reason: collision with root package name */
    public final C4164xG f31862A;

    /* renamed from: B, reason: collision with root package name */
    public C3197fJ f31863B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f31864C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayDeque f31865D;

    /* renamed from: E, reason: collision with root package name */
    public InputStream f31866E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f31867F;

    /* renamed from: G, reason: collision with root package name */
    public int f31868G;

    /* renamed from: H, reason: collision with root package name */
    public long f31869H;

    /* renamed from: I, reason: collision with root package name */
    public long f31870I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public long f31871K;

    /* renamed from: L, reason: collision with root package name */
    public long f31872L;

    /* renamed from: M, reason: collision with root package name */
    public final long f31873M;

    /* renamed from: N, reason: collision with root package name */
    public final long f31874N;

    /* renamed from: x, reason: collision with root package name */
    public final int f31875x;

    /* renamed from: y, reason: collision with root package name */
    public final int f31876y;

    /* renamed from: z, reason: collision with root package name */
    public final String f31877z;

    public C3374ih(String str, C3267gh c3267gh, int i, int i4, long j9, long j10) {
        super(true);
        PA.n(true ^ TextUtils.isEmpty(str));
        this.f31877z = str;
        this.f31862A = new C4164xG(4);
        this.f31875x = i;
        this.f31876y = i4;
        this.f31865D = new ArrayDeque();
        this.f31873M = j9;
        this.f31874N = j10;
        if (c3267gh != null) {
            a(c3267gh);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final long F(C3197fJ c3197fJ) {
        this.f31863B = c3197fJ;
        this.f31870I = 0L;
        long j9 = c3197fJ.f30688c;
        long j10 = c3197fJ.f30689d;
        long j11 = this.f31873M;
        if (j10 != -1) {
            j11 = Math.min(j11, j10);
        }
        this.J = j9;
        HttpURLConnection f6 = f(1, j9, (j11 + j9) - 1);
        this.f31864C = f6;
        String headerField = f6.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f31861O.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j10 != -1) {
                        this.f31869H = j10;
                        this.f31871K = Math.max(parseLong, (this.J + j10) - 1);
                    } else {
                        this.f31869H = parseLong2 - this.J;
                        this.f31871K = parseLong2 - 1;
                    }
                    this.f31872L = parseLong;
                    this.f31867F = true;
                    c(c3197fJ);
                    return this.f31869H;
                } catch (NumberFormatException unused) {
                    String o9 = D.y.o(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = t2.C.f40822b;
                    u2.i.c(o9);
                }
            }
        }
        throw new C3321hh("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    public final HttpURLConnection f(int i, long j9, long j10) {
        String uri = this.f31863B.f30686a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f31875x);
            httpURLConnection.setReadTimeout(this.f31876y);
            for (Map.Entry entry : this.f31862A.K().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 7 + String.valueOf(j10).length());
            sb.append("bytes=");
            sb.append(j9);
            sb.append("-");
            sb.append(j10);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f31877z);
            httpURLConnection.setRequestProperty("Accept-Encoding", Q5.c.IDENTITY_NAME_SPACE);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f31865D.add(httpURLConnection);
            String uri2 = this.f31863B.f30686a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f31868G = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    g();
                    int i4 = this.f31868G;
                    throw new C3321hh(D.y.j(i4, "Response code: ", new StringBuilder(String.valueOf(i4).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f31866E != null) {
                        inputStream = new SequenceInputStream(this.f31866E, inputStream);
                    }
                    this.f31866E = inputStream;
                    return httpURLConnection;
                } catch (IOException e6) {
                    g();
                    throw new AL(e6, 2000, i);
                }
            } catch (IOException e9) {
                g();
                throw new AL("Unable to connect to ".concat(String.valueOf(uri2)), e9, 2000, i);
            }
        } catch (IOException e10) {
            throw new AL("Unable to connect to ".concat(String.valueOf(uri)), e10, 2000, i);
        }
    }

    public final void g() {
        while (true) {
            ArrayDeque arrayDeque = this.f31865D;
            if (arrayDeque.isEmpty()) {
                this.f31864C = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e6) {
                int i = t2.C.f40822b;
                u2.i.d("Unexpected error while disconnecting", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f31864C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f31864C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        try {
            InputStream inputStream = this.f31866E;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new AL(e6, 2000, 3);
                }
            }
        } finally {
            this.f31866E = null;
            g();
            if (this.f31867F) {
                this.f31867F = false;
                e();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j9 = this.f31869H;
            long j10 = this.f31870I;
            if (j9 - j10 == 0) {
                return -1;
            }
            long j11 = this.J + j10;
            long j12 = i4;
            long j13 = j11 + j12 + this.f31874N;
            long j14 = this.f31872L;
            long j15 = j14 + 1;
            if (j13 > j15) {
                long j16 = this.f31871K;
                if (j14 < j16) {
                    long min = Math.min(j16, Math.max(((this.f31873M + j15) - r4) - 1, (j15 + j12) - 1));
                    f(2, j15, min);
                    this.f31872L = min;
                    j14 = min;
                }
            }
            int read = this.f31866E.read(bArr, i, (int) Math.min(j12, ((j14 + 1) - this.J) - this.f31870I));
            if (read == -1) {
                throw new EOFException();
            }
            this.f31870I += read;
            d(read);
            return read;
        } catch (IOException e6) {
            throw new AL(e6, 2000, 2);
        }
    }
}
