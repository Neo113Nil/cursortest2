package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common;

import defpackage.b6e;

/* loaded from: classes5.dex */
public final class g {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a a;

    public g(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final void a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar) {
        int ordinal = jVar.f.ordinal();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar = this.a;
        if (ordinal == 0) {
            aVar.b();
        } else if (ordinal != 1) {
            b6e.s();
        } else {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e(), "Silent");
        }
    }
}
