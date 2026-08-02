package com.yandex.plus.home.dailyquests.feature.api;

import androidx.core.app.q;
import com.yandex.plus.bdui.r;
import com.yandex.plus.core.theme.e;
import com.yandex.plus.divkit.api.f;
import com.yandex.plus.home.dailyquests.feature.api.model.i;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.d;
import com.yandex.plus.home.k;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Map;

/* loaded from: classes5.dex */
public final class c {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public c(com.yandex.plus.home.dailyquests.repository.rest.c cVar, d dVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar, com.yandex.plus.core.imageloader.b bVar, fkn fknVar, e eVar, com.yandex.plus.core.dispatcher.b bVar2, k kVar) {
        bVar2.getClass();
        this.a = cVar;
        this.b = dVar;
        this.c = aVar;
        this.d = bVar;
        this.e = fknVar;
        this.f = eVar;
        this.g = bVar2;
        this.h = kVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(2:22|(2:24|25)(2:26|(1:28)))|11|12|(2:14|15)(2:17|18)))|35|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(i iVar, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
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
                    if (!((Boolean) ((k) this.h).invoke()).booleanValue()) {
                        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, "areDailyQuestsAvailable() - flag disabled, result `false`", null);
                        return Boolean.FALSE;
                    }
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.home.dailyquests.repository.rest.c cVar = (com.yandex.plus.home.dailyquests.repository.rest.c) this.a;
                    iVar.getClass();
                    bVar.l = 1;
                    obj = x97.V(cVar.h, new com.yandex.plus.home.dailyquests.repository.rest.a(cVar, ((com.yandex.plus.domain.auth.api.e) cVar.f.invoke()).getId(), true, null), bVar);
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
                if (z7o.a(obj) == null) {
                    com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                    jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar3, "areDailyQuestsAvailable() - no quests, result `false`", null);
                    return Boolean.FALSE;
                }
                com.yandex.plus.core.analytics.logging.b bVar4 = com.yandex.plus.core.analytics.logging.b.a;
                jyr jyrVar3 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar4, "areDailyQuestsAvailable() - quest exist, result `true`", null);
                return Boolean.TRUE;
            }
        }
        bVar = new b(this, cg6Var);
        obj = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (z7o.a(obj) == null) {
        }
    }

    public c(r rVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.paymentsdk.internal.method.e eVar, f fVar, Map map, Map map2, Map map3, q qVar) {
        this.a = rVar;
        this.b = aVar;
        this.c = eVar;
        this.d = fVar;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = qVar;
    }
}
