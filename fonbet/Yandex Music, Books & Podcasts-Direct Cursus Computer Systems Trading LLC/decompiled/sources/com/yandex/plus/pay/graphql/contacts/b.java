package com.yandex.plus.pay.graphql.contacts;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.graphql.e;
import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.f;
import com.yandex.plus.pay.repository.api.model.contacts.c;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class b {
    public final dp0 a;
    public final com.yandex.plus.core.locale.a b;
    public final String c;

    public b(dp0 dp0Var, com.yandex.plus.core.locale.a aVar, String str) {
        dp0Var.getClass();
        aVar.getClass();
        str.getClass();
        this.a = dp0Var;
        this.b = aVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.repository.api.model.contacts.b bVar, cg6 cg6Var) {
        a aVar;
        int i;
        e eVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String language = this.b.a().getLanguage();
                    language.getClass();
                    String upperCase = language.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    String str = this.c;
                    StringBuilder m = f1d.m("getCollectContactsWebUrl() language=", upperCase, ", service=", str, ", params=");
                    m.append(bVar);
                    String sb = m.toString();
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, sb, null);
                    f fVar = new f(upperCase, str, bVar.a.a);
                    aVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, fVar, aVar);
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
                kp0 kp0Var = (kp0) obj;
                u.f(kp0Var);
                com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                com.yandex.plus.core.analytics.logging.e.f("getCollectContactsWebUrl() response=" + kp0Var);
                eVar = (e) kp0Var.c;
                if (eVar != null) {
                    throw new d("collectUserContacts response data is null", null);
                }
                com.yandex.plus.core.graphql.d dVar = eVar.a;
                return new c(dVar.a, dVar.b, dVar.c);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar32 = com.yandex.plus.core.analytics.logging.b.a;
        com.yandex.plus.core.analytics.logging.e.f("getCollectContactsWebUrl() response=" + kp0Var2);
        eVar = (e) kp0Var2.c;
        if (eVar != null) {
        }
    }
}
