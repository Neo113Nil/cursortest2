package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class X extends Lambda implements sls {
    public final /* synthetic */ C0175a0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0175a0 c0175a0) {
        super(0);
        this.a = c0175a0;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        C0175a0 c0175a0 = this.a;
        M m = c0175a0.f;
        Context context = c0175a0.a;
        m.getClass();
        return M.a(new K(m, context));
    }
}
