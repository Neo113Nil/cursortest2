package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.grpc.okhttp.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class noj implements u56 {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final m66 E;
    public baf F;
    public boolean G;
    public long H;
    public long I;
    public final dsd J;
    public final int K;
    public final xiu L;
    public final fwe M;
    public final d6e N;
    public final int O;
    public final InetSocketAddress a;
    public final String b;
    public final String c;
    public final Random d;
    public final yqr e;
    public final int f;
    public final g5e g;
    public r0o h;
    public ynb i;
    public anx j;
    public final Object k;
    public final sue l;
    public int m;
    public final HashMap n;
    public final Executor o;
    public final sip p;
    public final ScheduledExecutorService q;
    public final int r;
    public int s;
    public moj t;
    public xu1 u;
    public sgr v;
    public boolean w;
    public r5e x;
    public boolean y;
    public boolean z;

    static {
        EnumMap enumMap = new EnumMap(afb.class);
        sgr sgrVar = sgr.n;
        enumMap.put((EnumMap) afb.NO_ERROR, (afb) sgrVar.i("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) afb.PROTOCOL_ERROR, (afb) sgrVar.i("Protocol error"));
        enumMap.put((EnumMap) afb.INTERNAL_ERROR, (afb) sgrVar.i("Internal error"));
        enumMap.put((EnumMap) afb.FLOW_CONTROL_ERROR, (afb) sgrVar.i("Flow control error"));
        enumMap.put((EnumMap) afb.STREAM_CLOSED, (afb) sgrVar.i("Stream closed"));
        enumMap.put((EnumMap) afb.FRAME_TOO_LARGE, (afb) sgrVar.i("Frame too large"));
        enumMap.put((EnumMap) afb.REFUSED_STREAM, (afb) sgr.o.i("Refused stream"));
        enumMap.put((EnumMap) afb.CANCEL, (afb) sgr.f.i("Cancelled"));
        enumMap.put((EnumMap) afb.COMPRESSION_ERROR, (afb) sgrVar.i("Compression error"));
        enumMap.put((EnumMap) afb.CONNECT_ERROR, (afb) sgrVar.i("Connect error"));
        enumMap.put((EnumMap) afb.ENHANCE_YOUR_CALM, (afb) sgr.l.i("Enhance your calm"));
        enumMap.put((EnumMap) afb.INADEQUATE_SECURITY, (afb) sgr.j.i("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(noj.class.getName());
    }

    public noj(goj gojVar, InetSocketAddress inetSocketAddress, String str, xu1 xu1Var, d6e d6eVar, dsd dsdVar) {
        vqd vqdVar = xqd.t;
        g5e g5eVar = new g5e();
        this.d = new Random();
        Object obj = new Object();
        this.k = obj;
        this.n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new fwe(this, 2);
        this.O = 30000;
        o2g.O(inetSocketAddress, "address");
        this.a = inetSocketAddress;
        this.b = str;
        this.r = gojVar.h;
        this.f = gojVar.l;
        Executor executor = gojVar.b;
        o2g.O(executor, "executor");
        this.o = executor;
        this.p = new sip(gojVar.b);
        ScheduledExecutorService scheduledExecutorService = gojVar.d;
        o2g.O(scheduledExecutorService, "scheduledExecutorService");
        this.q = scheduledExecutorService;
        this.m = 3;
        this.A = SocketFactory.getDefault();
        this.B = gojVar.f;
        m66 m66Var = gojVar.g;
        o2g.O(m66Var, "connectionSpec");
        this.E = m66Var;
        o2g.O(vqdVar, "stopwatchFactory");
        this.e = vqdVar;
        this.g = g5eVar;
        this.c = "grpc-java-okhttp/1.61.1";
        this.N = d6eVar;
        this.J = dsdVar;
        this.K = gojVar.m;
        gojVar.e.getClass();
        this.L = new xiu(2);
        this.l = sue.a(inetSocketAddress.toString(), noj.class);
        xu1 xu1Var2 = xu1.b;
        wu1 wu1Var = bkp.f;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(wu1Var, xu1Var);
        for (Map.Entry entry : xu1Var2.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((wu1) entry.getKey(), entry.getValue());
            }
        }
        this.u = new xu1(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void e(noj nojVar, String str) {
        afb afbVar = afb.PROTOCOL_ERROR;
        nojVar.r(0, afbVar, v(afbVar).c(str));
    }

    public static Socket g(noj nojVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        int i;
        String str4;
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = nojVar.A;
            createSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
        } catch (IOException e) {
            e = e;
        }
        try {
            createSocket.setTcpNoDelay(true);
            createSocket.setSoTimeout(nojVar.O);
            lt1 U = fxf.U(createSocket);
            hkn hknVar = new hkn(fxf.R(createSocket));
            nnd h = nojVar.h(inetSocketAddress, str, str2);
            oxa oxaVar = (oxa) h.c;
            v7e v7eVar = (v7e) h.b;
            Locale locale = Locale.US;
            hknVar.M("CONNECT " + v7eVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + v7eVar.b + " HTTP/1.1");
            hknVar.M("\r\n");
            String[] strArr = (String[]) oxaVar.b;
            String[] strArr2 = (String[]) oxaVar.b;
            int length = strArr.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                if (i3 >= 0 && i3 < strArr2.length) {
                    str3 = strArr2[i3];
                    hknVar.M(str3);
                    hknVar.M(": ");
                    i = i3 + 1;
                    if (i >= 0 && i < strArr2.length) {
                        str4 = strArr2[i];
                        hknVar.M(str4);
                        hknVar.M("\r\n");
                    }
                    str4 = null;
                    hknVar.M(str4);
                    hknVar.M("\r\n");
                }
                str3 = null;
                hknVar.M(str3);
                hknVar.M(": ");
                i = i3 + 1;
                if (i >= 0) {
                    str4 = strArr2[i];
                    hknVar.M(str4);
                    hknVar.M("\r\n");
                }
                str4 = null;
                hknVar.M(str4);
                hknVar.M("\r\n");
            }
            hknVar.M("\r\n");
            hknVar.flush();
            w2r c = w2r.c(p(U));
            int i4 = c.b;
            while (!p(U).equals("")) {
            }
            if (i4 >= 200 && i4 < 300) {
                createSocket.setSoTimeout(0);
                return createSocket;
            }
            hi3 hi3Var = new hi3();
            try {
                createSocket.shutdownOutput();
                U.e0(hi3Var, 1024L);
            } catch (IOException e2) {
                hi3Var.S0("Unable to read body: " + e2.toString());
            }
            try {
                createSocket.close();
            } catch (IOException unused) {
            }
            Locale locale2 = Locale.US;
            throw sgr.o.i("Response returned from proxy was not successful (expected 2xx, got " + i4 + StringUtil.SPACE + ((String) c.d) + "). Response body:\n" + hi3Var.G0()).a();
        } catch (IOException e3) {
            e = e3;
            socket = createSocket;
            if (socket != null) {
                xqd.b(socket);
            }
            throw sgr.o.i("Failed trying to connect with proxy").h(e).a();
        }
    }

    public static String p(lt1 lt1Var) {
        long j;
        hi3 hi3Var = new hi3();
        do {
            long e0 = lt1Var.e0(hi3Var, 1L);
            j = hi3Var.b;
            if (e0 == -1) {
                throw new EOFException("\\n not found: " + hi3Var.g0(j).e());
            }
        } while (hi3Var.P(j - 1) != 10);
        return hi3Var.G(Long.MAX_VALUE);
    }

    public static sgr v(afb afbVar) {
        sgr sgrVar = (sgr) P.get(afbVar);
        if (sgrVar != null) {
            return sgrVar;
        }
        return sgr.g.i("Unknown http2 error code: " + afbVar.a);
    }

    @Override // defpackage.pue
    public final sue a() {
        return this.l;
    }

    @Override // defpackage.s8h
    public final void b(sgr sgrVar) {
        synchronized (this.k) {
            try {
                if (this.v != null) {
                    return;
                }
                this.v = sgrVar;
                this.h.f(sgrVar);
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s8h
    public final void c(sgr sgrVar) {
        b(sgrVar);
        synchronized (this.k) {
            try {
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((a) entry.getValue()).l.m(sgrVar, false, new s2i());
                    n((a) entry.getValue());
                }
                for (a aVar : this.D) {
                    aVar.l.l(sgrVar, no4.d, true, new s2i());
                    n(aVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s8h
    public final Runnable d(r8h r8hVar) {
        this.h = (r0o) r8hVar;
        if (this.G) {
            baf bafVar = new baf(new awc(this), this.q, this.H, this.I);
            this.F = bafVar;
            synchronized (bafVar) {
            }
        }
        ct1 ct1Var = new ct1(this.p, this);
        g5e g5eVar = this.g;
        hkn hknVar = new hkn(ct1Var);
        g5eVar.getClass();
        at1 at1Var = new at1(ct1Var, new e5e(hknVar));
        synchronized (this.k) {
            ynb ynbVar = new ynb(this, at1Var);
            this.i = ynbVar;
            anx anxVar = new anx();
            anxVar.b = this;
            anxVar.c = ynbVar;
            anxVar.a = 65535;
            anxVar.d = new pxj(anxVar, 0, 65535, null);
            this.j = anxVar;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.p.execute(new nud(13, this, countDownLatch, ct1Var));
        try {
            q();
            countDownLatch.countDown();
            this.p.execute(new dsd(19, this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // defpackage.ro4
    public final mo4 f(k3i k3iVar, s2i s2iVar, ks3 ks3Var, qo4[] qo4VarArr) {
        a aVar;
        o2g.O(k3iVar, "method");
        o2g.O(s2iVar, "headers");
        xu1 xu1Var = this.u;
        qgr qgrVar = new qgr(qo4VarArr);
        for (qo4 qo4Var : qo4VarArr) {
            qo4Var.n(xu1Var, s2iVar);
        }
        synchronized (this.k) {
            aVar = new a(k3iVar, s2iVar, this.i, this, this.j, this.k, this.r, this.f, this.b, this.c, qgrVar, this.L, ks3Var);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nnd h(InetSocketAddress inetSocketAddress, String str, String str2) {
        String substring;
        String str3;
        nnd nndVar;
        String lowerCase;
        int i;
        InetAddress byAddress;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        t7e t7eVar = new t7e();
        t7eVar.d = -1;
        t7eVar.b = "https";
        String hostName = inetSocketAddress.getHostName();
        String str4 = "host == null";
        if (hostName == null) {
            xq0.x("host == null");
            return null;
        }
        int length = hostName.length();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                substring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(i8) != '%') {
                i8++;
            } else {
                hi3 hi3Var = new hi3();
                hi3Var.R0(0, i8, hostName);
                while (i8 < length) {
                    int codePointAt = hostName.codePointAt(i8);
                    if (codePointAt == 37 && (i6 = i8 + 2) < length) {
                        int a = v7e.a(hostName.charAt(i8 + 1));
                        int a2 = v7e.a(hostName.charAt(i6));
                        if (a != -1 && a2 != -1) {
                            hi3Var.M0((a << 4) + a2);
                            i8 = i6;
                            i8 += Character.charCount(codePointAt);
                        }
                    }
                    hi3Var.T0(codePointAt);
                    i8 += Character.charCount(codePointAt);
                }
                substring = hi3Var.G0();
            }
        }
        if (!substring.startsWith("[") || !substring.endsWith("]")) {
            str3 = "host == null";
            nndVar = null;
            try {
                lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    for (int i9 = 0; i9 < lowerCase.length(); i9++) {
                        char charAt = lowerCase.charAt(i9);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            lowerCase = nndVar;
            break;
        }
        int length2 = substring.length() - 1;
        int i10 = 16;
        byte[] bArr = new byte[16];
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 1;
        nndVar = null;
        while (i14 < length2) {
            if (i13 != i10) {
                int i15 = i14 + 2;
                if (i15 > length2 || !substring.regionMatches(i14, "::", i7, 2)) {
                    if (i13 != 0) {
                        if (substring.regionMatches(i14, StringUtils.PROCESS_POSTFIX_DELIMITER, i7, 1)) {
                            i14++;
                        } else if (substring.regionMatches(i14, ".", i7, 1)) {
                            int i16 = i13 - 2;
                            int i17 = i16;
                            int i18 = i12;
                            loop7: while (true) {
                                if (i18 >= length2) {
                                    str3 = str4;
                                    if (i17 == i13 + 2) {
                                        i13 += 2;
                                    }
                                } else {
                                    if (i17 == 16) {
                                        break;
                                    }
                                    if (i17 != i16) {
                                        if (substring.charAt(i18) != '.') {
                                            break;
                                        }
                                        i18++;
                                    }
                                    int i19 = i18;
                                    int i20 = 0;
                                    while (true) {
                                        i2 = i16;
                                        if (i19 >= length2) {
                                            str3 = str4;
                                            break;
                                        }
                                        char charAt2 = substring.charAt(i19);
                                        str3 = str4;
                                        if (charAt2 < '0' || charAt2 > '9') {
                                            break;
                                        }
                                        if ((i20 == 0 && i18 != i19) || ((i20 * 10) + charAt2) - 48 > 255) {
                                            break loop7;
                                        }
                                        i19++;
                                        i16 = i2;
                                        str4 = str3;
                                    }
                                    if (i19 - i18 == 0) {
                                        break;
                                    }
                                    bArr[i17] = (byte) i20;
                                    i17++;
                                    i18 = i19;
                                    i16 = i2;
                                    str4 = str3;
                                }
                            }
                            str3 = str4;
                        }
                    }
                    str3 = str4;
                    i3 = i14;
                    i4 = 0;
                    while (i3 < length2) {
                        int a3 = v7e.a(substring.charAt(i3));
                        if (a3 == -1) {
                            break;
                        }
                        i4 = (i4 << 4) + a3;
                        i3++;
                    }
                    i5 = i3 - i14;
                    if (i5 != 0 || i5 > 4) {
                        break;
                        break;
                    }
                    int i21 = i13 + 1;
                    bArr[i13] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i13 += 2;
                    bArr[i21] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
                    i12 = i14;
                    str4 = str3;
                    i7 = 0;
                    i10 = 16;
                    i14 = i3;
                } else if (i11 == -1) {
                    i13 += 2;
                    str3 = str4;
                    if (i15 == length2) {
                        i11 = i13;
                        i = 16;
                        break;
                    }
                    i14 = i15;
                    i11 = i13;
                    i3 = i14;
                    i4 = 0;
                    while (i3 < length2) {
                    }
                    i5 = i3 - i14;
                    if (i5 != 0) {
                        break;
                    }
                    int i212 = i13 + 1;
                    bArr[i13] = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i13 += 2;
                    bArr[i212] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
                    i12 = i14;
                    str4 = str3;
                    i7 = 0;
                    i10 = 16;
                    i14 = i3;
                }
            }
            str3 = str4;
            break;
        }
        str3 = str4;
        i = i10;
        try {
            if (i13 != i) {
                if (i11 != -1) {
                    int i22 = i13 - i11;
                    System.arraycopy(bArr, i11, bArr, 16 - i22, i22);
                    Arrays.fill(bArr, i11, (16 - i13) + i11, (byte) 0);
                }
                byAddress = null;
                if (byAddress != null) {
                    byte[] address = byAddress.getAddress();
                    int i23 = 16;
                    if (address.length != 16) {
                        wvs.b();
                        return null;
                    }
                    int i24 = 0;
                    int i25 = -1;
                    int i26 = 0;
                    while (i24 < address.length) {
                        int i27 = i24;
                        while (i27 < i23 && address[i27] == 0 && address[i27 + 1] == 0) {
                            i27 += 2;
                            i23 = 16;
                        }
                        int i28 = i27 - i24;
                        if (i28 > i26) {
                            i25 = i24;
                            i26 = i28;
                        }
                        i24 = i27 + 2;
                        i23 = 16;
                    }
                    hi3 hi3Var2 = new hi3();
                    int i29 = 0;
                    while (i29 < address.length) {
                        if (i29 == i25) {
                            hi3Var2.M0(58);
                            i29 += i26;
                            if (i29 == 16) {
                                hi3Var2.M0(58);
                            }
                        } else {
                            if (i29 > 0) {
                                hi3Var2.M0(58);
                            }
                            hi3Var2.O0(((address[i29] & 255) << 8) | (address[i29 + 1] & 255));
                            i29 += 2;
                        }
                    }
                    lowerCase = hi3Var2.G0();
                }
                lowerCase = nndVar;
                break;
            }
            byAddress = InetAddress.getByAddress(bArr);
            if (byAddress != null) {
            }
            lowerCase = nndVar;
            break;
        } catch (UnknownHostException unused2) {
            wvs.b();
            return null;
        }
        if (lowerCase == 0) {
            xq0.x("unexpected host: ".concat(hostName));
            return nndVar;
        }
        t7eVar.c = lowerCase;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            xq0.x(k5r.i(port, "unexpected port: "));
            return nndVar;
        }
        t7eVar.d = port;
        if (t7eVar.c == null) {
            xq0.q(str3);
            return nndVar;
        }
        v7e v7eVar = new v7e(t7eVar);
        jtc jtcVar = new jtc();
        jtcVar.b = new ik0(1, false);
        jtcVar.a = v7eVar;
        jtcVar.z("Host", v7eVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + v7eVar.b);
        jtcVar.z(HttpMessage.USER_AGENT, this.c);
        if (str != null && str2 != null) {
            try {
                byte[] bytes = (str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2).getBytes("ISO-8859-1");
                pn3 pn3Var = pn3.d;
                jtcVar.z("Proxy-Authorization", "Basic " + ovn.M(bytes).a());
            } catch (UnsupportedEncodingException unused3) {
                wvs.b();
                return nndVar;
            }
        }
        if (((v7e) jtcVar.a) != null) {
            return new nnd(jtcVar);
        }
        xq0.q("url == null");
        return nndVar;
    }

    public final void i(int i, sgr sgrVar, no4 no4Var, boolean z, afb afbVar, s2i s2iVar) {
        synchronized (this.k) {
            try {
                a aVar = (a) this.n.remove(Integer.valueOf(i));
                if (aVar != null) {
                    if (afbVar != null) {
                        this.i.o(i, afb.CANCEL);
                    }
                    if (sgrVar != null) {
                        koj kojVar = aVar.l;
                        if (s2iVar == null) {
                            s2iVar = new s2i();
                        }
                        kojVar.l(sgrVar, no4Var, z, s2iVar);
                    }
                    if (!s()) {
                        u();
                        n(aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pxj[] j() {
        pxj[] pxjVarArr;
        pxj pxjVar;
        synchronized (this.k) {
            pxjVarArr = new pxj[this.n.size()];
            Iterator it = this.n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                koj kojVar = ((a) it.next()).l;
                synchronized (kojVar.v) {
                    pxjVar = kojVar.I;
                }
                pxjVarArr[i] = pxjVar;
                i = i2;
            }
        }
        return pxjVarArr;
    }

    public final int k() {
        URI a = xqd.a(this.b);
        return a.getPort() != -1 ? a.getPort() : this.a.getPort();
    }

    public final tgr l() {
        synchronized (this.k) {
            try {
                sgr sgrVar = this.v;
                if (sgrVar != null) {
                    return sgrVar.a();
                }
                return sgr.o.i("Connection closed").a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(int i) {
        boolean z;
        synchronized (this.k) {
            if (i < this.m) {
                z = true;
                if ((i & 1) == 1) {
                }
            }
            z = false;
        }
        return z;
    }

    public final void n(a aVar) {
        if (this.z && this.D.isEmpty() && this.n.isEmpty()) {
            this.z = false;
            baf bafVar = this.F;
            if (bafVar != null) {
                synchronized (bafVar) {
                    int i = bafVar.d;
                    if (i == 2 || i == 3) {
                        bafVar.d = 1;
                    }
                    if (bafVar.d == 4) {
                        bafVar.d = 5;
                    }
                }
            }
        }
        if (aVar.c) {
            this.M.F(aVar, false);
        }
    }

    public final void o(Exception exc) {
        r(0, afb.INTERNAL_ERROR, sgr.o.h(exc));
    }

    public final void q() {
        synchronized (this.k) {
            try {
                ynb ynbVar = this.i;
                ynbVar.getClass();
                try {
                    ynbVar.b.b();
                } catch (IOException e) {
                    ynbVar.a.o(e);
                }
                iqe iqeVar = new iqe(2, false);
                iqeVar.h(7, this.f);
                ynb ynbVar2 = this.i;
                ynbVar2.c.q(2, iqeVar);
                try {
                    ynbVar2.b.D(iqeVar);
                } catch (IOException e2) {
                    ynbVar2.a.o(e2);
                }
                if (this.f > 65535) {
                    this.i.z(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(int i, afb afbVar, sgr sgrVar) {
        synchronized (this.k) {
            try {
                if (this.v == null) {
                    this.v = sgrVar;
                    this.h.f(sgrVar);
                }
                if (afbVar != null && !this.w) {
                    this.w = true;
                    this.i.b(afbVar, new byte[0]);
                }
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((a) entry.getValue()).l.l(sgrVar, no4.b, false, new s2i());
                        n((a) entry.getValue());
                    }
                }
                for (a aVar : this.D) {
                    aVar.l.l(sgrVar, no4.d, true, new s2i());
                    n(aVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.n.size() >= this.C) {
                break;
            }
            t((a) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final void t(a aVar) {
        boolean i;
        o2g.U("StreamId already assigned", aVar.l.J == -1);
        this.n.put(Integer.valueOf(this.m), aVar);
        if (!this.z) {
            this.z = true;
            baf bafVar = this.F;
            if (bafVar != null) {
                bafVar.b();
            }
        }
        if (aVar.c) {
            this.M.F(aVar, true);
        }
        koj kojVar = aVar.l;
        int i2 = this.m;
        o2g.R(i2, "the stream has been started with id %s", kojVar.J == -1);
        kojVar.J = i2;
        anx anxVar = kojVar.E;
        kojVar.I = new pxj(anxVar, i2, anxVar.a, kojVar);
        koj kojVar2 = kojVar.K.l;
        o2g.V(kojVar2.j != null);
        synchronized (kojVar2.b) {
            o2g.U("Already allocated", !kojVar2.f);
            kojVar2.f = true;
        }
        synchronized (kojVar2.b) {
            i = kojVar2.i();
        }
        if (i) {
            kojVar2.j.onReady();
        }
        xiu xiuVar = kojVar2.c;
        xiuVar.getClass();
        ((hs4) xiuVar.b).x();
        if (kojVar.G) {
            ynb ynbVar = kojVar.D;
            boolean z = kojVar.K.o;
            int i3 = kojVar.J;
            ArrayList arrayList = kojVar.w;
            ynbVar.getClass();
            try {
                e5e e5eVar = ynbVar.b.a;
                synchronized (e5eVar) {
                    if (e5eVar.e) {
                        throw new IOException("closed");
                    }
                    e5eVar.b(i3, arrayList, z);
                }
            } catch (IOException e) {
                ynbVar.a.o(e);
            }
            for (qo4 qo4Var : kojVar.K.j.a) {
                qo4Var.h();
            }
            kojVar.w = null;
            hi3 hi3Var = kojVar.x;
            if (hi3Var.b > 0) {
                kojVar.E.r(kojVar.y, kojVar.I, hi3Var, kojVar.z);
            }
            kojVar.G = false;
        }
        j3i j3iVar = aVar.h.a;
        if ((j3iVar != j3i.a && j3iVar != j3i.c) || aVar.o) {
            this.i.flush();
        }
        int i4 = this.m;
        if (i4 < 2147483645) {
            this.m = i4 + 2;
        } else {
            this.m = Integer.MAX_VALUE;
            r(Integer.MAX_VALUE, afb.NO_ERROR, sgr.o.i("Stream ids exhausted"));
        }
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.n(this.l.c, "logId");
        Y.q(this.a, "address");
        return Y.toString();
    }

    public final void u() {
        if (this.v == null || !this.n.isEmpty() || !this.D.isEmpty() || this.y) {
            return;
        }
        this.y = true;
        baf bafVar = this.F;
        if (bafVar != null) {
            synchronized (bafVar) {
                try {
                    if (bafVar.d != 6) {
                        bafVar.d = 6;
                        ScheduledFuture scheduledFuture = bafVar.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = bafVar.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            bafVar.f = null;
                        }
                    }
                } finally {
                }
            }
        }
        r5e r5eVar = this.x;
        if (r5eVar != null) {
            tgr l = l();
            synchronized (r5eVar) {
                try {
                    if (!r5eVar.d) {
                        r5eVar.d = true;
                        r5eVar.e = l;
                        LinkedHashMap linkedHashMap = r5eVar.c;
                        r5eVar.c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new q5e((aaf) entry.getKey(), l));
                            } catch (Throwable th) {
                                r5e.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } finally {
                }
            }
            this.x = null;
        }
        if (!this.w) {
            this.w = true;
            this.i.b(afb.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }
}
