package com.yandex.plus.di;

import defpackage.bfu;
import defpackage.gfu;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g implements gfu {
    public final Function0 a;

    public g(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        return new f(this.a.invoke());
    }
}
