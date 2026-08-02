package com.yandex.passport.internal.credentials;

import com.yandex.passport.api.k0;
import com.yandex.passport.data.network.k5;
import com.yandex.passport.internal.properties.x;
import defpackage.btf;
import defpackage.jyr;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {
    public static final jyr b = btf.b(new k5(19));
    public static final jyr c = btf.b(new k5(20));
    public static final jyr d = btf.b(new k5(21));
    public final x a;

    public g(x xVar) {
        xVar.getClass();
        this.a = xVar;
    }

    public final f a(k0 k0Var) {
        k0Var.getClass();
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
        int d2 = k0Var.d();
        aVar.getClass();
        return com.yandex.plus.pay.ui.core.b.w(this.a, com.yandex.passport.common.core.a.b(d2));
    }

    public final f b(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        return com.yandex.plus.pay.ui.core.b.w(this.a, bVar);
    }

    public final f c(com.yandex.passport.common.core.b bVar, String str) {
        Object obj;
        bVar.getClass();
        str.getClass();
        x xVar = this.a;
        xVar.getClass();
        Iterator it = ((List) d.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((f) obj).c, str)) {
                break;
            }
        }
        f fVar = (f) obj;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = (f) xVar.B.get(bVar);
        f fVar3 = Intrinsics.d(fVar2 != null ? fVar2.c : null, str) ? fVar2 : null;
        return fVar3 == null ? com.yandex.plus.pay.ui.core.b.w(xVar, bVar) : fVar3;
    }
}
