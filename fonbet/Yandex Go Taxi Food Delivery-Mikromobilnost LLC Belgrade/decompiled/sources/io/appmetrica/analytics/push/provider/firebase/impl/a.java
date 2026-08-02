package io.appmetrica.analytics.push.provider.firebase.impl;

import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements sls {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.a = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = this.a;
        return Boolean.valueOf(bVar.b == null && bVar.a != null);
    }
}
