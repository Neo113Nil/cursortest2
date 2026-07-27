package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0826Cl implements InterfaceC1790fv {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC1250Tc A00;
    public Executor A01;
    public boolean A02;
    public C1795g0 A03;
    public final InterfaceC1800g5 A04 = new C0834Cu();
    public final InterfaceC1805gA A05;
    public final InterfaceC1806gB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC1789fu A01(AbstractC1802g7 abstractC1802g7) throws C1803g8 {
        C1803g8 c1803g8;
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        C0827Cm c0827Cm = null;
        boolean z8 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC1802g7.A05(), XD.A04() ? A09() : null);
                A0H(A082, abstractC1802g7);
                A0G(A082, abstractC1802g7);
                if (this.A06.AAZ()) {
                    this.A06.ABt(A082, abstractC1802g7.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z9 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z8 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z9 || z8)) {
                    try {
                        AbstractC1807gC.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e6) {
                        this.A00.ABz(A072, AbstractC1251Td.A1z, new C1252Te(e6));
                    } catch (Exception e9) {
                        this.A00.ABz(A072, AbstractC1251Td.A1y, new C1252Te(e9));
                    }
                }
                if (A082.getDoOutput() && abstractC1802g7.A06() != null) {
                    A00(A082, abstractC1802g7.A06());
                }
                C0827Cm A06 = A082.getDoInput() ? A06(A082) : new C0827Cm(A082, null);
                if (this.A06.AAZ()) {
                    this.A06.ABu(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Throwable th) {
                if (this.A06.AAZ()) {
                    this.A06.ABu(c0827Cm);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e10) {
            try {
                try {
                    c0827Cm = A05(null);
                } catch (Throwable unused) {
                    if (c0827Cm == null || c0827Cm.A9C() <= 0) {
                        throw new C1803g8(e10, c0827Cm);
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c0827Cm);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c0827Cm;
                }
            } catch (Exception unused2) {
                Log.e(getClass().getSimpleName(), A07(117, 13, 98), e10);
                if (0 != 0 && c0827Cm.A9C() > 0) {
                    if (this.A06.AAZ()) {
                        this.A06.ABu(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                c1803g8 = new C1803g8(e10, null);
            }
            if (A08[7].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
            if (c0827Cm == null || c0827Cm.A9C() <= 0) {
                c1803g8 = new C1803g8(e10, c0827Cm);
                throw c1803g8;
            }
            if (this.A06.AAZ()) {
                this.A06.ABu(c0827Cm);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            return c0827Cm;
        }
    }

    public static String A07(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, c.f16475b, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.A72() != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r3 = r9.A72().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r30.A04 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r7.ABo(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1789fu A0J(AbstractC1802g7 abstractC1802g7) throws C1803g8 {
        long j9;
        InterfaceC1789fu A01;
        int i = 0;
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = abstractC1802g7.A02().A01();
        long A03 = abstractC1802g7.A02().A03();
        long currentTimeMillis2 = System.currentTimeMillis() + abstractC1802g7.A02().A04();
        while (true) {
            if (i >= A012 || currentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAZ()) {
                    String str = (i + 1) + A07(37, 4, 97) + A012 + A07(56, 9, 27) + abstractC1802g7.A05();
                }
                currentTimeMillis = System.currentTimeMillis();
                A01 = A01(abstractC1802g7);
            } catch (C1803g8 e6) {
                if (A0I(e6, currentTimeMillis, abstractC1802g7)) {
                    int i4 = A012 - 1;
                    if (A08[1].charAt(0) == 'l') {
                        throw new RuntimeException();
                    }
                    A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                    if (i < i4) {
                        continue;
                    }
                }
                if (!this.A05.ADs(e6) || i >= A012 - 1) {
                    InterfaceC1789fu A00 = e6.A00();
                    InterfaceC1250Tc interfaceC1250Tc = this.A00;
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                    } else {
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    }
                    interfaceC1250Tc.ABo(currentTimeMillis, currentTimeMillis3, j9, abstractC1802g7.A04 == null ? 0L : abstractC1802g7.A04.length, A00 == null ? 0 : A00.A9C(), e6);
                    throw e6;
                }
                if (A03 > 0) {
                    try {
                        Thread.sleep(A03);
                    } catch (InterruptedException e9) {
                        this.A00.ABo(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, 0L, abstractC1802g7.A04 != null ? abstractC1802g7.A04.length : 0L, 0, e9);
                        throw e6;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.ABo(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, A01.A72().length, abstractC1802g7.A04 == null ? 0L : abstractC1802g7.A04.length, A01.A9C(), null);
                return A01;
            }
            continue;
            i++;
        }
    }

    static {
        A0A();
        A09 = InterfaceC1790fv.class.getSimpleName();
    }

    public C0826Cl(C1795g0 c1795g0, InterfaceC1250Tc interfaceC1250Tc, Executor executor) {
        A0B();
        this.A03 = c1795g0;
        this.A06 = new C0825Ck(c1795g0.A04());
        final InterfaceC1806gB interfaceC1806gB = this.A06;
        this.A05 = new AbstractC0833Ct(interfaceC1806gB) { // from class: com.facebook.ads.redexgen.X.2i
        };
        this.A01 = executor;
        this.A00 = interfaceC1250Tc;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AGn(httpURLConnection);
            if (outputStream != null) {
                this.A05.AL8(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC1789fu A02(AbstractC1802g7 abstractC1802g7) {
        if (this.A03.A04()) {
            A0C(abstractC1802g7);
        }
        InterfaceC1789fu interfaceC1789fu = null;
        try {
            interfaceC1789fu = A01(abstractC1802g7);
            return interfaceC1789fu;
        } catch (C1803g8 hre) {
            this.A05.ADs(hre);
            return interfaceC1789fu;
        } catch (Exception e6) {
            this.A05.ADs(new C1803g8(e6, interfaceC1789fu));
            return interfaceC1789fu;
        }
    }

    private final InterfaceC1789fu A03(String str, C1804g9 c1804g9, C1798g3 c1798g3) {
        return A02(new C0829Co(str, c1804g9, c1798g3));
    }

    private final InterfaceC1789fu A04(String str, String str2, byte[] bArr, C1798g3 c1798g3) {
        return A02(new C0828Cn(str, null, str2, bArr, c1798g3));
    }

    private final C0827Cm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            C0827Cm c0827Cm = new C0827Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0827Cm;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final C0827Cm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AGm(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AHT(inputStream);
            }
            C0827Cm c0827Cm = new C0827Cm(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0827Cm;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AGl(str, proxy);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e6);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(BaseATView.a.f9926E, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C0826Cl.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC1802g7 abstractC1802g7) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 43));
        boolean equals = abstractC1802g7.A03().equals(EnumC1801g6.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC1802g7.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(abstractC1802g7.A06(), Charset.forName(A07(a.f21889U, 5, 83))));
                sb.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : abstractC1802g7.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC1802g7.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC1802g7 abstractC1802g7, InterfaceC1791fw interfaceC1791fw) {
        this.A04.A6y(this, interfaceC1791fw, this.A01).A04(abstractC1802g7);
        if (this.A03.A04()) {
            A0C(abstractC1802g7);
        }
    }

    private void A0E(String str, int i, int i4) {
        String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i4;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i4);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC1791fw interfaceC1791fw, C1798g3 c1798g3) {
        C0828Cn req = new C0828Cn(str, null, str2, bArr, c1798g3);
        A0D(req, interfaceC1791fw);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC1802g7 abstractC1802g7) {
        Map<String, String> A06 = abstractC1802g7.A02().A06();
        InterfaceC1788ft A05 = abstractC1802g7.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6g = A05.A6g(this.A03.A03());
            for (String str2 : A6g.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6g.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC1802g7 abstractC1802g7) throws IOException {
        C1798g3 A02 = abstractC1802g7.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AH6(httpURLConnection, abstractC1802g7.A03(), abstractC1802g7.A04());
    }

    private final boolean A0I(Throwable th, long j9, AbstractC1802g7 abstractC1802g7) {
        C1798g3 A02 = abstractC1802g7.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j9) + 10;
        if (this.A06.AAZ()) {
            String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            long A022 = A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return currentTimeMillis >= A022;
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C1795g0 A0K() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1790fv
    @Deprecated
    public final InterfaceC1789fu AGw(String str, Map<String, String> parameters) {
        return A03(str, new C1804g9(parameters), this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1790fv
    @Deprecated
    public final InterfaceC1789fu AGx(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1790fv
    public final void AGy(String str, byte[] bArr, InterfaceC1791fw interfaceC1791fw) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC1791fw, this.A03.A00());
    }
}
