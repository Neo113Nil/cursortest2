package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.graphql.j1;
import com.yandex.plus.core.graphql.k1;
import com.yandex.plus.core.graphql.l1;
import com.yandex.plus.core.graphql.m1;
import com.yandex.plus.core.graphql.n1;
import com.yandex.plus.core.graphql.p1;
import com.yandex.plus.pay.repository.api.model.offers.w;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class m {
    public final dp0 a;
    public final com.yandex.plus.core.locale.a b;
    public final com.yandex.plus.home.plaque.animator.internal.utils.a c;

    public m(dp0 dp0Var, com.yandex.plus.core.locale.a aVar) {
        dp0Var.getClass();
        aVar.getClass();
        this.a = dp0Var;
        this.b = aVar;
        this.c = new com.yandex.plus.home.plaque.animator.internal.utils.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:10)(2:25|26))(3:27|28|(1:30))|11|12|(1:14)|15|(3:17|(1:19)|20)|21|22))|37|6|7|(0)(0)|11|12|(0)|15|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.repository.api.model.mailingads.a aVar, cg6 cg6Var) {
        k kVar;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.j;
                nm6 nm6Var = nm6.a;
                i = kVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("changeMailingAdsAgreementStatus() status=" + aVar);
                    r7o r7oVar = z7o.b;
                    dp0 dp0Var = this.a;
                    this.c.getClass();
                    com.yandex.plus.core.graphql.c cVar = new com.yandex.plus.core.graphql.c(com.yandex.plus.home.plaque.animator.internal.utils.a.k(aVar));
                    kVar.l = 1;
                    obj2 = com.yandex.plus.bdui.flex.ui.a.d(dp0Var, cVar, kVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                kp0 kp0Var = (kp0) obj2;
                u.f(kp0Var);
                r7o r7oVar2 = z7o.b;
                obj = kp0Var;
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("changeMailingAdsAgreementStatus() error=" + a);
                }
                if (!(obj instanceof t7o)) {
                    com.yandex.plus.core.graphql.b bVar3 = (com.yandex.plus.core.graphql.b) ((kp0) obj).c;
                    com.yandex.plus.core.graphql.type.d dVar = bVar3 != null ? bVar3.a.a : null;
                    com.yandex.plus.core.analytics.logging.b bVar4 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("changeMailingAdsAgreementStatus() success with result=" + dVar);
                }
                return Unit.a;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj22 = kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj22;
        u.f(kp0Var2);
        r7o r7oVar22 = z7o.b;
        obj = kp0Var2;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (!(obj instanceof t7o)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        l lVar;
        int i;
        k1 k1Var;
        com.yandex.plus.pay.repository.api.model.mailingads.a aVar;
        com.yandex.plus.pay.repository.api.model.mailingads.b bVar;
        l1 l1Var;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String language = this.b.a().getLanguage();
                    language.getClass();
                    String upperCase = language.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("getMailingAdsAgreement() language=".concat(upperCase));
                    p1 p1Var = new p1(upperCase);
                    lVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, p1Var, lVar);
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
                com.yandex.plus.core.analytics.logging.e.f("getMailingAdsAgreement() response=" + kp0Var);
                k1Var = (k1) kp0Var.c;
                if (k1Var != null) {
                    throw new com.yandex.plus.core.graphql.exception.d("getMailingAdsAgreement() response data is null", null);
                }
                this.c.getClass();
                j1 j1Var = k1Var.a.a;
                if (j1Var == null) {
                    return null;
                }
                n1 n1Var = j1Var.c;
                String str = n1Var.a;
                ArrayList<m1> arrayList = n1Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (m1 m1Var : arrayList) {
                    w wVar = (m1Var == null || (l1Var = m1Var.b) == null) ? null : new w(l1Var.a, l1Var.b, l1Var.c);
                    if (wVar != null) {
                        arrayList2.add(wVar);
                    }
                }
                z zVar = new z(str, arrayList2);
                int ordinal = j1Var.a.ordinal();
                if (ordinal == 0) {
                    aVar = com.yandex.plus.pay.repository.api.model.mailingads.a.a;
                } else {
                    if (ordinal != 1 && ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    aVar = com.yandex.plus.pay.repository.api.model.mailingads.a.b;
                }
                int ordinal2 = j1Var.b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        bVar = com.yandex.plus.pay.repository.api.model.mailingads.b.b;
                        return new com.yandex.plus.pay.repository.api.model.mailingads.c(zVar, aVar, bVar);
                    }
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                }
                bVar = com.yandex.plus.pay.repository.api.model.mailingads.b.a;
                return new com.yandex.plus.pay.repository.api.model.mailingads.c(zVar, aVar, bVar);
            }
        }
        lVar = new l(this, cg6Var);
        Object obj2 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar32 = com.yandex.plus.core.analytics.logging.b.a;
        com.yandex.plus.core.analytics.logging.e.f("getMailingAdsAgreement() response=" + kp0Var2);
        k1Var = (k1) kp0Var2.c;
        if (k1Var != null) {
        }
    }
}
