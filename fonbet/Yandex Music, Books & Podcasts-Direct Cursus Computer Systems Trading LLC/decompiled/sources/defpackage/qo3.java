package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class qo3 {
    public static final String k;
    public static final String l;
    public final u7e a;
    public final zvd b;
    public final String c;
    public final izm d;
    public final int e;
    public final String f;
    public final zvd g;
    public final hsd h;
    public final long i;
    public final long j;

    static {
        otk otkVar = otk.a;
        otk.a.getClass();
        k = "OkHttp-Sent-Millis";
        otk.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public qo3(n3r n3rVar) {
        u7e u7eVar;
        n3rVar.getClass();
        try {
            ikn iknVar = new ikn(n3rVar);
            String G = iknVar.G(Long.MAX_VALUE);
            try {
                s7e s7eVar = new s7e();
                s7eVar.h(null, G);
                u7eVar = s7eVar.e();
            } catch (IllegalArgumentException unused) {
                u7eVar = null;
            }
            if (u7eVar == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(G));
                otk otkVar = otk.a;
                otk.a.getClass();
                otk.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = u7eVar;
            this.c = iknVar.G(Long.MAX_VALUE);
            pv9 pv9Var = new pv9(9);
            int E = q6k.E(iknVar);
            for (int i = 0; i < E; i++) {
                pv9Var.f(iknVar.G(Long.MAX_VALUE));
            }
            this.b = pv9Var.r();
            w2r D = lsq.D(iknVar.G(Long.MAX_VALUE));
            this.d = (izm) D.c;
            this.e = D.b;
            this.f = (String) D.d;
            pv9 pv9Var2 = new pv9(9);
            int E2 = q6k.E(iknVar);
            for (int i2 = 0; i2 < E2; i2++) {
                pv9Var2.f(iknVar.G(Long.MAX_VALUE));
            }
            String str = k;
            String s = pv9Var2.s(str);
            String str2 = l;
            String s2 = pv9Var2.s(str2);
            pv9Var2.I(str);
            pv9Var2.I(str2);
            this.i = s != null ? Long.parseLong(s) : 0L;
            this.j = s2 != null ? Long.parseLong(s2) : 0L;
            this.g = pv9Var2.r();
            if (Intrinsics.d(this.a.a, "https")) {
                String G2 = iknVar.G(Long.MAX_VALUE);
                if (G2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + G2 + '\"');
                }
                el4 P = el4.b.P(iknVar.G(Long.MAX_VALUE));
                List a = a(iknVar);
                List a2 = a(iknVar);
                sks y = !iknVar.a() ? a0g.y(iknVar.G(Long.MAX_VALUE)) : sks.SSL_3_0;
                a.getClass();
                a2.getClass();
                this.h = new hsd(y, P, cvt.x(a2), new ep7(cvt.x(a), 1));
            } else {
                this.h = null;
            }
            n3rVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yd5.q(n3rVar, th);
                throw th2;
            }
        }
    }

    public static List a(ikn iknVar) {
        int E = q6k.E(iknVar);
        if (E == -1) {
            return c5b.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(E);
            for (int i = 0; i < E; i++) {
                String G = iknVar.G(Long.MAX_VALUE);
                hi3 hi3Var = new hi3();
                pn3 pn3Var = pn3.d;
                pn3 z = ovn.z(G);
                if (z == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                hi3Var.L0(z);
                arrayList.add(certificateFactory.generateCertificate(new fi3(hi3Var, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            kac.f(e.getMessage());
            return null;
        }
    }

    public static void b(hkn hknVar, List list) {
        try {
            hknVar.c0(list.size());
            hknVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                pn3 pn3Var = pn3.d;
                encoded.getClass();
                hknVar.M(ovn.L(-1234567890, encoded).a());
                hknVar.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            kac.f(e.getMessage());
        }
    }

    public final void c(z0j z0jVar) {
        u7e u7eVar = this.a;
        hsd hsdVar = this.h;
        zvd zvdVar = this.g;
        zvd zvdVar2 = this.b;
        hkn hknVar = new hkn(z0jVar.X(0));
        try {
            hknVar.M(u7eVar.i);
            hknVar.writeByte(10);
            hknVar.M(this.c);
            hknVar.writeByte(10);
            hknVar.c0(zvdVar2.size());
            hknVar.writeByte(10);
            int size = zvdVar2.size();
            for (int i = 0; i < size; i++) {
                hknVar.M(zvdVar2.g(i));
                hknVar.M(": ");
                hknVar.M(zvdVar2.q(i));
                hknVar.writeByte(10);
            }
            izm izmVar = this.d;
            int i2 = this.e;
            String str = this.f;
            izmVar.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (izmVar == izm.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            hknVar.M(sb.toString());
            hknVar.writeByte(10);
            hknVar.c0(zvdVar.size() + 2);
            hknVar.writeByte(10);
            int size2 = zvdVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                hknVar.M(zvdVar.g(i3));
                hknVar.M(": ");
                hknVar.M(zvdVar.q(i3));
                hknVar.writeByte(10);
            }
            hknVar.M(k);
            hknVar.M(": ");
            hknVar.c0(this.i);
            hknVar.writeByte(10);
            hknVar.M(l);
            hknVar.M(": ");
            hknVar.c0(this.j);
            hknVar.writeByte(10);
            if (Intrinsics.d(u7eVar.a, "https")) {
                hknVar.writeByte(10);
                hsdVar.getClass();
                hknVar.M(hsdVar.b.a);
                hknVar.writeByte(10);
                b(hknVar, hsdVar.a());
                b(hknVar, hsdVar.c);
                hknVar.M(hsdVar.a.a);
                hknVar.writeByte(10);
            }
            hknVar.close();
        } finally {
        }
    }

    public qo3(l3o l3oVar) {
        zvd zvdVar;
        d0o d0oVar = l3oVar.a;
        this.a = d0oVar.a;
        l3o l3oVar2 = l3oVar.h;
        l3oVar2.getClass();
        zvd zvdVar2 = l3oVar2.a.c;
        zvd zvdVar3 = l3oVar.f;
        Set L = q6k.L(zvdVar3);
        if (L.isEmpty()) {
            zvdVar = cvt.b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = zvdVar2.size();
            for (int i = 0; i < size; i++) {
                String g = zvdVar2.g(i);
                if (L.contains(g)) {
                    String q = zvdVar2.q(i);
                    g.getClass();
                    q.getClass();
                    qwp.D(g);
                    qwp.G(q, g);
                    arrayList.add(g);
                    arrayList.add(StringsKt.t0(q).toString());
                }
            }
            zvdVar = new zvd((String[]) arrayList.toArray(new String[0]));
        }
        this.b = zvdVar;
        this.c = d0oVar.b;
        this.d = l3oVar.b;
        this.e = l3oVar.d;
        this.f = l3oVar.c;
        this.g = zvdVar3;
        this.h = l3oVar.e;
        this.i = l3oVar.k;
        this.j = l3oVar.l;
    }
}
