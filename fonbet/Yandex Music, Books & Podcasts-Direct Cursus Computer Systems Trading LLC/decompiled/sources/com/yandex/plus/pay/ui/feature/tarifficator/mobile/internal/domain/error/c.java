package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.f;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class c {
    public final Set a;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a b;
    public final k c;

    public c(Set set, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar, k kVar) {
        set.getClass();
        aVar.getClass();
        this.a = set;
        this.b = aVar;
        this.c = kVar;
    }

    public final Unit a() {
        boolean contains = this.a.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.f);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar = this.b;
        if (contains) {
            aVar.a();
        } else if (((Boolean) this.c.invoke()).booleanValue()) {
            aVar.getClass();
            aVar.c(new f(), "CounterOffer");
        } else {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f(), "Error");
        }
        return Unit.a;
    }
}
