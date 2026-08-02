package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout;

import com.yandex.plus.pay.internal.feature.mailing.f;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class c {
    public final g a;
    public final com.yandex.plus.log.api.b b;

    public c(g gVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = gVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|12|(2:14|(1:16))|17|18))|34|6|7|(0)(0)|11|12|(0)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, cg6 cg6Var) {
        a aVar;
        int i;
        Throwable a;
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
                    r7o r7oVar = z7o.b;
                    f fVar = (f) this.a.m.getValue();
                    aVar.l = 1;
                    if (fVar.a(plusPayMailingAdsAgreement, aVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    com.yandex.plus.log.api.b bVar = this.b;
                    if (bVar.b(aVar2)) {
                        bVar.a(aVar2, "MailingAdsAgreementRepositoryImpl", "Failed to update mailing ads agreement status", a);
                    }
                }
                return Unit.a;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(2:14|(1:16))|17|(1:22)(2:19|20)))|37|6|7|(0)(0)|11|12|(0)|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    f fVar = (f) this.a.m.getValue();
                    bVar.l = 1;
                    obj = fVar.b(bVar);
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
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                    com.yandex.plus.log.api.b bVar2 = this.b;
                    if (bVar2.b(aVar)) {
                        bVar2.a(aVar, "MailingAdsAgreementRepositoryImpl", "Mailing ads agreement loading failed", a);
                    }
                }
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        bVar = new b(this, cg6Var);
        obj = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (obj instanceof t7o) {
        }
    }
}
