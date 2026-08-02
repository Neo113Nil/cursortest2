package com.yandex.plus.core.benchmark;

import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d0 implements w {
    public final jyr a;

    public d0(Function0 function0) {
        this.a = btf.b(new com.yandex.plus.bdui.plus.checkout.h(function0));
    }

    @Override // com.yandex.plus.core.benchmark.w
    public final v c() {
        com.yandex.plus.core.analytics.o oVar = (com.yandex.plus.core.analytics.o) this.a.getValue();
        if (oVar != null) {
            return new c0(oVar);
        }
        return null;
    }
}
