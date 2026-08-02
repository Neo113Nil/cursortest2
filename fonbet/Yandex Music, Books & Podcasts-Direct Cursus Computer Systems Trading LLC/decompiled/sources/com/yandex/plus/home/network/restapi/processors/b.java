package com.yandex.plus.home.network.restapi.processors;

import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.core.openapi.g;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class b implements g {
    public static void b(StringBuilder sb, com.yandex.plus.core.openapi.b bVar) {
        sb.append("requestMethod=" + bVar.a);
        sb.append('\n');
        sb.append("requestUrl=".concat(bVar.b));
        sb.append('\n');
        sb.append("requestId=" + ((String) bVar.c.get("X-Request-Id")));
        sb.append('\n');
    }

    @Override // com.yandex.plus.core.openapi.g
    public final void a(com.yandex.plus.core.openapi.a aVar) {
        String str;
        aVar.getClass();
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            StringBuilder k = dfi.k("Network request SUCCESS\n");
            b(k, bVar.b);
            k.append("parsedResponse=" + bVar.a);
            String sb = k.toString();
            com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
            jyr jyrVar = e.a;
            e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, sb, null);
            return;
        }
        if (!(aVar instanceof a.AbstractC0017a)) {
            b6e.s();
            return;
        }
        a.AbstractC0017a abstractC0017a = (a.AbstractC0017a) aVar;
        StringBuilder k2 = dfi.k("Network request ERROR\n");
        b(k2, abstractC0017a.getB());
        if (abstractC0017a instanceof a.AbstractC0017a.AbstractC0018a) {
            a.AbstractC0017a.AbstractC0018a abstractC0018a = (a.AbstractC0017a.AbstractC0018a) abstractC0017a;
            if (abstractC0018a instanceof a.AbstractC0017a.AbstractC0018a.C0019a) {
                str = "Backend";
            } else {
                if (!(abstractC0018a instanceof a.AbstractC0017a.AbstractC0018a.b)) {
                    b6e.s();
                    return;
                }
                str = "HTTP";
            }
            k2.append("errorType=".concat(str));
            k2.append('\n');
            k2.append("code=" + abstractC0018a.getB());
            k2.append('\n');
            k2.append("message=" + abstractC0018a.getC());
            k2.append('\n');
            k2.append("errorBody=" + abstractC0018a.getD());
        } else if (abstractC0017a instanceof a.AbstractC0017a.b) {
            k2.append("errorType=NETWORK");
            k2.append('\n');
            k2.append("cause=" + ((a.AbstractC0017a.b) abstractC0017a).b);
        } else if (abstractC0017a instanceof a.AbstractC0017a.d) {
            k2.append("errorType=PARSE");
            k2.append('\n');
            k2.append("cause=" + ((a.AbstractC0017a.d) abstractC0017a).b);
        } else {
            if (!(abstractC0017a instanceof a.AbstractC0017a.c)) {
                b6e.s();
                return;
            }
            k2.append("errorType=OTHER");
            k2.append('\n');
            k2.append("cause=" + ((a.AbstractC0017a.c) abstractC0017a).b);
        }
        String sb2 = k2.toString();
        com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar2 = e.a;
        e.e(com.yandex.plus.core.analytics.logging.a.e, bVar3, sb2, null);
    }
}
