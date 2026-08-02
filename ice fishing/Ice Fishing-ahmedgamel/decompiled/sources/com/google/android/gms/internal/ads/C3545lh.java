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

/* renamed from: com.google.android.gms.internal.ads.lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3545lh extends AbstractC3580mF implements InterfaceC4180xM {

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f32552O = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: A, reason: collision with root package name */
    public final S0.l f32553A;

    /* renamed from: B, reason: collision with root package name */
    public C2994bJ f32554B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f32555C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayDeque f32556D;

    /* renamed from: E, reason: collision with root package name */
    public InputStream f32557E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f32558F;

    /* renamed from: G, reason: collision with root package name */
    public int f32559G;

    /* renamed from: H, reason: collision with root package name */
    public long f32560H;

    /* renamed from: I, reason: collision with root package name */
    public long f32561I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public long f32562K;

    /* renamed from: L, reason: collision with root package name */
    public long f32563L;

    /* renamed from: M, reason: collision with root package name */
    public final long f32564M;

    /* renamed from: N, reason: collision with root package name */
    public final long f32565N;

    /* renamed from: x, reason: collision with root package name */
    public final int f32566x;

    /* renamed from: y, reason: collision with root package name */
    public final int f32567y;

    /* renamed from: z, reason: collision with root package name */
    public final String f32568z;

    public C3545lh(String str, C3437jh c3437jh, int i, int i4, long j6, long j9) {
        super(true);
        AbstractC2792Sd.i(true ^ TextUtils.isEmpty(str));
        this.f32568z = str;
        this.f32553A = new S0.l(24);
        this.f32566x = i;
        this.f32567y = i4;
        this.f32556D = new ArrayDeque();
        this.f32564M = j6;
        this.f32565N = j9;
        if (c3437jh != null) {
            m(c3437jh);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final long b(C2994bJ c2994bJ) {
        this.f32554B = c2994bJ;
        this.f32561I = 0L;
        long j6 = c2994bJ.f30069c;
        long j9 = c2994bJ.f30070d;
        long j10 = this.f32564M;
        if (j9 != -1) {
            j10 = Math.min(j10, j9);
        }
        this.J = j6;
        HttpURLConnection f2 = f(1, j6, (j10 + j6) - 1);
        this.f32555C = f2;
        String headerField = f2.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f32552O.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j9 != -1) {
                        this.f32560H = j9;
                        this.f32562K = Math.max(parseLong, (this.J + j9) - 1);
                    } else {
                        this.f32560H = parseLong2 - this.J;
                        this.f32562K = parseLong2 - 1;
                    }
                    this.f32563L = parseLong;
                    this.f32558F = true;
                    c(c2994bJ);
                    return this.f32560H;
                } catch (NumberFormatException unused) {
                    String p9 = D.x.p(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = w2.z.f41712b;
                    x2.i.c(p9);
                }
            }
        }
        throw new C3491kh("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    public final HttpURLConnection f(int i, long j6, long j9) {
        String uri = this.f32554B.f30067a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f32566x);
            httpURLConnection.setReadTimeout(this.f32567y);
            for (Map.Entry entry : this.f32553A.K().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 7 + String.valueOf(j9).length());
            sb.append("bytes=");
            sb.append(j6);
            sb.append("-");
            sb.append(j9);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f32568z);
            httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f32556D.add(httpURLConnection);
            String uri2 = this.f32554B.f30067a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f32559G = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    g();
                    int i4 = this.f32559G;
                    throw new C3491kh(D.x.k(i4, "Response code: ", new StringBuilder(String.valueOf(i4).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f32557E != null) {
                        inputStream = new SequenceInputStream(this.f32557E, inputStream);
                    }
                    this.f32557E = inputStream;
                    return httpURLConnection;
                } catch (IOException e9) {
                    g();
                    throw new C3909sL(e9, 2000, i);
                }
            } catch (IOException e10) {
                g();
                throw new C3909sL("Unable to connect to ".concat(String.valueOf(uri2)), e10, 2000, i);
            }
        } catch (IOException e11) {
            throw new C3909sL("Unable to connect to ".concat(String.valueOf(uri)), e11, 2000, i);
        }
    }

    public final void g() {
        while (true) {
            ArrayDeque arrayDeque = this.f32556D;
            if (arrayDeque.isEmpty()) {
                this.f32555C = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e9) {
                int i = w2.z.f41712b;
                x2.i.d("Unexpected error while disconnecting", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f32555C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f32555C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        try {
            InputStream inputStream = this.f32557E;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    throw new C3909sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f32557E = null;
            g();
            if (this.f32558F) {
                this.f32558F = false;
                e();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j6 = this.f32560H;
            long j9 = this.f32561I;
            if (j6 - j9 == 0) {
                return -1;
            }
            long j10 = this.J + j9;
            long j11 = i4;
            long j12 = j10 + j11 + this.f32565N;
            long j13 = this.f32563L;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.f32562K;
                if (j13 < j15) {
                    long min = Math.min(j15, Math.max(((this.f32564M + j14) - r4) - 1, (j14 + j11) - 1));
                    f(2, j14, min);
                    this.f32563L = min;
                    j13 = min;
                }
            }
            int read = this.f32557E.read(bArr, i, (int) Math.min(j11, ((j13 + 1) - this.J) - this.f32561I));
            if (read == -1) {
                throw new EOFException();
            }
            this.f32561I += read;
            d(read);
            return read;
        } catch (IOException e9) {
            throw new C3909sL(e9, 2000, 2);
        }
    }
}
