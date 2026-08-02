package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class y6e implements bse {
    public final ovn a = ovn.e;
    public volatile q5b b = q5b.a;
    public volatile int c = 1;

    public final void a(zvd zvdVar, int i) {
        q5b q5bVar = this.b;
        zvdVar.g(i);
        q5bVar.getClass();
        String q = zvdVar.q(i);
        this.a.J(zvdVar.g(i) + ": " + q);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0267  */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String str4;
        l3o f;
        String str5;
        String g;
        String str6;
        Long l;
        Charset charset;
        Charset charset2;
        int i = this.c;
        d0o d0oVar = (d0o) uknVar.i;
        boolean z3 = true;
        if (i == 1) {
            return uknVar.f(d0oVar);
        }
        boolean z4 = i == 4;
        if (!z4 && i != 3) {
            z3 = false;
        }
        h0o h0oVar = d0oVar.d;
        evj evjVar = (evj) uknVar.h;
        okn oknVar = evjVar != null ? (okn) evjVar.f : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(d0oVar.b);
        sb.append(' ');
        sb.append(d0oVar.a);
        if (oknVar != null) {
            StringBuilder sb2 = new StringBuilder(StringUtil.SPACE);
            izm izmVar = oknVar.f;
            izmVar.getClass();
            sb2.append(izmVar);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        String sb3 = sb.toString();
        if (!z3 && h0oVar != null) {
            StringBuilder m = tlm.m(sb3, " (");
            m.append(h0oVar.a());
            m.append("-byte body)");
            sb3 = m.toString();
        }
        this.a.J(sb3);
        try {
            if (z3) {
                zvd zvdVar = d0oVar.c;
                if (h0oVar != null) {
                    twh b = h0oVar.b();
                    z = z3;
                    if (b == null || zvdVar.a(HttpMessage.CONTENT_TYPE_HEADER) != null) {
                        z2 = z4;
                        str2 = StringUtil.SPACE;
                    } else {
                        ovn ovnVar = this.a;
                        z2 = z4;
                        str2 = StringUtil.SPACE;
                        ovnVar.J("Content-Type: " + b);
                    }
                    if (h0oVar.a() != -1 && zvdVar.a("Content-Length") == null) {
                        this.a.J("Content-Length: " + h0oVar.a());
                    }
                } else {
                    z = z3;
                    z2 = z4;
                    str2 = StringUtil.SPACE;
                }
                int size = zvdVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(zvdVar, i2);
                }
                if (!z2 || h0oVar == null) {
                    str4 = "gzip";
                    str3 = "Content-Encoding";
                    this.a.J("--> END " + d0oVar.b);
                } else {
                    String a = d0oVar.c.a("Content-Encoding");
                    if (a != null && !a.equalsIgnoreCase("identity") && !a.equalsIgnoreCase("gzip")) {
                        this.a.J(su4.o(new StringBuilder("--> END "), d0oVar.b, " (encoded body omitted)"));
                    } else if (h0oVar.c()) {
                        this.a.J(su4.o(new StringBuilder("--> END "), d0oVar.b, " (one-shot body omitted)"));
                    } else {
                        hi3 hi3Var = new hi3();
                        h0oVar.d(hi3Var);
                        twh b2 = h0oVar.b();
                        if (b2 == null || (charset2 = b2.a(StandardCharsets.UTF_8)) == null) {
                            charset2 = StandardCharsets.UTF_8;
                            charset2.getClass();
                        }
                        this.a.J("");
                        boolean v = t7g.v(hi3Var);
                        ovn ovnVar2 = this.a;
                        if (v) {
                            str4 = "gzip";
                            str3 = "Content-Encoding";
                            ovnVar2.J(hi3Var.F0(hi3Var.b, charset2));
                            this.a.J("--> END " + d0oVar.b + " (" + h0oVar.a() + "-byte body)");
                        } else {
                            str4 = "gzip";
                            str3 = "Content-Encoding";
                            ovnVar2.J("--> END " + d0oVar.b + " (binary " + h0oVar.a() + "-byte body omitted)");
                        }
                    }
                }
                long nanoTime = System.nanoTime();
                f = uknVar.f(d0oVar);
                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                o3o o3oVar = f.g;
                o3oVar.getClass();
                long g2 = o3oVar.g();
                String str7 = g2 == -1 ? g2 + "-byte" : "unknown-length";
                ovn ovnVar3 = this.a;
                StringBuilder sb4 = new StringBuilder("<-- ");
                sb4.append(f.d);
                if (f.c.length() != 0) {
                    str5 = str4;
                    g = "";
                } else {
                    str5 = str4;
                    g = f1d.g(str2, f.c);
                }
                sb4.append(g);
                sb4.append(' ');
                sb4.append(f.a.a);
                sb4.append(" (");
                sb4.append(nanoTime2);
                sb4.append("ms");
                ovnVar3.J(dfi.i(sb4, z ? hrg.q(", ", str7, " body") : "", ')'));
                if (z) {
                    zvd zvdVar2 = f.f;
                    int size2 = zvdVar2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a(zvdVar2, i3);
                    }
                    if (z2 && u6e.a(f)) {
                        String str8 = str3;
                        String a2 = f.f.a(str8);
                        if (a2 == null || a2.equalsIgnoreCase("identity")) {
                            str6 = str5;
                        } else {
                            str6 = str5;
                            if (!a2.equalsIgnoreCase(str6)) {
                                this.a.J("<-- END HTTP (encoded body omitted)");
                                return f;
                            }
                        }
                        ij3 z5 = o3oVar.z();
                        z5.request(Long.MAX_VALUE);
                        hi3 h = z5.h();
                        if (str6.equalsIgnoreCase(zvdVar2.a(str8))) {
                            l = Long.valueOf(h.b);
                            jrd jrdVar = new jrd(h.clone());
                            try {
                                h = new hi3();
                                h.o0(jrdVar);
                                jrdVar.close();
                            } finally {
                            }
                        } else {
                            l = null;
                        }
                        twh o = o3oVar.o();
                        if (o == null || (charset = o.a(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            charset.getClass();
                        }
                        if (!t7g.v(h)) {
                            this.a.J("");
                            this.a.J(hrg.m(h.b, "-byte body omitted)", new StringBuilder("<-- END HTTP (binary ")));
                            return f;
                        }
                        if (g2 != 0) {
                            this.a.J("");
                            ovn ovnVar4 = this.a;
                            hi3 clone = h.clone();
                            ovnVar4.J(clone.F0(clone.b, charset));
                        }
                        ovn ovnVar5 = this.a;
                        long j = h.b;
                        if (l == null) {
                            ovnVar5.J(dfi.e(j, "<-- END HTTP (", "-byte body)"));
                            return f;
                        }
                        ovnVar5.J("<-- END HTTP (" + j + "-byte, " + l + "-gzipped-byte body)");
                        return f;
                    }
                    this.a.J("<-- END HTTP");
                }
                return f;
            }
            z = z3;
            z2 = z4;
            str2 = StringUtil.SPACE;
            f = uknVar.f(d0oVar);
            long nanoTime22 = (System.nanoTime() - nanoTime) / 1000000;
            o3o o3oVar2 = f.g;
            o3oVar2.getClass();
            long g22 = o3oVar2.g();
            if (g22 == -1) {
            }
            ovn ovnVar32 = this.a;
            StringBuilder sb42 = new StringBuilder("<-- ");
            sb42.append(f.d);
            if (f.c.length() != 0) {
            }
            sb42.append(g);
            sb42.append(' ');
            sb42.append(f.a.a);
            sb42.append(" (");
            sb42.append(nanoTime22);
            sb42.append("ms");
            ovnVar32.J(dfi.i(sb42, z ? hrg.q(", ", str7, " body") : "", ')'));
            if (z) {
            }
            return f;
        } catch (Exception e) {
            this.a.J("<-- HTTP FAILED: " + e);
            throw e;
        }
        str4 = "gzip";
        str3 = "Content-Encoding";
        long nanoTime3 = System.nanoTime();
    }
}
