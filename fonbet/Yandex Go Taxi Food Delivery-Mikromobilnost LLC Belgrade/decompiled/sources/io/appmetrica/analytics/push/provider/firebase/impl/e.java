package io.appmetrica.analytics.push.provider.firebase.impl;

import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class e extends Lambda implements sls {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar) {
        super(0);
        this.a = nVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        n nVar = this.a;
        return new m(nVar.a(), nVar.b(), nVar.d(), nVar.c());
    }
}
