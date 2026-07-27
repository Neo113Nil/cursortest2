package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2068kh implements InterfaceC1057Ll {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, 14, 77, 65, c.f16475b, c.f16475b, 75, 77, 90, 71, 65, c.f16475b, 14, 71, 93, 14, 79, 76, 93, 75, c.f16475b, 90, 15, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, c.f16476c, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, c.f16476c, 112, 54, 34, c.f16476c, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, 15, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, c.f16475b, 70, 71, 0, c.f16476c, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, 16, 17, 28, 7, 16, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, 15, 65, 99};
    }

    static {
        A04();
        A07 = C2068kh.class.getSimpleName();
    }

    public C2068kh(String str) {
        this(str, C1055Lj.A01(str));
    }

    public C2068kh(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C2068kh(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) AbstractC1056Lk.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i4) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i4 == 200 ? contentLength : i4 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r6 != 303) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection A02(int i, int i4) throws IOException, C2074kn {
        HttpURLConnection httpURLConnection;
        boolean z8;
        int code = 0;
        String str = this.A03;
        do {
            String str2 = A01(234, 16, 75) + (i > 0 ? A01(19, 13, 66) + i : A01(0, 0, a.f21886R)) + A01(15, 4, 5) + str;
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(250, 5, 3), A01(322, 6, 120) + i + A01(50, 1, 44));
            }
            if (i4 > 0) {
                httpURLConnection.setConnectTimeout(i4);
                if (A09[3].length() != 13) {
                    throw new RuntimeException();
                }
                A09[0] = "1Ss55MOjwkg";
                httpURLConnection.setReadTimeout(i4);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            if (responseCode != 301) {
                String[] strArr = A09;
                String url = strArr[4];
                String str3 = strArr[6];
                int length = url.length();
                int redirectCount = str3.length();
                if (length == redirectCount) {
                    String[] strArr2 = A09;
                    strArr2[1] = "p6lJtanqIpTVtR8wvrkpKJ2zYO";
                    strArr2[5] = "gJMCNOhCywWTIArSLN7pAqKg27";
                }
                if (z8) {
                    str = httpURLConnection.getHeaderField(A01(226, 8, 45));
                    code++;
                    httpURLConnection.disconnect();
                }
                if (code <= 5) {
                    String url2 = A01(293, 20, 113) + code;
                    throw new C2074kn(url2);
                }
            }
            z8 = true;
            if (z8) {
            }
            if (code <= 5) {
            }
        } while (z8);
        return httpURLConnection;
    }

    private void A03() throws C2074kn {
        String str = A01(p.f8630b, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, 10000);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C1055Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e6) {
                Log.e(A07, A01(a.f21888T, 25, 84) + this.A03, e6);
                C1055Lj.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            C1055Lj.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i4) throws C2074kn {
        try {
            this.A02 = A02(i, i4);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e6) {
            throw new C2074kn(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i, e6);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1057Ll
    public final void AGj(int i) throws C2074kn {
        A05(i, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1057Ll
    public final void close() throws C2074kn {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e6) {
                throw new C2074kn(A01(92, 37, 89), e6);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1057Ll
    public final synchronized int length() throws C2074kn {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1057Ll
    public final int read(byte[] bArr) throws C2074kn {
        InputStream inputStream = this.A01;
        String A01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e6) {
                final String str = A01(com.anythink.expressad.foundation.g.a.aW, 15, 60) + this.A03 + A01(0, 15, 15);
                throw new C2074kn(str, e6) { // from class: com.facebook.ads.redexgen.X.8K
                };
            } catch (IOException e9) {
                throw new C2074kn(A01 + this.A03, e9);
            }
        }
        throw new C2074kn(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(BaseATView.a.f9927F, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
