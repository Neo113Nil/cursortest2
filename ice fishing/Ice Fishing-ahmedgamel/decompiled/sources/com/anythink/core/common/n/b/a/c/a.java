package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.m;
import com.anythink.core.common.n.b.n;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.x;
import com.anythink.core.common.n.c.l;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    private final n f15834a;

    public a(n nVar) {
        this.f15834a = nVar;
    }

    @Override // com.anythink.core.common.n.b.w
    public final af a(w.a aVar) {
        ad a9 = aVar.a();
        ad.a e9 = a9.e();
        ae d9 = a9.d();
        if (d9 != null) {
            x a10 = d9.a();
            if (a10 != null) {
                e9.a("Content-Type", a10.toString());
            }
            long b9 = d9.b();
            if (b9 != -1) {
                e9.a("Content-Length", Long.toString(b9));
                e9.b("Transfer-Encoding");
            } else {
                e9.a("Transfer-Encoding", "chunked");
                e9.b("Content-Length");
            }
        }
        if (a9.a("Host") == null) {
            e9.a("Host", com.anythink.core.common.n.b.a.c.a(a9.a(), false));
        }
        if (a9.a("Connection") == null) {
            e9.a("Connection", com.anythink.expressad.foundation.g.f.g.b.f20127c);
        }
        n nVar = this.f15834a;
        a9.a();
        List<m> b10 = nVar.b();
        if (!b10.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = b10.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                m mVar = b10.get(i);
                sb.append(mVar.a());
                sb.append('=');
                sb.append(mVar.b());
            }
            e9.a("Cookie", sb.toString());
        }
        af a11 = aVar.a(e9.b());
        e.a(this.f15834a, a9.a(), a11.f());
        af.a a12 = a11.h().a(a9);
        if (com.anythink.expressad.foundation.g.f.g.b.f20128d.equalsIgnoreCase(a11.a("Content-Encoding")) && e.d(a11)) {
            l lVar = new l(a11.g().c());
            a12.a(a11.f().b().b("Content-Encoding").b("Content-Length").a());
            a12.a(new h(a11.a("Content-Type"), -1L, com.anythink.core.common.n.c.n.a(lVar)));
        }
        return a12.a();
    }

    private static String a(List<m> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            m mVar = list.get(i);
            sb.append(mVar.a());
            sb.append('=');
            sb.append(mVar.b());
        }
        return sb.toString();
    }
}
