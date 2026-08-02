package com.yandex.plus.pay.internal.di;

import defpackage.jk6;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jk6 b;

    public /* synthetic */ b(jk6 jk6Var, int i) {
        this.a = i;
        this.b = jk6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        jk6 jk6Var = this.b;
        switch (i) {
            case 0:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) jk6Var.get()).f();
                r7o r7oVar = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f instanceof t7o ? null : f);
            default:
                Object f2 = ((com.yandex.plus.experiments.impl.providers.h) jk6Var.get()).f();
                r7o r7oVar2 = z7o.b;
                return (com.yandex.plus.experiments.api.a) (f2 instanceof t7o ? null : f2);
        }
    }
}
