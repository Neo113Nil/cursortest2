package com.yandex.plus.core.network.okhttp.call;

import defpackage.cg6;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements com.yandex.plus.core.network.interceptor.a, zyc {
    public final /* synthetic */ Function2 a;

    public i(Function2 function2) {
        function2.getClass();
        this.a = function2;
    }

    @Override // com.yandex.plus.core.network.interceptor.a
    public final /* synthetic */ Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        return this.a.invoke(eVar, cg6Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.yandex.plus.core.network.interceptor.a) && (obj instanceof zyc)) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
