package com.yandex.plus.pay.graphql.family;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.graphql.c1;
import com.yandex.plus.core.graphql.d1;
import com.yandex.plus.core.graphql.e1;
import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.f1;
import com.yandex.plus.pay.repository.api.model.family.c;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dp0;
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

    public b(dp0 dp0Var, com.yandex.plus.core.locale.a aVar) {
        dp0Var.getClass();
        aVar.getClass();
        this.a = dp0Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        int i;
        c1 c1Var;
        com.yandex.plus.pay.repository.api.model.family.a aVar2;
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
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String concat = "getInviteToFamilyUrl() language=".concat(upperCase);
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
                    f1 f1Var = new f1(upperCase);
                    aVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, f1Var, aVar);
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
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                e.f("getInviteToFamilyUrl() response=" + kp0Var);
                c1Var = (c1) kp0Var.c;
                if (c1Var != null) {
                    throw new d("inviteToFamilyUrl response data is null", null);
                }
                d1 d1Var = c1Var.a;
                e1 e1Var = d1Var.a;
                if (e1Var != null) {
                    return new c(e1Var.a, e1Var.b);
                }
                switch (d1Var.b.ordinal()) {
                    case 0:
                        aVar2 = com.yandex.plus.pay.repository.api.model.family.a.a;
                        break;
                    case 1:
                    case 2:
                    case 6:
                        aVar2 = com.yandex.plus.pay.repository.api.model.family.a.e;
                        break;
                    case 3:
                        aVar2 = com.yandex.plus.pay.repository.api.model.family.a.b;
                        break;
                    case 4:
                        aVar2 = com.yandex.plus.pay.repository.api.model.family.a.c;
                        break;
                    case 5:
                        aVar2 = com.yandex.plus.pay.repository.api.model.family.a.d;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                return new com.yandex.plus.pay.repository.api.model.family.b(aVar2);
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
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.a;
        e.f("getInviteToFamilyUrl() response=" + kp0Var2);
        c1Var = (c1) kp0Var2.c;
        if (c1Var != null) {
        }
    }
}
