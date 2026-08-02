package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout;

import com.yandex.plus.home.internal.di.y;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class d {
    public final y a;
    public final com.yandex.plus.log.api.b b;

    public d(y yVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = yVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.pay.ui.yb.api.e eVar;
        Object h;
        com.yandex.plus.pay.ui.yb.api.d dVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                nm6 nm6Var = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    eVar = str == null ? com.yandex.plus.pay.ui.yb.api.e.a : com.yandex.plus.pay.ui.yb.api.e.b;
                    cVar.j = str;
                    cVar.k = eVar;
                    cVar.n = 1;
                    h = this.a.h(eVar, cVar);
                    if (h == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.plus.pay.ui.yb.api.e eVar2 = cVar.k;
                    String str2 = cVar.j;
                    qgg.h0(obj);
                    eVar = eVar2;
                    str = str2;
                    h = obj;
                }
                dVar = (com.yandex.plus.pay.ui.yb.api.d) h;
                if (!(dVar instanceof com.yandex.plus.pay.ui.yb.api.c)) {
                    String str3 = ((com.yandex.plus.pay.ui.yb.api.c) dVar).a;
                    return str3 == null ? str : str3;
                }
                boolean z = dVar instanceof com.yandex.plus.pay.ui.yb.api.b;
                com.yandex.plus.log.api.b bVar = this.b;
                if (z) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar)) {
                        StringBuilder sb = new StringBuilder("Filed in ");
                        String lowerCase = eVar.name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        sb.append(lowerCase);
                        sb.append(": ");
                        sb.append(((com.yandex.plus.pay.ui.yb.api.b) dVar).a);
                        bVar.c(aVar, "YbCardInteractorImpl", sb.toString());
                        return null;
                    }
                } else {
                    if (!(dVar instanceof com.yandex.plus.pay.ui.yb.api.a)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar2)) {
                        StringBuilder sb2 = new StringBuilder("Cancelled in ");
                        String lowerCase2 = eVar.name().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        sb2.append(lowerCase2);
                        sb2.append(" by user");
                        bVar.c(aVar2, "YbCardInteractorImpl", sb2.toString());
                    }
                }
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        dVar = (com.yandex.plus.pay.ui.yb.api.d) h;
        if (!(dVar instanceof com.yandex.plus.pay.ui.yb.api.c)) {
        }
    }
}
