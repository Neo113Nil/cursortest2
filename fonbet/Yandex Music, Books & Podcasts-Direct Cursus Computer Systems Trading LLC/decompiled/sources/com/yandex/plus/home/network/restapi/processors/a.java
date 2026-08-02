package com.yandex.plus.home.network.restapi.processors;

import android.net.Uri;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.core.openapi.g;
import com.yandex.plus.home.core.network.c;
import com.yandex.plus.home.core.network.d;
import defpackage.b6e;
import defpackage.dnb;
import defpackage.ymb;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* loaded from: classes5.dex */
public final class a implements g {
    public final dnb a;
    public final d b;

    public a(dnb dnbVar, d dVar) {
        dnbVar.getClass();
        dVar.getClass();
        this.a = dnbVar;
        this.b = dVar;
    }

    @Override // com.yandex.plus.core.openapi.g
    public final void a(com.yandex.plus.core.openapi.a aVar) {
        ymb ymbVar;
        String str;
        c a;
        aVar.getClass();
        if (aVar instanceof a.AbstractC0017a) {
            a.AbstractC0017a abstractC0017a = (a.AbstractC0017a) aVar;
            Uri parse = Uri.parse(abstractC0017a.getB().b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (abstractC0017a instanceof a.AbstractC0017a.AbstractC0018a) {
                a.AbstractC0017a.AbstractC0018a abstractC0018a = (a.AbstractC0017a.AbstractC0018a) aVar;
                if (abstractC0018a instanceof a.AbstractC0017a.AbstractC0018a.b) {
                    ymbVar = ymb.Http;
                } else {
                    if (!(abstractC0018a instanceof a.AbstractC0017a.AbstractC0018a.C0019a)) {
                        b6e.s();
                        return;
                    }
                    ymbVar = ymb.Backend;
                }
                linkedHashMap.put("code", String.valueOf(abstractC0018a.getB()));
                linkedHashMap.put(Constants.KEY_MESSAGE, abstractC0018a.getC());
                String d = abstractC0018a.getD();
                if (d == null) {
                    d = "";
                }
                linkedHashMap.put("error_body", d);
            } else if (abstractC0017a instanceof a.AbstractC0017a.d) {
                ymbVar = ymb.Parsing;
                String message = ((a.AbstractC0017a.d) aVar).b.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message);
            } else if (abstractC0017a instanceof a.AbstractC0017a.b) {
                IOException iOException = ((a.AbstractC0017a.b) aVar).b;
                if (iOException instanceof com.yandex.plus.core.network.api.exceptions.a) {
                    return;
                }
                ymbVar = iOException instanceof SSLException ? ymb.Ssl : ymb.Connection;
                String message2 = iOException.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message2);
            } else {
                if (!(abstractC0017a instanceof a.AbstractC0017a.c)) {
                    b6e.s();
                    return;
                }
                ymbVar = ymb.Unknown;
                String message3 = ((a.AbstractC0017a.c) aVar).b.getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message3);
            }
            String str2 = ymbVar.a;
            String str3 = (String) abstractC0017a.getB().c.get("X-Request-Id");
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put(CommonUrlParts.REQUEST_ID, str3);
            String host = parse.getHost();
            if (host == null) {
                host = "";
            }
            String path = parse.getPath();
            String str4 = path != null ? path : "";
            String str5 = abstractC0017a.getB().a;
            dnb dnbVar = this.a;
            dnbVar.getClass();
            str5.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("base_url", host);
            linkedHashMap2.put("endpoint", str4);
            linkedHashMap2.put("method", str5);
            linkedHashMap2.put("error_type", str2);
            linkedHashMap2.put("additional_params", linkedHashMap);
            linkedHashMap2.put("_meta", dnb.b(new HashMap()));
            dnbVar.c("Error.Network.Rest", linkedHashMap2);
            Map map = abstractC0017a.getB().c;
            String str6 = abstractC0017a.getB().a;
            d dVar = this.b;
            dVar.getClass();
            map.getClass();
            String str7 = (String) map.get("X-Plus-Retry-Context");
            Object obj = null;
            c a2 = str7 != null ? dVar.a(str7) : null;
            if (a2 == null) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Iterator it2 = it;
                    if (kotlin.text.c.o((String) ((Map.Entry) next).getKey(), "X-Plus-Retry-Context", true)) {
                        obj = next;
                        break;
                    }
                    it = it2;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (str = (String) entry.getValue()) == null || (a = dVar.a(str)) == null || a.a != a.b) {
                    return;
                }
            } else if (a2.a != a2.b) {
                return;
            }
            str6.getClass();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("base_url", host);
            linkedHashMap3.put("endpoint", str4);
            linkedHashMap3.put("method", str6);
            linkedHashMap3.put("error_type", str2);
            linkedHashMap3.put("additional_params", linkedHashMap);
            linkedHashMap3.put("_meta", dnb.b(new HashMap()));
            dnbVar.c("Error.Retries.Exhausted.Rest", linkedHashMap3);
        }
    }
}
