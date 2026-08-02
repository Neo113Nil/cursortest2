package com.yandex.plus.home.feature.webviews.internal.webview;

import defpackage.brr;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements brr, zyc {
    public final /* synthetic */ Function0 a;

    public c(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof brr) && (obj instanceof zyc)) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.brr
    public final /* synthetic */ Object get() {
        return this.a.invoke();
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
