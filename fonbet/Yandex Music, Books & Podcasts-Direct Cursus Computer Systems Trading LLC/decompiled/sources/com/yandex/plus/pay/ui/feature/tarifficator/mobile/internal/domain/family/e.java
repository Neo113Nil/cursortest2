package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family;

import android.content.Context;
import android.net.Uri;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tah;
import defpackage.u75;
import defpackage.v75;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class e implements c {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.a a;
    public final b b;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.common.a c;

    public e(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.a aVar, b bVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.common.a aVar2) {
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = bVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        d dVar;
        int i;
        PlusPayWebFamilyInviteResult.Success success;
        String str;
        Map map;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.l = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c) this.a).a(dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                success = (PlusPayWebFamilyInviteResult.Success) obj;
                if (success != null) {
                    return null;
                }
                String webUrl = success.getWebUrl();
                b bVar = this.b;
                bVar.getClass();
                webUrl.getClass();
                Uri parse = Uri.parse(webUrl);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                queryParameterNames.getClass();
                Set<String> set = queryParameterNames;
                int a = tah.a(v75.o(set, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                Iterator<T> it = set.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String queryParameter = parse.getQueryParameter((String) next);
                    if (queryParameter != null) {
                        str = queryParameter;
                    }
                    linkedHashMap.put(next, u75.j(str));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                String str2 = bVar.b;
                Context a2 = bVar.c.a();
                com.yandex.plus.ui.core.theme.a aVar = (com.yandex.plus.ui.core.theme.a) bVar.d.a.getValue();
                String a3 = bVar.f.a();
                str = a3 != null ? a3 : "";
                String str3 = u.r(a2, aVar) ? "DARK" : "LIGHT";
                String language = bVar.e.a().getLanguage();
                b.b(linkedHashMap2, "client_app_version", bVar.a);
                b.b(linkedHashMap2, "client_id", str2);
                b.b(linkedHashMap2, "service_name", str2);
                b.b(linkedHashMap2, "theme", str3);
                language.getClass();
                b.b(linkedHashMap2, "lang", language);
                b.b(linkedHashMap2, "mm_device_id", str);
                b.b(linkedHashMap2, "plus_sdk_version", "110.0.0");
                b.b(linkedHashMap2, "sdk_view", "1");
                b.b(linkedHashMap2, Constants.KEY_MESSAGE, "hide-family-shelf");
                b.b(linkedHashMap2, "mode", "SDK_PAY");
                b.b(linkedHashMap2, "platform", "ANDROID");
                b.a("BROADCASTING", linkedHashMap2);
                b.a("NATIVE_SHARING", linkedHashMap2);
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str4 = (String) entry.getKey();
                    Iterator it2 = ((Collection) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        clearQuery.appendQueryParameter(str4, (String) it2.next());
                    }
                }
                String uri = clearQuery.build().toString();
                uri.getClass();
                String e = ((com.yandex.plus.domain.auth.api.e) this.c.a.getValue()).e();
                if (e == null || (map = dfi.n("Authorization", "OAuth ".concat(e))) == null) {
                    map = e5b.a;
                    map.getClass();
                }
                return new a(uri, success.getSkipText(), map);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        success = (PlusPayWebFamilyInviteResult.Success) obj2;
        if (success != null) {
        }
    }
}
