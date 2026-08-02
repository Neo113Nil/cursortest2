package io.appmetrica.analytics.networkokhttp.impl;

import defpackage.kvj0;
import defpackage.rvj0;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class b extends Lambda implements sls {
    public final /* synthetic */ kvj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kvj0 kvj0Var) {
        super(0);
        this.a = kvj0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        rvj0 rvj0Var = this.a.z;
        if (rvj0Var != null) {
            return rvj0Var.byteStream();
        }
        return null;
    }
}
