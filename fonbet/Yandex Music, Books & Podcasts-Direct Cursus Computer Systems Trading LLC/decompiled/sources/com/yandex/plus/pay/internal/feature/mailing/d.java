package com.yandex.plus.pay.internal.feature.mailing;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.graphql.offers.m;
import com.yandex.plus.pay.internal.di.g;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.mappers.h;
import defpackage.btf;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class d implements a {
    public final m a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final jyr c;
    public final jyr d;

    public d(m mVar, com.yandex.plus.pay.log.impl.b bVar) {
        mVar.getClass();
        bVar.getClass();
        this.a = mVar;
        this.b = bVar;
        this.c = btf.b(new g(3));
        this.d = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(16, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (plusPayMailingAdsAgreement != null) {
                        com.yandex.plus.pay.log.impl.b.d(this.b, com.yandex.plus.pay.api.log.b.b, "Start change mailing ads agreement status");
                        h hVar = (h) this.d.getValue();
                        boolean isAgreementsChecked = plusPayMailingAdsAgreement.isAgreementsChecked();
                        PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement.getTextLogic();
                        hVar.getClass();
                        textLogic.getClass();
                        com.yandex.plus.pay.repository.api.model.mailingads.a aVar = (isAgreementsChecked && textLogic == PlusPayMailingAdsAgreement.TextLogic.DIRECT) ? com.yandex.plus.pay.repository.api.model.mailingads.a.a : (isAgreementsChecked || textLogic != PlusPayMailingAdsAgreement.TextLogic.INVERTED) ? com.yandex.plus.pay.repository.api.model.mailingads.a.b : com.yandex.plus.pay.repository.api.model.mailingads.a.a;
                        bVar.l = 1;
                        if (this.a.a(aVar, bVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        h hVar;
        Object t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = cVar.l;
                    nm6 nm6Var = nm6.a;
                    i = cVar.n;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    com.yandex.plus.pay.api.log.a aVar = com.yandex.plus.pay.api.log.b.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.pay.log.impl.b.d(bVar2, aVar, "Start loading mailing ads agreement");
                        try {
                            r7o r7oVar = z7o.b;
                            h hVar2 = (h) this.d.getValue();
                            m mVar = this.a;
                            cVar.j = bVar2;
                            cVar.k = hVar2;
                            cVar.n = 1;
                            Object b = mVar.b(cVar);
                            if (b == nm6Var) {
                                return nm6Var;
                            }
                            hVar = hVar2;
                            obj2 = b;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hVar = cVar.k;
                        bVar = cVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = hVar.a((com.yandex.plus.pay.repository.api.model.mailingads.c) obj2);
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, aVar, "getMailingAdsAgreement() result=" + plusPayMailingAdsAgreement);
                    return plusPayMailingAdsAgreement;
                }
            }
            if (i != 0) {
            }
            obj = hVar.a((com.yandex.plus.pay.repository.api.model.mailingads.c) obj2);
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
        com.yandex.plus.pay.api.log.a aVar2 = com.yandex.plus.pay.api.log.b.b;
    }
}
