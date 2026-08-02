package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Z5 extends uif implements Function1 {
    public static final Z5 a = new Z5();

    public Z5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
