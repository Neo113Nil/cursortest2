package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.okhttp.retries.RequestErrorRetryer$DontRetryException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import ru.yandex.music.YMApplication;

/* loaded from: classes5.dex */
public final class up3 implements bse {
    public final /* synthetic */ int a;
    public final Object b;

    public up3(q76 q76Var, iwe iweVar) {
        this.a = 9;
        q76Var.getClass();
        this.b = new aqd(q76Var, iweVar);
    }

    private final l3o c(ukn uknVar) {
        ffb h;
        int i;
        l3o f;
        ffb h2;
        Long r0;
        aqd aqdVar = (aqd) this.b;
        j4x j4xVar = new j4x(16, false);
        j4xVar.b = 0;
        j4xVar.c = null;
        while (true) {
            try {
                i = j4xVar.b;
            } catch (Exception e) {
                if (e instanceof SocketTimeoutException) {
                    h = aqdVar.h(jgb.j, j4xVar);
                    if (h == null) {
                        throw e;
                    }
                } else {
                    aqdVar.getClass();
                    if (e instanceof IllegalRequestOnNetworkModeException) {
                        throw e;
                    }
                    if (!(e instanceof IOException)) {
                        if (!(e instanceof RequestErrorRetryer$DontRetryException)) {
                            throw e;
                        }
                        Exception exc = (Exception) j4xVar.c;
                        if (exc != null) {
                            throw exc;
                        }
                        throw new IOException("Canceled");
                    }
                    j66.h0((IOException) e);
                    h = aqdVar.h(igb.j, j4xVar);
                    if (h == null) {
                        throw e;
                    }
                    if (!((q76) aqdVar.b).a().c) {
                        throw e;
                    }
                }
                Thread.sleep(h.a);
                j4xVar.c = e;
            }
            if (!((mkn) uknVar.g).p) {
                d0o d0oVar = (d0o) uknVar.i;
                if (i > 0) {
                    b0o b = d0oVar.b();
                    String a = d0oVar.c.a("X-Request-Id");
                    if (a != null) {
                        b.d("X-Request-Id", mlr.K(36, a) + "." + i);
                    }
                    b.a("X-Retry-Count", String.valueOf(i));
                    b.f(rbo.class, new rbo(i));
                    d0oVar = b.b();
                }
                f = uknVar.f(d0oVar);
                if (f.b() || lsq.B(f.a) || (h2 = aqdVar.h(new hgb(f.d), j4xVar)) == null) {
                    break;
                }
                String a2 = f.f.a("Retry-After");
                if (a2 == null) {
                    a2 = null;
                }
                long longValue = (a2 == null || (r0 = StringsKt.r0(10, a2)) == null) ? h2.a : r0.longValue() * 1000;
                if (weo.G(f.a)) {
                    try {
                        if (f.g != null) {
                            f.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                Thread.sleep(longValue);
                j4xVar.b++;
            } else {
                throw new RequestErrorRetryer$DontRetryException();
            }
        }
        return f;
    }

    public static int e(l3o l3oVar, int i) {
        String a = l3oVar.f.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        if (!new Regex("\\d+").e(a)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        valueOf.getClass();
        return valueOf.intValue();
    }

    public d0o a(l3o l3oVar, evj evjVar) {
        s7e s7eVar;
        h0o h0oVar;
        l3o l3oVar2;
        okn oknVar;
        bho bhoVar = (evjVar == null || (oknVar = (okn) evjVar.f) == null) ? null : oknVar.b;
        int i = l3oVar.d;
        d0o d0oVar = l3oVar.a;
        String str = d0oVar.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((OkHttpClient) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                h0o h0oVar2 = d0oVar.d;
                if ((h0oVar2 == null || !h0oVar2.c()) && evjVar != null && !Intrinsics.d(((job) evjVar.b).b.h.d, ((okn) evjVar.f).b.a.h.d)) {
                    okn oknVar2 = (okn) evjVar.f;
                    synchronized (oknVar2) {
                        oknVar2.k = true;
                    }
                    return l3oVar.a;
                }
            } else if (i == 503) {
                l3o l3oVar3 = l3oVar.j;
                if ((l3oVar3 == null || l3oVar3.d != 503) && e(l3oVar, Integer.MAX_VALUE) == 0) {
                    return l3oVar.a;
                }
            } else {
                if (i == 407) {
                    bhoVar.getClass();
                    if (bhoVar.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((OkHttpClient) this.b).n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((OkHttpClient) this.b).f && (((h0oVar = d0oVar.d) == null || !h0oVar.c()) && (((l3oVar2 = l3oVar.j) == null || l3oVar2.d != 408) && e(l3oVar, 0) <= 0))) {
                    return l3oVar.a;
                }
            }
            return null;
        }
        OkHttpClient okHttpClient = (OkHttpClient) this.b;
        if (okHttpClient.h) {
            String a = l3oVar.f.a("Location");
            if (a == null) {
                a = null;
            }
            d0o d0oVar2 = l3oVar.a;
            if (a != null) {
                u7e u7eVar = d0oVar2.a;
                u7eVar.getClass();
                try {
                    s7eVar = new s7e();
                    s7eVar.h(u7eVar, a);
                } catch (IllegalArgumentException unused) {
                    s7eVar = null;
                }
                u7e e = s7eVar != null ? s7eVar.e() : null;
                if (e != null && (Intrinsics.d(e.a, d0oVar2.a.a) || okHttpClient.i)) {
                    b0o b = d0oVar2.b();
                    if (sj2.A(str)) {
                        int i2 = l3oVar.d;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            b.e(str, z ? d0oVar2.d : null);
                        } else {
                            b.e(ServiceCommand.TYPE_GET, null);
                        }
                        if (!z) {
                            b.c.I("Transfer-Encoding");
                            b.c.I("Content-Length");
                            b.c.I(HttpMessage.CONTENT_TYPE_HEADER);
                        }
                    }
                    if (!cvt.a(d0oVar2.a, e)) {
                        b.c.I("Authorization");
                    }
                    b.a = e;
                    return b.b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0330, code lost:
    
        if (r5 < defpackage.nsa.s(r3, defpackage.ssa.SECONDS)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x078a  */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        l3o l3oVar;
        int i;
        long j;
        long j2;
        Date date;
        Date date2;
        Date date3;
        String str;
        String str2;
        String str3;
        yk3 yk3Var;
        nnk nnkVar;
        String str4;
        String str5;
        long j3;
        long j4;
        long j5;
        long j6;
        String sb;
        int i2;
        long j7;
        long j8;
        String str6;
        String str7;
        int i3;
        o3o o3oVar;
        yk3 yk3Var2;
        l3o a;
        z0j z0jVar;
        z0j g;
        z0j z0jVar2;
        o3o o3oVar2;
        l3o l3oVar2;
        f78 o;
        zvd zvdVar;
        String str8;
        u7e u7eVar;
        d0o b;
        izm izmVar;
        int i4;
        String str9;
        pv9 m;
        po3 po3Var;
        hsd hsdVar;
        long j9;
        long j10;
        boolean z;
        o3o o3oVar3;
        cp3 cp3Var;
        int i5;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ha4 ha4Var;
        switch (this.a) {
            case 0:
                to3 to3Var = (to3) this.b;
                if (to3Var != null) {
                    d0o d0oVar = (d0o) uknVar.i;
                    d0oVar.getClass();
                    try {
                        o = to3Var.a.o(q6k.z(d0oVar.a));
                    } catch (IOException unused) {
                    }
                    if (o != null) {
                        try {
                            qo3 qo3Var = new qo3((n3r) o.c.get(0));
                            zvdVar = qo3Var.b;
                            str8 = qo3Var.c;
                            u7eVar = qo3Var.a;
                            zvd zvdVar2 = qo3Var.g;
                            String a2 = zvdVar2.a(HttpMessage.CONTENT_TYPE_HEADER);
                            String a3 = zvdVar2.a("Content-Length");
                            b0o b0oVar = new b0o();
                            u7eVar.getClass();
                            b0oVar.a = u7eVar;
                            b0oVar.e(str8, null);
                            zvdVar.getClass();
                            b0oVar.c = zvdVar.m();
                            b = b0oVar.b();
                            new ArrayList(20);
                            izmVar = qo3Var.d;
                            izmVar.getClass();
                            i4 = qo3Var.e;
                            str9 = qo3Var.f;
                            str9.getClass();
                            m = zvdVar2.m();
                            po3Var = new po3(o, a2, a3);
                            hsdVar = qo3Var.h;
                            j9 = qo3Var.i;
                            j10 = qo3Var.j;
                        } catch (IOException unused2) {
                            cvt.d(o);
                        }
                        if (i4 < 0) {
                            wb8.h(k5r.i(i4, "code < 0: "));
                            return null;
                        }
                        zvd r = m.r();
                        l3oVar2 = new l3o(b, izmVar, str9, i4, hsdVar, r, po3Var, null, null, null, j9, j10, null);
                        if (u7eVar.equals(d0oVar.a) && str8.equals(d0oVar.b)) {
                            Set<String> L = q6k.L(r);
                            if (!(L instanceof Collection) || !L.isEmpty()) {
                                for (String str10 : L) {
                                    if (!Intrinsics.d(zvdVar.r(str10), d0oVar.c.r(str10))) {
                                    }
                                }
                            }
                            l3oVar = l3oVar2;
                        }
                        o3o o3oVar4 = l3oVar2.g;
                        if (o3oVar4 != null) {
                            cvt.d(o3oVar4);
                        }
                    }
                    l3oVar2 = null;
                    l3oVar = l3oVar2;
                } else {
                    l3oVar = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                d0o d0oVar2 = (d0o) uknVar.i;
                d0oVar2.getClass();
                if (l3oVar != null) {
                    j = l3oVar.k;
                    j2 = l3oVar.l;
                    zvd zvdVar3 = l3oVar.f;
                    int size = zvdVar3.size();
                    int i6 = 0;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    int i7 = -1;
                    while (i6 < size) {
                        String g2 = zvdVar3.g(i6);
                        String q = zvdVar3.q(i6);
                        long j11 = currentTimeMillis;
                        if (c.o(g2, "Date", true)) {
                            date3 = wd7.a(q);
                            str3 = q;
                        } else if (c.o(g2, "Expires", true)) {
                            date = wd7.a(q);
                        } else if (c.o(g2, "Last-Modified", true)) {
                            date2 = wd7.a(q);
                            str2 = q;
                        } else if (c.o(g2, "ETag", true)) {
                            str = q;
                        } else if (c.o(g2, "Age", true)) {
                            i7 = cvt.y(-1, q);
                        }
                        i6++;
                        currentTimeMillis = j11;
                    }
                    i = i7;
                } else {
                    i = -1;
                    j = 0;
                    j2 = 0;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                long j12 = currentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (l3oVar == null) {
                    yk3Var = null;
                    nnkVar = new nnk(d0oVar2, yk3Var);
                } else {
                    yk3Var = null;
                    u7e u7eVar2 = d0oVar2.a;
                    zvd zvdVar4 = d0oVar2.c;
                    if (u7eVar2.j && l3oVar.e == null) {
                        nnkVar = new nnk(d0oVar2, yk3Var);
                    } else if (weo.E(d0oVar2, l3oVar)) {
                        cp3 a4 = d0oVar2.a();
                        if (!a4.a && zvdVar4.a("If-Modified-Since") == null && zvdVar4.a("If-None-Match") == null) {
                            cp3 a5 = l3oVar.a();
                            if (date3 != null) {
                                str4 = "If-None-Match";
                                str5 = "If-Modified-Since";
                                j3 = j;
                                j4 = Math.max(0L, j2 - date3.getTime());
                            } else {
                                str4 = "If-None-Match";
                                str5 = "If-Modified-Since";
                                j3 = j;
                                j4 = 0;
                            }
                            if (i != -1) {
                                j4 = Math.max(j4, timeUnit.toMillis(i));
                            }
                            long j13 = j4 + (j2 - j3) + (j12 - j2);
                            int i8 = l3oVar.a().c;
                            if (i8 != -1) {
                                j6 = timeUnit.toMillis(i8);
                            } else if (date != null) {
                                if (date3 != null) {
                                    j2 = date3.getTime();
                                }
                                j6 = date.getTime() - j2;
                                if (j6 <= 0) {
                                    j6 = 0;
                                }
                            } else {
                                if (date2 != null) {
                                    List list = l3oVar.a.a.g;
                                    if (list == null) {
                                        sb = null;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        ofc.I(list, sb2);
                                        sb = sb2.toString();
                                    }
                                    if (sb == null) {
                                        long time = (date3 != null ? date3.getTime() : j3) - date2.getTime();
                                        j5 = 0;
                                        if (time > 0) {
                                            j6 = time / 10;
                                            i2 = a4.c;
                                            if (i2 != -1) {
                                                j6 = Math.min(j6, timeUnit.toMillis(i2));
                                            }
                                            int i9 = a4.i;
                                            long millis = i9 == -1 ? timeUnit.toMillis(i9) : j5;
                                            if (!a5.g || (i3 = a4.h) == -1) {
                                                j7 = j13;
                                                j8 = j5;
                                            } else {
                                                j7 = j13;
                                                j8 = timeUnit.toMillis(i3);
                                            }
                                            if (!a5.a) {
                                                long j14 = j7 + millis;
                                                if (j14 < j8 + j6) {
                                                    k3o g3 = l3oVar.g();
                                                    if (j14 >= j6) {
                                                        g3.f.e("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                    }
                                                    if (j7 > 86400000 && l3oVar.a().c == -1 && date == null) {
                                                        g3.f.e("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                    }
                                                    yk3Var = null;
                                                    nnkVar = new nnk(yk3Var, g3.a());
                                                }
                                            }
                                            if (str == null) {
                                                str7 = str4;
                                                str6 = str;
                                            } else {
                                                if (date2 != null) {
                                                    str6 = str2;
                                                } else if (date3 != null) {
                                                    str6 = str3;
                                                } else {
                                                    yk3Var = null;
                                                    nnkVar = new nnk(d0oVar2, yk3Var);
                                                }
                                                str7 = str5;
                                            }
                                            pv9 m2 = zvdVar4.m();
                                            str6.getClass();
                                            m2.m(str7, str6);
                                            b0o b2 = d0oVar2.b();
                                            b2.c = m2.r().m();
                                            nnkVar = new nnk(b2.b(), l3oVar);
                                            yk3Var = null;
                                        }
                                        j6 = j5;
                                        i2 = a4.c;
                                        if (i2 != -1) {
                                        }
                                        int i92 = a4.i;
                                        if (i92 == -1) {
                                        }
                                        if (a5.g) {
                                        }
                                        j7 = j13;
                                        j8 = j5;
                                        if (!a5.a) {
                                        }
                                        if (str == null) {
                                        }
                                        pv9 m22 = zvdVar4.m();
                                        str6.getClass();
                                        m22.m(str7, str6);
                                        b0o b22 = d0oVar2.b();
                                        b22.c = m22.r().m();
                                        nnkVar = new nnk(b22.b(), l3oVar);
                                        yk3Var = null;
                                    }
                                }
                                j5 = 0;
                                j6 = j5;
                                i2 = a4.c;
                                if (i2 != -1) {
                                }
                                int i922 = a4.i;
                                if (i922 == -1) {
                                }
                                if (a5.g) {
                                }
                                j7 = j13;
                                j8 = j5;
                                if (!a5.a) {
                                }
                                if (str == null) {
                                }
                                pv9 m222 = zvdVar4.m();
                                str6.getClass();
                                m222.m(str7, str6);
                                b0o b222 = d0oVar2.b();
                                b222.c = m222.r().m();
                                nnkVar = new nnk(b222.b(), l3oVar);
                                yk3Var = null;
                            }
                            j5 = 0;
                            i2 = a4.c;
                            if (i2 != -1) {
                            }
                            int i9222 = a4.i;
                            if (i9222 == -1) {
                            }
                            if (a5.g) {
                            }
                            j7 = j13;
                            j8 = j5;
                            if (!a5.a) {
                            }
                            if (str == null) {
                            }
                            pv9 m2222 = zvdVar4.m();
                            str6.getClass();
                            m2222.m(str7, str6);
                            b0o b2222 = d0oVar2.b();
                            b2222.c = m2222.r().m();
                            nnkVar = new nnk(b2222.b(), l3oVar);
                            yk3Var = null;
                        } else {
                            yk3Var = null;
                            nnkVar = new nnk(d0oVar2, yk3Var);
                        }
                    } else {
                        nnkVar = new nnk(d0oVar2, yk3Var);
                    }
                }
                if (((d0o) nnkVar.a) != null && d0oVar2.a().j) {
                    nnkVar = new nnk(yk3Var, yk3Var);
                }
                d0o d0oVar3 = (d0o) nnkVar.a;
                l3o l3oVar3 = (l3o) nnkVar.b;
                to3 to3Var2 = (to3) this.b;
                if (to3Var2 != null) {
                    synchronized (to3Var2) {
                    }
                }
                if (l3oVar != null && l3oVar3 == null && (o3oVar2 = l3oVar.g) != null) {
                    cvt.d(o3oVar2);
                }
                if (d0oVar3 == null && l3oVar3 == null) {
                    ArrayList arrayList = new ArrayList(20);
                    d0o d0oVar4 = (d0o) uknVar.i;
                    d0oVar4.getClass();
                    return new l3o(d0oVar4, izm.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new zvd((String[]) arrayList.toArray(new String[0])), cvt.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (d0oVar3 == null) {
                    l3oVar3.getClass();
                    k3o g4 = l3oVar3.g();
                    l3o i10 = fs7.i(l3oVar3);
                    k3o.b("cacheResponse", i10);
                    g4.i = i10;
                    return g4.a();
                }
                try {
                    l3o f = uknVar.f(d0oVar3);
                    if (l3oVar3 != null) {
                        if (f.d == 304) {
                            k3o g5 = l3oVar3.g();
                            zvd zvdVar5 = l3oVar3.f;
                            zvd zvdVar6 = f.f;
                            ArrayList arrayList2 = new ArrayList(20);
                            int size2 = zvdVar5.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                String g6 = zvdVar5.g(i11);
                                String q2 = zvdVar5.q(i11);
                                if ((!"Warning".equalsIgnoreCase(g6) || !c.v(q2, "1", false)) && ("Content-Length".equalsIgnoreCase(g6) || "Content-Encoding".equalsIgnoreCase(g6) || HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(g6) || !fs7.z(g6) || zvdVar6.a(g6) == null)) {
                                    g6.getClass();
                                    q2.getClass();
                                    arrayList2.add(g6);
                                    arrayList2.add(StringsKt.t0(q2).toString());
                                }
                            }
                            int size3 = zvdVar6.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                String g7 = zvdVar6.g(i12);
                                if (!"Content-Length".equalsIgnoreCase(g7) && !"Content-Encoding".equalsIgnoreCase(g7) && !HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(g7) && fs7.z(g7)) {
                                    String q3 = zvdVar6.q(i12);
                                    g7.getClass();
                                    q3.getClass();
                                    arrayList2.add(g7);
                                    arrayList2.add(StringsKt.t0(q3).toString());
                                }
                            }
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            pv9 pv9Var = new pv9(9);
                            z75.u((ArrayList) pv9Var.b, strArr);
                            g5.f = pv9Var;
                            g5.k = f.k;
                            g5.l = f.l;
                            l3o i13 = fs7.i(l3oVar3);
                            k3o.b("cacheResponse", i13);
                            g5.i = i13;
                            l3o i14 = fs7.i(f);
                            k3o.b("networkResponse", i14);
                            g5.h = i14;
                            a = g5.a();
                            o3o o3oVar5 = f.g;
                            o3oVar5.getClass();
                            o3oVar5.close();
                            to3 to3Var3 = (to3) this.b;
                            to3Var3.getClass();
                            synchronized (to3Var3) {
                            }
                            ((to3) this.b).getClass();
                            qo3 qo3Var2 = new qo3(a);
                            o3o o3oVar6 = l3oVar3.g;
                            o3oVar6.getClass();
                            f78 f78Var = ((po3) o3oVar6).b;
                            try {
                                z0jVar2 = f78Var.d.g(f78Var.b, f78Var.a);
                                if (z0jVar2 != 0) {
                                    try {
                                        qo3Var2.c(z0jVar2);
                                        z0jVar2.B();
                                    } catch (IOException unused3) {
                                        if (z0jVar2 != 0) {
                                            try {
                                                z0jVar2.l();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return a;
                                    }
                                }
                            } catch (IOException unused5) {
                                z0jVar2 = yk3Var;
                            }
                            return a;
                        }
                        o3o o3oVar7 = l3oVar3.g;
                        if (o3oVar7 != null) {
                            cvt.d(o3oVar7);
                        }
                    }
                    k3o g8 = f.g();
                    l3o i15 = fs7.i(l3oVar3);
                    k3o.b("cacheResponse", i15);
                    g8.i = i15;
                    l3o i16 = fs7.i(f);
                    k3o.b("networkResponse", i16);
                    g8.h = i16;
                    l3o a6 = g8.a();
                    if (((to3) this.b) != null) {
                        if (u6e.a(a6) && weo.E(d0oVar3, a6)) {
                            to3 to3Var4 = (to3) this.b;
                            to3Var4.getClass();
                            d0o d0oVar5 = a6.a;
                            String str11 = d0oVar5.b;
                            str11.getClass();
                            if (str11.equals(ServiceCommand.TYPE_POST) || str11.equals("PATCH") || str11.equals(ServiceCommand.TYPE_PUT) || str11.equals(ServiceCommand.TYPE_DEL) || str11.equals("MOVE")) {
                                to3Var4.a(d0oVar5);
                            } else {
                                if (str11.equals(ServiceCommand.TYPE_GET) && !q6k.L(a6.f).contains("*")) {
                                    qo3 qo3Var3 = new qo3(a6);
                                    try {
                                        k78 k78Var = to3Var4.a;
                                        String z3 = q6k.z(d0oVar5.a);
                                        Regex regex = k78.s;
                                        g = k78Var.g(-1L, z3);
                                    } catch (IOException unused6) {
                                        z0jVar = yk3Var;
                                    }
                                    if (g != null) {
                                        try {
                                            qo3Var3.c(g);
                                            yk3Var2 = new yk3();
                                            yk3Var2.e = to3Var4;
                                            yk3Var2.b = g;
                                            jmq X = g.X(1);
                                            yk3Var2.c = X;
                                            yk3Var2.d = new ro3(to3Var4, yk3Var2, X);
                                        } catch (IOException unused7) {
                                            z0jVar = g;
                                            if (z0jVar != 0) {
                                                z0jVar.l();
                                            }
                                            yk3Var2 = yk3Var;
                                            if (yk3Var2 != null) {
                                            }
                                            return a6;
                                        }
                                        if (yk3Var2 != null) {
                                            ro3 ro3Var = (ro3) yk3Var2.d;
                                            o3o o3oVar8 = a6.g;
                                            o3oVar8.getClass();
                                            tp3 tp3Var = new tp3(o3oVar8.z(), yk3Var2, fxf.t(ro3Var));
                                            String a7 = a6.f.a(HttpMessage.CONTENT_TYPE_HEADER);
                                            Object obj = a7 == null ? yk3Var : a7;
                                            long g9 = a6.g.g();
                                            k3o g10 = a6.g();
                                            g10.g = new wkn(obj, g9, new ikn(tp3Var), 0);
                                            a = g10.a();
                                            return a;
                                        }
                                    }
                                }
                                yk3Var2 = yk3Var;
                                if (yk3Var2 != null) {
                                }
                            }
                            yk3Var2 = yk3Var;
                            if (yk3Var2 != null) {
                            }
                        } else {
                            String str12 = d0oVar3.b;
                            str12.getClass();
                            if (str12.equals(ServiceCommand.TYPE_POST) || str12.equals("PATCH") || str12.equals(ServiceCommand.TYPE_PUT) || str12.equals(ServiceCommand.TYPE_DEL) || str12.equals("MOVE")) {
                                try {
                                    ((to3) this.b).a(d0oVar3);
                                } catch (IOException unused8) {
                                }
                            }
                        }
                    }
                    return a6;
                } catch (Throwable th) {
                    if (l3oVar != null && (o3oVar = l3oVar.g) != null) {
                        cvt.d(o3oVar);
                    }
                    throw th;
                }
            case 1:
                fk6 fk6Var = (fk6) this.b;
                d0o d0oVar6 = (d0o) uknVar.i;
                b0o b3 = d0oVar6.b();
                u7e u7eVar3 = d0oVar6.a;
                zvd zvdVar7 = d0oVar6.c;
                h0o h0oVar = d0oVar6.d;
                long j15 = -1;
                if (h0oVar != null) {
                    twh b4 = h0oVar.b();
                    if (b4 != null) {
                        b3.d(HttpMessage.CONTENT_TYPE_HEADER, b4.a);
                    }
                    long a8 = h0oVar.a();
                    if (a8 != -1) {
                        b3.d("Content-Length", String.valueOf(a8));
                        b3.c.I("Transfer-Encoding");
                    } else {
                        b3.d("Transfer-Encoding", "chunked");
                        b3.c.I("Content-Length");
                    }
                }
                if (zvdVar7.a("Host") == null) {
                    b3.d("Host", cvt.w(u7eVar3, false));
                }
                if (zvdVar7.a("Connection") == null) {
                    b3.d("Connection", "Keep-Alive");
                }
                if (zvdVar7.a("Accept-Encoding") == null && zvdVar7.a("Range") == null) {
                    b3.d("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                List loadForRequest = fk6Var.loadForRequest(u7eVar3);
                if (!loadForRequest.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    Iterator it = loadForRequest.iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            u75.n();
                            throw null;
                        }
                        ek6 ek6Var = (ek6) next;
                        Iterator it2 = it;
                        if (i17 > 0) {
                            sb3.append("; ");
                        }
                        sb3.append(ek6Var.a);
                        sb3.append('=');
                        sb3.append(ek6Var.b);
                        i17 = i18;
                        it = it2;
                    }
                    b3.d("Cookie", sb3.toString());
                }
                if (zvdVar7.a(HttpMessage.USER_AGENT) == null) {
                    b3.d(HttpMessage.USER_AGENT, "okhttp/4.12.0");
                }
                l3o f2 = uknVar.f(b3.b());
                zvd zvdVar8 = f2.f;
                u6e.b(fk6Var, u7eVar3, zvdVar8);
                k3o g11 = f2.g();
                g11.a = d0oVar6;
                if (z) {
                    String a9 = zvdVar8.a("Content-Encoding");
                    if (a9 == null) {
                        a9 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a9) && u6e.a(f2) && (o3oVar3 = f2.g) != null) {
                        jrd jrdVar = new jrd(o3oVar3.z());
                        pv9 m3 = zvdVar8.m();
                        m3.I("Content-Encoding");
                        m3.I("Content-Length");
                        g11.f = m3.r().m();
                        String a10 = zvdVar8.a(HttpMessage.CONTENT_TYPE_HEADER);
                        g11.g = new wkn(a10 == null ? null : a10, j15, new ikn(jrdVar), 0);
                    }
                }
                return g11.a();
            case 2:
                l3o f3 = uknVar.f((d0o) uknVar.i);
                cp3 a11 = f3.a();
                ep3 ep3Var = (ep3) this.b;
                if (ep3Var != null) {
                    long j16 = ep3Var.a;
                    if (!a11.a) {
                        long j17 = a11.c;
                        msa msaVar = nsa.b;
                        break;
                    }
                    msa msaVar2 = nsa.b;
                    int s = (int) nsa.s(j16, ssa.MINUTES);
                    TimeUnit timeUnit2 = TimeUnit.MINUTES;
                    timeUnit2.getClass();
                    if (s < 0) {
                        xq0.o(k5r.i(s, "maxAge < 0: "));
                        return null;
                    }
                    long seconds = timeUnit2.toSeconds(s);
                    cp3Var = new cp3(false, false, seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds, -1, false, false, false, -1, -1, false, false, false, null);
                    k3o g12 = f3.g();
                    pv9 pv9Var2 = g12.f;
                    pv9Var2.getClass();
                    qwp.D("Vary");
                    qwp.G("Accept-Language, X-Yandex-PUID", "Vary");
                    pv9Var2.I("Vary");
                    pv9Var2.m("Vary", "Accept-Language, X-Yandex-PUID");
                    if (cp3Var != null) {
                        String cp3Var2 = cp3Var.toString();
                        pv9 pv9Var3 = g12.f;
                        pv9Var3.getClass();
                        qwp.D("Cache-Control");
                        qwp.G(cp3Var2, "Cache-Control");
                        pv9Var3.I("Cache-Control");
                        pv9Var3.m("Cache-Control", cp3Var2);
                    }
                    return g12.a();
                }
                cp3Var = null;
                k3o g122 = f3.g();
                pv9 pv9Var22 = g122.f;
                pv9Var22.getClass();
                qwp.D("Vary");
                qwp.G("Accept-Language, X-Yandex-PUID", "Vary");
                pv9Var22.I("Vary");
                pv9Var22.m("Vary", "Accept-Language, X-Yandex-PUID");
                if (cp3Var != null) {
                }
                return g122.a();
            case 3:
                d0o d0oVar7 = (d0o) uknVar.i;
                l3o f4 = uknVar.f(d0oVar7);
                ((kzp) this.b).invoke(new Pair(d0oVar7.a.i, Boolean.valueOf(f4.h == null && f4.i != null)));
                return f4;
            case 4:
                d0o d0oVar8 = (d0o) uknVar.i;
                l3o f5 = uknVar.f(d0oVar8);
                if (yqq.class.cast(d0oVar8.e.get(yqq.class)) == null && !f5.b() && (i5 = f5.d) >= 400 && i5 < 500) {
                    do4 do4Var = i5 != 401 ? i5 != 451 ? do4.c : do4.b : do4.a;
                    gst gstVar = (gst) this.b;
                    x97.y(gstVar.c, null, pm6.d, new npt(gstVar, do4Var, (Continuation) null, 1), 1);
                }
                return f5;
            case 5:
                boolean booleanValue = ((Boolean) ((nxv) this.b).invoke()).booleanValue();
                d0o d0oVar9 = (d0o) uknVar.i;
                if (booleanValue) {
                    b0o b5 = d0oVar9.b();
                    b5.f(ofc.class, ofc.b);
                    d0oVar9 = b5.b();
                }
                return uknVar.f(d0oVar9);
            case 6:
                jyr b6 = btf.b(new dmg(29, this));
                boolean z4 = ((v76) b6.getValue()).d;
                d0o d0oVar10 = (d0o) uknVar.i;
                if (z4) {
                    return uknVar.f(d0oVar10);
                }
                throw new IllegalRequestOnNetworkModeException(d0oVar10.a.i, (v76) b6.getValue());
            case 7:
                YMApplication yMApplication = (YMApplication) this.b;
                String N = a0g.N(yMApplication);
                d0o d0oVar11 = (d0o) uknVar.i;
                Object obj2 = null;
                if (N == null || !quj.c0(yMApplication, N).exists()) {
                    ssg.a(3, "PassportVpnBlockingInterceptor", "User is online", null);
                    return uknVar.f(d0oVar11);
                }
                if (!d0oVar11.a.b().equals("/tmgrdfrend/checkvpn")) {
                    ssg.a(3, "PassportVpnBlockingInterceptor", "User is offline", null);
                    throw new InterruptedIOException("no retry");
                }
                ssg.a(3, "PassportVpnBlockingInterceptor", "User is offline, returning synthetic 599", null);
                ArrayList arrayList3 = new ArrayList(20);
                izm izmVar2 = izm.HTTP_1_1;
                hi3 hi3Var = new hi3();
                hi3Var.write(new byte[0], 0, 0);
                return new l3o(d0oVar11, izmVar2, "Client offline", 599, null, new zvd((String[]) arrayList3.toArray(new String[0])), new wkn(obj2, 0, hi3Var, 1), null, null, null, 0L, 0L, null);
            case 8:
                d0o d0oVar12 = (d0o) uknVar.i;
                mkn mknVar = (mkn) uknVar.g;
                List list2 = c5b.a;
                l3o l3oVar4 = null;
                int i19 = 0;
                d0o d0oVar13 = d0oVar12;
                while (true) {
                    boolean z5 = true;
                    while (true) {
                        d0oVar13.getClass();
                        if (mknVar.l != null) {
                            xq0.q("Check failed.");
                            break;
                        } else {
                            synchronized (mknVar) {
                                try {
                                    if (mknVar.n) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (mknVar.m) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (z5) {
                                fpa fpaVar = mknVar.d;
                                u7e u7eVar4 = d0oVar13.a;
                                OkHttpClient okHttpClient = mknVar.a;
                                if (u7eVar4.j) {
                                    SSLSocketFactory sSLSocketFactory2 = okHttpClient.p;
                                    if (sSLSocketFactory2 == null) {
                                        xq0.q("CLEARTEXT-only client");
                                        break;
                                    } else {
                                        HostnameVerifier hostnameVerifier2 = okHttpClient.t;
                                        ha4Var = okHttpClient.u;
                                        hostnameVerifier = hostnameVerifier2;
                                        sSLSocketFactory = sSLSocketFactory2;
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    ha4Var = null;
                                }
                                mknVar.i = new job(fpaVar, new mn(u7eVar4.d, u7eVar4.e, okHttpClient.l, okHttpClient.o, sSLSocketFactory, hostnameVerifier, ha4Var, okHttpClient.n, okHttpClient.s, okHttpClient.r, okHttpClient.m), mknVar, mknVar.e);
                            }
                            try {
                                if (mknVar.p) {
                                    throw new IOException("Canceled");
                                }
                                try {
                                    l3o f6 = uknVar.f(d0oVar13);
                                    if (l3oVar4 != null) {
                                        k3o g13 = f6.g();
                                        k3o g14 = l3oVar4.g();
                                        g14.g = null;
                                        l3o a12 = g14.a();
                                        if (a12.g != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        g13.j = a12;
                                        f6 = g13.a();
                                    }
                                    l3oVar4 = f6;
                                    d0oVar13 = a(l3oVar4, mknVar.l);
                                    if (d0oVar13 == null) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                        h0o h0oVar2 = d0oVar13.d;
                                        if (h0oVar2 == null || !h0oVar2.c()) {
                                            o3o o3oVar9 = l3oVar4.g;
                                            if (o3oVar9 != null) {
                                                cvt.d(o3oVar9);
                                            }
                                            i19++;
                                            if (i19 > 20) {
                                                throw new ProtocolException("Too many follow-up requests: " + i19);
                                            }
                                            mknVar.e(true);
                                        }
                                    }
                                } catch (cho e) {
                                    if (!d(e.b, mknVar, d0oVar13, false)) {
                                        IOException iOException = e.a;
                                        iOException.getClass();
                                        list2.getClass();
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            fob.a(iOException, (Exception) it3.next());
                                        }
                                        throw iOException;
                                    }
                                    list2 = CollectionsKt.h0(list2, e.a);
                                    mknVar.e(true);
                                } catch (IOException e2) {
                                    if (!d(e2, mknVar, d0oVar13, !(e2 instanceof i66))) {
                                        list2.getClass();
                                        Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            fob.a(e2, (Exception) it4.next());
                                        }
                                        throw e2;
                                    }
                                    list2 = CollectionsKt.h0(list2, e2);
                                    mknVar.e(true);
                                }
                            } catch (Throwable th3) {
                                mknVar.e(true);
                                throw th3;
                            }
                        }
                        z5 = false;
                    }
                }
                mknVar.e(z2);
                return l3oVar4;
            case 9:
                return c(uknVar);
            default:
                b0o b7 = ((d0o) uknVar.i).b();
                uyt uytVar = (uyt) this.b;
                b7.d("Accept-Language", (String) uytVar.a.invoke());
                b7.d("X-Yandex-PUID", (String) uytVar.b.invoke());
                return uknVar.f(b7.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(IOException iOException, mkn mknVar, d0o d0oVar, boolean z) {
        boolean z2;
        gn7 gn7Var;
        okn oknVar;
        h0o h0oVar;
        if (!((OkHttpClient) this.b).f || ((z && (((h0oVar = d0oVar.d) != null && h0oVar.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        job jobVar = mknVar.i;
        jobVar.getClass();
        int i = jobVar.g;
        if (i == 0 && jobVar.h == 0 && jobVar.i == 0) {
            z2 = false;
        } else {
            if (jobVar.j == null) {
                bho bhoVar = null;
                if (i <= 1 && jobVar.h <= 1 && jobVar.i <= 0 && (oknVar = jobVar.c.j) != null) {
                    synchronized (oknVar) {
                        if (oknVar.l == 0) {
                            if (cvt.a(oknVar.b.a.h, jobVar.b.h)) {
                                bhoVar = oknVar.b;
                            }
                        }
                    }
                }
                if (bhoVar != null) {
                    jobVar.j = bhoVar;
                } else {
                    c11 c11Var = jobVar.e;
                    if ((c11Var == null || !c11Var.b()) && (gn7Var = jobVar.f) != null) {
                        z2 = gn7Var.b();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public up3(q76 q76Var) {
        this.a = 6;
        q76Var.getClass();
        this.b = q76Var;
    }

    public /* synthetic */ up3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public up3(e3s e3sVar) {
        this.a = 1;
        e3sVar.getClass();
        this.b = e3sVar;
    }

    public up3(OkHttpClient okHttpClient) {
        this.a = 8;
        okHttpClient.getClass();
        this.b = okHttpClient;
    }
}
