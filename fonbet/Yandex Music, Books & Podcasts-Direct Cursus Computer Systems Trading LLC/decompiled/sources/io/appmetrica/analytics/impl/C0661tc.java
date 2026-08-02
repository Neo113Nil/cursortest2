package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0661tc extends uif implements Function1 {
    public static final C0661tc a = new C0661tc();

    public C0661tc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((CounterReportApi) obj).getCustomType() == 12);
    }
}
