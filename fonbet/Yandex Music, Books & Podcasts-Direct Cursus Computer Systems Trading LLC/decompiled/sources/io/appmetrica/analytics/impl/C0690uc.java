package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0690uc extends uif implements Function1 {
    public static final C0690uc a = new C0690uc();

    public C0690uc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((CounterReportApi) obj).getCustomType() == 9);
    }
}
