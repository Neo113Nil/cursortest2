package defpackage;

import android.net.Uri;
import android.os.DeadSystemException;
import com.yandex.go.antirobot.c;
import com.yandex.plus.core.network.api.exceptions.OfflineModeEnabledException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Result;
import kotlin.a;
import kotlin.b;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.ByteString;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;
import ru.yandex.taxi.interceptors.ClientErrorsInterceptor$Error;
import ru.yandex.taxi.interceptors.d;
import ru.yandex.taxi.interceptors.e;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public final class uc implements p8w {
    public final /* synthetic */ int a;
    public final Object b;

    public uc() {
        this.a = 19;
        this.b = a.a(new gn11(this));
    }

    private final kvj0 b(m8w m8wVar) {
        d5j0 d5j0Var;
        l060 l060Var = (l060) ((com.yandex.go.network_metrics.a) this.b).c.get();
        if (l060Var != null) {
            String str = l060Var.a ? "1" : "0";
            t4j0 b = ((zci0) m8wVar).e.b();
            b.c.a("X-VPN-Active", str);
            d5j0Var = new d5j0(b);
        } else {
            d5j0Var = ((zci0) m8wVar).e;
        }
        return ((zci0) m8wVar).b(d5j0Var);
    }

    private final kvj0 c(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        String b = d5j0Var.a.b();
        try {
            kvj0 b2 = ((zci0) m8wVar).b(d5j0Var);
            if (b2.C == null) {
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((tc60) it.next()).b(t060.g, ObserveStrategy.Default);
                }
            }
            return b2;
        } catch (Exception e) {
            bxw bxwVar = (bxw) d5j0Var.c(bxw.class);
            n851 n851Var = bxwVar != null ? (n851) bxwVar.c.getAnnotation(n851.class) : null;
            boolean y = s8o.y(e);
            if (n851Var != null && !zci0Var.a.K && s8o.A(e) && !y) {
                if (!evu0.J(b)) {
                    String Q = evu0.Q("/", evu0.k0(evu0.k0(b).toString()).toString());
                    b = evu0.d0(Q, "/", Q);
                }
                Iterator it2 = ((Set) this.b).iterator();
                while (it2.hasNext()) {
                    ((tc60) it2.next()).b(new s060(b), n851Var.strategy());
                }
            }
            throw e;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v14 gdi0, still in use, count: 2, list:
          (r3v14 gdi0) from 0x006d: MOVE (r21v0 gdi0) = (r3v14 gdi0)
          (r3v14 gdi0) from 0x0058: MOVE (r21v2 gdi0) = (r3v14 gdi0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    private final defpackage.kvj0 d(defpackage.m8w r35) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc.d(m8w):kvj0");
    }

    private final kvj0 e(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        return (cvu0.s(d5j0Var.a.b(), "mlutp/v1/widgets/layout/superapp", false) && d5j0Var.c.a("Accept-Encoding") == null && ((Boolean) ((s66) this.b).b.c()).booleanValue()) ? vsv0.c.intercept(m8wVar) : zci0Var.b(d5j0Var);
    }

    private final kvj0 f(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        t4j0 b = zci0Var.e.b();
        b.c.g(ExtFunctionsKt.HEADER_USER_AGENT, (String) this.b);
        return zci0Var.b(new d5j0(b));
    }

    private final kvj0 g(m8w m8wVar) {
        String str;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        String a = d5j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT);
        if ((a != null && !evu0.J(a)) || (str = (String) ((i3y) this.b).getValue()) == null) {
            return zci0Var.b(d5j0Var);
        }
        t4j0 b = d5j0Var.b();
        b.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
        return zci0Var.b(new d5j0(b));
    }

    public static int i(kvj0 kvj0Var, int i) {
        String a = kvj0Var.y.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        if (new Regex("\\d+").h(a)) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public d5j0 a(kvj0 kvj0Var, q66 q66Var) {
        jwu jwuVar;
        m5j0 m5j0Var;
        kvj0 kvj0Var2;
        b0l0 b0l0Var = q66Var != null ? q66Var.e().c : null;
        int i = kvj0Var.w;
        d5j0 d5j0Var = kvj0Var.a;
        String str = d5j0Var.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return ((OkHttpClient) this.b).z.a(b0l0Var, kvj0Var);
            }
            if (i == 421) {
                m5j0 m5j0Var2 = d5j0Var.d;
                if ((m5j0Var2 == null || !m5j0Var2.c()) && q66Var != null && !jl40.l(((qjo) q66Var.w).l().i.h.d, ((pjo) q66Var.x).j().getRoute().a.h.d)) {
                    RealConnection e = q66Var.e();
                    synchronized (e) {
                        e.l = true;
                    }
                    return kvj0Var.a;
                }
            } else if (i == 503) {
                kvj0 kvj0Var3 = kvj0Var.D;
                if ((kvj0Var3 == null || kvj0Var3.w != 503) && i(kvj0Var, Integer.MAX_VALUE) == 0) {
                    return kvj0Var.a;
                }
            } else {
                if (i == 407) {
                    if (b0l0Var.b.type() == Proxy.Type.HTTP) {
                        return ((OkHttpClient) this.b).G.a(b0l0Var, kvj0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((OkHttpClient) this.b).x && (((m5j0Var = d5j0Var.d) == null || !m5j0Var.c()) && (((kvj0Var2 = kvj0Var.D) == null || kvj0Var2.w != 408) && i(kvj0Var, 0) <= 0))) {
                    return kvj0Var.a;
                }
            }
            return null;
        }
        OkHttpClient okHttpClient = (OkHttpClient) this.b;
        if (okHttpClient.A) {
            String a = kvj0Var.y.a("Location");
            if (a == null) {
                a = null;
            }
            d5j0 d5j0Var2 = kvj0Var.a;
            if (a != null) {
                kwu kwuVar = d5j0Var2.a;
                kwuVar.getClass();
                try {
                    jwuVar = new jwu();
                    jwuVar.i(kwuVar, a);
                } catch (IllegalArgumentException unused) {
                    jwuVar = null;
                }
                kwu e2 = jwuVar != null ? jwuVar.e() : null;
                if (e2 != null && (jl40.l(e2.a, d5j0Var2.a.a) || okHttpClient.B)) {
                    t4j0 b = d5j0Var2.b();
                    if (dai0.D(str)) {
                        int i2 = kvj0Var.w;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            b.e(str, z ? d5j0Var2.d : null);
                        } else {
                            b.e("GET", null);
                        }
                        if (!z) {
                            b.f("Transfer-Encoding");
                            b.f("Content-Length");
                            b.f("Content-Type");
                        }
                    }
                    if (!bg61.a(d5j0Var2.a, e2)) {
                        b.f("Authorization");
                    }
                    b.a = e2;
                    return new d5j0(b);
                }
            }
        }
        return null;
    }

    public boolean h(IOException iOException, nci0 nci0Var, d5j0 d5j0Var) {
        m5j0 m5j0Var;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((OkHttpClient) this.b).x) {
            return false;
        }
        if ((!z && (((m5j0Var = d5j0Var.d) != null && m5j0Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        q66 q66Var = nci0Var.L;
        if (q66Var == null || !q66Var.a) {
            return false;
        }
        gdi0 l = nci0Var.B.l();
        q66 q66Var2 = nci0Var.L;
        return l.a(q66Var2 != null ? q66Var2.e() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x057f  */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        d5j0 d5j0Var;
        d5j0 d5j0Var2;
        d5j0 d5j0Var3;
        String str;
        d5j0 d5j0Var4;
        boolean z;
        rvj0 rvj0Var;
        kvj0 kvj0Var;
        long j;
        long j2;
        int i;
        Date date;
        Date date2;
        Date date3;
        String str2;
        String str3;
        String str4;
        Object obj;
        d5j0 d5j0Var5;
        lb7 lb7Var;
        String str5;
        String str6;
        long j3;
        long j4;
        long j5;
        long j6;
        String sb;
        int i2;
        String str7;
        String str8;
        int i3;
        q66 q66Var;
        lxj lxjVar;
        lxj lxjVar2;
        kvj0 kvj0Var2;
        vxj e;
        d5j0 d5j0Var6;
        wg10 contentType;
        Object failure;
        kvj0 a;
        Uri e2;
        Object failure2;
        String str9 = null;
        str9 = null;
        switch (this.a) {
            case 0:
                zci0 zci0Var = (zci0) m8wVar;
                t4j0 b = zci0Var.e.b();
                b.c.g("Accept-Language", (String) ((sls) this.b).invoke());
                return zci0Var.b(new d5j0(b));
            case 1:
                zci0 zci0Var2 = (zci0) m8wVar;
                t4j0 b2 = zci0Var2.e.b();
                kb20 kb20Var = (kb20) this.b;
                String b3 = kb20Var.b();
                if (!evu0.J(b3)) {
                    b2.a("X-AppMetrica-UUID", b3);
                }
                String a2 = kb20Var.a();
                if (a2 != null && (!evu0.J(a2))) {
                    b2.a("X-AppMetrica-DeviceId", a2);
                }
                return zci0Var2.b(new d5j0(b2));
            case 2:
                h hVar = (h) this.b;
                String Ig = hVar.Ig();
                String l = ((cne0) hVar.b).l(MetaDataField.DEVICE_ID_FIELD, null);
                if ((Ig == null || evu0.J(Ig)) && (l == null || evu0.J(l))) {
                    d5j0Var = ((zci0) m8wVar).e;
                } else {
                    t4j0 b4 = ((zci0) m8wVar).e.b();
                    if (Ig != null) {
                        b4.a("X-Ya-Phone-Verified", Ig);
                    }
                    if (l != null) {
                        b4.a("X-Taxi-DeviceId", l);
                    }
                    d5j0Var = new d5j0(b4);
                }
                return ((zci0) m8wVar).b(d5j0Var);
            case 3:
                String d = ((com.yandex.go.performance_class.a) ((nbj) this.b)).d();
                if ("unknown".equals(d)) {
                    d5j0Var2 = ((zci0) m8wVar).e;
                } else {
                    t4j0 b5 = ((zci0) m8wVar).e.b();
                    b5.c.a("X-Perf-Class", d);
                    d5j0Var2 = new d5j0(b5);
                }
                return ((zci0) m8wVar).b(d5j0Var2);
            case 4:
                String a3 = ((w9w0) this.b).a();
                String str10 = a3 == null ? null : a3;
                if (str10 != null) {
                    t4j0 b6 = ((zci0) m8wVar).e.b();
                    b6.c.a("X-Ya-Go-Superapp-Session", str10);
                    d5j0Var3 = new d5j0(b6);
                } else {
                    d5j0Var3 = ((zci0) m8wVar).e;
                }
                return ((zci0) m8wVar).b(d5j0Var3);
            case 5:
                ol2 ol2Var = (ol2) ((c) this.b).h.get();
                if (ol2Var instanceof ll2) {
                    str = ((ll2) ol2Var).a;
                } else if (jl40.l(ol2Var, nl2.a)) {
                    str = "err_safetynet_access";
                } else {
                    if (!jl40.l(ol2Var, ml2.a)) {
                        w511.b();
                        return null;
                    }
                    str = null;
                }
                if (str != null) {
                    t4j0 b7 = ((zci0) m8wVar).e.b();
                    b7.c.a("X-Yandex-Jws", str);
                    d5j0Var4 = new d5j0(b7);
                } else {
                    d5j0Var4 = ((zci0) m8wVar).e;
                }
                return ((zci0) m8wVar).b(d5j0Var4);
            case 6:
                ine ineVar = (ine) this.b;
                zci0 zci0Var3 = (zci0) m8wVar;
                d5j0 d5j0Var7 = zci0Var3.e;
                t4j0 b8 = d5j0Var7.b();
                meu meuVar = d5j0Var7.c;
                m5j0 m5j0Var = d5j0Var7.d;
                boolean z2 = true;
                if (m5j0Var != null) {
                    wg10 b9 = m5j0Var.b();
                    if (b9 != null) {
                        b8.d("Content-Type", b9.a);
                    }
                    long a4 = m5j0Var.a();
                    if (a4 != -1) {
                        b8.d("Content-Length", String.valueOf(a4));
                        b8.f("Transfer-Encoding");
                    } else {
                        b8.d("Transfer-Encoding", "chunked");
                        b8.f("Content-Length");
                    }
                }
                if (meuVar.a("Host") == null) {
                    z = false;
                    b8.d("Host", bg61.j(d5j0Var7.a, false));
                } else {
                    z = false;
                }
                if (meuVar.a("Connection") == null) {
                    b8.d("Connection", "Keep-Alive");
                }
                if (meuVar.a("Accept-Encoding") == null && meuVar.a("Range") == null) {
                    b8.d("Accept-Encoding", Request.PARAM_GZIP);
                } else {
                    z2 = z;
                }
                ineVar.getClass();
                if (meuVar.a(ExtFunctionsKt.HEADER_USER_AGENT) == null) {
                    b8.d(ExtFunctionsKt.HEADER_USER_AGENT, "okhttp/5.3.2");
                }
                d5j0 d5j0Var8 = new d5j0(b8);
                kvj0 b10 = zci0Var3.b(d5j0Var8);
                meu meuVar2 = b10.y;
                kwu kwuVar = d5j0Var8.a;
                ByteString byteString = lvu.a;
                if (ineVar != ine.a) {
                    Pattern pattern = ane.k;
                    orb1.d(kwuVar, meuVar2).isEmpty();
                }
                cvj0 c = b10.c();
                c.a = d5j0Var8;
                if (z2) {
                    String a5 = meuVar2.a("Content-Encoding");
                    if (a5 == null) {
                        a5 = null;
                    }
                    if (Request.PARAM_GZIP.equalsIgnoreCase(a5) && lvu.a(b10) && (rvj0Var = b10.z) != null) {
                        r4u r4uVar = new r4u(rvj0Var.source());
                        keu d2 = meuVar2.d();
                        d2.f("Content-Encoding");
                        d2.f("Content-Length");
                        c.f = d2.d().d();
                        String a6 = meuVar2.a("Content-Type");
                        c.g = new fdi0(a6 == null ? null : a6, -1L, new jci0(r4uVar));
                    }
                }
                return c.a();
            case 7:
                zci0 zci0Var4 = (zci0) m8wVar;
                nci0 nci0Var = zci0Var4.a;
                sa7 sa7Var = (sa7) this.b;
                if (sa7Var != null) {
                    d5j0 d5j0Var9 = zci0Var4.e;
                    d5j0Var9.getClass();
                    kwu kwuVar2 = d5j0Var9.a;
                    try {
                        e = sa7Var.a.e(q5z.J(kwuVar2));
                    } catch (IOException unused) {
                    }
                    if (e == null) {
                        kvj0Var2 = null;
                    } else {
                        try {
                            na7 na7Var = new na7((y9t0) e.c.get(0));
                            String str11 = na7Var.c;
                            meu meuVar3 = na7Var.b;
                            kwu kwuVar3 = na7Var.a;
                            meu meuVar4 = na7Var.g;
                            String a7 = meuVar4.a("Content-Type");
                            String a8 = meuVar4.a("Content-Length");
                            t4j0 t4j0Var = new t4j0();
                            t4j0Var.a = kwuVar3;
                            t4j0Var.c = meuVar3.d();
                            t4j0Var.e(!str11.equals("\u0000") ? str11 : "GET", null);
                            d5j0 d5j0Var10 = new d5j0(t4j0Var);
                            cvj0 cvj0Var = new cvj0();
                            cvj0Var.a = d5j0Var10;
                            cvj0Var.b = na7Var.d;
                            cvj0Var.c = na7Var.e;
                            cvj0Var.d = na7Var.f;
                            cvj0Var.f = meuVar4.d();
                            cvj0Var.g = new la7(e, a7, a8);
                            cvj0Var.e = na7Var.h;
                            cvj0Var.l = na7Var.i;
                            cvj0Var.m = na7Var.j;
                            kvj0Var2 = cvj0Var.a();
                            if (kwuVar3.equals(kwuVar2) && str11.equals(d5j0Var9.b)) {
                                Set<String> o0 = q5z.o0(kvj0Var2.y);
                                if (!(o0 instanceof Collection) || !o0.isEmpty()) {
                                    for (String str12 : o0) {
                                        if (!meuVar3.g(str12).equals(d5j0Var9.c.g(str12))) {
                                        }
                                    }
                                }
                            }
                            yf61.b(kvj0Var2.z);
                        } catch (IOException unused2) {
                            yf61.b(e);
                        }
                        kvj0Var2 = null;
                    }
                    kvj0Var = kvj0Var2;
                } else {
                    kvj0Var = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                d5j0 d5j0Var11 = zci0Var4.e;
                if (kvj0Var != null) {
                    j = kvj0Var.E;
                    j2 = kvj0Var.F;
                    meu meuVar5 = kvj0Var.y;
                    int size = meuVar5.size();
                    int i4 = 0;
                    i = -1;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    while (i4 < size) {
                        long j7 = currentTimeMillis;
                        String b11 = meuVar5.b(i4);
                        String f = meuVar5.f(i4);
                        long j8 = j;
                        if (b11.equalsIgnoreCase("Date")) {
                            date3 = brg.a(f);
                            str4 = f;
                        } else if (b11.equalsIgnoreCase("Expires")) {
                            date = brg.a(f);
                        } else if (b11.equalsIgnoreCase("Last-Modified")) {
                            date2 = brg.a(f);
                            str3 = f;
                        } else if (b11.equalsIgnoreCase("ETag")) {
                            str2 = f;
                        } else if (b11.equalsIgnoreCase("Age")) {
                            i = yf61.p(-1, f);
                        }
                        i4++;
                        currentTimeMillis = j7;
                        j = j8;
                    }
                } else {
                    j = 0;
                    j2 = 0;
                    i = -1;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                long j9 = currentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i5 = 12;
                if (kvj0Var == null) {
                    lb7Var = new lb7(i5, d5j0Var11, null);
                    d5j0Var5 = d5j0Var11;
                    obj = null;
                } else {
                    kwu kwuVar4 = d5j0Var11.a;
                    meu meuVar6 = d5j0Var11.c;
                    if (kwuVar4.f() && kvj0Var.x == null) {
                        i5 = 12;
                        lb7Var = new lb7(i5, d5j0Var11, null);
                        obj = null;
                    } else {
                        long j10 = j;
                        obj = null;
                        i5 = 12;
                        if (gwk0.u(d5j0Var11, kvj0Var)) {
                            za7 a9 = d5j0Var11.a();
                            if (!a9.a && meuVar6.a("If-Modified-Since") == null && meuVar6.a("If-None-Match") == null) {
                                za7 a10 = kvj0Var.a();
                                if (date3 != null) {
                                    str5 = "If-None-Match";
                                    str6 = "If-Modified-Since";
                                    j3 = j2;
                                    j4 = Math.max(0L, j2 - date3.getTime());
                                } else {
                                    str5 = "If-None-Match";
                                    str6 = "If-Modified-Since";
                                    j3 = j2;
                                    j4 = 0;
                                }
                                if (i != -1) {
                                    j4 = Math.max(j4, timeUnit.toMillis(i));
                                }
                                long max = j4 + Math.max(0L, j3 - j10) + Math.max(0L, j9 - j3);
                                int i6 = kvj0Var.a().c;
                                if (i6 != -1) {
                                    j6 = timeUnit.toMillis(i6);
                                } else if (date != null) {
                                    j6 = date.getTime() - (date3 != null ? date3.getTime() : j3);
                                    if (j6 <= 0) {
                                        j6 = 0;
                                    }
                                } else {
                                    if (date2 != null) {
                                        List list = kvj0Var.a.a.g;
                                        if (list == null) {
                                            sb = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sms.b(list, sb2);
                                            sb = sb2.toString();
                                        }
                                        if (sb == null) {
                                            if (date3 != null) {
                                                j10 = date3.getTime();
                                            }
                                            long time = j10 - date2.getTime();
                                            j5 = 0;
                                            if (time > 0) {
                                                j6 = time / 10;
                                                i2 = a9.c;
                                                if (i2 != -1) {
                                                    j6 = Math.min(j6, timeUnit.toMillis(i2));
                                                }
                                                int i7 = a9.i;
                                                d5j0Var5 = d5j0Var11;
                                                long millis = i7 == -1 ? timeUnit.toMillis(i7) : j5;
                                                if (!a10.g && (i3 = a9.h) != -1) {
                                                    j5 = timeUnit.toMillis(i3);
                                                }
                                                if (!a10.a) {
                                                    long j11 = max + millis;
                                                    if (j11 < j6 + j5) {
                                                        cvj0 c2 = kvj0Var.c();
                                                        if (j11 >= j6) {
                                                            c2.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                        }
                                                        if (max > 86400000 && kvj0Var.a().c == -1 && date == null) {
                                                            c2.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                        }
                                                        obj = null;
                                                        i5 = 12;
                                                        lb7Var = new lb7(i5, obj, c2.a());
                                                    }
                                                }
                                                if (str2 == null) {
                                                    str8 = str5;
                                                    str7 = str2;
                                                } else {
                                                    if (date2 != null) {
                                                        str7 = str3;
                                                    } else if (date3 != null) {
                                                        str7 = str4;
                                                    } else {
                                                        i5 = 12;
                                                        obj = null;
                                                        lb7Var = new lb7(i5, d5j0Var5, obj);
                                                    }
                                                    str8 = str6;
                                                }
                                                keu d3 = meuVar6.d();
                                                ooc.h(d3, str8, str7);
                                                t4j0 b12 = d5j0Var5.b();
                                                b12.c = d3.d().d();
                                                i5 = 12;
                                                lb7Var = new lb7(i5, new d5j0(b12), kvj0Var);
                                                obj = null;
                                            }
                                            j6 = j5;
                                            i2 = a9.c;
                                            if (i2 != -1) {
                                            }
                                            int i72 = a9.i;
                                            d5j0Var5 = d5j0Var11;
                                            if (i72 == -1) {
                                            }
                                            if (!a10.g) {
                                                j5 = timeUnit.toMillis(i3);
                                            }
                                            if (!a10.a) {
                                            }
                                            if (str2 == null) {
                                            }
                                            keu d32 = meuVar6.d();
                                            ooc.h(d32, str8, str7);
                                            t4j0 b122 = d5j0Var5.b();
                                            b122.c = d32.d().d();
                                            i5 = 12;
                                            lb7Var = new lb7(i5, new d5j0(b122), kvj0Var);
                                            obj = null;
                                        }
                                    }
                                    j5 = 0;
                                    j6 = j5;
                                    i2 = a9.c;
                                    if (i2 != -1) {
                                    }
                                    int i722 = a9.i;
                                    d5j0Var5 = d5j0Var11;
                                    if (i722 == -1) {
                                    }
                                    if (!a10.g) {
                                    }
                                    if (!a10.a) {
                                    }
                                    if (str2 == null) {
                                    }
                                    keu d322 = meuVar6.d();
                                    ooc.h(d322, str8, str7);
                                    t4j0 b1222 = d5j0Var5.b();
                                    b1222.c = d322.d().d();
                                    i5 = 12;
                                    lb7Var = new lb7(i5, new d5j0(b1222), kvj0Var);
                                    obj = null;
                                }
                                j5 = 0;
                                i2 = a9.c;
                                if (i2 != -1) {
                                }
                                int i7222 = a9.i;
                                d5j0Var5 = d5j0Var11;
                                if (i7222 == -1) {
                                }
                                if (!a10.g) {
                                }
                                if (!a10.a) {
                                }
                                if (str2 == null) {
                                }
                                keu d3222 = meuVar6.d();
                                ooc.h(d3222, str8, str7);
                                t4j0 b12222 = d5j0Var5.b();
                                b12222.c = d3222.d().d();
                                i5 = 12;
                                lb7Var = new lb7(i5, new d5j0(b12222), kvj0Var);
                                obj = null;
                            } else {
                                d5j0Var5 = d5j0Var11;
                                obj = null;
                                i5 = 12;
                                lb7Var = new lb7(i5, d5j0Var5, obj);
                            }
                        } else {
                            lb7Var = new lb7(i5, d5j0Var11, obj);
                        }
                    }
                    d5j0Var5 = d5j0Var11;
                }
                if (((d5j0) lb7Var.b) != null && d5j0Var5.a().j) {
                    lb7Var = new lb7(i5, obj, obj);
                }
                d5j0 d5j0Var12 = (d5j0) lb7Var.b;
                kvj0 kvj0Var3 = (kvj0) lb7Var.c;
                sa7 sa7Var2 = (sa7) this.b;
                if (sa7Var2 != null) {
                    synchronized (sa7Var2) {
                    }
                }
                bgo bgoVar = nci0Var.x;
                if (bgoVar == null) {
                    bgoVar = bgo.NONE;
                }
                if (kvj0Var != null && kvj0Var3 == null) {
                    yf61.b(kvj0Var.z);
                }
                if (d5j0Var12 == null && kvj0Var3 == null) {
                    cvj0 cvj0Var2 = new cvj0();
                    cvj0Var2.a = zci0Var4.e;
                    cvj0Var2.b = Protocol.HTTP_1_1;
                    cvj0Var2.c = 504;
                    cvj0Var2.d = "Unsatisfiable Request (only-if-cached)";
                    cvj0Var2.l = -1L;
                    cvj0Var2.m = System.currentTimeMillis();
                    kvj0 a11 = cvj0Var2.a();
                    bgoVar.satisfactionFailure(nci0Var, a11);
                    return a11;
                }
                if (d5j0Var12 == null) {
                    cvj0 c3 = kvj0Var3.c();
                    kvj0 B = ooc.B(kvj0Var3);
                    cvj0.b("cacheResponse", B);
                    c3.j = B;
                    kvj0 a12 = c3.a();
                    bgoVar.cacheHit(nci0Var, a12);
                    return a12;
                }
                if (kvj0Var3 != null) {
                    bgoVar.cacheConditionalHit(nci0Var, kvj0Var3);
                } else if (((sa7) this.b) != null) {
                    bgoVar.cacheMiss(nci0Var);
                }
                try {
                    kvj0 b13 = ((zci0) m8wVar).b(d5j0Var12);
                    if (kvj0Var3 != null) {
                        if (b13.w == 304) {
                            cvj0 c4 = kvj0Var3.c();
                            meu meuVar7 = kvj0Var3.y;
                            meu meuVar8 = b13.y;
                            keu keuVar = new keu();
                            int size2 = meuVar7.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                String b14 = meuVar7.b(i8);
                                String f2 = meuVar7.f(i8);
                                if ((!"Warning".equalsIgnoreCase(b14) || !cvu0.x(f2, "1", false)) && ("Content-Length".equalsIgnoreCase(b14) || "Content-Encoding".equalsIgnoreCase(b14) || "Content-Type".equalsIgnoreCase(b14) || !kp50.C(b14) || meuVar8.a(b14) == null)) {
                                    ooc.h(keuVar, b14, f2);
                                }
                            }
                            int size3 = meuVar8.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                String b15 = meuVar8.b(i9);
                                if (!"Content-Length".equalsIgnoreCase(b15) && !"Content-Encoding".equalsIgnoreCase(b15) && !"Content-Type".equalsIgnoreCase(b15) && kp50.C(b15)) {
                                    ooc.h(keuVar, b15, meuVar8.f(i9));
                                }
                            }
                            c4.f = keuVar.d().d();
                            c4.l = b13.E;
                            c4.m = b13.F;
                            kvj0 B2 = ooc.B(kvj0Var3);
                            cvj0.b("cacheResponse", B2);
                            c4.j = B2;
                            kvj0 B3 = ooc.B(b13);
                            cvj0.b("networkResponse", B3);
                            c4.i = B3;
                            kvj0 a13 = c4.a();
                            b13.z.close();
                            synchronized (((sa7) this.b)) {
                            }
                            ((sa7) this.b).getClass();
                            na7 na7Var2 = new na7(a13);
                            vxj vxjVar = ((la7) kvj0Var3.z).a;
                            try {
                                lxjVar2 = vxjVar.w.d(vxjVar.b, vxjVar.a);
                                if (lxjVar2 != null) {
                                    try {
                                        na7Var2.c(lxjVar2);
                                        lxjVar2.b();
                                    } catch (IOException unused3) {
                                        if (lxjVar2 != null) {
                                            try {
                                                lxjVar2.a();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        bgoVar.cacheHit(nci0Var, a13);
                                        return a13;
                                    }
                                }
                            } catch (IOException unused5) {
                                lxjVar2 = null;
                            }
                            bgoVar.cacheHit(nci0Var, a13);
                            return a13;
                        }
                        yf61.b(kvj0Var3.z);
                    }
                    cvj0 c5 = b13.c();
                    kvj0 B4 = kvj0Var3 != null ? ooc.B(kvj0Var3) : null;
                    cvj0.b("cacheResponse", B4);
                    c5.j = B4;
                    kvj0 B5 = ooc.B(b13);
                    cvj0.b("networkResponse", B5);
                    c5.i = B5;
                    kvj0 a14 = c5.a();
                    if (((sa7) this.b) == null) {
                        return a14;
                    }
                    if (!lvu.a(a14) || !gwk0.u(d5j0Var12, a14)) {
                        if (!dai0.w(d5j0Var12.b)) {
                            return a14;
                        }
                        try {
                            ((sa7) this.b).a.D(q5z.J(d5j0Var12.a));
                            return a14;
                        } catch (IOException unused6) {
                            return a14;
                        }
                    }
                    sa7 sa7Var3 = (sa7) this.b;
                    cvj0 c6 = a14.c();
                    c6.a = d5j0Var12;
                    kvj0 a15 = c6.a();
                    sa7Var3.getClass();
                    d5j0 d5j0Var13 = a15.a;
                    String str13 = d5j0Var13.b;
                    if (dai0.w(str13)) {
                        sa7Var3.a.D(q5z.J(d5j0Var13.a));
                    } else {
                        if (str13.equals("GET") && !q5z.o0(a15.y).contains("*")) {
                            na7 na7Var3 = new na7(a15);
                            try {
                                dyj dyjVar = sa7Var3.a;
                                String J = q5z.J(d5j0Var13.a);
                                Regex regex = dyj.M;
                                lxjVar = dyjVar.d(-1L, J);
                            } catch (IOException unused7) {
                                lxjVar = null;
                            }
                            if (lxjVar != null) {
                                try {
                                    na7Var3.c(lxjVar);
                                    q66Var = new q66(sa7Var3, lxjVar);
                                } catch (IOException unused8) {
                                    if (lxjVar != null) {
                                        lxjVar.a();
                                    }
                                    q66Var = null;
                                    if (q66Var != null) {
                                    }
                                    if (kvj0Var3 != null) {
                                    }
                                }
                                if (q66Var != null) {
                                    nb7 nb7Var = new nb7(a14.z.source(), q66Var, new ici0((pa7) q66Var.w));
                                    String a16 = a14.y.a("Content-Type");
                                    String str14 = a16 == null ? null : a16;
                                    long contentLength = a14.z.contentLength();
                                    cvj0 c7 = a14.c();
                                    c7.g = new fdi0(str14, contentLength, new jci0(nb7Var));
                                    a14 = c7.a();
                                }
                                if (kvj0Var3 != null) {
                                    return a14;
                                }
                                bgoVar.cacheMiss(nci0Var);
                                return a14;
                            }
                        }
                        q66Var = null;
                        if (q66Var != null) {
                        }
                        if (kvj0Var3 != null) {
                        }
                    }
                    q66Var = null;
                    if (q66Var != null) {
                    }
                    if (kvj0Var3 != null) {
                    }
                } catch (Throwable th) {
                    if (kvj0Var != null) {
                        yf61.b(kvj0Var.z);
                    }
                    throw th;
                }
                break;
            case 8:
                koe0 koe0Var = (koe0) this.b;
                long time2 = koe0Var.a.c().getTime();
                cne0 cne0Var = koe0Var.b;
                long j12 = cne0Var.j("captcha_expires", 0L) * 1000;
                String l2 = cne0Var.l("captcha_token", null);
                if (l2 != null && j12 > time2) {
                    str9 = l2;
                }
                if (str9 != null) {
                    t4j0 b16 = ((zci0) m8wVar).e.b();
                    b16.c.a("Cookie", "spravka=".concat(str9));
                    d5j0Var6 = new d5j0(b16);
                } else {
                    d5j0Var6 = ((zci0) m8wVar).e;
                }
                return ((zci0) m8wVar).b(d5j0Var6);
            case 9:
                zci0 zci0Var5 = (zci0) m8wVar;
                d5j0 d5j0Var14 = zci0Var5.e;
                kvj0 b17 = zci0Var5.b(d5j0Var14);
                int i10 = b17.w;
                if (i10 != 401 && i10 != 403) {
                    return b17;
                }
                try {
                    rvj0 rvj0Var2 = b17.z;
                    if (rvj0Var2 != null && (contentType = rvj0Var2.contentType()) != null) {
                        if (!contentType.b.equals(ClidProvider.APPLICATION) && !contentType.c.equals("json")) {
                            return b17;
                        }
                        String string = rvj0Var2.string();
                        try {
                            failure = (d) ((xnt) ((wnt) this.b)).c(string, d.Companion.serializer());
                        } catch (Throwable th2) {
                            failure = new Result.Failure(th2);
                        }
                        Throwable a17 = Result.a(failure);
                        if (a17 != null) {
                            xby.d.a(10, "Cannot intercept error body from request " + d5j0Var14, a17, null);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        d dVar = (d) failure;
                        ClientErrorsInterceptor$Error clientErrorsInterceptor$Error = dVar != null ? dVar.a : null;
                        int i11 = clientErrorsInterceptor$Error == null ? -1 : e.a[clientErrorsInterceptor$Error.ordinal()];
                        if (i11 == 1) {
                            cvj0 c8 = b17.c();
                            c8.c = 401;
                            qvj0 qvj0Var = rvj0.Companion;
                            wg10 contentType2 = rvj0Var2.contentType();
                            qvj0Var.getClass();
                            c8.g = qvj0.b(string, contentType2);
                            a = c8.a();
                        } else if (i11 != 2) {
                            cvj0 c9 = b17.c();
                            qvj0 qvj0Var2 = rvj0.Companion;
                            wg10 contentType3 = rvj0Var2.contentType();
                            qvj0Var2.getClass();
                            c9.g = qvj0.b(string, contentType3);
                            a = c9.a();
                        } else {
                            cvj0 c10 = b17.c();
                            c10.c = 403;
                            qvj0 qvj0Var3 = rvj0.Companion;
                            wg10 contentType4 = rvj0Var2.contentType();
                            qvj0Var3.getClass();
                            c10.g = qvj0.b(string, contentType4);
                            a = c10.a();
                        }
                        return a;
                    }
                    return b17;
                } catch (Throwable th3) {
                    throw new IOException("Cannot intercept error code from request " + d5j0Var14, th3);
                }
            case 10:
                jr50 jr50Var = (jr50) this.b;
                switch (jr50Var.a) {
                    case 0:
                        e2 = jr50Var.b.e();
                        break;
                    case 1:
                        e2 = jr50Var.b.b();
                        break;
                    default:
                        e2 = jr50Var.b.f();
                        break;
                }
                zci0 zci0Var6 = (zci0) m8wVar;
                d5j0 d5j0Var15 = zci0Var6.e;
                kwu kwuVar5 = d5j0Var15.a;
                if (!jl40.l(e2.getScheme(), kwuVar5.a) || !jl40.l(e2.getHost(), kwuVar5.d)) {
                    jwu g = d5j0Var15.a.g();
                    String scheme = e2.getScheme();
                    if (scheme == null) {
                        scheme = "";
                    }
                    g.o(scheme);
                    String host = e2.getHost();
                    g.h(host != null ? host : "");
                    kwu e3 = g.e();
                    t4j0 b18 = d5j0Var15.b();
                    b18.a = e3;
                    d5j0Var15 = new d5j0(b18);
                }
                return zci0Var6.b(d5j0Var15);
            case 11:
                zci0 zci0Var7 = (zci0) m8wVar;
                t4j0 b19 = zci0Var7.e.b();
                b19.c.g("Accept-Language", ((j5z) this.b).d());
                return zci0Var7.b(new d5j0(b19));
            case 12:
                zci0 zci0Var8 = (zci0) m8wVar;
                d5j0 d5j0Var16 = zci0Var8.e;
                meu meuVar9 = d5j0Var16.c;
                kwu kwuVar6 = d5j0Var16.a;
                if (meuVar9.a("X-APOLLO-OPERATION-NAME") != null) {
                    return zci0Var8.b(d5j0Var16);
                }
                String a18 = d5j0Var16.c.a("X-Request-Id");
                m5j0 m5j0Var2 = d5j0Var16.d;
                String Z = m5j0Var2 != null ? vez0.Z(m5j0Var2) : null;
                try {
                    kvj0 b20 = ((zci0) m8wVar).b(d5j0Var16);
                    boolean z3 = b20.J;
                    failure2 = b20;
                    if (!z3) {
                        sr50 sr50Var = (sr50) this.b;
                        URI l3 = kwuVar6.l();
                        rvj0 rvj0Var3 = b20.z;
                        sr50Var.a(l3, a18, Z, rvj0Var3 != null ? vez0.a0(rvj0Var3) : null, Integer.valueOf(b20.w), null);
                        failure2 = b20;
                    }
                } catch (Throwable th4) {
                    failure2 = new Result.Failure(th4);
                }
                Throwable a19 = Result.a(failure2);
                if (a19 != null) {
                    ((sr50) this.b).a(kwuVar6.l(), a18, Z, a19.getMessage(), null, a19);
                }
                b.b(failure2);
                return (kvj0) failure2;
            case 13:
                return b(m8wVar);
            case 14:
                return c(m8wVar);
            case 15:
                if (((uu60) this.b).d()) {
                    throw new OfflineModeEnabledException();
                }
                zci0 zci0Var9 = (zci0) m8wVar;
                return zci0Var9.b(zci0Var9.e);
            case 16:
                return d(m8wVar);
            case 17:
                return e(m8wVar);
            case 18:
                return f(m8wVar);
            case 19:
                return g(m8wVar);
            default:
                h7u0 h7u0Var = (h7u0) this.b;
                d5j0 d5j0Var17 = ((zci0) m8wVar).e;
                t4j0 b21 = d5j0Var17.b();
                try {
                    b21.c.g(ExtFunctionsKt.HEADER_USER_AGENT, h7u0Var.a());
                    b21.d("X-User-Agent-Split", h7u0Var.b());
                    return ((zci0) m8wVar).b(new d5j0(b21));
                } catch (DeadSystemException e4) {
                    xby.l(jst.e, "BACKGROUND_NETWORK_ERROR", null, e4, "load url: " + d5j0Var17.a, 2);
                    throw e4;
                }
        }
    }

    public /* synthetic */ uc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
