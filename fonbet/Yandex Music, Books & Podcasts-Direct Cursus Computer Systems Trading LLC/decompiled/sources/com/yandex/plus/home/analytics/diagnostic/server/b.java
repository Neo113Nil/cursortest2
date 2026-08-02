package com.yandex.plus.home.analytics.diagnostic.server;

import com.yandex.plus.home.core.network.c;
import com.yandex.plus.home.core.network.d;
import defpackage.c11;
import defpackage.clc;
import defpackage.dnb;
import defpackage.gp0;
import defpackage.kkp;
import defpackage.pjc;
import defpackage.t6e;
import defpackage.ub7;
import defpackage.v42;
import defpackage.ymb;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements gp0 {
    public final dnb a;
    public final d b;
    public final ReentrantLock c;
    public final LinkedHashMap d;

    public b(dnb dnbVar, d dVar) {
        dnbVar.getClass();
        dVar.getClass();
        this.a = dnbVar;
        this.b = dVar;
        this.c = new ReentrantLock();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.gp0
    public final pjc a(kkp kkpVar, c11 c11Var) {
        return new clc(new ub7(12, c11Var.c(kkpVar), new com.yandex.plus.experiments.impl.cache.b(this, kkpVar, null, 1)), new v42(this, kkpVar, (Continuation) null, 24));
    }

    public final void b(List list, String str, ymb ymbVar, String str2, Map map) {
        String str3;
        c a;
        Object obj = null;
        if (list != null) {
            d dVar = this.b;
            dVar.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.text.c.o(((t6e) next).a, "X-Plus-Retry-Context", true)) {
                    obj = next;
                    break;
                }
            }
            t6e t6eVar = (t6e) obj;
            boolean z = false;
            if (t6eVar != null && (str3 = t6eVar.b) != null && (a = dVar.a(str3)) != null) {
                z = a.a == a.b;
            }
            obj = Boolean.valueOf(z);
        }
        if (Intrinsics.d(obj, Boolean.TRUE)) {
            dnb dnbVar = this.a;
            dnbVar.getClass();
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operation_name", str);
            linkedHashMap.put("error_type", ymbVar.a);
            linkedHashMap.put(Constants.KEY_MESSAGE, str2);
            linkedHashMap.put("additional_params", map);
            linkedHashMap.put("_meta", dnb.b(new HashMap()));
            dnbVar.c("Error.Retries.Exhausted.GraphQL", linkedHashMap);
        }
    }
}
