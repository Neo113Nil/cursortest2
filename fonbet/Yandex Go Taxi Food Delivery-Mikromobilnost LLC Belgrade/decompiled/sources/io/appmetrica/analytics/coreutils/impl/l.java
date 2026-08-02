package io.appmetrica.analytics.coreutils.impl;

import defpackage.sls;
import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class l extends Lambda implements sls {
    public final /* synthetic */ UtilityServiceProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.a = utilityServiceProvider;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.a);
    }
}
