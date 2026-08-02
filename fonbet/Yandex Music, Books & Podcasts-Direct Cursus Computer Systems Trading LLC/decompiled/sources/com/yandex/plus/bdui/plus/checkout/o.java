package com.yandex.plus.bdui.plus.checkout;

import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements zyc {
    public o() {
        n nVar = n.a;
    }

    public final com.yandex.plus.bdui.action.a a(Throwable th) {
        th.getClass();
        return (com.yandex.plus.bdui.action.a) n.a.invoke(new com.yandex.plus.bdui.failure.c(th));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return n.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
