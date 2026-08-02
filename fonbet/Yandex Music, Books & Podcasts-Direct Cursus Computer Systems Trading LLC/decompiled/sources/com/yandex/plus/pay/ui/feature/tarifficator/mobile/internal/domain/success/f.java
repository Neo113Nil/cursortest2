package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.pay.internal.feature.payment.i;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class f implements d {
    public final g a;
    public final com.yandex.plus.pay.ui.common.api.a b;
    public final fkn c;

    public f(g gVar, com.yandex.plus.pay.ui.common.api.a aVar, fkn fknVar) {
        aVar.getClass();
        this.a = gVar;
        this.b = aVar;
        this.c = fknVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(11:25|(2:28|26)|29|30|(4:33|(3:35|36|37)(1:39)|38|31)|40|41|(4:44|(3:46|47|48)(1:50)|49|42)|51|52|(1:54))|12|13|(1:15)|16|(2:18|19)(1:21)))|65|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, cg6 cg6Var) {
        e eVar;
        Object obj;
        int i;
        PlusPayWebSuccessScreenConfiguration plusPayWebSuccessScreenConfiguration;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                obj = eVar.k;
                nm6 nm6Var = nm6.a;
                i = eVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = aVar.c;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((j) it.next()).d);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String str = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g) it3.next()).a;
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.internal.feature.payment.b h = this.a.h();
                    PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams = new PlusPayWebSuccessScreenParams(b((com.yandex.plus.ui.core.theme.a) this.c.a.getValue()), arrayList3);
                    eVar.j = aVar;
                    eVar.m = 1;
                    obj = ((i) h).f(plusPayWebSuccessScreenParams, eVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = eVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (obj instanceof t7o) {
                    obj = null;
                }
                plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
                if (plusPayWebSuccessScreenConfiguration == null) {
                    return new c(com.yandex.plus.bdui.plus.analytics.b.b(plusPayWebSuccessScreenConfiguration.getUrl(), aVar.a), plusPayWebSuccessScreenConfiguration.getLoadMessageTimeoutMillis(), plusPayWebSuccessScreenConfiguration.getStartMessageTimeoutMillis());
                }
                return null;
            }
        }
        eVar = new e(this, cg6Var);
        obj = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (obj instanceof t7o) {
        }
        plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
        if (plusPayWebSuccessScreenConfiguration == null) {
        }
    }

    public final PlusPayWebSuccessScreenParams.PageTheme b(com.yandex.plus.ui.core.theme.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return PlusPayWebSuccessScreenParams.PageTheme.DARK;
        }
        if (ordinal == 1) {
            return PlusPayWebSuccessScreenParams.PageTheme.LIGHT;
        }
        if (ordinal == 2) {
            return u.r(this.b.a(), (com.yandex.plus.ui.core.theme.a) this.c.a.getValue()) ? PlusPayWebSuccessScreenParams.PageTheme.DARK : PlusPayWebSuccessScreenParams.PageTheme.LIGHT;
        }
        b6e.s();
        return null;
    }
}
