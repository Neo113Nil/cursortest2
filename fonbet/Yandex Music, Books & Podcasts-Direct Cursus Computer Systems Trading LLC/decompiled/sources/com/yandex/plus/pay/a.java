package com.yandex.plus.pay;

import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.feature.payment.inapp.google.d;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.log.impl.b;
import java.util.Set;

/* loaded from: classes5.dex */
public interface a {
    static d a(a aVar) {
        Set<SyncType> all = SyncType.INSTANCE.all();
        g gVar = (g) aVar;
        gVar.getClass();
        all.getClass();
        u uVar = gVar.b;
        uVar.getClass();
        d a = uVar.e.a(all);
        b.d(gVar.d(), com.yandex.plus.pay.api.log.b.b, gVar + ".restoreInAppPayments(" + all + ") = " + a);
        return a;
    }
}
