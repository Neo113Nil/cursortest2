package com.yandex.plus.pay.common.api.network;

import androidx.core.app.q;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.z;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import defpackage.bse;
import defpackage.c5b;
import defpackage.d0o;
import defpackage.evj;
import defpackage.h0o;
import defpackage.hi3;
import defpackage.ij3;
import defpackage.izm;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.okn;
import defpackage.twh;
import defpackage.ukn;
import defpackage.xq0;
import defpackage.zvd;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class c implements bse {
    public static final Charset b = Charset.forName("UTF-8");
    public final m a;

    public c(m mVar) {
        b[] bVarArr = b.a;
        this.a = mVar;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        izm izmVar;
        b[] bVarArr = b.a;
        d0o d0oVar = (d0o) uknVar.i;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(3);
        evj evjVar = (evj) uknVar.h;
        okn oknVar = evjVar != null ? (okn) evjVar.f : null;
        if (oknVar != null) {
            izmVar = oknVar.f;
            izmVar.getClass();
        } else {
            izmVar = null;
        }
        if (izmVar == null) {
            izmVar = izm.HTTP_1_1;
        }
        h0o h0oVar = d0oVar.d;
        zvd zvdVar = d0oVar.c;
        String str = d0oVar.b + ' ' + d0oVar.a;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(str);
        sb.append(' ');
        sb.append(izmVar);
        sb.append(' ');
        sb.append(h0oVar == null ? "(no body)" : com.yandex.plus.home.plaque.animator.internal.utils.a.r(h0oVar.a(), h0oVar.b()));
        aVar.r(sb.toString());
        com.yandex.plus.home.plaque.animator.internal.utils.a.b(aVar, zvdVar);
        if (h0oVar != null) {
            h0o h0oVar2 = d0oVar.d;
            if (h0oVar2 == null) {
                xq0.x("Can't create body writer for request with no body.");
                return null;
            }
            hi3 hi3Var = new hi3();
            h0oVar2.d(hi3Var);
            new a(hi3Var, h0oVar2.b(), zvdVar.a("Content-Encoding")).a(aVar);
        }
        aVar.r("--> END ".concat(str));
        String sb2 = ((StringBuilder) aVar.b).toString();
        m mVar = this.a;
        mVar.invoke(sb2);
        l lVar = new l("", c5b.a, new q(24));
        lVar.c();
        try {
            l3o f = uknVar.f(d0oVar);
            zvd zvdVar2 = f.f;
            o3o o3oVar = f.g;
            lVar.d();
            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(3);
            double a = z.a(lVar);
            String str2 = f.d + ' ' + f.c;
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(str2);
            sb3.append(' ');
            sb3.append(f.a.a);
            sb3.append(' ');
            sb3.append("(" + a + "ms)");
            sb3.append(' ');
            sb3.append(o3oVar != null ? com.yandex.plus.home.plaque.animator.internal.utils.a.r(o3oVar.g(), o3oVar.o()) : "(no body)");
            aVar2.r(sb3.toString());
            com.yandex.plus.home.plaque.animator.internal.utils.a.b(aVar2, zvdVar2);
            if (o3oVar != null) {
                if (o3oVar == null) {
                    xq0.x("Can't create body writer for response with no body.");
                    return null;
                }
                ij3 z = o3oVar.z();
                z.request(Long.MAX_VALUE);
                hi3 s = z.s();
                twh o = o3oVar.o();
                String a2 = zvdVar2.a("Content-Encoding");
                new a(s, o, a2 != null ? a2 : null).a(aVar2);
            }
            aVar2.r("<-- END HTTP");
            mVar.invoke(((StringBuilder) aVar2.b).toString());
            return f;
        } catch (Exception e) {
            mVar.invoke("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
