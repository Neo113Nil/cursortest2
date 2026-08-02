package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Z extends Lambda implements sls {
    public final /* synthetic */ C0175a0 a;
    public final /* synthetic */ InterfaceC0918zl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0175a0 c0175a0, C0404hr c0404hr) {
        super(0);
        this.a = c0175a0;
        this.b = c0404hr;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        C0175a0 c0175a0 = this.a;
        M m = c0175a0.h;
        Context context = c0175a0.a;
        InterfaceC0918zl interfaceC0918zl = this.b;
        m.getClass();
        return M.a(new L(m, context, interfaceC0918zl));
    }
}
