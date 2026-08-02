package com.yandex.plus.pay.internal.feature.mailing;

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
public final class f {
    public final a a;
    public final com.yandex.plus.pay.log.impl.b b;

    public f(a aVar, com.yandex.plus.pay.log.impl.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = bVar;
    }

    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.a aVar) {
        Object a = ((d) this.a).a(plusPayMailingAdsAgreement, aVar);
        return a == nm6.a ? a : Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(1:20)(2:17|18)))|35|6|7|(0)(0)|11|12|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        e eVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    a aVar = this.a;
                    eVar.l = 1;
                    obj = ((d) aVar).b(eVar);
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
                    com.yandex.plus.pay.log.impl.b bVar = this.b;
                    bVar.getClass();
                    bVar.a(com.yandex.plus.log.api.a.a, "PAY.TRACE", "error while fetching MailingAdsAgreement=" + a, null);
                }
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        eVar = new e(this, cg6Var);
        obj = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
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
