package io.appmetrica.analytics.impl;

import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Gi extends uif implements Function0 {
    public final /* synthetic */ Hi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gi(Hi hi) {
        super(0);
        this.a = hi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Fi(this.a);
    }
}
