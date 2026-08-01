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
public final class C3522lh extends AbstractC3557mF implements InterfaceC4157xM {

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f31773O = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: A, reason: collision with root package name */
    public final S0.l f31774A;

    /* renamed from: B, reason: collision with root package name */
    public C2971bJ f31775B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f31776C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayDeque f31777D;

    /* renamed from: E, reason: collision with root package name */
    public InputStream f31778E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f31779F;

    /* renamed from: G, reason: collision with root package name */
    public int f31780G;

    /* renamed from: H, reason: collision with root package name */
    public long f31781H;

    /* renamed from: I, reason: collision with root package name */
    public long f31782I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public long f31783K;

    /* renamed from: L, reason: collision with root package name */
    public long f31784L;

    /* renamed from: M, reason: collision with root package name */
    public final long f31785M;

    /* renamed from: N, reason: collision with root package name */
    public final long f31786N;

    /* renamed from: x, reason: collision with root package name */
    public final int f31787x;

    /* renamed from: y, reason: collision with root package name */
    public final int f31788y;

    /* renamed from: z, reason: collision with root package name */
    public final String f31789z;

    public C3522lh(String str, C3414jh c3414jh, int i, int i6, long j6, long j9) {
        super(true);
        AbstractC2772Sd.i(true ^ TextUtils.isEmpty(str));
        this.f31789z = str;
        this.f31774A = new S0.l(21);
        this.f31787x = i;
        this.f31788y = i6;
        this.f31777D = new ArrayDeque();
        this.f31785M = j6;
        this.f31786N = j9;
        if (c3414jh != null) {
            k(c3414jh);
        }
    }

    public final HttpURLConnection e(int i, long j6, long j9) {
        String uri = this.f31775B.f29279a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f31787x);
            httpURLConnection.setReadTimeout(this.f31788y);
            for (Map.Entry entry : this.f31774A.K().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 7 + String.valueOf(j9).length());
            sb.append("bytes=");
            sb.append(j6);
            sb.append("-");
            sb.append(j9);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f31789z);
            httpURLConnection.setRequestProperty("Accept-Encoding", U5.c.IDENTITY_NAME_SPACE);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f31777D.add(httpURLConnection);
            String uri2 = this.f31775B.f29279a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f31780G = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    f();
                    int i6 = this.f31780G;
                    throw new C3468kh(D.y.m(i6, "Response code: ", new StringBuilder(String.valueOf(i6).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f31778E != null) {
                        inputStream = new SequenceInputStream(this.f31778E, inputStream);
                    }
                    this.f31778E = inputStream;
                    return httpURLConnection;
                } catch (IOException e9) {
                    f();
                    throw new C3886sL(e9, 2000, i);
                }
            } catch (IOException e10) {
                f();
                throw new C3886sL("Unable to connect to ".concat(String.valueOf(uri2)), e10, 2000, i);
            }
        } catch (IOException e11) {
            throw new C3886sL("Unable to connect to ".concat(String.valueOf(uri)), e11, 2000, i);
        }
    }

    public final void f() {
        while (true) {
            ArrayDeque arrayDeque = this.f31777D;
            if (arrayDeque.isEmpty()) {
                this.f31776C = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e9) {
                int i = u2.z.f41322b;
                v2.i.d("Unexpected error while disconnecting", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final long g(C2971bJ c2971bJ) {
        this.f31775B = c2971bJ;
        this.f31782I = 0L;
        long j6 = c2971bJ.f29281c;
        long j9 = c2971bJ.f29282d;
        long j10 = this.f31785M;
        if (j9 != -1) {
            j10 = Math.min(j10, j9);
        }
        this.J = j6;
        HttpURLConnection e9 = e(1, j6, (j10 + j6) - 1);
        this.f31776C = e9;
        String headerField = e9.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f31773O.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j9 != -1) {
                        this.f31781H = j9;
                        this.f31783K = Math.max(parseLong, (this.J + j9) - 1);
                    } else {
                        this.f31781H = parseLong2 - this.J;
                        this.f31783K = parseLong2 - 1;
                    }
                    this.f31784L = parseLong;
                    this.f31779F = true;
                    b(c2971bJ);
                    return this.f31781H;
                } catch (NumberFormatException unused) {
                    String s9 = D.y.s(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i = u2.z.f41322b;
                    v2.i.c(s9);
                }
            }
        }
        throw new C3468kh("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f31776C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f31776C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        try {
            long j6 = this.f31781H;
            long j9 = this.f31782I;
            if (j6 - j9 == 0) {
                return -1;
            }
            long j10 = this.J + j9;
            long j11 = i6;
            long j12 = j10 + j11 + this.f31786N;
            long j13 = this.f31784L;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.f31783K;
                if (j13 < j15) {
                    long min = Math.min(j15, Math.max(((this.f31785M + j14) - r4) - 1, (j14 + j11) - 1));
                    e(2, j14, min);
                    this.f31784L = min;
                    j13 = min;
                }
            }
            int read = this.f31778E.read(bArr, i, (int) Math.min(j11, ((j13 + 1) - this.J) - this.f31782I));
            if (read == -1) {
                throw new EOFException();
            }
            this.f31782I += read;
            c(read);
            return read;
        } catch (IOException e9) {
            throw new C3886sL(e9, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        try {
            InputStream inputStream = this.f31778E;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    throw new C3886sL(e9, 2000, 3);
                }
            }
        } finally {
            this.f31778E = null;
            f();
            if (this.f31779F) {
                this.f31779F = false;
                d();
            }
        }
    }
}
