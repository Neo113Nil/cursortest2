package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f3820a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f3820a = utilityServiceProvider;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f3820a);
    }
}
